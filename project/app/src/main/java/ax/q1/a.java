/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.E;
import ax.S0.F;
import ax.S0.u;

public final class a {
    private static final int[] a = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] b = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int n8, int n9, int n10) {
        return new byte[]{(byte)(n8 << 3 & 0xF8 | n9 >> 1 & 7), (byte)(n9 << 7 & 0x80 | n10 << 3 & 0x78)};
    }

    private static int b(F f8) {
        int n8 = f8.h(5);
        if (n8 == 31) {
            return f8.h(6) + 32;
        }
        return n8;
    }

    private static int c(F f8) throws E {
        int n8 = f8.h(4);
        if (n8 == 15) {
            if (f8.b() >= 24) {
                return f8.h(24);
            }
            throw E.a("AAC header insufficient data", null);
        }
        if (n8 < 13) {
            return a[n8];
        }
        throw E.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(F object, boolean bl) throws E {
        int n8;
        int n9;
        CharSequence charSequence;
        int n10;
        block14: {
            int n11;
            int n12;
            int n13;
            block13: {
                n13 = ax.q1.a.b((F)object);
                n10 = ax.q1.a.c((F)object);
                n12 = ((F)object).h(4);
                charSequence = new StringBuilder();
                charSequence.append("mp4a.40.");
                charSequence.append(n13);
                charSequence = charSequence.toString();
                if (n13 == 5) break block13;
                n9 = n13;
                n8 = n12;
                if (n13 != 29) break block14;
            }
            n13 = ax.q1.a.c((F)object);
            n9 = n11 = ax.q1.a.b((F)object);
            n10 = n13;
            n8 = n12;
            if (n11 == 22) {
                n8 = ((F)object).h(4);
                n10 = n13;
                n9 = n11;
            }
        }
        if (bl) {
            if (n9 != 1 && n9 != 2 && n9 != 3 && n9 != 4 && n9 != 6 && n9 != 7 && n9 != 17) {
                switch (n9) {
                    default: {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Unsupported audio object type: ");
                        ((StringBuilder)object).append(n9);
                        throw E.d(((StringBuilder)object).toString());
                    }
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                }
            }
            ax.q1.a.f((F)object, n9, n8);
            switch (n9) {
                default: {
                    break;
                }
                case 17: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: {
                    n9 = ((F)object).h(2);
                    if (n9 != 2 && n9 != 3) break;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unsupported epConfig: ");
                    ((StringBuilder)object).append(n9);
                    throw E.d(((StringBuilder)object).toString());
                }
            }
        }
        if ((n9 = b[n8]) != -1) {
            return new b(n10, n9, (String)charSequence);
        }
        throw E.a(null, null);
    }

    public static b e(byte[] byArray) throws E {
        return ax.q1.a.d(new F(byArray), false);
    }

    private static void f(F f8, int n8, int n9) {
        if (f8.g()) {
            u.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (f8.g()) {
            f8.r(14);
        }
        boolean bl = f8.g();
        if (n9 != 0) {
            if (n8 == 6 || n8 == 20) {
                f8.r(3);
            }
            if (bl) {
                if (n8 == 22) {
                    f8.r(16);
                }
                if (n8 == 17 || n8 == 19 || n8 == 20 || n8 == 23) {
                    f8.r(3);
                }
                f8.r(1);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static final class b {
        public final int a;
        public final int b;
        public final String c;

        private b(int n8, int n9, String string) {
            this.a = n8;
            this.b = n9;
            this.c = string;
        }
    }
}

