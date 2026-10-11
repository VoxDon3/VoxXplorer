package ax.Ac;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public abstract class b extends InputStream implements InputStreamRetargetInterface {
    private long c0;
    private final byte[] q = new byte[1];

    protected void a(int i) {
        b(i);
    }

    protected void b(long j) {
        if (j != -1) {
            this.c0 += j;
        }
    }

    public long c() {
        return this.c0;
    }

    protected void d(long j) {
        this.c0 -= j;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.q, 0, 1) == -1) {
            return -1;
        }
        return this.q[0] & 255;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
