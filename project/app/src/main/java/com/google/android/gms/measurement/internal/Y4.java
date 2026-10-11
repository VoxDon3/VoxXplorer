/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.Z4;
import com.google.android.gms.measurement.internal.b5;
import com.google.android.gms.measurement.internal.f3;

final class Y4
implements Runnable {
    long c0;
    final Z4 d0;
    long q;

    Y4(Z4 z42, long l8, long l9) {
        this.d0 = z42;
        this.q = l8;
        this.c0 = l9;
    }

    @Override
    public final void run() {
        ((f3)this.d0.b).l().D(new b5(this));
    }
}

