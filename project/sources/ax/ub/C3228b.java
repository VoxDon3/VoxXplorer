package ax.ub;

import ax.Gb.l;
import ax.tb.AbstractC3127c;
import ax.tb.AbstractC3129e;
import ax.tb.C3133i;
import ax.tb.C3139o;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: ax.ub.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3228b<E> extends AbstractC3129e<E> implements List<E>, RandomAccess, Serializable, ax.Hb.b {
    private static final C0473b e0 = new C0473b(null);
    private static final C3228b f0;
    private int c0;
    private boolean d0;
    private E[] q;

    /* renamed from: ax.ub.b$a */
    public static final class a<E> extends AbstractC3129e<E> implements List<E>, RandomAccess, Serializable, ax.Hb.b {
        private final int c0;
        private int d0;
        private final a<E> e0;
        private final C3228b<E> f0;
        private E[] q;

        /* renamed from: ax.ub.b$a$a, reason: collision with other inner class name */
        private static final class C0472a<E> implements ListIterator<E>, ax.Hb.a {
            private int c0;
            private int d0;
            private int e0;
            private final a<E> q;

            public C0472a(a<E> aVar, int i) {
                l.f(aVar, "list");
                this.q = aVar;
                this.c0 = i;
                this.d0 = -1;
                this.e0 = ((AbstractList) aVar).modCount;
            }

            private final void b() {
                if (((AbstractList) ((a) this.q).f0).modCount != this.e0) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E e) {
                b();
                a<E> aVar = this.q;
                int i = this.c0;
                this.c0 = i + 1;
                aVar.add(i, e);
                this.d0 = -1;
                this.e0 = ((AbstractList) this.q).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.c0 < ((a) this.q).d0;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.c0 > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                b();
                if (this.c0 >= ((a) this.q).d0) {
                    throw new NoSuchElementException();
                }
                int i = this.c0;
                this.c0 = i + 1;
                this.d0 = i;
                return (E) ((a) this.q).q[((a) this.q).c0 + this.d0];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.c0;
            }

            @Override // java.util.ListIterator
            public E previous() {
                b();
                int i = this.c0;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.c0 = i2;
                this.d0 = i2;
                return (E) ((a) this.q).q[((a) this.q).c0 + this.d0];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.c0 - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i = this.d0;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.q.remove(i);
                this.c0 = this.d0;
                this.d0 = -1;
                this.e0 = ((AbstractList) this.q).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E e) {
                b();
                int i = this.d0;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.q.set(i, e);
            }
        }

        public a(E[] eArr, int i, int i2, a<E> aVar, C3228b<E> c3228b) {
            l.f(eArr, "backing");
            l.f(c3228b, "root");
            this.q = eArr;
            this.c0 = i;
            this.d0 = i2;
            this.e0 = aVar;
            this.f0 = c3228b;
            ((AbstractList) this).modCount = ((AbstractList) c3228b).modCount;
        }

        private final int A(int i, int i2, Collection<? extends E> collection, boolean z) {
            a<E> aVar = this.e0;
            int A = aVar != null ? aVar.A(i, i2, collection, z) : this.f0.I(i, i2, collection, z);
            if (A > 0) {
                x();
            }
            this.d0 -= A;
            return A;
        }

        private final void q(int i, Collection<? extends E> collection, int i2) {
            x();
            a<E> aVar = this.e0;
            if (aVar != null) {
                aVar.q(i, collection, i2);
            } else {
                this.f0.u(i, collection, i2);
            }
            this.q = (E[]) ((C3228b) this.f0).q;
            this.d0 += i2;
        }

        private final void r(int i, E e) {
            x();
            a<E> aVar = this.e0;
            if (aVar != null) {
                aVar.r(i, e);
            } else {
                this.f0.w(i, e);
            }
            this.q = (E[]) ((C3228b) this.f0).q;
            this.d0++;
        }

        private final void s() {
            if (((AbstractList) this.f0).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void t() {
            if (w()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean u(List<?> list) {
            boolean h;
            h = C3229c.h(this.q, this.c0, this.d0, list);
            return h;
        }

        private final boolean w() {
            return ((C3228b) this.f0).d0;
        }

        private final void x() {
            ((AbstractList) this).modCount++;
        }

        private final E y(int i) {
            x();
            a<E> aVar = this.e0;
            this.d0--;
            return aVar != null ? aVar.y(i) : (E) this.f0.E(i);
        }

        private final void z(int i, int i2) {
            if (i2 > 0) {
                x();
            }
            a<E> aVar = this.e0;
            if (aVar != null) {
                aVar.z(i, i2);
            } else {
                this.f0.G(i, i2);
            }
            this.d0 -= i2;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e) {
            t();
            s();
            r(this.c0 + this.d0, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> collection) {
            l.f(collection, "elements");
            t();
            s();
            int size = collection.size();
            q(this.c0 + this.d0, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            t();
            s();
            z(this.c0, this.d0);
        }

        @Override // ax.tb.AbstractC3129e
        public int e() {
            s();
            return this.d0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            s();
            if (obj != this) {
                return (obj instanceof List) && u((List) obj);
            }
            return true;
        }

        @Override // ax.tb.AbstractC3129e
        public E g(int i) {
            t();
            s();
            AbstractC3127c.q.b(i, this.d0);
            return y(this.c0 + i);
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            s();
            AbstractC3127c.q.b(i, this.d0);
            return this.q[this.c0 + i];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i;
            s();
            i = C3229c.i(this.q, this.c0, this.d0);
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            s();
            for (int i = 0; i < this.d0; i++) {
                if (l.a(this.q[this.c0 + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            s();
            return this.d0 == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            s();
            for (int i = this.d0 - 1; i >= 0; i--) {
                if (l.a(this.q[this.c0 + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            t();
            s();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            return indexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> collection) {
            l.f(collection, "elements");
            t();
            s();
            return A(this.c0, this.d0, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> collection) {
            l.f(collection, "elements");
            t();
            s();
            return A(this.c0, this.d0, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i, E e) {
            t();
            s();
            AbstractC3127c.q.b(i, this.d0);
            E[] eArr = this.q;
            int i2 = this.c0;
            E e2 = eArr[i2 + i];
            eArr[i2 + i] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int i, int i2) {
            AbstractC3127c.q.d(i, i2, this.d0);
            return new a(this.q, this.c0 + i, i2 - i, this, this.f0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] tArr) {
            l.f(tArr, "array");
            s();
            int length = tArr.length;
            int i = this.d0;
            if (length >= i) {
                E[] eArr = this.q;
                int i2 = this.c0;
                C3133i.g(eArr, tArr, 0, i2, i + i2);
                return (T[]) C3139o.e(this.d0, tArr);
            }
            E[] eArr2 = this.q;
            int i3 = this.c0;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr2, i3, i + i3, tArr.getClass());
            l.e(tArr2, "copyOfRange(...)");
            return tArr2;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String j;
            s();
            j = C3229c.j(this.q, this.c0, this.d0, this);
            return j;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
            s();
            AbstractC3127c.q.c(i, this.d0);
            return new C0472a(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, E e) {
            t();
            s();
            AbstractC3127c.q.c(i, this.d0);
            r(this.c0 + i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            l.f(collection, "elements");
            t();
            s();
            AbstractC3127c.q.c(i, this.d0);
            int size = collection.size();
            q(this.c0 + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            s();
            E[] eArr = this.q;
            int i = this.c0;
            return C3133i.l(eArr, i, this.d0 + i);
        }
    }

    /* renamed from: ax.ub.b$b, reason: collision with other inner class name */
    private static final class C0473b {
        public /* synthetic */ C0473b(ax.Gb.g gVar) {
            this();
        }

        private C0473b() {
        }
    }

    /* renamed from: ax.ub.b$c */
    private static final class c<E> implements ListIterator<E>, ax.Hb.a {
        private int c0;
        private int d0;
        private int e0;
        private final C3228b<E> q;

        public c(C3228b<E> c3228b, int i) {
            l.f(c3228b, "list");
            this.q = c3228b;
            this.c0 = i;
            this.d0 = -1;
            this.e0 = ((AbstractList) c3228b).modCount;
        }

        private final void b() {
            if (((AbstractList) this.q).modCount != this.e0) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            b();
            C3228b<E> c3228b = this.q;
            int i = this.c0;
            this.c0 = i + 1;
            c3228b.add(i, e);
            this.d0 = -1;
            this.e0 = ((AbstractList) this.q).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.c0 < ((C3228b) this.q).c0;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.c0 > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (this.c0 >= ((C3228b) this.q).c0) {
                throw new NoSuchElementException();
            }
            int i = this.c0;
            this.c0 = i + 1;
            this.d0 = i;
            return (E) ((C3228b) this.q).q[this.d0];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.c0;
        }

        @Override // java.util.ListIterator
        public E previous() {
            b();
            int i = this.c0;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.c0 = i2;
            this.d0 = i2;
            return (E) ((C3228b) this.q).q[this.d0];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.c0 - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i = this.d0;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.q.remove(i);
            this.c0 = this.d0;
            this.d0 = -1;
            this.e0 = ((AbstractList) this.q).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            b();
            int i = this.d0;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.q.set(i, e);
        }
    }

    static {
        C3228b c3228b = new C3228b(0);
        c3228b.d0 = true;
        f0 = c3228b;
    }

    public C3228b() {
        this(0, 1, null);
    }

    private final void A(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.q;
        if (i > eArr.length) {
            this.q = (E[]) C3229c.e(this.q, AbstractC3127c.q.e(eArr.length, i));
        }
    }

    private final void B(int i) {
        A(this.c0 + i);
    }

    private final void C(int i, int i2) {
        B(i2);
        E[] eArr = this.q;
        C3133i.g(eArr, eArr, i + i2, i, this.c0);
        this.c0 += i2;
    }

    private final void D() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E E(int i) {
        D();
        E[] eArr = this.q;
        E e = eArr[i];
        C3133i.g(eArr, eArr, i, i + 1, this.c0);
        C3229c.f(this.q, this.c0 - 1);
        this.c0--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i, int i2) {
        if (i2 > 0) {
            D();
        }
        E[] eArr = this.q;
        C3133i.g(eArr, eArr, i, i + i2, this.c0);
        E[] eArr2 = this.q;
        int i3 = this.c0;
        C3229c.g(eArr2, i3 - i2, i3);
        this.c0 -= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int I(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.q[i5]) == z) {
                E[] eArr = this.q;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.q;
        C3133i.g(eArr2, eArr2, i + i4, i2 + i, this.c0);
        E[] eArr3 = this.q;
        int i7 = this.c0;
        C3229c.g(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            D();
        }
        this.c0 -= i6;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i, Collection<? extends E> collection, int i2) {
        D();
        C(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.q[i + i3] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int i, E e) {
        D();
        C(i, 1);
        this.q[i] = e;
    }

    private final void y() {
        if (this.d0) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean z(List<?> list) {
        boolean h;
        h = C3229c.h(this.q, 0, this.c0, list);
        return h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        y();
        w(this.c0, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        y();
        int size = collection.size();
        u(this.c0, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        y();
        G(0, this.c0);
    }

    @Override // ax.tb.AbstractC3129e
    public int e() {
        return this.c0;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && z((List) obj);
        }
        return true;
    }

    @Override // ax.tb.AbstractC3129e
    public E g(int i) {
        y();
        AbstractC3127c.q.b(i, this.c0);
        return E(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC3127c.q.b(i, this.c0);
        return this.q[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i;
        i = C3229c.i(this.q, 0, this.c0);
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.c0; i++) {
            if (l.a(this.q[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.c0 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.c0 - 1; i >= 0; i--) {
            if (l.a(this.q[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        y();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        l.f(collection, "elements");
        y();
        return I(0, this.c0, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        l.f(collection, "elements");
        y();
        return I(0, this.c0, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        y();
        AbstractC3127c.q.b(i, this.c0);
        E[] eArr = this.q;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        AbstractC3127c.q.d(i, i2, this.c0);
        return new a(this.q, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        l.f(tArr, "array");
        int length = tArr.length;
        int i = this.c0;
        if (length >= i) {
            C3133i.g(this.q, tArr, 0, 0, i);
            return (T[]) C3139o.e(this.c0, tArr);
        }
        T[] tArr2 = (T[]) Arrays.copyOfRange(this.q, 0, i, tArr.getClass());
        l.e(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j;
        j = C3229c.j(this.q, 0, this.c0, this);
        return j;
    }

    public final List<E> x() {
        y();
        this.d0 = true;
        return this.c0 > 0 ? this : f0;
    }

    public C3228b(int i) {
        this.q = (E[]) C3229c.d(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        AbstractC3127c.q.c(i, this.c0);
        return new c(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        y();
        AbstractC3127c.q.c(i, this.c0);
        w(i, e);
    }

    public /* synthetic */ C3228b(int i, int i2, ax.Gb.g gVar) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        l.f(collection, "elements");
        y();
        AbstractC3127c.q.c(i, this.c0);
        int size = collection.size();
        u(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return C3133i.l(this.q, 0, this.c0);
    }
}
