package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class A3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ long q;

    A3(C3688k3 c3688k3, long j) {
        this.q = j;
        this.c0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c0.h().m.b(this.q);
        this.c0.k().F().b("Session timeout duration set", Long.valueOf(this.q));
    }
}
