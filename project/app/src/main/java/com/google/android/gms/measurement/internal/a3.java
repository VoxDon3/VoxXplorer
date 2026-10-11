/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.I2;

final class a3
implements Runnable {
    private final E5 c0;
    private final I2 d0;
    private final A5 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    a3(I2 i22, A5 a52, E5 e52) {
        this.q = a52;
        this.c0 = e52;
        this.d0 = i22;
    }

    @Override
    public final void run() {
        I2.w(this.d0).u0();
        if (this.q.k() == null) {
            I2.w(this.d0).G(this.q.c0, this.c0);
            return;
        }
        I2.w(this.d0).z(this.q, this.c0);
    }
}

