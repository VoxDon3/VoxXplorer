/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.M0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

final class O3
implements Runnable {
    private final String c0;
    private final String d0;
    private final boolean e0;
    private final AppMeasurementDynamiteService f0;
    private final M0 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    O3(AppMeasurementDynamiteService appMeasurementDynamiteService, M0 m02, String string, String string2, boolean bl) {
        this.q = m02;
        this.c0 = string;
        this.d0 = string2;
        this.e0 = bl;
        this.f0 = appMeasurementDynamiteService;
    }

    @Override
    public final void run() {
        this.f0.e.J().G(this.q, this.c0, this.d0, this.e0);
    }
}

