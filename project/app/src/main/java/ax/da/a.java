/*
 * Decompiled with CFR 0.152.
 */
package ax.da;

import ax.da.b;

public class a<T>
extends b<T> {
    public boolean offer(T t8) {
        return super.h(t8);
    }

    @Override
    public T remove() {
        return (T)super.removeFirst();
    }
}

