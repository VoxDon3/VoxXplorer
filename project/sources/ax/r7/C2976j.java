package ax.r7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: ax.r7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2976j {

    /* renamed from: ax.r7.j$a */
    static class a<E> extends AbstractCollection<E> {
        final ax.q7.o<? super E> c0;
        final Collection<E> q;

        a(Collection<E> collection, ax.q7.o<? super E> oVar) {
            this.q = collection;
            this.c0 = oVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e) {
            ax.q7.n.d(this.c0.apply(e));
            return this.q.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                ax.q7.n.d(this.c0.apply(it.next()));
            }
            return this.q.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            F.i(this.q, this.c0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (C2976j.c(this.q, obj)) {
                return this.c0.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C2976j.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !F.b(this.q, this.c0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return G.j(this.q.iterator(), this.c0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.q.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.q.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.c0.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.q.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.c0.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.q.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.c0.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return I.h(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) I.h(iterator()).toArray(tArr);
        }
    }

    static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder b(int i) {
        C2975i.b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    static boolean c(Collection<?> collection, Object obj) {
        ax.q7.n.n(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
