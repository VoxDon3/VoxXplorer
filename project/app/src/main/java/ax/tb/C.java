/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.f;
import ax.Gb.l;
import ax.Hb.a;
import ax.tb.z;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class C
implements Set,
Serializable,
a {
    public static final C q = new C();

    private C() {
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsAll(Collection collection) {
        l.f(collection, "elements");
        return collection.isEmpty();
    }

    public boolean e(Void void_) {
        l.f(void_, "element");
        return false;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Set && ((Set)object).isEmpty();
    }

    public int g() {
        return 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Iterator iterator() {
        return z.q;
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection) {
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
        return "[]";
    }
}

