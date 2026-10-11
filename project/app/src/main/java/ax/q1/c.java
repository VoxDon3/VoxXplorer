/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.E;
import ax.P0.o;
import ax.P0.v;
import ax.S0.F;
import ax.S0.G;
import ax.S0.d0;
import ax.S0.u;
import java.nio.ByteBuffer;

public final class c {
    private static final int[] a = new int[]{2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    private static String a(int n8, int n9, int n10) {
        return d0.G("ac-4.%02d.%02d.%02d", n8, n9, n10);
    }

    public static void b(int n8, G object) {
        ((G)object).X(7);
        object = ((G)object).f();
        object[0] = -84;
        object[1] = 64;
        object[2] = -1;
        object[3] = -1;
        object[4] = (byte)(n8 >> 16 & 0xFF);
        object[5] = (byte)(n8 >> 8 & 0xFF);
        object[6] = (byte)(n8 & 0xFF);
    }

    private static int c(int n8, boolean bl, int n9) {
        int n10 = c.d(n8);
        if (n8 != 11 && n8 != 12 && n8 != 13 && n8 != 14) {
            return n10;
        }
        n8 = n10;
        if (!bl) {
            n8 = n10 - 2;
        }
        if (n9 != 0) {
            if (n9 != 1) {
                return n8;
            }
            return n8 - 2;
        }
        return n8 - 4;
    }

    private static int d(int n8) {
        switch (n8) {
            default: {
                return -1;
            }
            case 15: {
                return 24;
            }
            case 14: {
                return 14;
            }
            case 13: {
                return 13;
            }
            case 12: {
                return 12;
            }
            case 11: {
                return 11;
            }
            case 6: 
            case 8: 
            case 10: {
                return 8;
            }
            case 5: 
            case 7: 
            case 9: {
                return 7;
            }
            case 4: {
                return 6;
            }
            case 3: {
                return 5;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: 
        }
        return 1;
    }

    /*
     * Unable to fully structure code
     */
    public static v e(G var0, String var1_1, String var2_2, o var3_3) throws E {
        block69: {
            block71: {
                block72: {
                    block70: {
                        var17_4 = new F();
                        var17_4.m((G)var0);
                        var13_5 = var17_4.b();
                        var14_6 = var17_4.h(3);
                        if (var14_6 > 1) break block69;
                        var12_7 = var17_4.h(7);
                        var6_8 = var17_4.g() != false ? 48000 : 44100;
                        var17_4.r(4);
                        var9_9 = var17_4.h(9);
                        if (var12_7 > 1) {
                            if (var14_6 != 0) {
                                if (var17_4.g()) {
                                    var17_4.r(16);
                                    if (var17_4.g()) {
                                        var17_4.r(128);
                                    }
                                }
                            } else {
                                var0 = new StringBuilder();
                                var0.append("Invalid AC-4 DSI version: ");
                                var0.append(var14_6);
                                throw E.d(var0.toString());
                            }
                        }
                        if (var14_6 == 1) {
                            if (c.l((F)var17_4)) {
                                var17_4.c();
                            } else {
                                throw E.d("Invalid AC-4 DSI bitrate.");
                            }
                        }
                        var0 = new b();
                        for (var7_10 = 0; var7_10 < var9_9; ++var7_10) {
                            if (var14_6 == 0) {
                                var16_14 = var17_4.g();
                                var9_9 = var17_4.h(5);
                                var8_13 = var17_4.h(5);
                                var4_11 = 0;
                                var5_12 = 0;
                                var10_15 = 0;
                            } else {
                                var8_13 = var17_4.h(8);
                                var4_11 = var5_12 = var17_4.h(8);
                                if (var5_12 == 255) {
                                    var4_11 = var5_12 + var17_4.h(16);
                                }
                                if (var8_13 > 2) {
                                    var17_4.r(var4_11 * 8);
                                    continue;
                                }
                                var11_16 = (var13_5 - var17_4.b()) / 8;
                                var9_9 = var17_4.h(5);
                                var5_12 = var9_9 == 31 ? 1 : 0;
                                var10_15 = var5_12;
                                var5_12 = var11_16;
                                var16_14 = false;
                            }
                            var0.f = var8_13;
                            if (!var16_14 && var10_15 == 0 && var9_9 == 6) {
                                var16_14 = true;
                            } else {
                                var0.g = var17_4.h(3);
                                if (var17_4.g()) {
                                    var17_4.r(5);
                                }
                                var17_4.r(2);
                                if (var14_6 == 1 && (var8_13 == 1 || var8_13 == 2)) {
                                    var17_4.r(2);
                                }
                                var17_4.r(5);
                                var17_4.r(10);
                                if (var14_6 == 1) {
                                    if (var8_13 > 0) {
                                        var0.a = var17_4.g();
                                    }
                                    if (var0.a) {
                                        if (var8_13 == 1 || var8_13 == 2) {
                                            var11_16 = var17_4.h(5);
                                            if (var11_16 >= 0 && var11_16 <= 15) {
                                                var0.b = var11_16;
                                            }
                                            if (var11_16 >= 11 && var11_16 <= 14) {
                                                var0.d = var17_4.g();
                                                var0.e = var17_4.h(2);
                                            }
                                        }
                                        var17_4.r(24);
                                    }
                                    if (var8_13 == 1 || var8_13 == 2) {
                                        if (var17_4.g() && var17_4.g()) {
                                            var17_4.r(2);
                                        }
                                        if (var17_4.g()) {
                                            var17_4.q();
                                            var15_17 = var17_4.h(8);
                                            for (var11_16 = 0; var11_16 < var15_17; ++var11_16) {
                                                var17_4.r(8);
                                            }
                                        }
                                    }
                                }
                                if (!var16_14 && var10_15 == 0) {
                                    var17_4.q();
                                    if (var9_9 != 0 && var9_9 != 1 && var9_9 != 2) {
                                        if (var9_9 != 3 && var9_9 != 4) {
                                            if (var9_9 != 5) {
                                                var10_15 = var17_4.h(7);
                                                for (var9_9 = 0; var9_9 < var10_15; ++var9_9) {
                                                    var17_4.r(8);
                                                }
                                            } else if (var8_13 == 0) {
                                                c.i((F)var17_4, (b)var0);
                                            } else {
                                                var10_15 = var17_4.h(3);
                                                for (var9_9 = 0; var9_9 < var10_15 + 2; ++var9_9) {
                                                    c.j((F)var17_4, (b)var0);
                                                }
                                            }
                                        } else if (var8_13 == 0) {
                                            for (var9_9 = 0; var9_9 < 3; ++var9_9) {
                                                c.i((F)var17_4, (b)var0);
                                            }
                                        } else {
                                            for (var9_9 = 0; var9_9 < 3; ++var9_9) {
                                                c.j((F)var17_4, (b)var0);
                                            }
                                        }
                                    } else if (var8_13 == 0) {
                                        for (var9_9 = 0; var9_9 < 2; ++var9_9) {
                                            c.i((F)var17_4, (b)var0);
                                        }
                                    } else {
                                        for (var9_9 = 0; var9_9 < 2; ++var9_9) {
                                            c.j((F)var17_4, (b)var0);
                                        }
                                    }
                                } else if (var8_13 == 0) {
                                    c.i((F)var17_4, (b)var0);
                                } else {
                                    c.j((F)var17_4, (b)var0);
                                }
                                var17_4.q();
                                var16_14 = var17_4.g();
                            }
                            if (var16_14) {
                                var10_15 = var17_4.h(7);
                                for (var9_9 = 0; var9_9 < var10_15; ++var9_9) {
                                    var17_4.r(15);
                                }
                            }
                            if (var8_13 > 0) {
                                if (var17_4.g() && !c.l((F)var17_4)) {
                                    throw E.d("Can't parse bitrate DSI.");
                                }
                                if (var17_4.g()) {
                                    var17_4.c();
                                    var17_4.s(var17_4.h(16));
                                    var9_9 = var17_4.h(5);
                                    for (var8_13 = 0; var8_13 < var9_9; ++var8_13) {
                                        var17_4.r(3);
                                        var17_4.r(8);
                                    }
                                }
                            }
                            var17_4.c();
                            if (var14_6 == 1) {
                                var5_12 = (var13_5 - var17_4.b()) / 8 - var5_12;
                                if (var4_11 >= var5_12) {
                                    var17_4.s(var4_11 - var5_12);
                                } else {
                                    throw E.d("pres_bytes is smaller than presentation bytes read.");
                                }
                            }
                            if (!var0.a || var0.b != -1) break;
                            var0 = new StringBuilder();
                            var0.append("Can't determine channel mode of presentation ");
                            var0.append(var7_10);
                            throw E.d(var0.toString());
                        }
                        if (!var0.a) break block70;
                        var4_11 = c.c(var0.b, var0.d, var0.e);
                        break block71;
                    }
                    var4_11 = var0.c;
                    if (var4_11 <= 0) break block72;
                    var4_11 = var5_12 = var4_11 + 1;
                    if (var0.g == 4) {
                        var4_11 = var5_12;
                        if (var5_12 == 17) {
                            var4_11 = 21;
                        }
                    }
                    break block71;
                }
                var4_11 = var0.g;
                if (var4_11 == 0) ** GOTO lbl183
                if (var4_11 != 1) {
                    if (var4_11 != 2) {
                        if (var4_11 != 3) {
                            if (var4_11 != 4) {
                                var17_4 = new StringBuilder();
                                var17_4.append("AC-4 level ");
                                var17_4.append(var0.g);
                                var17_4.append(" has not been defined.");
                                u.h("Ac4Util", var17_4.toString());
lbl183:
                                // 2 sources

                                var4_11 = 2;
                            } else {
                                var4_11 = 12;
                            }
                        } else {
                            var4_11 = 10;
                        }
                    } else {
                        var4_11 = 8;
                    }
                } else {
                    var4_11 = 6;
                }
            }
            if (var4_11 > 0) {
                var0 = c.a(var12_7, var0.f, var0.g);
                return new v.b().j0(var1_1).y0("audio/ac4").T(var4_11).z0(var6_8).c0(var3_3).n0(var2_2).U((String)var0).P();
            }
            throw E.d("Cannot determine channel count of presentation.");
        }
        var0 = new StringBuilder();
        var0.append("Unsupported AC-4 DSI version: ");
        var0.append(var14_6);
        throw E.d(var0.toString());
    }

    public static int f(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[16];
        int n8 = byteBuffer.position();
        byteBuffer.get(byArray);
        byteBuffer.position(n8);
        return c.g((F)new F((byte[])byArray)).e;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static c g(F object) {
        int var1_13;
        int n8;
        int n9;
        int n10;
        block11: {
            Object var1_11;
            block14: {
                int n11;
                block12: {
                    block13: {
                        int n12;
                        Object var1_5;
                        int n13;
                        n10 = ((F)object).h(16);
                        n9 = ((F)object).h(16);
                        if (n9 == 65535) {
                            n9 = ((F)object).h(24);
                            int n14 = 7;
                        } else {
                            int n15 = 4;
                        }
                        n9 = n13 = n9 + var1_5;
                        if (n10 == 44097) {
                            n9 = n13 + 2;
                        }
                        n10 = n12 = ((F)object).h(2);
                        if (n12 == 3) {
                            n10 = n12 + c.k((F)object, 2);
                        }
                        int n16 = ((F)object).h(10);
                        if (((F)object).g() && ((F)object).h(3) > 0) {
                            ((F)object).r(2);
                        }
                        boolean bl = ((F)object).g();
                        n8 = 48000;
                        if (!bl) {
                            n8 = 44100;
                        }
                        n11 = ((F)object).h(4);
                        if (n8 == 44100 && n11 == 13) {
                            int n17 = a[n11];
                            return new c(n10, 2, n8, n9, (int)var1_13);
                        }
                        if (n8 != 48000 || n11 >= ((Object)(object = (Object)a)).length) break block11;
                        Object object2 = object[n11];
                        if ((n16 %= 5) == 1) break block12;
                        if (n16 == 2) break block13;
                        if (n16 == 3) break block12;
                        if (n16 != 4) {
                            return new c(n10, 2, n8, n9, (int)var1_13);
                        }
                        if (n11 != 3 && n11 != 8) {
                            if (n11 != 11) return new c(n10, 2, n8, n9, (int)var1_13);
                        }
                        break block14;
                    }
                    if (n11 != 8) {
                        if (n11 != 11) return new c(n10, 2, n8, n9, (int)var1_13);
                    }
                    break block14;
                }
                if (n11 != 3) {
                    if (n11 != 8) return new c(n10, 2, n8, n9, (int)var1_13);
                }
            }
            ++var1_11;
            return new c(n10, 2, n8, n9, (int)var1_13);
        }
        boolean bl = false;
        return new c(n10, 2, n8, n9, (int)var1_13);
    }

    public static int h(byte[] byArray, int n8) {
        int n9 = byArray.length;
        int n10 = 7;
        if (n9 < 7) {
            return -1;
        }
        n9 = (byArray[2] & 0xFF) << 8 | byArray[3] & 0xFF;
        if (n9 == 65535) {
            n9 = (byArray[4] & 0xFF) << 16 | (byArray[5] & 0xFF) << 8 | byArray[6] & 0xFF;
        } else {
            n10 = 4;
        }
        int n11 = n10;
        if (n8 == 44097) {
            n11 = n10 + 2;
        }
        return n9 + n11;
    }

    private static void i(F f8, b b8) throws E {
        int n8 = f8.h(5);
        f8.r(2);
        if (f8.g()) {
            f8.r(5);
        }
        if (n8 >= 7 && n8 <= 10) {
            f8.q();
        }
        if (f8.g()) {
            int n9 = f8.h(3);
            if (b8.b == -1 && n8 >= 0 && n8 <= 15 && (n9 == 0 || n9 == 1)) {
                b8.b = n8;
            }
            if (f8.g()) {
                c.m(f8);
            }
        }
    }

    private static void j(F f8, b b8) throws E {
        f8.r(2);
        boolean bl = f8.g();
        int n8 = f8.h(8);
        for (int i8 = 0; i8 < n8; ++i8) {
            f8.r(2);
            if (f8.g()) {
                f8.r(5);
            }
            if (bl) {
                f8.r(24);
                continue;
            }
            if (f8.g()) {
                if (!f8.g()) {
                    f8.r(4);
                }
                b8.c = f8.h(6) + 1;
            }
            f8.r(4);
        }
        if (f8.g()) {
            f8.r(3);
            if (f8.g()) {
                c.m(f8);
            }
        }
    }

    private static int k(F f8, int n8) {
        int n9 = 0;
        while (true) {
            n9 += f8.h(n8);
            if (!f8.g()) {
                return n9;
            }
            n9 = n9 + 1 << n8;
        }
    }

    private static boolean l(F f8) {
        if (f8.b() < 66) {
            return false;
        }
        f8.r(66);
        return true;
    }

    private static void m(F f8) throws E {
        int n8 = f8.h(6);
        if (n8 >= 2 && n8 <= 42) {
            f8.r(n8 * 8);
            return;
        }
        throw E.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", n8));
    }

    private static final class b {
        public boolean a = true;
        public int b = -1;
        public int c = -1;
        public boolean d = true;
        public int e = 2;
        public int f = 1;
        public int g = 0;

        private b() {
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private c(int n8, int n9, int n10, int n11, int n12) {
            this.a = n8;
            this.c = n9;
            this.b = n10;
            this.d = n11;
            this.e = n12;
        }
    }
}

