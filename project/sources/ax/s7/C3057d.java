package ax.s7;

import ax.q7.n;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ax.s7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3057d extends FilterOutputStream implements AutoCloseable {
    private long q;

    public C3057d(OutputStream outputStream) {
        super((OutputStream) n.n(outputStream));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.q += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.q++;
    }
}
