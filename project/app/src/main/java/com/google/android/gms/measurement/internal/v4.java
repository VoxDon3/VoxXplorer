/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.M5.p;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.k4;
import java.util.concurrent.atomic.AtomicReference;

final class v4
implements Runnable {
    private final E5 c0;
    private final k4 d0;
    private final AtomicReference q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    v4(k4 k42, AtomicReference atomicReference, E5 e52) {
        this.q = atomicReference;
        this.c0 = e52;
        this.d0 = k42;
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
            block14: {
                try {
                    if (!this.d0.h().M().B()) {
                        this.d0.k().M().a("Analytics storage consent denied; will not get app instance id");
                        this.d0.r().X0(null);
                        this.d0.h().i.b(null);
                        this.q.set(null);
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var2_3) {
                    ** GOTO lbl38
                }
                catch (RemoteException var2_4) {
                    ** GOTO lbl-1000
                }
                try {
                    this.q.notify();
                    return;
                }
                catch (Throwable var2_2) {
                    break block14;
                }
lbl-1000:
                // 1 sources

                {
                    var2_5 = k4.B(this.d0);
                    if (var2_5 != null) ** GOTO lbl-1000
                    this.d0.k().G().a("Failed to get app instance id");
                }
                {
                    this.q.notify();
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    p.l(this.c0);
                    this.q.set(var2_5.p0(this.c0));
                    var2_5 = (String)this.q.get();
                    if (var2_5 != null) {
                        this.d0.r().X0((String)var2_5);
                        this.d0.h().i.b((String)var2_5);
                    }
                    k4.r0(this.d0);
                }
                {
                    this.q.notify();
                    ** GOTO lbl37
                }
lbl-1000:
                // 1 sources

                {
                    this.d0.k().G().b("Failed to get app instance id", (Object)var2_4);
                }
                {
                    this.q.notify();
lbl37:
                    // 2 sources

                    return;
lbl38:
                    // 1 sources

                    this.q.notify();
                    throw var2_3;
                }
            }
            throw var2_2;
        }
    }
}

