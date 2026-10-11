/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import ax.B.b;
import ax.L5.f;
import ax.M5.p;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.c;

public final class h
extends E {
    private final b f = new b();
    private final c g;

    h(f f8, c c8, ax.J5.h h8) {
        super(f8, h8);
        this.g = c8;
        this.a.m("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity object, c c8, ax.L5.b b8) {
        f f8 = LifecycleCallback.c(object);
        h h8 = f8.y("ConnectionlessLifecycleHelper", h.class);
        object = h8;
        if (h8 == null) {
            object = new h(f8, c8, ax.J5.h.o());
        }
        p.m(b8, "ApiKey cannot be null");
        object.f.add(b8);
        c8.b((h)object);
    }

    private final void v() {
        if (!this.f.isEmpty()) {
            this.g.b(this);
        }
    }

    @Override
    public final void h() {
        super.h();
        this.v();
    }

    @Override
    public final void j() {
        super.j();
        this.v();
    }

    @Override
    public final void k() {
        super.k();
        this.g.c(this);
    }

    @Override
    protected final void m(ax.J5.c c8, int n8) {
        this.g.D(c8, n8);
    }

    @Override
    protected final void n() {
        this.g.E();
    }

    final b t() {
        return this.f;
    }
}

