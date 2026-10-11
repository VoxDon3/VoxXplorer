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
import java.util.ArrayList;

final class H4
implements Runnable {
    private final String c0;
    private final E5 d0;
    private final M0 e0;
    private final k4 f0;
    private final String q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    H4(k4 k42, String string, String string2, E5 e52, M0 m02) {
        this.q = string;
        this.c0 = string2;
        this.d0 = e52;
        this.e0 = m02;
        this.f0 = k42;
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
        ArrayList<Bundle> arrayList;
        block6: {
            RemoteException remoteException2;
            ArrayList<Bundle> arrayList2;
            block7: {
                e e8;
                ArrayList<Bundle> arrayList3;
                arrayList = arrayList3 = new ArrayList<Bundle>();
                arrayList2 = arrayList3;
                try {
                    e8 = k4.B(this.f0);
                    if (e8 == null) {
                        arrayList = arrayList3;
                        arrayList2 = arrayList3;
                        ((f3)this.f0).k().G().c("Failed to get conditional properties; not connected to service", this.q, this.c0);
                        ((f3)this.f0).i().T(this.e0, arrayList3);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (RemoteException remoteException2) {
                    break block7;
                }
                arrayList = arrayList3;
                arrayList2 = arrayList3;
                {
                    p.l(this.d0);
                    arrayList = arrayList3;
                    arrayList2 = arrayList3;
                    arrayList = arrayList3 = B5.t0(e8.F(this.q, this.c0, this.d0));
                    arrayList2 = arrayList3;
                    k4.r0(this.f0);
                    ((f3)this.f0).i().T(this.e0, arrayList3);
                    return;
                }
            }
            arrayList = arrayList2;
            {
                ((f3)this.f0).k().G().d("Failed to get conditional properties; remote exception", this.q, this.c0, (Object)remoteException2);
                ((f3)this.f0).i().T(this.e0, arrayList2);
                return;
            }
        }
        ((f3)this.f0).i().T(this.e0, arrayList);
        throw throwable2;
    }
}

