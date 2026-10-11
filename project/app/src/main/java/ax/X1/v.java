/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import ax.P0.E;
import ax.S0.F;
import ax.S0.a;
import ax.t7.d;

final class v {
    private static int a(int n8) throws E {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2 && n8 != 3) {
                    if (n8 == 4) {
                        return 4096;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported coreSbrFrameLengthIndex ");
                    stringBuilder.append(n8);
                    throw E.d(stringBuilder.toString());
                }
                return 2048;
            }
            return 1024;
        }
        return 768;
    }

    private static double b(int n8) throws E {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported sampling rate ");
                stringBuilder.append(n8);
                throw E.d(stringBuilder.toString());
            }
            case 44100: 
            case 48000: 
            case 88200: 
            case 96000: {
                return 1.0;
            }
            case 29400: 
            case 32000: 
            case 58800: 
            case 64000: {
                return 1.5;
            }
            case 22050: 
            case 24000: {
                return 2.0;
            }
            case 14700: 
            case 16000: 
        }
        return 3.0;
    }

    private static int c(int n8) throws E {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported sampling rate index ");
                stringBuilder.append(n8);
                throw E.d(stringBuilder.toString());
            }
            case 27: {
                return 9600;
            }
            case 26: {
                return 12800;
            }
            case 25: {
                return 14400;
            }
            case 24: {
                return 17075;
            }
            case 23: {
                return 19200;
            }
            case 22: {
                return 20000;
            }
            case 21: {
                return 25600;
            }
            case 20: {
                return 28800;
            }
            case 19: {
                return 34150;
            }
            case 18: {
                return 38400;
            }
            case 17: {
                return 40000;
            }
            case 16: {
                return 51200;
            }
            case 15: {
                return 57600;
            }
            case 12: {
                return 7350;
            }
            case 11: {
                return 8000;
            }
            case 10: {
                return 11025;
            }
            case 9: {
                return 12000;
            }
            case 8: {
                return 16000;
            }
            case 7: {
                return 22050;
            }
            case 6: {
                return 24000;
            }
            case 5: {
                return 32000;
            }
            case 4: {
                return 44100;
            }
            case 3: {
                return 48000;
            }
            case 2: {
                return 64000;
            }
            case 1: {
                return 88200;
            }
            case 0: 
        }
        return 96000;
    }

    private static int d(int n8) throws E {
        if (n8 != 0 && n8 != 1) {
            int n9 = 2;
            if (n8 != 2) {
                n9 = 3;
                if (n8 != 3) {
                    if (n8 == 4) {
                        return 1;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported coreSbrFrameLengthIndex ");
                    stringBuilder.append(n8);
                    throw E.d(stringBuilder.toString());
                }
            }
            return n9;
        }
        return 0;
    }

    public static boolean e(int n8) {
        return (n8 & 0xFFFFFF) == 12583333;
    }

    public static int f(F f8) {
        if (f8.g()) {
            f8.r(2);
            return f8.h(13);
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean g(F object, b b8) throws E {
        long l8;
        int n8;
        ((F)object).d();
        b8.a = n8 = v.k((F)object, 3, 8, 8);
        if (n8 == -1) {
            return false;
        }
        b8.b = l8 = v.l((F)object, 2, 8, 32);
        if (l8 == -1L) {
            return false;
        }
        if (l8 <= 16L) {
            if (l8 == 0L) {
                n8 = b8.a;
                if (n8 == 1) throw E.a("Mpegh3daConfig packet with invalid packet label 0", null);
                if (n8 == 2) throw E.a("Mpegh3daFrame packet with invalid packet label 0", null);
                if (n8 == 17) {
                    throw E.a("AudioTruncation packet with invalid packet label 0", null);
                }
            }
            b8.c = n8 = v.k((F)object, 11, 24, 24);
            return n8 != -1;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Contains sub-stream with an invalid packet label ");
        ((StringBuilder)object).append(b8.b);
        throw E.d(((StringBuilder)object).toString());
    }

    public static c h(F f8) throws E {
        int n8 = f8.h(8);
        int n9 = f8.h(5);
        n9 = n9 == 31 ? f8.h(24) : v.c(n9);
        int n10 = f8.h(3);
        int n11 = v.a(n10);
        n10 = v.d(n10);
        f8.r(2);
        v.p(f8);
        v.m(f8, v.j(f8), n10);
        boolean bl = f8.g();
        byte[] byArray = null;
        byte[] byArray2 = null;
        if (bl) {
            int n12 = v.k(f8, 2, 4, 8);
            n10 = 0;
            while (true) {
                byArray = byArray2;
                if (n10 >= n12 + 1) break;
                int n13 = v.k(f8, 4, 8, 16);
                int n14 = v.k(f8, 4, 8, 16);
                if (n13 == 7) {
                    n14 = f8.h(4) + 1;
                    f8.r(4);
                    byArray2 = new byte[n14];
                    for (n13 = 0; n13 < n14; ++n13) {
                        byArray2[n13] = (byte)f8.h(8);
                    }
                } else {
                    f8.r(n14 * 8);
                }
                ++n10;
            }
        }
        double d8 = v.b(n9);
        return new c(n8, (int)((double)n9 * d8), (int)((double)n11 * d8), byArray);
    }

    private static boolean i(F f8) {
        f8.r(3);
        boolean bl = f8.g();
        if (bl) {
            f8.r(13);
        }
        return bl;
    }

    private static int j(F f8) {
        int n8 = f8.h(5);
        int n9 = 0;
        for (int i8 = 0; i8 < n8 + 1; ++i8) {
            int n10 = f8.h(3);
            n9 += v.k(f8, 5, 8, 16) + 1;
            if (n10 != 0 && n10 != 2 || !f8.g()) continue;
            v.p(f8);
        }
        return n9;
    }

    private static int k(F f8, int n8, int n9, int n10) {
        int n11;
        boolean bl = Math.max(Math.max(n8, n9), n10) <= 31;
        a.a(bl);
        int n12 = (1 << n8) - 1;
        int n13 = (1 << n9) - 1;
        ax.t7.c.a(ax.t7.c.a(n12, n13), 1 << n10);
        if (f8.b() < n8) {
            return -1;
        }
        n8 = n11 = f8.h(n8);
        if (n11 == n12) {
            if (f8.b() < n9) {
                return -1;
            }
            n12 = f8.h(n9);
            n8 = n9 = n11 + n12;
            if (n12 == n13) {
                if (f8.b() < n10) {
                    return -1;
                }
                n8 = n9 + f8.h(n10);
            }
        }
        return n8;
    }

    private static long l(F f8, int n8, int n9, int n10) {
        long l8;
        boolean bl = Math.max(Math.max(n8, n9), n10) <= 63;
        a.a(bl);
        long l9 = (1L << n8) - 1L;
        long l10 = (1L << n9) - 1L;
        d.a(d.a(l9, l10), 1L << n10);
        if (f8.b() < n8) {
            return -1L;
        }
        long l11 = l8 = f8.j(n8);
        if (l8 == l9) {
            if (f8.b() < n9) {
                return -1L;
            }
            l9 = f8.j(n9);
            l11 = l8 += l9;
            if (l9 == l10) {
                if (f8.b() < n10) {
                    return -1L;
                }
                l11 = l8 + f8.j(n10);
            }
        }
        return l11;
    }

    private static void m(F f8, int n8, int n9) {
        int n10 = v.k(f8, 4, 8, 16);
        f8.q();
        for (int i8 = 0; i8 < n10 + 1; ++i8) {
            int n11 = f8.h(2);
            if (n11 != 0) {
                int n12;
                if (n11 != 1) {
                    if (n11 != 3) continue;
                    v.k(f8, 4, 8, 16);
                    n11 = v.k(f8, 4, 8, 16);
                    if (f8.g()) {
                        v.k(f8, 8, 16, 0);
                    }
                    f8.q();
                    if (n11 <= 0) continue;
                    f8.r(n11 * 8);
                    continue;
                }
                if (v.i(f8)) {
                    f8.q();
                }
                if (n9 > 0) {
                    v.o(f8);
                    n11 = f8.h(2);
                } else {
                    n11 = 0;
                }
                if (n11 > 0) {
                    f8.r(6);
                    n12 = f8.h(2);
                    f8.r(4);
                    if (f8.g()) {
                        f8.r(5);
                    }
                    if (n11 == 2 || n11 == 3) {
                        f8.r(6);
                    }
                    if (n12 == 2) {
                        f8.q();
                    }
                }
                n11 = (int)Math.floor(Math.log(n8 - 1) / Math.log(2.0)) + 1;
                n12 = f8.h(2);
                if (n12 > 0 && f8.g()) {
                    f8.r(n11);
                }
                if (f8.g()) {
                    f8.r(n11);
                }
                if (n9 != 0 || n12 != 0) continue;
                f8.q();
                continue;
            }
            v.i(f8);
            if (n9 <= 0) continue;
            v.o(f8);
        }
    }

    private static void n(F f8, int n8) {
        boolean bl = f8.g();
        int n9 = 5;
        int n10 = bl ? 1 : 5;
        if (bl) {
            n9 = 7;
        }
        int n11 = bl ? 8 : 6;
        int n12 = 0;
        while (n12 < n8) {
            int n13;
            if (f8.g()) {
                f8.r(7);
                n13 = 0;
            } else {
                if (f8.h(2) == 3 && f8.h(n9) * n10 != 0) {
                    f8.q();
                }
                if ((n13 = f8.h(n11) * n10) != 0 && n13 != 180) {
                    f8.q();
                }
                f8.q();
            }
            int n14 = n12;
            if (n13 != 0) {
                n14 = n12;
                if (n13 != 180) {
                    n14 = n12;
                    if (f8.g()) {
                        n14 = n12 + 1;
                    }
                }
            }
            n12 = n14 + 1;
        }
    }

    private static void o(F f8) {
        f8.r(3);
        f8.r(8);
        boolean bl = f8.g();
        boolean bl2 = f8.g();
        if (bl) {
            f8.r(5);
        }
        if (bl2) {
            f8.r(6);
        }
    }

    private static void p(F f8) {
        int n8 = f8.h(2);
        if (n8 == 0) {
            f8.r(6);
            return;
        }
        int n9 = v.k(f8, 5, 8, 16) + 1;
        if (n8 == 1) {
            f8.r(n9 * 7);
            return;
        }
        if (n8 == 2) {
            v.n(f8, n9);
        }
    }

    public static class b {
        public int a;
        public long b;
        public int c;
    }

    public static class c {
        public final int a;
        public final int b;
        public final int c;
        public final byte[] d;

        private c(int n8, int n9, int n10, byte[] byArray) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = byArray;
        }
    }
}

