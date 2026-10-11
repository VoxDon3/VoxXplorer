/*
 * Decompiled with CFR 0.152.
 */
package ax.n2;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.savedstate.Recreator;
import ax.Gb.g;
import ax.Gb.l;
import ax.n2.d;

public final class c {
    public static final a d = new a(null);
    private final d a;
    private final androidx.savedstate.a b;
    private boolean c;

    private c(d d8) {
        this.a = d8;
        this.b = new androidx.savedstate.a();
    }

    public /* synthetic */ c(d d8, g g8) {
        this(d8);
    }

    public static final c a(d d8) {
        return d.a(d8);
    }

    public final androidx.savedstate.a b() {
        return this.b;
    }

    public final void c() {
        androidx.lifecycle.d d8 = this.a.getLifecycle();
        if (d8.b() == d.b.c0) {
            d8.a(new Recreator(this.a));
            this.b.e(d8);
            this.c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void d(Bundle object) {
        androidx.lifecycle.d d8;
        if (!this.c) {
            this.c();
        }
        if (!(d8 = this.a.getLifecycle()).b().h(d.b.e0)) {
            this.b.f((Bundle)object);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("performRestore cannot be called when owner is ");
        ((StringBuilder)object).append((Object)d8.b());
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public final void e(Bundle bundle) {
        l.f(bundle, "outBundle");
        this.b.g(bundle);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final c a(d d8) {
            l.f(d8, "owner");
            return new c(d8, null);
        }
    }
}

