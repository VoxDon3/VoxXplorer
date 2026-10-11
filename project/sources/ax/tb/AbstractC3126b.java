package ax.tb;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: ax.tb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3126b<E> implements Collection<E>, ax.Hb.a {
    protected AbstractC3126b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(AbstractC3126b abstractC3126b, Object obj) {
        return obj == abstractC3126b ? "(this Collection)" : String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (ax.Gb.l.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        ax.Gb.l.f(collection, "elements");
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int g();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ax.Gb.f.a(this);
    }

    public String toString() {
        return y.L(this, ", ", "[", "]", 0, null, new ax.Fb.l() { // from class: ax.tb.a
            @Override // ax.Fb.l
            public final Object invoke(Object obj) {
                CharSequence i;
                i = AbstractC3126b.i(AbstractC3126b.this, obj);
                return i;
            }
        }, 24, null);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ax.Gb.l.f(tArr, "array");
        return (T[]) ax.Gb.f.b(this, tArr);
    }
}
