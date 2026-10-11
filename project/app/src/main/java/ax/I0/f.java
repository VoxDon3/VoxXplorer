/*
 * Decompiled with CFR 0.152.
 */
package ax.I0;

import androidx.lifecycle.p;
import ax.Gb.l;
import ax.I0.a;

public final class f<T extends p> {
    private final Class<T> a;
    private final ax.Fb.l<a, T> b;

    public f(Class<T> clazz, ax.Fb.l<? super a, ? extends T> l8) {
        l.f(clazz, "clazz");
        l.f(l8, "initializer");
        this.a = clazz;
        this.b = l8;
    }

    public final Class<T> a() {
        return this.a;
    }

    public final ax.Fb.l<a, T> b() {
        return this.b;
    }
}

