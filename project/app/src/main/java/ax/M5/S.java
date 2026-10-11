/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Bundle;
import ax.M5.c;
import ax.M5.d0;

abstract class S
extends d0 {
    public final int d;
    public final Bundle e;
    final c f;

    protected S(c c8, int n8, Bundle bundle) {
        this.f = c8;
        super(c8, Boolean.TRUE);
        this.d = n8;
        this.e = bundle;
    }

    @Override
    protected final void b() {
    }

    protected abstract void f(ax.J5.c var1);

    protected abstract boolean g();
}

