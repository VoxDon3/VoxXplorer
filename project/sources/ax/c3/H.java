package ax.c3;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class H extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    InputStream q;

    public H(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("InputStream is null");
        }
        this.q = inputStream;
    }

    protected void a(InputStream inputStream) {
        this.q = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.q.available();
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.q.close();
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
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
        try {
            return this.q.read();
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            this.q.reset();
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.q.skip(j);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.q.read(bArr);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.q.read(bArr, i, i2);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }
}
