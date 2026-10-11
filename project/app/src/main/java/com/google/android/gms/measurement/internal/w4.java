/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.f6.e;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class w4
implements Runnable {
    private final k4 c0;
    private final d4 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    w4(k4 k42, d4 d42) {
        this.q = d42;
        this.c0 = k42;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        RemoteException remoteException2;
        block5: {
            block4: {
                d4 d42;
                e e8;
                block3: {
                    e8 = k4.B(this.c0);
                    if (e8 == null) {
                        ((f3)this.c0).k().G().a("Failed to send current screen to service");
                        return;
                    }
                    try {
                        d42 = this.q;
                        if (d42 != null) break block3;
                        e8.F0(0L, null, null, ((f3)this.c0).a().getPackageName());
                        break block4;
                    }
                    catch (RemoteException remoteException2) {
                        break block5;
                    }
                }
                e8.F0(d42.c, d42.a, d42.b, ((f3)this.c0).a().getPackageName());
            }
            k4.r0(this.c0);
            return;
        }
        ((f3)this.c0).k().G().b("Failed to send current screen to the service", (Object)remoteException2);
    }
}

