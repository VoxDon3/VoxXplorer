/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.k3;

final class K3
implements Runnable {
    private final k3 c0;
    private final Bundle q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    K3(k3 k32, Bundle bundle) {
        this.q = bundle;
        this.c0 = k32;
    }

    @Override
    public final void run() {
        k3.V(this.c0, this.q);
    }
}

