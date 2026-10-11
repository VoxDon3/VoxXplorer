package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class N4 implements Runnable {
    private final /* synthetic */ String c0;
    private final /* synthetic */ String d0;
    private final /* synthetic */ AppMeasurementDynamiteService e0;
    private final /* synthetic */ ax.b6.M0 q;

    N4(AppMeasurementDynamiteService appMeasurementDynamiteService, ax.b6.M0 m0, String str, String str2) {
        this.q = m0;
        this.c0 = str;
        this.d0 = str2;
        this.e0 = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e0.e.J().F(this.q, this.c0, this.d0);
    }
}
