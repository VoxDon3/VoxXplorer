/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.app.Activity;
import android.os.RemoteException;
import ax.M5.p;
import ax.T5.b;
import ax.b6.W0;

final class b1
extends W0.a {
    private final Activity f0;
    private final String g0;
    private final String h0;
    private final W0 i0;

    b1(W0 w02, Activity activity, String string, String string2) {
        this.f0 = activity;
        this.g0 = string;
        this.h0 = string2;
        this.i0 = w02;
        super(w02);
    }

    @Override
    final void a() throws RemoteException {
        p.l(W0.d(this.i0)).setCurrentScreen(b.a2(this.f0), this.g0, this.h0, this.q);
    }
}

