/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.b6.M0;
import com.google.android.gms.measurement.internal.k3;

final class L3
implements Runnable {
    private final k3 c0;
    private final M0 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    L3(k3 k32, M0 m02) {
        this.q = m02;
        this.c0 = k32;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void run() {
        var1_1 = this.c0.u();
        if (!var1_1.h().M().B()) {
            var1_1.k().M().a("Analytics storage consent denied; will not get session id");
            while (true) {
                var1_1 = null;
                break;
            }
        } else {
            if (var1_1.h().z(var1_1.b().a()) || var1_1.h().s.a() == 0L) ** continue;
            var1_1 = var1_1.h().s.a();
        }
        if (var1_1 != null) {
            this.c0.a.L().Q(this.q, var1_1.longValue());
            return;
        }
        try {
            this.q.n(null);
            return;
        }
        catch (RemoteException var1_2) {
            this.c0.a.k().G().b("getSessionId failed with exception", (Object)var1_2);
            return;
        }
    }
}

