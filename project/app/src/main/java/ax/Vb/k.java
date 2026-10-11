/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Fb.l;
import ax.Qb.D;
import ax.Qb.N0;
import ax.Qb.s0;
import ax.Vb.F;
import ax.Vb.J;
import ax.Vb.j;
import ax.sb.n;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;

public final class k {
    private static final F a = new F("UNDEFINED");
    public static final F b = new F("REUSABLE_CLAIMED");

    public static final /* synthetic */ F a() {
        return a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final <T> void b(e<? super T> var0, Object var1_3, l<? super Throwable, t> var2_5) {
        block19: {
            if (!(var0 /* !! */  instanceof j)) {
                var0 /* !! */ .f(var1_3);
                return;
            }
            var4_6 = (j)var0 /* !! */ ;
            var0 /* !! */  = D.b(var1_3, var2_5);
            if (var4_6.e0.f(var4_6.b())) {
                var4_6.g0 = var0 /* !! */ ;
                var4_6.d0 = 1;
                var4_6.e0.b(var4_6.b(), var4_6);
                return;
            }
            var2_5 = N0.a.b();
            if (var2_5.g1()) {
                var4_6.g0 = var0 /* !! */ ;
                var4_6.d0 = 1;
                var2_5.c1(var4_6);
                return;
            }
            var2_5.e1(true);
            var5_7 /* !! */  = var4_6.b().a(s0.c);
            if (var5_7 /* !! */  == null || var5_7 /* !! */ .e()) ** GOTO lbl28
            var1_3 = var5_7 /* !! */ .o();
            var4_6.c(var0 /* !! */ , (Throwable)var1_3);
            var0 /* !! */  = n.q;
            var4_6.f(n.a(o.a((Throwable)var1_3)));
            ** GOTO lbl46
            {
                catch (Throwable var0_1) {
                    break block19;
                }
lbl28:
                // 1 sources

                var0 /* !! */  = var4_6.f0;
                var6_8 = var4_6.h0;
                var5_7 /* !! */  = var0 /* !! */ .b();
                var6_8 = J.c(var5_7 /* !! */ , var6_8);
                var0 /* !! */  = var6_8 != J.a ? ax.Qb.F.g(var0 /* !! */ , var5_7 /* !! */ , var6_8) : null;
                try {
                    var4_6.f0.f(var1_3);
                    var1_3 = t.a;
                    if (var0 /* !! */  != null) {
                    }
                    ** GOTO lbl45
                }
                catch (Throwable var1_4) {}
                if (var0 /* !! */  == null) ** GOTO lbl42
                {
                    if (var0 /* !! */ .O0() == false) throw var1_4;
lbl42:
                    // 2 sources

                    J.a(var5_7 /* !! */ , var6_8);
                    throw var1_4;
                }
            }
            {
                block20: {
                    if (!var0 /* !! */ .O0()) break block20;
lbl45:
                    // 2 sources

                    J.a(var5_7 /* !! */ , var6_8);
                }
                while (var3_9 = var2_5.j1()) {
                }
                return;
            }
        }
        try {
            var4_6.i(var0_1, null);
            return;
        }
        finally {
            var2_5.Z0(true);
        }
    }

    public static /* synthetic */ void c(e e8, Object object, l l8, int n8, Object object2) {
        if ((n8 & 2) != 0) {
            l8 = null;
        }
        k.b(e8, object, l8);
    }
}

