/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.f4;

final class e4
implements Runnable {
    private final d4 c0;
    private final d4 d0;
    private final long e0;
    private final f4 f0;
    private final Bundle q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    e4(f4 f42, Bundle bundle, d4 d42, d4 d43, long l8) {
        this.q = bundle;
        this.c0 = d42;
        this.d0 = d43;
        this.e0 = l8;
        this.f0 = f42;
    }

    @Override
    public final void run() {
        f4.L(this.f0, this.q, this.c0, this.d0, this.e0);
    }
}

