/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.f4;

final class i4
implements Runnable {
    private final long c0;
    private final f4 d0;
    private final d4 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    i4(f4 f42, d4 d42, long l8) {
        this.q = d42;
        this.c0 = l8;
        this.d0 = f42;
    }

    @Override
    public final void run() {
        f4.O(this.d0, this.q, false, this.c0);
        f4 f42 = this.d0;
        f42.e = null;
        ((C1)f42).t().L(null);
    }
}

