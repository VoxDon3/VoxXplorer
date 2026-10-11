/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.g;
import ax.Gb.l;
import ax.Lb.c;
import ax.Lb.f;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.h;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Header;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

public final class Http2Reader
implements Closeable,
AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final ax.xc.g source;

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        l.e(logger, "getLogger(Http2::class.java.name)");
        Http2Reader.logger = logger;
    }

    public Http2Reader(ax.xc.g c8, boolean bl) {
        l.f(c8, "source");
        this.source = c8;
        this.client = bl;
        c8 = new ContinuationSource((ax.xc.g)c8);
        this.continuation = c8;
        this.hpackReader = new Hpack.Reader(c8, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int n8, int n9, int n10) throws IOException {
        if (n10 != 0) {
            int n11 = 0;
            boolean bl = (n9 & 1) != 0;
            if ((n9 & 0x20) == 0) {
                if ((n9 & 8) != 0) {
                    n11 = Util.and(this.source.readByte(), 255);
                }
                n8 = Companion.lengthWithoutPadding(n8, n9, n11);
                handler.data(bl, n10, this.source, n8);
                this.source.skip(n11);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void readGoAway(Handler object, int n8, int n9, int n10) throws IOException {
        if (n8 >= 8) {
            if (n10 == 0) {
                n9 = this.source.readInt();
                n10 = this.source.readInt();
                n8 -= 8;
                ErrorCode errorCode = ErrorCode.Companion.fromHttp2(n10);
                if (errorCode != null) {
                    h h8 = h.f0;
                    if (n8 > 0) {
                        h8 = this.source.B(n8);
                    }
                    object.goAway(n9, errorCode, h8);
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("TYPE_GOAWAY unexpected error code: ");
                ((StringBuilder)object).append(n10);
                throw new IOException(((StringBuilder)object).toString());
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("TYPE_GOAWAY length < 8: ");
        ((StringBuilder)object).append(n8);
        throw new IOException(((StringBuilder)object).toString());
    }

    private final List<Header> readHeaderBlock(int n8, int n9, int n10, int n11) throws IOException {
        this.continuation.setLeft(n8);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(n9);
        this.continuation.setFlags(n10);
        this.continuation.setStreamId(n11);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int n8, int n9, int n10) throws IOException {
        if (n10 != 0) {
            int n11 = 0;
            boolean bl = (n9 & 1) != 0;
            if ((n9 & 8) != 0) {
                n11 = Util.and(this.source.readByte(), 255);
            }
            int n12 = n8;
            if ((n9 & 0x20) != 0) {
                this.readPriority(handler, n10);
                n12 = n8 - 5;
            }
            handler.headers(bl, n10, -1, this.readHeaderBlock(Companion.lengthWithoutPadding(n12, n9, n11), n11, n9, n10));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void readPing(Handler object, int n8, int n9, int n10) throws IOException {
        if (n8 == 8) {
            if (n10 == 0) {
                n8 = this.source.readInt();
                n10 = this.source.readInt();
                boolean bl = true;
                if ((n9 & 1) == 0) {
                    bl = false;
                }
                object.ping(bl, n8, n10);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("TYPE_PING length != 8: ");
        ((StringBuilder)object).append(n8);
        throw new IOException(((StringBuilder)object).toString());
    }

    private final void readPriority(Handler handler, int n8) throws IOException {
        int n9 = this.source.readInt();
        boolean bl = (Integer.MIN_VALUE & n9) != 0;
        handler.priority(n8, n9 & Integer.MAX_VALUE, Util.and(this.source.readByte(), 255) + 1, bl);
    }

    private final void readPriority(Handler object, int n8, int n9, int n10) throws IOException {
        if (n8 == 5) {
            if (n10 != 0) {
                this.readPriority((Handler)object, n10);
                return;
            }
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("TYPE_PRIORITY length: ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" != 5");
        throw new IOException(((StringBuilder)object).toString());
    }

    private final void readPushPromise(Handler handler, int n8, int n9, int n10) throws IOException {
        if (n10 != 0) {
            int n11 = (n9 & 8) != 0 ? Util.and(this.source.readByte(), 255) : 0;
            handler.pushPromise(n10, this.source.readInt() & Integer.MAX_VALUE, this.readHeaderBlock(Companion.lengthWithoutPadding(n8 - 4, n9, n11), n11, n9, n10));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void readRstStream(Handler object, int n8, int n9, int n10) throws IOException {
        if (n8 == 4) {
            if (n10 != 0) {
                n8 = this.source.readInt();
                ErrorCode errorCode = ErrorCode.Companion.fromHttp2(n8);
                if (errorCode != null) {
                    object.rstStream(n10, errorCode);
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("TYPE_RST_STREAM unexpected error code: ");
                ((StringBuilder)object).append(n8);
                throw new IOException(((StringBuilder)object).toString());
            }
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("TYPE_RST_STREAM length: ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" != 4");
        throw new IOException(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void readSettings(Handler object, int n8, int n9, int n10) throws IOException {
        Settings settings;
        block15: {
            int n11;
            int n12;
            block14: {
                block13: {
                    if (n10 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((n9 & 1) != 0) {
                        if (n8 == 0) {
                            object.ackSettings();
                            return;
                        }
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    if (n8 % 6 != 0) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("TYPE_SETTINGS length % 6 != 0: ");
                        ((StringBuilder)object).append(n8);
                        throw new IOException(((StringBuilder)object).toString());
                    }
                    settings = new Settings();
                    c c8 = f.k(f.l(0, n8), 6);
                    n8 = c8.k();
                    n12 = c8.l();
                    n11 = c8.n();
                    if (n11 <= 0) break block13;
                    n9 = n8;
                    if (n8 <= n12) break block14;
                }
                if (n11 >= 0 || n12 > n8) break block15;
                n9 = n8;
            }
            while (true) {
                int n13;
                block12: {
                    block16: {
                        block17: {
                            block18: {
                                n10 = Util.and(this.source.readShort(), 65535);
                                n13 = this.source.readInt();
                                if (n10 == 2) break block16;
                                if (n10 == 3) break block17;
                                if (n10 == 4) break block18;
                                if (n10 != 5) {
                                    n8 = n10;
                                    break block12;
                                } else if (n13 >= 16384 && n13 <= 0xFFFFFF) {
                                    n8 = n10;
                                    break block12;
                                } else {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ");
                                    ((StringBuilder)object).append(n13);
                                    throw new IOException(((StringBuilder)object).toString());
                                }
                            }
                            if (n13 < 0) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                            }
                            n8 = 7;
                            break block12;
                        }
                        n8 = 4;
                        break block12;
                    }
                    n8 = n10;
                    if (n13 != 0) {
                        if (n13 != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        n8 = n10;
                    }
                }
                settings.set(n8, n13);
                if (n9 == n12) break;
                n9 += n11;
            }
        }
        object.settings(false, settings);
    }

    private final void readWindowUpdate(Handler object, int n8, int n9, int n10) throws IOException {
        if (n8 == 4) {
            long l8 = Util.and(this.source.readInt(), Integer.MAX_VALUE);
            if (l8 != 0L) {
                object.windowUpdate(n10, l8);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("TYPE_WINDOW_UPDATE length !=4: ");
        ((StringBuilder)object).append(n8);
        throw new IOException(((StringBuilder)object).toString());
    }

    @Override
    public void close() throws IOException {
        this.source.close();
    }

    public final boolean nextFrame(boolean bl, Handler object) throws IOException {
        l.f(object, "handler");
        try {
            this.source.P0(9L);
        }
        catch (EOFException eOFException) {
            return false;
        }
        int n8 = Util.readMedium(this.source);
        if (n8 <= 16384) {
            int n9 = Util.and(this.source.readByte(), 255);
            int n10 = Util.and(this.source.readByte(), 255);
            int n11 = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger = Http2Reader.logger;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.INSTANCE.frameLog(true, n11, n8, n9, n10));
            }
            if (bl && n9 != 4) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Expected a SETTINGS frame but was ");
                ((StringBuilder)object).append(Http2.INSTANCE.formattedType$okhttp(n9));
                throw new IOException(((StringBuilder)object).toString());
            }
            switch (n9) {
                default: {
                    this.source.skip(n8);
                    break;
                }
                case 8: {
                    this.readWindowUpdate((Handler)object, n8, n10, n11);
                    break;
                }
                case 7: {
                    this.readGoAway((Handler)object, n8, n10, n11);
                    break;
                }
                case 6: {
                    this.readPing((Handler)object, n8, n10, n11);
                    break;
                }
                case 5: {
                    this.readPushPromise((Handler)object, n8, n10, n11);
                    break;
                }
                case 4: {
                    this.readSettings((Handler)object, n8, n10, n11);
                    break;
                }
                case 3: {
                    this.readRstStream((Handler)object, n8, n10, n11);
                    break;
                }
                case 2: {
                    this.readPriority((Handler)object, n8, n10, n11);
                    break;
                }
                case 1: {
                    this.readHeaders((Handler)object, n8, n10, n11);
                    break;
                }
                case 0: {
                    this.readData((Handler)object, n8, n10, n11);
                }
            }
            return true;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("FRAME_SIZE_ERROR: ");
        ((StringBuilder)object).append(n8);
        throw new IOException(((StringBuilder)object).toString());
    }

    public final void readConnectionPreface(Handler object) throws IOException {
        Object object2;
        block8: {
            block7: {
                block6: {
                    l.f(object, "handler");
                    if (!this.client) break block6;
                    if (!this.nextFrame(true, (Handler)object)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    break block7;
                }
                object2 = this.source;
                object = Http2.CONNECTION_PREFACE;
                object2 = object2.B(((h)object).G());
                Logger logger = Http2Reader.logger;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("<< CONNECTION ");
                    stringBuilder.append(((h)object2).t());
                    logger.fine(Util.format(stringBuilder.toString(), new Object[0]));
                }
                if (!l.a(object, object2)) break block8;
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Expected a connection header but was ");
        ((StringBuilder)object).append(((h)object2).K());
        throw new IOException(((StringBuilder)object).toString());
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final Logger getLogger() {
            return logger;
        }

        public final int lengthWithoutPadding(int n8, int n9, int n10) throws IOException {
            int n11 = n8;
            if ((n9 & 8) != 0) {
                n11 = n8 - 1;
            }
            if (n10 <= n11) {
                return n11 - n10;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PROTOCOL_ERROR padding ");
            stringBuilder.append(n10);
            stringBuilder.append(" > remaining length ");
            stringBuilder.append(n11);
            throw new IOException(stringBuilder.toString());
        }
    }

    public static final class ContinuationSource
    implements C,
    AutoCloseable {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final ax.xc.g source;
        private int streamId;

        public ContinuationSource(ax.xc.g g8) {
            l.f(g8, "source");
            this.source = g8;
        }

        private final void readContinuationHeader() throws IOException {
            int n8;
            int n9 = this.streamId;
            this.left = n8 = Util.readMedium(this.source);
            this.length = n8;
            int n10 = Util.and(this.source.readByte(), 255);
            this.flags = Util.and(this.source.readByte(), 255);
            Object object = Companion;
            if (((Companion)object).getLogger().isLoggable(Level.FINE)) {
                ((Companion)object).getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, n10, this.flags));
            }
            this.streamId = n8 = this.source.readInt() & Integer.MAX_VALUE;
            if (n10 == 9) {
                if (n8 == n9) {
                    return;
                }
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(n10);
            ((StringBuilder)object).append(" != TYPE_CONTINUATION");
            throw new IOException(((StringBuilder)object).toString());
        }

        @Override
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override
        public long read(e e8, long l8) throws IOException {
            int n8;
            l.f(e8, "sink");
            while ((n8 = this.left) == 0) {
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                this.readContinuationHeader();
            }
            if ((l8 = this.source.read(e8, Math.min(l8, (long)n8))) == -1L) {
                return -1L;
            }
            this.left -= (int)l8;
            return l8;
        }

        public final void setFlags(int n8) {
            this.flags = n8;
        }

        public final void setLeft(int n8) {
            this.left = n8;
        }

        public final void setLength(int n8) {
            this.length = n8;
        }

        public final void setPadding(int n8) {
            this.padding = n8;
        }

        public final void setStreamId(int n8) {
            this.streamId = n8;
        }

        @Override
        public D timeout() {
            return this.source.timeout();
        }
    }

    public static interface Handler {
        public void ackSettings();

        public void alternateService(int var1, String var2, h var3, String var4, int var5, long var6);

        public void data(boolean var1, int var2, ax.xc.g var3, int var4) throws IOException;

        public void goAway(int var1, ErrorCode var2, h var3);

        public void headers(boolean var1, int var2, int var3, List<Header> var4);

        public void ping(boolean var1, int var2, int var3);

        public void priority(int var1, int var2, int var3, boolean var4);

        public void pushPromise(int var1, int var2, List<Header> var3) throws IOException;

        public void rstStream(int var1, ErrorCode var2);

        public void settings(boolean var1, Settings var2);

        public void windowUpdate(int var1, long var2);
    }
}

