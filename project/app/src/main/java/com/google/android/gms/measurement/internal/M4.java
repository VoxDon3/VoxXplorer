/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.J4;
import com.google.android.gms.measurement.internal.k4;

final class M4
implements Runnable {
    private final J4 q;

    M4(J4 j42) {
        this.q = j42;
    }

    @Override
    public final void run() {
        k4.N(this.q.d0, null);
        k4.p0(this.q.d0);
    }
}

