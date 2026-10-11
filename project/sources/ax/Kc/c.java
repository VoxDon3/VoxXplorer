package ax.Kc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class c extends InputStream implements InputStreamRetargetInterface {
    private ByteBuffer c0;
    private long d0;
    private final long q;

    public c(long j, long j2) {
        long j3 = j + j2;
        this.q = j3;
        if (j3 >= j) {
            this.d0 = j;
            return;
        }
        throw new IllegalArgumentException("Invalid length of stream at offset=" + j + ", length=" + j2);
    }

    protected abstract int a(long j, ByteBuffer byteBuffer) throws IOException;

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        try {
            if (this.d0 >= this.q) {
                return -1;
            }
            ByteBuffer byteBuffer = this.c0;
            if (byteBuffer == null) {
                this.c0 = ByteBuffer.allocate(1);
            } else {
                byteBuffer.rewind();
            }
            if (a(this.d0, this.c0) < 1) {
                return -1;
            }
            this.d0++;
            return this.c0.get() & 255;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.d0;
        long j2 = this.q;
        if (j >= j2) {
            return -1;
        }
        long min = Math.min(i2, j2 - j);
        if (min <= 0) {
            return 0;
        }
        if (i >= 0 && i <= bArr.length && min <= bArr.length - i) {
            int a = a(this.d0, ByteBuffer.wrap(bArr, i, (int) min));
            if (a > 0) {
                this.d0 += a;
            }
            return a;
        }
        throw new IndexOutOfBoundsException("offset or len are out of bounds");
    }
}
