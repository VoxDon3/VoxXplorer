package ax.Ma;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class b extends FilterInputStream implements InputStreamRetargetInterface {
    private Long q;

    public b(InputStream inputStream, Long l) {
        super(inputStream);
        this.q = l;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return ((FilterInputStream) this).in.read(bArr);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((FilterInputStream) this).in.read(bArr, i, i2);
    }
}
