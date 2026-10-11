/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.b6.m6;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.k3;

final class V3
implements Runnable {
    private final long c0;
    private final long d0;
    private final boolean e0;
    private final h3 f0;
    private final k3 g0;
    private final h3 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    V3(k3 k32, h3 h32, long l8, long l9, boolean bl, h3 h33) {
        this.q = h32;
        this.c0 = l8;
        this.d0 = l9;
        this.e0 = bl;
        this.f0 = h33;
        this.g0 = k32;
    }

    @Override
    public final void run() {
        this.g0.S(this.q);
        if (!m6.a() || !((f3)this.g0).d().t(F.V0)) {
            this.g0.I(this.c0, false);
        }
        k3.W(this.g0, this.q, this.d0, true, this.e0);
        k3.X(this.g0, this.q, this.f0);
    }
}

