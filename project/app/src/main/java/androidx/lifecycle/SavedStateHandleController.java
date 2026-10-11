/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.l;
import androidx.savedstate.a;
import ax.G0.h;

public final class SavedStateHandleController
implements f {
    private final l c0;
    private boolean d0;
    private final String q;

    public SavedStateHandleController(String string, l l8) {
        ax.Gb.l.f(string, "key");
        ax.Gb.l.f(l8, "handle");
        this.q = string;
        this.c0 = l8;
    }

    @Override
    public void b(h h8, d.a a8) {
        ax.Gb.l.f(h8, "source");
        ax.Gb.l.f((Object)a8, "event");
        if (a8 == d.a.ON_DESTROY) {
            this.d0 = false;
            h8.getLifecycle().c(this);
        }
    }

    public final void h(a a8, d d8) {
        ax.Gb.l.f(a8, "registry");
        ax.Gb.l.f(d8, "lifecycle");
        if (!this.d0) {
            this.d0 = true;
            d8.a(this);
            a8.h(this.q, this.c0.c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public final l i() {
        return this.c0;
    }

    public final boolean j() {
        return this.d0;
    }
}

