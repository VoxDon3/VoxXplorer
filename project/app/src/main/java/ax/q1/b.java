/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.o;
import ax.P0.v;
import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import java.nio.ByteBuffer;

public final class b {
    private static final int[] a = new int[]{1, 2, 3, 6};
    private static final int[] b = new int[]{48000, 44100, 32000};
    private static final int[] c = new int[]{24000, 22050, 16000};
    private static final int[] d = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    private static int a(int n8, int n9, int n10) {
        return n8 * n9 / (n10 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int n8 = byteBuffer.position();
        int n9 = byteBuffer.limit();
        for (int i8 = n8; i8 <= n9 - 10; ++i8) {
            if ((d0.P(byteBuffer, i8 + 4) & 0xFFFFFFFE) != -126718022) continue;
            return i8 - n8;
        }
        return -1;
    }

    private static int c(int n8, int n9) {
        int[] nArray;
        int[] nArray2;
        int n10 = n9 / 2;
        if (n8 >= 0 && n8 < (nArray2 = b).length && n9 >= 0 && n10 < (nArray = f).length) {
            if ((n8 = nArray2[n8]) == 44100) {
                return (nArray[n10] + n9 % 2) * 2;
            }
            n9 = e[n10];
            if (n8 == 32000) {
                return n9 * 6;
            }
            return n9 * 4;
        }
        return -1;
    }

    public static v d(G g8, String string, String string2, o o8) {
        int n8;
        F f8 = new F();
        f8.m(g8);
        int n9 = f8.h(2);
        int n10 = b[n9];
        f8.r(8);
        n9 = n8 = d[f8.h(3)];
        if (f8.h(1) != 0) {
            n9 = n8 + 1;
        }
        n8 = f8.h(5);
        n8 = e[n8] * 1000;
        f8.c();
        g8.b0(f8.d());
        return new v.b().j0(string).y0("audio/ac3").T(n9).z0(n10).c0(o8).n0(string2).S(n8).t0(n8).P();
    }

    public static int e(ByteBuffer byteBuffer) {
        byte by = byteBuffer.get(byteBuffer.position() + 5);
        int n8 = 3;
        if ((by & 0xF8) >> 3 > 10) {
            if ((byteBuffer.get(byteBuffer.position() + 4) & 0xC0) >> 6 != 3) {
                n8 = (byteBuffer.get(byteBuffer.position() + 4) & 0x30) >> 4;
            }
            return a[n8] * 256;
        }
        return 1536;
    }

    /*
     * WARNING - void declaration
     */
    public static b f(F object) {
        int var5_16;
        Object object2;
        int n8;
        int n10;
        int n11;
        int n12 = ((F)object).e();
        ((F)object).r(40);
        int n13 = ((F)object).h(5) > 10 ? 1 : 0;
        ((F)object).p(n12);
        n12 = -1;
        if (n13 != 0) {
            ((F)object).r(16);
            n13 = ((F)object).h(2);
            n13 = n13 != 0 ? (n13 != 1 ? (n13 != 2 ? n12 : 2) : 1) : 0;
            ((F)object).r(3);
            int n14 = (((F)object).h(11) + 1) * 2;
            int n15 = ((F)object).h(2);
            if (n15 == 3) {
                n12 = c[((F)object).h(2)];
                n11 = 3;
                n10 = 6;
            } else {
                n11 = ((F)object).h(2);
                n10 = a[n11];
                n12 = b[n15];
            }
            int n16 = ax.q1.b.a(n14, n12, n10);
            int n17 = ((F)object).h(3);
            int n9 = ((F)object).g();
            n8 = d[n17] + n9;
            ((F)object).r(10);
            if (((F)object).g()) {
                ((F)object).r(8);
            }
            if (n17 == 0) {
                ((F)object).r(5);
                if (((F)object).g()) {
                    ((F)object).r(8);
                }
            }
            if (n13 == 1 && ((F)object).g()) {
                ((F)object).r(16);
            }
            if (((F)object).g()) {
                if (n17 > 2) {
                    ((F)object).r(2);
                }
                if ((n17 & 1) != 0 && n17 > 2) {
                    ((F)object).r(6);
                }
                if ((n17 & 4) != 0) {
                    ((F)object).r(6);
                }
                if (n9 != 0 && ((F)object).g()) {
                    ((F)object).r(5);
                }
                if (n13 == 0) {
                    int n18;
                    if (((F)object).g()) {
                        ((F)object).r(6);
                    }
                    if (n17 == 0 && ((F)object).g()) {
                        ((F)object).r(6);
                    }
                    if (((F)object).g()) {
                        ((F)object).r(6);
                    }
                    if ((n18 = ((F)object).h(2)) == 1) {
                        ((F)object).r(5);
                    } else if (n18 == 2) {
                        ((F)object).r(12);
                    } else if (n18 == 3) {
                        int n19 = ((F)object).h(5);
                        if (((F)object).g()) {
                            ((F)object).r(5);
                            if (((F)object).g()) {
                                ((F)object).r(4);
                            }
                            if (((F)object).g()) {
                                ((F)object).r(4);
                            }
                            if (((F)object).g()) {
                                ((F)object).r(4);
                            }
                            if (((F)object).g()) {
                                ((F)object).r(4);
                            }
                            if (((F)object).g()) {
                                ((F)object).r(4);
                            }
                            if (((F)object).g()) {
                                ((F)object).r(4);
                            }
                            if (((F)object).g()) {
                                ((F)object).r(4);
                            }
                            if (((F)object).g()) {
                                if (((F)object).g()) {
                                    ((F)object).r(4);
                                }
                                if (((F)object).g()) {
                                    ((F)object).r(4);
                                }
                            }
                        }
                        if (((F)object).g()) {
                            ((F)object).r(5);
                            if (((F)object).g()) {
                                ((F)object).r(7);
                                if (((F)object).g()) {
                                    ((F)object).r(8);
                                }
                            }
                        }
                        ((F)object).r((n19 + 2) * 8);
                        ((F)object).c();
                    }
                    if (n17 < 2) {
                        if (((F)object).g()) {
                            ((F)object).r(14);
                        }
                        if (n17 == 0 && ((F)object).g()) {
                            ((F)object).r(14);
                        }
                    }
                    if (((F)object).g()) {
                        if (n11 == 0) {
                            ((F)object).r(5);
                        } else {
                            Object var5_14;
                            boolean bl = false;
                            while (var5_14 < n10) {
                                if (((F)object).g()) {
                                    ((F)object).r(5);
                                }
                                ++var5_14;
                            }
                        }
                    }
                }
            }
            if (((F)object).g()) {
                ((F)object).r(5);
                if (n17 == 2) {
                    ((F)object).r(4);
                }
                if (n17 >= 6) {
                    ((F)object).r(2);
                }
                if (((F)object).g()) {
                    ((F)object).r(8);
                }
                if (n17 == 0 && ((F)object).g()) {
                    ((F)object).r(8);
                }
                if (n15 < 3) {
                    ((F)object).q();
                }
            }
            if (n13 == 0 && n11 != 3) {
                ((F)object).q();
            }
            if (n13 == 2 && (n11 == 3 || ((F)object).g())) {
                ((F)object).r(6);
            }
            object = ((F)object).g() && ((F)object).h(6) == 1 && ((F)object).h(8) == 1 ? "audio/eac3-joc" : "audio/eac3";
            int n20 = n13;
            n10 *= 256;
            n13 = n16;
            object2 = object;
            n11 = n8;
            n8 = n12;
            n12 = n14;
        } else {
            int[] nArray;
            ((F)object).r(32);
            n13 = ((F)object).h(2);
            object2 = n13 == 3 ? null : "audio/ac3";
            n12 = ((F)object).h(6);
            n10 = e[n12 / 2];
            n12 = ax.q1.b.c(n13, n12);
            ((F)object).r(8);
            n11 = ((F)object).h(3);
            if ((n11 & 1) != 0 && n11 != 1) {
                ((F)object).r(2);
            }
            if ((n11 & 4) != 0) {
                ((F)object).r(2);
            }
            if (n11 == 2) {
                ((F)object).r(2);
            }
            n13 = n13 < (nArray = b).length ? nArray[n13] : -1;
            int n21 = ((F)object).g();
            n11 = d[n11] + n21;
            int n18 = n10 * 1000;
            int n22 = -1;
            n10 = 1536;
            n8 = n13;
            n13 = n18;
        }
        return new b((String)object2, (int)var5_16, n11, n8, n12, n10, n13);
    }

    public static int g(byte[] byArray) {
        if (byArray.length < 6) {
            return -1;
        }
        if ((byArray[5] & 0xF8) >> 3 > 10) {
            byte by = byArray[2];
            return ((byArray[3] & 0xFF | (by & 7) << 8) + 1) * 2;
        }
        byte by = byArray[4];
        return ax.q1.b.c((by & 0xC0) >> 6, by & 0x3F);
    }

    /*
     * Unable to fully structure code
     */
    public static v h(G var0, String var1_1, String var2_2, o var3_3) {
        var10_4 = new F();
        var10_4.m(var0);
        var6_5 = var10_4.h(13);
        var10_4.r(3);
        var4_6 = var10_4.h(2);
        var7_7 = ax.q1.b.b[var4_6];
        var10_4.r(10);
        var4_6 = var5_8 = ax.q1.b.d[var10_4.h(3)];
        if (var10_4.h(1) != 0) {
            var4_6 = var5_8 + 1;
        }
        var10_4.r(3);
        var8_9 = var10_4.h(4);
        var10_4.r(1);
        var5_8 = var4_6;
        if (var8_9 > 0) {
            var10_4.r(6);
            var5_8 = var4_6;
            if (var10_4.h(1) != 0) {
                var5_8 = var4_6 + 2;
            }
            var10_4.r(1);
        }
        if (var10_4.b() <= 7) ** GOTO lbl-1000
        var10_4.r(7);
        if (var10_4.h(1) != 0) {
            var9_10 = "audio/eac3-joc";
        } else lbl-1000:
        // 2 sources

        {
            var9_10 = "audio/eac3";
        }
        var10_4.c();
        var0.b0(var10_4.d());
        return new v.b().j0(var1_1).y0(var9_10).T(var5_8).z0(var7_7).c0(var3_3).n0(var2_2).t0(var6_5 * 1000).P();
    }

    public static int i(ByteBuffer byteBuffer, int n8) {
        int n9 = (byteBuffer.get(byteBuffer.position() + n8 + 7) & 0xFF) == 187 ? 1 : 0;
        int n10 = byteBuffer.position();
        n9 = n9 != 0 ? 9 : 8;
        return 40 << (byteBuffer.get(n10 + n8 + n9) >> 4 & 7);
    }

    public static int j(byte[] byArray) {
        byte by = byArray[4];
        int n8 = 0;
        if (by == -8 && byArray[5] == 114 && byArray[6] == 111 && ((by = byArray[7]) & 0xFE) == 186) {
            if ((by & 0xFF) == 187) {
                n8 = 1;
            }
            n8 = n8 != 0 ? 9 : 8;
            return 40 << (byArray[n8] >> 4 & 7);
        }
        return 0;
    }

    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        private b(String string, int n8, int n9, int n10, int n11, int n12, int n13) {
            this.a = string;
            this.b = n8;
            this.d = n9;
            this.c = n10;
            this.e = n11;
            this.f = n12;
            this.g = n13;
        }
    }
}

