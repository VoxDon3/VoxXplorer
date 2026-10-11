/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.M5.p;
import ax.f6.e;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class t4
implements Runnable {
    private final boolean c0;
    private final A5 d0;
    private final k4 e0;
    private final E5 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    t4(k4 k42, E5 e52, boolean bl, A5 a52) {
        this.q = e52;
        this.c0 = bl;
        this.d0 = a52;
        this.e0 = k42;
    }

    @Override
    public final void run() {
        e e8 = k4.B(this.e0);
        if (e8 == null) {
            ((f3)this.e0).k().G().a("Discarding data. Failed to set user property");
            return;
        }
        p.l(this.q);
        k4 k42 = this.e0;
        A5 a52 = this.c0 ? null : this.d0;
        k42.I(e8, a52, this.q);
        k4.r0(this.e0);
    }
}

