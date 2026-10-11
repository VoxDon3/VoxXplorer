package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class Z implements Runnable {
    private final /* synthetic */ C3776z c0;
    private final /* synthetic */ long q;

    Z(C3776z c3776z, long j) {
        this.q = j;
        this.c0 = c3776z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c0.B(this.q);
    }
}
