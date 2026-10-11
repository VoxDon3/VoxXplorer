/*
 * Decompiled with CFR 0.152.
 */
package ax.Y4;

import ax.Y4.b;

public final class a {
    public final int a;
    private final byte[] b = new byte[24];
    private int c;

    private a() {
        this.a = 24;
    }

    private void a(int n8) {
        int n9;
        byte[] byArray = this.b;
        this.c = n9 = this.c + 1;
        byArray[n9] = (byte)n8;
    }

    private void b(int n8) {
        int n9 = this.q(n8);
        for (n8 = 0; n8 < 8; ++n8) {
            this.c((n9 *= 10) >>> 28);
            n9 &= 0xFFFFFFF;
        }
    }

    private void c(int n8) {
        int n9;
        byte[] byArray = this.b;
        this.c = n9 = this.c + 1;
        byArray[n9] = (byte)(n8 + 48);
    }

    private String d() {
        return new String(this.b, 0, 0, this.c + 1);
    }

    private void e(int n8) {
        this.a(69);
        int n9 = n8;
        if (n8 < 0) {
            this.a(45);
            n9 = -n8;
        }
        if (n9 < 10) {
            this.c(n9);
            return;
        }
        n8 = n9;
        if (n9 >= 100) {
            n8 = n9 * 1311 >>> 17;
            this.c(n8);
            n8 = n9 - n8 * 100;
        }
        n9 = n8 * 103 >>> 10;
        this.c(n9);
        this.c(n8 - n9 * 10);
    }

    private void f(int n8) {
        if (n8 != 0) {
            this.b(n8);
        }
        this.g();
    }

    private void g() {
        int n8;
        byte[] byArray;
        byte by;
        while ((by = (byArray = this.b)[n8 = this.c]) == 48) {
            this.c = n8 - 1;
        }
        if (by == 46) {
            this.c = n8 + 1;
        }
    }

    private static long h(long l8, long l9, long l10) {
        long l11 = ax.Y4.b.f(l9, l10);
        l9 = ax.Y4.b.f(l8, l10);
        l8 = (l8 * l10 >>> 1) + l11;
        return l9 + (l8 >>> 63) | (l8 & Long.MAX_VALUE) + Long.MAX_VALUE >>> 63;
    }

    private int i(long l8, int n8) {
        int n9;
        int n10 = n9 = ax.Y4.b.a(64 - Long.numberOfLeadingZeros(l8));
        if (l8 >= ax.Y4.b.g(n9)) {
            n10 = n9 + 1;
        }
        int n11 = n8 + n10;
        long l9 = ax.Y4.b.f(l8 *= ax.Y4.b.g(17 - n10), 193428131138340668L) >>> 20;
        n8 = (int)(l8 - 100000000L * l9);
        n10 = (int)(1441151881L * l9 >>> 57);
        n9 = (int)(l9 - (long)(100000000 * n10));
        if (n11 > 0 && n11 <= 7) {
            return this.j(n10, n9, n8, n11);
        }
        if (-3 < n11 && n11 <= 0) {
            return this.k(n10, n9, n8, n11);
        }
        return this.l(n10, n9, n8, n11);
    }

    private int j(int n8, int n9, int n10, int n11) {
        this.c(n8);
        n9 = this.q(n9);
        for (n8 = 1; n8 < n11; ++n8) {
            this.c((n9 *= 10) >>> 28);
            n9 &= 0xFFFFFFF;
        }
        this.a(46);
        while (n8 <= 8) {
            this.c((n9 *= 10) >>> 28);
            n9 &= 0xFFFFFFF;
            ++n8;
        }
        this.f(n10);
        return 0;
    }

    private int k(int n8, int n9, int n10, int n11) {
        this.c(0);
        this.a(46);
        while (n11 < 0) {
            this.c(0);
            ++n11;
        }
        this.c(n8);
        this.b(n9);
        this.f(n10);
        return 0;
    }

