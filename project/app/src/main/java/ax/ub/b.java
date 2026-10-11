/*
 * Decompiled with CFR 0.152.
 */
package ax.ub;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.e;
import ax.tb.i;
import ax.tb.o;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public final class b<E>
extends e<E>
implements List<E>,
RandomAccess,
Serializable,
ax.Hb.b {
    private static final b e0 = new b(null);
    private static final b f0;
    private int c0;
    private boolean d0;
    private E[] q;

    static {
        b b8 = new b(0);
        b8.d0 = true;
        f0 = b8;
    }

    public b() {
        this(0, 1, null);
    }

    public b(int n8) {
        this.q = ax.ub.c.d(n8);
    }

    public /* synthetic */ b(int n8, int n9, g g8) {
        if ((n9 & 1) != 0) {
            n8 = 10;
        }
        this(n8);
    }

    private final void A(int n8) {
        if (n8 >= 0) {
            E[] EArray = this.q;
            if (n8 > EArray.length) {
                n8 = ax.tb.c.q.e(EArray.length, n8);
                this.q = ax.ub.c.e(this.q, n8);
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void B(int n8) {
        this.A(this.c0 + n8);
    }

    private final void C(int n8, int n9) {
        this.B(n9);
        E[] EArray = this.q;
        i.g(EArray, EArray, n8 + n9, n8, this.c0);
        this.c0 += n9;
    }

    private final void D() {
        ++this.modCount;
    }

    private final E E(int n8) {
        this.D();
        E[] EArray = this.q;
        E e8 = EArray[n8];
        i.g(EArray, EArray, n8, n8 + 1, this.c0);
        ax.ub.c.f(this.q, this.c0 - 1);
        --this.c0;
        return e8;
    }

    private final void G(int n8, int n9) {
        if (n9 > 0) {
            this.D();
        }
        E[] EArray = this.q;
        i.g(EArray, EArray, n8, n8 + n9, this.c0);
        EArray = this.q;
        n8 = this.c0;
        ax.ub.c.g(EArray, n8 - n9, n8);
        this.c0 -= n9;
    }

    private final int I(int n8, int n9, Collection<? extends E> EArray, boolean bl) {
        int n10 = 0;
        int n11 = 0;
        while (n10 < n9) {
            E[] EArray2 = this.q;
            int n12 = n8 + n10;
            if (EArray.contains(EArray2[n12]) == bl) {
                EArray2 = this.q;
                ++n10;
                EArray2[n11 + n8] = EArray2[n12];
                ++n11;
                continue;
            }
            ++n10;
        }
        n10 = n9 - n11;
        EArray = this.q;
        i.g(EArray, EArray, n8 + n11, n9 + n8, this.c0);
        EArray = this.q;
        n8 = this.c0;
        ax.ub.c.g(EArray, n8 - n10, n8);
        if (n10 > 0) {
            this.D();
        }
        this.c0 -= n10;
        return n10;
    }

    private final void u(int n8, Collection<? extends E> object, int n9) {
        this.D();
        this.C(n8, n9);
        object = object.iterator();
        for (int i8 = 0; i8 < n9; ++i8) {
            this.q[n8 + i8] = object.next();
        }
    }

    private final void w(int n8, E e8) {
        this.D();
        this.C(n8, 1);
        this.q[n8] = e8;
    }

    private final void y() {
        if (!this.d0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final boolean z(List<?> list) {
        return ax.ub.c.a(this.q, 0, this.c0, list);
    }

    @Override
    public void add(int n8, E e8) {
        this.y();
        ax.tb.c.q.c(n8, this.c0);
        this.w(n8, e8);
    }

    @Override
    public boolean add(E e8) {
        this.y();
        this.w(this.c0, e8);
        return true;
    }

    @Override
    public boolean addAll(int n8, Collection<? extends E> collection) {
        l.f(collection, "elements");
        this.y();
        ax.tb.c.q.c(n8, this.c0);
        int n9 = collection.size();
        this.u(n8, collection, n9);
        return n9 > 0;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        this.y();
        int n8 = collection.size();
        this.u(this.c0, collection, n8);
        return n8 > 0;
    }

    @Override
    public void clear() {
        this.y();
        this.G(0, this.c0);
    }

    @Override
    public int e() {
        return this.c0;
    }

    @Override
    public boolean equals(Object object) {
        return object == this || object instanceof List && this.z((List)object);
        {
        }
    }

    @Override
    public E g(int n8) {
        this.y();
        ax.tb.c.q.b(n8, this.c0);
        return this.E(n8);
    }

    @Override
    public E get(int n8) {
        ax.tb.c.q.b(n8, this.c0);
        return this.q[n8];
    }

    @Override
    public int hashCode() {
        return ax.ub.c.b(this.q, 0, this.c0);
    }

    @Override
    public int indexOf(Object object) {
        for (int i8 = 0; i8 < this.c0; ++i8) {
            if (!l.a(this.q[i8], object)) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.c0 == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return this.listIterator(0);
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i8 = this.c0 - 1; i8 >= 0; --i8) {
            if (!l.a(this.q[i8], object)) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return this.listIterator(0);
    }

    @Override
    public ListIterator<E> listIterator(int n8) {
        ax.tb.c.q.c(n8, this.c0);
        return new c(this, n8);
    }

    @Override
    public boolean remove(Object object) {
        this.y();
        int n8 = this.indexOf(object);
        if (n8 >= 0) {
            this.remove(n8);
        }
        return n8 >= 0;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.y();
        return this.I(0, this.c0, collection, false) > 0;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.y();
        return this.I(0, this.c0, collection, true) > 0;
    }

    @Override
    public E set(int n8, E e8) {
        this.y();
        ax.tb.c.q.b(n8, this.c0);
        E[] EArray = this.q;
        E e9 = EArray[n8];
        EArray[n8] = e8;
        return e9;
    }

    @Override
    public List<E> subList(int n8, int n9) {
        ax.tb.c.q.d(n8, n9, this.c0);
        return new a<E>(this.q, n8, n9 - n8, null, this);
    }

    @Override
    public Object[] toArray() {
        return i.l(this.q, 0, this.c0);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        l.f(TArray, "array");
        int n8 = TArray.length;
        int n9 = this.c0;
        if (n8 < n9) {
            TArray = Arrays.copyOfRange(this.q, 0, n9, TArray.getClass());
            l.e(TArray, "copyOfRange(...)");
            return TArray;
        }
        i.g(this.q, TArray, 0, 0, n9);
        return o.e(this.c0, TArray);
    }

    @Override
    public String toString() {
        return ax.ub.c.c(this.q, 0, this.c0, this);
    }

    public final List<E> x() {
        this.y();
        this.d0 = true;
        if (this.c0 > 0) {
            return this;
        }
        return f0;
    }

    public static final class ax.ub.b$a<E>
    extends e<E>
    implements List<E>,
    RandomAccess,
    Serializable,
    ax.Hb.b {
        private final int c0;
        private int d0;
        private final ax.ub.b$a<E> e0;
        private final b<E> f0;
        private E[] q;

        public ax.ub.b$a(E[] EArray, int n8, int n9, ax.ub.b$a<E> a8, b<E> b8) {
            l.f(EArray, "backing");
            l.f(b8, "root");
            this.q = EArray;
            this.c0 = n8;
            this.d0 = n9;
            this.e0 = a8;
            this.f0 = b8;
            this.modCount = ((b)b8).modCount;
        }

        private final int A(int n8, int n9, Collection<? extends E> collection, boolean bl) {
            ax.ub.b$a<E> a8 = this.e0;
            n8 = a8 != null ? super.A(n8, n9, collection, bl) : ((b)this.f0).I(n8, n9, collection, bl);
            if (n8 > 0) {
                this.x();
            }
            this.d0 -= n8;
            return n8;
        }

        private final void q(int n8, Collection<? extends E> collection, int n9) {
            this.x();
            ax.ub.b$a<E> a8 = this.e0;
            if (a8 != null) {
                super.q(n8, collection, n9);
            } else {
                ((b)this.f0).u(n8, collection, n9);
            }
            this.q = ((b)this.f0).q;
            this.d0 += n9;
        }

        private final void r(int n8, E e8) {
            this.x();
            ax.ub.b$a<E> a8 = this.e0;
            if (a8 != null) {
                super.r(n8, e8);
            } else {
                ((b)this.f0).w(n8, e8);
            }
            this.q = ((b)this.f0).q;
            ++this.d0;
        }

        private final void s() {
            if (((b)this.f0).modCount == this.modCount) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        private final void t() {
            if (!this.w()) {
                return;
            }
            throw new UnsupportedOperationException();
        }

        private final boolean u(List<?> list) {
            return ax.ub.c.a(this.q, this.c0, this.d0, list);
        }

        private final boolean w() {
            return ((b)this.f0).d0;
        }

        private final void x() {
            ++this.modCount;
        }

        private final E y(int n8) {
            this.x();
            Object object = this.e0;
            object = object != null ? super.y(n8) : ((b)this.f0).E(n8);
            --this.d0;
            return (E)object;
        }

        private final void z(int n8, int n9) {
            ax.ub.b$a<E> a8;
            if (n9 > 0) {
                this.x();
            }
            if ((a8 = this.e0) != null) {
                super.z(n8, n9);
            } else {
                ((b)this.f0).G(n8, n9);
            }
            this.d0 -= n9;
        }

        @Override
        public void add(int n8, E e8) {
            this.t();
            this.s();
            ax.tb.c.q.c(n8, this.d0);
            this.r(this.c0 + n8, e8);
        }

        @Override
        public boolean add(E e8) {
            this.t();
            this.s();
            this.r(this.c0 + this.d0, e8);
            return true;
        }

        @Override
        public boolean addAll(int n8, Collection<? extends E> collection) {
            l.f(collection, "elements");
            this.t();
            this.s();
            ax.tb.c.q.c(n8, this.d0);
            int n9 = collection.size();
            this.q(this.c0 + n8, collection, n9);
            return n9 > 0;
        }

        @Override
        public boolean addAll(Collection<? extends E> collection) {
            l.f(collection, "elements");
            this.t();
            this.s();
            int n8 = collection.size();
            this.q(this.c0 + this.d0, collection, n8);
            return n8 > 0;
        }

        @Override
        public void clear() {
            this.t();
            this.s();
            this.z(this.c0, this.d0);
        }

        @Override
        public int e() {
            this.s();
            return this.d0;
        }

        @Override
        public boolean equals(Object object) {
            this.s();
            return object == this || object instanceof List && this.u((List)object);
            {
            }
        }

        @Override
        public E g(int n8) {
            this.t();
            this.s();
            ax.tb.c.q.b(n8, this.d0);
            return this.y(this.c0 + n8);
        }

        @Override
        public E get(int n8) {
            this.s();
            ax.tb.c.q.b(n8, this.d0);
            return this.q[this.c0 + n8];
        }

        @Override
        public int hashCode() {
            this.s();
            return ax.ub.c.b(this.q, this.c0, this.d0);
        }

        @Override
        public int indexOf(Object object) {
            this.s();
            for (int i8 = 0; i8 < this.d0; ++i8) {
                if (!l.a(this.q[this.c0 + i8], object)) continue;
                return i8;
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            this.s();
            return this.d0 == 0;
        }

        @Override
        public Iterator<E> iterator() {
            return this.listIterator(0);
        }

        @Override
        public int lastIndexOf(Object object) {
            this.s();
            for (int i8 = this.d0 - 1; i8 >= 0; --i8) {
                if (!l.a(this.q[this.c0 + i8], object)) continue;
                return i8;
            }
            return -1;
        }

        @Override
        public ListIterator<E> listIterator() {
            return this.listIterator(0);
        }

        @Override
        public ListIterator<E> listIterator(int n8) {
            this.s();
            ax.tb.c.q.c(n8, this.d0);
            return new a(this, n8);
        }

        @Override
        public boolean remove(Object object) {
            this.t();
            this.s();
            int n8 = this.indexOf(object);
            if (n8 >= 0) {
                this.remove(n8);
            }
            return n8 >= 0;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            l.f(collection, "elements");
            this.t();
            this.s();
            return this.A(this.c0, this.d0, collection, false) > 0;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            l.f(collection, "elements");
            this.t();
            this.s();
            return this.A(this.c0, this.d0, collection, true) > 0;
        }

        @Override
        public E set(int n8, E e8) {
            this.t();
            this.s();
            ax.tb.c.q.b(n8, this.d0);
            E[] EArray = this.q;
            int n9 = this.c0;
            E e9 = EArray[n9 + n8];
            EArray[n9 + n8] = e8;
            return e9;
        }

        @Override
        public List<E> subList(int n8, int n9) {
            ax.tb.c.q.d(n8, n9, this.d0);
            return new ax.ub.b$a<E>(this.q, this.c0 + n8, n9 - n8, this, this.f0);
        }

        @Override
        public Object[] toArray() {
            this.s();
            E[] EArray = this.q;
            int n8 = this.c0;
            return i.l(EArray, n8, this.d0 + n8);
        }

        @Override
        public <T> T[] toArray(T[] TArray) {
            l.f(TArray, "array");
            this.s();
            int n8 = TArray.length;
            int n9 = this.d0;
            if (n8 < n9) {
                E[] EArray = this.q;
                n8 = this.c0;
                TArray = Arrays.copyOfRange(EArray, n8, n9 + n8, TArray.getClass());
                l.e(TArray, "copyOfRange(...)");
                return TArray;
            }
            E[] EArray = this.q;
            n8 = this.c0;
            i.g(EArray, TArray, 0, n8, n9 + n8);
            return o.e(this.d0, TArray);
        }

        @Override
        public String toString() {
            this.s();
            return ax.ub.c.c(this.q, this.c0, this.d0, this);
        }

        private static final class a<E>
        implements ListIterator<E>,
        ax.Hb.a {
            private int c0;
            private int d0;
            private int e0;
            private final ax.ub.b$a<E> q;

            public a(ax.ub.b$a<E> a8, int n8) {
                l.f(a8, "list");
                this.q = a8;
                this.c0 = n8;
                this.d0 = -1;
                this.e0 = ((ax.ub.b$a)a8).modCount;
            }

            private final void b() {
                if (((ax.ub.b$a)this.q).f0.modCount == this.e0) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override
            public void add(E e8) {
                this.b();
                ax.ub.b$a<E> a8 = this.q;
                int n8 = this.c0;
                this.c0 = n8 + 1;
                a8.add(n8, e8);
                this.d0 = -1;
                this.e0 = ((ax.ub.b$a)this.q).modCount;
            }

            @Override
            public boolean hasNext() {
                return this.c0 < ((ax.ub.b$a)this.q).d0;
            }

            @Override
            public boolean hasPrevious() {
                return this.c0 > 0;
            }

            @Override
            public E next() {
                this.b();
                if (this.c0 < ((ax.ub.b$a)this.q).d0) {
                    int n8 = this.c0;
                    this.c0 = n8 + 1;
                    this.d0 = n8;
                    return (E)((ax.ub.b$a)this.q).q[((ax.ub.b$a)this.q).c0 + this.d0];
                }
                throw new NoSuchElementException();
            }

            @Override
            public int nextIndex() {
                return this.c0;
            }

            @Override
            public E previous() {
                this.b();
                int n8 = this.c0;
                if (n8 > 0) {
                    this.c0 = --n8;
                    this.d0 = n8;
                    return (E)((ax.ub.b$a)this.q).q[((ax.ub.b$a)this.q).c0 + this.d0];
                }
                throw new NoSuchElementException();
            }

            @Override
            public int previousIndex() {
                return this.c0 - 1;
            }

            @Override
            public void remove() {
                this.b();
                int n8 = this.d0;
                if (n8 != -1) {
                    this.q.remove(n8);
                    this.c0 = this.d0;
                    this.d0 = -1;
                    this.e0 = ((ax.ub.b$a)this.q).modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }

            @Override
            public void set(E e8) {
                this.b();
                int n8 = this.d0;
                if (n8 != -1) {
                    this.q.set(n8, e8);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }
    }

    private static final class c<E>
    implements ListIterator<E>,
    ax.Hb.a {
        private int c0;
        private int d0;
        private int e0;
        private final b<E> q;

        public c(b<E> b8, int n8) {
            l.f(b8, "list");
            this.q = b8;
            this.c0 = n8;
            this.d0 = -1;
            this.e0 = ((b)b8).modCount;
        }

        private final void b() {
            if (((b)this.q).modCount == this.e0) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override
        public void add(E e8) {
            this.b();
            b<E> b8 = this.q;
            int n8 = this.c0;
            this.c0 = n8 + 1;
            b8.add(n8, e8);
            this.d0 = -1;
            this.e0 = ((b)this.q).modCount;
        }

        @Override
        public boolean hasNext() {
            return this.c0 < ((b)this.q).c0;
        }

        @Override
        public boolean hasPrevious() {
            return this.c0 > 0;
        }

        @Override
        public E next() {
            this.b();
            if (this.c0 < ((b)this.q).c0) {
                int n8 = this.c0;
                this.c0 = n8 + 1;
                this.d0 = n8;
                return (E)((b)this.q).q[this.d0];
            }
            throw new NoSuchElementException();
        }

        @Override
        public int nextIndex() {
            return this.c0;
        }

        @Override
        public E previous() {
            this.b();
            int n8 = this.c0;
            if (n8 > 0) {
                this.c0 = --n8;
                this.d0 = n8;
                return (E)((b)this.q).q[this.d0];
            }
            throw new NoSuchElementException();
        }

        @Override
        public int previousIndex() {
            return this.c0 - 1;
        }

        @Override
        public void remove() {
            this.b();
            int n8 = this.d0;
            if (n8 != -1) {
                this.q.remove(n8);
                this.c0 = this.d0;
                this.d0 = -1;
                this.e0 = ((b)this.q).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }

        @Override
        public void set(E e8) {
            this.b();
            int n8 = this.d0;
            if (n8 != -1) {
                this.q.set(n8, e8);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }
}

