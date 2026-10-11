package ax.Wc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class V0 extends Y0 {
    private int d0;
    private int e0;
    private boolean f0;
    private boolean g0;

    V0(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f0 = false;
        this.g0 = true;
        this.d0 = inputStream.read();
        int read = inputStream.read();
        this.e0 = read;
        if (read < 0) {
            throw new EOFException();
        }
        c();
    }

    private boolean c() {
        if (!this.f0 && this.g0 && this.d0 == 0 && this.e0 == 0) {
            this.f0 = true;
            b(true);
        }
        return this.f0;
    }

    void d(boolean z) {
        this.g0 = z;
        c();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (c()) {
            return -1;
        }
        int read = this.q.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i = this.d0;
        this.d0 = this.e0;
        this.e0 = read;
        return i;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.g0 || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.f0) {
            return -1;
        }
        int read = this.q.read(bArr, i + 2, i2 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.d0;
        bArr[i + 1] = (byte) this.e0;
        this.d0 = this.q.read();
        int read2 = this.q.read();
        this.e0 = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
