package com.google.android.gms.measurement.internal;

import ax.b6.C1618m6;

/* loaded from: classes3.dex */
final class V3 implements Runnable {
    private final /* synthetic */ long c0;
    private final /* synthetic */ long d0;
    private final /* synthetic */ boolean e0;
    private final /* synthetic */ C3667h3 f0;
    private final /* synthetic */ C3688k3 g0;
    private final /* synthetic */ C3667h3 q;

    V3(C3688k3 c3688k3, C3667h3 c3667h3, long j, long j2, boolean z, C3667h3 c3667h32) {
        this.q = c3667h3;
        this.c0 = j;
        this.d0 = j2;
        this.e0 = z;
        this.f0 = c3667h32;
        this.g0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g0.S(this.q);
        if (!C1618m6.a() || !this.g0.d().t(F.V0)) {
            this.g0.I(this.c0, false);
        }
        C3688k3.W(this.g0, this.q, this.d0, true, this.e0);
        C3688k3.X(this.g0, this.q, this.f0);
    }
}
