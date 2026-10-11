/*
 * Decompiled with CFR 0.152.
 */
package ax.Tb;

import ax.Gb.v;
import ax.Tb.c;
import ax.Tb.d;
import ax.Ub.a;
import ax.Ub.f;
import ax.Ub.h;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import java.util.NoSuchElementException;

final class j {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final <T> Object a(ax.Tb.b<? extends T> var0, e<? super T> var1_1) {
        block10: {
            block11: {
                if (!(var1_1 instanceof b)) ** GOTO lbl-1000
                var3_3 = (ax.yb.d)var1_1;
                var2_5 = var3_3.h0;
                if ((var2_5 & -2147483648) != 0) {
                    var3_3.h0 = var2_5 + -2147483648;
                } else lbl-1000:
                // 2 sources

                {
                    var3_3 = new ax.yb.d((e<? super b>)var1_1){
                        Object e0;
                        Object f0;
                        Object g0;
                        int h0;

                        @Override
                        public final Object p(Object object) {
                            this.g0 = object;
                            this.h0 |= Integer.MIN_VALUE;
                            return d.f(null, this);
                        }
                    };
                }
                var1_1 = var3_3.g0;
                var5_6 = ax.xb.b.c();
                var2_5 = var3_3.h0;
                if (var2_5 != 0) {
                    if (var2_5 == 1) {
                        var4_7 = var3_3.f0;
                        var0 = (v)var3_3.e0;
                        try {
                            o.b(var1_1);
                            break block10;
                        }
                        catch (a var1_2) {
                            var3_3 = var4_7;
                            break block11;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(var1_1);
                var1_1 = new v<T>();
                var1_1.q = h.a;
                var4_8 = new c<T>(var1_1){
                    final v q;
                    {
                        this.q = v8;
                    }

                    @Override
                    public Object e(T t8, e<? super t> e8) {
                        this.q.q = t8;
                        throw new a(this);
                    }
                };
                try {
                    var3_3.e0 = var1_1;
                    var3_3.f0 = var4_8;
                    var3_3.h0 = 1;
                    var0 = var0.a(var4_8, (e<t>)var3_3);
                    if (var0 == var5_6) {
                        return var5_6;
                    }
                    var0 = var1_1;
                    break block10;
                }
                catch (a var3_4) {
                    var0 = var1_1;
                    var1_1 = var3_4;
                    var3_3 = var4_8;
                }
            }
            f.a(var1_1, var3_3);
        }
        var0 = var0.q;
        if (var0 != h.a) {
            return var0;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
}

