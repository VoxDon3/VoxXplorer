package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import ax.b6.r7;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class o5 extends C3697l5 {
    o5(q5 q5Var) {
        super(q5Var);
    }

    private final String v(String str) {
        String R = r().R(str);
        if (TextUtils.isEmpty(R)) {
            return F.r.a(null);
        }
        Uri parse = Uri.parse(F.r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(R + "." + parse.getAuthority());
        return buildUpon.build().toString();
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

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ x5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ J5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ C3691l q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ C3726q2 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ Q4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C3697l5
    public final /* bridge */ /* synthetic */ o5 t() {
        return super.t();
    }

    public final C3704m5 u(String str) {
        Z1 H0;
        if (r7.a() && d().t(F.t0)) {
            i();
            if (B5.H0(str)) {
                k().K().a("sgtm feature flag enabled.");
                Z1 H02 = q().H0(str);
                if (H02 == null) {
                    return new C3704m5(v(str), 1);
                }
                String m = H02.m();
                ax.b6.L1 L = r().L(str);
                if (L == null || (H0 = q().H0(str)) == null || ((!L.d0() || L.S().n() != 100) && !i().E0(str, H0.v()) && (TextUtils.isEmpty(m) || m.hashCode() % 100 >= L.S().n()))) {
                    return new C3704m5(v(str), 1);
                }
                C3704m5 c3704m5 = null;
                if (H02.C()) {
                    k().K().a("sgtm upload enabled in manifest.");
                    ax.b6.L1 L2 = r().L(H02.l());
                    if (L2 != null && L2.d0()) {
                        String L3 = L2.S().L();
                        if (!TextUtils.isEmpty(L3)) {
                            String K = L2.S().K();
                            k().K().c("sgtm configured with upload_url, server_info", L3, TextUtils.isEmpty(K) ? "Y" : "N");
                            if (TextUtils.isEmpty(K)) {
                                c3704m5 = new C3704m5(L3, 3);
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("x-sgtm-server-info", K);
                                if (!TextUtils.isEmpty(H02.v())) {
                                    hashMap.put("x-gtm-server-preview", H02.v());
                                }
                                c3704m5 = new C3704m5(L3, hashMap, 3);
                            }
                        }
                    }
                }
                if (c3704m5 != null) {
                    return c3704m5;
                }
            }
        }
        return new C3704m5(v(str), 1);
    }
}
