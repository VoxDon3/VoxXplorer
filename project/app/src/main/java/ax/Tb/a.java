/*
 * Decompiled with CFR 0.152.
 */
package ax.Tb;

import ax.Tb.b;
import ax.Tb.c;
import ax.Ub.i;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.yb.d;

public abstract class a<T>
implements b<T> {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object a(c<? super T> var1_1, e<? super t> var2_2) {
        block9: {
            block8: {
                if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                var4_3 = var2_2;
                var3_6 = var4_3.h0;
                if ((var3_6 & -2147483648) != 0) {
                    var4_3.h0 = var3_6 + -2147483648;
                    var2_2 = var4_3;
                } else lbl-1000:
                // 2 sources

                {
                    var2_2 = new d(this, (e<? super a>)var2_2){
                        Object e0;
                        Object f0;
                        final a<T> g0;
                        int h0;
                        {
                            this.g0 = a8;
                            super(e8);
                        }

                        @Override
                        public final Object p(Object object) {
                            this.f0 = object;
                            this.h0 |= Integer.MIN_VALUE;
                            return this.g0.a(null, this);
                        }
                    };
                }
                var5_7 = var2_2.f0;
                var4_3 = ax.xb.b.c();
                var3_6 = var2_2.h0;
                if (var3_6 != 0) {
                    if (var3_6 == 1) {
                        var1_1 /* !! */  = (i<T>)var2_2.e0;
                        try {
                            o.b(var5_7);
                            break block8;
                        }
                        catch (Throwable var4_4) {
                            var2_2 = var1_1 /* !! */ ;
                            var1_1 /* !! */  = var4_4;
                            break block9;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(var5_7);
                var1_1 /* !! */  = new i<T>(var1_1 /* !! */ , var2_2.b());
                try {
                    var2_2.e0 = var1_1 /* !! */ ;
                    var2_2.h0 = 1;
                    var2_2 = this.b((c<? super T>)var1_1 /* !! */ , (e<? super t>)var2_2);
                    if (var2_2 != var4_3) break block8;
                    return var4_3;
                }
                catch (Throwable var4_5) {
                    var2_2 = var1_1 /* !! */ ;
                    var1_1 /* !! */  = var4_5;
                }
            }
            var1_1 /* !! */ .q();
            return t.a;
        }
        var2_2.q();
        throw var1_1 /* !! */ ;
    }

    public abstract Object b(c<? super T> var1, e<? super t> var2);
}

