/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.W4.c;
import ax.W4.n;
import java.util.Arrays;

public final class g {
    private static final char[] a = ax.W4.c.d(true);
    private static final byte[] b = ax.W4.c.c(true);
    private static final g c = new g();

    private static int a(int n8, int n9) {
        if (n9 >= 56320 && n9 <= 57343) {
            return (n8 - 55296 << 10) + 65536 + (n9 - 56320);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Broken surrogate pair: first char 0x");
        stringBuilder.append(Integer.toHexString(n8));
        stringBuilder.append(", second 0x");
        stringBuilder.append(Integer.toHexString(n9));
        stringBuilder.append("; illegal combination");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static void b(int n8) {
        throw new IllegalArgumentException(n.c(n8));
    }

    static int c(int n8) {
        return Math.min(Math.max(24, n8 + 6 + (n8 >> 1)), 32000);
    }

    public static g e() {
        return c;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public byte[] d(String var1_1) {
        var9_2 = var1_1.length();
        var6_3 = g.c(var9_2);
        var11_4 /* !! */  = new byte[var6_3];
        var10_5 = null;
        var2_6 = 0;
        var3_7 = 0;
        block0: while (true) {
            var13_13 = var11_4 /* !! */ ;
            var12_12 = var10_5;
            var4_8 = var3_7;
            if (var2_6 >= var9_2) break;
            var4_8 = var2_6 + 1;
            var5_9 = var1_1.charAt(var2_6);
            while (var5_9 <= 127) {
                var2_6 = var6_3;
                var13_13 = var11_4 /* !! */ ;
                var12_12 = var10_5;
                var7_10 = var3_7;
                if (var3_7 >= var6_3) {
                    var12_12 = var10_5;
                    if (var10_5 == null) {
                        var12_12 = ax.b5.c.g(var11_4 /* !! */ , var3_7);
                    }
                    var13_13 = var12_12.f();
                    var2_6 = var13_13.length;
                    var7_10 = 0;
                }
                var3_7 = var7_10 + 1;
                var13_13[var7_10] = (byte)var5_9;
                if (var4_8 >= var9_2) {
                    var4_8 = var3_7;
                    break block0;
                }
                var5_9 = var1_1.charAt(var4_8);
                ++var4_8;
                var6_3 = var2_6;
                var11_4 /* !! */  = var13_13;
                var10_5 = var12_12;
            }
            var12_12 = var10_5;
            if (var10_5 == null) {
                var12_12 = ax.b5.c.g(var11_4 /* !! */ , var3_7);
            }
            var2_6 = var6_3;
            var10_5 = var11_4 /* !! */ ;
            var7_10 = var3_7;
            if (var3_7 >= var6_3) {
                var10_5 = var12_12.f();
                var2_6 = ((Object)var10_5).length;
                var7_10 = 0;
            }
            if (var5_9 < 2048) {
                var6_3 = var7_10 + 1;
                var10_5[var7_10] = (byte)(var5_9 >> 6 | 192);
lbl50:
                // 2 sources

                while (true) {
                    var3_7 = var2_6;
                    var2_6 = var4_8;
                    var4_8 = var6_3;
                    break;
                }
            } else if (var5_9 >= 55296 && var5_9 <= 57343) {
                if (var5_9 > 56319) {
                    g.b(var5_9);
                }
                if (var4_8 >= var9_2) {
                    g.b(var5_9);
                }
                if ((var6_3 = g.a(var5_9, var1_1.charAt(var4_8))) > 0x10FFFF) {
                    g.b(var6_3);
                }
                var8_11 = var7_10 + 1;
                var10_5[var7_10] = (byte)(var6_3 >> 18 | 240);
                var5_9 = var2_6;
                var3_7 = var8_11;
                if (var8_11 >= var2_6) {
                    var10_5 = var12_12.f();
                    var5_9 = ((Object)var10_5).length;
                    var3_7 = 0;
                }
                var7_10 = var3_7 + 1;
                var10_5[var3_7] = (byte)(var6_3 >> 12 & 63 | 128);
                var3_7 = var5_9;
                var2_6 = var7_10;
                if (var7_10 >= var5_9) {
                    var10_5 = var12_12.f();
                    var3_7 = ((Object)var10_5).length;
                    var2_6 = 0;
                }
                var10_5[var2_6] = (byte)(var6_3 >> 6 & 63 | 128);
                var5_9 = var6_3;
                var6_3 = var4_8 + 1;
                var4_8 = var2_6 + 1;
                var2_6 = var6_3;
            } else {
                var8_11 = var7_10 + 1;
                var10_5[var7_10] = (byte)(var5_9 >> 12 | 224);
                var3_7 = var2_6;
                var6_3 = var8_11;
                if (var8_11 >= var2_6) {
                    var10_5 = var12_12.f();
                    var3_7 = ((Object)var10_5).length;
                    var6_3 = 0;
                }
                var10_5[var6_3] = (byte)(var5_9 >> 6 & 63 | 128);
                ++var6_3;
                var2_6 = var3_7;
                ** continue;
            }
            var6_3 = var3_7;
            var11_4 /* !! */  = (byte[])var10_5;
            var7_10 = var4_8;
            if (var4_8 >= var3_7) {
                var11_4 /* !! */  = var12_12.f();
                var6_3 = var11_4 /* !! */ .length;
                var7_10 = 0;
            }
            var11_4 /* !! */ [var7_10] = (byte)(var5_9 & 63 | 128);
            var3_7 = var7_10 + 1;
            var10_5 = var12_12;
        }
        if (var12_12 == null) {
            return Arrays.copyOfRange(var13_13, 0, var4_8);
        }
        return var12_12.e(var4_8);
    }
}

