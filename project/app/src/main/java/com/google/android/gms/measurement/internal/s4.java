/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.M5.p;
import ax.f6.e;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class s4
implements Runnable {
    private final k4 c0;
    private final E5 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    s4(k4 k42, E5 e52) {
        this.q = e52;
        this.c0 = k42;
    }

    @Override
    public final void run() {
        e e8 = k4.B(this.c0);
        if (e8 == null) {
            ((f3)this.c0).k().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            p.l(this.q);
            e8.I(this.q);
        }
        catch (RemoteException remoteException) {
            ((f3)this.c0).k().G().b("Failed to reset data on the service: remote exception", (Object)remoteException);
        }
        k4.r0(this.c0);
    }
}

