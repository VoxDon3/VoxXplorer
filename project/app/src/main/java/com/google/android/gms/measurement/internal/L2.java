/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.I2;

final class L2
implements Runnable {
    private final I2 c0;
    private final E5 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    L2(I2 i22, E5 e52) {
        this.q = e52;
        this.c0 = i22;
    }

    @Override
    public final void run() {
        I2.w(this.c0).u0();
        I2.w(this.c0).c0(this.q);
    }
}

