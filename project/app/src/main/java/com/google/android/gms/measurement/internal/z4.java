/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.p;
import ax.f6.e;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class z4
implements Runnable {
    private final Bundle c0;
    private final k4 d0;
    private final E5 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    z4(k4 k42, E5 e52, Bundle bundle) {
        this.q = e52;
        this.c0 = bundle;
        this.d0 = k42;
    }

    @Override
    public final void run() {
        e e8 = k4.B(this.d0);
        if (e8 == null) {
            ((f3)this.d0).k().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            p.l(this.q);
            e8.g0(this.c0, this.q);
            return;
        }
        catch (RemoteException remoteException) {
            ((f3)this.d0).k().G().b("Failed to send default event parameters to service", (Object)remoteException);
            return;
        }
    }
}

