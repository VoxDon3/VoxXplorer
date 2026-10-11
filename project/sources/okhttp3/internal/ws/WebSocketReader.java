package okhttp3.internal.ws;

import ax.Gb.l;
import ax.xc.C3487e;
import ax.xc.g;
import ax.xc.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public final class WebSocketReader implements Closeable, AutoCloseable {
    private boolean closed;
    private final C3487e controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final C3487e.a maskCursor;
    private final byte[] maskKey;
    private final C3487e messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final g source;

    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(h hVar) throws IOException;

        void onReadMessage(String str) throws IOException;

        void onReadPing(h hVar);

        void onReadPong(h hVar);
    }

    public WebSocketReader(boolean z, g gVar, FrameCallback frameCallback, boolean z2, boolean z3) {
        l.f(gVar, "source");
        l.f(frameCallback, "frameCallback");
        this.isClient = z;
        this.source = gVar;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new C3487e();
        this.messageFrameBuffer = new C3487e();
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new C3487e.a();
    }

    private final void readControlFrame() throws IOException {
        short s;
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.T(this.controlFrameBuffer, j);
            if (!this.isClient) {
                C3487e c3487e = this.controlFrameBuffer;
                C3487e.a aVar = this.maskCursor;
                l.c(aVar);
                c3487e.G0(aVar);
                this.maskCursor.d(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                C3487e.a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                l.c(bArr);
                webSocketProtocol.toggleMask(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long size = this.controlFrameBuffer.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s = this.controlFrameBuffer.readShort();
                    str = this.controlFrameBuffer.Z0();
                    String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                    if (closeCodeExceptionMessage != null) {
                        throw new ProtocolException(closeCodeExceptionMessage);
                    }
                } else {
                    s = 1005;
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                this.frameCallback.onReadClose(s, str);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.m0());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.m0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() throws IOException, ProtocolException {
        boolean z;
        if (this.closed) {
            throw new IOException("closed");
        }
        long timeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int and = Util.and(this.source.readByte(), 255);
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            int i = and & 15;
            this.opcode = i;
            boolean z2 = (and & 128) != 0;
            this.isFinalFrame = z2;
            boolean z3 = (and & 8) != 0;
            this.isControlFrame = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (and & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.readingCompressedMessage = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((and & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((and & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int and2 = Util.and(this.source.readByte(), 255);
            boolean z5 = (and2 & 128) != 0;
            if (z5 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = and2 & 127;
            this.frameLength = j;
            if (j == 126) {
                this.frameLength = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j == 127) {
                long readLong = this.source.readLong();
                this.frameLength = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                g gVar = this.source;
                byte[] bArr = this.maskKey;
                l.c(bArr);
                gVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.T(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    C3487e c3487e = this.messageFrameBuffer;
                    C3487e.a aVar = this.maskCursor;
                    l.c(aVar);
                    c3487e.G0(aVar);
                    this.maskCursor.d(this.messageFrameBuffer.size() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    C3487e.a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    l.c(bArr);
                    webSocketProtocol.toggleMask(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.Z0());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.m0());
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final g getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
