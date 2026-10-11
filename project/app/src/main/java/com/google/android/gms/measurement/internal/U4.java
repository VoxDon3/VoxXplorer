/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.Intent;
import com.google.android.gms.measurement.internal.S4;
import com.google.android.gms.measurement.internal.V1;

public final class U4
implements Runnable {
    private int c0;
    private V1 d0;
    private Intent e0;
    private S4 q;

    public /* synthetic */ U4(S4 s42, int n8, V1 v12, Intent intent) {
        this.q = s42;
        this.c0 = n8;
        this.d0 = v12;
        this.e0 = intent;
    }

    @Override
    public final void run() {
        this.q.d(this.c0, this.d0, this.e0);
    }
}

