package ax.Pd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class b extends OutputStream implements AutoCloseable {
    private OutputStream c0;
    private OutputStream q;

    public b(OutputStream outputStream, OutputStream outputStream2) {
        this.q = outputStream;
        this.c0 = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
        this.c0.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.q.flush();
        this.c0.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.q.write(i);
        this.c0.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.q.write(bArr);
        this.c0.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.q.write(bArr, i, i2);
        this.c0.write(bArr, i, i2);
    }
}
