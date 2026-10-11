/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.Y4;
import com.google.android.gms.measurement.internal.Z4;
import com.google.android.gms.measurement.internal.f3;

public final class b5
implements Runnable {
    private Y4 q;

    public /* synthetic */ b5(Y4 y42) {
        this.q = y42;
    }

    @Override
    public final void run() {
        Y4 y42 = this.q;
        Z4 z42 = y42.d0;
        long l8 = y42.q;
        long l9 = y42.c0;
        ((f3)z42.b).n();
        ((f3)z42.b).k().F().a("Application going to the background");
        ((f3)z42.b).h().u.a(true);
        z42.b.D(true);
        if (!((f3)z42.b).d().T()) {
            if (((f3)z42.b).d().t(F.I0)) {
                z42.b.E(false, false, l9);
                z42.b.f.e(l9);
            } else {
                z42.b.f.e(l9);
                z42.b.E(false, false, l9);
            }
        }
        ((f3)z42.b).k().J().b("Application backgrounded at: timestamp_millis", l8);
    }
}

