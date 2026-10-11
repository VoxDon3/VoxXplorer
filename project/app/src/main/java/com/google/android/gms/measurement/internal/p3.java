/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

final class p3
implements Runnable {
    private final AppMeasurementDynamiteService c0;
    private final AppMeasurementDynamiteService.b q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    p3(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.b b8) {
        this.q = b8;
        this.c0 = appMeasurementDynamiteService;
    }

    @Override
    public final void run() {
        this.c0.e.H().P(this.q);
    }
}

