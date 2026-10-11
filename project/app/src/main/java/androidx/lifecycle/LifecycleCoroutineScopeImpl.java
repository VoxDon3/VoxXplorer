/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.e;
import ax.G0.h;
import ax.Gb.l;
import ax.Qb.w0;
import ax.wb.i;

public final class LifecycleCoroutineScopeImpl
extends e
implements f {
    private final i c0;
    private final d q;

    @Override
    public void b(h h8, d.a a8) {
        l.f(h8, "source");
        l.f((Object)a8, "event");
        if (this.i().b().compareTo(d.b.q) <= 0) {
            this.i().c(this);
            w0.d(this.h(), null, 1, null);
        }
    }

    @Override
    public i h() {
        return this.c0;
    }

    public d i() {
        return this.q;
    }
}

