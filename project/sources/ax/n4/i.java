package ax.n4;

import ax.xc.C;
import ax.xc.C3487e;
import ax.xc.D;
import ax.xc.InterfaceC3488f;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class i implements InterfaceC3488f, AutoCloseable {
    private boolean c0;
    private byte[] d0;
    C3487e e0;
    private final MessageDigest q;

    public i(MessageDigest messageDigest) {
        this.q = messageDigest;
        messageDigest.reset();
        this.e0 = new C3487e();
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f I0(ax.xc.h hVar) throws IOException {
        this.q.update(hVar.J());
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    public long M(C c) throws IOException {
        return 0L;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f Q0(long j) throws IOException {
        return null;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f R() throws IOException {
        return null;
    }

    public byte[] a() {
        return this.d0;
    }

    @Override // ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        this.d0 = this.q.digest();
        this.e0.close();
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f f0(String str) throws IOException {
        return null;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return false;
    }

    @Override // ax.xc.InterfaceC3488f
    public C3487e k() {
        return this.e0;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f l0(long j) throws IOException {
        return null;
    }

    @Override // ax.xc.InterfaceC3482A
    public D timeout() {
        return null;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f write(byte[] bArr) throws IOException {
        this.q.update(bArr);
        return this;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f writeByte(int i) throws IOException {
        return null;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f writeInt(int i) throws IOException {
        return null;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f writeShort(int i) throws IOException {
        return null;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f write(byte[] bArr, int i, int i2) throws IOException {
        this.q.update(bArr, i, i2);
        return this;
    }

    @Override // ax.xc.InterfaceC3482A
    public void write(C3487e c3487e, long j) throws IOException {
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return 0;
    }

    @Override // ax.xc.InterfaceC3488f
    public InterfaceC3488f G() throws IOException {
        return this;
    }

    @Override // ax.xc.InterfaceC3488f, ax.xc.InterfaceC3482A, java.io.Flushable
    public void flush() throws IOException {
    }
}
