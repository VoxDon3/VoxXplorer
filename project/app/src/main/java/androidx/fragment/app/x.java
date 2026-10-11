/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.savedstate.a;
import ax.G0.v;

class x
implements c,
ax.n2.d,
v {
    private final Fragment a;
    private final r b;
    private g c = null;
    private ax.n2.c d = null;

    x(Fragment fragment, r r8) {
        this.a = fragment;
        this.b = r8;
    }

    void a(d.a a8) {
        this.c.h(a8);
    }

    void b() {
        if (this.c == null) {
            ax.n2.c c8;
            this.c = new g(this);
            this.d = c8 = ax.n2.c.a(this);
            c8.c();
        }
    }

    boolean c() {
        return this.c != null;
    }

    void d(Bundle bundle) {
        this.d.d(bundle);
    }

    void e(Bundle bundle) {
        this.d.e(bundle);
    }

    void f(d.b b8) {
        this.c.m(b8);
    }

    @Override
    public ax.I0.a getDefaultViewModelCreationExtras() {
        Context context;
        block4: {
            context = this.a.p2().getApplicationContext();
            while (context instanceof ContextWrapper) {
                if (context instanceof Application) {
                    context = (Application)context;
                    break block4;
                }
                context = ((ContextWrapper)context).getBaseContext();
            }
            context = null;
        }
        ax.I0.d d8 = new ax.I0.d();
        if (context != null) {
            d8.c(q.a.g, context);
        }
        d8.c(m.a, this.a);
        d8.c(m.b, this);
        if (this.a.j0() != null) {
            d8.c(m.c, this.a.j0());
        }
        return d8;
    }

    @Override
    public d getLifecycle() {
        this.b();
        return this.c;
    }

    @Override
    public a getSavedStateRegistry() {
        this.b();
        return this.d.b();
    }

    @Override
    public r getViewModelStore() {
        this.b();
        return this.b;
    }
}

