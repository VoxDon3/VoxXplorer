package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import ax.M5.C0821p;
import ax.b6.S6;
import ax.b6.X6;
import ax.f6.EnumC2067o;
import java.lang.reflect.InvocationTargetException;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.measurement.internal.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3663h extends C3653f3 {
    private Boolean b;
    private String c;
    private InterfaceC3677j d;
    private Boolean e;

    C3663h(E2 e2) {
        super(e2);
        this.d = new InterfaceC3677j() { // from class: com.google.android.gms.measurement.internal.g
            @Override // com.google.android.gms.measurement.internal.InterfaceC3677j
            public final String c(String str, String str2) {
                return null;
            }
        };
    }

    public static long J() {
        return F.e.a(null).longValue();
    }

    public static long O() {
        return F.E.a(null).longValue();
    }

    private final Bundle X() {
        try {
            if (a().getPackageManager() == null) {
                k().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b = ax.S5.e.a(a()).b(a().getPackageName(), 128);
            if (b != null) {
                return b.metaData;
            }
            k().G().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            k().G().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    private final String c(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            C0821p.l(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            k().G().b("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            k().G().b("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            k().G().b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            k().G().b("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    public final EnumC2067o A(String str, boolean z) {
        Object obj;
        C0821p.f(str);
        Bundle X = X();
        if (X == null) {
            k().G().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = X.get(str);
        }
        if (obj == null) {
            return EnumC2067o.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC2067o.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC2067o.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return EnumC2067o.POLICY;
        }
        k().L().b("Invalid manifest metadata for", str);
        return EnumC2067o.UNINITIALIZED;
    }

    final long B(String str) {
        return z(str, F.b);
    }

    public final String C(String str, M1<String> m1) {
        return TextUtils.isEmpty(str) ? m1.a(null) : m1.a(this.d.c(str, m1.b()));
    }

    final Boolean D(String str) {
        C0821p.f(str);
        Bundle X = X();
        if (X == null) {
            k().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (X.containsKey(str)) {
            return Boolean.valueOf(X.getBoolean(str));
        }
        return null;
    }

    public final boolean E(String str, M1<Boolean> m1) {
        return G(str, m1);
    }

    final String F(String str) {
        return C(str, F.M);
    }

    public final boolean G(String str, M1<Boolean> m1) {
        if (TextUtils.isEmpty(str)) {
            return m1.a(null).booleanValue();
        }
        String c = this.d.c(str, m1.b());
        return TextUtils.isEmpty(c) ? m1.a(null).booleanValue() : m1.a(Boolean.valueOf("1".equals(c))).booleanValue();
    }

    public final int H() {
        return i().c0(201500000, true) ? 100 : 25;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List<java.lang.String> I(java.lang.String r4) {
        /*
            r3 = this;
            ax.M5.C0821p.f(r4)
            android.os.Bundle r0 = r3.X()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.V1 r4 = r3.k()
            com.google.android.gms.measurement.internal.X1 r4 = r4.G()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.a()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.V1 r0 = r3.k()
            com.google.android.gms.measurement.internal.X1 r0 = r0.G()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3663h.I(java.lang.String):java.util.List");
    }

    public final void K(String str) {
        this.c = str;
    }

    final boolean L(String str) {
        return G(str, F.L);
    }

    public final boolean M(String str) {
        return "1".equals(this.d.c(str, "gaia_collection_enabled"));
    }

    public final boolean N(String str) {
        return "1".equals(this.d.c(str, "measurement.event_sampling_enabled"));
    }

    public final String P() {
        return c("debug.firebase.analytics.app", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String Q() {
        return c("debug.deferred.deeplink", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String R() {
        return this.c;
    }

    public final boolean S() {
        Boolean D = D("google_analytics_adid_collection_enabled");
        return D == null || D.booleanValue();
    }

    public final boolean T() {
        Boolean D = D("google_analytics_automatic_screen_reporting_enabled");
        return D == null || D.booleanValue();
    }

    public final boolean U() {
        Boolean D = D("firebase_analytics_collection_deactivated");
        return D != null && D.booleanValue();
    }

    final boolean V() {
        if (this.b == null) {
            Boolean D = D("app_measurement_lite");
            this.b = D;
            if (D == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.t();
    }

    public final boolean W() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        ApplicationInfo applicationInfo = a().getApplicationInfo();
                        String a = ax.R5.n.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.e = Boolean.valueOf(str != null && str.equals(a));
                        }
                        if (this.e == null) {
                            this.e = Boolean.TRUE;
                            k().G().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.e.booleanValue();
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

    @Override // com.google.android.gms.measurement.internal.C3653f3
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

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final double o(String str, M1<Double> m1) {
        if (TextUtils.isEmpty(str)) {
            return m1.a(null).doubleValue();
        }
        String c = this.d.c(str, m1.b());
        if (TextUtils.isEmpty(c)) {
            return m1.a(null).doubleValue();
        }
        try {
            return m1.a(Double.valueOf(Double.parseDouble(c))).doubleValue();
        } catch (NumberFormatException unused) {
            return m1.a(null).doubleValue();
        }
    }

    final int p(String str) {
        return q(str, F.I, 500, 2000);
    }

    public final int q(String str, M1<Integer> m1, int i, int i2) {
        return Math.max(Math.min(v(str, m1), i2), i);
    }

    final int r(String str, boolean z) {
        if (!S6.a() || !d().G(null, F.O0)) {
            return 100;
        }
        if (z) {
            return q(str, F.S, 100, 500);
        }
        return 500;
    }

    final void s(InterfaceC3677j interfaceC3677j) {
        this.d = interfaceC3677j;
    }

    public final boolean t(M1<Boolean> m1) {
        return G(null, m1);
    }

    public final int u(String str) {
        return q(str, F.J, 25, 100);
    }

    public final int v(String str, M1<Integer> m1) {
        if (TextUtils.isEmpty(str)) {
            return m1.a(null).intValue();
        }
        String c = this.d.c(str, m1.b());
        if (TextUtils.isEmpty(c)) {
            return m1.a(null).intValue();
        }
        try {
            return m1.a(Integer.valueOf(Integer.parseInt(c))).intValue();
        } catch (NumberFormatException unused) {
            return m1.a(null).intValue();
        }
    }

    final int w(String str, boolean z) {
        return Math.max(r(str, z), 256);
    }

    final int x() {
        return (X6.a() && d().G(null, F.y0) && i().c0(231100000, true)) ? 35 : 0;
    }

    public final int y(String str) {
        return v(str, F.p);
    }

    public final long z(String str, M1<Long> m1) {
        if (TextUtils.isEmpty(str)) {
            return m1.a(null).longValue();
        }
        String c = this.d.c(str, m1.b());
        if (TextUtils.isEmpty(c)) {
            return m1.a(null).longValue();
        }
        try {
            return m1.a(Long.valueOf(Long.parseLong(c))).longValue();
        } catch (NumberFormatException unused) {
            return m1.a(null).longValue();
        }
    }
}
