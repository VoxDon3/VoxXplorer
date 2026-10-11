package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import ax.M5.C0821p;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3776z extends C1 {
    private final Map<String, Long> b;
    private final Map<String, Integer> c;
    private long d;

    public C3776z(E2 e2) {
        super(e2);
        this.c = new ax.B.a();
        this.b = new ax.B.a();
    }

    private final void A(String str, long j, C3640d4 c3640d4) {
        if (c3640d4 == null) {
            k().K().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            k().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        B5.X(c3640d4, bundle, true);
        r().Y0("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(long j) {
        Iterator<String> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            this.b.put(it.next(), Long.valueOf(j));
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.d = j;
    }

    static /* synthetic */ void C(C3776z c3776z, String str, long j) {
        c3776z.n();
        C0821p.f(str);
        Integer num = c3776z.c.get(str);
        if (num == null) {
            c3776z.k().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C3640d4 C = c3776z.s().C(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            c3776z.c.put(str, Integer.valueOf(intValue));
            return;
        }
        c3776z.c.remove(str);
        Long l = c3776z.b.get(str);
        if (l == null) {
            c3776z.k().G().a("First ad unit exposure time was never set");
        } else {
            long longValue = j - l.longValue();
            c3776z.b.remove(str);
            c3776z.A(str, longValue, C);
        }
        if (c3776z.c.isEmpty()) {
            long j2 = c3776z.d;
            if (j2 == 0) {
                c3776z.k().G().a("First ad exposure time was never set");
            } else {
                c3776z.w(j - j2, C);
                c3776z.d = 0L;
            }
        }
    }

    private final void w(long j, C3640d4 c3640d4) {
        if (c3640d4 == null) {
            k().K().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            k().K().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        B5.X(c3640d4, bundle, true);
        r().Y0("am", "_xa", bundle);
    }

    static /* synthetic */ void y(C3776z c3776z, String str, long j) {
        c3776z.n();
        C0821p.f(str);
        if (c3776z.c.isEmpty()) {
            c3776z.d = j;
        }
        Integer num = c3776z.c.get(str);
        if (num != null) {
            c3776z.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c3776z.c.size() >= 100) {
            c3776z.k().L().a("Too many ads visible");
        } else {
            c3776z.c.put(str, 1);
            c3776z.b.put(str, Long.valueOf(j));
        }
    }

    public final void D(String str, long j) {
        if (str == null || str.length() == 0) {
            k().G().a("Ad unit id must be a non-empty string");
        } else {
            l().D(new A0(this, str, j));
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

    public final void v(long j) {
        C3640d4 C = s().C(false);
        for (String str : this.b.keySet()) {
            A(str, j - this.b.get(str).longValue(), C);
        }
        if (!this.b.isEmpty()) {
            w(j - this.d, C);
        }
        B(j);
    }

    public final void z(String str, long j) {
        if (str == null || str.length() == 0) {
            k().G().a("Ad unit id must be a non-empty string");
        } else {
            l().D(new RunnableC3614a(this, str, j));
        }
    }
}
