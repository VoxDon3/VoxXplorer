package ax.w4;

import ax.w4.C3343c;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ax.w4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3345e extends OutputStream implements AutoCloseable {
    private OutputStream c0;
    private long q = 0;

    public C3345e(OutputStream outputStream) {
        this.c0 = outputStream;
    }

    private void b(int i) {
        this.q += i;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c0.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.c0.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.c0.write(bArr, i, i2);
        b(i2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.c0.write(bArr);
        b(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.c0.write(i);
        b(1);
    }

    public void a(C3343c.d dVar) {
    }
}
