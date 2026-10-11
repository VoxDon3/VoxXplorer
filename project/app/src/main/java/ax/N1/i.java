/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import ax.N1.e;
import ax.N1.k;
import ax.N1.t;
import ax.R0.a;
import ax.S0.l;
import java.util.List;

public class i {
    private static int a(k k8, long l8) {
        int n8;
        if (l8 == -9223372036854775807L) {
            return 0;
        }
        int n9 = n8 = k8.d(l8);
        if (n8 == -1) {
            n9 = k8.l();
        }
        n8 = n9;
        if (n9 > 0) {
            n8 = n9;
            if (k8.h(n9 - 1) == l8) {
                n8 = n9 - 1;
            }
        }
        return n8;
    }

    private static void b(k k8, int n8, l<e> l8) {
        block5: {
            block4: {
                long l9 = k8.h(n8);
                List<a> list = k8.j(l9);
                if (list.isEmpty()) break block4;
                if (n8 == k8.l() - 1) break block5;
                long l10 = k8.h(n8 + 1) - k8.h(n8);
                if (l10 > 0L) {
                    l8.accept(new e(list, l9, l10));
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    /*
     * Unable to fully structure code
     */
    public static void c(k var0, t.b var1_1, l<e> var2_2) {
        var3_3 = i.a(var0, var1_1.a);
        var8_4 = var1_1.a;
        var7_5 = 0;
        if (var8_4 == -9223372036854775807L || var3_3 >= var0.l()) ** GOTO lbl-1000
        var12_6 = var0.j(var1_1.a);
        var8_4 = var0.h(var3_3);
        if (!var12_6.isEmpty() && (var10_7 = var1_1.a) < var8_4) {
            var2_2.accept(new e(var12_6, var10_7, var8_4 - var10_7));
            var4_8 = true;
        } else lbl-1000:
        // 2 sources

        {
            var4_8 = false;
        }
        for (var5_9 = var3_3; var5_9 < var0.l(); ++var5_9) {
            i.b(var0, var5_9, var2_2);
        }
        if (var1_1.b) {
            var6_10 = var3_3;
            var5_9 = var7_5;
            if (var4_8) {
                var6_10 = var3_3 - 1;
                var5_9 = var7_5;
            }
            while (var5_9 < var6_10) {
                i.b(var0, var5_9, var2_2);
                ++var5_9;
            }
            if (var4_8) {
                var2_2.accept(new e(var0.j(var1_1.a), var0.h(var6_10), var1_1.a - var0.h(var6_10)));
            }
        }
    }
}

