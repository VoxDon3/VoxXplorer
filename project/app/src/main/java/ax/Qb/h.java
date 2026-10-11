/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Fb.p;
import ax.Qb.F;
import ax.Qb.J;
import ax.Qb.L;
import ax.Qb.N0;
import ax.Qb.c0;
import ax.Qb.e;
import ax.Qb.g;
import ax.Qb.l0;
import ax.wb.f;
import ax.wb.i;
import ax.wb.j;

final class h {
    /*
     * Unable to fully structure code
     */
    public static final <T> T a(i var0, p<? super J, ? super ax.wb.e<? super T>, ? extends Object> var1_1) throws InterruptedException {
        block4: {
            block3: {
                var5_2 = Thread.currentThread();
                var3_3 = var0.a(f.b0);
                if (var3_3 != null) break block3;
                var3_3 = N0.a.b();
                var0 = F.d(l0.q, var0.p(var3_3));
                break block4;
            }
            var2_4 = var3_3 instanceof c0;
            var4_5 = null;
            var3_3 = var2_4 != false ? (c0)var3_3 : null;
            if (var3_3 == null) ** GOTO lbl-1000
            if (var3_3.k1()) {
                var4_5 = var3_3;
            }
            if (var4_5 != null) {
                var3_3 = var4_5;
            } else lbl-1000:
            // 2 sources

            {
                var3_3 = N0.a.a();
            }
            var0 = F.d(l0.q, var0);
        }
        var0 = new e<T>(var0, var5_2, (c0)var3_3);
        var0.N0(L.q, var0, var1_1);
        return var0.O0();
    }

    public static /* synthetic */ Object b(i i8, p p8, int n8, Object object) throws InterruptedException {
        if ((n8 & 1) != 0) {
            i8 = j.q;
        }
        return g.e(i8, p8);
    }
}

