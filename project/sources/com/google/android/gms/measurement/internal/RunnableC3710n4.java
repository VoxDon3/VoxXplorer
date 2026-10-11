package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3710n4 implements Runnable {
    private final /* synthetic */ AppMeasurementDynamiteService c0;
    private final /* synthetic */ ax.b6.M0 q;

    RunnableC3710n4(AppMeasurementDynamiteService appMeasurementDynamiteService, ax.b6.M0 m0) {
        this.q = m0;
        this.c0 = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c0.e.L().U(this.q, this.c0.e.o());
    }
}
