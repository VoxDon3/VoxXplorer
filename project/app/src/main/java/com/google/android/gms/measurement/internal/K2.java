/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.I2;

public final class K2
implements Runnable {
    private E5 c0;
    private I2 q;

    public /* synthetic */ K2(I2 i22, E5 e52) {
        this.q = i22;
        this.c0 = e52;
    }

    @Override
    public final void run() {
        this.q.h2(this.c0);
    }
}

