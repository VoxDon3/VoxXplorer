package ax.Kc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Checksum;

/* loaded from: classes3.dex */
public class h extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private long c0;
    private final long d0;
    private final Checksum e0;
    private final InputStream q;

    public h(Checksum checksum, InputStream inputStream, long j, long j2) {
        this.e0 = checksum;
        this.q = inputStream;
        this.d0 = j2;
        this.c0 = j;
    }

    public long a() {
        return this.c0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.c0 <= 0) {
            return -1;
        }
        int read = this.q.read();
        if (read >= 0) {
            this.e0.update(read);
            this.c0--;
        }
        if (this.c0 != 0 || this.d0 == this.e0.getValue()) {
            return read;
        }
        throw new IOException("Checksum verification failed");
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        return read() >= 0 ? 1L : 0L;
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
        if (i2 == 0) {
            return 0;
        }
        int read = this.q.read(bArr, i, i2);
        if (read >= 0) {
            this.e0.update(bArr, i, read);
            this.c0 -= read;
        }
        if (this.c0 > 0 || this.d0 == this.e0.getValue()) {
            return read;
        }
        throw new IOException("Checksum verification failed");
    }
}
