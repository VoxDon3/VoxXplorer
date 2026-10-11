/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.p;
import ax.b6.M0;
import ax.f6.e;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class p4
implements Runnable {
    private final String c0;
    private final E5 d0;
    private final boolean e0;
    private final M0 f0;
    private final k4 g0;
    private final String q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    p4(k4 k42, String string, String string2, E5 e52, boolean bl, M0 m02) {
        this.q = string;
        this.c0 = string2;
        this.d0 = e52;
        this.e0 = bl;
        this.f0 = m02;
        this.g0 = k42;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Throwable throwable2;
        Bundle bundle;
        block6: {
            RemoteException remoteException2;
            Bundle bundle2;
            block7: {
                e e8;
                Bundle bundle3;
                bundle = bundle3 = new Bundle();
                bundle2 = bundle3;
                try {
                    e8 = k4.B(this.g0);
                    if (e8 == null) {
                        bundle = bundle3;
                        bundle2 = bundle3;
                        ((f3)this.g0).k().G().c("Failed to get user properties; not connected to service", this.q, this.c0);
                        ((f3)this.g0).i().R(this.f0, bundle3);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (RemoteException remoteException2) {
                    break block7;
                }
                bundle = bundle3;
                bundle2 = bundle3;
                {
                    p.l(this.d0);
                    bundle = bundle3;
                    bundle2 = bundle3;
                    bundle = bundle3 = B5.G(e8.u1(this.q, this.c0, this.e0, this.d0));
                    bundle2 = bundle3;
                    k4.r0(this.g0);
                    ((f3)this.g0).i().R(this.f0, bundle3);
                    return;
                }
            }
            bundle = bundle2;
            {
                ((f3)this.g0).k().G().c("Failed to get user properties; remote exception", this.q, (Object)remoteException2);
                ((f3)this.g0).i().R(this.f0, bundle2);
                return;
            }
        }
        ((f3)this.g0).i().R(this.f0, bundle);
        throw throwable2;
    }
}

