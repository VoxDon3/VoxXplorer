package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class O3 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ String d0;
    private final /* synthetic */ boolean e0;
    private final /* synthetic */ AppMeasurementDynamiteService f0;
    private final /* synthetic */ ax.b6.M0 q;

    O3(AppMeasurementDynamiteService appMeasurementDynamiteService, ax.b6.M0 m0, String str, String str2, boolean z) {
        this.q = m0;
        this.c0 = str;
        this.d0 = str2;
        this.e0 = z;
        this.f0 = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f0.e.J().G(this.q, this.c0, this.d0, this.e0);
    }
}
