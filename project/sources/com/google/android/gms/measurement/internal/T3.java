package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class T3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ Boolean q;

    T3(C3688k3 c3688k3, Boolean bool) {
        this.q = bool;
        this.c0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c0.b0(this.q, true);
    }
}
