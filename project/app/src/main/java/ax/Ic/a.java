/*
 * Decompiled with CFR 0.152.
 */
package ax.Ic;

import ax.Kc.b;
import ax.Kc.o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public abstract class a
extends ax.Ec.a
implements o {
    private final byte[] c0 = new byte[1];
    protected final b d0;
    private int e0 = -1;
    private int f0 = 9;
    private byte g0;
    private int h0 = -1;
    private int i0;
    private int[] j0;
    private byte[] k0;
    private byte[] l0;
    private int m0;

    protected a(InputStream inputStream, ByteOrder byteOrder) {
        this.d0 = new b(inputStream, byteOrder);
    }

    private int F(byte[] byArray, int n8, int n9) {
        int n10 = this.l0.length - this.m0;
        if (n10 > 0) {
            n9 = Math.min(n10, n9);
            System.arraycopy(this.l0, this.m0, byArray, n8, n9);
            this.m0 += n9;
            return n9;
        }
        return 0;
    }

    protected void A(int n8) {
        if (n8 > 0) {
            n8 = 1 << n8;
            this.j0 = new int[n8];
            this.k0 = new byte[n8];
            this.l0 = new byte[n8];
            this.m0 = n8;
            for (n8 = 0; n8 < 256; ++n8) {
                this.j0[n8] = -1;
                this.k0[n8] = (byte)n8;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("maxCodeSize is ");
        stringBuilder.append(n8);
        stringBuilder.append(", must be bigger than 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected int H() throws IOException {
        int n8 = this.f0;
        if (n8 <= 31) {
            return (int)this.d0.j(n8);
        }
        throw new IllegalArgumentException("Code size must not be bigger than 31");
    }

    protected void L(int n8) {
        this.e0 = 1 << n8 - 1;
    }

    protected void W(int n8, int n9) {
        this.j0[n8] = n9;
    }

    @Override
    public long a() {
        return this.d0.f();
    }

    @Override
    public void close() throws IOException {
        this.d0.close();
    }

    protected abstract int d(int var1, byte var2) throws IOException;

    protected void d0(int n8) {
        this.i0 = n8;
    }

    protected int e(int n8, byte by, int n9) {
        int n10 = this.i0;
        if (n10 < n9) {
            this.j0[n10] = n8;
            this.k0[n10] = by;
            this.i0 = n10 + 1;
            return n10;
        }
        return -1;
    }

    protected int f() throws IOException {
        int n8 = this.h0;
        if (n8 != -1) {
            return this.d(n8, this.g0);
        }
        throw new IOException("The first code can't be a reference to its preceding code");
    }

    protected abstract int g() throws IOException;

    protected int j(int n8, boolean bl) throws IOException {
        byte[] byArray;
        int n9 = n8;
        while (n9 >= 0) {
            int n10;
            byArray = this.l0;
            this.m0 = n10 = this.m0 - 1;
            byArray[n10] = this.k0[n9];
            n9 = this.j0[n9];
        }
        n9 = this.h0;
        if (n9 != -1 && !bl) {
            this.d(n9, this.l0[this.m0]);
        }
        this.h0 = n8;
        byArray = this.l0;
        n8 = this.m0;
        this.g0 = byArray[n8];
        return n8;
    }

    protected int m() {
        return this.e0;
    }

    protected int o() {
        return this.f0;
    }

    protected int p(int n8) {
        return this.j0[n8];
    }

    protected int q() {
        return this.j0.length;
    }

    @Override
    public int read() throws IOException {
        int n8 = this.read(this.c0);
        if (n8 < 0) {
            return n8;
        }
        return this.c0[0] & 0xFF;
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        int n10;
        if (n9 == 0) {
            return 0;
        }
        int n11 = this.F(byArray, n8, n9);
        while ((n10 = n9 - n11) > 0) {
            int n12 = this.g();
            if (n12 < 0) {
                if (n11 > 0) {
                    this.b(n11);
                    return n11;
                }
                return n12;
            }
            n11 += this.F(byArray, n8 + n11, n10);
        }
        this.b(n11);
        return n11;
    }

    protected int u() {
        return this.i0;
    }

    protected void v() {
        ++this.f0;
    }
}

