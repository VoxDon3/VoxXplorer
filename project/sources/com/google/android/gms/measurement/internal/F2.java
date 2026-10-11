package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class F2 implements Runnable {
    private final /* synthetic */ E2 c0;
    private final /* synthetic */ C3681j3 q;

    F2(E2 e2, C3681j3 c3681j3) {
        this.q = c3681j3;
        this.c0 = e2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E2.g(this.c0, this.q);
        this.c0.d(this.q.g);
    }
}
