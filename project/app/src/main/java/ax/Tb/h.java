/*
 * Decompiled with CFR 0.152.
 */
package ax.Tb;

import ax.Fb.q;
import ax.Gb.k;
import ax.Gb.l;
import ax.Gb.v;
import ax.Qb.s0;
import ax.Tb.d;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.wb.i;
import java.util.concurrent.CancellationException;

final class h {
    public static final <T> ax.Tb.b<T> a(ax.Tb.b<? extends T> b8, q<? super ax.Tb.c<? super T>, ? super Throwable, ? super e<? super t>, ? extends Object> q8) {
        return new ax.Tb.b<T>(b8, q8){
            final q c0;
            final ax.Tb.b q;
            {
                this.q = b8;
                this.c0 = q8;
            }

            /*
             * Unable to fully structure code
             * Could not resolve type clashes
             */
            @Override
            public Object a(ax.Tb.c<? super T> var1_1, e<? super t> var2_2) {
                block8: {
                    block10: {
                        block9: {
                            block5: {
                                block6: {
                                    block7: {
                                        if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                                        var4_3 = var2_2;
                                        var3_4 = var4_3.f0;
                                        if ((var3_4 & -2147483648) != 0) {
                                            var4_3.f0 = var3_4 + -2147483648;
                                            var2_2 = var4_3;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var2_2 = new ax.yb.d(this, var2_2){
                                                Object e0;
                                                int f0;
                                                final a g0;
                                                Object h0;
                                                Object i0;
                                                {
                                                    this.g0 = a8;
                                                    super(e8);
                                                }

                                                @Override
                                                public final Object p(Object object) {
                                                    this.e0 = object;
                                                    this.f0 |= Integer.MIN_VALUE;
                                                    return this.g0.a(null, this);
                                                }
                                            };
                                        }
                                        var5_5 = var2_2.e0;
                                        var6_6 = ax.xb.b.c();
                                        var3_4 = var2_2.f0;
                                        if (var3_4 == 0) break block5;
                                        if (var3_4 == 1) break block6;
                                        if (var3_4 != 2) break block7;
                                        o.b(var5_5);
                                        break block8;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                var1_1 /* !! */  = (ax.Tb.c)var2_2.i0;
                                var4_3 = var2_2.h0;
                                o.b(var5_5);
                                break block9;
                            }
                            o.b(var5_5);
                            var4_3 = this.q;
                            var2_2.h0 = this;
                            var2_2.i0 = var1_1 /* !! */ ;
                            var2_2.f0 = 1;
                            var5_5 = d.b(var4_3, var1_1 /* !! */ , var2_2);
                            if (var5_5 == var6_6) break block10;
                            var4_3 = this;
                        }
                        var5_5 = (Throwable)var5_5;
                        if (var5_5 == null) break block8;
                        var4_3 = var4_3.c0;
                        var2_2.h0 = null;
                        var2_2.i0 = null;
                        var2_2.f0 = 2;
                        k.c(6);
                        var1_1 /* !! */  = var4_3.c(var1_1 /* !! */ , var5_5, var2_2);
                        k.c(7);
                        if (var1_1 /* !! */  != var6_6) break block8;
                    }
                    return var6_6;
                }
                return t.a;
            }
        };
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final <T> Object b(ax.Tb.b<? extends T> var0, ax.Tb.c<? super T> var1_4, e<? super Throwable> var2_5) {
        block12: {
            block11: {
                if (!(var2_5 instanceof b)) ** GOTO lbl-1000
                var4_6 = var2_5;
                var3_7 = var4_6.g0;
                if ((var3_7 & -2147483648) != 0) {
                    var4_6.g0 = var3_7 + -2147483648;
                    var2_5 = var4_6;
                } else lbl-1000:
                // 2 sources

                {
                    var2_5 = new ax.yb.d((e<? super b>)var2_5){
                        Object e0;
                        Object f0;
                        int g0;

                        @Override
                        public final Object p(Object object) {
                            this.f0 = object;
                            this.g0 |= Integer.MIN_VALUE;
                            return d.b(null, null, this);
                        }
                    };
                }
                var4_6 = var2_5.f0;
                var5_8 = ax.xb.b.c();
                var3_7 = var2_5.g0;
                if (var3_7 != 0) {
                    if (var3_7 == 1) {
                        var1_4 /* !! */  = (v)var2_5.e0;
                        try {
                            o.b(var4_6);
                            break block11;
                        }
                        catch (Throwable var0_1) {
                            break block12;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(var4_6);
                var4_6 = new v<Throwable>();
                try {
                    var6_9 = new ax.Tb.c(var1_4 /* !! */ , var4_6){
                        final v<Throwable> c0;
                        final ax.Tb.c<T> q;
                        {
                            this.q = c8;
                            this.c0 = v8;
                        }

                        /*
                         * Unable to fully structure code
                         * Could not resolve type clashes
                         */
                        @Override
                        public final Object e(T var1_1, e<? super t> var2_5) {
                            block9: {
                                block8: {
                                    if (!(var2_5 instanceof a)) ** GOTO lbl-1000
                                    var4_6 = var2_5;
                                    var3_7 = var4_6.h0;
                                    if ((var3_7 & -2147483648) != 0) {
                                        var4_6.h0 = var3_7 + -2147483648;
                                        var2_5 = var4_6;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var2_5 = new ax.yb.d(this, (e<? super a>)var2_5){
                                            Object e0;
                                            Object f0;
                                            final c<T> g0;
                                            int h0;
                                            {
                                                this.g0 = c8;
                                                super(e8);
                                            }

                                            @Override
                                            public final Object p(Object object) {
                                                this.f0 = object;
                                                this.h0 |= Integer.MIN_VALUE;
                                                return this.g0.e(null, this);
                                            }
                                        };
                                    }
                                    var5_8 = var2_5.f0;
                                    var4_6 = ax.xb.b.c();
                                    var3_7 = var2_5.h0;
                                    if (var3_7 != 0) {
                                        if (var3_7 == 1) {
                                            var2_5 = var2_5.e0;
                                            try {
                                                o.b(var5_8);
                                                break block8;
                                            }
                                            catch (Throwable var1_2) {
                                                break block9;
                                            }
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    o.b(var5_8);
                                    try {
                                        var5_8 = this.q;
                                        var2_5.e0 = this;
                                        var2_5.h0 = 1;
                                        var1_1 /* !! */  = var5_8.e(var1_1 /* !! */ , (e<t>)var2_5);
                                        if (var1_1 /* !! */  != var4_6) break block8;
                                        return var4_6;
                                    }
                                    catch (Throwable var1_3) {
                                        var2_5 = this;
                                    }
                                }
                                return t.a;
                            }
                            var2_5.c0.q = var1_4;
                            throw var1_4;
                        }
                    };
                    var2_5.e0 = var4_6;
                    var2_5.g0 = 1;
                    var0 = var0.a(var6_9, (e<t>)var2_5);
                    if (var0 != var5_8) break block11;
                    return var5_8;
                }
                catch (Throwable var0_2) {
                    var1_4 /* !! */  = var4_6;
                }
            }
            return null;
        }
        var1_4 /* !! */  = (Throwable)var1_4 /* !! */ .q;
        if (!h.d((Throwable)var0_3, var1_4 /* !! */ ) && !h.c((Throwable)var0_3, var2_5.b())) {
            if (var1_4 /* !! */  == null) {
                return var0_3;
            }
            if (var0_3 instanceof CancellationException) {
                ax.sb.a.a(var1_4 /* !! */ , (Throwable)var0_3);
                throw var1_4 /* !! */ ;
            }
            ax.sb.a.a((Throwable)var0_3, var1_4 /* !! */ );
            throw var0_3;
        }
        throw var0_3;
    }

    private static final boolean c(Throwable throwable, i i8) {
        if ((i8 = i8.a(s0.c)) != null && i8.isCancelled()) {
            return h.d(throwable, i8.o());
        }
        return false;
    }

    private static final boolean d(Throwable throwable, Throwable throwable2) {
        return throwable2 != null && l.a(throwable2, throwable);
    }
}

