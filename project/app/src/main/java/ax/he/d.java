/*
 * Decompiled with CFR 0.152.
 */
package ax.he;

import ax.ge.f;
import ax.ge.g;
import ax.he.c;
import ax.ie.e;

final class d
extends c {
    private g B = null;

    d(e e8, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, ax.be.c c8) {
        super(e8, ax.ge.f.g(n11, Math.max(n12, 1), 272, n13, 273, n14, n15, c8), n8, n9, n10, n11, n13);
    }

    private boolean D(int n8, int n9) {
        return n8 < n9 >>> 7;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    int t() {
        if (this.z == -1) {
            this.B = this.s();
        }
        this.y = -1;
        var8_1 = Math.min(this.n.c(), 273);
        if (var8_1 < 2) {
            return 1;
        }
        var7_2 = 0;
        var4_4 = 0;
        var5_5 = 0;
        for (var1_3 = 0; var1_3 < 4; ++var1_3) {
            var3_7 = this.n.h(this.b[var1_3], var8_1);
            if (var3_7 < 2) {
                var2_6 = var4_4;
            } else {
                if (var3_7 >= this.r) {
                    this.y = var1_3;
                    this.z(var3_7 - 1);
                    return var3_7;
                }
                var2_6 = var4_4;
                if (var3_7 > var4_4) {
                    var5_5 = var1_3;
                    var2_6 = var3_7;
                }
            }
            var4_4 = var2_6;
        }
        var9_8 = this.B;
        var2_6 = var9_8.c;
        if (var2_6 > 0) {
            var1_3 = var9_8.a[var2_6 - 1];
            var2_6 = var6_9 = var9_8.b[var2_6 - 1];
            var3_7 = var1_3;
            if (var1_3 >= this.r) {
                this.y = var6_9 + 4;
                var2_6 = var1_3 - 1;
lbl34:
                // 2 sources

                while (true) {
                    this.z(var2_6);
                    return var1_3;
                }
            }
            while (true) {
                var9_8 = this.B;
                var1_3 = var9_8.c;
                if (var1_3 <= 1 || var3_7 != var9_8.a[var1_3 - 2] + 1 || !this.D(var9_8.b[var1_3 - 2], var2_6)) break;
                var9_8 = this.B;
                var1_3 = var9_8.c;
                var9_8.c = var1_3 - 1;
                var3_7 = var9_8.a[var1_3 - 2];
                var2_6 = var9_8.b[var1_3 - 2];
            }
            var6_9 = var2_6;
            var1_3 = var3_7;
            if (var3_7 == 2) {
                var6_9 = var2_6;
                var1_3 = var3_7;
                if (var2_6 >= 128) {
                    var1_3 = 1;
                    var6_9 = var2_6;
                }
            }
        } else {
            var6_9 = 0;
            var1_3 = 0;
        }
        if (var4_4 >= 2 && (var4_4 + 1 >= var1_3 || var4_4 + 2 >= var1_3 && var6_9 >= 512 || var4_4 + 3 >= var1_3 && var6_9 >= 32768)) {
            this.y = var5_5;
            this.z(var4_4 - 1);
            return var4_4;
        }
        if (var1_3 >= 2 && var8_1 > 2) {
            this.B = var9_8 = this.s();
            var3_7 = var9_8.c;
            if (var3_7 > 0) {
                var2_6 = var9_8.a[var3_7 - 1];
                var3_7 = var9_8.b[var3_7 - 1];
                if (var2_6 >= var1_3 && var3_7 < var6_9 || var2_6 == (var4_4 = var1_3 + 1) && this.D(var6_9, var3_7) == false || var2_6 > var4_4 || var2_6 + 1 >= var1_3 && var1_3 >= 3 && this.D(var3_7, var6_9)) {
                    return 1;
                }
            }
            var3_7 = Math.max(var1_3 - 1, 2);
            for (var2_6 = var7_2; var2_6 < 4; ++var2_6) {
                if (this.n.h(this.b[var2_6], var3_7) != var3_7) continue;
                return 1;
            }
            this.y = var6_9 + 4;
            var2_6 = var1_3 - 2;
            ** continue;
        }
        return 1;
    }
}

