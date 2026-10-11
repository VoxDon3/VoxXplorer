/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import ax.b6.c0;
import ax.b6.d0;
import com.google.android.gms.measurement.internal.o2;
import com.google.android.gms.measurement.internal.p2;
import com.google.android.gms.measurement.internal.z2;

public final class n2
implements ServiceConnection {
    final o2 c0;
    private final String q;

    n2(o2 o22, String string) {
        this.c0 = o22;
        this.q = string;
    }

    static /* bridge */ /* synthetic */ String a(n2 n22) {
        return n22.q;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName object, IBinder object2) {
        RuntimeException runtimeException2;
        block4: {
            d0 d02;
            if (object2 == null) {
                this.c0.a.k().L().a("Install Referrer connection returned with null binder");
                return;
            }
            try {
                d02 = ax.b6.c0.w(object2);
                if (d02 == null) {
                    this.c0.a.k().L().a("Install Referrer Service implementation was not found");
                    return;
                }
            }
            catch (RuntimeException runtimeException2) {
                break block4;
            }
            this.c0.a.k().K().a("Install Referrer Service connected");
            object = this.c0.a.l();
            object2 = new p2(this, d02, this);
            ((z2)object).D((Runnable)object2);
            return;
        }
        this.c0.a.k().L().b("Exception occurred while calling Install Referrer API", runtimeException2);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.c0.a.k().K().a("Install Referrer Service disconnected");
    }
}

