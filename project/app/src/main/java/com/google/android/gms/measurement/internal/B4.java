/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.b6.M0;
import ax.f6.e;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class B4
implements Runnable {
    private final String c0;
    private final M0 d0;
    private final k4 e0;
    private final D q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    B4(k4 k42, D d8, String string, M0 m02) {
        this.q = d8;
        this.c0 = string;
        this.d0 = m02;
        this.e0 = k42;
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
        byte[] byArray;
        block6: {
            RemoteException remoteException2;
            byte[] byArray2;
            block7: {
                e e8;
                byte[] byArray3;
                byte[] byArray4 = null;
                byArray = byArray3 = null;
                byArray2 = byArray4;
                try {
                    e8 = k4.B(this.e0);
                    if (e8 == null) {
                        byArray = byArray3;
                        byArray2 = byArray4;
                        ((f3)this.e0).k().G().a("Discarding data. Failed to send event to service to bundle");
                        ((f3)this.e0).i().V(this.d0, null);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (RemoteException remoteException2) {
                    break block7;
                }
                byArray = byArray3;
                byArray2 = byArray4;
                {
                    byArray = byArray4 = e8.h1(this.q, this.c0);
                    byArray2 = byArray4;
                    k4.r0(this.e0);
                    ((f3)this.e0).i().V(this.d0, byArray4);
                    return;
                }
            }
            byArray = byArray2;
            {
                ((f3)this.e0).k().G().b("Failed to send event to the service to bundle", (Object)remoteException2);
                ((f3)this.e0).i().V(this.d0, byArray2);
                return;
            }
        }
        ((f3)this.e0).i().V(this.d0, byArray);
        throw throwable2;
    }
}

