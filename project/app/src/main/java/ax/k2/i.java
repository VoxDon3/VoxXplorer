/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import ax.Gb.l;
import ax.k2.A;
import ax.k2.u;
import ax.o2.k;

public abstract class i<T>
extends A {
    public i(u u8) {
        l.f(u8, "database");
        super(u8);
    }

    protected abstract void i(k var1, T var2);

    public final void j(T t8) {
        k k8 = this.b();
        try {
            this.i(k8, t8);
            k8.S0();
            return;
        }
        finally {
            this.h(k8);
        }
    }
}

