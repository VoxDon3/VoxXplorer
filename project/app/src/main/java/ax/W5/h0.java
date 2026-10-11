/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.K0;
import ax.W5.M0;
import ax.W5.O1;
import ax.W5.P0;
import ax.W5.g0;
import ax.W5.n1;
import ax.W5.t0;
import ax.W5.v1;
import java.io.IOException;

final class h0 {
    static int a(byte[] byArray, int n8, g0 g02) throws P0 {
        int n9 = h0.h(byArray, n8, g02);
        n8 = g02.a;
        if (n8 >= 0) {
            if (n8 <= byArray.length - n9) {
                if (n8 == 0) {
                    g02.c = t0.c0;
                    return n9;
                }
                g02.c = t0.r(byArray, n9, n8);
                return n9 + n8;
            }
            throw P0.f();
        }
        throw P0.c();
    }

    static int b(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return (byArray[n8 + 3] & 0xFF) << 24 | ((by2 & 0xFF) << 8 | by & 0xFF | (by3 & 0xFF) << 16);
    }

    static int c(v1 v12, byte[] byArray, int n8, int n9, int n10, g0 g02) throws IOException {
        Object object = v12.e();
        n8 = h0.l(object, v12, byArray, n8, n9, n10, g02);
        v12.c(object);
        g02.c = object;
        return n8;
    }

    static int d(v1 v12, byte[] byArray, int n8, int n9, g0 g02) throws IOException {
        Object object = v12.e();
        n8 = h0.m(object, v12, byArray, n8, n9, g02);
        v12.c(object);
        g02.c = object;
        return n8;
    }

    static int e(v1 v12, int n8, byte[] byArray, int n9, int n10, M0 m02, g0 g02) throws IOException {
        n9 = h0.d(v12, byArray, n9, n10, g02);
        m02.add(g02.c);
        while (n9 < n10) {
            int n11 = h0.h(byArray, n9, g02);
            if (n8 != g02.a) break;
            n9 = h0.d(v12, byArray, n11, n10, g02);
            m02.add(g02.c);
        }
        return n9;
    }

    static int f(byte[] byArray, int n8, M0 m02, g0 g02) throws IOException {
        m02 = (K0)m02;
        n8 = h0.h(byArray, n8, g02);
        int n9 = g02.a + n8;
        while (n8 < n9) {
            n8 = h0.h(byArray, n8, g02);
            ((K0)m02).g(g02.a);
        }
        if (n8 == n9) {
            return n8;
        }
        throw P0.f();
    }

    static int g(int n8, byte[] byArray, int n9, int n10, O1 o12, g0 g02) throws P0 {
        if (n8 >>> 3 != 0) {
            int n11 = n8 & 7;
            if (n11 != 0) {
                if (n11 != 1) {
                    if (n11 != 2) {
                        int n12;
                        if (n11 != 3) {
                            if (n11 == 5) {
                                o12.h(n8, h0.b(byArray, n9));
                                return n9 + 4;
                            }
                            throw P0.a();
                        }
                        int n13 = n8 & 0xFFFFFFF8 | 4;
                        O1 o13 = O1.d();
                        n11 = 0;
                        while (true) {
                            n12 = n9;
                            if (n9 >= n10) break;
                            n12 = h0.h(byArray, n9, g02);
                            n11 = g02.a;
                            if (n11 == n13) break;
                            n9 = h0.g(n11, byArray, n12, n10, o13, g02);
                        }
                        if (n12 <= n10 && n11 == n13) {
                            o12.h(n8, o13);
                            return n12;
                        }
                        throw P0.d();
                    }
                    n9 = h0.h(byArray, n9, g02);
                    n10 = g02.a;
                    if (n10 >= 0) {
                        if (n10 <= byArray.length - n9) {
                            if (n10 == 0) {
                                o12.h(n8, t0.c0);
                            } else {
                                o12.h(n8, t0.r(byArray, n9, n10));
                            }
                            return n9 + n10;
                        }
                        throw P0.f();
                    }
                    throw P0.c();
                }
                o12.h(n8, h0.n(byArray, n9));
                return n9 + 8;
            }
            n9 = h0.k(byArray, n9, g02);
            o12.h(n8, g02.b);
            return n9;
        }
        throw P0.a();
    }

