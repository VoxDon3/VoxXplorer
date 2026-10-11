/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.S4;
import com.google.android.gms.measurement.internal.q5;

final class T4
implements Runnable {
    private final Runnable c0;
    private final q5 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    T4(S4 s42, q5 q52, Runnable runnable2) {
        this.q = q52;
        this.c0 = runnable2;
    }

    @Override
    public final void run() {
        this.q.u0();
        this.q.A(this.c0);
        this.q.z0();
    }
}

