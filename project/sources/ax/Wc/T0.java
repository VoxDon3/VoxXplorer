package ax.Wc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class T0 extends Y0 {
    private static final byte[] f0 = new byte[0];
    private final int d0;
    private int e0;

    T0(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            b(true);
        }
        this.d0 = i;
        this.e0 = i;
    }

    int c() {
        return this.e0;
    }

    void d(byte[] bArr) throws IOException {
        int i = this.e0;
        if (i != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i == 0) {
            return;
        }
        int a = a();
        int i2 = this.e0;
        if (i2 >= a) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.e0 + " >= " + a);
        }
        int d = i2 - ax.Pd.a.d(this.q, bArr, 0, bArr.length);
        this.e0 = d;
        if (d == 0) {
            b(true);
            return;
        }
        throw new EOFException("DEF length " + this.d0 + " object truncated by " + this.e0);
    }

    byte[] e() throws IOException {
        if (this.e0 == 0) {
            return f0;
        }
        int a = a();
        int i = this.e0;
        if (i >= a) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.e0 + " >= " + a);
        }
        byte[] bArr = new byte[i];
        int d = i - ax.Pd.a.d(this.q, bArr, 0, i);
        this.e0 = d;
        if (d == 0) {
            b(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.d0 + " object truncated by " + this.e0);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.e0 == 0) {
            return -1;
        }
        int read = this.q.read();
        if (read >= 0) {
            int i = this.e0 - 1;
            this.e0 = i;
            if (i == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.d0 + " object truncated by " + this.e0);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.e0;
        if (i3 == 0) {
            return -1;
        }
        int read = this.q.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            int i4 = this.e0 - read;
            this.e0 = i4;
            if (i4 == 0) {
                b(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.d0 + " object truncated by " + this.e0);
    }
}
