/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.z;

final class A0
implements Runnable {
    private final long c0;
    private final z d0;
    private final String q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    A0(z z8, String string, long l8) {
        this.q = string;
        this.c0 = l8;
        this.d0 = z8;
    }

    @Override
    public final void run() {
        z.C(this.d0, this.q, this.c0);
    }
}

