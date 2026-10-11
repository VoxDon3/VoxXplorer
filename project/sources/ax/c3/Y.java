package ax.c3;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class Y extends OutputStream implements AutoCloseable {
    OutputStream q;

    public Y(OutputStream outputStream) {
        this.q = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.q.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.q.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.q.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.q.write(i);
    }
}
