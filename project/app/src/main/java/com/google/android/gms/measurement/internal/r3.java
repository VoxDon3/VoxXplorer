/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.k3;

public final class r3
implements Runnable {
    private Bundle c0;
    private long d0;
    private k3 q;

    public /* synthetic */ r3(k3 k32, Bundle bundle, long l8) {
        this.q = k32;
        this.c0 = bundle;
        this.d0 = l8;
    }

    @Override
    public final void run() {
        this.q.N(this.c0, this.d0);
    }
}

