/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.k3;

public final class D2
implements Runnable {
    private k3 q;

    public /* synthetic */ D2(k3 k32) {
        this.q = k32;
    }

    @Override
    public final void run() {
        this.q.C0();
    }
}

