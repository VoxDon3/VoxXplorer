/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.k3;
import java.util.concurrent.atomic.AtomicReference;

public final class q3
implements Runnable {
    private AtomicReference c0;
    private k3 q;

    public /* synthetic */ q3(k3 k32, AtomicReference atomicReference) {
        this.q = k32;
        this.c0 = atomicReference;
    }

    @Override
    public final void run() {
        this.q.n0(this.c0);
    }
}

