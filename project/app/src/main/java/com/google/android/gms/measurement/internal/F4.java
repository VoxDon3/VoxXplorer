/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import ax.M5.p;
import ax.f6.e;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class F4
implements Runnable {
    private final E5 c0;
    private final boolean d0;
    private final f e0;
    private final f f0;
    private final k4 g0;
    private final boolean q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    F4(k4 k42, boolean bl, E5 e52, boolean bl2, f f8, f f9) {
        this.q = true;
        this.c0 = e52;
        this.d0 = bl2;
        this.e0 = f8;
        this.f0 = f9;
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
                    ((f3)this.g0).k().G().a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                if (this.q) {
                    p.l(this.c0);
                    k4 k42 = this.g0;
                    f f8 = this.d0 ? null : this.e0;
                    k42.I(e8, f8, this.c0);
                } else {
                    block5: {
                        try {
                            if (!TextUtils.isEmpty((CharSequence)this.f0.q)) break block5;
                            p.l(this.c0);
                            e8.y0(this.e0, this.c0);
                        }
                        catch (RemoteException remoteException2) {
                            break block6;
                        }
                    }
                    e8.M0(this.e0);
                }
                break block7;
            }
            ((f3)this.g0).k().G().b("Failed to send conditional user property to the service", (Object)remoteException2);
        }
        k4.r0(this.g0);
    }
}

