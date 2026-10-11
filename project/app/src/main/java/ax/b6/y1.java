/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.app.Activity;
import android.os.RemoteException;
import ax.M5.p;
import ax.T5.b;
import ax.b6.W0;

final class y1
extends W0.a {
    private final Activity f0;
    private final W0.c g0;

    y1(W0.c c8, Activity activity) {
        this.f0 = activity;
        this.g0 = c8;
        super(c8.a);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.g0.a)).onActivityDestroyed(b.a2(this.f0), this.c0);
    }
}

