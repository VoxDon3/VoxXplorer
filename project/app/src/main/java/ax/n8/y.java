/*
 * Decompiled with CFR 0.152.
 */
package ax.n8;

import android.content.Context;
import android.util.Log;
import ax.Fb.p;
import ax.Fb.q;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.r;
import ax.Gb.w;
import ax.Qb.J;
import ax.Qb.K;
import ax.n8.m;
import ax.n8.x;
import ax.q0.d;
import ax.q0.e;
import ax.q0.f;
import ax.sb.o;
import ax.sb.t;
import ax.wb.i;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

public final class y
implements com.google.firebase.sessions.a {
    private static final c f = new c(null);
    private static final ax.Ib.a<Context, ax.n0.f<ax.q0.d>> g = ax.p0.a.b(x.a.a(), new ax.o0.b<ax.q0.d>(ax.n8.y$b.q), null, null, 12, null);
    private final Context b;
    private final i c;
    private final AtomicReference<m> d;
    private final ax.Tb.b<m> e;

    public y(Context context, i i8) {
        l.f(context, "context");
        l.f(i8, "backgroundDispatcher");
        this.b = context;
        this.c = i8;
        this.d = new AtomicReference();
        this.e = new ax.Tb.b<m>(ax.Tb.d.a(y.f.b(context).b(), new q<ax.Tb.c<? super ax.q0.d>, Throwable, ax.wb.e<? super t>, Object>(null){
            int f0;
            private Object g0;
            Object h0;

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final Object p(Object object) {
                Object object2 = ax.xb.b.c();
                int n8 = this.f0;
                if (n8 != 0) {
                    if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    o.b(object);
                    return t.a;
                } else {
                    o.b(object);
                    object = (ax.Tb.c)this.g0;
                    Log.e((String)"FirebaseSessionsRepo", (String)"Error reading stored session data.", (Throwable)((Throwable)this.h0));
                    ax.q0.d d8 = ax.q0.e.a();
                    this.g0 = null;
                    this.f0 = 1;
                    if (object.e(d8, this) != object2) return t.a;
                    return object2;
                }
            }

            public final Object u(ax.Tb.c<? super ax.q0.d> c8, Throwable throwable, ax.wb.e<? super t> q8) {
                q8 = new /* invalid duplicate definition of identical inner class */;
                q8.g0 = c8;
                q8.h0 = throwable;
                return q8.p(t.a);
            }
        }), this){
            final y c0;
            final ax.Tb.b q;
            {
                this.q = b8;
                this.c0 = y8;
            }

            @Override
            public Object a(ax.Tb.c object, ax.wb.e e8) {
                if ((object = this.q.a(new ax.Tb.c((ax.Tb.c)object, this.c0){
                    final y c0;
                    final ax.Tb.c q;
                    {
                        this.q = c8;
                        this.c0 = y8;
                    }

                    /*
                     * Unable to fully structure code
                     */
                    public final Object e(Object var1_1, ax.wb.e var2_2) {
                        if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                        var4_3 = var2_2;
                        var3_4 = var4_3.f0;
                        if ((var3_4 & -2147483648) != 0) {
                            var4_3.f0 = var3_4 + -2147483648;
                            var2_2 = var4_3;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_2 = new ax.yb.d(this, (ax.wb.e)var2_2){
                                Object e0;
                                int f0;
                                final a g0;
                                {
                                    this.g0 = a8;
                                    super(e8);
                                }

                                @Override
                                public final Object p(Object object) {
                                    this.e0 = object;
                                    this.f0 |= Integer.MIN_VALUE;
                                    return this.g0.e((Object)null, (ax.wb.e)this);
                                }
                            };
                        }
                        var5_5 = var2_2.e0;
                        var4_3 = ax.xb.b.c();
                        var3_4 = var2_2.f0;
                        if (var3_4 == 0) ** GOTO lbl17
                        if (var3_4 == 1) {
                            o.b(var5_5);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl17:
                            // 1 sources

                            o.b(var5_5);
                            var5_5 = this.q;
                            var1_1 = (ax.q0.d)var1_1;
                            var1_1 = y.h(this.c0, (ax.q0.d)var1_1);
                            var2_2.f0 = 1;
                            if (var5_5.e(var1_1, (ax.wb.e<? super t>)var2_2) == var4_3) {
                                return var4_3;
                            }
                        }
                        return t.a;
                    }
                }, e8)) == ax.xb.b.c()) {
                    return object;
                }
                return t.a;
            }
        };
        ax.Qb.g.d(K.a(i8), null, null, new p<J, ax.wb.e<? super t>, Object>(this, null){
            int f0;
            final y g0;
            {
                this.g0 = y8;
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
            public final Object p(Object c8) {
                Object object = ax.xb.b.c();
                int n8 = this.f0;
                if (n8 != 0) {
                    if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    o.b(c8);
                    return t.a;
                } else {
                    o.b(c8);
                    ax.Tb.b b8 = this.g0.e;
                    c8 = new ax.Tb.c(this.g0){
                        final y q;
                        {
                            this.q = y8;
                        }

                        public final Object a(m m8, ax.wb.e<? super t> e8) {
                            this.q.d.set(m8);
                            return t.a;
                        }
                    };
                    this.f0 = 1;
                    if (b8.a(c8, this) != object) return t.a;
                    return object;
                }
            }

            public final Object u(J j8, ax.wb.e<? super t> e8) {
                return (this.a(j8, e8)).p(t.a);
            }
        }, 3, null);
    }

    public static final /* synthetic */ m h(y y8, ax.q0.d d8) {
        return y8.i(d8);
    }

    private final m i(ax.q0.d d8) {
        return new m(d8.b(ax.n8.y$d.a.a()));
    }

    @Override
    public String a() {
        m m8 = this.d.get();
        if (m8 != null) {
            return m8.a();
        }
        return null;
    }

    @Override
    public void b(String string) {
        l.f(string, "sessionId");
        ax.Qb.g.d(K.a(this.c), null, null, new p<J, ax.wb.e<? super t>, Object>(this, string, null){
            int f0;
            final y g0;
            final String h0;
            {
                this.g0 = y8;
                this.h0 = string;
                super(2, e8);
            }

            @Override
            public final ax.wb.e<t> a(Object object, ax.wb.e<?> e8) {
                return new /* invalid duplicate definition of identical inner class */;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final Object p(Object object) {
                IOException iOException2;
                Object object2 = ax.xb.b.c();
                int n8 = this.f0;
                if (n8 != 0) {
                    if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    try {
                        o.b(object);
                        return t.a;
                    }
                    catch (IOException iOException2) {}
                } else {
                    o.b(object);
                    {
                        object = f.b(this.g0.b);
                        p<ax.q0.a, ax.wb.e<? super t>, Object> p8 = new p<ax.q0.a, ax.wb.e<? super t>, Object>(this.h0, null){
                            int f0;
                            Object g0;
                            final String h0;
                            {
                                this.h0 = string;
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
                                    ((ax.q0.a)this.g0).i(ax.n8.y$d.a.a(), this.h0);
                                    return t.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }

                            public final Object u(ax.q0.a a8, ax.wb.e<? super t> e8) {
                                return (this.a(a8, e8)).p(t.a);
                            }
                        };
                        this.f0 = 1;
                        object = ax.q0.g.a((ax.n0.f<ax.q0.d>)object, (p<? super ax.q0.a, ? super ax.wb.e<? super t>, ? extends Object>)p8, this);
                        if (object != object2) return t.a;
                        return object2;
                    }
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Failed to update session Id: ");
                ((StringBuilder)object).append(iOException2);
                Log.w((String)"FirebaseSessionsRepo", (String)((StringBuilder)object).toString());
                return t.a;
            }

            public final Object u(J j8, ax.wb.e<? super t> e8) {
                return (this.a(j8, e8)).p(t.a);
            }
        }, 3, null);
    }

    private static final class c {
        static final ax.Mb.g<Object>[] a = new ax.Mb.g[]{w.e(new r(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private c() {
        }

        public /* synthetic */ c(g g8) {
            this();
        }

        private final ax.n0.f<ax.q0.d> b(Context context) {
            return (ax.n0.f)g.a(context, a[0]);
        }
    }

    private static final class d {
        public static final d a = new d();
        private static final d.a<String> b = ax.q0.f.f("session_id");

        private d() {
        }

        public final d.a<String> a() {
            return b;
        }
    }
}

