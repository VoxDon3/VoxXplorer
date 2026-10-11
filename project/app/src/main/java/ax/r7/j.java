/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.q7.o;
import ax.r7.F;
import ax.r7.G;
import ax.r7.I;
import ax.r7.i;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public final class j {
    static boolean a(Collection<?> collection, Collection<?> object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (collection.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    static StringBuilder b(int n8) {
        i.b(n8, "size");
        return new StringBuilder((int)Math.min((long)n8 * 8L, 0x40000000L));
    }

    static boolean c(Collection<?> collection, Object object) {
        n.n(collection);
        try {
            boolean bl = collection.contains(object);
            return bl;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    static class a<E>
    extends AbstractCollection<E> {
        final o<? super E> c0;
        final Collection<E> q;

        a(Collection<E> collection, o<? super E> o8) {
            this.q = collection;
            this.c0 = o8;
        }

        @Override
        public boolean add(E e8) {
            n.d(this.c0.apply(e8));
            return this.q.add(e8);
        }

        @Override
        public boolean addAll(Collection<? extends E> collection) {
            for (E e8 : collection) {
                n.d(this.c0.apply(e8));
            }
            return this.q.addAll(collection);
        }

        @Override
        public void clear() {
            F.i(this.q, this.c0);
        }

        @Override
        public boolean contains(Object object) {
            if (j.c(this.q, object)) {
                return this.c0.apply(object);
            }
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return j.a(this, collection);
        }

        @Override
        public boolean isEmpty() {
            return F.b(this.q, this.c0) ^ true;
        }

        @Override
        public Iterator<E> iterator() {
            return G.j(this.q.iterator(), this.c0);
        }

        @Override
        public boolean remove(Object object) {
            return this.contains(object) && this.q.remove(object);
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> iterator = this.q.iterator();
            boolean bl = false;
            while (iterator.hasNext()) {
                E e8 = iterator.next();
                if (!this.c0.apply(e8) || !collection.contains(e8)) continue;
                iterator.remove();
                bl = true;
            }
            return bl;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> iterator = this.q.iterator();
            boolean bl = false;
            while (iterator.hasNext()) {
                E e8 = iterator.next();
                if (!this.c0.apply(e8) || collection.contains(e8)) continue;
                iterator.remove();
                bl = true;
            }
            return bl;
        }

        @Override
        public int size() {
            Iterator<E> iterator = this.q.iterator();
            int n8 = 0;
            while (iterator.hasNext()) {
                E e8 = iterator.next();
                if (!this.c0.apply(e8)) continue;
                ++n8;
            }
            return n8;
        }

        @Override
        public Object[] toArray() {
            return I.h(this.iterator()).toArray();
        }

        @Override
        public <T> T[] toArray(T[] TArray) {
            return I.h(this.iterator()).toArray(TArray);
        }
    }
}

