/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.I2;

final class Y2
implements Runnable {
    private final String c0;
    private final I2 d0;
    private final D q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    Y2(I2 i22, D d8, String string) {
        this.q = d8;
        this.c0 = string;
        this.d0 = i22;
    }

    @Override
    public final void run() {
        I2.w(this.d0).u0();
        I2.w(this.d0).w(this.q, this.c0);
    }
}

