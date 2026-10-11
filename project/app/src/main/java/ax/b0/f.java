/*
 * Decompiled with CFR 0.152.
 */
package ax.b0;

import ax.Gb.l;
import ax.b0.e;

public class f<T>
extends e<T> {
    private final Object c = new Object();

    public f(int n8) {
        super(n8);
    }

    @Override
    public boolean a(T t8) {
        l.f(t8, "instance");
        Object object = this.c;
        synchronized (object) {
            boolean bl = super.a(t8);
            return bl;
        }
    }

    @Override
    public T b() {
        Object object = this.c;
        synchronized (object) {
            Object t8 = super.b();
            return t8;
        }
    }
}

