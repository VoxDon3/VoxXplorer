package ax.qc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
class g extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private long c0 = 0;
    private byte[] d0 = new byte[1];
    private long e0;
    private InputStream q;

    public g(InputStream inputStream, long j) {
        this.q = inputStream;
        this.e0 = j;
    }

    private int b(byte[] bArr, int i) throws IOException {
        int length = bArr.length - i;
        int i2 = 0;
        for (int i3 = 0; i < bArr.length && i2 != -1 && i3 < 15; i3++) {
            i2 += this.q.read(bArr, i, length);
            if (i2 > 0) {
                i += i2;
                length -= i2;
            }
        }
        return i;
    }

    public int a(byte[] bArr) throws IOException {
        int read = this.q.read(bArr);
        if (read == -1) {
            throw new IOException("Unexpected EOF reached when trying to read stream");
        }
        if (read == bArr.length) {
            return read;
        }
        int b = b(bArr, read);
        if (b == bArr.length) {
            return b;
        }
        throw new IOException("Cannot read fully into byte buffer");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.d0) == -1) {
            return -1;
        }
        return this.d0[0];
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
        long j = this.e0;
        if (j != -1) {
            long j2 = this.c0;
            if (j2 >= j) {
                return -1;
            }
            if (i2 > j - j2) {
                i2 = (int) (j - j2);
            }
        }
        int read = this.q.read(bArr, i, i2);
        if (read > 0) {
            this.c0 += read;
        }
        return read;
    }
}
