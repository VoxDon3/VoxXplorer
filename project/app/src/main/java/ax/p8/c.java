/*
 * Decompiled with CFR 0.152.
 */
package ax.p8;

import android.os.Build;
import android.util.Log;
import ax.Fb.p;
import ax.Gb.l;
import ax.Gb.v;
import ax.Gb.y;
import ax.Pb.a;
import ax.b8.e;
import ax.n0.f;
import ax.p8.g;
import ax.p8.h;
import ax.q0.d;
import ax.sb.m;
import ax.sb.o;
import ax.sb.q;
import ax.sb.t;
import ax.tb.F;
import ax.wb.i;
import ax.xb.b;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
implements h {
    private static final a g = new a(null);
    private final i a;
    private final e b;
    private final ax.n8.b c;
    private final ax.p8.a d;
    private final ax.sb.h e;
    private final ax.Zb.a f;

    public c(i i8, e e8, ax.n8.b b8, ax.p8.a a8, f<d> f8) {
        l.f(i8, "backgroundDispatcher");
        l.f(e8, "firebaseInstallationsApi");
        l.f(b8, "appInfo");
        l.f(a8, "configsFetcher");
        l.f(f8, "dataStore");
        this.a = i8;
        this.b = e8;
        this.c = b8;
        this.d = a8;
        this.e = ax.sb.i.a(new ax.Fb.a<g>(f8){
            final f<d> q;
            {
                this.q = f8;
                super(0);
            }

            public final g a() {
                return new g(this.q);
            }
        });
        this.f = ax.Zb.c.b(false, 1, null);
    }

    public static final /* synthetic */ g e(c c8) {
        return c8.f();
    }

    private final g f() {
        return (g)this.e.getValue();
    }

    private final String g(String string) {
        return new ax.Ob.g("/").b(string, "");
    }

    @Override
    public Boolean a() {
        return this.f().g();
    }

    @Override
    public ax.Pb.a b() {
        Integer n8 = this.f().e();
        if (n8 != null) {
            a.a a8 = ax.Pb.a.c0;
            return ax.Pb.a.h(ax.Pb.c.h(n8, ax.Pb.d.f0));
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object c(ax.wb.e<? super t> var1_1) {
        block20: {
            block19: {
                block21: {
                    if (!(var1_1 instanceof c)) ** GOTO lbl-1000
                    var5_2 = var1_1;
                    var2_3 = var5_2.i0;
                    if ((var2_3 & -2147483648) != 0) {
                        var5_2.i0 = var2_3 + -2147483648;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_2 = new ax.yb.d(this, (ax.wb.e<? super c>)var1_1){
                            Object e0;
                            Object f0;
                            Object g0;
                            final c h0;
                            int i0;
                            {
                                this.h0 = c8;
                                super(e8);
                            }

                            @Override
                            public final Object p(Object object) {
                                this.g0 = object;
                                this.i0 |= Integer.MIN_VALUE;
                                return this.h0.c(this);
                            }
                        };
                    }
                    var6_4 = var5_2.g0;
                    var8_5 = ax.xb.b.c();
                    var2_3 = var5_2.i0;
                    if (var2_3 != 0) {
                        if (var2_3 != 1) {
                            if (var2_3 != 2) {
                                if (var2_3 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                var3_6 = (ax.Zb.a)var5_2.e0;
                                var1_1 = var3_6;
                                try {
                                    o.b(var6_4);
                                    break block19;
                                }
                                catch (Throwable var3_7) {
                                    break block20;
                                }
                            }
                            var3_6 = (ax.Zb.a)var5_2.f0;
                            var4_10 = (c)var5_2.e0;
                            var1_1 = var3_6;
                            try {
                                o.b(var6_4);
                                break block21;
                            }
                            catch (Throwable var3_8) {
                                break block20;
                            }
                        }
                        var3_6 = (ax.Zb.a)var5_2.f0;
                        var4_10 = (c)var5_2.e0;
                        o.b(var6_4);
                    } else {
                        o.b(var6_4);
                        if (!this.f.b() && !this.f().d()) {
                            return t.a;
                        }
                        var3_6 = this.f;
                        var5_2.e0 = this;
                        var5_2.f0 = var3_6;
                        var5_2.i0 = 1;
                        if (var3_6.a(null, var5_2) == var8_5) {
                            return var8_5;
                        }
                        var4_10 = this;
                    }
                    var1_1 = var3_6;
                    {
                        if (!var4_10.f().d()) {
                            var1_1 = var3_6;
                            Log.d((String)"SessionConfigFetcher", (String)"Remote settings cache not expired. Using cached values.");
                            var1_1 = var3_6;
                            var4_10 = t.a;
                            var3_6.c(null);
                            return var4_10;
                        }
                        var1_1 = var3_6;
                    }
                    {
                        var7_11 = ax.n8.t.c;
                        var1_1 = var3_6;
                        var6_4 = var4_10.b;
                        var1_1 = var3_6;
                        var5_2.e0 = var4_10;
                        var1_1 = var3_6;
                        var5_2.f0 = var3_6;
                        var1_1 = var3_6;
                        var5_2.i0 = 2;
                        var1_1 = var3_6;
                        var7_11 = var7_11.a((e)var6_4, var5_2);
                        var6_4 = var7_11;
                        if (var7_11 != var8_5) break block21;
                        return var8_5;
                    }
                }
                var1_1 = var3_6;
                {
                    var6_4 = ((ax.n8.t)var6_4).b();
                    var1_1 = var3_6;
                    if (l.a(var6_4, "")) {
                        var1_1 = var3_6;
                        Log.w((String)"SessionConfigFetcher", (String)"Error getting Firebase Installation ID. Skipping this Session Event.");
                        var1_1 = var3_6;
                        var4_10 = t.a;
                        var3_6.c(null);
                        return var4_10;
                    }
                    var1_1 = var3_6;
                }
                {
                    var6_4 = q.a("X-Crashlytics-Installation-ID", var6_4);
                    var1_1 = var3_6;
                    var7_11 = y.a;
                    var1_1 = var3_6;
                    var7_11 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    var1_1 = var3_6;
                    l.e(var7_11, "format(format, *args)");
                    var1_1 = var3_6;
                    var7_11 = q.a("X-Crashlytics-Device-Model", super.g((String)var7_11));
                    var1_1 = var3_6;
                    var9_12 = Build.VERSION.INCREMENTAL;
                    var1_1 = var3_6;
                    l.e(var9_12, "INCREMENTAL");
                    var1_1 = var3_6;
                    var10_13 = q.a("X-Crashlytics-OS-Build-Version", super.g((String)var9_12));
                    var1_1 = var3_6;
                    var9_12 = Build.VERSION.RELEASE;
                    var1_1 = var3_6;
                    l.e(var9_12, "RELEASE");
                    var1_1 = var3_6;
                    var6_4 = F.i(new m[]{var6_4, var7_11, var10_13, q.a("X-Crashlytics-OS-Display-Version", super.g((String)var9_12)), q.a("X-Crashlytics-API-Client-Version", var4_10.c.f())});
                    var1_1 = var3_6;
                    Log.d((String)"SessionConfigFetcher", (String)"Fetching settings from server.");
                    var1_1 = var3_6;
                    var7_11 = var4_10.d;
                    var1_1 = var3_6;
                    var1_1 = var3_6;
                    var9_12 = new p<JSONObject, ax.wb.e<? super t>, Object>((c)var4_10, null){
                        Object f0;
                        Object g0;
                        int h0;
                        Object i0;
                        final c j0;
                        {
                            this.j0 = c8;
                            super(2, e8);
                        }

                        @Override
                        public final ax.wb.e<t> a(Object object, ax.wb.e<?> p8) {
                            p8 = new /* invalid duplicate definition of identical inner class */;
                            p8.i0 = object;
                            return p8;
                        }

                        /*
                         * Unable to fully structure code
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        @Override
                        public final Object p(Object var1_1) {
                            block25: {
                                block32: {
                                    block31: {
                                        block26: {
                                            block27: {
                                                block28: {
                                                    block30: {
                                                        block29: {
                                                            var6_2 = ax.xb.b.c();
                                                            switch (this.h0) {
                                                                default: {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                case 6: {
                                                                    o.b(var1_1);
                                                                    return t.a;
                                                                }
                                                                case 5: {
                                                                    o.b(var1_1);
                                                                    break block25;
                                                                }
                                                                case 4: {
                                                                    o.b(var1_1);
                                                                    break block26;
                                                                }
                                                                case 3: {
                                                                    var2_3 = (v)this.i0;
                                                                    o.b(var1_1);
                                                                    break block27;
                                                                }
                                                                case 2: {
                                                                    var2_3 = (v)this.f0;
                                                                    var4_6 = (v)this.i0;
                                                                    o.b(var1_1);
                                                                    var1_1 = var2_3;
                                                                    break block28;
                                                                }
                                                                case 1: {
                                                                    var2_3 = (v)this.g0;
                                                                    var3_7 = (v<T>)this.f0;
                                                                    var4_6 = (v)this.i0;
                                                                    o.b(var1_1);
                                                                    var1_1 = var4_6;
                                                                    break;
                                                                }
                                                                case 0: {
                                                                    o.b(var1_1);
                                                                    var1_1 = (JSONObject)this.i0;
                                                                    var2_3 = new StringBuilder();
                                                                    var2_3.append("Fetched settings: ");
                                                                    var2_3.append(var1_1);
                                                                    Log.d((String)"SessionConfigFetcher", (String)var2_3.toString());
                                                                    var5_8 = new v<T>();
                                                                    var3_7 = new v<T>();
                                                                    var4_6 = new v<T>();
                                                                    if (!var1_1.has("app_quality")) ** GOTO lbl71
                                                                    var1_1 = var1_1.get("app_quality");
                                                                    l.d(var1_1, "null cannot be cast to non-null type org.json.JSONObject");
                                                                    var7_9 = (JSONObject)var1_1;
                                                                    try {
                                                                        var1_1 = var7_9.has("sessions_enabled") != false ? (Boolean)var7_9.get("sessions_enabled") : null;
                                                                    }
                                                                    catch (JSONException var2_4) {
                                                                        var1_1 = null;
                                                                        ** GOTO lbl67
                                                                    }
                                                                    try {
                                                                        if (var7_9.has("sampling_rate")) {
                                                                            var5_8.q = (Double)var7_9.get("sampling_rate");
                                                                        }
                                                                    }
                                                                    catch (JSONException var2_5) {
                                                                        ** GOTO lbl67
                                                                    }
                                                                    if (var7_9.has("session_timeout_seconds")) {
                                                                        var3_7.q = (Integer)var7_9.get("session_timeout_seconds");
                                                                    }
                                                                    var2_3 = var1_1;
                                                                    if (var7_9.has("cache_duration")) {
                                                                        var4_6.q = (Integer)var7_9.get("cache_duration");
                                                                        var2_3 = var1_1;
                                                                    }
                                                                    ** GOTO lbl72
lbl67:
                                                                    // 2 sources

                                                                    Log.e((String)"SessionConfigFetcher", (String)"Error parsing the configs remotely fetched: ", var2_3);
                                                                    var2_3 = var1_1;
                                                                    ** GOTO lbl72
lbl71:
                                                                    // 1 sources

                                                                    var2_3 = null;
lbl72:
                                                                    // 3 sources

                                                                    if (var2_3 == null) break block29;
                                                                    var1_1 = ax.p8.c.e(this.j0);
                                                                    this.i0 = var5_8;
                                                                    this.f0 = var3_7;
                                                                    this.g0 = var4_6;
                                                                    this.h0 = 1;
                                                                    if (var1_1.n((Boolean)var2_3, this) == var6_2) {
                                                                        return var6_2;
                                                                    }
                                                                    var1_1 = var5_8;
                                                                    var2_3 = var4_6;
                                                                }
                                                            }
                                                            var5_8 = var3_7;
                                                            var3_7 = var1_1;
                                                            break block30;
                                                        }
                                                        var1_1 = var5_8;
                                                        var2_3 = var4_6;
                                                        var5_8 = var3_7;
                                                        var3_7 = var1_1;
                                                    }
                                                    var1_1 = var2_3;
                                                    var4_6 = var3_7;
                                                    if ((Integer)var5_8.q != null) {
                                                        var7_9 = ax.p8.c.e(this.j0);
                                                        var5_8 = (Integer)var5_8.q;
                                                        this.i0 = var3_7;
                                                        this.f0 = var2_3;
                                                        this.g0 = null;
                                                        this.h0 = 2;
                                                        var1_1 = var2_3;
                                                        var4_6 = var3_7;
                                                        if (var7_9.m((Integer)var5_8, this) == var6_2) {
                                                            return var6_2;
                                                        }
                                                    }
                                                }
                                                var2_3 = var1_1;
                                                if ((Double)var4_6.q != null) {
                                                    var3_7 = ax.p8.c.e(this.j0);
                                                    var4_6 = (Double)var4_6.q;
                                                    this.i0 = var1_1;
                                                    this.f0 = null;
                                                    this.g0 = null;
                                                    this.h0 = 3;
                                                    var2_3 = var1_1;
                                                    if (var3_7.i((Double)var4_6, this) == var6_2) {
                                                        return var6_2;
                                                    }
                                                }
                                            }
                                            if ((Integer)var2_3.q != null) {
                                                var1_1 = ax.p8.c.e(this.j0);
                                                var2_3 = (Integer)var2_3.q;
                                                this.i0 = null;
                                                this.f0 = null;
                                                this.g0 = null;
                                                this.h0 = 4;
                                                if (var1_1.j((Integer)var2_3, this) == var6_2) {
                                                    return var6_2;
                                                } else {
                                                    ** GOTO lbl127
                                                }
                                            }
                                            break block31;
                                        }
                                        var1_1 = t.a;
                                        break block32;
                                    }
                                    var1_1 = null;
                                }
                                if (var1_1 == null) {
                                    var1_1 = ax.p8.c.e(this.j0);
                                    var2_3 = ax.yb.b.b(86400);
                                    this.i0 = null;
                                    this.f0 = null;
                                    this.g0 = null;
                                    this.h0 = 5;
                                    if (var1_1.j((Integer)var2_3, this) == var6_2) {
                                        return var6_2;
                                    }
                                }
                            }
                            var1_1 = ax.p8.c.e(this.j0);
                            var2_3 = ax.yb.b.c(System.currentTimeMillis());
                            this.i0 = null;
                            this.f0 = null;
                            this.g0 = null;
                            this.h0 = 6;
                            if (var1_1.k((Long)var2_3, this) != var6_2) return t.a;
                            return var6_2;
                        }

                        public final Object u(JSONObject jSONObject, ax.wb.e<? super t> e8) {
                            return (this.a(jSONObject, e8)).p(t.a);
                        }
                    };
                    var1_1 = var3_6;
                    var1_1 = var3_6;
                    var4_10 = new p<String, ax.wb.e<? super t>, Object>(null){
                        int f0;
                        Object g0;

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
                                object = (String)this.g0;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Error failing to fetch the remote configs: ");
                                stringBuilder.append((String)object);
                                Log.e((String)"SessionConfigFetcher", (String)stringBuilder.toString());
                                return t.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        public final Object u(String string, ax.wb.e<? super t> e8) {
                            return (this.a(string, e8)).p(t.a);
                        }
                    };
                    var1_1 = var3_6;
                    var5_2.e0 = var3_6;
                    var1_1 = var3_6;
                    var5_2.f0 = null;
                    var1_1 = var3_6;
                    var5_2.i0 = 3;
                    var1_1 = var3_6;
                    var4_10 = var7_11.a(var6_4, (p<? super JSONObject, ? super ax.wb.e<? super t>, ? extends Object>)var9_12, (p<? super String, ? super ax.wb.e<? super t>, ? extends Object>)var4_10, var5_2);
                    if (var4_10 != var8_5) break block19;
                }
                return var8_5;
            }
            var1_1 = var3_6;
            {
                var4_10 = t.a;
                var3_6.c(null);
                return t.a;
            }
        }
        var1_1.c(null);
        throw var3_9;
    }

    @Override
    public Double d() {
        return this.f().f();
    }

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(ax.Gb.g g8) {
            this();
        }
    }
}

