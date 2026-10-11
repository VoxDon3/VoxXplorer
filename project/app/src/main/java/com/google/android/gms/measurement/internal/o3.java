/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.k3;
import java.util.List;

public final class o3
implements Runnable {
    private List c0;
    private k3 q;

    public /* synthetic */ o3(k3 k32, List list) {
        this.q = k32;
        this.c0 = list;
    }

    @Override
    public final void run() {
        this.q.m0(this.c0);
    }
}

