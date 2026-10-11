/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k3;
import java.util.concurrent.atomic.AtomicReference;

final class N3
implements Runnable {
    private final k3 c0;
    private final AtomicReference q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    N3(k3 k32, AtomicReference atomicReference) {
        this.q = atomicReference;
        this.c0 = k32;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        AtomicReference atomicReference = this.q;
        synchronized (atomicReference) {
            try {
                this.q.set(((f3)this.c0).d().z(((C1)this.c0).p().F(), F.N));
            }
            catch (Throwable throwable) {
                this.q.notify();
                throw throwable;
            }
            try {
                this.q.notify();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

