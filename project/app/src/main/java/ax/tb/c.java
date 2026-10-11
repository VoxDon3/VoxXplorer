/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.g;
import ax.Gb.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public abstract class c<E>
extends ax.tb.b<E>
implements List<E>,
ax.Hb.a {
    public static final a q = new a(null);

    protected c() {
    }

    @Override
    public void add(int n8, E e8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(int n8, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        return q.f(this, (Collection)object);
    }

    @Override
    public abstract E get(int var1);

    @Override
    public int hashCode() {
        return q.g(this);
    }

    @Override
    public int indexOf(Object object) {
        Iterator iterator = this.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            if (l.a(iterator.next(), object)) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new b(this);
    }

    @Override
    public int lastIndexOf(Object object) {
        ListIterator listIterator = this.listIterator(this.size());
        while (listIterator.hasPrevious()) {
            if (!l.a(listIterator.previous(), object)) continue;
            return listIterator.nextIndex();
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new c(this, 0);
    }

    @Override
    public ListIterator<E> listIterator(int n8) {
        return new c(this, n8);
    }

    @Override
    public E remove(int n8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public E set(int n8, E e8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public List<E> subList(int n8, int n9) {
        return new d(this, n8, n9);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a(int n8, int n9, int n10) {
            if (n8 >= 0 && n9 <= n10) {
                if (n8 <= n9) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("startIndex: ");
                stringBuilder.append(n8);
                stringBuilder.append(" > endIndex: ");
                stringBuilder.append(n9);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("startIndex: ");
            stringBuilder.append(n8);
            stringBuilder.append(", endIndex: ");
            stringBuilder.append(n9);
            stringBuilder.append(", size: ");
            stringBuilder.append(n10);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        public final void b(int n8, int n9) {
            if (n8 >= 0 && n8 < n9) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("index: ");
            stringBuilder.append(n8);
            stringBuilder.append(", size: ");
            stringBuilder.append(n9);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        public final void c(int n8, int n9) {
            if (n8 >= 0 && n8 <= n9) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("index: ");
            stringBuilder.append(n8);
            stringBuilder.append(", size: ");
            stringBuilder.append(n9);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        public final void d(int n8, int n9, int n10) {
            if (n8 >= 0 && n9 <= n10) {
                if (n8 <= n9) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fromIndex: ");
                stringBuilder.append(n8);
                stringBuilder.append(" > toIndex: ");
                stringBuilder.append(n9);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fromIndex: ");
            stringBuilder.append(n8);
            stringBuilder.append(", toIndex: ");
            stringBuilder.append(n9);
            stringBuilder.append(", size: ");
            stringBuilder.append(n10);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        public final int e(int n8, int n9) {
            int n10;
            n8 = n10 = n8 + (n8 >> 1);
            if (n10 - n9 < 0) {
                n8 = n9;
            }
            if (n8 - 0x7FFFFFF7 > 0) {
                if (n9 > 0x7FFFFFF7) {
                    return Integer.MAX_VALUE;
                }
                return 0x7FFFFFF7;
            }
            return n8;
        }

        public final boolean f(Collection<?> object, Collection<?> object2) {
            l.f(object, "c");
            l.f(object2, "other");
            if (object.size() != object2.size()) {
                return false;
            }
            object2 = object2.iterator();
            object = object.iterator();
            while (object.hasNext()) {
                if (l.a(object.next(), object2.next())) continue;
                return false;
            }
            return true;
        }

        public final int g(Collection<?> object) {
            l.f(object, "c");
            object = object.iterator();
            int n8 = 1;
            while (object.hasNext()) {
                Object e8 = object.next();
                int n9 = e8 != null ? e8.hashCode() : 0;
                n8 = n8 * 31 + n9;
            }
            return n8;
        }
    }

    private class b
    implements Iterator<E>,
    ax.Hb.a {
        final c<E> c0;
        private int q;

        public b(c c8) {
            this.c0 = c8;
        }

        protected final int b() {
            return this.q;
        }

        protected final void c(int n8) {
            this.q = n8;
        }

        @Override
        public boolean hasNext() {
            return this.q < this.c0.size();
        }

        @Override
        public E next() {
            if (this.hasNext()) {
                c c8 = this.c0;
                int n8 = this.q;
                this.q = n8 + 1;
                return c8.get(n8);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private class c
    extends b
    implements ListIterator<E>,
    ax.Hb.a {
        final c<E> d0;

        public c(c c8, int n8) {
            this.d0 = c8;
            super(c8);
            q.c(n8, c8.size());
            this.c(n8);
        }

        @Override
        public void add(E e8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override
        public boolean hasPrevious() {
            return this.b() > 0;
        }

        @Override
        public int nextIndex() {
            return this.b();
        }

        @Override
        public E previous() {
            if (this.hasPrevious()) {
                c c8 = this.d0;
                this.c(this.b() - 1);
                return c8.get(this.b());
            }
            throw new NoSuchElementException();
        }

        @Override
        public int previousIndex() {
            return this.b() - 1;
        }

        @Override
        public void set(E e8) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private static final class d<E>
    extends c<E>
    implements RandomAccess {
        private final c<E> c0;
        private final int d0;
        private int e0;

        public d(c<? extends E> c8, int n8, int n9) {
            l.f(c8, "list");
            this.c0 = c8;
            this.d0 = n8;
            q.d(n8, n9, c8.size());
            this.e0 = n9 - n8;
        }

        @Override
        public int g() {
            return this.e0;
        }

        @Override
        public E get(int n8) {
            q.b(n8, this.e0);
            return this.c0.get(this.d0 + n8);
        }
    }
}

