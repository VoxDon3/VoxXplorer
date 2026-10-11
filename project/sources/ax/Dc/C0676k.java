package ax.Dc;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* renamed from: ax.Dc.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0676k extends InflaterInputStream implements ax.Kc.o, InputStreamRetargetInterface {
    private long c0;
    private long q;

    public C0676k(InputStream inputStream, Inflater inflater) {
        super(inputStream, inflater);
    }

    @Override // ax.Kc.o
    public long a() {
        return this.q;
    }

    @Override // java.util.zip.InflaterInputStream
    protected void fill() throws IOException {
        super.fill();
        this.q += ((InflaterInputStream) this).inf.getRemaining();
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read > -1) {
            this.c0++;
        }
        return read;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read > -1) {
            this.c0 += read;
        }
        return read;
    }
}
