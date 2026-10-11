/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.F5;
import ax.b6.L5;
import ax.b6.X4;
import ax.b6.l5;
import ax.b6.s4;
import ax.b6.t4;
import ax.b6.v3;
import java.io.IOException;

final class w3 {
    static double a(byte[] byArray, int n8) {
        return Double.longBitsToDouble(w3.r(byArray, n8));
    }

    static int b(int n8, byte[] byArray, int n9, int n10, v3 v32) throws s4 {
        if (n8 >>> 3 != 0) {
            int n11 = n8 & 7;
            if (n11 != 0) {
                if (n11 != 1) {
                    if (n11 != 2) {
                        if (n11 != 3) {
                            if (n11 == 5) {
                                return n9 + 4;
                            }
                            throw s4.b();
                        }
                        int n12 = n8 & 0xFFFFFFF8 | 4;
                        n8 = 0;
                        while (true) {
                            n11 = n8;
                            n8 = n9;
                            if (n9 >= n10) break;
                            int n13 = w3.p(byArray, n9, v32);
                            n11 = n9 = v32.a;
                            n8 = n13;
                            if (n9 == n12) break;
                            n11 = w3.b(n9, byArray, n13, n10, v32);
                            n8 = n9;
                            n9 = n11;
                        }
                        if (n8 <= n10 && n11 == n12) {
                            return n8;
                        }
                        throw s4.e();
                    }
                    return w3.p(byArray, n9, v32) + v32.a;
                }
                return n9 + 8;
            }
            return w3.q(byArray, n9, v32);
        }
        throw s4.b();
    }

    static int c(int n8, byte[] byArray, int n9, int n10, t4<?> n42, v3 v32) {
        n42 = n42;
        n9 = w3.p(byArray, n9, v32);
        n42.i(v32.a);
        while (n9 < n10) {
            int n11 = w3.p(byArray, n9, v32);
            if (n8 != v32.a) break;
            n9 = w3.p(byArray, n11, v32);
            n42.i(v32.a);
        }
        return n9;
    }

    static int d(int n8, byte[] byArray, int n9, int n10, F5 f52, v3 v32) throws s4 {
        if (n8 >>> 3 != 0) {
            int n11 = n8 & 7;
            if (n11 != 0) {
                if (n11 != 1) {
                    if (n11 != 2) {
                        int n12;
                        if (n11 != 3) {
                            if (n11 == 5) {
                                f52.e(n8, w3.o(byArray, n9));
                                return n9 + 4;
                            }
                            throw s4.b();
                        }
                        F5 f53 = F5.l();
                        int n13 = n8 & 0xFFFFFFF8 | 4;
                        n11 = 0;
                        while (true) {
                            n12 = n9;
                            if (n9 >= n10) break;
                            n12 = w3.p(byArray, n9, v32);
                            n11 = v32.a;
                            if (n11 == n13) break;
                            n9 = w3.d(n11, byArray, n12, n10, f53, v32);
                        }
                        if (n12 <= n10 && n11 == n13) {
                            f52.e(n8, f53);
                            return n12;
                        }
                        throw s4.e();
                    }
                    n9 = w3.p(byArray, n9, v32);
                    n10 = v32.a;
                    if (n10 >= 0) {
                        if (n10 <= byArray.length - n9) {
                            if (n10 == 0) {
                                f52.e(n8, B3.c0);
                            } else {
                                f52.e(n8, B3.p(byArray, n9, n10));
                            }
                            return n9 + n10;
                        }
                        throw s4.f();
                    }
                    throw s4.d();
                }
                f52.e(n8, w3.r(byArray, n9));
                return n9 + 8;
            }
            n9 = w3.q(byArray, n9, v32);
            f52.e(n8, v32.b);
            return n9;
        }
        throw s4.b();
    }

    static int e(int n8, byte[] byArray, int n9, v3 v32) {
        int n10 = n8 & 0x7F;
        int n11 = n9 + 1;
        n8 = byArray[n9];
        if (n8 >= 0) {
            v32.a = n10 | n8 << 7;
            return n11;
        }
        n10 |= (n8 & 0x7F) << 7;
        n8 = n9 + 2;
        if ((n11 = byArray[n11]) >= 0) {
            v32.a = n10 | n11 << 14;
            return n8;
        }
        n11 = n10 | (n11 & 0x7F) << 14;
        n10 = n9 + 3;
        if ((n8 = byArray[n8]) >= 0) {
            v32.a = n11 | n8 << 21;
            return n10;
        }
        n11 |= (n8 & 0x7F) << 21;
        n8 = n9 + 4;
        if ((n10 = byArray[n10]) >= 0) {
            v32.a = n11 | n10 << 28;
            return n8;
        }
        while (true) {
            n9 = n8 + 1;
            if (byArray[n8] >= 0) {
                v32.a = n11 | (n10 & 0x7F) << 28;
                return n9;
            }
            n8 = n9;
        }
    }

