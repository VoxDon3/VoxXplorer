package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class U3 implements Runnable {
    private final /* synthetic */ long c0;
    private final /* synthetic */ boolean d0;
    private final /* synthetic */ C3667h3 e0;
    private final /* synthetic */ C3688k3 f0;
    private final /* synthetic */ C3667h3 q;

    U3(C3688k3 c3688k3, C3667h3 c3667h3, long j, boolean z, C3667h3 c3667h32) {
        this.q = c3667h3;
        this.c0 = j;
        this.d0 = z;
        this.e0 = c3667h32;
        this.f0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f0.S(this.q);
        C3688k3.W(this.f0, this.q, this.c0, false, this.d0);
        C3688k3.X(this.f0, this.q, this.e0);
    }
}
