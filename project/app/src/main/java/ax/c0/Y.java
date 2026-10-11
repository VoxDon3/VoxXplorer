/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import ax.Fb.l;
import ax.Hb.a;
import ax.tb.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class Y<T>
implements Iterator<T>,
a {
    private final List<Iterator<T>> c0;
    private Iterator<? extends T> d0;
    private final l<T, Iterator<T>> q;

    public Y(Iterator<? extends T> iterator, l<? super T, ? extends Iterator<? extends T>> l8) {
        this.q = l8;
        this.c0 = new ArrayList<Iterator<T>>();
        this.d0 = iterator;
    }

    private final void b(T object) {
        if ((object = this.q.invoke(object)) != null && object.hasNext()) {
            this.c0.add(this.d0);
            this.d0 = object;
            return;
        }
        while (!this.d0.hasNext() && !((Collection)this.c0).isEmpty()) {
            this.d0 = o.M(this.c0);
            o.x(this.c0);
        }
    }

    @Override
    public boolean hasNext() {
        return this.d0.hasNext();
    }

    @Override
    public T next() {
        T t8 = this.d0.next();
        this.b(t8);
        return t8;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

