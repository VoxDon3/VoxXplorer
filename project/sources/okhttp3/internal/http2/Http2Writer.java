package okhttp3.internal.http2;

import ax.Gb.g;
import ax.Gb.l;
import ax.xc.C3487e;
import ax.xc.InterfaceC3488f;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* loaded from: classes3.dex */
public final class Http2Writer implements Closeable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final C3487e hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final InterfaceC3488f sink;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public Http2Writer(InterfaceC3488f interfaceC3488f, boolean z) {
        l.f(interfaceC3488f, "sink");
        this.sink = interfaceC3488f;
        this.client = z;
        C3487e c3487e = new C3487e();
        this.hpackBuffer = c3487e;
        this.maxFrameSize = Http2.INITIAL_MAX_FRAME_SIZE;
        this.hpackWriter = new Hpack.Writer(0, false, c3487e, 3, null);
    }

    private final void writeContinuationFrames(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min(this.maxFrameSize, j);
            j -= min;
            frameHeader(i, (int) min, 9, j == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings settings) throws IOException {
        try {
            l.f(settings, "peerSettings");
            if (this.closed) {
                throw new IOException("closed");
            }
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() throws IOException {
        try {
            if (this.closed) {
                throw new IOException("closed");
            }
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.t(), new Object[0]));
                }
                this.sink.I0(Http2.CONNECTION_PREFACE);
                this.sink.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void data(boolean z, int i, C3487e c3487e, int i2) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        dataFrame(i, z ? 1 : 0, c3487e, i2);
    }

    public final void dataFrame(int i, int i2, C3487e c3487e, int i3) throws IOException {
        frameHeader(i, i3, 0, i2);
        if (i3 > 0) {
            InterfaceC3488f interfaceC3488f = this.sink;
            l.c(c3487e);
            interfaceC3488f.write(c3487e, i3);
        }
    }

    public final synchronized void flush() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public final void frameHeader(int i, int i2, int i3, int i4) throws IOException {
        int i5;
        int i6;
        int i7;
        int i8;
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
            logger2.fine(Http2.INSTANCE.frameLog(false, i5, i6, i7, i8));
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        if (i6 > this.maxFrameSize) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i6).toString());
        }
        if ((Integer.MIN_VALUE & i5) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i5).toString());
        }
        Util.writeMedium(this.sink, i6);
        this.sink.writeByte(i7 & 255);
        this.sink.writeByte(i8 & 255);
        this.sink.writeInt(Integer.MAX_VALUE & i5);
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        try {
            l.f(errorCode, "errorCode");
            l.f(bArr, "debugData");
            if (this.closed) {
                throw new IOException("closed");
            }
            if (errorCode.getHttpCode() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            frameHeader(0, bArr.length + 8, 7, 0);
            this.sink.writeInt(i);
            this.sink.writeInt(errorCode.getHttpCode());
            if (!(bArr.length == 0)) {
                this.sink.write(bArr);
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void headers(boolean z, int i, List<Header> list) throws IOException {
        l.f(list, "headerBlock");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long size = this.hpackBuffer.size();
        long min = Math.min(this.maxFrameSize, size);
        int i2 = size == min ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        frameHeader(i, (int) min, 1, i2);
        this.sink.write(this.hpackBuffer, min);
        if (size > min) {
            writeContinuationFrames(i, size - min);
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z, int i, int i2) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, 6, z ? 1 : 0);
        this.sink.writeInt(i);
        this.sink.writeInt(i2);
        this.sink.flush();
    }

    public final synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        l.f(list, "requestHeaders");
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long size = this.hpackBuffer.size();
        int min = (int) Math.min(this.maxFrameSize - 4, size);
        long j = min;
        frameHeader(i, min + 4, 5, size == j ? 4 : 0);
        this.sink.writeInt(i2 & SubsamplingScaleImageView.TILE_SIZE_AUTO);
        this.sink.write(this.hpackBuffer, j);
        if (size > j) {
            writeContinuationFrames(i, size - j);
        }
    }

    public final synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
        l.f(errorCode, "errorCode");
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.getHttpCode() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        frameHeader(i, 4, 3, 0);
        this.sink.writeInt(errorCode.getHttpCode());
        this.sink.flush();
    }

    public final synchronized void settings(Settings settings) throws IOException {
        try {
            l.f(settings, "settings");
            if (this.closed) {
                throw new IOException("closed");
            }
            int i = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i < 10) {
                if (settings.isSet(i)) {
                    this.sink.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.sink.writeInt(settings.get(i));
                }
                i++;
            }
            this.sink.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void windowUpdate(int i, long j) throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        frameHeader(i, 4, 8, 0);
        this.sink.writeInt((int) j);
        this.sink.flush();
    }
}
