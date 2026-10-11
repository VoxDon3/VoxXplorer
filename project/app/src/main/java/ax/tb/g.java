/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.b;
import ax.Gb.f;
import ax.Gb.l;
import ax.Hb.a;
import ax.tb.m;
import ax.tb.p;
import java.util.Collection;
import java.util.Iterator;

final class g<T>
implements Collection<T>,
a {
    private final boolean c0;
    private final T[] q;

    public g(T[] TArray, boolean bl) {
        l.f(TArray, "values");
        this.q = TArray;
        this.c0 = bl;
    }

    @Override
    public boolean add(T t8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object) {
        return m.s(this.q, object);
    }

    @Override
    public boolean containsAll(Collection<?> object) {
        l.f(object, "elements");
        object = (Iterable)object;
        if (object.isEmpty()) {
            return true;
        }
        object = object.iterator();
        while (object.hasNext()) {
            if (this.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    public int e() {
        return this.q.length;
    }

    @Override
    public boolean isEmpty() {
        return this.q.length == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return b.a(this.q);
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object[] toArray() {
        return p.b(this.q, this.c0);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        l.f(TArray, "array");
        return f.b(this, TArray);
    }
}

