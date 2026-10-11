package ax.r7;

import ax.r7.AbstractC2989x;
import j$.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: ax.r7.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2991z<E> extends AbstractC2989x<E> implements List<E>, RandomAccess, j$.util.List {
    private static final k0<Object> c0 = new b(V.f0, 0);

    /* renamed from: ax.r7.z$a */
    public static final class a<E> extends AbstractC2989x.a<E> {
        public a() {
            this(4);
        }

        @Override // ax.r7.AbstractC2989x.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e) {
            super.d(e);
            return this;
        }

        public a<E> i(E... eArr) {
            super.e(eArr);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public AbstractC2991z<E> k() {
            this.c = true;
            return AbstractC2991z.q(this.a, this.b);
        }

        a(int i) {
            super(i);
        }
    }

    /* renamed from: ax.r7.z$b */
    static class b<E> extends AbstractC2967a<E> {
        private final AbstractC2991z<E> d0;

        b(AbstractC2991z<E> abstractC2991z, int i) {
            super(abstractC2991z.size(), i);
            this.d0 = abstractC2991z;
        }

        @Override // ax.r7.AbstractC2967a
        protected E b(int i) {
            return this.d0.get(i);
        }
    }

    /* renamed from: ax.r7.z$c */
    private static class c<E> extends AbstractC2991z<E> {
        private final transient AbstractC2991z<E> d0;

        c(AbstractC2991z<E> abstractC2991z) {
            this.d0 = abstractC2991z;
        }

        private int N(int i) {
            return (size() - 1) - i;
        }

        private int O(int i) {
            return size() - i;
        }

        @Override // ax.r7.AbstractC2991z
        public AbstractC2991z<E> I() {
            return this.d0;
        }

        @Override // ax.r7.AbstractC2991z, java.util.List
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public AbstractC2991z<E> subList(int i, int i2) {
            ax.q7.n.s(i, i2, size());
            return this.d0.subList(O(i2), O(i)).I();
        }

        @Override // ax.r7.AbstractC2991z, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.d0.contains(obj);
        }

        @Override // java.util.List
        public E get(int i) {
            ax.q7.n.l(i, size());
            return this.d0.get(N(i));
        }

        @Override // ax.r7.AbstractC2991z, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.d0.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return N(lastIndexOf);
            }
            return -1;
        }

        @Override // ax.r7.AbstractC2991z, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // ax.r7.AbstractC2989x
        boolean l() {
            return this.d0.l();
        }

        @Override // ax.r7.AbstractC2991z, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.d0.indexOf(obj);
            if (indexOf >= 0) {
                return N(indexOf);
            }
            return -1;
        }

        @Override // ax.r7.AbstractC2991z, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.d0.size();
        }

        @Override // ax.r7.AbstractC2991z, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* renamed from: ax.r7.z$d */
    class d extends AbstractC2991z<E> {
        final transient int d0;
        final transient int e0;

        d(int i, int i2) {
            this.d0 = i;
            this.e0 = i2;
        }

        @Override // ax.r7.AbstractC2991z, java.util.List
        /* renamed from: K */
        public AbstractC2991z<E> subList(int i, int i2) {
            ax.q7.n.s(i, i2, this.e0);
            AbstractC2991z abstractC2991z = AbstractC2991z.this;
            int i3 = this.d0;
            return abstractC2991z.subList(i + i3, i2 + i3);
        }

        @Override // java.util.List
        public E get(int i) {
            ax.q7.n.l(i, this.e0);
            return AbstractC2991z.this.get(i + this.d0);
        }

        @Override // ax.r7.AbstractC2989x
        Object[] h() {
            return AbstractC2991z.this.h();
        }

        @Override // ax.r7.AbstractC2989x
        int i() {
            return AbstractC2991z.this.k() + this.d0 + this.e0;
        }

        @Override // ax.r7.AbstractC2991z, ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // ax.r7.AbstractC2989x
        int k() {
            return AbstractC2991z.this.k() + this.d0;
        }

        @Override // ax.r7.AbstractC2989x
        boolean l() {
            return true;
        }

        @Override // ax.r7.AbstractC2991z, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.e0;
        }

        @Override // ax.r7.AbstractC2991z, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    AbstractC2991z() {
    }

    public static <E> AbstractC2991z<E> A(E e) {
        return t(e);
    }

    public static <E> AbstractC2991z<E> B(E e, E e2) {
        return t(e, e2);
    }

    public static <E> AbstractC2991z<E> C(E e, E e2, E e3) {
        return t(e, e2, e3);
    }

    public static <E> AbstractC2991z<E> D(E e, E e2, E e3, E e4, E e5) {
        return t(e, e2, e3, e4, e5);
    }

    public static <E> AbstractC2991z<E> E(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return t(e, e2, e3, e4, e5, e6, e7);
    }

    @SafeVarargs
    public static <E> AbstractC2991z<E> G(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        ax.q7.n.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return t(objArr);
    }

    public static <E> AbstractC2991z<E> J(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        ax.q7.n.n(comparator);
        Object[] m = F.m(iterable);
        S.b(m);
        Arrays.sort(m, comparator);
        return p(m);
    }

    static <E> AbstractC2991z<E> p(Object[] objArr) {
        return q(objArr, objArr.length);
    }

    static <E> AbstractC2991z<E> q(Object[] objArr, int i) {
        return i == 0 ? z() : new V(objArr, i);
    }

    public static <E> a<E> r() {
        return new a<>();
    }

    public static <E> a<E> s(int i) {
        C2975i.b(i, "expectedSize");
        return new a<>(i);
    }

    private static <E> AbstractC2991z<E> t(Object... objArr) {
        return p(S.b(objArr));
    }

    public static <E> AbstractC2991z<E> u(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC2989x)) {
            return t(collection.toArray());
        }
        AbstractC2991z<E> e = ((AbstractC2989x) collection).e();
        return e.l() ? p(e.toArray()) : e;
    }

    public static <E> AbstractC2991z<E> w(E[] eArr) {
        return eArr.length == 0 ? z() : t((Object[]) eArr.clone());
    }

    public static <E> AbstractC2991z<E> z() {
        return (AbstractC2991z<E>) V.f0;
    }

    public AbstractC2991z<E> I() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* renamed from: K */
    public AbstractC2991z<E> subList(int i, int i2) {
        ax.q7.n.s(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? z() : M(i, i2);
    }

    AbstractC2991z<E> M(int i, int i2) {
        return new d(i, i2 - i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return I.b(this, obj);
    }

    @Override // ax.r7.AbstractC2989x
    int g(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return I.c(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return I.e(this, obj);
    }

    @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n */
    public j0<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public k0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public k0<E> listIterator(int i) {
        ax.q7.n.q(i, size());
        return isEmpty() ? (k0<E>) c0 : new b(this, i);
    }

    @Override // ax.r7.AbstractC2989x
    @Deprecated
    public final AbstractC2991z<E> e() {
        return this;
    }
}
