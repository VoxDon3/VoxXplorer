/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import ax.J5.e;
import ax.L5.g;
import ax.L5.y;
import ax.j6.k;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.v;

public final class z
extends v {
    public final g c;

    public z(g g8, k k8) {
        super(4, k8);
        this.c = g8;
    }

    @Override
    public final boolean f(o o8) {
        if ((y)o8.x().get(this.c) == null) {
            return false;
        }
        throw null;
    }

    @Override
    public final e[] g(o o8) {
        if ((y)o8.x().get(this.c) == null) {
            return null;
        }
        throw null;
    }

    @Override
    public final void h(o o8) throws RemoteException {
        if ((y)o8.x().remove(this.c) == null) {
            this.b.e(Boolean.FALSE);
            return;
        }
        o8.u();
        throw null;
    }
}

