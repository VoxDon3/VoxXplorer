package ax.Ac;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public abstract class c extends OutputStream {
    private long c0;
    private final byte[] q = new byte[1];

    protected void a(long j) {
        if (j != -1) {
            this.c0 += j;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.q;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, 1);
    }
}
