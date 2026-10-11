package ax.X1;

import ax.S0.C0968a;

/* loaded from: classes.dex */
final class v {

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

        private c(int i, int i2, int i3, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = bArr;
        }
    }

    private static int a(int i) throws ax.P0.E {
        if (i == 0) {
            return 768;
        }
        if (i == 1) {
            return 1024;
        }
        if (i == 2 || i == 3) {
            return 2048;
        }
        if (i == 4) {
            return 4096;
        }
        throw ax.P0.E.d("Unsupported coreSbrFrameLengthIndex " + i);
    }

    private static double b(int i) throws ax.P0.E {
        switch (i) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw ax.P0.E.d("Unsupported sampling rate " + i);
        }
    }

    private static int c(int i) throws ax.P0.E {
        switch (i) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw ax.P0.E.d("Unsupported sampling rate index " + i);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int d(int i) throws ax.P0.E {
        if (i == 0 || i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                if (i == 4) {
                    return 1;
                }
                throw ax.P0.E.d("Unsupported coreSbrFrameLengthIndex " + i);
            }
        }
        return i2;
    }

    public static boolean e(int i) {
        return (i & 16777215) == 12583333;
    }

    public static int f(ax.S0.F f) {
        if (!f.g()) {
            return 0;
        }
        f.r(2);
        return f.h(13);
    }

    public static boolean g(ax.S0.F f, b bVar) throws ax.P0.E {
        f.d();
        int k = k(f, 3, 8, 8);
        bVar.a = k;
        if (k == -1) {
            return false;
        }
        long l = l(f, 2, 8, 32);
        bVar.b = l;
        if (l == -1) {
            return false;
        }
        if (l > 16) {
            throw ax.P0.E.d("Contains sub-stream with an invalid packet label " + bVar.b);
        }
        if (l == 0) {
            int i = bVar.a;
            if (i == 1) {
                throw ax.P0.E.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i == 2) {
                throw ax.P0.E.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i == 17) {
                throw ax.P0.E.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int k2 = k(f, 11, 24, 24);
        bVar.c = k2;
        return k2 != -1;
    }

    public static c h(ax.S0.F f) throws ax.P0.E {
        int h = f.h(8);
        int h2 = f.h(5);
        int h3 = h2 == 31 ? f.h(24) : c(h2);
        int h4 = f.h(3);
        int a2 = a(h4);
        int d = d(h4);
        f.r(2);
        p(f);
        m(f, j(f), d);
        byte[] bArr = null;
        if (f.g()) {
            int k = k(f, 2, 4, 8) + 1;
            for (int i = 0; i < k; i++) {
                int k2 = k(f, 4, 8, 16);
                int k3 = k(f, 4, 8, 16);
                if (k2 == 7) {
                    int h5 = f.h(4) + 1;
                    f.r(4);
                    byte[] bArr2 = new byte[h5];
                    for (int i2 = 0; i2 < h5; i2++) {
                        bArr2[i2] = (byte) f.h(8);
                    }
                    bArr = bArr2;
                } else {
                    f.r(k3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double b2 = b(h3);
        return new c(h, (int) (h3 * b2), (int) (a2 * b2), bArr3);
    }

    private static boolean i(ax.S0.F f) {
        f.r(3);
        boolean g = f.g();
        if (g) {
            f.r(13);
        }
        return g;
    }

    private static int j(ax.S0.F f) {
        int h = f.h(5);
        int i = 0;
        for (int i2 = 0; i2 < h + 1; i2++) {
            int h2 = f.h(3);
            i += k(f, 5, 8, 16) + 1;
            if ((h2 == 0 || h2 == 2) && f.g()) {
                p(f);
            }
        }
        return i;
    }

    private static int k(ax.S0.F f, int i, int i2, int i3) {
        C0968a.a(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        ax.t7.c.a(ax.t7.c.a(i4, i5), 1 << i3);
        if (f.b() < i) {
            return -1;
        }
        int h = f.h(i);
        if (h != i4) {
            return h;
        }
        if (f.b() < i2) {
            return -1;
        }
        int h2 = f.h(i2);
        int i6 = h + h2;
        if (h2 != i5) {
            return i6;
        }
        if (f.b() < i3) {
            return -1;
        }
        return i6 + f.h(i3);
    }

    private static long l(ax.S0.F f, int i, int i2, int i3) {
        C0968a.a(Math.max(Math.max(i, i2), i3) <= 63);
        long j = (1 << i) - 1;
        long j2 = (1 << i2) - 1;
        ax.t7.d.a(ax.t7.d.a(j, j2), 1 << i3);
        if (f.b() < i) {
            return -1L;
        }
        long j3 = f.j(i);
        if (j3 != j) {
            return j3;
        }
        if (f.b() < i2) {
            return -1L;
        }
        long j4 = f.j(i2);
        long j5 = j3 + j4;
        if (j4 != j2) {
            return j5;
        }
        if (f.b() < i3) {
            return -1L;
        }
        return j5 + f.j(i3);
    }

    private static void m(ax.S0.F f, int i, int i2) {
        int i3;
        int k = k(f, 4, 8, 16) + 1;
        f.q();
        for (int i4 = 0; i4 < k; i4++) {
            int h = f.h(2);
            if (h == 0) {
                i(f);
                if (i2 > 0) {
                    o(f);
                }
            } else if (h == 1) {
                if (i(f)) {
                    f.q();
                }
                if (i2 > 0) {
                    o(f);
                    i3 = f.h(2);
                } else {
                    i3 = 0;
                }
                if (i3 > 0) {
                    f.r(6);
                    int h2 = f.h(2);
                    f.r(4);
                    if (f.g()) {
                        f.r(5);
                    }
                    if (i3 == 2 || i3 == 3) {
                        f.r(6);
                    }
                    if (h2 == 2) {
                        f.q();
                    }
                }
                int floor = ((int) Math.floor(Math.log(i - 1) / Math.log(2.0d))) + 1;
                int h3 = f.h(2);
                if (h3 > 0 && f.g()) {
                    f.r(floor);
                }
                if (f.g()) {
                    f.r(floor);
                }
                if (i2 == 0 && h3 == 0) {
                    f.q();
                }
            } else if (h == 3) {
                k(f, 4, 8, 16);
                int k2 = k(f, 4, 8, 16);
                if (f.g()) {
                    k(f, 8, 16, 0);
                }
                f.q();
                if (k2 > 0) {
                    f.r(k2 * 8);
                }
            }
        }
    }

    private static void n(ax.S0.F f, int i) {
        int h;
        boolean g = f.g();
        int i2 = g ? 1 : 5;
        int i3 = g ? 7 : 5;
        int i4 = g ? 8 : 6;
        int i5 = 0;
        while (i5 < i) {
            if (f.g()) {
                f.r(7);
                h = 0;
            } else {
                if (f.h(2) == 3 && f.h(i3) * i2 != 0) {
                    f.q();
                }
                h = f.h(i4) * i2;
                if (h != 0 && h != 180) {
                    f.q();
                }
                f.q();
            }
            if (h != 0 && h != 180 && f.g()) {
                i5++;
            }
            i5++;
        }
    }

    private static void o(ax.S0.F f) {
        f.r(3);
        f.r(8);
        boolean g = f.g();
        boolean g2 = f.g();
        if (g) {
            f.r(5);
        }
        if (g2) {
            f.r(6);
        }
    }

    private static void p(ax.S0.F f) {
        int h = f.h(2);
        if (h == 0) {
            f.r(6);
            return;
        }
        int k = k(f, 5, 8, 16) + 1;
        if (h == 1) {
            f.r(k * 7);
        } else if (h == 2) {
            n(f, k);
        }
    }
}
