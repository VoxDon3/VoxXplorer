/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.app.Activity;
import android.os.RemoteException;
import ax.M5.p;
import ax.T5.b;
import ax.b6.I0;
import ax.b6.W0;

final class z1
extends W0.a {
    private final Activity f0;
    private final I0 g0;
    private final W0.c h0;

    z1(W0.c c8, Activity activity, I0 i02) {
        this.f0 = activity;
        this.g0 = i02;
        this.h0 = c8;
        super(c8.a);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.h0.a)).onActivitySaveInstanceState(b.a2(this.f0), this.g0, this.c0);
    }
}

