/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.f6.e;
import com.google.android.gms.measurement.internal.J4;
import com.google.android.gms.measurement.internal.f3;

final class K4
implements Runnable {
    private final J4 c0;
    private final e q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    K4(J4 j42, e e8) {
        this.q = e8;
        this.c0 = j42;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        J4 j42 = this.c0;
        synchronized (j42) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        J4.c(this.c0, false);
                        if (this.c0.d0.f0()) break block3;
                        ((f3)this.c0.d0).k().F().a("Connected to remote service");
                        this.c0.d0.H(this.q);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

