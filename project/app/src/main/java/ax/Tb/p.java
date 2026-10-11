/*
 * Decompiled with CFR 0.152.
 */
package ax.Tb;

import ax.Tb.c;
import ax.Ub.i;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.xb.b;
import ax.yb.d;

public final class p<T>
implements c<T> {
    private final ax.Fb.p<c<? super T>, e<? super t>, Object> c0;
    private final c<T> q;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(e<? super t> var1_1) {
        block9: {
            block8: {
                if (!(var1_1 instanceof a)) ** GOTO lbl-1000
                var3_3 = var1_1;
                var2_4 = var3_3.i0;
                if ((var2_4 & -2147483648) != 0) {
                    var3_3.i0 = var2_4 + -2147483648;
                    var1_1 = var3_3;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = new d(this, var1_1){
                        Object e0;
                        Object f0;
                        Object g0;
                        final p<T> h0;
                        int i0;
                        {
                            this.h0 = p8;
                            super(e8);
                        }

                        @Override
                        public final Object p(Object object) {
                            this.g0 = object;
                            this.i0 |= Integer.MIN_VALUE;
                            return this.h0.a(this);
                        }
                    };
                }
                var7_5 = var1_1.g0;
                var6_6 = b.c();
                var2_4 = var1_1.i0;
                if (var2_4 != 0) {
                    if (var2_4 != 1) {
                        if (var2_4 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(var7_5);
                        return t.a;
                    }
                    var4_7 = (i<T>)var1_1.f0;
                    var5_8 = (p)var1_1.e0;
                    var3_3 = var4_7;
                    try {
                        o.b(var7_5);
                        var3_3 = var5_8;
                        break block8;
                    }
                    catch (Throwable var1_2) {
                        break block9;
                    }
                }
                o.b(var7_5);
                var4_7 = new i<T>(this.q, var1_1.b());
                var3_3 = var4_7;
                {
                    var5_9 = this.c0;
                    var3_3 = var4_7;
                    var1_1.e0 = this;
                    var3_3 = var4_7;
                    var1_1.f0 = var4_7;
                    var3_3 = var4_7;
                    var1_1.i0 = 1;
                    var3_3 = var4_7;
                    var5_9 = var5_9.j(var4_7, (e<? super t>)var1_1);
                    if (var5_9 == var6_6) {
                        return var6_6;
                    }
                    var3_3 = this;
                }
            }
            var4_7.q();
            var3_3 = var3_3.q;
            if (var3_3 instanceof p == false) return t.a;
            var3_3 = (p)var3_3;
            var1_1.e0 = null;
            var1_1.f0 = null;
            var1_1.i0 = 2;
            if (var3_3.a(var1_1) != var6_6) return t.a;
            return var6_6;
        }
        var3_3.q();
        throw var1_2;
    }

    @Override
    public Object e(T t8, e<? super t> e8) {
        return this.q.e(t8, e8);
    }
}