    private int l(int n8, int n9, int n10, int n11) {
        this.c(n8);
        this.a(46);
        this.b(n9);
        this.f(n10);
        this.e(n11 - 1);
        return 0;
    }

    private int m(double d8) {
        long l8 = Double.doubleToRawLongBits(d8);
        long l9 = 0xFFFFFFFFFFFFFL & l8;
        int n8 = (int)(l8 >>> 52) & 0x7FF;
        if (n8 < 2047) {
            this.c = -1;
            long l10 = l8 - 0L;
            long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
            if (l11 < 0) {
                this.a(45);
            }
            int n9 = 1;
            if (n8 != 0) {
                l11 = 1075 - n8;
                l9 |= 0x10000000000000L;
                n8 = l11 > 0 ? 1 : 0;
                if (l11 >= 53) {
                    n9 = 0;
                }
                if ((n9 & n8) != 0 && (l8 = l9 >> l11) << l11 == l9) {
                    return this.i(l8, 0);
                }
                return this.n((int)(-l11), l9, 0);
            }
            if (l9 != 0L) {
                if (l9 < 3L) {
                    return this.n(-1074, l9 * 10L, -1);
                }
                return this.n(-1074, l9, 0);
            }
            if (l11 == false) {
                return 1;
            }
            return 2;
        }
        if (l9 != 0L) {
            return 5;
        }
        if (l8 > 0L) {
            return 3;
        }
        return 4;
    }

    private int n(int n8, long l8, int n9) {
        long l9;
        int n10;
        int n11 = (int)l8 & 1;
        long l10 = l8 << 2;
        int n12 = 0;
        int n13 = l8 != 0x10000000000000L ? 1 : 0;
        if (n13 | (n10 = n8 == -1074 ? 1 : 0)) {
            l8 = l10 - 2L;
            n13 = ax.Y4.b.a(n8);
        } else {
            l8 = l10 - 1L;
            n13 = ax.Y4.b.b(n8);
        }
        n8 = n8 + ax.Y4.b.c(-n13) + 2;
        long l11 = ax.Y4.b.e(n13);
        long l12 = ax.Y4.b.d(n13);
        long l13 = ax.Y4.a.h(l11, l12, l10 << n8);
        long l14 = ax.Y4.a.h(l11, l12, l8 << n8);
        l12 = ax.Y4.a.h(l11, l12, l10 + 2L << n8);
        l8 = l13 >> 2;
        if (l8 >= 100L && (n8 = l14 + (l9 = (long)n11) <= (l11 = ax.Y4.b.f(l8, 1844674407370955168L) * 10L) << 2 ? 1 : 0) != (n10 = ((l10 = l11 + 10L) << 2) + l9 <= l12 ? 1 : 0)) {
            l8 = n8 != 0 ? l11 : l10;
            return this.i(l8, n13);
        }
        l10 = l8 + 1L;
        l11 = n11;
        n8 = l14 + l11 <= l8 << 2 ? 1 : 0;
        n10 = n12;
        if ((l10 << 2) + l11 <= l12) {
            n10 = 1;
        }
        if (n8 != n10) {
            if (n8 == 0) {
                l8 = l10;
            }
            return this.i(l8, n13 + n9);
        }
        long l15 = l13 - (l8 + l10 << 1) - 0L;
        n8 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        l11 = l8;
        if (n8 >= 0) {
            l11 = n8 == 0 && (l8 & 1L) == 0L ? l8 : l10;
        }
        return this.i(l11, n13 + n9);
    }

    private String o(double d8) {
        int n8 = this.m(d8);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            return "NaN";
                        }
                        return "-Infinity";
                    }
                    return "Infinity";
                }
                return "-0.0";
            }
            return "0.0";
        }
        return this.d();
    }

    public static String p(double d8) {
        return new a().o(d8);
    }

    private int q(int n8) {
        return (int)(ax.Y4.b.f((long)(n8 + 1) << 28, 193428131138340668L) >>> 20) - 1;
    }
}

