/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.q5;

final class X2
implements Runnable {
    private final I2 c0;
    private final E5 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    X2(I2 i22, E5 e52) {
        this.q = e52;
        this.c0 = i22;
    }

    @Override
    public final void run() {
        I2.w(this.c0).u0();
        q5 q52 = I2.w(this.c0);
        E5 e52 = this.q;
        ((f3)q52.l()).n();
        q52.v0();
        p.f(e52.q);
        q52.i0(e52);
        q52.g0(e52);
    }
}

