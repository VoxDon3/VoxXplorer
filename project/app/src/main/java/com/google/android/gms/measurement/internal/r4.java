/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.p;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.k4;
import java.util.concurrent.atomic.AtomicReference;

final class r4
implements Runnable {
    private final E5 c0;
    private final Bundle d0;
    private final k4 e0;
    private final AtomicReference q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    r4(k4 k42, AtomicReference atomicReference, E5 e52, Bundle bundle) {
        this.q = atomicReference;
        this.c0 = e52;
        this.d0 = bundle;
        this.e0 = k42;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var1_1 = this.q;
        synchronized (var1_1) {
            block11: {
                try {
                    var2_2 = k4.B(this.e0);
                    if (var2_2 == null) {
                        this.e0.k().G().a("Failed to get trigger URIs; not connected to service");
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var2_4) {
                    ** GOTO lbl27
                }
                catch (RemoteException var2_5) {
                    ** GOTO lbl-1000
                }
                try {
                    this.q.notify();
                    return;
                }
                catch (Throwable var2_3) {
                    break block11;
                }
lbl-1000:
                // 1 sources

                {
                    p.l(this.c0);
                    this.q.set(var2_2.B1(this.c0, this.d0));
                    k4.r0(this.e0);
                }
                {
                    this.q.notify();
                    ** GOTO lbl26
                }
lbl-1000:
                // 1 sources

                {
                    this.e0.k().G().b("Failed to get trigger URIs; remote exception", (Object)var2_5);
                }
                {
                    this.q.notify();
lbl26:
                    // 2 sources

                    return;
lbl27:
                    // 1 sources

                    this.q.notify();
                    throw var2_4;
                }
            }
            throw var2_3;
        }
    }
}

