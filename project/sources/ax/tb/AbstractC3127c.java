package ax.tb;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: ax.tb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3127c<E> extends AbstractC3126b<E> implements List<E>, ax.Hb.a {
    public static final a q = new a(null);

    /* renamed from: ax.tb.c$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final void a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
        }

        public final void b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        public final int e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 <= 0) {
                return i3;
            }
            if (i2 > 2147483639) {
                return SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            return 2147483639;
        }

        public final boolean f(Collection<?> collection, Collection<?> collection2) {
            ax.Gb.l.f(collection, "c");
            ax.Gb.l.f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!ax.Gb.l.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection<?> collection) {
            ax.Gb.l.f(collection, "c");
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        private a() {
        }
    }

    /* renamed from: ax.tb.c$b */
    private class b implements Iterator<E>, ax.Hb.a {
        private int q;

        public b() {
        }

        protected final int b() {
            return this.q;
        }

        protected final void c(int i) {
            this.q = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q < AbstractC3127c.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC3127c<E> abstractC3127c = AbstractC3127c.this;
            int i = this.q;
            this.q = i + 1;
            return abstractC3127c.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ax.tb.c$c, reason: collision with other inner class name */
    private class C0465c extends AbstractC3127c<E>.b implements ListIterator<E>, ax.Hb.a {
        public C0465c(int i) {
            super();
            AbstractC3127c.q.c(i, AbstractC3127c.this.size());
            c(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC3127c<E> abstractC3127c = AbstractC3127c.this;
            c(b() - 1);
            return abstractC3127c.get(b());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ax.tb.c$d */
    private static final class d<E> extends AbstractC3127c<E> implements RandomAccess {
        private final AbstractC3127c<E> c0;
        private final int d0;
        private int e0;

        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC3127c<? extends E> abstractC3127c, int i, int i2) {
            ax.Gb.l.f(abstractC3127c, "list");
            this.c0 = abstractC3127c;
            this.d0 = i;
            AbstractC3127c.q.d(i, i2, abstractC3127c.size());
            this.e0 = i2 - i;
        }

        @Override // ax.tb.AbstractC3126b
        public int g() {
            return this.e0;
        }

        @Override // ax.tb.AbstractC3127c, java.util.List
        public E get(int i) {
            AbstractC3127c.q.b(i, this.e0);
            return this.c0.get(this.d0 + i);
        }
    }

    protected AbstractC3127c() {
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return q.f(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return q.g(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (ax.Gb.l.a(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (ax.Gb.l.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0465c(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C0465c(i);
    }
}
