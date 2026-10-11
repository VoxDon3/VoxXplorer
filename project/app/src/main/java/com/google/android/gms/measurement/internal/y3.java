/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.k3;

final class y3
implements Runnable {
    private final k3 c0;
    private final boolean q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    y3(k3 k32, boolean bl) {
        this.q = bl;
        this.c0 = k32;
    }

    @Override
    public final void run() {
        boolean bl = this.c0.a.p();
        boolean bl2 = this.c0.a.o();
        this.c0.a.m(this.q);
        if (bl2 == this.q) {
            this.c0.a.k().K().b("Default data collection state already set to", this.q);
        }
        if (this.c0.a.p() == bl || this.c0.a.p() != this.c0.a.o()) {
            this.c0.a.k().M().c("Default data collection is different than actual status", this.q, bl);
        }
        k3.W0(this.c0);
    }
}

