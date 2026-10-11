package ax.qc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* loaded from: classes3.dex */
abstract class c extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    protected byte[] c0 = new byte[1];
    private AbstractC2901b<?> q;

    public c(AbstractC2901b<?> abstractC2901b) {
        this.q = abstractC2901b;
    }

    public void a(InputStream inputStream, int i) throws IOException {
        this.q.b(inputStream, i);
    }

    protected byte[] b() {
        return this.q.d();
    }

    public int c(PushbackInputStream pushbackInputStream) throws IOException {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.c0) == -1) {
            return -1;
        }
        return this.c0[0];
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
        return this.q.read(bArr, i, i2);
    }
}
