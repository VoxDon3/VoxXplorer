package ax.Ma;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class a extends FilterInputStream implements InputStreamRetargetInterface {
    private Long q;

    public a(InputStream inputStream) {
        super(inputStream);
        this.q = 0L;
    }

    public Long a() {
        return this.q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        this.q = Long.valueOf(this.q.longValue() + (read == -1 ? 0L : 1L));
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.q = Long.valueOf(this.q.longValue() + skip);
        return skip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = ((FilterInputStream) this).in.read(bArr);
            this.q = Long.valueOf(this.q.longValue() + (read == -1 ? 0L : read));
            return read;
        } catch (EOFException unused) {
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        this.q = Long.valueOf(this.q.longValue() + (read == -1 ? 0L : read));
        return read;
    }
}
