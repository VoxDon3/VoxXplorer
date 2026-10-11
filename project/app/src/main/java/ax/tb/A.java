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
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class A
implements List,
Serializable,
RandomAccess,
a {
    public static final A q = new A();

    private A() {
    }

    public boolean addAll(int n8, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        return object instanceof List && ((List)object).isEmpty();
    }

    public Void g(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Empty list doesn't contain element at index ");
        stringBuilder.append(n8);
        stringBuilder.append('.');
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public int i() {
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

    public int k(Void void_) {
        l.f(void_, "element");
        return -1;
    }

    public int l(Void void_) {
        l.f(void_, "element");
        return -1;
    }

    public ListIterator listIterator() {
        return z.q;
    }

    public ListIterator listIterator(int n8) {
        if (n8 == 0) {
            return z.q;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(n8);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
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

    public List subList(int n8, int n9) {
        if (n8 == 0 && n9 == 0) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fromIndex: ");
        stringBuilder.append(n8);
        stringBuilder.append(", toIndex: ");
        stringBuilder.append(n9);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
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

