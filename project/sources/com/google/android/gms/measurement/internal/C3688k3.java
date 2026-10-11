package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import ax.M5.C0821p;
import ax.b6.C1565g6;
import ax.b6.C1602k7;
import ax.b6.C1618m6;
import ax.b6.r7;
import ax.e2.AbstractC1973a;
import ax.f6.C2053a;
import ax.f6.C2065m;
import ax.f6.C2066n;
import ax.f6.C2069q;
import ax.f6.C2071s;
import ax.f6.C2074v;
import ax.f6.C2075w;
import ax.f6.EnumC2067o;
import ax.f6.InterfaceC2070r;
import ax.f6.InterfaceC2072t;
import com.google.android.gms.measurement.internal.C3667h3;
import com.google.android.gms.measurement.internal.C3688k3;
import j$.util.Comparator;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3688k3 extends AbstractC3623b1 {
    private X3 c;
    private InterfaceC2070r d;
    private final Set<InterfaceC2072t> e;
    private boolean f;
    private final AtomicReference<String> g;
    private final Object h;
    private boolean i;
    private int j;
    private AbstractC3734s k;
    private PriorityQueue<C3669h5> l;
    private C3667h3 m;
    private final AtomicLong n;
    private long o;
    final G5 p;
    private boolean q;
    private AbstractC3734s r;
    private SharedPreferences.OnSharedPreferenceChangeListener s;
    private AbstractC3734s t;
    private final D5 u;

    protected C3688k3(E2 e2) {
        super(e2);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.i = false;
        this.j = 1;
        this.q = true;
        this.u = new P3(this);
        this.g = new AtomicReference<>();
        this.m = C3667h3.c;
        this.o = -1L;
        this.n = new AtomicLong(0L);
        this.p = new G5(e2);
    }

    public static int D(String str) {
        C0821p.f(str);
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0() {
        C3688k3 c3688k3;
        n();
        String a = h().o.a();
        if (a == null) {
            c3688k3 = this;
        } else if ("unset".equals(a)) {
            c3688k3 = this;
            c3688k3.j0("app", "_npa", null, b().a());
        } else {
            j0("app", "_npa", Long.valueOf("true".equals(a) ? 1L : 0L), b().a());
            c3688k3 = this;
        }
        if (!c3688k3.a.p() || !c3688k3.q) {
            k().F().a("Updating Scion state (FE)");
            t().e0();
        } else {
            k().F().a("Recording app launch after enabling measurement for the first time (FE)");
            A0();
            u().e.a();
            l().D(new B3(this));
        }
    }

    private final void M(Bundle bundle, int i, long j) {
        v();
        String k = C3667h3.k(bundle);
        if (k != null) {
            k().M().b("Ignoring invalid consent setting", k);
            k().M().a("Valid consent values are 'granted', 'denied'");
        }
        boolean J = l().J();
        C3667h3 f = C3667h3.f(bundle, i);
        if (f.C()) {
            T(f, j, J);
        }
        C3746u b = C3746u.b(bundle, i);
        if (b.k()) {
            R(b, J);
        }
        Boolean e = C3746u.e(bundle);
        if (e != null) {
            k0(i == -30 ? "tcf" : "app", "allow_personalized_ads", e.toString(), false);
        }
    }

    static /* synthetic */ void N0(C3688k3 c3688k3, int i) {
        if (c3688k3.k == null) {
            c3688k3.k = new C3780z3(c3688k3, c3688k3.a);
        }
        c3688k3.k.b(i * 1000);
    }

    static /* synthetic */ void O0(C3688k3 c3688k3, Bundle bundle) {
        c3688k3.n();
        c3688k3.v();
        C0821p.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C0821p.f(string);
        C0821p.f(string2);
        C0821p.l(bundle.get("value"));
        if (!c3688k3.a.p()) {
            c3688k3.k().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        A5 a5 = new A5(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            D H = c3688k3.i().H(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c3688k3.t().J(new C3649f(bundle.getString("app_id"), string2, a5, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c3688k3.i().H(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), H, bundle.getLong("time_to_live"), c3688k3.i().H(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void Q0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        l().D(new C3(this, str, str2, j, B5.D(bundle), z, z2, z3, str3));
    }

    static /* synthetic */ void V(C3688k3 c3688k3, Bundle bundle) {
        c3688k3.n();
        c3688k3.v();
        C0821p.l(bundle);
        String f = C0821p.f(bundle.getString("name"));
        if (!c3688k3.a.p()) {
            c3688k3.k().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c3688k3.t().J(new C3649f(bundle.getString("app_id"), HttpUrl.FRAGMENT_ENCODE_SET, new A5(f, 0L, null, HttpUrl.FRAGMENT_ENCODE_SET), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c3688k3.i().H(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), HttpUrl.FRAGMENT_ENCODE_SET, bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void W(C3688k3 c3688k3, C3667h3 c3667h3, long j, boolean z, boolean z2) {
        c3688k3.n();
        c3688k3.v();
        C3667h3 M = c3688k3.h().M();
        if (j <= c3688k3.o && C3667h3.l(M.b(), c3667h3.b())) {
            c3688k3.k().J().b("Dropped out-of-date consent setting, proposed settings", c3667h3);
            return;
        }
        if (!c3688k3.h().B(c3667h3)) {
            c3688k3.k().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c3667h3.b()));
            return;
        }
        c3688k3.k().K().b("Setting storage consent(FE)", c3667h3);
        c3688k3.o = j;
        if (c3688k3.t().i0()) {
            c3688k3.t().n0(z);
        } else {
            c3688k3.t().U(z);
        }
        if (z2) {
            c3688k3.t().Q(new AtomicReference<>());
        }
    }

    static /* synthetic */ void X(C3688k3 c3688k3, C3667h3 c3667h3, C3667h3 c3667h32) {
        if (C1618m6.a() && c3688k3.d().t(F.V0)) {
            return;
        }
        C3667h3.a aVar = C3667h3.a.ANALYTICS_STORAGE;
        C3667h3.a aVar2 = C3667h3.a.AD_STORAGE;
        boolean n = c3667h3.n(c3667h32, aVar, aVar2);
        boolean s = c3667h3.s(c3667h32, aVar, aVar2);
        if (n || s) {
            c3688k3.p().I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(Boolean bool, boolean z) {
        n();
        v();
        k().F().b("Setting app measurement enabled (FE)", bool);
        h().w(bool);
        if (z) {
            h().E(bool);
        }
        if (this.a.q() || !(bool == null || bool.booleanValue())) {
            H0();
        }
    }

    private final void f0(String str, String str2, long j, Object obj) {
        l().D(new E3(this, str, str2, obj, j));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3623b1
    protected final boolean A() {
        return false;
    }

    public final void A0() {
        n();
        v();
        if (this.a.s()) {
            Boolean D = d().D("google_analytics_deferred_deep_link_enabled");
            if (D != null && D.booleanValue()) {
                k().F().a("Deferred Deep Link feature enabled.");
                l().D(new Runnable() { // from class: ax.f6.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3688k3.this.D0();
                    }
                });
            }
            t().X();
            this.q = false;
            String Q = h().Q();
            if (TextUtils.isEmpty(Q)) {
                return;
            }
            f().p();
            if (Q.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", Q);
            Y0("auto", "_ou", bundle);
        }
    }

    public final void B0() {
        if (!(a().getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    final void C0() {
        if (C1602k7.a() && d().t(F.B0)) {
            if (l().J()) {
                k().G().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C3628c.a()) {
                k().G().a("Cannot get trigger URIs from main thread");
                return;
            }
            v();
            k().K().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            l().v(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.q3
                @Override // java.lang.Runnable
                public final void run() {
                    C3688k3.this.n0(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                k().G().a("Timed out waiting for get trigger URIs");
            } else {
                l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.o3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3688k3.this.m0(list);
                    }
                });
            }
        }
    }

    public final void D0() {
        n();
        if (h().v.b()) {
            k().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = h().w.a();
        h().w.b(1 + a);
        if (a >= 5) {
            k().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            h().v.a(true);
        } else {
            if (this.r == null) {
                this.r = new F3(this, this.a);
            }
            this.r.b(0L);
        }
    }

    public final void E0() {
        n();
        k().F().a("Handle tcf update.");
        C3655f5 c = C3655f5.c(h().H());
        k().K().b("Tcf preferences read", c);
        if (h().C(c)) {
            Bundle b = c.b();
            k().K().b("Consent generated from Tcf", b);
            if (b != Bundle.EMPTY) {
                M(b, -30, b().a());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c.e());
            Y0("auto", "_tcf", bundle);
        }
    }

    public final ArrayList<Bundle> F(String str, String str2) {
        if (l().J()) {
            k().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (C3628c.a()) {
            k().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.l().v(atomicReference, 5000L, "get conditional user properties", new J3(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return B5.t0(list);
        }
        k().G().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    @TargetApi(30)
    final void F0() {
        C3669h5 poll;
        AbstractC1973a S0;
        n();
        if (z0().isEmpty() || this.i || (poll = z0().poll()) == null || (S0 = i().S0()) == null) {
            return;
        }
        this.i = true;
        k().K().b("Registering trigger URI", poll.q);
        ax.v7.e<ax.sb.t> c = S0.c(Uri.parse(poll.q));
        if (c == null) {
            this.i = false;
            z0().add(poll);
            return;
        }
        if (!d().t(F.G0)) {
            SparseArray<Long> K = h().K();
            K.put(poll.d0, Long.valueOf(poll.c0));
            h().v(K);
        }
        ax.v7.c.a(c, new C3762w3(this, poll), new ExecutorC3768x3(this));
    }

    public final Map<String, Object> G(String str, String str2, boolean z) {
        if (l().J()) {
            k().G().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (C3628c.a()) {
            k().G().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.l().v(atomicReference, 5000L, "get user properties", new M3(this, atomicReference, null, str, str2, z));
        List<A5> list = (List) atomicReference.get();
        if (list == null) {
            k().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        ax.B.a aVar = new ax.B.a(list.size());
        for (A5 a5 : list) {
            Object k = a5.k();
            if (k != null) {
                aVar.put(a5.c0, k);
            }
        }
        return aVar;
    }

    public final void G0() {
        n();
        k().F().a("Register tcfPrefChangeListener.");
        if (this.s == null) {
            this.t = new D3(this, this.a);
            this.s = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.t3
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    C3688k3.this.K(sharedPreferences, str);
                }
            };
        }
        h().H().registerOnSharedPreferenceChangeListener(this.s);
    }

    public final void H(long j) {
        X0(null);
        l().D(new I3(this, j));
    }

    final void I(long j, boolean z) {
        n();
        v();
        k().F().a("Resetting analytics data (FE)");
        V4 u = u();
        u.n();
        u.f.b();
        p().I();
        boolean p = this.a.p();
        C3659g2 h = h();
        h.g.b(j);
        if (!TextUtils.isEmpty(h.h().x.a())) {
            h.x.b(null);
        }
        h.r.b(0L);
        h.s.b(0L);
        if (!h.d().U()) {
            h.G(!p);
        }
        h.y.b(null);
        h.z.b(0L);
        h.A.b(null);
        if (z) {
            t().c0();
        }
        u().e.a();
        this.q = !p;
    }

    public final void J(Intent intent) {
        if (r7.a() && d().t(F.u0)) {
            Uri data = intent.getData();
            if (data == null) {
                k().J().a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                k().J().a("Preview Mode was not enabled.");
                d().K(null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            k().J().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            d().K(queryParameter2);
        }
    }

    final void J0(long j) {
        I(j, true);
    }

    final /* synthetic */ void K(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            k().K().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC3734s) C0821p.l(this.t)).b(500L);
        }
    }

    public final void K0(Bundle bundle) {
        L0(bundle, b().a());
    }

    final /* synthetic */ void L(Bundle bundle) {
        if (bundle == null) {
            h().A.b(new Bundle());
            return;
        }
        Bundle a = h().A.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                i();
                if (B5.h0(obj)) {
                    i();
                    B5.Y(this.u, 27, null, null, 0);
                }
                k().M().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (B5.J0(str)) {
                k().M().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else if (i().l0("param", str, d().r(null, false), obj)) {
                i().O(a, str, obj);
            }
        }
        i();
        if (B5.g0(a, d().H())) {
            i();
            B5.Y(this.u, 26, null, null, 0);
            k().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        h().A.b(a);
        t().C(a);
    }

    public final void L0(Bundle bundle, long j) {
        C0821p.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            k().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C0821p.l(bundle2);
        C2066n.a(bundle2, "app_id", String.class, null);
        C2066n.a(bundle2, "origin", String.class, null);
        C2066n.a(bundle2, "name", String.class, null);
        C2066n.a(bundle2, "value", Object.class, null);
        C2066n.a(bundle2, "trigger_event_name", String.class, null);
        C2066n.a(bundle2, "trigger_timeout", Long.class, 0L);
        C2066n.a(bundle2, "timed_out_event_name", String.class, null);
        C2066n.a(bundle2, "timed_out_event_params", Bundle.class, null);
        C2066n.a(bundle2, "triggered_event_name", String.class, null);
        C2066n.a(bundle2, "triggered_event_params", Bundle.class, null);
        C2066n.a(bundle2, "time_to_live", Long.class, 0L);
        C2066n.a(bundle2, "expired_event_name", String.class, null);
        C2066n.a(bundle2, "expired_event_params", Bundle.class, null);
        C0821p.f(bundle2.getString("name"));
        C0821p.f(bundle2.getString("origin"));
        C0821p.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (i().r0(string) != 0) {
            k().G().b("Invalid conditional user property name", g().g(string));
            return;
        }
        if (i().w(string, obj) != 0) {
            k().G().c("Invalid conditional user property value", g().g(string), obj);
            return;
        }
        Object A0 = i().A0(string, obj);
        if (A0 == null) {
            k().G().c("Unable to normalize conditional user property value", g().g(string), obj);
            return;
        }
        C2066n.b(bundle2, A0);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            k().G().c("Invalid conditional user property timeout", g().g(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            k().G().c("Invalid conditional user property time to live", g().g(string), Long.valueOf(j3));
        } else {
            l().D(new H3(this, bundle2));
        }
    }

    public final void M0(InterfaceC2072t interfaceC2072t) {
        v();
        C0821p.l(interfaceC2072t);
        if (this.e.remove(interfaceC2072t)) {
            return;
        }
        k().L().a("OnEventListener had not been registered");
    }

    final /* synthetic */ void N(Bundle bundle, long j) {
        if (TextUtils.isEmpty(p().G())) {
            M(bundle, 0, j);
        } else {
            k().M().a("Using developer consent only; google app id found");
        }
    }

    public final void O(ax.b6.M0 m0) throws RemoteException {
        l().D(new L3(this, m0));
    }

    public final void P(InterfaceC2070r interfaceC2070r) {
        InterfaceC2070r interfaceC2070r2;
        n();
        v();
        if (interfaceC2070r != null && interfaceC2070r != (interfaceC2070r2 = this.d)) {
            C0821p.p(interfaceC2070r2 == null, "EventInterceptor already set.");
        }
        this.d = interfaceC2070r;
    }

    final /* synthetic */ void P0(String str) {
        if (p().K(str)) {
            p().I();
        }
    }

    public final void Q(InterfaceC2072t interfaceC2072t) {
        v();
        C0821p.l(interfaceC2072t);
        if (this.e.add(interfaceC2072t)) {
            return;
        }
        k().L().a("OnEventListener already registered");
    }

    final void R(C3746u c3746u, boolean z) {
        S3 s3 = new S3(this, c3746u);
        if (!z) {
            l().D(s3);
        } else {
            n();
            s3.run();
        }
    }

    public final void R0(String str, String str2, Bundle bundle) {
        i0(str, str2, bundle, true, true, b().a());
    }

    final void S(C3667h3 c3667h3) {
        n();
        boolean z = (c3667h3.B() && c3667h3.A()) || t().h0();
        if (z != this.a.q()) {
            this.a.w(z);
            Boolean O = h().O();
            if (!z || O == null || O.booleanValue()) {
                b0(Boolean.valueOf(z), false);
            }
        }
    }

    public final void S0(boolean z) {
        if (a().getApplicationContext() instanceof Application) {
            Application application = (Application) a().getApplicationContext();
            if (this.c == null) {
                this.c = new X3(this);
            }
            if (z) {
                application.unregisterActivityLifecycleCallbacks(this.c);
                application.registerActivityLifecycleCallbacks(this.c);
                k().K().a("Registered activity lifecycle callback");
            }
        }
    }

    public final void T(C3667h3 c3667h3, long j, boolean z) {
        C3667h3 c3667h32;
        boolean z2;
        C3667h3 c3667h33;
        boolean z3;
        boolean z4;
        v();
        int b = c3667h3.b();
        if (C1565g6.a() && d().t(F.R0)) {
            if (b != -10) {
                EnumC2067o t = c3667h3.t();
                EnumC2067o enumC2067o = EnumC2067o.UNINITIALIZED;
                if (t == enumC2067o && c3667h3.v() == enumC2067o) {
                    k().M().a("Ignoring empty consent settings");
                    return;
                }
            }
        } else if (b != -10 && c3667h3.w() == null && c3667h3.x() == null) {
            k().M().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.h) {
            try {
                c3667h32 = this.m;
                z2 = false;
                if (C3667h3.l(b, c3667h32.b())) {
                    z3 = c3667h3.u(this.m);
                    if (c3667h3.B() && !this.m.B()) {
                        z2 = true;
                    }
                    c3667h33 = c3667h3.p(this.m);
                    this.m = c3667h33;
                    z4 = z2;
                    z2 = true;
                } else {
                    c3667h33 = c3667h3;
                    z3 = false;
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            k().J().b("Ignoring lower-priority consent settings, proposed settings", c3667h33);
            return;
        }
        long andIncrement = this.n.getAndIncrement();
        if (z3) {
            X0(null);
            V3 v3 = new V3(this, c3667h33, j, andIncrement, z4, c3667h32);
            if (!z) {
                l().G(v3);
                return;
            } else {
                n();
                v3.run();
                return;
            }
        }
        U3 u3 = new U3(this, c3667h33, andIncrement, z4, c3667h32);
        if (z) {
            n();
            u3.run();
        } else if (b == 30 || b == -10) {
            l().G(u3);
        } else {
            l().D(u3);
        }
    }

    public final void T0(long j) {
        l().D(new A3(this, j));
    }

    public final void U0(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.s3
            @Override // java.lang.Runnable
            public final void run() {
                C3688k3.this.L(bundle2);
            }
        });
    }

    public final void V0(final Bundle bundle, final long j) {
        l().G(new Runnable() { // from class: com.google.android.gms.measurement.internal.r3
            @Override // java.lang.Runnable
            public final void run() {
                C3688k3.this.N(bundle, j);
            }
        });
    }

    final void X0(String str) {
        this.g.set(str);
    }

    final void Y0(String str, String str2, Bundle bundle) {
        n();
        d0(str, str2, b().a(), bundle);
    }

    public final void Z0(boolean z) {
        v();
        l().D(new RunnableC3774y3(this, z));
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0(Boolean bool) {
        v();
        l().D(new T3(this, bool));
    }

    public final void a1(Bundle bundle, long j) {
        M(bundle, -20, j);
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ ax.R5.e b() {
        return super.b();
    }

    public final void c0(final String str, long j) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.a.k().L().a("User ID must be non-empty or null");
        } else {
            l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.v3
                @Override // java.lang.Runnable
                public final void run() {
                    C3688k3.this.P0(str);
                }
            });
            l0(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3663h d() {
        return super.d();
    }

    final void d0(String str, String str2, long j, Bundle bundle) {
        n();
        e0(str, str2, j, bundle, true, this.d == null || B5.J0(str2), true, null);
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3628c e() {
        return super.e();
    }

    protected final void e0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        long j2;
        long j3;
        String str4;
        int i;
        int length;
        String str5 = str;
        C0821p.f(str5);
        C0821p.l(bundle);
        n();
        v();
        if (!this.a.p()) {
            k().F().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> H = p().H();
        if (H != null && !H.contains(str2)) {
            k().F().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                try {
                    (!this.a.t() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, a().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, a());
                } catch (Exception e) {
                    k().L().b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                k().J().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            j0("auto", "_lgclid", bundle.getString("gclid"), b().a());
        }
        C3688k3 c3688k3 = this;
        if (z && B5.N0(str2)) {
            c3688k3.i().N(bundle, c3688k3.h().A.a());
        }
        if (!z3 && !"_iap".equals(str2)) {
            B5 L = c3688k3.a.L();
            int i2 = 2;
            if (L.C0("event", str2)) {
                if (!L.p0("event", C2069q.a, C2069q.b, str2)) {
                    i2 = 13;
                } else if (L.j0("event", 40, str2)) {
                    i2 = 0;
                }
            }
            if (i2 != 0) {
                c3688k3.k().H().b("Invalid public event name. Event will not be logged (FE)", c3688k3.g().c(str2));
                c3688k3.a.L();
                String J = B5.J(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                c3688k3.a.L();
                B5.Y(c3688k3.u, i2, "_ev", J, length);
                return;
            }
        }
        C3640d4 C = c3688k3.s().C(false);
        if (C != null && !bundle.containsKey("_sc")) {
            C.d = true;
        }
        B5.X(C, bundle, z && !z3);
        boolean equals = "am".equals(str5);
        boolean J0 = B5.J0(str2);
        if (z && c3688k3.d != null && !J0 && !equals) {
            c3688k3.k().F().c("Passing event to registered event handler (FE)", c3688k3.g().c(str2), c3688k3.g().a(bundle));
            C0821p.l(c3688k3.d);
            c3688k3.d.a(str5, str2, bundle, j);
            return;
        }
        long j4 = j;
        if (c3688k3.a.s()) {
            int v = c3688k3.i().v(str2);
            if (v != 0) {
                c3688k3.k().H().b("Invalid event name. Event will not be logged (FE)", c3688k3.g().c(str2));
                c3688k3.i();
                String J2 = B5.J(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                c3688k3.a.L();
                B5.Z(c3688k3.u, str3, v, "_ev", J2, length);
                return;
            }
            Bundle F = c3688k3.i().F(str3, str2, bundle, ax.R5.f.b("_o", "_sn", "_sc", "_si"), z3);
            C0821p.l(F);
            if (c3688k3.s().C(false) == null || !"_ae".equals(str2)) {
                z4 = equals;
                j2 = 0;
            } else {
                C3620a5 c3620a5 = c3688k3.u().f;
                j2 = 0;
                long b = c3620a5.d.b().b();
                z4 = equals;
                long j5 = b - c3620a5.b;
                c3620a5.b = b;
                if (j5 > 0) {
                    c3688k3.i().M(F, j5);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                B5 i3 = c3688k3.i();
                String string = F.getString("_ffr");
                if (ax.R5.o.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, i3.h().x.a())) {
                    i3.k().F().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                i3.h().x.b(string);
            } else if ("_ae".equals(str2)) {
                String a = c3688k3.i().h().x.a();
                if (!TextUtils.isEmpty(a)) {
                    F.putString("_ffr", a);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(F);
            boolean F2 = c3688k3.d().t(F.H0) ? c3688k3.u().F() : c3688k3.h().u.b();
            if (c3688k3.h().r.a() > j2 && c3688k3.h().z(j4) && F2) {
                c3688k3.k().K().a("Current session is expired, remove the session number, ID, and engagement time");
                j3 = j2;
                str4 = "_ae";
                j0("auto", "_sid", null, c3688k3.b().a());
                j0("auto", "_sno", null, b().a());
                j0("auto", "_se", null, b().a());
                c3688k3 = this;
                c3688k3.h().s.b(j3);
            } else {
                j3 = j2;
                str4 = "_ae";
            }
            if (F.getLong("extend_session", j3) == 1) {
                c3688k3.k().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i = 1;
                c3688k3.a.K().e.b(j4, true);
            } else {
                i = 1;
            }
            ArrayList arrayList2 = new ArrayList(F.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4 += i;
                String str6 = (String) obj;
                if (str6 != null) {
                    c3688k3.i();
                    Bundle[] x0 = B5.x0(F.get(str6));
                    if (x0 != null) {
                        F.putParcelableArray(str6, x0);
                    }
                }
                i = 1;
            }
            int i5 = 0;
            while (i5 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i5);
                String str7 = i5 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str5);
                if (z2) {
                    bundle2 = c3688k3.i().E(bundle2, null);
                }
                String str8 = str5;
                Bundle bundle3 = bundle2;
                c3688k3.t().K(new D(str7, new C(bundle2), str8, j4), str3);
                if (!z4) {
                    Iterator<InterfaceC2072t> it = c3688k3.e.iterator();
                    while (it.hasNext()) {
                        it.next().a(str, str2, new Bundle(bundle3), j);
                    }
                }
                i5++;
                str5 = str;
                j4 = j;
            }
            if (c3688k3.s().C(false) == null || !str4.equals(str2)) {
                return;
            }
            c3688k3.u().E(true, true, c3688k3.b().b());
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3758w f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ R1 g() {
        return super.g();
    }

    public final void g0(String str, String str2, Bundle bundle) {
        long a = b().a();
        C0821p.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        l().D(new K3(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3659g2 h() {
        return super.h();
    }

    public final void h0(String str, String str2, Bundle bundle, String str3) {
        m();
        Q0(str, str2, b().a(), bundle, false, true, true, str3);
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ B5 i() {
        return super.i();
    }

    public final void i0(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            s().I(bundle2, j);
        } else {
            Q0(str3, str2, j, bundle2, z2, !z2 || this.d == null || B5.J0(str2), z, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    final void j0(String str, String str2, Object obj, long j) {
        C0821p.f(str);
        C0821p.f(str2);
        n();
        v();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long valueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    h().o.b(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    k().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                h().o.b("unset");
                str2 = "_npa";
            }
            k().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.a.p()) {
            k().K().a("User property not set since app measurement is disabled");
        } else if (this.a.s()) {
            t().O(new A5(str4, j, obj2, str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ V1 k() {
        return super.k();
    }

    public final void k0(String str, String str2, Object obj, boolean z) {
        l0(str, str2, obj, z, b().a());
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3779z2 l() {
        return super.l();
    }

    public final void l0(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            i = i().r0(str2);
        } else {
            B5 i2 = i();
            if (i2.C0("user property", str2)) {
                if (!i2.o0("user property", C2071s.a, str2)) {
                    i = 15;
                } else if (i2.j0("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            i();
            String J = B5.J(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.a.L();
            B5.Y(this.u, i, "_ev", J, length);
            return;
        }
        if (obj == null) {
            f0(str3, str2, j, null);
            return;
        }
        int w = i().w(str2, obj);
        if (w == 0) {
            Object A0 = i().A0(str2, obj);
            if (A0 != null) {
                f0(str3, str2, j, A0);
                return;
            }
            return;
        }
        i();
        String J2 = B5.J(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        this.a.L();
        B5.Y(this.u, w, "_ev", J2, length);
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    final /* synthetic */ void m0(List list) {
        boolean contains;
        n();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> K = h().K();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3669h5 c3669h5 = (C3669h5) it.next();
                contains = K.contains(c3669h5.d0);
                if (!contains || K.get(c3669h5.d0).longValue() < c3669h5.c0) {
                    z0().add(c3669h5);
                }
            }
            F0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    final /* synthetic */ void n0(AtomicReference atomicReference) {
        Bundle a = h().p.a();
        C3689k4 t = t();
        if (a == null) {
            a = new Bundle();
        }
        t.R(atomicReference, a);
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3776z o() {
        return super.o();
    }

    public final Application.ActivityLifecycleCallbacks o0() {
        return this.c;
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ Q1 p() {
        return super.p();
    }

    public final C2053a p0() {
        n();
        return t().V();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ P1 q() {
        return super.q();
    }

    public final Boolean q0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) l().v(atomicReference, 15000L, "boolean test flag value", new RunnableC3750u3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3688k3 r() {
        return super.r();
    }

    public final Double r0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) l().v(atomicReference, 15000L, "double test flag value", new Q3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3654f4 s() {
        return super.s();
    }

    public final Integer s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) l().v(atomicReference, 15000L, "int test flag value", new R3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3689k4 t() {
        return super.t();
    }

    public final Long t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) l().v(atomicReference, 15000L, "long test flag value", new N3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ V4 u() {
        return super.u();
    }

    public final String u0() {
        return this.g.get();
    }

    public final String v0() {
        C3640d4 P = this.a.I().P();
        if (P != null) {
            return P.b;
        }
        return null;
    }

    public final String w0() {
        C3640d4 P = this.a.I().P();
        if (P != null) {
            return P.a;
        }
        return null;
    }

    public final String x0() {
        if (this.a.M() != null) {
            return this.a.M();
        }
        try {
            return new C2065m(a(), this.a.P()).b("google_app_id");
        } catch (IllegalStateException e) {
            this.a.k().G().b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final String y0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) l().v(atomicReference, 15000L, "String test flag value", new G3(this, atomicReference));
    }

    @TargetApi(30)
    final PriorityQueue<C3669h5> z0() {
        if (this.l == null) {
            C2075w.a();
            this.l = C2074v.a(Comparator.CC.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.n3
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long valueOf;
                    valueOf = Long.valueOf(((C3669h5) obj).c0);
                    return valueOf;
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new java.util.Comparator() { // from class: com.google.android.gms.measurement.internal.m3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                    return compare;
                }
            }));
        }
        return this.l;
    }
}