    static int h(byte[] byArray, int n8, g0 g02) {
        int n9 = n8 + 1;
        if ((n8 = byArray[n8]) >= 0) {
            g02.a = n8;
            return n9;
        }
        return h0.i(n8, byArray, n9, g02);
    }

    static int i(int n8, byte[] byArray, int n9, g0 g02) {
        int n10 = byArray[n9];
        int n11 = n9 + 1;
        n8 &= 0x7F;
        if (n10 >= 0) {
            g02.a = n8 | n10 << 7;
            return n11;
        }
        n10 = n8 | (n10 & 0x7F) << 7;
        n8 = n9 + 2;
        if ((n11 = byArray[n11]) >= 0) {
            g02.a = n10 | n11 << 14;
            return n8;
        }
        n11 = n10 | (n11 & 0x7F) << 14;
        n10 = n9 + 3;
        if ((n8 = byArray[n8]) >= 0) {
            g02.a = n11 | n8 << 21;
            return n10;
        }
        n11 |= (n8 & 0x7F) << 21;
        n8 = n9 + 4;
        if ((n10 = byArray[n10]) >= 0) {
            g02.a = n11 | n10 << 28;
            return n8;
        }
        while (true) {
            n9 = n8 + 1;
            if (byArray[n8] >= 0) break;
            n8 = n9;
        }
        g02.a = n11 | (n10 & 0x7F) << 28;
        return n9;
    }

    static int j(int n8, byte[] byArray, int n9, int n10, M0 m02, g0 g02) {
        m02 = (K0)m02;
        n9 = h0.h(byArray, n9, g02);
        ((K0)m02).g(g02.a);
        while (n9 < n10) {
            int n11 = h0.h(byArray, n9, g02);
            if (n8 != g02.a) break;
            n9 = h0.h(byArray, n11, g02);
            ((K0)m02).g(g02.a);
        }
        return n9;
    }

    static int k(byte[] byArray, int n8, g0 g02) {
        long l8 = byArray[n8];
        int n9 = n8 + 1;
        if (l8 >= 0L) {
            g02.b = l8;
            return n9;
        }
        n8 += 2;
        byte by = byArray[n9];
        l8 = l8 & 0x7FL | (long)(by & 0x7F) << 7;
        n9 = 7;
        while (by < 0) {
            by = byArray[n8];
            l8 |= (long)(by & 0x7F) << (n9 += 7);
            ++n8;
        }
        g02.b = l8;
        return n8;
    }

    static int l(Object object, v1 v12, byte[] byArray, int n8, int n9, int n10, g0 g02) throws IOException {
        n8 = ((n1)v12).q(object, byArray, n8, n9, n10, g02);
        g02.c = object;
        return n8;
    }

    static int m(Object object, v1 v12, byte[] byArray, int n8, int n9, g0 g02) throws IOException {
        int n10 = n8 + 1;
        int n11 = byArray[n8];
        int n12 = n10;
        n8 = n11;
        if (n11 < 0) {
            n12 = h0.i(n11, byArray, n10, g02);
            n8 = g02.a;
        }
        if (n8 >= 0 && n8 <= n9 - n12) {
            n8 = n12 + n8;
            v12.d(object, byArray, n12, n8, g02);
            g02.c = object;
            return n8;
        }
        throw P0.f();
    }

    static long n(byte[] byArray, int n8) {
        return (long)byArray[n8] & 0xFFL | ((long)byArray[n8 + 1] & 0xFFL) << 8 | ((long)byArray[n8 + 2] & 0xFFL) << 16 | ((long)byArray[n8 + 3] & 0xFFL) << 24 | ((long)byArray[n8 + 4] & 0xFFL) << 32 | ((long)byArray[n8 + 5] & 0xFFL) << 40 | ((long)byArray[n8 + 6] & 0xFFL) << 48 | ((long)byArray[n8 + 7] & 0xFFL) << 56;
    }
}

