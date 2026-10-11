/*
 * Decompiled with CFR 0.152.
 */
package ax.G3;

import com.box.androidsdk.content.models.BoxJsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a<E extends BoxJsonObject>
implements Collection<E> {
    protected final Collection<E> q = new ArrayList();

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return this.q.addAll(collection);
    }

    @Override
    public void clear() {
        this.q.clear();
    }

    @Override
    public boolean contains(Object object) {
        return this.q.contains(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.q.containsAll(collection);
    }

    public boolean e(E e8) {
        return this.q.add(e8);
    }

    @Override
    public boolean equals(Object object) {
        return this.q.equals(object);
    }

    public E g(int n8) {
        Collection<E> collection = this.q;
        if (collection instanceof List) {
            return (E)((BoxJsonObject)((List)collection).get(n8));
        }
        if (n8 >= 0) {
            collection = this.iterator();
            while (collection.hasNext()) {
                if (n8 == 0) {
                    return (E)((BoxJsonObject)collection.next());
                }
                collection.next();
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public String h() {
        ax.O4.a a8 = new ax.O4.a();
        for (int i8 = 0; i8 < this.size(); ++i8) {
            a8.B(((BoxJsonObject)this.g(i8)).B());
        }
        return a8.toString();
    }

    @Override
    public int hashCode() {
        return this.q.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return this.q.iterator();
    }

    @Override
    public boolean remove(Object object) {
        return this.q.remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.q.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.q.retainAll(collection);
    }

    @Override
    public int size() {
        return this.q.size();
    }

    @Override
    public Object[] toArray() {
        return this.q.toArray();
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        return this.q.toArray(TArray);
    }
}

