package ax.Ic;

import ax.Kc.b;
import ax.Kc.o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public abstract class a extends ax.Ec.a implements o {
    protected final b d0;
    private byte g0;
    private int i0;
    private int[] j0;
    private byte[] k0;
    private byte[] l0;
    private int m0;
    private final byte[] c0 = new byte[1];
    private int e0 = -1;
    private int f0 = 9;
    private int h0 = -1;

    protected a(InputStream inputStream, ByteOrder byteOrder) {
        this.d0 = new b(inputStream, byteOrder);
    }

    private int F(byte[] bArr, int i, int i2) {
        int length = this.l0.length - this.m0;
        if (length <= 0) {
            return 0;
        }
        int min = Math.min(length, i2);
        System.arraycopy(this.l0, this.m0, bArr, i, min);
        this.m0 += min;
        return min;
    }

    protected void A(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxCodeSize is " + i + ", must be bigger than 0");
        }
        int i2 = 1 << i;
        this.j0 = new int[i2];
        this.k0 = new byte[i2];
        this.l0 = new byte[i2];
        this.m0 = i2;
        for (int i3 = 0; i3 < 256; i3++) {
            this.j0[i3] = -1;
            this.k0[i3] = (byte) i3;
        }
    }

    protected int H() throws IOException {
        int i = this.f0;
        if (i <= 31) {
            return (int) this.d0.j(i);
        }
        throw new IllegalArgumentException("Code size must not be bigger than 31");
    }

    protected void L(int i) {
        this.e0 = 1 << (i - 1);
    }

    protected void W(int i, int i2) {
        this.j0[i] = i2;
    }

    @Override // ax.Kc.o
    public long a() {
        return this.d0.f();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d0.close();
    }

    protected abstract int d(int i, byte b) throws IOException;

    protected void d0(int i) {
        this.i0 = i;
    }

    protected int e(int i, byte b, int i2) {
        int i3 = this.i0;
        if (i3 >= i2) {
            return -1;
        }
        this.j0[i3] = i;
        this.k0[i3] = b;
        this.i0 = i3 + 1;
        return i3;
    }

    protected int f() throws IOException {
        int i = this.h0;
        if (i != -1) {
            return d(i, this.g0);
        }
        throw new IOException("The first code can't be a reference to its preceding code");
    }

    protected abstract int g() throws IOException;

    protected int j(int i, boolean z) throws IOException {
        int i2 = i;
        while (i2 >= 0) {
            byte[] bArr = this.l0;
            int i3 = this.m0 - 1;
            this.m0 = i3;
            bArr[i3] = this.k0[i2];
            i2 = this.j0[i2];
        }
        int i4 = this.h0;
        if (i4 != -1 && !z) {
            d(i4, this.l0[this.m0]);
        }
        this.h0 = i;
        byte[] bArr2 = this.l0;
        int i5 = this.m0;
        this.g0 = bArr2[i5];
        return i5;
    }

    protected int m() {
        return this.e0;
    }

    protected int o() {
        return this.f0;
    }

    protected int p(int i) {
        return this.j0[i];
    }

    protected int q() {
        return this.j0.length;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = read(this.c0);
        return read < 0 ? read : this.c0[0] & 255;
    }

    protected int u() {
        return this.i0;
    }

    protected void v() {
        this.f0++;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int F = F(bArr, i, i2);
        while (true) {
            int i3 = i2 - F;
            if (i3 > 0) {
                int g = g();
                if (g < 0) {
                    if (F <= 0) {
                        return g;
                    }
                    b(F);
                    return F;
                }
                F += F(bArr, i + F, i3);
            } else {
                b(F);
                return F;
            }
        }
    }
}
