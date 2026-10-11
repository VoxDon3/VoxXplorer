/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.r7.G;
import ax.r7.u;
import java.util.Collection;
import java.util.Iterator;

public abstract class s<E>
extends u
implements Collection<E> {
    protected s() {
    }

    @Override
    public void clear() {
        this.g().clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.g().contains(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.g().containsAll(collection);
    }

    protected abstract Collection<E> g();

    protected boolean i(Collection<? extends E> collection) {
        return G.a(this, collection.iterator());
    }

    @Override
    public boolean isEmpty() {
        return this.g().isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return this.g().iterator();
    }

    @Override
    public boolean remove(Object object) {
        return this.g().remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.g().removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.g().retainAll(collection);
    }

    @Override
    public int size() {
        return this.g().size();
    }

    @Override
    public Object[] toArray() {
        return this.g().toArray();
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        return this.g().toArray(TArray);
    }
}

