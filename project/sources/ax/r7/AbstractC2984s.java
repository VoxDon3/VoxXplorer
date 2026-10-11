package ax.r7;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: ax.r7.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2984s<E> extends AbstractC2986u implements Collection<E> {
    protected AbstractC2984s() {
    }

    @Override // java.util.Collection
    public void clear() {
        g().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return g().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return g().containsAll(collection);
    }

    protected abstract Collection<E> g();

    protected boolean i(Collection<? extends E> collection) {
        return G.a(this, collection.iterator());
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return g().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return g().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return g().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return g().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return g().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return g().size();
    }

    public Object[] toArray() {
        return g().toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) g().toArray(tArr);
    }
}
