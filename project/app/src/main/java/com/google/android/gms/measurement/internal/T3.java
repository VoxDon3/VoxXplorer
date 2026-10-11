/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.k3;

final class T3
implements Runnable {
    private final k3 c0;
    private final Boolean q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    T3(k3 k32, Boolean bl) {
        this.q = bl;
        this.c0 = k32;
    }

    @Override
    public final void run() {
        k3.Y(this.c0, this.q, true);
    }
}

