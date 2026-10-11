package ax.H3;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class f extends OutputStream implements AutoCloseable {
    private final ax.F3.b c0;
    private long d0;
    private long e0;
    private final OutputStream q;

    public f(OutputStream outputStream, ax.F3.b bVar, long j) {
        this.q = outputStream;
        this.c0 = bVar;
        this.d0 = j;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
        super.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.q.flush();
        super.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.q.write(bArr);
        long length = this.e0 + bArr.length;
        this.e0 = length;
        this.c0.a(length, this.d0);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.q.write(bArr, i, i2);
        if (i2 < bArr.length) {
            this.e0 += i2;
        } else {
            this.e0 += bArr.length;
        }
        this.c0.a(this.e0, this.d0);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.q.write(i);
        long j = this.e0 + 1;
        this.e0 = j;
        this.c0.a(j, this.d0);
    }
}
