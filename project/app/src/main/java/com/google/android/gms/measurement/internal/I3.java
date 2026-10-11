/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.k3;
import java.util.concurrent.atomic.AtomicReference;

final class I3
implements Runnable {
    private final k3 c0;
    private final long q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    I3(k3 k32, long l8) {
        this.q = l8;
        this.c0 = k32;
    }

    @Override
    public final void run() {
        this.c0.J0(this.q);
        ((C1)this.c0).t().Q(new AtomicReference<String>());
    }
}

