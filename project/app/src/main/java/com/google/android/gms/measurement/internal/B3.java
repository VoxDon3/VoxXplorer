/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.k3;

final class B3
implements Runnable {
    private final k3 q;

    B3(k3 k32) {
        this.q = k32;
    }

    @Override
    public final void run() {
        this.q.p.a();
    }
}

