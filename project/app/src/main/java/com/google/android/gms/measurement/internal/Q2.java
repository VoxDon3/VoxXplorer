/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.f;

final class Q2
implements Runnable {
    private final I2 c0;
    private final f q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    Q2(I2 i22, f f8) {
        this.q = f8;
        this.c0 = i22;
    }

    @Override
    public final void run() {
        I2.w(this.c0).u0();
        if (this.q.d0.k() == null) {
            I2.w(this.c0).t(this.q);
            return;
        }
        I2.w(this.c0).U(this.q);
    }
}

