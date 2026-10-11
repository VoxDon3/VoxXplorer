/*
 * Decompiled with CFR 0.152.
 */
package ax.p8;

import android.content.Context;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.r;
import ax.Gb.w;
import ax.b8.e;
import ax.n8.B;
import ax.n8.x;
import ax.p8.d;
import ax.p8.h;
import ax.sb.o;
import ax.sb.t;
import ax.wb.i;
import ax.x7.m;

public final class f {
    public static final b c = new b(null);
    private static final ax.Ib.a<Context, ax.n0.f<ax.q0.d>> d = ax.p0.a.b(x.a.b(), new ax.o0.b<ax.q0.d>(ax.p8.f$a.q), null, null, 12, null);
    private final h a;
    private final h b;

    private f(Context context, i i8, i i9, e e8, ax.n8.b b8) {
        this(new ax.p8.b(context), new ax.p8.c(i9, e8, b8, new d(b8, i8, null, 4, null), f.c.b(context)));
    }

    public f(h h8, h h9) {
        l.f(h8, "localOverrideSettings");
        l.f(h9, "remoteSettings");
        this.a = h8;
        this.b = h9;
    }

    public f(ax.x7.f f8, i i8, i i9, e e8) {
        l.f(f8, "firebaseApp");
        l.f(i8, "blockingDispatcher");
        l.f(i9, "backgroundDispatcher");
        l.f(e8, "firebaseInstallationsApi");
        Context context = f8.k();
        l.e(context, "firebaseApp.applicationContext");
        this(context, i8, i9, e8, B.a.b(f8));
    }

    private final boolean e(double d8) {
        return 0.0 <= d8 && d8 <= 1.0;
    }

    private final boolean f(long l8) {
        return ax.Pb.a.L(l8) && ax.Pb.a.G(l8);
    }

    public final double b() {
        double d8;
        Double d9 = this.a.d();
        if (d9 != null && this.e(d8 = ((Number)d9).doubleValue())) {
            return d8;
        }
        d9 = this.b.d();
        if (d9 != null && this.e(d8 = ((Number)d9).doubleValue())) {
            return d8;
        }
        return 1.0;
    }

    public final long c() {
        long l8;
        Object object = this.a.b();
        if (object != null && this.f(l8 = ((ax.Pb.a)object).P())) {
            return l8;
        }
        object = this.b.b();
        if (object != null && this.f(l8 = ((ax.Pb.a)object).P())) {
            return l8;
        }
        object = ax.Pb.a.c0;
        return ax.Pb.c.h(30, ax.Pb.d.g0);
    }

    public final boolean d() {
        Boolean bl = this.a.a();
        if (bl != null) {
            return bl;
        }
        bl = this.b.a();
        if (bl != null) {
            return bl;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public final Object g(ax.wb.e<? super t> var1_1) {
        block8: {
            block10: {
                block9: {
                    block5: {
                        block6: {
                            block7: {
                                if (!(var1_1 instanceof c)) ** GOTO lbl-1000
                                var3_2 = var1_1;
                                var2_3 = var3_2.h0;
                                if ((var2_3 & -2147483648) != 0) {
                                    var3_2.h0 = var2_3 + -2147483648;
                                    var1_1 = var3_2;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var1_1 = new ax.yb.d(this, var1_1){
                                        Object e0;
                                        Object f0;
                                        final f g0;
                                        int h0;
                                        {
                                            this.g0 = f8;
                                            super(e8);
                                        }

                                        @Override
                                        public final Object p(Object object) {
                                            this.f0 = object;
                                            this.h0 |= Integer.MIN_VALUE;
                                            return this.g0.g(this);
                                        }
                                    };
                                }
                                var5_4 = var1_1.f0;
                                var4_5 = ax.xb.b.c();
                                var2_3 = var1_1.h0;
                                if (var2_3 == 0) break block5;
                                if (var2_3 == 1) break block6;
                                if (var2_3 != 2) break block7;
                                o.b(var5_4);
                                break block8;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var3_2 = (f)var1_1.e0;
                        o.b(var5_4);
                        break block9;
                    }
                    o.b(var5_4);
                    var3_2 = this.a;
                    var1_1.e0 = this;
                    var1_1.h0 = 1;
                    if (var3_2.c(var1_1) == var4_5) break block10;
                    var3_2 = this;
                }
                var3_2 = var3_2.b;
                var1_1.e0 = null;
                var1_1.h0 = 2;
                if (var3_2.c(var1_1) != var4_5) break block8;
            }
            return var4_5;
        }
        return t.a;
    }

    public static final class b {
        static final ax.Mb.g<Object>[] a = new ax.Mb.g[]{w.e(new r(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        private final ax.n0.f<ax.q0.d> b(Context context) {
            return (ax.n0.f)d.a(context, a[0]);
        }

        public final f c() {
            f f8 = m.a(ax.x7.c.a).j(f.class);
            l.e(f8, "Firebase.app[SessionsSettings::class.java]");
            return f8;
        }
    }
}

