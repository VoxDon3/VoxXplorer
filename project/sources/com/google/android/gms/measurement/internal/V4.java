package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class V4 extends AbstractC3623b1 {
    private Handler c;
    private boolean d;
    protected final C3634c5 e;
    protected final C3620a5 f;
    private final Z4 g;

    V4(E2 e2) {
        super(e2);
        this.d = true;
        this.e = new C3634c5(this);
        this.f = new C3620a5(this);
        this.g = new Z4(this);
    }

    static /* synthetic */ void C(V4 v4, long j) {
        v4.n();
        v4.G();
        v4.k().K().b("Activity paused, time", Long.valueOf(j));
        v4.g.b(j);
        if (v4.d().T()) {
            v4.f.e(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        n();
        if (this.c == null) {
            this.c = new ax.b6.E0(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void I(V4 v4, long j) {
        v4.n();
        v4.G();
        v4.k().K().b("Activity resumed, time", Long.valueOf(j));
        if (v4.d().t(F.H0)) {
            if (v4.d().T() || v4.d) {
                v4.f.f(j);
            }
        } else if (v4.d().T() || v4.h().u.b()) {
            v4.f.f(j);
        }
        v4.g.a();
        C3634c5 c3634c5 = v4.e;
        c3634c5.a.n();
        if (c3634c5.a.a.p()) {
            c3634c5.b(c3634c5.a.b().a(), false);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3623b1
    protected final boolean A() {
        return false;
    }

    final void D(boolean z) {
        n();
        this.d = z;
    }

    public final boolean E(boolean z, boolean z2, long j) {
        return this.f.d(z, z2, j);
    }

    final boolean F() {
        n();
        return this.d;
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
