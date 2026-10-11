/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import ax.S0.a;
import java.nio.Buffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class r {
    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private final int g;
    private final int h;
    private final short[] i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private short[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private double w;

    public r(int n8, int n9, float f8, float f9, int n10) {
        this.a = n8;
        this.b = n9;
        this.c = f8;
        this.d = f9;
        this.e = (float)n8 / (float)n10;
        this.f = n8 / 400;
        this.g = n8 /= 65;
        this.h = n8 *= 2;
        this.i = new short[n8];
        this.j = new short[n8 * n9];
        this.l = new short[n8 * n9];
        this.n = new short[n8 * n9];
    }

    private void a(float f8, int n8) {
        long l8;
        if (this.m == n8) {
            return;
        }
        int n9 = this.a;
        long l9 = (long)((float)n9 / f8);
        for (l8 = (long)n9; l9 != 0L && l8 != 0L && l9 % 2L == 0L && l8 % 2L == 0L; l9 /= 2L, l8 /= 2L) {
        }
        this.o(n8);
        n8 = 0;
        while (true) {
            int n10;
            long l10;
            n9 = this.o;
            boolean bl = true;
            if (n8 >= n9 - 1) break;
            while ((l10 = (long)((n10 = this.p) + 1)) * l9 > (long)(n9 = this.q) * l8) {
                this.l = this.f(this.l, this.m, 1);
                for (n9 = 0; n9 < (n10 = this.b); ++n9) {
                    this.l[this.m * n10 + n9] = this.n(this.n, n10 * n8 + n9, l8, l9);
                }
                ++this.q;
                ++this.m;
            }
            this.p = ++n10;
            if ((long)n10 == l8) {
                this.p = 0;
                if ((long)n9 != l9) {
                    bl = false;
                }
                ax.S0.a.g(bl);
                this.q = 0;
            }
            ++n8;
        }
        this.u(n9 - 1);
    }

    private void b(double d8) {
        int n8 = this.k;
        if (n8 < this.h) {
            return;
        }
        int n9 = 0;
        do {
            if (this.r > 0) {
                n9 += this.c(n9);
                continue;
            }
            int n10 = this.g(this.j, n9);
            if (d8 > 1.0) {
                n9 += n10 + this.w(this.j, n9, d8, n10);
                continue;
            }
            n9 += this.m(this.j, n9, d8, n10);
        } while (this.h + n9 <= n8);
        this.v(n9);
    }

    private int c(int n8) {
        int n9 = Math.min(this.h, this.r);
        this.d(this.j, n8, n9);
        this.r -= n9;
        return n9;
    }

    private void d(short[] sArray, int n8, int n9) {
        short[] sArray2 = this.f(this.l, this.m, n9);
        this.l = sArray2;
        int n10 = this.b;
        System.arraycopy(sArray, n8 * n10, sArray2, this.m * n10, n10 * n9);
        this.m += n9;
    }

    private void e(short[] sArray, int n8, int n9) {
        int n10 = this.h / n9;
        int n11 = this.b;
        int n12 = n9 * n11;
        for (n9 = 0; n9 < n10; ++n9) {
            int n13 = 0;
            for (int i8 = 0; i8 < n12; ++i8) {
                n13 += sArray[n9 * n12 + n8 * n11 + i8];
            }
            this.i[n9] = (short)(n13 /= n12);
        }
    }

    private short[] f(short[] sArray, int n8, int n9) {
        int n10 = sArray.length;
        int n11 = this.b;
        if (n8 + n9 <= (n10 /= n11)) {
            return sArray;
        }
        return Arrays.copyOf(sArray, (n10 * 3 / 2 + n9) * n11);
    }

    private int g(short[] sArray, int n8) {
        int n9 = this.a;
        n9 = n9 > 4000 ? (n9 /= 4000) : 1;
        if (this.b == 1 && n9 == 1) {
            n8 = this.h(sArray, n8, this.f, this.g);
        } else {
            this.e(sArray, n8, n9);
            int n10 = this.h(this.i, 0, this.f / n9, this.g / n9);
            if (n9 != 1) {
                int n11 = n10 * n9;
                n10 = n11 - (n9 *= 4);
                n11 += n9;
                int n12 = this.f;
                n9 = n10;
                if (n10 < n12) {
                    n9 = n12;
                }
                n12 = this.g;
                n10 = n11;
                if (n11 > n12) {
                    n10 = n12;
                }
                if (this.b == 1) {
                    n8 = this.h(sArray, n8, n9, n10);
                } else {
                    this.e(sArray, n8, 1);
                    n8 = this.h(this.i, 0, n9, n10);
                }
            } else {
                n8 = n10;
            }
        }
        n9 = this.q(this.u, this.v) ? this.s : n8;
        this.t = this.u;
        this.s = n8;
        return n9;
    }

    private int h(short[] sArray, int n8, int n9, int n10) {
        int n11 = n8 * this.b;
        int n12 = 255;
        int n13 = 1;
        int n14 = 0;
        int n15 = 0;
        while (n9 <= n10) {
            int n16;
            n8 = 0;
            for (n16 = 0; n16 < n9; ++n16) {
                n8 += Math.abs(sArray[n11 + n16] - sArray[n11 + n9 + n16]);
            }
            int n17 = n13;
            n16 = n14;
            if (n8 * n14 < n13 * n9) {
                n16 = n9;
                n17 = n8;
            }
            n14 = n12;
            int n18 = n15;
            if (n8 * n12 > n15 * n9) {
                n14 = n9;
                n18 = n8;
            }
            ++n9;
            n12 = n14;
            n13 = n17;
            n14 = n16;
            n15 = n18;
        }
        this.u = n13 / n14;
        this.v = n15 / n12;
        return n14;
    }

    private int m(short[] sArray, int n8, double d8, int n9) {
        int n10;
        if (d8 < 0.5) {
            d8 = (double)n9 * d8 / (1.0 - d8) + this.w;
            n10 = (int)Math.round(d8);
            this.w = d8 - (double)n10;
        } else {
            d8 = (double)n9 * (2.0 * d8 - 1.0) / (1.0 - d8) + this.w;
            this.r = n10 = (int)Math.round(d8);
            this.w = d8 - (double)n10;
            n10 = n9;
        }
        short[] sArray2 = this.l;
        int n11 = this.m;
        int n12 = n9 + n10;
        this.l = sArray2 = this.f(sArray2, n11, n12);
        n11 = this.b;
        System.arraycopy(sArray, n8 * n11, sArray2, this.m * n11, n11 * n9);
        ax.Q0.r.p(n10, this.b, this.l, this.m + n9, sArray, n8 + n9, sArray, n8);
        this.m += n12;
        return n10;
    }

    private short n(short[] sArray, int n8, long l8, long l9) {
        short s8 = sArray[n8];
        n8 = sArray[n8 + this.b];
        long l10 = this.q;
        int n9 = this.p;
        long l11 = n9;
        long l12 = (long)(n9 + 1) * l9;
        l8 = l12 - l10 * l8;
        l9 = l12 - l11 * l9;
        return (short)(((long)s8 * l8 + (l9 - l8) * (long)n8) / l9);
    }

    private void o(int n8) {
        int n9 = this.m - n8;
        short[] sArray = this.f(this.n, this.o, n9);
        this.n = sArray;
        short[] sArray2 = this.l;
        int n10 = this.b;
        System.arraycopy(sArray2, n8 * n10, sArray, this.o * n10, n10 * n9);
        this.m = n8;
        this.o += n9;
    }

    private static void p(int n8, int n9, short[] sArray, int n10, short[] sArray2, int n11, short[] sArray3, int n12) {
        for (int i8 = 0; i8 < n9; ++i8) {
            int n13 = n10 * n9 + i8;
            int n14 = n12 * n9 + i8;
            int n15 = n11 * n9 + i8;
            for (int i9 = 0; i9 < n8; ++i9) {
                sArray[n13] = (short)((sArray2[n15] * (n8 - i9) + sArray3[n14] * i9) / n8);
                n13 += n9;
                n15 += n9;
                n14 += n9;
            }
        }
    }

    private boolean q(int n8, int n9) {
        if (n8 != 0 && this.s != 0) {
            if (n9 > n8 * 3) {
                return false;
            }
            return n8 * 2 > this.t * 3;
        }
        return false;
    }

    private void r() {
        int n8 = this.m;
        float f8 = this.c;
        float f9 = this.d;
        double d8 = f8 / f9;
        f8 = this.e * f9;
        if (!(d8 > (double)1.00001f) && !(d8 < (double)0.99999f)) {
            this.d(this.j, 0, this.k);
            this.k = 0;
        } else {
            this.b(d8);
        }
        if (f8 != 1.0f) {
            this.a(f8, n8);
        }
    }

    private void u(int n8) {
        if (n8 == 0) {
            return;
        }
        short[] sArray = this.n;
        int n9 = this.b;
        System.arraycopy(sArray, n8 * n9, sArray, 0, (this.o - n8) * n9);
        this.o -= n8;
    }

    private void v(int n8) {
        int n9 = this.k - n8;
        short[] sArray = this.j;
        int n10 = this.b;
        System.arraycopy(sArray, n8 * n10, sArray, 0, n10 * n9);
        this.k = n9;
    }

    private int w(short[] sArray, int n8, double d8, int n9) {
        int n10;
        if (d8 >= 2.0) {
            d8 = (double)n9 / (d8 - 1.0) + this.w;
            n10 = (int)Math.round(d8);
            this.w = d8 - (double)n10;
        } else {
            d8 = (double)n9 * (2.0 - d8) / (d8 - 1.0) + this.w;
            this.r = n10 = (int)Math.round(d8);
            this.w = d8 - (double)n10;
            n10 = n9;
        }
        short[] sArray2 = this.f(this.l, this.m, n10);
        this.l = sArray2;
        ax.Q0.r.p(n10, this.b, sArray2, this.m, sArray, n8, sArray, n8 + n9);
        this.m += n10;
        return n10;
    }

    public void i() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0.0;
    }

    public void j(ShortBuffer object) {
        int n8;
        boolean bl = this.m >= 0;
        ax.S0.a.g(bl);
        int n9 = Math.min(((Buffer)object).remaining() / this.b, this.m);
        ((ShortBuffer)object).put(this.l, 0, this.b * n9);
        this.m = n8 = this.m - n9;
        object = this.l;
        int n10 = this.b;
        System.arraycopy(object, n9 * n10, object, 0, n8 * n10);
    }

    public int k() {
        boolean bl = this.m >= 0;
        ax.S0.a.g(bl);
        return this.m * this.b * 2;
    }

    public int l() {
        return this.k * this.b * 2;
    }

    public void s() {
        int n8;
        int n9;
        int n10 = this.k;
        float f8 = this.c;
        float f9 = this.d;
        double d8 = f8 / f9;
        double d9 = this.e * f9;
        int n11 = this.r;
        int n12 = this.m + (int)(((double)(n10 - n11) / d8 + (double)n11 + this.w + (double)this.o) / d9 + 0.5);
        this.w = 0.0;
        this.j = this.f(this.j, n10, this.h * 2 + n10);
        for (n11 = 0; n11 < (n9 = this.h) * 2 * (n8 = this.b); ++n11) {
            this.j[n8 * n10 + n11] = 0;
        }
        this.k += n9 * 2;
        this.r();
        if (this.m > n12) {
            this.m = Math.max(n12, 0);
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int n8 = shortBuffer.remaining();
        int n9 = this.b;
        short[] sArray = this.f(this.j, this.k, n8 /= n9);
        this.j = sArray;
        shortBuffer.get(sArray, this.k * this.b, n9 * n8 * 2 / 2);
        this.k += n8;
        this.r();
    }
}

