/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.I2;

final class Z2
implements Runnable {
    private final E5 c0;
    private final I2 d0;
    private final D q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    Z2(I2 i22, D d8, E5 e52) {
        this.q = d8;
        this.c0 = e52;
        this.d0 = i22;
    }

    @Override
    public final void run() {
        D d8 = this.d0.c2(this.q, this.c0);
        this.d0.f2(d8, this.c0);
    }
}

