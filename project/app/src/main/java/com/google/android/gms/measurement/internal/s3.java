/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.k3;

public final class s3
implements Runnable {
    private Bundle c0;
    private k3 q;

    public /* synthetic */ s3(k3 k32, Bundle bundle) {
        this.q = k32;
        this.c0 = bundle;
    }

    @Override
    public final void run() {
        this.q.L(this.c0);
    }
}

