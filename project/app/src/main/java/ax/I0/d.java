/*
 * Decompiled with CFR 0.152.
 */
package ax.I0;

import ax.Gb.g;
import ax.Gb.l;
import ax.I0.a;

public final class d
extends a {
    public d() {
        this(null, 1, null);
    }

    public d(a a8) {
        l.f(a8, "initialExtras");
        this.b().putAll(a8.b());
    }

    public /* synthetic */ d(a a8, int n8, g g8) {
        if ((n8 & 1) != 0) {
            a8 = a.a.b;
        }
        this(a8);
    }

    @Override
    public <T> T a(a.b<T> b8) {
        l.f(b8, "key");
        return (T)this.b().get(b8);
    }

    public final <T> void c(a.b<T> b8, T t8) {
        l.f(b8, "key");
        this.b().put(b8, t8);
    }
}

