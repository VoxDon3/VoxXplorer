/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import com.google.android.gms.measurement.internal.J4;
import com.google.android.gms.measurement.internal.k4;

final class L4
implements Runnable {
    private final J4 c0;
    private final ComponentName q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    L4(J4 j42, ComponentName componentName) {
        this.q = componentName;
        this.c0 = j42;
    }

    @Override
    public final void run() {
        k4.M(this.c0.d0, this.q);
    }
}

