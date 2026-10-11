/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.os.Bundle;
import ax.M5.S;
import ax.M5.c;

public final class h0
extends S {
    final c g;

    public h0(c c8, int n8, Bundle bundle) {
        this.g = c8;
        super(c8, n8, null);
    }

    @Override
    protected final void f(ax.J5.c c8) {
        if (this.g.t() && ax.M5.c.h0(this.g)) {
            ax.M5.c.d0(this.g, 16);
            return;
        }
        this.g.q0.c(c8);
        this.g.L(c8);
    }

    @Override
    protected final boolean g() {
        this.g.q0.c(ax.J5.c.f0);
        return true;
    }
}

