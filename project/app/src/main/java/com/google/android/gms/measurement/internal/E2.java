/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import ax.M5.p;
import ax.Q.b;
import ax.S5.e;
import ax.b6.M6;
import ax.b6.U0;
import ax.b6.Y2;
import ax.b6.g6;
import ax.b6.k7;
import ax.f6.D;
import ax.f6.a;
import ax.f6.o;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.D2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.F2;
import com.google.android.gms.measurement.internal.G2;
import com.google.android.gms.measurement.internal.N1;
import com.google.android.gms.measurement.internal.P1;
import com.google.android.gms.measurement.internal.Q1;
import com.google.android.gms.measurement.internal.R1;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.V4;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.Y3;
import com.google.android.gms.measurement.internal.Z3;
import com.google.android.gms.measurement.internal.a4;
import com.google.android.gms.measurement.internal.b1;
import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.e3;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.f4;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.j3;
import com.google.android.gms.measurement.internal.k3;
import com.google.android.gms.measurement.internal.k4;
import com.google.android.gms.measurement.internal.l3;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.z2;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class E2
implements g3 {
    private static volatile E2 I;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private int F;
    private AtomicInteger G;
    final long H;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final c f;
    private final h g;
    private final g2 h;
    private final V1 i;
    private final z2 j;
    private final V4 k;
    private final B5 l;
    private final R1 m;
    private final ax.R5.e n;
    private final f4 o;
    private final k3 p;
    private final z q;
    private final Y3 r;
    private final String s;
    private P1 t;
    private k4 u;
    private w v;
    private Q1 w;
    private boolean x;
    private Boolean y;
    private long z;

    private E2(j3 j32) {
        Object object;
        c c8;
        boolean bl = false;
        this.x = false;
        this.G = new AtomicInteger(0);
        ax.M5.p.l(j32);
        this.f = c8 = new c(j32.a);
        N1.a = c8;
        c8 = j32.a;
        this.a = c8;
        this.b = j32.b;
        this.c = j32.c;
        this.d = j32.d;
        this.e = j32.h;
        this.A = j32.e;
        this.s = j32.j;
        this.D = true;
        Object object2 = j32.g;
        if (object2 != null && (object = ((U0)object2).h0) != null) {
            if ((object = object.get("measurementEnabled")) instanceof Boolean) {
                this.B = (Boolean)object;
            }
            if ((object2 = ((U0)object2).h0.get("measurementDeactivated")) instanceof Boolean) {
                this.C = (Boolean)object2;
            }
        }
        Y2.l((Context)c8);
        object = ax.R5.h.c();
        this.n = object;
        object2 = j32.i;
        long l8 = object2 != null ? ((Long)object2).longValue() : object.a();
        this.H = l8;
        this.g = new h(this);
        object2 = new g2(this);
        ((e3)object2).q();
        this.h = object2;
        object2 = new V1(this);
        ((e3)object2).q();
        this.i = object2;
        object2 = new B5(this);
        ((e3)object2).q();
        this.l = object2;
        this.m = new R1(new l3(j32, this));
        this.q = new z(this);
        object2 = new f4(this);
        ((b1)object2).w();
        this.o = object2;
        object2 = new k3(this);
        ((b1)object2).w();
        this.p = object2;
        object2 = new V4(this);
        ((b1)object2).w();
        this.k = object2;
        object2 = new Y3(this);
        ((e3)object2).q();
        this.r = object2;
        object2 = new z2(this);
        ((e3)object2).q();
        this.j = object2;
        object = j32.g;
        boolean bl2 = bl;
        if (object != null) {
            bl2 = bl;
            if (((U0)object).c0 != 0L) {
                bl2 = true;
            }
        }
        if (c8.getApplicationContext() instanceof Application) {
            this.H().S0(bl2 ^ true);
        } else {
            this.k().L().a("Application context is not an Application");
        }
        ((z2)object2).D(new F2(this, j32));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static E2 c(Context object, U0 object2, Long l8) {
        block12: {
            U0 u02;
            block11: {
                block9: {
                    block10: {
                        u02 = object2;
                        if (object2 == null) break block9;
                        if (((U0)object2).f0 == null) break block10;
                        u02 = object2;
                        if (((U0)object2).g0 != null) break block9;
                    }
                    u02 = new U0(((U0)object2).q, ((U0)object2).c0, ((U0)object2).d0, ((U0)object2).e0, null, null, ((U0)object2).h0, null);
                }
                ax.M5.p.l(object);
                ax.M5.p.l(object.getApplicationContext());
                if (I != null) break block11;
                synchronized (E2.class) {
                    Throwable throwable2;
                    block8: {
                        block7: {
                            try {
                                if (I != null) break block7;
                                object2 = new j3((Context)object, u02, l8);
                                object = new E2((j3)object2);
                                I = object;
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        break block12;
                    }
                    throw throwable2;
                }
            }
            if (u02 != null && (object = u02.h0) != null && object.containsKey("dataCollectionDefaultEnabled")) {
                ax.M5.p.l(I);
                I.m(u02.h0.getBoolean("dataCollectionDefaultEnabled"));
            }
        }
        ax.M5.p.l(I);
        return I;
    }

    private static void f(b1 object) {
        if (object != null) {
            if (((b1)object).z()) {
                return;
            }
            String string = String.valueOf(object.getClass());
            object = new StringBuilder("Component not initialized: ");
            ((StringBuilder)object).append(string);
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        throw new IllegalStateException("Component not created");
    }

    static /* synthetic */ void g(E2 e22, j3 object) {
        ((f3)e22.l()).n();
        Object object2 = new w(e22);
        ((e3)object2).q();
        e22.v = object2;
        object = new Q1(e22, ((j3)object).f);
        ((b1)object).w();
        e22.w = object;
        object2 = new P1(e22);
        ((b1)object2).w();
        e22.t = object2;
        object2 = new k4(e22);
        ((b1)object2).w();
        e22.u = object2;
        e22.l.r();
        e22.h.r();
        e22.w.x();
        e22.k().J().b("App measurement initialized, version", 97001L);
        e22.k().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String string = ((Q1)object).F();
        if (TextUtils.isEmpty((CharSequence)e22.b)) {
            if (e22.L().E0(string, e22.g.R())) {
                e22.k().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                object2 = e22.k().J();
                object = new StringBuilder("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                ((StringBuilder)object).append(string);
                ((X1)object2).a(((StringBuilder)object).toString());
            }
        }
        e22.k().F().a("Debug-level message logging enabled");
        if (e22.E != e22.G.get()) {
            e22.k().G().c("Not all components initialized", e22.E, e22.G.get());
        }
        e22.x = true;
    }

    private static void h(e3 object) {
        if (object != null) {
            if (((e3)object).s()) {
                return;
            }
            object = String.valueOf(object.getClass());
            StringBuilder stringBuilder = new StringBuilder("Component not initialized: ");
            stringBuilder.append((String)object);
            throw new IllegalStateException(stringBuilder.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    private static void i(f3 f32) {
        if (f32 != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private final Y3 v() {
        E2.h(this.r);
        return this.r;
    }

    public final w A() {
        E2.h(this.v);
        return this.v;
    }

    public final Q1 B() {
        E2.f(this.w);
        return this.w;
    }

    public final P1 C() {
        E2.f(this.t);
        return this.t;
    }

    public final R1 D() {
        return this.m;
    }

    public final V1 E() {
        V1 v12 = this.i;
        if (v12 != null && v12.s()) {
            return this.i;
        }
        return null;
    }

    public final g2 F() {
        E2.i(this.h);
        return this.h;
    }

    final z2 G() {
        return this.j;
    }

    public final k3 H() {
        E2.f(this.p);
        return this.p;
    }

    public final f4 I() {
        E2.f(this.o);
        return this.o;
    }

    public final k4 J() {
        E2.f(this.u);
        return this.u;
    }

    public final V4 K() {
        E2.f(this.k);
        return this.k;
    }

    public final B5 L() {
        E2.i(this.l);
        return this.l;
    }

    public final String M() {
        return this.b;
    }

    public final String N() {
        return this.c;
    }

    public final String O() {
        return this.d;
    }

    public final String P() {
        return this.s;
    }

    final void Q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void R() {
        this.G.incrementAndGet();
    }

    @Override
    public final Context a() {
        return this.a;
    }

    @Override
    public final ax.R5.e b() {
        return this.n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected final void d(U0 var1_1) {
        block40: {
            block39: {
                block34: {
                    block36: {
                        block38: {
                            block37: {
                                block32: {
                                    block35: {
                                        block33: {
                                            this.l().n();
                                            if (k7.a() && this.g.t(com.google.android.gms.measurement.internal.F.B0) && this.L().X0()) {
                                                var5_2 /* !! */  = this.L();
                                                var5_2 /* !! */ .n();
                                                var4_3 /* !! */  = new IntentFilter();
                                                var4_3 /* !! */ .addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                                var6_4 /* !! */  = new D(var5_2 /* !! */ .a);
                                                ax.Q.b.i(var5_2 /* !! */ .a(), (BroadcastReceiver)var6_4 /* !! */ , (IntentFilter)var4_3 /* !! */ , 2);
                                                var5_2 /* !! */ .k().F().a("Registered app receiver");
                                            }
                                            var5_2 /* !! */  = this.F().M();
                                            var2_5 = var5_2 /* !! */ .b();
                                            if (!g6.a() || !this.g.t(com.google.android.gms.measurement.internal.F.R0)) break block32;
                                            var6_4 /* !! */  = this.g.A("google_analytics_default_allow_ad_storage", false);
                                            var7_6 = this.g.A("google_analytics_default_allow_analytics_storage", false);
                                            var4_3 /* !! */  = ax.f6.o.c0;
                                            if (var6_4 /* !! */  == var4_3 /* !! */  && var7_6 == var4_3 /* !! */  || !this.F().y(-10)) break block33;
                                            var4_3 /* !! */  = h3.g((o)var6_4 /* !! */ , var7_6, -10);
                                            break block34;
                                        }
                                        if (TextUtils.isEmpty((CharSequence)this.B().G()) || var2_5 != 0 && var2_5 != 30 && var2_5 != 10 && var2_5 != 30 && var2_5 != 30 && var2_5 != 40) break block35;
                                        this.H().T(new h3(null, null, -10), this.H, false);
                                        break block36;
                                    }
                                    if (!TextUtils.isEmpty((CharSequence)this.B().G()) || var1_1 == null || var1_1.h0 == null || !this.F().y(30) || !(var4_3 /* !! */  = h3.f(var1_1.h0, 30)).C()) break block36;
                                    break block34;
                                }
                                var4_3 /* !! */  = this.g.D("google_analytics_default_allow_ad_storage");
                                var6_4 /* !! */  = this.g.D("google_analytics_default_allow_analytics_storage");
                                if (var4_3 /* !! */  == null && var6_4 /* !! */  == null || !this.F().y(-10)) break block37;
                                var4_3 /* !! */  = new h3(var4_3 /* !! */ , var6_4 /* !! */ , -10);
                                break block34;
                            }
                            if (TextUtils.isEmpty((CharSequence)this.B().G()) || var2_5 != 0 && var2_5 != 30 && var2_5 != 10 && var2_5 != 30 && var2_5 != 30 && var2_5 != 40) break block38;
                            this.H().T(new h3(null, null, -10), this.H, false);
                            break block36;
                        }
                        if (TextUtils.isEmpty((CharSequence)this.B().G()) && var1_1 != null && var1_1.h0 != null && this.F().y(30) && (var4_3 /* !! */  = h3.f(var1_1.h0, 30)).C()) break block34;
                    }
                    var4_3 /* !! */  = null;
                }
                if (var4_3 /* !! */  != null) {
                    this.H().T((h3)var4_3 /* !! */ , this.H, this.g.t(com.google.android.gms.measurement.internal.F.U0));
                    var5_2 /* !! */  = var4_3 /* !! */ ;
                }
                this.H().S((h3)var5_2 /* !! */ );
                var2_5 = this.F().L().a();
                if (!g6.a() || !this.g.t(com.google.android.gms.measurement.internal.F.R0)) break block39;
                var5_2 /* !! */  = this.g.A("google_analytics_default_allow_ad_personalization_signals", true);
                if (var5_2 /* !! */  != (var4_3 /* !! */  = ax.f6.o.c0)) {
                    this.k().K().b("Default ad personalization consent from Manifest", var5_2 /* !! */ );
                }
                if ((var5_2 /* !! */  = this.g.A("google_analytics_default_allow_ad_user_data", true)) == var4_3 /* !! */  || !h3.l(-10, var2_5)) ** GOTO lbl-1000
                this.H().R(com.google.android.gms.measurement.internal.u.c((o)var5_2 /* !! */ , -10), this.g.t(com.google.android.gms.measurement.internal.F.U0));
                break block40;
            }
            var4_3 /* !! */  = this.g.D("google_analytics_default_allow_ad_user_data");
            if (var4_3 /* !! */  != null && h3.l(-10, var2_5)) {
                this.H().R(new u(var4_3 /* !! */ , -10), this.g.t(com.google.android.gms.measurement.internal.F.U0));
            } else if (!(TextUtils.isEmpty((CharSequence)this.B().G()) || var2_5 != 0 && var2_5 != 30)) {
                this.H().R(new u(null, -10), this.g.t(com.google.android.gms.measurement.internal.F.U0));
            } else {
                if (TextUtils.isEmpty((CharSequence)this.B().G()) && var1_1 != null && var1_1.h0 != null && h3.l(30, var2_5) && (var4_3 /* !! */  = com.google.android.gms.measurement.internal.u.b(var1_1.h0, 30)).k()) {
                    this.H().R((u)var4_3 /* !! */ , this.g.t(com.google.android.gms.measurement.internal.F.U0));
                }
                if (TextUtils.isEmpty((CharSequence)this.B().G()) && var1_1 != null && var1_1.h0 != null && this.F().o.a() == null && (var4_3 /* !! */  = com.google.android.gms.measurement.internal.u.e(var1_1.h0)) != null) {
                    this.H().k0(var1_1.f0, "allow_personalized_ads", var4_3 /* !! */ .toString(), false);
                }
            }
        }
        var1_1 = this.g.D("google_analytics_tcf_data_enabled");
        var3_7 = var1_1 == null ? true : var1_1.booleanValue();
        if (var3_7) {
            this.k().F().a("TCF client enabled.");
            this.H().G0();
            this.H().E0();
        }
        if (this.F().g.a() == 0L) {
            this.k().K().b("Persisting first open", this.H);
            this.F().g.b(this.H);
        }
        this.H().p.c();
        if (!this.s()) {
            if (this.p()) {
                if (!this.L().F0("android.permission.INTERNET")) {
                    this.k().G().a("App is missing INTERNET permission");
                }
                if (!this.L().F0("android.permission.ACCESS_NETWORK_STATE")) {
                    this.k().G().a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!ax.S5.e.a(this.a).e() && !this.g.V()) {
                    if (!B5.d0(this.a)) {
                        this.k().G().a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!B5.e0(this.a, false)) {
                        this.k().G().a("AppMeasurementService not registered/enabled");
                    }
                }
                this.k().G().a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty((CharSequence)this.B().G()) || !TextUtils.isEmpty((CharSequence)this.B().E())) {
                this.L();
                if (B5.m0(this.B().G(), this.F().S(), this.B().E(), this.F().R())) {
                    this.k().J().a("Rechecking which service to use due to a GMP App Id change");
                    this.F().T();
                    this.C().H();
                    this.u.Z();
                    this.u.Y();
                    this.F().g.b(this.H);
                    this.F().i.b(null);
                }
                this.F().I(this.B().G());
                this.F().F(this.B().E());
            }
            if (!this.F().M().m(h3.a.d0)) {
                this.F().i.b(null);
            }
            this.H().X0(this.F().i.a());
            if (!this.L().Y0() && !TextUtils.isEmpty((CharSequence)this.F().x.a())) {
                this.k().L().a("Remote config removed with active feature rollouts");
                this.F().x.b(null);
            }
            if (!TextUtils.isEmpty((CharSequence)this.B().G()) || !TextUtils.isEmpty((CharSequence)this.B().E())) {
                var3_7 = this.p();
                if (!this.F().D() && !this.g.U()) {
                    this.F().G(var3_7 ^ true);
                }
                if (var3_7) {
                    this.H().A0();
                }
                this.K().e.a();
                this.J().Q(new AtomicReference<String>());
                this.J().C(this.F().A.a());
            }
        }
        if (k7.a() && this.g.t(com.google.android.gms.measurement.internal.F.B0) && this.L().X0()) {
            var1_1 = this.H();
            j.Objects.requireNonNull((Object)var1_1);
            new Thread(new D2((k3)var1_1)).start();
        }
        this.F().q.a(true);
    }

    @Override
    public final c e() {
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final /* synthetic */ void j(String string, int n8, Throwable object, byte[] object2, Map object3) {
        if ((n8 == 200 || n8 == 204 || n8 == 304) && object == null) {
            this.F().v.a(true);
            if (object2 != null && ((byte[])object2).length != 0) {
                JSONException jSONException2;
                block13: {
                    string = new String((byte[])object2);
                    try {
                        object2 = new JSONObject;
                        object2(string);
                        string = object2.optString("deeplink", "");
                        if (TextUtils.isEmpty((CharSequence)string)) {
                            this.k().F().a("Deferred Deep Link is empty.");
                            return;
                        }
                    }
                    catch (JSONException jSONException2) {
                        break block13;
                    }
                    object3 = object2.optString("gclid", "");
                    String string2 = object2.optString("gbraid", "");
                    object = object2.optString("gad_source", "");
                    double d8 = object2.optDouble("timestamp", 0.0);
                    object2 = new Bundle;
                    object2();
                    if (M6.a() && this.g.t(com.google.android.gms.measurement.internal.F.M0)) {
                        if (!this.L().M0(string)) {
                            this.k().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", object3, string2, string);
                            return;
                        }
                        if (!TextUtils.isEmpty((CharSequence)string2)) {
                            object2.putString("gbraid", string2);
                        }
                        if (!TextUtils.isEmpty((CharSequence)object)) {
                            object2.putString("gad_source", (String)object);
                        }
                    } else if (!this.L().M0(string)) {
                        this.k().L().c("Deferred Deep Link validation failed. gclid, deep link", object3, string);
                        return;
                    }
                    if (M6.a()) {
                        this.g.t(com.google.android.gms.measurement.internal.F.M0);
                    }
                    object2.putString("gclid", (String)object3);
                    object2.putString("_cis", "ddp");
                    this.p.Y0("auto", "_cmp", (Bundle)object2);
                    object = this.L();
                    if (!TextUtils.isEmpty((CharSequence)string) && ((B5)object).i0(string, d8)) {
                        string = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                        ((f3)object).a().sendBroadcast((Intent)string);
                    }
                    return;
                }
                this.k().G().b("Failed to parse the Deferred Deep Link response. exception", (Object)jSONException2);
                return;
            }
            this.k().F().a("Deferred Deep Link response empty.");
            return;
        }
        this.k().L().c("Network Request for Deferred Deep Link failed. response, exception", n8, object);
    }

    @Override
    public final V1 k() {
        E2.h(this.i);
        return this.i;
    }

    @Override
    public final z2 l() {
        E2.h(this.j);
        return this.j;
    }

    final void m(boolean bl) {
        this.A = bl;
    }

    final void n() {
        ++this.E;
    }

    public final boolean o() {
        return this.A != null && this.A != false;
    }

    public final boolean p() {
        return this.x() == 0;
    }

    public final boolean q() {
        ((f3)this.l()).n();
        return this.D;
    }

    public final boolean r() {
        return TextUtils.isEmpty((CharSequence)this.b);
    }

    protected final boolean s() {
        if (this.x) {
            ((f3)this.l()).n();
            Boolean bl = this.y;
            if (bl == null || this.z == 0L || bl != null && !bl.booleanValue() && Math.abs(this.n.b() - this.z) > 1000L) {
                this.z = this.n.b();
                boolean bl2 = this.L().F0("android.permission.INTERNET");
                boolean bl3 = true;
                bl2 = bl2 && this.L().F0("android.permission.ACCESS_NETWORK_STATE") && (ax.S5.e.a(this.a).e() || this.g.V() || B5.d0(this.a) && B5.e0(this.a, false));
                this.y = bl = Boolean.valueOf(bl2);
                if (bl.booleanValue()) {
                    bl2 = bl3;
                    if (!this.L().k0(this.B().G(), this.B().E())) {
                        bl2 = !TextUtils.isEmpty((CharSequence)this.B().E()) ? bl3 : false;
                    }
                    this.y = bl2;
                }
            }
            return this.y;
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean t() {
        return this.e;
    }

    public final boolean u() {
        ((f3)this.l()).n();
        E2.h(this.v());
        Object object = this.B().F();
        Object object2 = this.F().u((String)object);
        boolean bl = this.g.S();
        boolean bl2 = false;
        if (bl && !((Boolean)object2.second).booleanValue() && !TextUtils.isEmpty((CharSequence)((CharSequence)object2.first))) {
            if (!this.v().w()) {
                this.k().L().a("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            Object object3 = new StringBuilder();
            Object object4 = this.J();
            ((f3)object4).n();
            ((b1)object4).v();
            if (!((k4)object4).j0() || ((f3)object4).i().I0() >= 234200) {
                object4 = this.H().p0();
                object4 = object4 != null ? ((a)object4).q : null;
                int n8 = 1;
                if (object4 == null) {
                    int n9 = this.F;
                    this.F = n9 + 1;
                    if (n9 < 10) {
                        bl2 = true;
                    }
                    object = this.k().F();
                    object4 = bl2 ? "Retrying." : "Skipping.";
                    object3 = new StringBuilder("Failed to retrieve DMA consent from the service, ");
                    ((StringBuilder)object3).append((String)object4);
                    ((StringBuilder)object3).append(" retryCount");
                    ((X1)object).b(((StringBuilder)object3).toString(), this.F);
                    return bl2;
                }
                Object object5 = h3.f((Bundle)object4, 100);
                ((StringBuilder)object3).append("&gcs=");
                ((StringBuilder)object3).append(((h3)object5).y());
                object5 = com.google.android.gms.measurement.internal.u.b((Bundle)object4, 100);
                ((StringBuilder)object3).append("&dma=");
                int n10 = ((u)object5).h() == Boolean.FALSE ? 0 : 1;
                ((StringBuilder)object3).append(n10);
                if (!TextUtils.isEmpty((CharSequence)((u)object5).i())) {
                    ((StringBuilder)object3).append("&dma_cps=");
                    ((StringBuilder)object3).append(((u)object5).i());
                }
                n10 = n8;
                if (com.google.android.gms.measurement.internal.u.e((Bundle)object4) == Boolean.TRUE) {
                    n10 = 0;
                }
                ((StringBuilder)object3).append("&npa=");
                ((StringBuilder)object3).append(n10);
                this.k().K().b("Consent query parameters to Bow", object3);
            }
            object4 = this.L();
            this.B();
            object4 = ((B5)object4).K(97001L, (String)object, (String)object2.first, this.F().w.a() - 1L, ((StringBuilder)object3).toString());
            if (object4 != null) {
                object3 = this.v();
                object2 = new G2(this);
                ((f3)object3).n();
                ((e3)object3).p();
                ax.M5.p.l(object4);
                ax.M5.p.l(object2);
                ((f3)object3).l().z(new Z3((Y3)object3, (String)object, (URL)object4, null, null, (a4)object2));
            }
            return false;
        }
        this.k().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    public final void w(boolean bl) {
        ((f3)this.l()).n();
        this.D = bl;
    }

    public final int x() {
        ((f3)this.l()).n();
        if (this.g.U()) {
            return 1;
        }
        Boolean bl = this.C;
        if (bl != null && bl.booleanValue()) {
            return 2;
        }
        if (!this.q()) {
            return 8;
        }
        bl = this.F().P();
        if (bl != null) {
            if (bl.booleanValue()) {
                return 0;
            }
            return 3;
        }
        bl = this.g.D("firebase_analytics_collection_enabled");
        if (bl != null) {
            if (bl.booleanValue()) {
                return 0;
            }
            return 4;
        }
        bl = this.B;
        if (bl != null) {
            if (bl.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.A != null) {
            if (this.A.booleanValue()) {
                return 0;
            }
            return 7;
        }
        return 0;
    }

    public final z y() {
        z z8 = this.q;
        if (z8 != null) {
            return z8;
        }
        throw new IllegalStateException("Component not created");
    }

    public final h z() {
        return this.g;
    }
}

