package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: com.google.android.gms.measurement.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC3721p3 implements Runnable {
    private final /* synthetic */ AppMeasurementDynamiteService c0;
    private final /* synthetic */ AppMeasurementDynamiteService.b q;

    RunnableC3721p3(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.b bVar) {
        this.q = bVar;
        this.c0 = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c0.e.H().P(this.q);
    }
}
