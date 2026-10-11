/*
 * Decompiled with CFR 0.152.
 */
package ax.Tb;

import ax.Fb.p;
import ax.Tb.c;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.yb.d;

final class i {
    public static final <T> ax.Tb.b<T> a(ax.Tb.b<? extends T> b8, p<? super T, ? super e<? super Boolean>, ? extends Object> p8) {
        return new ax.Tb.b<T>(b8, p8){
            final p c0;
            final ax.Tb.b q;
            {
                this.q = b8;
                this.c0 = p8;
            }

            @Override
            public Object a(c<? super T> object, e<? super t> e8) {
                ax.Gb.t t8 = new ax.Gb.t();
                if ((object = this.q.a(new c(t8, object, this.c0){
                    final c<T> c0;
                    final p<T, e<? super Boolean>, Object> d0;
                    final ax.Gb.t q;
                    {
                        this.q = t8;
                        this.c0 = c8;
                        this.d0 = p8;
                    }

                    /*
                     * Unable to fully structure code
                     * Could not resolve type clashes
                     */
                    @Override
                    public final Object e(T var1_1, e<? super t> var2_2) {
                        block17: {
                            block12: {
                                block16: {
                                    block13: {
                                        block15: {
                                            block14: {
                                                block8: {
                                                    block9: {
                                                        block10: {
                                                            block11: {
                                                                if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                                                                var4_3 = var2_2;
                                                                var3_4 = var4_3.i0;
                                                                if ((var3_4 & -2147483648) != 0) {
                                                                    var4_3.i0 = var3_4 + -2147483648;
                                                                    var2_2 = var4_3;
                                                                } else lbl-1000:
                                                                // 2 sources

                                                                {
                                                                    var2_2 = new d(this, var2_2){
                                                                        Object e0;
                                                                        Object f0;
                                                                        Object g0;
                                                                        final b<T> h0;
                                                                        int i0;
                                                                        {
                                                                            this.h0 = b8;
                                                                            super(e8);
                                                                        }

                                                                        @Override
                                                                        public final Object p(Object object) {
                                                                            this.g0 = object;
                                                                            this.i0 |= Integer.MIN_VALUE;
                                                                            return this.h0.e(null, this);
                                                                        }
                                                                    };
                                                                }
                                                                var5_5 = var2_2.g0;
                                                                var6_6 = ax.xb.b.c();
                                                                var3_4 = var2_2.i0;
                                                                if (var3_4 == 0) break block8;
                                                                if (var3_4 == 1) break block9;
                                                                if (var3_4 == 2) break block10;
                                                                if (var3_4 != 3) break block11;
                                                                o.b(var5_5);
                                                                break block12;
                                                            }
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        var1_1 /* !! */  = var2_2.f0;
                                                        var4_3 = var2_2.e0;
                                                        o.b(var5_5);
                                                        break block13;
                                                    }
                                                    o.b(var5_5);
                                                    break block14;
                                                }
                                                o.b(var5_5);
                                                if (!this.q.q) break block15;
                                                var4_3 = this.c0;
                                                var2_2.i0 = 1;
                                                if (var4_3.e(var1_1 /* !! */ , var2_2) == var6_6) break block16;
                                            }
                                            return t.a;
                                        }
                                        var4_3 = this.d0;
                                        var2_2.e0 = this;
                                        var2_2.f0 = var1_1 /* !! */ ;
                                        var2_2.i0 = 2;
                                        var5_5 = var4_3.j(var1_1 /* !! */ , var2_2);
                                        if (var5_5 == var6_6) break block16;
                                        var4_3 = this;
                                    }
                                    if (((Boolean)var5_5).booleanValue()) break block17;
                                    var4_3.q.q = true;
                                    var4_3 = var4_3.c0;
                                    var2_2.e0 = null;
                                    var2_2.f0 = null;
                                    var2_2.i0 = 3;
                                    if (var4_3.e(var1_1 /* !! */ , var2_2) != var6_6) break block12;
                                }
                                return var6_6;
                            }
                            return t.a;
                        }
                        return t.a;
                    }
                }, e8)) == ax.xb.b.c()) {
                    return object;
                }
                return t.a;
            }
        };
    }
}

