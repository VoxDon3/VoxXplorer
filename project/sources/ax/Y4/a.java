package ax.Y4;

/* loaded from: classes.dex */
public final class a {
    public final int a = 24;
    private final byte[] b = new byte[24];
    private int c;

    private a() {
    }

    private void a(int i) {
        byte[] bArr = this.b;
        int i2 = this.c + 1;
        this.c = i2;
        bArr[i2] = (byte) i;
    }

    private void b(int i) {
        int q = q(i);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = q * 10;
            c(i3 >>> 28);
            q = i3 & 268435455;
        }
    }

    private void c(int i) {
        byte[] bArr = this.b;
        int i2 = this.c + 1;
        this.c = i2;
        bArr[i2] = (byte) (i + 48);
    }

    private String d() {
        return new String(this.b, 0, 0, this.c + 1);
    }

    private void e(int i) {
        a(69);
        if (i < 0) {
            a(45);
            i = -i;
        }
        if (i < 10) {
            c(i);
            return;
        }
        if (i >= 100) {
            int i2 = (i * 1311) >>> 17;
            c(i2);
            i -= i2 * 100;
        }
        int i3 = (i * 103) >>> 10;
        c(i3);
        c(i - (i3 * 10));
    }

    private void f(int i) {
        if (i != 0) {
            b(i);
        }
        g();
    }

    private void g() {
        int i;
        byte b;
        while (true) {
            byte[] bArr = this.b;
            i = this.c;
            b = bArr[i];
            if (b != 48) {
                break;
            } else {
                this.c = i - 1;
            }
        }
        if (b == 46) {
            this.c = i + 1;
        }
    }

    private static long h(long j, long j2, long j3) {
        long f = b.f(j2, j3);
        long j4 = j * j3;
        long f2 = b.f(j, j3);
        long j5 = (j4 >>> 1) + f;
        return (f2 + (j5 >>> 63)) | (((j5 & Long.MAX_VALUE) + Long.MAX_VALUE) >>> 63);
    }

    private int i(long j, int i) {
        int a = b.a(64 - Long.numberOfLeadingZeros(j));
        if (j >= b.g(a)) {
            a++;
        }
        long g = j * b.g(17 - a);
        int i2 = i + a;
        long f = b.f(g, 193428131138340668L) >>> 20;
        int i3 = (int) (g - (100000000 * f));
        int i4 = (int) ((1441151881 * f) >>> 57);
        int i5 = (int) (f - (100000000 * i4));
        return (i2 <= 0 || i2 > 7) ? (-3 >= i2 || i2 > 0) ? l(i4, i5, i3, i2) : k(i4, i5, i3, i2) : j(i4, i5, i3, i2);
    }

    private int j(int i, int i2, int i3, int i4) {
        c(i);
        int q = q(i2);
        int i5 = 1;
        while (i5 < i4) {
            int i6 = q * 10;
            c(i6 >>> 28);
            q = i6 & 268435455;
            i5++;
        }
        a(46);
        while (i5 <= 8) {
            int i7 = q * 10;
            c(i7 >>> 28);
            q = i7 & 268435455;
            i5++;
        }
        f(i3);
        return 0;
    }

    private int k(int i, int i2, int i3, int i4) {
        c(0);
        a(46);
        while (i4 < 0) {
            c(0);
            i4++;
        }
        c(i);
        b(i2);
        f(i3);
        return 0;
    }

    private int l(int i, int i2, int i3, int i4) {
        c(i);
        a(46);
        b(i2);
        f(i3);
        e(i4 - 1);
        return 0;
    }

    private int m(double d) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        long j = 4503599627370495L & doubleToRawLongBits;
        int i = ((int) (doubleToRawLongBits >>> 52)) & 2047;
        if (i >= 2047) {
            if (j != 0) {
                return 5;
            }
            return doubleToRawLongBits > 0 ? 3 : 4;
        }
        this.c = -1;
        if (doubleToRawLongBits < 0) {
            a(45);
        }
        if (i == 0) {
            return j != 0 ? j < 3 ? n(-1074, j * 10, -1) : n(-1074, j, 0) : doubleToRawLongBits == 0 ? 1 : 2;
        }
        int i2 = 1075 - i;
        long j2 = j | 4503599627370496L;
        if ((i2 < 53) & (i2 > 0)) {
            long j3 = j2 >> i2;
            if ((j3 << i2) == j2) {
                return i(j3, 0);
            }
        }
        return n(-i2, j2, 0);
    }

    private int n(int i, long j, int i2) {
        long j2;
        int b;
        long j3;
        char c;
        char c2;
        int i3 = ((int) j) & 1;
        long j4 = j << 2;
        long j5 = j4 + 2;
        if ((j != 4503599627370496L) || (i == -1074)) {
            j2 = j4 - 2;
            b = b.a(i);
        } else {
            j2 = j4 - 1;
            b = b.b(i);
        }
        int c3 = i + b.c(-b) + 2;
        long e = b.e(b);
        long d = b.d(b);
        long h = h(e, d, j4 << c3);
        long h2 = h(e, d, j2 << c3);
        long h3 = h(e, d, j5 << c3);
        long j6 = h >> 2;
        if (j6 >= 100) {
            c = 1;
            long f = b.f(j6, 1844674407370955168L) * 10;
            long j7 = f + 10;
            j3 = 1;
            c2 = 2;
            long j8 = i3;
            boolean z = h2 + j8 <= (f << 2);
            if (z != ((j7 << 2) + j8 <= h3)) {
                if (!z) {
                    f = j7;
                }
                return i(f, b);
            }
        } else {
            j3 = 1;
            c = 1;
            c2 = 2;
        }
        long j9 = j6 + j3;
        long j10 = i3;
        boolean z2 = h2 + j10 <= (j6 << c2);
        if (z2 != ((j9 << c2) + j10 <= h3)) {
            if (!z2) {
                j6 = j9;
            }
            return i(j6, b + i2);
        }
        long j11 = h - ((j6 + j9) << c);
        if (j11 >= 0 && (j11 != 0 || (j6 & j3) != 0)) {
            j6 = j9;
        }
        return i(j6, b + i2);
    }

    private String o(double d) {
        int m = m(d);
        return m != 0 ? m != 1 ? m != 2 ? m != 3 ? m != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : "0.0" : d();
    }

    public static String p(double d) {
        return new a().o(d);
    }

    private int q(int i) {
        return ((int) (b.f((i + 1) << 28, 193428131138340668L) >>> 20)) - 1;
    }
}
