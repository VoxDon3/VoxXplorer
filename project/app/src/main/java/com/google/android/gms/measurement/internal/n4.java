/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.M0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

final class n4
implements Runnable {
    private final AppMeasurementDynamiteService c0;
    private final M0 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    n4(AppMeasurementDynamiteService appMeasurementDynamiteService, M0 m02) {
        this.q = m02;
        this.c0 = appMeasurementDynamiteService;
    }

    @Override
    public final void run() {
        this.c0.e.L().U(this.q, this.c0.e.o());
    }
}

