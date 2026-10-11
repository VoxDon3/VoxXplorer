package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import ax.M5.C0821p;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3654f4 extends AbstractC3623b1 {
    private volatile C3640d4 c;
    private volatile C3640d4 d;
    protected C3640d4 e;
    private final Map<Activity, C3640d4> f;
    private Activity g;
    private volatile boolean h;
    private volatile C3640d4 i;
    private C3640d4 j;
    private boolean k;
    private final Object l;

    public C3654f4(E2 e2) {
        super(e2);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    private final String D(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : HttpUrl.FRAGMENT_ENCODE_SET;
        return str2.length() > d().r(null, false) ? str2.substring(0, d().r(null, false)) : str2;
    }

    private final void G(Activity activity, C3640d4 c3640d4, boolean z) {
        C3640d4 c3640d42;
        C3640d4 c3640d43 = this.c == null ? this.d : this.c;
        if (c3640d4.b == null) {
            c3640d42 = new C3640d4(c3640d4.a, activity != null ? D(activity.getClass(), "Activity") : null, c3640d4.c, c3640d4.e, c3640d4.f);
        } else {
            c3640d42 = c3640d4;
        }
        this.d = this.c;
        this.c = c3640d42;
        l().D(new RunnableC3668h4(this, c3640d42, c3640d43, b().b(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(C3640d4 c3640d4, C3640d4 c3640d42, long j, boolean z, Bundle bundle) {
        long j2;
        n();
        boolean z2 = false;
        boolean z3 = (c3640d42 != null && c3640d42.c == c3640d4.c && Objects.equals(c3640d42.b, c3640d4.b) && Objects.equals(c3640d42.a, c3640d4.a)) ? false : true;
        if (z && this.e != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            B5.X(c3640d4, bundle2, true);
            if (c3640d42 != null) {
                String str = c3640d42.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = c3640d42.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c3640d42.c);
            }
            if (z2) {
                long a = u().f.a(j);
                if (a > 0) {
                    i().M(bundle2, a);
                }
            }
            if (!d().T()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = c3640d4.e ? "app" : "auto";
            long a2 = b().a();
            if (c3640d4.e) {
                long j3 = c3640d4.f;
                if (j3 != 0) {
                    j2 = j3;
                    r().d0(str3, "_vs", j2, bundle2);
                }
            }
            j2 = a2;
            r().d0(str3, "_vs", j2, bundle2);
        }
        if (z2) {
            K(this.e, true, j);
        }
        this.e = c3640d4;
        if (c3640d4.e) {
            this.j = c3640d4;
        }
        t().L(c3640d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(C3640d4 c3640d4, boolean z, long j) {
        o().v(b().b());
        if (!u().E(c3640d4 != null && c3640d4.d, z, j) || c3640d4 == null) {
            return;
        }
        c3640d4.d = false;
    }

    static /* synthetic */ void L(C3654f4 c3654f4, Bundle bundle, C3640d4 c3640d4, C3640d4 c3640d42, long j) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c3654f4.J(c3640d4, c3640d42, j, true, c3654f4.i().F(null, "screen_view", bundle, null, false));
    }

    private final C3640d4 T(Activity activity) {
        C0821p.l(activity);
        C3640d4 c3640d4 = this.f.get(activity);
        if (c3640d4 == null) {
            C3640d4 c3640d42 = new C3640d4(null, D(activity.getClass(), "Activity"), i().R0());
            this.f.put(activity, c3640d42);
            c3640d4 = c3640d42;
        }
        return this.i != null ? this.i : c3640d4;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3623b1
    protected final boolean A() {
        return false;
    }

    public final C3640d4 C(boolean z) {
        v();
        n();
        if (!z) {
            return this.e;
        }
        C3640d4 c3640d4 = this.e;
        return c3640d4 != null ? c3640d4 : this.j;
    }

    public final void E(Activity activity) {
        synchronized (this.l) {
            try {
                if (activity == this.g) {
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d().T()) {
            this.f.remove(activity);
        }
    }

    public final void F(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!d().T() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new C3640d4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @Deprecated
    public final void H(Activity activity, String str, String str2) {
        if (!d().T()) {
            k().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C3640d4 c3640d4 = this.c;
        if (c3640d4 == null) {
            k().M().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f.get(activity) == null) {
            k().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = D(activity.getClass(), "Activity");
        }
        boolean equals = Objects.equals(c3640d4.b, str2);
        boolean equals2 = Objects.equals(c3640d4.a, str);
        if (equals && equals2) {
            k().M().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > d().r(null, false))) {
            k().M().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > d().r(null, false))) {
            k().M().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        k().K().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C3640d4 c3640d42 = new C3640d4(str, str2, i().R0());
        this.f.put(activity, c3640d42);
        G(activity, c3640d42, true);
    }

    public final void I(Bundle bundle, long j) {
        String str;
        synchronized (this.l) {
            try {
                if (!this.k) {
                    k().M().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String str2 = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > d().r(null, false))) {
                        k().M().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > d().r(null, false))) {
                        k().M().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str2 = string2;
                        str = string;
                    }
                } else {
                    str = null;
                }
                if (str2 == null) {
                    Activity activity = this.g;
                    str2 = activity != null ? D(activity.getClass(), "Activity") : "Activity";
                }
                String str3 = str2;
                C3640d4 c3640d4 = this.c;
                if (this.h && c3640d4 != null) {
                    this.h = false;
                    boolean equals = Objects.equals(c3640d4.b, str3);
                    boolean equals2 = Objects.equals(c3640d4.a, str);
                    if (equals && equals2) {
                        k().M().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                k().K().c("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
                C3640d4 c3640d42 = this.c == null ? this.d : this.c;
                C3640d4 c3640d43 = new C3640d4(str, str3, i().R0(), true, j);
                this.c = c3640d43;
                this.d = c3640d42;
                this.i = c3640d43;
                l().D(new RunnableC3647e4(this, bundle, c3640d43, c3640d42, b().b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C3640d4 P() {
        return this.c;
    }

    public final void Q(Activity activity) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
        }
        long b = b().b();
        if (!d().T()) {
            this.c = null;
            l().D(new RunnableC3682j4(this, b));
        } else {
            C3640d4 T = T(activity);
            this.d = this.c;
            this.c = null;
            l().D(new RunnableC3675i4(this, T, b));
        }
    }

    public final void R(Activity activity, Bundle bundle) {
        C3640d4 c3640d4;
        if (!d().T() || bundle == null || (c3640d4 = this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c3640d4.c);
        bundle2.putString("name", c3640d4.a);
        bundle2.putString("referrer_name", c3640d4.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void S(Activity activity) {
        synchronized (this.l) {
            this.k = true;
            if (activity != this.g) {
                synchronized (this.l) {
                    this.g = activity;
                    this.h = false;
                }
                if (d().T()) {
                    this.i = null;
                    l().D(new RunnableC3696l4(this));
                }
            }
        }
        if (!d().T()) {
            this.c = this.i;
            l().D(new RunnableC3661g4(this));
        } else {
            G(activity, T(activity), false);
            C3776z o = o();
            o.l().D(new Z(o, o.b().b()));
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ ax.R5.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3663h d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3628c e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3758w f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ R1 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3659g2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ B5 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ V1 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3779z2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3776z o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ Q1 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ P1 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3688k3 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3654f4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3689k4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ V4 u() {
        return super.u();
    }
}
