/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.r;

final class q
implements Runnable {
    final r c0;
    final ax.J5.c q;

    q(r r8, ax.J5.c c8) {
        this.c0 = r8;
        this.q = c8;
    }

    @Override
    public final void run() {
        Object object = this.c0;
        object = (o)c.x(((r)object).f).get(r.f((r)object));
        if (object == null) {
            return;
        }
        if (this.q.C()) {
            r.g(this.c0, true);
            if (r.e(this.c0).o()) {
                r.h(this.c0);
                return;
            }
            try {
                r r8 = this.c0;
                r.e(r8).c(null, r.e(r8).d());
                return;
            }
            catch (SecurityException securityException) {
                Log.e((String)"GoogleApiManager", (String)"Failed to get service from broker. ", (Throwable)securityException);
                r.e(this.c0).e("Failed to get service from broker.");
                ((o)object).I(new ax.J5.c(10), null);
                return;
            }
        }
        ((o)object).I(this.q, null);
    }
}

