/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.F5;
import com.google.android.gms.measurement.internal.g3;
import com.google.android.gms.measurement.internal.k3;

public final class H5
implements Runnable {
    private E2 q;

    public /* synthetic */ H5(E2 e22) {
        this.q = e22;
    }

    @Override
    public final void run() {
        g3 g32 = this.q;
        if (!g32.L().X0()) {
            g32.k().L().a("registerTrigger called but app not eligible");
            return;
        }
        g32 = g32.H();
        j.Objects.requireNonNull((Object)g32);
        new Thread(new F5((k3)g32)).start();
    }
}

