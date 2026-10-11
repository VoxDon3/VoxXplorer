package ax.Kc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class d extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private long c0;
    private final InputStream q;

    public d(InputStream inputStream, long j) {
        this.q = inputStream;
        this.c0 = j;
    }

    public long a() {
        return this.c0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.c0;
        if (j <= 0) {
            return -1;
        }
        this.c0 = j - 1;
        return this.q.read();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = this.q.skip(Math.min(this.c0, j));
        this.c0 -= skip;
        return skip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.c0;
        if (j == 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        int read = this.q.read(bArr, i, i2);
        if (read >= 0) {
            this.c0 -= read;
        }
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
