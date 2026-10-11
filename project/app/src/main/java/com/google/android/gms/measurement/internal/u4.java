/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ax.M5.p;
import ax.b6.M0;
import ax.f6.e;
import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k4;

final class u4
implements Runnable {
    private final M0 c0;
    private final k4 d0;
    private final E5 q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    u4(k4 k42, E5 e52, M0 m02) {
        this.q = e52;
        this.c0 = m02;
        this.d0 = k42;
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
        String string;
        block9: {
            RemoteException remoteException2;
            String string2;
            block10: {
                e e8;
                String string3;
                String string4 = null;
                string = string3 = null;
                string2 = string4;
                try {
                    if (!((f3)this.d0).h().M().B()) {
                        string = string3;
                        string2 = string4;
                        ((f3)this.d0).k().M().a("Analytics storage consent denied; will not get app instance id");
                        string = string3;
                        string2 = string4;
                        ((C1)this.d0).r().X0(null);
                        string = string3;
                        string2 = string4;
                        ((f3)this.d0).h().i.b(null);
                        ((f3)this.d0).i().S(this.c0, null);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                catch (RemoteException remoteException2) {
                    break block10;
                }
                string = string3;
                string2 = string4;
                {
                    e8 = k4.B(this.d0);
                    if (e8 == null) {
                        string = string3;
                        string2 = string4;
                        ((f3)this.d0).k().G().a("Failed to get app instance id");
                        ((f3)this.d0).i().S(this.c0, null);
                        return;
                    }
                    string = string3;
                    string2 = string4;
                }
                {
                    p.l(this.q);
                    string = string3;
                    string2 = string4;
                    string3 = e8.p0(this.q);
                    if (string3 != null) {
                        string = string3;
                        string2 = string3;
                        ((C1)this.d0).r().X0(string3);
                        string = string3;
                        string2 = string3;
                        ((f3)this.d0).h().i.b(string3);
                    }
                    string = string3;
                    string2 = string3;
                    k4.r0(this.d0);
                    ((f3)this.d0).i().S(this.c0, string3);
                    return;
                }
            }
            string = string2;
            {
                ((f3)this.d0).k().G().b("Failed to get app instance id", (Object)remoteException2);
                ((f3)this.d0).i().S(this.c0, string2);
                return;
            }
        }
        ((f3)this.d0).i().S(this.c0, string);
        throw throwable2;
    }
}

