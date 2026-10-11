package ax.W4;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class h extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
    private final InputStream c0;
    private byte[] d0;
    private int e0;
    private final int f0;
    private final e q;

    public h(e eVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.q = eVar;
        this.c0 = inputStream;
        this.d0 = bArr;
        this.e0 = i;
        this.f0 = i2;
    }

    private void a() {
        byte[] bArr = this.d0;
        if (bArr != null) {
            this.d0 = null;
            e eVar = this.q;
            if (eVar != null) {
                eVar.o(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.d0 != null ? this.f0 - this.e0 : this.c0.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        this.c0.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        if (this.d0 == null) {
            this.c0.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.d0 == null && this.c0.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.d0;
        if (bArr == null) {
            return this.c0.read();
        }
        int i = this.e0;
        int i2 = i + 1;
        this.e0 = i2;
        int i3 = bArr[i] & 255;
        if (i2 >= this.f0) {
            a();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.d0 == null) {
            this.c0.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        if (this.d0 != null) {
            int i = this.f0;
            int i2 = this.e0;
            j2 = i - i2;
            if (j2 > j) {
                this.e0 = i2 + ((int) j);
                return j;
            }
            a();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.c0.skip(j) : j2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.d0;
        if (bArr2 != null) {
            int i3 = this.f0;
            int i4 = this.e0;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.e0 + i2;
            this.e0 = i6;
            if (i6 >= this.f0) {
                a();
            }
            return i2;
        }
        return this.c0.read(bArr, i, i2);
    }
}
