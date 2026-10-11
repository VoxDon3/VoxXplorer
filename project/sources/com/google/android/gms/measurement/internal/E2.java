package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ax.M5.C0821p;
import ax.b6.M6;
import ax.f6.C2053a;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class E2 implements InterfaceC3660g3 {
    private static volatile E2 I;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private int F;
    final long H;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final C3628c f;
    private final C3663h g;
    private final C3659g2 h;
    private final V1 i;
    private final C3779z2 j;
    private final V4 k;
    private final B5 l;
    private final R1 m;
    private final ax.R5.e n;
    private final C3654f4 o;
    private final C3688k3 p;
    private final C3776z q;
    private final Y3 r;
    private final String s;
    private P1 t;
    private C3689k4 u;
    private C3758w v;
    private Q1 w;
    private Boolean y;
    private long z;
    private boolean x = false;
    private AtomicInteger G = new AtomicInteger(0);

    private E2(C3681j3 c3681j3) {
        Bundle bundle;
        boolean z = false;
        C0821p.l(c3681j3);
        C3628c c3628c = new C3628c(c3681j3.a);
        this.f = c3628c;
        N1.a = c3628c;
        Context context = c3681j3.a;
        this.a = context;
        this.b = c3681j3.b;
        this.c = c3681j3.c;
        this.d = c3681j3.d;
        this.e = c3681j3.h;
        this.A = c3681j3.e;
        this.s = c3681j3.j;
        this.D = true;
        ax.b6.U0 u0 = c3681j3.g;
        if (u0 != null && (bundle = u0.h0) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = u0.h0.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        ax.b6.Y2.l(context);
        ax.R5.e c = ax.R5.h.c();
        this.n = c;
        Long l = c3681j3.i;
        this.H = l != null ? l.longValue() : c.a();
        this.g = new C3663h(this);
        C3659g2 c3659g2 = new C3659g2(this);
        c3659g2.q();
        this.h = c3659g2;
        V1 v1 = new V1(this);
        v1.q();
        this.i = v1;
        B5 b5 = new B5(this);
        b5.q();
        this.l = b5;
        this.m = new R1(new C3695l3(c3681j3, this));
        this.q = new C3776z(this);
        C3654f4 c3654f4 = new C3654f4(this);
        c3654f4.w();
        this.o = c3654f4;
        C3688k3 c3688k3 = new C3688k3(this);
        c3688k3.w();
        this.p = c3688k3;
        V4 v4 = new V4(this);
        v4.w();
        this.k = v4;
        Y3 y3 = new Y3(this);
        y3.q();
        this.r = y3;
        C3779z2 c3779z2 = new C3779z2(this);
        c3779z2.q();
        this.j = c3779z2;
        ax.b6.U0 u02 = c3681j3.g;
        if (u02 != null && u02.c0 != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            H().S0(z2);
        } else {
            k().L().a("Application context is not an Application");
        }
        c3779z2.D(new F2(this, c3681j3));
    }

    public static E2 c(Context context, ax.b6.U0 u0, Long l) {
        Bundle bundle;
        if (u0 != null && (u0.f0 == null || u0.g0 == null)) {
            u0 = new ax.b6.U0(u0.q, u0.c0, u0.d0, u0.e0, null, null, u0.h0, null);
        }
        C0821p.l(context);
        C0821p.l(context.getApplicationContext());
        if (I == null) {
            synchronized (E2.class) {
                try {
                    if (I == null) {
                        I = new E2(new C3681j3(context, u0, l));
                    }
                } finally {
                }
            }
        } else if (u0 != null && (bundle = u0.h0) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C0821p.l(I);
            I.m(u0.h0.getBoolean("dataCollectionDefaultEnabled"));
        }
        C0821p.l(I);
        return I;
    }

    private static void f(AbstractC3623b1 abstractC3623b1) {
        if (abstractC3623b1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC3623b1.z()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC3623b1.getClass()));
    }

    static /* synthetic */ void g(E2 e2, C3681j3 c3681j3) {
        e2.l().n();
        C3758w c3758w = new C3758w(e2);
        c3758w.q();
        e2.v = c3758w;
        Q1 q1 = new Q1(e2, c3681j3.f);
        q1.w();
        e2.w = q1;
        P1 p1 = new P1(e2);
        p1.w();
        e2.t = p1;
        C3689k4 c3689k4 = new C3689k4(e2);
        c3689k4.w();
        e2.u = c3689k4;
        e2.l.r();
        e2.h.r();
        e2.w.x();
        e2.k().J().b("App measurement initialized, version", 97001L);
        e2.k().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String F = q1.F();
        if (TextUtils.isEmpty(e2.b)) {
            if (e2.L().E0(F, e2.g.R())) {
                e2.k().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                e2.k().J().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + F);
            }
        }
        e2.k().F().a("Debug-level message logging enabled");
        if (e2.E != e2.G.get()) {
            e2.k().G().c("Not all components initialized", Integer.valueOf(e2.E), Integer.valueOf(e2.G.get()));
        }
        e2.x = true;
    }

    private static void h(AbstractC3646e3 abstractC3646e3) {
        if (abstractC3646e3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC3646e3.s()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC3646e3.getClass()));
    }

    private static void i(C3653f3 c3653f3) {
        if (c3653f3 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private final Y3 v() {
        h(this.r);
        return this.r;
    }

    public final C3758w A() {
        h(this.v);
        return this.v;
    }

    public final Q1 B() {
        f(this.w);
        return this.w;
    }

    public final P1 C() {
        f(this.t);
        return this.t;
    }

    public final R1 D() {
        return this.m;
    }

    public final V1 E() {
        V1 v1 = this.i;
        if (v1 == null || !v1.s()) {
            return null;
        }
        return this.i;
    }

    public final C3659g2 F() {
        i(this.h);
        return this.h;
    }

    final C3779z2 G() {
        return this.j;
    }

    public final C3688k3 H() {
        f(this.p);
        return this.p;
    }

    public final C3654f4 I() {
        f(this.o);
        return this.o;
    }

    public final C3689k4 J() {
        f(this.u);
        return this.u;
    }

    public final V4 K() {
        f(this.k);
        return this.k;
    }

    public final B5 L() {
        i(this.l);
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

    @Override // com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final Context a() {
        return this.a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final ax.R5.e b() {
        return this.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x00ec, code lost:
    
        if (r1.C() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0161, code lost:
    
        if (r1.C() != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void d(ax.b6.U0 r13) {
        /*
            Method dump skipped, instructions count: 1305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.E2.d(ax.b6.U0):void");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final C3628c e() {
        return this.f;
    }

    final /* synthetic */ void j(String str, int i, Throwable th, byte[] bArr, Map map) {
        if ((i != 200 && i != 204 && i != 304) || th != null) {
            k().L().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        F().v.a(true);
        if (bArr == null || bArr.length == 0) {
            k().F().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
            if (TextUtils.isEmpty(optString)) {
                k().F().a("Deferred Deep Link is empty.");
                return;
            }
            String optString2 = jSONObject.optString("gclid", HttpUrl.FRAGMENT_ENCODE_SET);
            String optString3 = jSONObject.optString("gbraid", HttpUrl.FRAGMENT_ENCODE_SET);
            String optString4 = jSONObject.optString("gad_source", HttpUrl.FRAGMENT_ENCODE_SET);
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            Bundle bundle = new Bundle();
            if (M6.a() && this.g.t(F.M0)) {
                if (!L().M0(optString)) {
                    k().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                if (!TextUtils.isEmpty(optString3)) {
                    bundle.putString("gbraid", optString3);
                }
                if (!TextUtils.isEmpty(optString4)) {
                    bundle.putString("gad_source", optString4);
                }
            } else if (!L().M0(optString)) {
                k().L().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            if (M6.a()) {
                this.g.t(F.M0);
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.p.Y0("auto", "_cmp", bundle);
            B5 L = L();
            if (TextUtils.isEmpty(optString) || !L.i0(optString, optDouble)) {
                return;
            }
            L.a().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            k().G().b("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final V1 k() {
        h(this.i);
        return this.i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final C3779z2 l() {
        h(this.j);
        return this.j;
    }

    final void m(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    final void n() {
        this.E++;
    }

    public final boolean o() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean p() {
        return x() == 0;
    }

    public final boolean q() {
        l().n();
        return this.D;
    }

    public final boolean r() {
        return TextUtils.isEmpty(this.b);
    }

    protected final boolean s() {
        if (!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        l().n();
        Boolean bool = this.y;
        if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
            this.z = this.n.b();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(L().F0("android.permission.INTERNET") && L().F0("android.permission.ACCESS_NETWORK_STATE") && (ax.S5.e.a(this.a).e() || this.g.V() || (B5.d0(this.a) && B5.e0(this.a, false))));
            this.y = valueOf;
            if (valueOf.booleanValue()) {
                if (!L().k0(B().G(), B().E()) && TextUtils.isEmpty(B().E())) {
                    z = false;
                }
                this.y = Boolean.valueOf(z);
            }
        }
        return this.y.booleanValue();
    }

    public final boolean t() {
        return this.e;
    }

    public final boolean u() {
        l().n();
        h(v());
        String F = B().F();
        Pair<String, Boolean> u = F().u(F);
        if (!this.g.S() || ((Boolean) u.second).booleanValue() || TextUtils.isEmpty((CharSequence) u.first)) {
            k().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!v().w()) {
            k().L().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        C3689k4 J = J();
        J.n();
        J.v();
        if (!J.j0() || J.i().I0() >= 234200) {
            C2053a p0 = H().p0();
            Bundle bundle = p0 != null ? p0.q : null;
            if (bundle == null) {
                int i = this.F;
                this.F = i + 1;
                boolean z = i < 10;
                k().F().b("Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.F));
                return z;
            }
            C3667h3 f = C3667h3.f(bundle, 100);
            sb.append("&gcs=");
            sb.append(f.y());
            C3746u b = C3746u.b(bundle, 100);
            sb.append("&dma=");
            sb.append(b.h() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(b.i())) {
                sb.append("&dma_cps=");
                sb.append(b.i());
            }
            int i2 = C3746u.e(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i2);
            k().K().b("Consent query parameters to Bow", sb);
        }
        B5 L = L();
        B();
        URL K = L.K(97001L, F, (String) u.first, F().w.a() - 1, sb.toString());
        if (K != null) {
            Y3 v = v();
            InterfaceC3619a4 interfaceC3619a4 = new InterfaceC3619a4() { // from class: com.google.android.gms.measurement.internal.G2
                @Override // com.google.android.gms.measurement.internal.InterfaceC3619a4
                public final void a(String str, int i3, Throwable th, byte[] bArr, Map map) {
                    E2.this.j(str, i3, th, bArr, map);
                }
            };
            v.n();
            v.p();
            C0821p.l(K);
            C0821p.l(interfaceC3619a4);
            v.l().z(new Z3(v, F, K, null, null, interfaceC3619a4));
        }
        return false;
    }

    public final void w(boolean z) {
        l().n();
        this.D = z;
    }

    public final int x() {
        l().n();
        if (this.g.U()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!q()) {
            return 8;
        }
        Boolean P = F().P();
        if (P != null) {
            return P.booleanValue() ? 0 : 3;
        }
        Boolean D = this.g.D("firebase_analytics_collection_enabled");
        if (D != null) {
            return D.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    public final C3776z y() {
        C3776z c3776z = this.q;
        if (c3776z != null) {
            return c3776z;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C3663h z() {
        return this.g;
    }
}
