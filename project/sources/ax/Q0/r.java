package ax.Q0;

import ax.S0.C0968a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
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

    public r(int i, int i2, float f, float f2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        this.j = new short[i5 * i2];
        this.l = new short[i5 * i2];
        this.n = new short[i5 * i2];
    }

    private void a(float f, int i) {
        int i2;
        int i3;
        if (this.m == i) {
            return;
        }
        int i4 = this.a;
        long j = (long) (i4 / f);
        long j2 = i4;
        while (j != 0 && j2 != 0 && j % 2 == 0 && j2 % 2 == 0) {
            j /= 2;
            j2 /= 2;
        }
        o(i);
        int i5 = 0;
        while (true) {
            int i6 = this.o;
            if (i5 >= i6 - 1) {
                u(i6 - 1);
                return;
            }
            while (true) {
                i2 = this.p;
                long j3 = (i2 + 1) * j;
                i3 = this.q;
                if (j3 <= i3 * j2) {
                    break;
                }
                this.l = f(this.l, this.m, 1);
                int i7 = 0;
                while (true) {
                    int i8 = this.b;
                    if (i7 < i8) {
                        this.l[(this.m * i8) + i7] = n(this.n, (i8 * i5) + i7, j2, j);
                        i7++;
                    }
                }
                this.q++;
                this.m++;
            }
            int i9 = i2 + 1;
            this.p = i9;
            if (i9 == j2) {
                this.p = 0;
                C0968a.g(((long) i3) == j);
                this.q = 0;
            }
            i5++;
        }
    }

    private void b(double d) {
        r rVar;
        double d2;
        int i = this.k;
        if (i < this.h) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (this.r > 0) {
                i2 += c(i2);
                rVar = this;
                d2 = d;
            } else {
                int g = g(this.j, i2);
                if (d > 1.0d) {
                    rVar = this;
                    d2 = d;
                    i2 += g + rVar.w(this.j, i2, d2, g);
                } else {
                    rVar = this;
                    d2 = d;
                    i2 += rVar.m(rVar.j, i2, d2, g);
                }
            }
            if (rVar.h + i2 > i) {
                v(i2);
                return;
            }
            d = d2;
        }
    }

    private int c(int i) {
        int min = Math.min(this.h, this.r);
        d(this.j, i, min);
        this.r -= min;
        return min;
    }

    private void d(short[] sArr, int i, int i2) {
        short[] f = f(this.l, this.m, i2);
        this.l = f;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, f, this.m * i3, i3 * i2);
        this.m += i2;
    }

    private void e(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    private short[] f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private int g(short[] sArr, int i) {
        int i2;
        int i3 = this.a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.b == 1 && i4 == 1) {
            i2 = h(sArr, i, this.f, this.g);
        } else {
            e(sArr, i, i4);
            int h = h(this.i, 0, this.f / i4, this.g / i4);
            if (i4 != 1) {
                int i5 = h * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.b == 1) {
                    i2 = h(sArr, i, i7, i8);
                } else {
                    e(sArr, i, 1);
                    i2 = h(this.i, 0, i7, i8);
                }
            } else {
                i2 = h;
            }
        }
        int i11 = q(this.u, this.v) ? this.s : i2;
        this.t = this.u;
        this.s = i2;
        return i11;
    }

    private int h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    private int m(short[] sArr, int i, double d, int i2) {
        int i3;
        if (d < 0.5d) {
            double d2 = ((i2 * d) / (1.0d - d)) + this.w;
            int round = (int) Math.round(d2);
            this.w = d2 - round;
            i3 = round;
        } else {
            double d3 = ((i2 * ((2.0d * d) - 1.0d)) / (1.0d - d)) + this.w;
            int round2 = (int) Math.round(d3);
            this.r = round2;
            this.w = d3 - round2;
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] f = f(this.l, this.m, i4);
        this.l = f;
        int i5 = this.b;
        System.arraycopy(sArr, i * i5, f, this.m * i5, i5 * i2);
        p(i3, this.b, this.l, this.m + i2, sArr, i + i2, sArr, i);
        this.m += i4;
        return i3;
    }

    private short n(short[] sArr, int i, long j, long j2) {
        short s = sArr[i];
        short s2 = sArr[i + this.b];
        long j3 = this.q * j;
        long j4 = this.p * j2;
        long j5 = (r7 + 1) * j2;
        long j6 = j5 - j3;
        long j7 = j5 - j4;
        return (short) (((s * j6) + ((j7 - j6) * s2)) / j7);
    }

    private void o(int i) {
        int i2 = this.m - i;
        short[] f = f(this.n, this.o, i2);
        this.n = f;
        short[] sArr = this.l;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, f, this.o * i3, i3 * i2);
        this.m = i;
        this.o += i2;
    }

    private static void p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    private boolean q(int i, int i2) {
        return i != 0 && this.s != 0 && i2 <= i * 3 && i * 2 > this.t * 3;
    }

    private void r() {
        int i = this.m;
        float f = this.c;
        float f2 = this.d;
        double d = f / f2;
        float f3 = this.e * f2;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            b(d);
        } else {
            d(this.j, 0, this.k);
            this.k = 0;
        }
        if (f3 != 1.0f) {
            a(f3, i);
        }
    }

    private void u(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.n;
        int i2 = this.b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.o - i) * i2);
        this.o -= i;
    }

    private void v(int i) {
        int i2 = this.k - i;
        short[] sArr = this.j;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.k = i2;
    }

    private int w(short[] sArr, int i, double d, int i2) {
        int i3;
        if (d >= 2.0d) {
            double d2 = (i2 / (d - 1.0d)) + this.w;
            int round = (int) Math.round(d2);
            this.w = d2 - round;
            i3 = round;
        } else {
            double d3 = ((i2 * (2.0d - d)) / (d - 1.0d)) + this.w;
            int round2 = (int) Math.round(d3);
            this.r = round2;
            this.w = d3 - round2;
            i3 = i2;
        }
        short[] f = f(this.l, this.m, i3);
        this.l = f;
        p(i3, this.b, f, this.m, sArr, i, sArr, i + i2);
        this.m += i3;
        return i3;
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
        this.w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        C0968a.g(this.m >= 0);
        int min = Math.min(shortBuffer.remaining() / this.b, this.m);
        shortBuffer.put(this.l, 0, this.b * min);
        int i = this.m - min;
        this.m = i;
        short[] sArr = this.l;
        int i2 = this.b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public int k() {
        C0968a.g(this.m >= 0);
        return this.m * this.b * 2;
    }

    public int l() {
        return this.k * this.b * 2;
    }

    public void s() {
        int i;
        int i2 = this.k;
        float f = this.c;
        float f2 = this.d;
        double d = f / f2;
        int i3 = this.m + ((int) (((((((i2 - r5) / d) + this.r) + this.w) + this.o) / (this.e * f2)) + 0.5d));
        this.w = 0.0d;
        this.j = f(this.j, i2, (this.h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.h;
            int i5 = this.b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.k += i * 2;
        r();
        if (this.m > i3) {
            this.m = Math.max(i3, 0);
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.b;
        int i2 = remaining / i;
        short[] f = f(this.j, this.k, i2);
        this.j = f;
        shortBuffer.get(f, this.k * this.b, ((i * i2) * 2) / 2);
        this.k += i2;
        r();
    }
}
