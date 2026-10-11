/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.h0;
import java.util.ListIterator;

abstract class i0<F, T>
extends h0<F, T>
implements ListIterator<T> {
    i0(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> c() {
        return (ListIterator)this.q;
    }

    @Override
    public void add(T t8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return this.c().hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return this.c().nextIndex();
    }

    @Override
    public final T previous() {
        return this.b(this.c().previous());
    }

    @Override
    public final int previousIndex() {
        return this.c().previousIndex();
    }

    @Override
    public void set(T t8) {
        throw new UnsupportedOperationException();
    }
}

