/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.f4;

final class j4
implements Runnable {
    private final f4 c0;
    private final long q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    j4(f4 f42, long l8) {
        this.q = l8;
        this.c0 = f42;
    }

    @Override
    public final void run() {
        ((C1)this.c0).o().v(this.q);
        this.c0.e = null;
    }
}

