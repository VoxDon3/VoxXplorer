/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.f4;

final class h4
implements Runnable {
    private final d4 c0;
    private final long d0;
    private final boolean e0;
    private final f4 f0;
    private final d4 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    h4(f4 f42, d4 d42, d4 d43, long l8, boolean bl) {
        this.q = d42;
        this.c0 = d43;
        this.d0 = l8;
        this.e0 = bl;
        this.f0 = f42;
    }

    @Override
    public final void run() {
        f4.N(this.f0, this.q, this.c0, this.d0, this.e0, null);
    }
}

