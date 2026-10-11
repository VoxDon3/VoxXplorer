/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.f;
import ax.Gb.l;
import ax.tb.a;
import ax.tb.y;
import java.util.Collection;
import java.util.Iterator;

public abstract class b<E>
implements Collection<E>,
ax.Hb.a {
    protected b() {
    }

    public static /* synthetic */ CharSequence e(b b8, Object object) {
        return b.i(b8, object);
    }

    private static final CharSequence i(b b8, Object object) {
        if (object == b8) {
            return "(this Collection)";
        }
        return String.valueOf(object);
    }

    @Override
    public boolean add(E e8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object object) {
        if (this.isEmpty()) {
            return false;
        }
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            if (!l.a(iterator.next(), object)) continue;
            return true;
        }
        return false;
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

    public abstract int g();

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
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
    public Object[] toArray() {
        return f.a(this);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        l.f(TArray, "array");
        return f.b(this, TArray);
    }

    public String toString() {
        return y.L(this, ", ", "[", "]", 0, null, new a(this), 24, null);
    }
}

