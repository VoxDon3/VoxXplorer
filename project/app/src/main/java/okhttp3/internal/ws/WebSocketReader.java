/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.ws;

import ax.Gb.l;
import ax.xc.e;
import ax.xc.g;
import ax.xc.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.ws.MessageInflater;
import okhttp3.internal.ws.WebSocketProtocol;

public final class WebSocketReader
implements Closeable,
AutoCloseable {
    private boolean closed;
    private final e controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final e.a maskCursor;
    private final byte[] maskKey;
    private final e messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final g source;

    public WebSocketReader(boolean bl, g object, FrameCallback frameCallback, boolean bl2, boolean bl3) {
        l.f(object, "source");
        l.f(frameCallback, "frameCallback");
        this.isClient = bl;
        this.source = object;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = bl2;
        this.noContextTakeover = bl3;
        this.controlFrameBuffer = new e();
        this.messageFrameBuffer = new e();
        frameCallback = null;
        object = bl ? null : (Object)new byte[4];
        this.maskKey = (byte[])object;
        object = bl ? frameCallback : new e.a();
        this.maskCursor = object;
    }

    private final void readControlFrame() throws IOException {
        Object object;
        Object object2;
        long l8 = this.frameLength;
        if (l8 > 0L) {
            this.source.T(this.controlFrameBuffer, l8);
            if (!this.isClient) {
                object2 = this.controlFrameBuffer;
                object = this.maskCursor;
                l.c(object);
                ((e)object2).G0((e.a)object);
                this.maskCursor.d(0L);
                object = WebSocketProtocol.INSTANCE;
                e.a a8 = this.maskCursor;
                object2 = this.maskKey;
                l.c(object2);
                ((WebSocketProtocol)object).toggleMask(a8, (byte[])object2);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unknown control opcode: ");
                ((StringBuilder)object).append(Util.toHexString(this.opcode));
                throw new ProtocolException(((StringBuilder)object).toString());
            }
            case 10: {
                this.frameCallback.onReadPong(this.controlFrameBuffer.m0());
                return;
            }
            case 9: {
                this.frameCallback.onReadPing(this.controlFrameBuffer.m0());
                return;
            }
            case 8: 
        }
        l8 = this.controlFrameBuffer.size();
        if (l8 != 1L) {
            int n8;
            if (l8 != 0L) {
                n8 = this.controlFrameBuffer.readShort();
                object = this.controlFrameBuffer.Z0();
                object2 = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(n8);
                if (object2 != null) {
                    throw new ProtocolException((String)object2);
                }
            } else {
                n8 = 1005;
                object = "";
            }
            this.frameCallback.onReadClose(n8, (String)object);
            this.closed = true;
            return;
        }
        throw new ProtocolException("Malformed close payload length of 1.");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void readHeader() throws IOException, ProtocolException {
        int n8;
        if (this.closed) throw new IOException("closed");
        long l8 = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        int n9 = Util.and(this.source.readByte(), 255);
        this.opcode = n8 = n9 & 0xF;
        boolean bl = false;
        boolean bl2 = (n9 & 0x80) != 0;
        this.isFinalFrame = bl2;
        boolean bl3 = (n9 & 8) != 0;
        this.isControlFrame = bl3;
        if (bl3 && !bl2) {
            throw new ProtocolException("Control frames must be final.");
        }
        int n10 = (n9 & 0x40) != 0 ? 1 : 0;
        if (n8 != 1 && n8 != 2) {
            if (n10 != 0) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
        } else {
            if (n10 != 0) {
                if (!this.perMessageDeflate) throw new ProtocolException("Unexpected rsv1 flag");
                bl2 = true;
            } else {
                bl2 = false;
            }
            this.readingCompressedMessage = bl2;
        }
        if ((n9 & 0x20) != 0) throw new ProtocolException("Unexpected rsv2 flag");
        if ((n9 & 0x10) != 0) throw new ProtocolException("Unexpected rsv3 flag");
        n10 = Util.and(this.source.readByte(), 255);
        bl2 = bl;
        if ((n10 & 0x80) != 0) {
            bl2 = true;
        }
        if (bl2 == this.isClient) {
            String string = this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.";
            throw new ProtocolException(string);
        }
        this.frameLength = l8 = (long)(n10 & 0x7F);
        if (l8 == 126L) {
            this.frameLength = Util.and(this.source.readShort(), 65535);
        } else if (l8 == 127L) {
            this.frameLength = l8 = this.source.readLong();
            if (l8 < 0L) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Frame length 0x");
                stringBuilder.append(Util.toHexString(this.frameLength));
                stringBuilder.append(" > 0x7FFFFFFFFFFFFFFF");
                throw new ProtocolException(stringBuilder.toString());
            }
        }
        if (this.isControlFrame && this.frameLength > 125L) {
            throw new ProtocolException("Control frame must be less than 125B.");
        }
        if (!bl2) return;
        g g8 = this.source;
        byte[] byArray = this.maskKey;
        l.c(byArray);
        g8.readFully(byArray);
        return;
        finally {
            this.source.timeout().timeout(l8, TimeUnit.NANOSECONDS);
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            Object object;
            long l8 = this.frameLength;
            if (l8 > 0L) {
                this.source.T(this.messageFrameBuffer, l8);
                if (!this.isClient) {
                    object = this.messageFrameBuffer;
                    Object object2 = this.maskCursor;
                    l.c(object2);
                    ((e)object).G0((e.a)object2);
                    this.maskCursor.d(this.messageFrameBuffer.size() - this.frameLength);
                    object2 = WebSocketProtocol.INSTANCE;
                    object = this.maskCursor;
                    byte[] byArray = this.maskKey;
                    l.c(byArray);
                    ((WebSocketProtocol)object2).toggleMask((e.a)object, byArray);
                    this.maskCursor.close();
                }
            }
            if (!this.isFinalFrame) {
                this.readUntilNonControlFrame();
                if (this.opcode == 0) continue;
                object = new StringBuilder();
                ((StringBuilder)object).append("Expected continuation opcode. Got: ");
                ((StringBuilder)object).append(Util.toHexString(this.opcode));
                throw new ProtocolException(((StringBuilder)object).toString());
            }
            return;
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int n8 = this.opcode;
        if (n8 != 1 && n8 != 2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown opcode: ");
            stringBuilder.append(Util.toHexString(n8));
            throw new ProtocolException(stringBuilder.toString());
        }
        this.readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater;
            MessageInflater messageInflater2 = messageInflater = this.messageInflater;
            if (messageInflater == null) {
                this.messageInflater = messageInflater2 = new MessageInflater(this.noContextTakeover);
            }
            messageInflater2.inflate(this.messageFrameBuffer);
        }
        if (n8 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.Z0());
            return;
        }
        this.frameCallback.onReadMessage(this.messageFrameBuffer.m0());
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            this.readHeader();
            if (!this.isControlFrame) break;
            this.readControlFrame();
        }
    }

    @Override
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
        this.readHeader();
        if (this.isControlFrame) {
            this.readControlFrame();
            return;
        }
        this.readMessageFrame();
    }

    public static interface FrameCallback {
        public void onReadClose(int var1, String var2);

        public void onReadMessage(h var1) throws IOException;

        public void onReadMessage(String var1) throws IOException;

        public void onReadPing(h var1);

        public void onReadPong(h var1);
    }
}

