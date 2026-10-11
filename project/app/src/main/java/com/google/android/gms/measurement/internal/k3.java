/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import ax.M5.p;
import ax.R5.o;
import ax.b6.M0;
import ax.b6.g6;
import ax.b6.k7;
import ax.b6.m6;
import ax.b6.r7;
import ax.e2.a;
import ax.f6.m;
import ax.f6.n;
import ax.f6.q;
import ax.f6.r;
import ax.f6.t;
import ax.f6.v;
import ax.f6.w;
import ax.f6.x;
import com.google.android.gms.measurement.internal.A3;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.B3;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.C3;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.D3;
import com.google.android.gms.measurement.internal.D5;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.E3;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.F3;
import com.google.android.gms.measurement.internal.G3;
import com.google.android.gms.measurement.internal.G5;
import com.google.android.gms.measurement.internal.H3;
import com.google.android.gms.measurement.internal.I3;
import com.google.android.gms.measurement.internal.J3;
import com.google.android.gms.measurement.internal.K3;
import com.google.android.gms.measurement.internal.L3;
import com.google.android.gms.measurement.internal.M3;
import com.google.android.gms.measurement.internal.N3;
import com.google.android.gms.measurement.internal.P3;
import com.google.android.gms.measurement.internal.Q3;
import com.google.android.gms.measurement.internal.R3;
import com.google.android.gms.measurement.internal.S3;
import com.google.android.gms.measurement.internal.T3;
import com.google.android.gms.measurement.internal.U3;
import com.google.android.gms.measurement.internal.V3;
import com.google.android.gms.measurement.internal.V4;
import com.google.android.gms.measurement.internal.X3;
import com.google.android.gms.measurement.internal.a5;
import com.google.android.gms.measurement.internal.b1;
import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.f5;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.h5;
import com.google.android.gms.measurement.internal.k4;
import com.google.android.gms.measurement.internal.m2;
import com.google.android.gms.measurement.internal.m3;
import com.google.android.gms.measurement.internal.n3;
import com.google.android.gms.measurement.internal.o3;
import com.google.android.gms.measurement.internal.q3;
import com.google.android.gms.measurement.internal.r3;
import com.google.android.gms.measurement.internal.s;
import com.google.android.gms.measurement.internal.s3;
import com.google.android.gms.measurement.internal.t3;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.u3;
import com.google.android.gms.measurement.internal.v3;
import com.google.android.gms.measurement.internal.w3;
import com.google.android.gms.measurement.internal.x3;
import com.google.android.gms.measurement.internal.y3;
import com.google.android.gms.measurement.internal.z3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

