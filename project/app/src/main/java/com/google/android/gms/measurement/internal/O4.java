/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import com.google.android.gms.measurement.internal.J4;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class O4
implements Runnable {
    private final J4 q;

    O4(J4 j42) {
        this.q = j42;
    }

    @Override
    public final void run() {
        k4.M(this.q.d0, new ComponentName(((f3)this.q.d0).a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}

