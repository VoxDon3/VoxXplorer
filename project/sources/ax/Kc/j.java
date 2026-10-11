package ax.Kc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class j extends FilterInputStream implements InputStreamRetargetInterface {
    private long q;

    public j(InputStream inputStream) {
        super(inputStream);
    }

    protected final void b(long j) {
        if (j != -1) {
            this.q += j;
        }
    }

    public long c() {
        return this.q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            b(1L);
        }
        return read;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read >= 0) {
            b(read);
        }
        return read;
    }
}