public final class k3
extends b1 {
    private X3 c;
    private r d;
    private final Set<t> e = new CopyOnWriteArraySet<t>();
    private boolean f;
    private final AtomicReference<String> g;
    private final Object h = new Object();
    private boolean i = false;
    private int j = 1;
    private s k;
    private PriorityQueue<h5> l;
    private h3 m;
    private final AtomicLong n;
    private long o = -1L;
    final G5 p;
    private boolean q = true;
    private s r;
    private SharedPreferences.OnSharedPreferenceChangeListener s;
    private s t;
    private final D5 u = new P3(this);

    protected k3(E2 e22) {
        super(e22);
        this.g = new AtomicReference();
        this.m = h3.c;
        this.n = new AtomicLong(0L);
        this.p = new G5(e22);
    }

    static /* bridge */ /* synthetic */ int B(k3 k32) {
        return k32.j;
    }

    static /* synthetic */ int C(Long l8, Long l9) {
        return Long.compare(l8, l9);
    }

    public static int D(String string) {
        ax.M5.p.f(string);
        return 25;
    }

    static /* synthetic */ Long E(h5 h52) {
        return h52.c0;
    }

    private final void H0() {
        ((f3)this).n();
        String string = ((f3)this).h().o.a();
        if (string != null) {
            if ("unset".equals(string)) {
                this.j0("app", "_npa", null, ((f3)this).b().a());
            } else {
                long l8 = "true".equals(string) ? 1L : 0L;
                this.j0("app", "_npa", l8, ((f3)this).b().a());
            }
        }
        if (this.a.p() && this.q) {
            ((f3)this).k().F().a("Recording app launch after enabling measurement for the first time (FE)");
            this.A0();
            ((C1)this).u().e.a();
            ((f3)this).l().D(new B3(this));
            return;
        }
        ((f3)this).k().F().a("Updating Scion state (FE)");
        ((C1)this).t().e0();
    }

    static /* bridge */ /* synthetic */ s I0(k3 k32) {
        return k32.r;
    }

    private final void M(Bundle object, int n8, long l8) {
        this.v();
        Object object2 = h3.k(object);
        if (object2 != null) {
            ((f3)this).k().M().b("Ignoring invalid consent setting", object2);
            ((f3)this).k().M().a("Valid consent values are 'granted', 'denied'");
        }
        boolean bl = ((f3)this).l().J();
        object2 = h3.f(object, n8);
        if (((h3)object2).C()) {
            this.T((h3)object2, l8, bl);
        }
        if (((u)(object2 = com.google.android.gms.measurement.internal.u.b(object, n8))).k()) {
            this.R((u)object2, bl);
        }
        if ((object2 = com.google.android.gms.measurement.internal.u.e(object)) != null) {
            object = n8 == -30 ? "tcf" : "app";
            this.k0((String)object, "allow_personalized_ads", ((Boolean)object2).toString(), false);
        }
    }

    static /* synthetic */ void N0(k3 k32, int n8) {
        if (k32.k == null) {
            k32.k = new z3(k32, k32.a);
        }
        k32.k.b(n8 * 1000);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static /* synthetic */ void O0(k3 k32, Bundle object) {
        D d8;
        D d9;
        D d10;
        ((f3)k32).n();
        k32.v();
        ax.M5.p.l(object);
        Object object2 = object.getString("name");
        String string = object.getString("origin");
        ax.M5.p.f((String)object2);
        ax.M5.p.f(string);
        ax.M5.p.l(object.get("value"));
        if (!k32.a.p()) {
            ((f3)k32).k().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        object2 = new A5((String)object2, object.getLong("triggered_timestamp"), object.get("value"), string);
        try {
            d10 = ((f3)k32).i().H(object.getString("app_id"), object.getString("triggered_event_name"), object.getBundle("triggered_event_params"), string, 0L, true, true);
            d9 = ((f3)k32).i().H(object.getString("app_id"), object.getString("timed_out_event_name"), object.getBundle("timed_out_event_params"), string, 0L, true, true);
            d8 = ((f3)k32).i().H(object.getString("app_id"), object.getString("expired_event_name"), object.getBundle("expired_event_params"), string, 0L, true, true);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
        f f8 = new f(object.getString("app_id"), string, (A5)object2, object.getLong("creation_timestamp"), false, object.getString("trigger_event_name"), d9, object.getLong("trigger_timeout"), d10, object.getLong("time_to_live"), d8);
        ((C1)k32).t().J(f8);
    }

    private final void Q0(String string, String string2, long l8, Bundle bundle, boolean bl, boolean bl2, boolean bl3, String string3) {
        bundle = B5.D(bundle);
        ((f3)this).l().D(new C3(this, string, string2, l8, bundle, bl, bl2, bl3, string3));
    }

    static /* bridge */ /* synthetic */ void U(k3 k32, int n8) {
        k32.j = n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static /* synthetic */ void V(k3 k32, Bundle object) {
        D d8;
        ((f3)k32).n();
        k32.v();
        ax.M5.p.l(object);
        Object object2 = ax.M5.p.f(object.getString("name"));
        if (!k32.a.p()) {
            ((f3)k32).k().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        object2 = new A5((String)object2, 0L, null, "");
        try {
            d8 = ((f3)k32).i().H(object.getString("app_id"), object.getString("expired_event_name"), object.getBundle("expired_event_params"), "", object.getLong("creation_timestamp"), true, true);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
        f f8 = new f(object.getString("app_id"), "", (A5)object2, object.getLong("creation_timestamp"), object.getBoolean("active"), object.getString("trigger_event_name"), null, object.getLong("trigger_timeout"), null, object.getLong("time_to_live"), d8);
        ((C1)k32).t().J(f8);
    }

    static /* synthetic */ void W(k3 k32, h3 h32, long l8, boolean bl, boolean bl2) {
        ((f3)k32).n();
        k32.v();
        h3 h33 = ((f3)k32).h().M();
        if (l8 <= k32.o && h3.l(h33.b(), h32.b())) {
            ((f3)k32).k().J().b("Dropped out-of-date consent setting, proposed settings", h32);
            return;
        }
        if (((f3)k32).h().B(h32)) {
            ((f3)k32).k().K().b("Setting storage consent(FE)", h32);
            k32.o = l8;
            if (((C1)k32).t().i0()) {
                ((C1)k32).t().n0(bl);
            } else {
                ((C1)k32).t().U(bl);
            }
            if (bl2) {
                ((C1)k32).t().Q(new AtomicReference<String>());
            }
            return;
        }
        ((f3)k32).k().J().b("Lower precedence consent source ignored, proposed source", h32.b());
    }

    static /* synthetic */ void W0(k3 k32) {
        k32.H0();
    }

    static /* synthetic */ void X(k3 k32, h3 h32, h3 h33) {
        block3: {
            block2: {
                if (m6.a() && ((f3)k32).d().t(F.V0)) break block2;
                h3.a a8 = h3.a.d0;
                h3.a a9 = h3.a.c0;
                boolean bl = h32.n(h33, a8, a9);
                boolean bl2 = h32.s(h33, a8, a9);
                if (bl || bl2) break block3;
            }
            return;
        }
        ((C1)k32).p().I();
    }

    static /* bridge */ /* synthetic */ void Y(k3 k32, Boolean bl, boolean bl2) {
        k32.b0(bl, true);
    }

    static /* bridge */ /* synthetic */ void Z(k3 k32, boolean bl) {
        k32.i = false;
    }

    private final void b0(Boolean bl, boolean bl2) {
        ((f3)this).n();
        this.v();
        ((f3)this).k().F().b("Setting app measurement enabled (FE)", bl);
        ((f3)this).h().w(bl);
        if (bl2) {
            ((f3)this).h().E(bl);
        }
        if (!this.a.q() && (bl == null || bl.booleanValue())) {
            return;
        }
        this.H0();
    }

    private final void f0(String string, String string2, long l8, Object object) {
        ((f3)this).l().D(new E3(this, string, string2, object, l8));
    }

    @Override
    protected final boolean A() {
        return false;
    }

    public final void A0() {
        ((f3)this).n();
        this.v();
        if (this.a.s()) {
            Object object = ((f3)this).d().D("google_analytics_deferred_deep_link_enabled");
            if (object != null && ((Boolean)object).booleanValue()) {
                ((f3)this).k().F().a("Deferred Deep Link feature enabled.");
                ((f3)this).l().D(new x(this));
            }
            ((C1)this).t().X();
            this.q = false;
            object = ((f3)this).h().Q();
            if (!TextUtils.isEmpty((CharSequence)object)) {
                ((f3)this).f().p();
                if (!((String)object).equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", (String)object);
                    this.Y0("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void B0() {
        if (((f3)this).a().getApplicationContext() instanceof Application && this.c != null) {
            ((Application)((f3)this).a().getApplicationContext()).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.c);
        }
    }

    final void C0() {
        if (k7.a() && ((f3)this).d().t(F.B0)) {
            if (((f3)this).l().J()) {
                ((f3)this).k().G().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (com.google.android.gms.measurement.internal.c.a()) {
                ((f3)this).k().G().a("Cannot get trigger URIs from main thread");
                return;
            }
            this.v();
            ((f3)this).k().K().a("Getting trigger URIs (FE)");
            Object object = new AtomicReference();
            ((f3)this).l().v(object, 5000L, "get trigger URIs", new q3(this, (AtomicReference)object));
            object = (List)((AtomicReference)object).get();
            if (object == null) {
                ((f3)this).k().G().a("Timed out waiting for get trigger URIs");
                return;
            }
            ((f3)this).l().D(new o3(this, (List)object));
        }
    }

    public final void D0() {
        ((f3)this).n();
        if (((f3)this).h().v.b()) {
            ((f3)this).k().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long l8 = ((f3)this).h().w.a();
        ((f3)this).h().w.b(1L + l8);
        if (l8 >= 5L) {
            ((f3)this).k().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            ((f3)this).h().v.a(true);
            return;
        }
        if (this.r == null) {
            this.r = new F3(this, this.a);
        }
        this.r.b(0L);
    }

    public final void E0() {
        ((f3)this).n();
        ((f3)this).k().F().a("Handle tcf update.");
        f5 f52 = f5.c(((f3)this).h().H());
        ((f3)this).k().K().b("Tcf preferences read", f52);
        if (((f3)this).h().C(f52)) {
            Bundle bundle = f52.b();
            ((f3)this).k().K().b("Consent generated from Tcf", bundle);
            if (bundle != Bundle.EMPTY) {
                this.M(bundle, -30, ((f3)this).b().a());
            }
            bundle = new Bundle();
            bundle.putString("_tcfd", f52.e());
            this.Y0("auto", "_tcf", bundle);
        }
    }

    public final ArrayList<Bundle> F(String object, String string) {
        if (((f3)this).l().J()) {
            ((f3)this).k().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<Bundle>(0);
        }
        if (com.google.android.gms.measurement.internal.c.a()) {
            ((f3)this).k().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList<Bundle>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.l().v(atomicReference, 5000L, "get conditional user properties", new J3(this, atomicReference, null, (String)object, string));
        object = (List)atomicReference.get();
        if (object == null) {
            ((f3)this).k().G().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList<Bundle>();
        }
        return B5.t0((List<f>)object);
    }

    @TargetApi(value=30)
    final void F0() {
        Object object;
        h5 h52;
        ((f3)this).n();
        if (!this.z0().isEmpty() && !this.i && (h52 = this.z0().poll()) != null && (object = ((f3)this).i().S0()) != null) {
            Object object2;
            this.i = true;
            ((f3)this).k().K().b("Registering trigger URI", h52.q);
            object = ((a)object).c(Uri.parse((String)h52.q));
            if (object == null) {
                this.i = false;
                this.z0().add(h52);
                return;
            }
            if (!((f3)this).d().t(F.G0)) {
                object2 = ((f3)this).h().K();
                object2.put(h52.d0, (Object)h52.c0);
                ((f3)this).h().v((SparseArray<Long>)object2);
            }
            object2 = new x3(this);
            ax.v7.c.a(object, new w3(this, h52), object2);
        }
    }

    public final Map<String, Object> G(String object, String object2, boolean bl) {
        if (((f3)this).l().J()) {
            ((f3)this).k().G().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (com.google.android.gms.measurement.internal.c.a()) {
            ((f3)this).k().G().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        Object object3 = new AtomicReference();
        this.a.l().v(object3, 5000L, "get user properties", new M3(this, (AtomicReference)object3, null, (String)object, (String)object2, bl));
        object2 = (List)((AtomicReference)object3).get();
        if (object2 == null) {
            ((f3)this).k().G().b("Timed out waiting for handle get user properties, includeInternal", bl);
            return Collections.EMPTY_MAP;
        }
        object = new ax.B.a(object2.size());
        object3 = object2.iterator();
        while (object3.hasNext()) {
            object2 = (A5)object3.next();
            Object object4 = ((A5)object2).k();
            if (object4 == null) continue;
            object.put(((A5)object2).c0, object4);
        }
        return object;
    }

    public final void G0() {
        ((f3)this).n();
        ((f3)this).k().F().a("Register tcfPrefChangeListener.");
        if (this.s == null) {
            this.t = new D3(this, this.a);
            this.s = new t3(this);
        }
        ((f3)this).h().H().registerOnSharedPreferenceChangeListener(this.s);
    }

    public final void H(long l8) {
        this.X0(null);
        ((f3)this).l().D(new I3(this, l8));
    }

    final void I(long l8, boolean bl) {
        ((f3)this).n();
        this.v();
        ((f3)this).k().F().a("Resetting analytics data (FE)");
        f3 f32 = ((C1)this).u();
        f32.n();
        ((V4)f32).f.b();
        ((C1)this).p().I();
        boolean bl2 = this.a.p();
        f32 = ((f3)this).h();
        ((g2)f32).g.b(l8);
        if (!TextUtils.isEmpty((CharSequence)f32.h().x.a())) {
            ((g2)f32).x.b(null);
        }
        ((g2)f32).r.b(0L);
        ((g2)f32).s.b(0L);
        if (!f32.d().U()) {
            ((g2)f32).G(bl2 ^ true);
        }
        ((g2)f32).y.b(null);
        ((g2)f32).z.b(0L);
        ((g2)f32).A.b(null);
        if (bl) {
            ((C1)this).t().c0();
        }
        ((C1)this).u().e.a();
        this.q = bl2 ^ true;
    }

    public final void J(Intent object) {
        if (r7.a() && ((f3)this).d().t(F.u0)) {
            if ((object = object.getData()) == null) {
                ((f3)this).k().J().a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String string = object.getQueryParameter("sgtm_debug_enable");
            if (string != null && string.equals("1")) {
                if (!TextUtils.isEmpty((CharSequence)(object = object.getQueryParameter("sgtm_preview_key")))) {
                    ((f3)this).k().J().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", object);
                    ((f3)this).d().K((String)object);
                    return;
                }
            } else {
                ((f3)this).k().J().a("Preview Mode was not enabled.");
                ((f3)this).d().K(null);
            }
        }
    }

    final void J0(long l8) {
        this.I(l8, true);
    }

    final /* synthetic */ void K(SharedPreferences sharedPreferences, String string) {
        if ("IABTCF_TCString".equals(string)) {
            ((f3)this).k().K().a("IABTCF_TCString change picked up in listener.");
            ax.M5.p.l(this.t).b(500L);
        }
    }

    public final void K0(Bundle bundle) {
        this.L0(bundle, ((f3)this).b().a());
    }

    final /* synthetic */ void L(Bundle bundle) {
        if (bundle == null) {
            ((f3)this).h().A.b(new Bundle());
            return;
        }
        Bundle bundle2 = ((f3)this).h().A.a();
        for (String string : bundle.keySet()) {
            Object object = bundle.get(string);
            if (!(object == null || object instanceof String || object instanceof Long || object instanceof Double)) {
                ((f3)this).i();
                if (B5.h0(object)) {
                    ((f3)this).i();
                    B5.Y(this.u, 27, null, null, 0);
                }
                ((f3)this).k().M().c("Invalid default event parameter type. Name, value", string, object);
                continue;
            }
            if (B5.J0(string)) {
                ((f3)this).k().M().b("Invalid default event parameter name. Name", string);
                continue;
            }
            if (object == null) {
                bundle2.remove(string);
                continue;
            }
            if (!((f3)this).i().l0("param", string, ((f3)this).d().r(null, false), object)) continue;
            ((f3)this).i().O(bundle2, string, object);
        }
        ((f3)this).i();
        if (B5.g0(bundle2, ((f3)this).d().H())) {
            ((f3)this).i();
            B5.Y(this.u, 26, null, null, 0);
            ((f3)this).k().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        ((f3)this).h().A.b(bundle2);
        ((C1)this).t().C(bundle2);
    }

    public final void L0(Bundle bundle, long l8) {
        ax.M5.p.l(bundle);
        bundle = new Bundle(bundle);
        if (!TextUtils.isEmpty((CharSequence)bundle.getString("app_id"))) {
            ((f3)this).k().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle.remove("app_id");
        ax.M5.p.l(bundle);
        ax.f6.n.a(bundle, "app_id", String.class, null);
        ax.f6.n.a(bundle, "origin", String.class, null);
        ax.f6.n.a(bundle, "name", String.class, null);
        ax.f6.n.a(bundle, "value", Object.class, null);
        ax.f6.n.a(bundle, "trigger_event_name", String.class, null);
        ax.f6.n.a(bundle, "trigger_timeout", Long.class, 0L);
        ax.f6.n.a(bundle, "timed_out_event_name", String.class, null);
        ax.f6.n.a(bundle, "timed_out_event_params", Bundle.class, null);
        ax.f6.n.a(bundle, "triggered_event_name", String.class, null);
        ax.f6.n.a(bundle, "triggered_event_params", Bundle.class, null);
        ax.f6.n.a(bundle, "time_to_live", Long.class, 0L);
        ax.f6.n.a(bundle, "expired_event_name", String.class, null);
        ax.f6.n.a(bundle, "expired_event_params", Bundle.class, null);
        ax.M5.p.f(bundle.getString("name"));
        ax.M5.p.f(bundle.getString("origin"));
        ax.M5.p.l(bundle.get("value"));
        bundle.putLong("creation_timestamp", l8);
        String string = bundle.getString("name");
        Object object = bundle.get("value");
        if (((f3)this).i().r0(string) != 0) {
            ((f3)this).k().G().b("Invalid conditional user property name", ((f3)this).g().g(string));
            return;
        }
        if (((f3)this).i().w(string, object) != 0) {
            ((f3)this).k().G().c("Invalid conditional user property value", ((f3)this).g().g(string), object);
            return;
        }
        Object object2 = ((f3)this).i().A0(string, object);
        if (object2 == null) {
            ((f3)this).k().G().c("Unable to normalize conditional user property value", ((f3)this).g().g(string), object);
            return;
        }
        ax.f6.n.b(bundle, object2);
        l8 = bundle.getLong("trigger_timeout");
        if (!(TextUtils.isEmpty((CharSequence)bundle.getString("trigger_event_name")) || l8 <= 15552000000L && l8 >= 1L)) {
            ((f3)this).k().G().c("Invalid conditional user property timeout", ((f3)this).g().g(string), l8);
            return;
        }
        l8 = bundle.getLong("time_to_live");
        if (l8 <= 15552000000L && l8 >= 1L) {
            ((f3)this).l().D(new H3(this, bundle));
            return;
        }
        ((f3)this).k().G().c("Invalid conditional user property time to live", ((f3)this).g().g(string), l8);
    }

    public final void M0(t t8) {
        this.v();
        ax.M5.p.l(t8);
        if (!this.e.remove(t8)) {
            ((f3)this).k().L().a("OnEventListener had not been registered");
        }
    }

    final /* synthetic */ void N(Bundle bundle, long l8) {
        if (TextUtils.isEmpty((CharSequence)((C1)this).p().G())) {
            this.M(bundle, 0, l8);
            return;
        }
        ((f3)this).k().M().a("Using developer consent only; google app id found");
    }

    public final void O(M0 m02) throws RemoteException {
        ((f3)this).l().D(new L3(this, m02));
    }

    public final void P(r r8) {
        r r9;
        ((f3)this).n();
        this.v();
        if (r8 != null && r8 != (r9 = this.d)) {
            boolean bl = r9 == null;
            ax.M5.p.p(bl, "EventInterceptor already set.");
        }
        this.d = r8;
    }

    final /* synthetic */ void P0(String string) {
        if (((C1)this).p().K(string)) {
            ((C1)this).p().I();
        }
    }

    public final void Q(t t8) {
        this.v();
        ax.M5.p.l(t8);
        if (!this.e.add(t8)) {
            ((f3)this).k().L().a("OnEventListener already registered");
        }
    }

    final void R(u object, boolean bl) {
        object = new S3(this, (u)object);
        if (bl) {
            ((f3)this).n();
            object.run();
            return;
        }
        ((f3)this).l().D((Runnable)object);
    }

    public final void R0(String string, String string2, Bundle bundle) {
        this.i0(string, string2, bundle, true, true, ((f3)this).b().a());
    }

    final void S(h3 object) {
        ((f3)this).n();
        boolean bl = ((h3)object).B() && ((h3)object).A() || ((C1)this).t().h0();
        if (bl != this.a.q()) {
            this.a.w(bl);
            object = ((f3)this).h().O();
            if (!bl || object == null || ((Boolean)object).booleanValue()) {
                this.b0(bl, false);
            }
        }
    }

    public final void S0(boolean bl) {
        if (((f3)this).a().getApplicationContext() instanceof Application) {
            Application application = (Application)((f3)this).a().getApplicationContext();
            if (this.c == null) {
                this.c = new X3(this);
            }
            if (bl) {
                application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.c);
                application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.c);
                ((f3)this).k().K().a("Registered activity lifecycle callback");
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void T(h3 object, long l8, boolean bl) {
        boolean bl3;
        boolean bl4;
        boolean bl2;
        Object object2;
        int n8;
        block16: {
            block14: {
                block15: {
                    Object object3;
                    this.v();
                    n8 = ((h3)object).b();
                    if (g6.a() && ((f3)this).d().t(F.R0)) {
                        if (n8 != -10 && (object3 = ((h3)object).t()) == (object2 = ax.f6.o.c0) && ((h3)object).v() == object2) {
                            ((f3)this).k().M().a("Ignoring empty consent settings");
                            return;
                        }
                    } else if (n8 != -10 && ((h3)object).w() == null && ((h3)object).x() == null) {
                        ((f3)this).k().M().a("Discarding empty consent settings");
                        return;
                    }
                    object3 = this.h;
                    // MONITORENTER : object3
                    object2 = this.m;
                    bl2 = h3.l(n8, ((h3)object2).b());
                    bl4 = false;
                    boolean bl5 = false;
                    if (!bl2) break block14;
                    bl3 = ((h3)object).u(this.m);
                    bl2 = bl5;
                    if (!((h3)object).B()) break block15;
                    bl2 = bl5;
                    if (!this.m.B()) {
                        bl2 = true;
                    }
                }
                this.m = object = ((h3)object).p(this.m);
                bl4 = true;
                break block16;
            }
            bl3 = false;
            bl2 = false;
        }
        // MONITOREXIT : object3
        if (!bl4) {
            ((f3)this).k().J().b("Ignoring lower-priority consent settings, proposed settings", object);
            return;
        }
        long l9 = this.n.getAndIncrement();
        if (bl3) {
            this.X0(null);
            object = new V3(this, (h3)object, l8, l9, bl2, (h3)object2);
            if (bl) {
                ((f3)this).n();
                object.run();
                return;
            }
            ((f3)this).l().G((Runnable)object);
            return;
        }
        object = new U3(this, (h3)object, l9, bl2, (h3)object2);
        if (bl) {
            ((f3)this).n();
            object.run();
            return;
        }
        if (n8 != 30 && n8 != -10) {
            ((f3)this).l().D((Runnable)object);
            return;
        }
        ((f3)this).l().G((Runnable)object);
    }

    public final void T0(long l8) {
        ((f3)this).l().D(new A3(this, l8));
    }

    public final void U0(Bundle object) {
        object = object == null ? null : new Bundle(object);
        ((f3)this).l().D(new s3(this, (Bundle)object));
    }

    public final void V0(Bundle bundle, long l8) {
        ((f3)this).l().G(new r3(this, bundle, l8));
    }

    final void X0(String string) {
        this.g.set(string);
    }

    final void Y0(String string, String string2, Bundle bundle) {
        ((f3)this).n();
        this.d0(string, string2, ((f3)this).b().a(), bundle);
    }

    public final void Z0(boolean bl) {
        this.v();
        ((f3)this).l().D(new y3(this, bl));
    }

    public final void a0(Boolean bl) {
        this.v();
        ((f3)this).l().D(new T3(this, bl));
    }

    public final void a1(Bundle bundle, long l8) {
        this.M(bundle, -20, l8);
    }

    public final void c0(String string, long l8) {
        if (string != null && TextUtils.isEmpty((CharSequence)string)) {
            this.a.k().L().a("User ID must be non-empty or null");
            return;
        }
        ((f3)this).l().D(new v3(this, string));
        this.l0(null, "_id", string, true, l8);
    }

    final void d0(String string, String string2, long l8, Bundle bundle) {
        ((f3)this).n();
        boolean bl = this.d == null || B5.J0(string2);
        this.e0(string, string2, l8, bundle, true, bl, true, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void e0(String string, String string2, long l8, Bundle object, boolean bl, boolean bl2, boolean bl3, String string3) {
        Object object2;
        int n8;
        boolean bl4;
        int n10 = 0;
        int n9 = 0;
        ax.M5.p.f(string);
        ax.M5.p.l(object);
        ((f3)this).n();
        this.v();
        if (!this.a.p()) {
            ((f3)this).k().F().a("Event not sent since app measurement is disabled");
            return;
        }
        Object object3 = ((C1)this).p().H();
        if (object3 != null && !object3.contains(string2)) {
            ((f3)this).k().F().c("Dropping non-safelisted event. event name, origin", string2, string);
            return;
        }
        if (!this.f) {
            this.f = true;
            bl4 = this.a.t();
            object3 = !bl4 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, ((f3)this).a().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService");
            try {
                ((Class)object3).getDeclaredMethod("initialize", Context.class).invoke(null, ((f3)this).a());
            }
            catch (Exception exception) {
                try {
                    ((f3)this).k().L().b("Failed to invoke Tag Manager's initialize() method", exception);
                }
                catch (ClassNotFoundException classNotFoundException) {
                    ((f3)this).k().J().a("Tag Manager is not found and thus will not be used");
                }
            }
        }
        if ("_cmp".equals(string2) && object.containsKey("gclid")) {
            this.j0("auto", "_lgclid", object.getString("gclid"), ((f3)this).b().a());
        }
        if (bl && B5.N0(string2)) {
            ((f3)this).i().N((Bundle)object, ((f3)this).h().A.a());
        }
        if (!bl3 && !"_iap".equals(string2)) {
            object3 = this.a.L();
            bl4 = ((B5)object3).C0("event", string2);
            n8 = 2;
            if (bl4) {
                if (!((B5)object3).p0("event", ax.f6.q.a, ax.f6.q.b, string2)) {
                    n8 = 13;
                } else if (((B5)object3).j0("event", 40, string2)) {
                    n8 = 0;
                }
            }
            if (n8 != 0) {
                ((f3)this).k().H().b("Invalid public event name. Event will not be logged (FE)", ((f3)this).g().c(string2));
                this.a.L();
                string = B5.J(string2, 40, true);
                n10 = n9;
                if (string2 != null) {
                    n10 = string2.length();
                }
                this.a.L();
                B5.Y(this.u, n8, "_ev", string, n10);
                return;
            }
        }
        if ((object3 = ((C1)this).s().C(false)) != null && !object.containsKey("_sc")) {
            ((d4)object3).d = true;
        }
        bl4 = bl && !bl3;
        B5.X(object3, (Bundle)object, bl4);
        bl4 = "am".equals(string);
        boolean bl5 = B5.J0(string2);
        if (bl && this.d != null && !bl5 && !bl4) {
            ((f3)this).k().F().c("Passing event to registered event handler (FE)", ((f3)this).g().c(string2), ((f3)this).g().a((Bundle)object));
            ax.M5.p.l(this.d);
            this.d.a(string, string2, (Bundle)object, l8);
            return;
        }
        if (!this.a.s()) {
            return;
        }
        n9 = ((f3)this).i().v(string2);
        if (n9 != 0) {
            ((f3)this).k().H().b("Invalid event name. Event will not be logged (FE)", ((f3)this).g().c(string2));
            ((f3)this).i();
            string = B5.J(string2, 40, true);
            n8 = n10;
            if (string2 != null) {
                n8 = string2.length();
            }
            this.a.L();
            B5.Z(this.u, string3, n9, "_ev", string, n8);
            return;
        }
        object3 = ax.R5.f.b("_o", "_sn", "_sc", "_si");
        Bundle bundle = ((f3)this).i().F(string3, string2, (Bundle)object, (List<String>)object3, bl3);
        ax.M5.p.l(bundle);
        if (((C1)this).s().C(false) != null && "_ae".equals(string2)) {
            object = ((C1)this).u().f;
            long l9 = ((f3)((a5)object).d).b().b();
            long l10 = l9 - ((a5)object).b;
            ((a5)object).b = l9;
            if (l10 > 0L) {
                ((f3)this).i().M(bundle, l10);
            }
        }
        if (!"auto".equals(string) && "_ssr".equals(string2)) {
            object2 = ((f3)this).i();
            object3 = bundle.getString("_ffr");
            if (ax.R5.o.a((String)object3)) {
                object = null;
            } else {
                object = object3;
                if (object3 != null) {
                    object = ((String)object3).trim();
                }
            }
            if (j.Objects.equals((Object)object, (Object)((f3)object2).h().x.a())) {
                ((f3)object2).k().F().a("Not logging duplicate session_start_with_rollout event");
                return;
            }
            ((f3)object2).h().x.b((String)object);
        } else if ("_ae".equals(string2) && !TextUtils.isEmpty((CharSequence)(object = ((f3)((f3)this).i()).h().x.a()))) {
            bundle.putString("_ffr", (String)object);
        }
        object2 = new ArrayList();
        object2.add(bundle);
        bl = ((f3)this).d().t(F.H0) ? ((C1)this).u().F() : ((f3)this).h().u.b();
        if (((f3)this).h().r.a() > 0L && ((f3)this).h().z(l8) && bl) {
            ((f3)this).k().K().a("Current session is expired, remove the session number, ID, and engagement time");
            this.j0("auto", "_sid", null, ((f3)this).b().a());
            this.j0("auto", "_sno", null, ((f3)this).b().a());
            this.j0("auto", "_se", null, ((f3)this).b().a());
            ((f3)this).h().s.b(0L);
        }
        if (bundle.getLong("extend_session", 0L) == 1L) {
            ((f3)this).k().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            this.a.K().e.b(l8, true);
        }
        object = new ArrayList(bundle.keySet());
        Collections.sort(object);
        n10 = ((ArrayList)object).size();
        for (n8 = 0; n8 < n10; ++n8) {
            object3 = ((ArrayList)object).get(n8);
            String string4 = (String)object3;
            if (string4 == null) continue;
            ((f3)this).i();
            object3 = B5.x0(bundle.get(string4));
            if (object3 == null) continue;
            bundle.putParcelableArray(string4, (Parcelable[])object3);
        }
        n8 = 0;
        while (true) {
            if (n8 >= object2.size()) {
                if (((C1)this).s().C(false) == null) return;
                if (!"_ae".equals(string2)) return;
                ((C1)this).u().E(true, true, ((f3)this).b().b());
                return;
            }
            object = (Bundle)object2.get(n8);
            object3 = n8 != 0 ? "_ep" : string2;
            object.putString("_o", string);
            if (bl2) {
                object = ((f3)this).i().E((Bundle)object, null);
            }
            object3 = new D((String)object3, new C((Bundle)object), string, l8);
            ((C1)this).t().K((D)object3, string3);
            if (!bl4) {
                object3 = this.e.iterator();
                while (object3.hasNext()) {
                    ((t)object3.next()).a(string, string2, new Bundle((Bundle)object), l8);
                }
            }
            ++n8;
        }
    }

    public final void g0(String string, String string2, Bundle bundle) {
        long l8 = ((f3)this).b().a();
        ax.M5.p.f(string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", string);
        bundle2.putLong("creation_timestamp", l8);
        if (string2 != null) {
            bundle2.putString("expired_event_name", string2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        ((f3)this).l().D(new K3(this, bundle2));
    }

    public final void h0(String string, String string2, Bundle bundle, String string3) {
        ((f3)this).m();
        this.Q0(string, string2, ((f3)this).b().a(), bundle, false, true, true, string3);
    }

    public final void i0(String string, String string2, Bundle bundle, boolean bl, boolean bl2, long l8) {
        String string3 = string;
        if (string == null) {
            string3 = "app";
        }
        string = bundle;
        if (bundle == null) {
            string = new Bundle();
        }
        if (j.Objects.equals((Object)string2, (Object)"screen_view")) {
            ((C1)this).s().I((Bundle)string, l8);
            return;
        }
        boolean bl3 = !bl2 || this.d == null || B5.J0(string2);
        this.Q0(string3, string2, l8, (Bundle)string, bl2, bl3, bl, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    final void j0(String object, String string, Object object2, long l8) {
        Object object3;
        String string2;
        block6: {
            block9: {
                block8: {
                    block7: {
                        ax.M5.p.f((String)object);
                        ax.M5.p.f(string);
                        ((f3)this).n();
                        this.v();
                        string2 = string;
                        object3 = object2;
                        if (!"allow_personalized_ads".equals(string)) break block6;
                        if (!(object2 instanceof String) || TextUtils.isEmpty((CharSequence)(object3 = (String)object2))) break block7;
                        object2 = ((String)object3).toLowerCase(Locale.ENGLISH);
                        string = "false";
                        long l9 = "false".equals(object2) ? 1L : 0L;
                        object2 = l9;
                        object3 = ((f3)this).h().o;
                        if ((Long)object2 == 1L) {
                            string = "true";
                        }
                        ((m2)object3).b(string);
                        break block8;
                    }
                    object3 = object2;
                    if (object2 != null) break block9;
                    ((f3)this).h().o.b("unset");
                }
                string = "_npa";
                object3 = object2;
            }
            ((f3)this).k().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", object3);
            string2 = string;
        }
        if (!this.a.p()) {
            ((f3)this).k().K().a("User property not set since app measurement is disabled");
            return;
        }
        if (!this.a.s()) {
            return;
        }
        object = new A5(string2, l8, object3, (String)object);
        ((C1)this).t().O((A5)object);
    }

    public final void k0(String string, String string2, Object object, boolean bl) {
        this.l0(string, string2, object, bl, ((f3)this).b().a());
    }

    /*
     * Unable to fully structure code
     */
    public final void l0(String var1_1, String var2_2, Object var3_3, boolean var4_4, long var5_5) {
        block14: {
            block15: {
                block17: {
                    block16: {
                        var10_6 = var1_1;
                        if (var1_1 == null) {
                            var10_6 = "app";
                        }
                        var8_7 = 0;
                        var9_8 = 0;
                        if (var4_4) {
                            var7_9 = this.i().r0(var2_2);
                        } else {
                            var1_1 = this.i();
                            if (!var1_1.C0("user property", var2_2)) {
                                while (true) {
                                    var7_9 = 6;
                                    break;
                                }
                            } else if (!var1_1.o0("user property", ax.f6.s.a, var2_2)) {
                                var7_9 = 15;
                            } else {
                                if (!var1_1.j0("user property", 24, var2_2)) ** continue;
                                var7_9 = 0;
                            }
                        }
                        if (var7_9 != 0) {
                            this.i();
                            var1_1 = B5.J(var2_2, 24, true);
                            var8_7 = var9_8;
                            if (var2_2 != null) {
                                var8_7 = var2_2.length();
                            }
                            this.a.L();
                            B5.Y(this.u, var7_9, "_ev", (String)var1_1, var8_7);
                            return;
                        }
                        if (var3_3 == null) break block14;
                        var9_8 = this.i().w(var2_2, var3_3);
                        if (var9_8 == 0) break block15;
                        this.i();
                        var1_1 = B5.J(var2_2, 24, true);
                        if (var3_3 instanceof String) break block16;
                        var7_9 = var8_7;
                        if (!(var3_3 instanceof CharSequence)) break block17;
                    }
                    var7_9 = String.valueOf(var3_3).length();
                }
                this.a.L();
                B5.Y(this.u, var9_8, "_ev", (String)var1_1, var7_9);
                return;
            }
            var1_1 = this.i().A0(var2_2, var3_3);
            if (var1_1 != null) {
                this.f0(var10_6, var2_2, var5_5, var1_1);
            }
            return;
        }
        this.f0(var10_6, var2_2, var5_5, null);
    }

    final /* synthetic */ void m0(List object) {
        ((f3)this).n();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> sparseArray = ((f3)this).h().K();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (h5)iterator.next();
                if (ax.f6.u.a(sparseArray, ((h5)object).d0) && (Long)sparseArray.get(((h5)object).d0) >= ((h5)object).c0) continue;
                this.z0().add((h5)object);
            }
            this.F0();
        }
    }

    final /* synthetic */ void n0(AtomicReference atomicReference) {
        Bundle bundle = ((f3)this).h().p.a();
        k4 k42 = ((C1)this).t();
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        k42.R(atomicReference, bundle2);
    }

    public final Application.ActivityLifecycleCallbacks o0() {
        return this.c;
    }

    public final ax.f6.a p0() {
        ((f3)this).n();
        return ((C1)this).t().V();
    }

    public final Boolean q0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean)((f3)this).l().v(atomicReference, 15000L, "boolean test flag value", new u3(this, atomicReference));
    }

    public final Double r0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double)((f3)this).l().v(atomicReference, 15000L, "double test flag value", new Q3(this, atomicReference));
    }

    public final Integer s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer)((f3)this).l().v(atomicReference, 15000L, "int test flag value", new R3(this, atomicReference));
    }

    public final Long t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long)((f3)this).l().v(atomicReference, 15000L, "long test flag value", new N3(this, atomicReference));
    }

    public final String u0() {
        return this.g.get();
    }

    public final String v0() {
        d4 d42 = this.a.I().P();
        if (d42 != null) {
            return d42.b;
        }
        return null;
    }

    public final String w0() {
        d4 d42 = this.a.I().P();
        if (d42 != null) {
            return d42.a;
        }
        return null;
    }

    public final String x0() {
        if (this.a.M() != null) {
            return this.a.M();
        }
        try {
            Object object = ((f3)this).a();
            String string = this.a.P();
            m m8 = new m((Context)object, string);
            object = m8.b("google_app_id");
            return object;
        }
        catch (IllegalStateException illegalStateException) {
            this.a.k().G().b("getGoogleAppId failed with exception", illegalStateException);
            return null;
        }
    }

    public final String y0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String)((f3)this).l().v(atomicReference, 15000L, "String test flag value", new G3(this, atomicReference));
    }

    @TargetApi(value=30)
    final PriorityQueue<h5> z0() {
        if (this.l == null) {
            w.a();
            this.l = v.a(j.Comparator._CC.comparing((Function)new n3(), (Comparator)new m3()));
        }
        return this.l;
    }
}

