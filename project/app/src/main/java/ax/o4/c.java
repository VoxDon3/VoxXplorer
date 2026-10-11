/*
 * Decompiled with CFR 0.152.
 */
package ax.o4;

class c {
    private int a;
    private long b;

    c(long l8, int n8) {
        this.b = l8;
        this.a = n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    static c b(String string, int n8, int n9) {
        int n10;
        if (n8 >= n9) {
            return null;
        }
        long l8 = 0L;
        for (n10 = n8; n10 < n9; ++n10) {
            int n11 = string.charAt(n10);
            if (n11 >= 48 && n11 <= 57) {
                l8 = l8 * 16L + (long)(n11 - 48);
            } else {
                if (n11 >= 65 && n11 <= 70) {
                    l8 *= 16L;
                    n11 -= 65;
                } else {
                    if (n11 < 97 || n11 > 102) break;
                    l8 *= 16L;
                    n11 -= 97;
                }
                l8 = l8 + (long)n11 + 10L;
            }
            if (l8 <= 0xFFFFFFFFL) continue;
            return null;
        }
        if (n10 == n8) {
            return null;
        }
        return new c(l8, n10);
    }

    /*
     * Unable to fully structure code
     */
    static c c(String var0, int var1_1, int var2_2, boolean var3_3) {
        block6: {
            if (var1_1 >= var2_2) {
                return null;
            }
            var6_4 = '\u0000';
            var7_5 = '\u0000';
            var5_6 = var6_4;
            var4_7 = var1_1;
            if (!var3_3) break block6;
            var4_7 = var0.charAt(var1_1);
            var5_6 = var7_5;
            if (var4_7 == 43) ** GOTO lbl16
            if (var4_7 != 45) {
                var5_6 = var6_4;
                var4_7 = var1_1;
            } else {
                var5_6 = '\u0001';
lbl16:
                // 2 sources

                var4_7 = var1_1 + 1;
            }
        }
        var8_8 = 0L;
        for (var1_1 = var4_7; var1_1 < var2_2 && (var6_4 = var0.charAt(var1_1)) >= '0' && var6_4 <= '9'; ++var1_1) {
            if (var5_6 != '\u0000') {
                var8_8 = var10_9 = var8_8 * 10L - (long)(var6_4 - 48);
                if (var10_9 >= -2147483648L) continue;
                return null;
            }
            var8_8 = var10_9 = var8_8 * 10L + (long)(var6_4 - 48);
            if (var10_9 <= 0x7FFFFFFFL) continue;
            return null;
        }
        if (var1_1 == var4_7) {
            return null;
        }
        return new c(var8_8, var1_1);
    }

    int a() {
        return this.a;
    }

    public int d() {
        return (int)this.b;
    }
}

