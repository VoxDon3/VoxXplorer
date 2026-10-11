/*
 * Decompiled with CFR 0.152.
 */
package ax.p8;

import android.util.Log;
import ax.Fb.p;
import ax.Gb.l;
import ax.Qb.J;
import ax.Tb.d;
import ax.n0.f;
import ax.p8.e;
import ax.q0.a;
import ax.q0.d;
import ax.sb.o;
import ax.sb.t;
import java.io.IOException;

public final class g {
    private static final b c = new b(null);
    private static final d.a<Boolean> d = ax.q0.f.a("firebase_sessions_enabled");
    private static final d.a<Double> e = ax.q0.f.b("firebase_sessions_sampling_rate");
    private static final d.a<Integer> f = ax.q0.f.d("firebase_sessions_restart_timeout");
    private static final d.a<Integer> g = ax.q0.f.d("firebase_sessions_cache_duration");
    private static final d.a<Long> h = ax.q0.f.e("firebase_sessions_cache_updated_time");
    private final f<ax.q0.d> a;
    private e b;

    public g(f<ax.q0.d> f8) {
        l.f(f8, "dataStore");
        this.a = f8;
        ax.Qb.g.f(null, new p<J, ax.wb.e<? super t>, Object>(this, null){
            Object f0;
            int g0;
            final g h0;
            {
                this.h0 = g8;
                super(2, e8);
            }

            @Override
            public final ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object p(Object object) {
                Object object2;
                Object object3 = ax.xb.b.c();
                int n8 = this.g0;
                if (n8 != 0) {
                    if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    object3 = (g)this.f0;
                    o.b(object);
                    object2 = object;
                } else {
                    o.b(object);
                    object = this.h0;
                    object2 = ((g)object).a.b();
                    this.f0 = object;
                    this.g0 = 1;
                    object2 = ax.Tb.d.f(object2, this);
                    if (object2 == object3) {
                        return object3;
                    }
                    object3 = object;
                }
                ((g)object3).l(((ax.q0.d)object2).d());
                return t.a;
            }

            public final Object u(J j8, ax.wb.e<? super t> e8) {
                return (this.a(j8, e8)).p(t.a);
            }
        }, 1, null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final <T> Object h(d.a<T> var1_1, T var2_3, ax.wb.e<? super t> var3_4) {
        if (!(var3_4 instanceof c)) ** GOTO lbl-1000
        var5_5 = var3_4;
        var4_6 = var5_5.g0;
        if ((var4_6 & -2147483648) != 0) {
            var5_5.g0 = var4_6 + -2147483648;
            var3_4 = var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_4 = new ax.yb.d(this, (ax.wb.e<? super c>)var3_4){
                Object e0;
                final g f0;
                int g0;
                {
                    this.f0 = g8;
                    super(e8);
                }

                @Override
                public final Object p(Object object) {
                    this.e0 = object;
                    this.g0 |= Integer.MIN_VALUE;
                    return this.f0.h(null, null, this);
                }
            };
        }
        var6_7 = var3_4.e0;
        var5_5 = ax.xb.b.c();
        var4_6 = var3_4.g0;
        if (var4_6 != 0) {
            if (var4_6 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            try {
                o.b(var6_7);
                return t.a;
            }
            catch (IOException var1_2) {}
        } else {
            o.b(var6_7);
            {
                var7_8 = this.a;
                var6_7 = new p<a, ax.wb.e<? super t>, Object>(var2_3, var1_1, this, null){
                    int f0;
                    Object g0;
                    final T h0;
                    final d.a<T> i0;
                    final g j0;
                    {
                        this.h0 = t8;
                        this.i0 = a8;
                        this.j0 = g8;
                        super(2, e8);
                    }

                    @Override
                    public final ax.wb.e<t> a(Object object, ax.wb.e<?> p8) {
                        p8 = new /* invalid duplicate definition of identical inner class */;
                        p8.g0 = object;
                        return p8;
                    }

                    @Override
                    public final Object p(Object object) {
                        ax.xb.b.c();
                        if (this.f0 == 0) {
                            o.b(object);
                            object = (a)this.g0;
                            Object t8 = this.h0;
                            if (t8 != null) {
                                ((a)object).i(this.i0, t8);
                            } else {
                                ((a)object).h(this.i0);
                            }
                            this.j0.l((ax.q0.d)object);
                            return t.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    public final Object u(a a8, ax.wb.e<? super t> e8) {
                        return (this.a(a8, e8)).p(t.a);
                    }
                };
                var3_4.g0 = 1;
                var1_1 = ax.q0.g.a(var7_8, (p<? super a, ? super ax.wb.e<? super t>, ? extends Object>)var6_7, (ax.wb.e<? super ax.q0.d>)var3_4);
                if (var1_1 != var5_5) return t.a;
                return var5_5;
            }
        }
        var2_3 = new StringBuilder();
        var2_3.append("Failed to update cache config value: ");
        var2_3.append(var1_2);
        Log.w((String)"SettingsCache", (String)var2_3.toString());
        return t.a;
    }

    private final void l(ax.q0.d d8) {
        this.b = new e(d8.b(d), d8.b(e), d8.b(f), d8.b(g), d8.b(h));
    }

    public final boolean d() {
        Object object = this.b;
        Object var2_2 = null;
        Object object2 = object;
        if (object == null) {
            l.t("sessionConfigs");
            object2 = null;
        }
        object = ((e)object2).b();
        object2 = this.b;
        if (object2 == null) {
            l.t("sessionConfigs");
            object2 = var2_2;
        }
        object2 = ((e)object2).a();
        return object == null || object2 == null || (System.currentTimeMillis() - (Long)object) / (long)1000 >= (long)((Integer)object2).intValue();
    }

    public final Integer e() {
        e e8;
        e e9 = e8 = this.b;
        if (e8 == null) {
            l.t("sessionConfigs");
            e9 = null;
        }
        return e9.d();
    }

    public final Double f() {
        e e8;
        e e9 = e8 = this.b;
        if (e8 == null) {
            l.t("sessionConfigs");
            e9 = null;
        }
        return e9.e();
    }

    public final Boolean g() {
        e e8;
        e e9 = e8 = this.b;
        if (e8 == null) {
            l.t("sessionConfigs");
            e9 = null;
        }
        return e9.c();
    }

    public final Object i(Double object, ax.wb.e<? super t> e8) {
        if ((object = this.h(e, object, e8)) == ax.xb.b.c()) {
            return object;
        }
        return t.a;
    }

    public final Object j(Integer object, ax.wb.e<? super t> e8) {
        if ((object = this.h(g, object, e8)) == ax.xb.b.c()) {
            return object;
        }
        return t.a;
    }

    public final Object k(Long object, ax.wb.e<? super t> e8) {
        if ((object = this.h(h, object, e8)) == ax.xb.b.c()) {
            return object;
        }
        return t.a;
    }

    public final Object m(Integer object, ax.wb.e<? super t> e8) {
        if ((object = this.h(f, object, e8)) == ax.xb.b.c()) {
            return object;
        }
        return t.a;
    }

    public final Object n(Boolean object, ax.wb.e<? super t> e8) {
        if ((object = this.h(d, object, e8)) == ax.xb.b.c()) {
            return object;
        }
        return t.a;
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(ax.Gb.g g8) {
            this();
        }
    }
}

