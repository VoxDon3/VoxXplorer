/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.k3;

final class U3
implements Runnable {
    private final long c0;
    private final boolean d0;
    private final h3 e0;
    private final k3 f0;
    private final h3 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    U3(k3 k32, h3 h32, long l8, boolean bl, h3 h33) {
        this.q = h32;
        this.c0 = l8;
        this.d0 = bl;
        this.e0 = h33;
        this.f0 = k32;
    }

    @Override
    public final void run() {
        this.f0.S(this.q);
        k3.W(this.f0, this.q, this.c0, false, this.d0);
        k3.X(this.f0, this.q, this.e0);
    }
}

