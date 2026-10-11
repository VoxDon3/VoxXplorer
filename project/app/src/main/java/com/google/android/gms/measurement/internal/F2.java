/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.j3;

final class F2
implements Runnable {
    private final E2 c0;
    private final j3 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    F2(E2 e22, j3 j32) {
        this.q = j32;
        this.c0 = e22;
    }

    @Override
    public final void run() {
        E2.g(this.c0, this.q);
        this.c0.d(this.q.g);
    }
}

