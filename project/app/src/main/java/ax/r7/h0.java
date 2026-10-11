/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import java.util.Iterator;

abstract class h0<F, T>
implements Iterator<T> {
    final Iterator<? extends F> q;

    h0(Iterator<? extends F> iterator) {
        this.q = n.n(iterator);
    }

    abstract T b(F var1);

    @Override
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override
    public final T next() {
        return this.b(this.q.next());
    }

    @Override
    public final void remove() {
        this.q.remove();
    }
}

