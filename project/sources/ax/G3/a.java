package ax.G3;

import com.box.androidsdk.content.models.BoxJsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a<E extends BoxJsonObject> implements Collection<E> {
    protected final Collection<E> q = new ArrayList();

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.q.addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        this.q.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.q.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.q.containsAll(collection);
    }

    @Override // java.util.Collection
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(E e) {
        return this.q.add(e);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return this.q.equals(obj);
    }

    public E g(int i) {
        Collection<E> collection = this.q;
        if (collection instanceof List) {
            return (E) ((List) collection).get(i);
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (i == 0) {
                return it.next();
            }
            it.next();
        }
        throw new IndexOutOfBoundsException();
    }

    public String h() {
        ax.O4.a aVar = new ax.O4.a();
        for (int i = 0; i < size(); i++) {
            aVar.B(g(i).B());
        }
        return aVar.toString();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.q.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.q.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return this.q.remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.q.removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.q.retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return this.q.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.q.toArray();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.q.toArray(tArr);
    }
}
