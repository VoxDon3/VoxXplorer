/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.f;

final class N2
implements Runnable {
    private final E5 c0;
    private final I2 d0;
    private final f q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    N2(I2 i22, f f8, E5 e52) {
        this.q = f8;
        this.c0 = e52;
        this.d0 = i22;
    }

    @Override
    public final void run() {
        I2.w(this.d0).u0();
        if (this.q.d0.k() == null) {
            I2.w(this.d0).u(this.q, this.c0);
            return;
        }
        I2.w(this.d0).V(this.q, this.c0);
    }
}

