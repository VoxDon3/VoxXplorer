/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import ax.M5.p;
import ax.f6.e;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class C4
implements Runnable {
    private final E5 c0;
    private final boolean d0;
    private final D e0;
    private final String f0;
    private final k4 g0;
    private final boolean q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    C4(k4 k42, boolean bl, E5 e52, boolean bl2, D d8, String string) {
        this.q = bl;
        this.c0 = e52;
        this.d0 = bl2;
        this.e0 = d8;
        this.f0 = string;
        this.g0 = k42;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block7: {
            RemoteException remoteException2;
            block6: {
                e e8 = k4.B(this.g0);
                if (e8 == null) {
                    ((f3)this.g0).k().G().a("Discarding data. Failed to send event to service");
                    return;
                }
                if (this.q) {
                    p.l(this.c0);
                    k4 k42 = this.g0;
                    D d8 = this.d0 ? null : this.e0;
                    k42.I(e8, d8, this.c0);
                } else {
                    block5: {
                        try {
                            if (!TextUtils.isEmpty((CharSequence)this.f0)) break block5;
                            p.l(this.c0);
                            e8.w1(this.e0, this.c0);
                        }
                        catch (RemoteException remoteException2) {
                            break block6;
                        }
                    }
                    e8.N(this.e0, this.f0, ((f3)this.g0).k().O());
                }
                break block7;
            }
            ((f3)this.g0).k().G().b("Failed to send event to the service", (Object)remoteException2);
        }
        k4.r0(this.g0);
    }
}