    static int f(l5<?> l52, int n8, byte[] byArray, int n9, int n10, t4<?> t42, v3 v32) throws IOException {
        n9 = w3.h(l52, byArray, n9, n10, v32);
        t42.add(v32.c);
        while (n9 < n10) {
            int n11 = w3.p(byArray, n9, v32);
            if (n8 != v32.a) break;
            n9 = w3.h(l52, byArray, n11, n10, v32);
            t42.add(v32.c);
        }
        return n9;
    }

    static int g(l5 l52, byte[] byArray, int n8, int n9, int n10, v3 v32) throws IOException {
        Object t8 = l52.a();
        n8 = w3.i(t8, l52, byArray, n8, n9, n10, v32);
        l52.e(t8);
        v32.c = t8;
        return n8;
    }

    static int h(l5 l52, byte[] byArray, int n8, int n9, v3 v32) throws IOException {
        Object t8 = l52.a();
        n8 = w3.j(t8, l52, byArray, n8, n9, v32);
        l52.e(t8);
        v32.c = t8;
        return n8;
    }

    static int i(Object object, l5 l52, byte[] byArray, int n8, int n9, int n10, v3 v32) throws IOException {
        n8 = ((X4)l52).m(object, byArray, n8, n9, n10, v32);
        v32.c = object;
        return n8;
    }

    static int j(Object object, l5 l52, byte[] byArray, int n8, int n9, v3 v32) throws IOException {
        int n10 = n8 + 1;
        int n11 = byArray[n8];
        n8 = n10;
        int n12 = n11;
        if (n11 < 0) {
            n8 = w3.e(n11, byArray, n10, v32);
            n12 = v32.a;
        }
        if (n12 >= 0 && n12 <= n9 - n8) {
            n9 = n8 + n12;
            l52.h(object, byArray, n8, n9, v32);
            v32.c = object;
            return n9;
        }
        throw s4.f();
    }

    static int k(byte[] byArray, int n8, v3 v32) throws s4 {
        int n9 = w3.p(byArray, n8, v32);
        n8 = v32.a;
        if (n8 >= 0) {
            if (n8 <= byArray.length - n9) {
                if (n8 == 0) {
                    v32.c = B3.c0;
                    return n9;
                }
                v32.c = B3.p(byArray, n9, n8);
                return n9 + n8;
            }
            throw s4.f();
        }
        throw s4.d();
    }

    static int l(byte[] byArray, int n8, t4<?> n42, v3 v32) throws IOException {
        n42 = n42;
        n8 = w3.p(byArray, n8, v32);
        int n9 = v32.a + n8;
        while (n8 < n9) {
            n8 = w3.p(byArray, n8, v32);
            n42.i(v32.a);
        }
        if (n8 == n9) {
            return n8;
        }
        throw s4.f();
    }

    static float m(byte[] byArray, int n8) {
        return Float.intBitsToFloat(w3.o(byArray, n8));
    }

    static int n(byte[] byArray, int n8, v3 v32) throws s4 {
        int n9 = w3.p(byArray, n8, v32);
        n8 = v32.a;
        if (n8 >= 0) {
            if (n8 == 0) {
                v32.c = "";
                return n9;
            }
            v32.c = L5.d(byArray, n9, n8);
            return n9 + n8;
        }
        throw s4.d();
    }

    static int o(byte[] byArray, int n8) {
        byte by = byArray[n8];
        byte by2 = byArray[n8 + 1];
        byte by3 = byArray[n8 + 2];
        return (byArray[n8 + 3] & 0xFF) << 24 | (by & 0xFF | (by2 & 0xFF) << 8 | (by3 & 0xFF) << 16);
    }

    static int p(byte[] byArray, int n8, v3 v32) {
        int n9 = n8 + 1;
        if ((n8 = byArray[n8]) >= 0) {
            v32.a = n8;
            return n9;
        }
        return w3.e(n8, byArray, n9, v32);
    }

    static int q(byte[] byArray, int n8, v3 v32) {
        int n9 = n8 + 1;
        long l8 = byArray[n8];
        if (l8 >= 0L) {
            v32.b = l8;
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
        v32.b = l8;
        return n8;
    }

    static long r(byte[] byArray, int n8) {
        long l8 = byArray[n8];
        long l9 = byArray[n8 + 1];
        long l10 = byArray[n8 + 2];
        long l11 = byArray[n8 + 3];
        long l12 = byArray[n8 + 4];
        long l13 = byArray[n8 + 5];
        long l14 = byArray[n8 + 6];
        return ((long)byArray[n8 + 7] & 0xFFL) << 56 | (l8 & 0xFFL | (l9 & 0xFFL) << 8 | (l10 & 0xFFL) << 16 | (l11 & 0xFFL) << 24 | (l12 & 0xFFL) << 32 | (l13 & 0xFFL) << 40 | (l14 & 0xFFL) << 48);
    }
}

