/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.ws;

import ax.Gb.l;
import ax.xc.e;
import ax.xc.f;
import ax.xc.h;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import okhttp3.internal.ws.MessageDeflater;
import okhttp3.internal.ws.WebSocketProtocol;

public final class WebSocketWriter
implements Closeable,
AutoCloseable {
    private final boolean isClient;
    private final e.a maskCursor;
    private final byte[] maskKey;
    private final e messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final f sink;
    private final e sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean bl, f object, Random random, boolean bl2, boolean bl3, long l8) {
        l.f(object, "sink");
        l.f(random, "random");
        this.isClient = bl;
        this.sink = object;
        this.random = random;
        this.perMessageDeflate = bl2;
        this.noContextTakeover = bl3;
        this.minimumDeflateSize = l8;
        this.messageBuffer = new e();
        this.sinkBuffer = object.k();
        random = null;
        object = bl ? (Object)new byte[4] : null;
        this.maskKey = (byte[])object;
        object = random;
        if (bl) {
            object = new e.a();
        }
        this.maskCursor = object;
    }

    private final void writeControlFrame(int n8, h object) throws IOException {
        if (!this.writerClosed) {
            int n9 = ((h)object).G();
            if ((long)n9 <= 125L) {
                this.sinkBuffer.j1(n8 | 0x80);
                if (this.isClient) {
                    this.sinkBuffer.j1(n9 | 0x80);
                    Object object2 = this.random;
                    byte[] byArray = this.maskKey;
                    l.c(byArray);
                    ((Random)object2).nextBytes(byArray);
                    this.sinkBuffer.h1(this.maskKey);
                    if (n9 > 0) {
                        long l8 = this.sinkBuffer.size();
                        this.sinkBuffer.f1((h)object);
                        object2 = this.sinkBuffer;
                        object = this.maskCursor;
                        l.c(object);
                        ((e)object2).G0((e.a)object);
                        this.maskCursor.d(l8);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.j1(n9);
                    this.sinkBuffer.f1((h)object);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    @Override
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final f getSink() {
        return this.sink;
    }

    public final void writeClose(int n8, h h8) throws IOException {
        Object object = h.f0;
        if (n8 != 0 || h8 != null) {
            if (n8 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(n8);
            }
            object = new e();
            ((e)object).o1(n8);
            if (h8 != null) {
                ((e)object).f1(h8);
            }
            object = ((e)object).m0();
        }
        try {
            this.writeControlFrame(8, (h)object);
            return;
        }
        finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int n8, h object) throws IOException {
        l.f(object, "data");
        if (!this.writerClosed) {
            Object object2;
            int n9;
            this.messageBuffer.f1((h)object);
            int n10 = n9 = n8 | 0x80;
            if (this.perMessageDeflate) {
                n10 = n9;
                if ((long)((h)object).G() >= this.minimumDeflateSize) {
                    object = object2 = this.messageDeflater;
                    if (object2 == null) {
                        this.messageDeflater = object = new MessageDeflater(this.noContextTakeover);
                    }
                    ((MessageDeflater)object).deflate(this.messageBuffer);
                    n10 = n8 | 0xC0;
                }
            }
            long l8 = this.messageBuffer.size();
            this.sinkBuffer.j1(n10);
            n8 = this.isClient ? 128 : 0;
            if (l8 <= 125L) {
                n10 = (int)l8;
                this.sinkBuffer.j1(n8 | n10);
            } else if (l8 <= 65535L) {
                this.sinkBuffer.j1(n8 | 0x7E);
                this.sinkBuffer.o1((int)l8);
            } else {
                this.sinkBuffer.j1(n8 | 0x7F);
                this.sinkBuffer.n1(l8);
            }
            if (this.isClient) {
                object2 = this.random;
                object = this.maskKey;
                l.c(object);
                ((Random)object2).nextBytes((byte[])object);
                this.sinkBuffer.h1(this.maskKey);
                if (l8 > 0L) {
                    object = this.messageBuffer;
                    object2 = this.maskCursor;
                    l.c(object2);
                    ((e)object).G0((e.a)object2);
                    this.maskCursor.d(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, l8);
            this.sink.G();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(h h8) throws IOException {
        l.f(h8, "payload");
        this.writeControlFrame(9, h8);
    }

    public final void writePong(h h8) throws IOException {
        l.f(h8, "payload");
        this.writeControlFrame(10, h8);
    }
}

