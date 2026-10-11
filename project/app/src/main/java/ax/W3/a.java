/*
 * Decompiled with CFR 0.152.
 */
package ax.W3;

import ax.P3.s;
import ax.k4.h;

public class a<T>
implements s<T> {
    protected final T q;

    public a(T t8) {
        this.q = h.d(t8);
    }

    @Override
    public Class<T> b() {
        return this.q.getClass();
    }

    @Override
    public final T get() {
        return this.q;
    }

    @Override
    public final int getSize() {
        return 1;
    }

    @Override
    public void recycle() {
    }
}

