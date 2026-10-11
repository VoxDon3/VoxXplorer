package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class V2 implements Runnable {
    private final /* synthetic */ AppMeasurementDynamiteService c0;
    private final /* synthetic */ ax.b6.M0 q;

    V2(AppMeasurementDynamiteService appMeasurementDynamiteService, ax.b6.M0 m0) {
        this.q = m0;
        this.c0 = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c0.e.J().D(this.q);
    }
}
