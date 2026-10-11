/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.V4;

final class X4
implements Runnable {
    private final V4 c0;
    private final long q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    X4(V4 v42, long l8) {
        this.q = l8;
        this.c0 = v42;
    }

    @Override
    public final void run() {
        V4.I(this.c0, this.q);
    }
}

