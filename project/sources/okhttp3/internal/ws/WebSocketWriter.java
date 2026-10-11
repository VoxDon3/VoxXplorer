package okhttp3.internal.ws;

import ax.Gb.l;
import ax.xc.C3487e;
import ax.xc.InterfaceC3488f;
import ax.xc.h;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes3.dex */
public final class WebSocketWriter implements Closeable, AutoCloseable {
    private final boolean isClient;
    private final C3487e.a maskCursor;
    private final byte[] maskKey;
    private final C3487e messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final InterfaceC3488f sink;
    private final C3487e sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, InterfaceC3488f interfaceC3488f, Random random, boolean z2, boolean z3, long j) {
        l.f(interfaceC3488f, "sink");
        l.f(random, "random");
        this.isClient = z;
        this.sink = interfaceC3488f;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j;
        this.messageBuffer = new C3487e();
        this.sinkBuffer = interfaceC3488f.k();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new C3487e.a() : null;
    }

    private final void writeControlFrame(int i, h hVar) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int G = hVar.G();
        if (G > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.writeByte(i | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(G | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            l.c(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (G > 0) {
                long size = this.sinkBuffer.size();
                this.sinkBuffer.I0(hVar);
                C3487e c3487e = this.sinkBuffer;
                C3487e.a aVar = this.maskCursor;
                l.c(aVar);
                c3487e.G0(aVar);
                this.maskCursor.d(size);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(G);
            this.sinkBuffer.I0(hVar);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final InterfaceC3488f getSink() {
        return this.sink;
    }

    public final void writeClose(int i, h hVar) throws IOException {
        h hVar2 = h.f0;
        if (i != 0 || hVar != null) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C3487e c3487e = new C3487e();
            c3487e.writeShort(i);
            if (hVar != null) {
                c3487e.I0(hVar);
            }
            hVar2 = c3487e.m0();
        }
        try {
            writeControlFrame(8, hVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, h hVar) throws IOException {
        l.f(hVar, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.I0(hVar);
        int i2 = i | 128;
        if (this.perMessageDeflate && hVar.G() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i2 = i | 192;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i2);
        int i3 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(i3 | ((int) size));
        } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.writeByte(i3 | 126);
            this.sinkBuffer.writeShort((int) size);
        } else {
            this.sinkBuffer.writeByte(i3 | 127);
            this.sinkBuffer.n1(size);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            l.c(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                C3487e c3487e = this.messageBuffer;
                C3487e.a aVar = this.maskCursor;
                l.c(aVar);
                c3487e.G0(aVar);
                this.maskCursor.d(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, size);
        this.sink.G();
    }

    public final void writePing(h hVar) throws IOException {
        l.f(hVar, "payload");
        writeControlFrame(9, hVar);
    }

    public final void writePong(h hVar) throws IOException {
        l.f(hVar, "payload");
        writeControlFrame(10, hVar);
    }
}
