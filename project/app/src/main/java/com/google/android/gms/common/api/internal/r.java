/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.util.Log;
import ax.K5.a;
import ax.L5.B;
import ax.L5.b;
import ax.M5.c;
import ax.M5.j;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.q;
import java.util.Set;

final class r
implements c.c,
B {
    private final a.f a;
    private final b b;
    private j c;
    private Set d;
    private boolean e;
    final c f;

    public r(c c8, a.f f8, b b8) {
        this.f = c8;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = f8;
        this.b = b8;
    }

    static /* bridge */ /* synthetic */ a.f e(r r8) {
        return r8.a;
    }

    static /* bridge */ /* synthetic */ b f(r r8) {
        return r8.b;
    }

    static /* bridge */ /* synthetic */ void g(r r8, boolean bl) {
        r8.e = true;
    }

    static /* bridge */ /* synthetic */ void h(r r8) {
        r8.i();
    }

    private final void i() {
        j j8;
        if (this.e && (j8 = this.c) != null) {
            this.a.c(j8, this.d);
        }
    }

    @Override
    public final void a(ax.J5.c c8) {
        o o8 = (o)com.google.android.gms.common.api.internal.c.x(this.f).get(this.b);
        if (o8 != null) {
            o8.J(c8);
        }
    }

    @Override
    public final void b(j j8, Set set) {
        if (j8 != null && set != null) {
            this.c = j8;
            this.d = set;
            this.i();
            return;
        }
        Log.wtf((String)"GoogleApiManager", (String)"Received null response from onSignInSuccess", (Throwable)new Exception());
        this.a(new ax.J5.c(4));
    }

    @Override
    public final void c(ax.J5.c c8) {
        com.google.android.gms.common.api.internal.c.o(this.f).post((Runnable)new q(this, c8));
    }

    @Override
    public final void d(int n8) {
        o o8 = (o)com.google.android.gms.common.api.internal.c.x(this.f).get(this.b);
        if (o8 != null) {
            if (o.O(o8)) {
                o8.J(new ax.J5.c(17));
                return;
            }
            o8.w(n8);
        }
    }
}

