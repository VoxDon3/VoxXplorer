package ax.q1;

import ax.S0.C0987u;

/* renamed from: ax.q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2841a {
    private static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: ax.q1.a$b */
    public static final class b {
        public final int a;
        public final int b;
        public final String c;

        private b(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }
    }

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    private static int b(ax.S0.F f) {
        int h = f.h(5);
        return h == 31 ? f.h(6) + 32 : h;
    }

    private static int c(ax.S0.F f) throws ax.P0.E {
        int h = f.h(4);
        if (h == 15) {
            if (f.b() >= 24) {
                return f.h(24);
            }
            throw ax.P0.E.a("AAC header insufficient data", null);
        }
        if (h < 13) {
            return a[h];
        }
        throw ax.P0.E.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(ax.S0.F f, boolean z) throws ax.P0.E {
        int b2 = b(f);
        int c = c(f);
        int h = f.h(4);
        String str = "mp4a.40." + b2;
        if (b2 == 5 || b2 == 29) {
            c = c(f);
            b2 = b(f);
            if (b2 == 22) {
                h = f.h(4);
            }
        }
        if (z) {
            if (b2 != 1 && b2 != 2 && b2 != 3 && b2 != 4 && b2 != 6 && b2 != 7 && b2 != 17) {
                switch (b2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ax.P0.E.d("Unsupported audio object type: " + b2);
                }
            }
            f(f, b2, h);
            switch (b2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = f.h(2);
                    if (h2 == 2 || h2 == 3) {
                        throw ax.P0.E.d("Unsupported epConfig: " + h2);
                    }
            }
        }
        int i = b[h];
        if (i != -1) {
            return new b(c, i, str);
        }
        throw ax.P0.E.a(null, null);
    }

    public static b e(byte[] bArr) throws ax.P0.E {
        return d(new ax.S0.F(bArr), false);
    }

    private static void f(ax.S0.F f, int i, int i2) {
        if (f.g()) {
            C0987u.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (f.g()) {
            f.r(14);
        }
        boolean g = f.g();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            f.r(3);
        }
        if (g) {
            if (i == 22) {
                f.r(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                f.r(3);
            }
            f.r(1);
        }
    }
}
