/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.z;

final class Z
implements Runnable {
    private final z c0;
    private final long q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    Z(z z8, long l8) {
        this.q = l8;
        this.c0 = z8;
    }

    @Override
    public final void run() {
        z.x(this.c0, this.q);
    }
}

