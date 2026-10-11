/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import ax.Gb.g;
import ax.Gb.l;
import ax.xc.e;
import ax.xc.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Header;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

public final class Http2Writer
implements Closeable,
AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final e hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final f sink;

    public Http2Writer(f f8, boolean bl) {
        l.f(f8, "sink");
        this.sink = f8;
        this.client = bl;
        f8 = new e();
        this.hpackBuffer = f8;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, (e)f8, 3, null);
    }

    private final void writeContinuationFrames(int n8, long l8) throws IOException {
        while (l8 > 0L) {
            long l9 = Math.min((long)this.maxFrameSize, l8);
            int n9 = (int)l9;
            int n10 = (l8 -= l9) == 0L ? 4 : 0;
            this.frameHeader(n8, n9, 9, n10);
            this.sink.write(this.hpackBuffer, l9);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void applyAndAckSettings(Settings object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        l.f(object, "peerSettings");
                        if (this.closed) {
                            object = new IOException("closed");
                            throw object;
                        }
                        this.maxFrameSize = ((Settings)object).getMaxFrameSize(this.maxFrameSize);
                        if (((Settings)object).getHeaderTableSize() == -1) break block4;
                        this.hpackWriter.resizeHeaderTable(((Settings)object).getHeaderTableSize());
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                this.frameHeader(0, 0, 4, 1);
                this.sink.flush();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void connectionPreface() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block5: {
                    block6: {
                        try {
                            if (this.closed) break block5;
                            boolean bl = this.client;
                            if (bl) break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        return;
                    }
                    Logger logger = Http2Writer.logger;
                    if (logger.isLoggable(Level.FINE)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(">> CONNECTION ");
                        stringBuilder.append(Http2.CONNECTION_PREFACE.t());
                        logger.fine(Util.format(stringBuilder.toString(), new Object[0]));
                    }
                    this.sink.I0(Http2.CONNECTION_PREFACE);
                    this.sink.flush();
                    return;
                }
                IOException iOException = new IOException("closed");
                throw iOException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void data(boolean bl, int n8, e object, int n9) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.closed) {
                        this.dataFrame(n8, bl ? 1 : 0, (e)object, n9);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = new IOException("closed");
                throw object;
            }
            throw throwable2;
        }
    }

    public final void dataFrame(int n8, int n9, e e8, int n10) throws IOException {
        this.frameHeader(n8, n10, 0, n9);
        if (n10 > 0) {
            f f8 = this.sink;
            l.c(e8);
            f8.write(e8, n10);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.closed) {
                        this.sink.flush();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                IOException iOException = new IOException("closed");
                throw iOException;
            }
            throw throwable2;
        }
    }

    public final void frameHeader(int n8, int n9, int n10, int n11) throws IOException {
        Object object = logger;
        if (((Logger)object).isLoggable(Level.FINE)) {
            ((Logger)object).fine(Http2.INSTANCE.frameLog(false, n8, n9, n10, n11));
        }
        if (n9 <= this.maxFrameSize) {
            if ((Integer.MIN_VALUE & n8) == 0) {
                Util.writeMedium(this.sink, n9);
                this.sink.writeByte(n10 & 0xFF);
                this.sink.writeByte(n11 & 0xFF);
                this.sink.writeInt(Integer.MAX_VALUE & n8);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("reserved bit set: ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("FRAME_SIZE_ERROR length > ");
        ((StringBuilder)object).append(this.maxFrameSize);
        ((StringBuilder)object).append(": ");
        ((StringBuilder)object).append(n9);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void goAway(int n8, ErrorCode object, byte[] byArray) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    try {
                        l.f(object, "errorCode");
                        l.f(byArray, "debugData");
                        if (this.closed) {
                            object = new IOException("closed");
                            throw object;
                        }
                        if (((ErrorCode)((Object)object)).getHttpCode() == -1) {
                            object = new IllegalArgumentException("errorCode.httpCode == -1");
                            throw object;
                        }
                        int n9 = byArray.length;
                        int n10 = 0;
                        this.frameHeader(0, n9 + 8, 7, 0);
                        this.sink.writeInt(n8);
                        this.sink.writeInt(((ErrorCode)((Object)object)).getHttpCode());
                        n8 = n10;
                        if (byArray.length == 0) {
                            n8 = 1;
                        }
                        if (n8 != 0) break block6;
                        this.sink.write(byArray);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                this.sink.flush();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void headers(boolean bl, int n8, List<Header> object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block6: {
                    try {
                        l.f(object, "headerBlock");
                        if (this.closed) break block5;
                        this.hpackWriter.writeHeaders((List<Header>)object);
                        long l8 = this.hpackBuffer.size();
                        long l9 = Math.min((long)this.maxFrameSize, l8);
                        long l10 = l8 == l9 ? 0 : (l8 < l9 ? -1 : 1);
                        int n9 = l10 == false ? 4 : 0;
                        int n10 = n9;
                        if (bl) {
                            n10 = n9 | 1;
                        }
                        this.frameHeader(n8, (int)l9, 1, n10);
                        this.sink.write(this.hpackBuffer, l9);
                        if (l10 <= 0) break block6;
                        this.writeContinuationFrames(n8, l8 - l9);
                    }
                    catch (Throwable throwable2) {}
                }
                return;
            }
            object = new IOException("closed");
            throw object;
            throw throwable2;
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void ping(boolean bl, int n8, int n9) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.closed) {
                        this.frameHeader(0, 8, 6, bl ? 1 : 0);
                        this.sink.writeInt(n8);
                        this.sink.writeInt(n9);
                        this.sink.flush();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                IOException iOException = new IOException("closed");
                throw iOException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void pushPromise(int n8, int n9, List<Header> object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block5: {
                    try {
                        l.f(object, "requestHeaders");
                        if (this.closed) break block4;
                        this.hpackWriter.writeHeaders((List<Header>)object);
                        long l8 = this.hpackBuffer.size();
                        int n10 = (int)Math.min((long)this.maxFrameSize - 4L, l8);
                        long l9 = n10;
                        long l10 = l8 == l9 ? 0 : (l8 < l9 ? -1 : 1);
                        int n11 = l10 == false ? 4 : 0;
                        this.frameHeader(n8, n10 + 4, 5, n11);
                        this.sink.writeInt(n9 & Integer.MAX_VALUE);
                        this.sink.write(this.hpackBuffer, l9);
                        if (l10 <= 0) break block5;
                        this.writeContinuationFrames(n8, l8 - l9);
                    }
                    catch (Throwable throwable2) {}
                }
                return;
            }
            object = new IOException("closed");
            throw object;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void rstStream(int n8, ErrorCode object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    l.f(object, "errorCode");
                    if (this.closed) {
                        object = new IOException("closed");
                        throw object;
                    }
                    if (((ErrorCode)((Object)object)).getHttpCode() != -1) {
                        this.frameHeader(n8, 4, 3, 0);
                        this.sink.writeInt(((ErrorCode)((Object)object)).getHttpCode());
                        this.sink.flush();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object = new IllegalArgumentException("Failed requirement.");
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void settings(Settings object) throws IOException {
        synchronized (this) {
            try {
                int n8;
                l.f(object, "settings");
                if (!this.closed) {
                    n8 = ((Settings)object).size();
                    this.frameHeader(0, n8 * 6, 4, 0);
                } else {
                    object = new IOException("closed");
                    throw object;
                }
                for (int i8 = 0; i8 < 10; ++i8) {
                    if (!((Settings)object).isSet(i8)) continue;
                    n8 = i8 != 4 ? (i8 != 7 ? i8 : 4) : 3;
                    this.sink.writeShort(n8);
                    this.sink.writeInt(((Settings)object).get(i8));
                }
                this.sink.flush();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void windowUpdate(int n8, long l8) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    if (this.closed) {
                        IOException iOException = new IOException("closed");
                        throw iOException;
                    }
                    if (l8 != 0L && l8 <= Integer.MAX_VALUE) {
                        this.frameHeader(n8, 4, 8, 0);
                        this.sink.writeInt((int)l8);
                        this.sink.flush();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                Serializable serializable = new StringBuilder();
                serializable.append("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
                serializable.append(l8);
                String string = serializable.toString();
                serializable = new IllegalArgumentException(string.toString());
                throw serializable;
            }
            throw throwable2;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }
}

