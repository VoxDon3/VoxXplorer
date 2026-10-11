package ax.Bc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

/* loaded from: classes3.dex */
class d extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final SeekableByteChannel c0;
    private long d0;
    private final ByteBuffer q;

    public d(SeekableByteChannel seekableByteChannel, long j) {
        this.c0 = seekableByteChannel;
        this.d0 = j;
        if (j >= 8192 || j <= 0) {
            this.q = ByteBuffer.allocate(8192);
        } else {
            this.q = ByteBuffer.allocate((int) j);
        }
    }

    private int a(int i) throws IOException {
        this.q.rewind().limit(i);
        int read = this.c0.read(this.q);
        this.q.flip();
        return read;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.d0;
        if (j <= 0) {
            return -1;
        }
        this.d0 = j - 1;
        int a = a(1);
        return a < 0 ? a : this.q.get() & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer allocate;
        int read;
        if (i2 == 0) {
            return 0;
        }
        long j = this.d0;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        if (i2 <= this.q.capacity()) {
            allocate = this.q;
            read = a(i2);
        } else {
            allocate = ByteBuffer.allocate(i2);
            read = this.c0.read(allocate);
            allocate.flip();
        }
        if (read >= 0) {
            allocate.get(bArr, i, read);
            this.d0 -= read;
        }
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
