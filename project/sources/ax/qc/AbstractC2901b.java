package ax.qc;

import ax.lc.InterfaceC2503c;
import ax.sc.EnumC3086c;
import ax.tc.C3146e;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.qc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2901b<T extends InterfaceC2503c> extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private T c0;
    private byte[] d0;
    private byte[] e0 = new byte[1];
    private ax.rc.f f0;
    private g q;

    public AbstractC2901b(g gVar, ax.rc.f fVar, char[] cArr, int i, boolean z) throws IOException {
        this.q = gVar;
        this.c0 = e(fVar, cArr, z);
        this.f0 = fVar;
        if (C3146e.d(fVar).equals(EnumC3086c.DEFLATE)) {
            this.d0 = new byte[i];
        }
    }

    private void a(byte[] bArr, int i) {
        byte[] bArr2 = this.d0;
        if (bArr2 != null) {
            System.arraycopy(bArr, 0, bArr2, 0, i);
        }
    }

    public T c() {
        return this.c0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    public byte[] d() {
        return this.d0;
    }

    protected abstract T e(ax.rc.f fVar, char[] cArr, boolean z) throws IOException;

    protected int f(byte[] bArr) throws IOException {
        return this.q.a(bArr);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.e0) == -1) {
            return -1;
        }
        return this.e0[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int f = C3146e.f(this.q, bArr, i, i2);
        if (f > 0) {
            a(bArr, f);
            this.c0.a(bArr, i, f);
        }
        return f;
    }

    protected void b(InputStream inputStream, int i) throws IOException {
    }
}
