/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.s;

final class v
implements Runnable {
    private final s c0;
    private final g3 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    v(s s8, g3 g32) {
        this.q = g32;
        this.c0 = s8;
    }

    @Override
    public final void run() {
        this.q.e();
        if (c.a()) {
            this.q.l().D(this);
            return;
        }
        boolean bl = this.c0.e();
        s.c(this.c0, 0L);
        if (bl) {
            this.c0.d();
        }
    }
}

