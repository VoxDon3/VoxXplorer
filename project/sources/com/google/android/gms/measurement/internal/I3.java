package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class I3 implements Runnable {
    private final /* synthetic */ C3688k3 c0;
    private final /* synthetic */ long q;

    I3(C3688k3 c3688k3, long j) {
        this.q = j;
        this.c0 = c3688k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c0.J0(this.q);
        this.c0.t().Q(new AtomicReference<>());
    }
}
