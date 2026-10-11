/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.q5;
import com.google.android.gms.measurement.internal.y5;

final class p5
implements Runnable {
    private final q5 c0;
    private final y5 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    p5(q5 q52, y5 y52) {
        this.q = y52;
        this.c0 = q52;
    }

    @Override
    public final void run() {
        q5.y(this.c0, this.q);
        this.c0.y0();
    }
}

