/*
 * Decompiled with CFR 0.152.
 */
package ax.wd;

import ax.Nd.f;
import ax.vd.j;

public abstract class b
implements j,
f {
    private final byte[] a = new byte[4];
    private int b;
    private long c;

    protected b() {
        this.b = 0;
    }

    protected b(b b8) {
        this.k(b8);
    }

    @Override
    public void a() {
        byte[] byArray;
        this.c = 0L;
        this.b = 0;
        for (int i8 = 0; i8 < (byArray = this.a).length; ++i8) {
            byArray[i8] = 0;
        }
    }

    @Override
    public void b(byte[] byArray, int n8, int n9) {
        int n10;
        byte[] byArray2;
        int n11 = 0;
        int n12 = Math.max(0, n9);
        n9 = n11;
        if (this.b != 0) {
            n9 = 0;
            while (n9 < n12) {
                byArray2 = this.a;
                int n13 = this.b;
                this.b = n10 = n13 + 1;
                n11 = n9 + 1;
                byArray2[n13] = byArray[n9 + n8];
                if (n10 == 4) {
                    this.o(byArray2, 0);
                    this.b = 0;
                    n9 = n11;
                    break;
                }
                n9 = n11;
            }
        }
        n11 = n9;
        while (true) {
            if (n10 >= (n12 - n9 & 0xFFFFFFFC) + n9) break;
            this.o(byArray, n8 + n10);
            n11 = n10 + 4;
        }
        for (n11 = n10 = n11; n11 < n12; ++n11) {
            byArray2 = this.a;
            n9 = this.b;
            this.b = n9 + 1;
            byArray2[n9] = byArray[n11 + n8];
        }
        this.c += (long)n12;
    }

    @Override
    public void d(byte by) {
        int n8;
        byte[] byArray = this.a;
        int n9 = this.b;
        this.b = n8 = n9 + 1;
        byArray[n9] = by;
        if (n8 == byArray.length) {
            this.o(byArray, 0);
            this.b = 0;
        }
        ++this.c;
    }

    @Override
    public int h() {
        return 64;
    }

    protected void k(b b8) {
        byte[] byArray = b8.a;
        System.arraycopy(byArray, 0, this.a, 0, byArray.length);
        this.b = b8.b;
        this.c = b8.c;
    }

    public void l() {
        long l8 = this.c;
        byte by = -128;
        while (true) {
            this.d(by);
            if (this.b == 0) break;
            by = 0;
        }
        this.n(l8 << 3);
        this.m();
    }

    protected abstract void m();

    protected abstract void n(long var1);

    protected abstract void o(byte[] var1, int var2);
}

