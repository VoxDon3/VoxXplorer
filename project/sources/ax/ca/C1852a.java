package ax.ca;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ax.ca.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1852a extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final int c0;
    private final InputStream q;

    public C1852a(InputStream inputStream, int i) {
        this.q = inputStream;
        this.c0 = i;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.c0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.q.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.q.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.q.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.q.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return this.q.skip(j);
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.q.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.q.read(bArr, i, i2);
    }
}
