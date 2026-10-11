package ax.U0;

import ax.S0.C0968a;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class i extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final k c0;
    private long g0;
    private final g q;
    private boolean e0 = false;
    private boolean f0 = false;
    private final byte[] d0 = new byte[1];

    public i(g gVar, k kVar) {
        this.q = gVar;
        this.c0 = kVar;
    }

    private void a() throws IOException {
        if (this.e0) {
            return;
        }
        this.q.f(this.c0);
        this.e0 = true;
    }

    public void b() throws IOException {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f0) {
            return;
        }
        this.q.close();
        this.f0 = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.d0) == -1) {
            return -1;
        }
        return this.d0[0] & 255;
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
        C0968a.g(!this.f0);
        a();
        int c = this.q.c(bArr, i, i2);
        if (c == -1) {
            return -1;
        }
        this.g0 += c;
        return c;
    }
}
