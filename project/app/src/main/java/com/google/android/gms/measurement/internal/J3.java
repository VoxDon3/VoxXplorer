/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.k3;
import java.util.concurrent.atomic.AtomicReference;

final class J3
implements Runnable {
    private final String c0;
    private final String d0;
    private final String e0;
    private final k3 f0;
    private final AtomicReference q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    J3(k3 k32, AtomicReference atomicReference, String string, String string2, String string3) {
        this.q = atomicReference;
        this.c0 = null;
        this.d0 = string2;
        this.e0 = string3;
        this.f0 = k32;
    }

    @Override
    public final void run() {
        this.f0.a.J().S(this.q, null, this.d0, this.e0);
    }
}

