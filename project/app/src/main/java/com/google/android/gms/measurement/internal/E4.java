/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import ax.M5.p;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.k4;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class E4
implements Runnable {
    private final String c0;
    private final String d0;
    private final String e0;
    private final E5 f0;
    private final k4 g0;
    private final AtomicReference q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    E4(k4 k42, AtomicReference atomicReference, String string, String string2, String string3, E5 e52) {
        this.q = atomicReference;
        this.c0 = string;
        this.d0 = string2;
        this.e0 = string3;
        this.f0 = e52;
        this.g0 = k42;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var1_1 = this.q;
        synchronized (var1_1) {
            block13: {
                try {
                    var2_2 = k4.B(this.g0);
                    if (var2_2 == null) {
                        this.g0.k().G().d("(legacy) Failed to get conditional properties; not connected to service", V1.v(this.c0), this.d0, this.e0);
                        this.q.set(Collections.EMPTY_LIST);
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var2_4) {
                    ** GOTO lbl32
                }
                catch (RemoteException var2_5) {
                    ** GOTO lbl-1000
                }
                try {
                    this.q.notify();
                    return;
                }
                catch (Throwable var2_3) {
                    break block13;
                }
lbl-1000:
                // 1 sources

                {
                    if (TextUtils.isEmpty((CharSequence)this.c0)) {
                        p.l(this.f0);
                        this.q.set(var2_2.F(this.d0, this.e0, this.f0));
                    } else {
                        this.q.set(var2_2.J0(this.c0, this.d0, this.e0));
                    }
                    k4.r0(this.g0);
                }
                {
                    this.q.notify();
                    ** GOTO lbl31
                }
lbl-1000:
                // 1 sources

                {
                    this.g0.k().G().d("(legacy) Failed to get conditional properties; remote exception", V1.v(this.c0), this.d0, (Object)var2_5);
                    this.q.set(Collections.EMPTY_LIST);
                }
                {
                    this.q.notify();
lbl31:
                    // 2 sources

                    return;
lbl32:
                    // 1 sources

                    this.q.notify();
                    throw var2_4;
                }
            }
            throw var2_3;
        }
    }
}

