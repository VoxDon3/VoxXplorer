package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3774y3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ boolean q;

    RunnableC3774y3(C3688k3 c3688k3, boolean z) {
        this.q = z;
        this.c0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean p = this.c0.a.p();
        boolean o = this.c0.a.o();
        this.c0.a.m(this.q);
        if (o == this.q) {
            this.c0.a.k().K().b("Default data collection state already set to", Boolean.valueOf(this.q));
        }
        if (this.c0.a.p() == p || this.c0.a.p() != this.c0.a.o()) {
            this.c0.a.k().M().c("Default data collection is different than actual status", Boolean.valueOf(this.q), Boolean.valueOf(p));
        }
        this.c0.H0();
    }
}
