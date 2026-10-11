/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k3;

final class A3
implements Runnable {
    private final k3 c0;
    private final long q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    A3(k3 k32, long l8) {
        this.q = l8;
        this.c0 = k32;
    }

    @Override
    public final void run() {
        ((f3)this.c0).h().m.b(this.q);
        ((f3)this.c0).k().F().b("Session timeout duration set", this.q);
    }
}

