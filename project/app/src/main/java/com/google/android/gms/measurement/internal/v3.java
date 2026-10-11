/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.k3;

public final class v3
implements Runnable {
    private String c0;
    private k3 q;

    public /* synthetic */ v3(k3 k32, String string) {
        this.q = k32;
        this.c0 = string;
    }

    @Override
    public final void run() {
        this.q.P0(this.c0);
    }
}

