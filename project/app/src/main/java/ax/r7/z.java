/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.F;
import ax.r7.I;
import ax.r7.S;
import ax.r7.V;
import ax.r7.i;
import ax.r7.j0;
import ax.r7.k0;
import ax.r7.x;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

public abstract class z<E>
extends x<E>
implements List<E>,
RandomAccess,
j.List {
    private static final k0<Object> c0 = new b<Object>(V.f0, 0);

    z() {
    }

    public static <E> z<E> A(E e8) {
        return z.t(e8);
    }

    public static <E> z<E> B(E e8, E e9) {
        return z.t(e8, e9);
    }

    public static <E> z<E> C(E e8, E e9, E e10) {
        return z.t(e8, e9, e10);
    }

    public static <E> z<E> D(E e8, E e9, E e10, E e11, E e12) {
        return z.t(e8, e9, e10, e11, e12);
    }

    public static <E> z<E> E(E e8, E e9, E e10, E e11, E e12, E e13, E e14) {
        return z.t(e8, e9, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> z<E> G(E e8, E e9, E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E ... EArray) {
        boolean bl = EArray.length <= 0x7FFFFFF3;
        n.e(bl, "the total number of elements must fit in an int");
        Object[] objectArray = new Object[EArray.length + 12];
        objectArray[0] = e8;
        objectArray[1] = e9;
        objectArray[2] = e10;
        objectArray[3] = e11;
        objectArray[4] = e12;
        objectArray[5] = e13;
        objectArray[6] = e14;
        objectArray[7] = e15;
        objectArray[8] = e16;
        objectArray[9] = e17;
        objectArray[10] = e18;
        objectArray[11] = e19;
        System.arraycopy(EArray, 0, objectArray, 12, EArray.length);
        return z.t(objectArray);
    }

    public static <E> z<E> J(Comparator<? super E> comparator, Iterable<? extends E> objectArray) {
        n.n(comparator);
        objectArray = F.m(objectArray);
        S.b(objectArray);
        Arrays.sort(objectArray, comparator);
        return z.p(objectArray);
    }

    static <E> z<E> p(Object[] objectArray) {
        return z.q(objectArray, objectArray.length);
    }

    static <E> z<E> q(Object[] objectArray, int n8) {
        if (n8 == 0) {
            return z.z();
        }
        return new V(objectArray, n8);
    }

    public static <E> a<E> r() {
        return new a();
    }

    public static <E> a<E> s(int n8) {
        i.b(n8, "expectedSize");
        return new a(n8);
    }

    private static <E> z<E> t(Object ... objectArray) {
        return z.p(S.b(objectArray));
    }

    public static <E> z<E> u(Collection<? extends E> collection) {
        if (collection instanceof x) {
            z<E> z8 = ((x)collection).e();
            collection = z8;
            if (z8.l()) {
                collection = z.p(z8.toArray());
            }
            return collection;
        }
        return z.t(collection.toArray());
    }

    public static <E> z<E> w(E[] EArray) {
        if (EArray.length == 0) {
            return z.z();
        }
        return z.t((Object[])EArray.clone());
    }

    public static <E> z<E> z() {
        return V.f0;
    }

    public z<E> I() {
        if (this.size() <= 1) {
            return this;
        }
        return new c(this);
    }

    public z<E> K(int n8, int n9) {
        n.s(n8, n9, this.size());
        int n10 = n9 - n8;
        if (n10 == this.size()) {
            return this;
        }
        if (n10 == 0) {
            return z.z();
        }
        return this.M(n8, n9);
    }

    z<E> M(int n8, int n9) {
        return new d(this, n8, n9 - n8);
    }

    @Override
    @Deprecated
    public final void add(int n8, E e8) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final boolean addAll(int n8, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    @Override
    @Deprecated
    public final z<E> e() {
        return this;
    }

    @Override
    public boolean equals(Object object) {
        return I.b(this, object);
    }

    @Override
    int g(Object[] objectArray, int n8) {
        int n9 = this.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            objectArray[n8 + i8] = this.get(i8);
        }
        return n8 + n9;
    }

    @Override
    public int hashCode() {
        int n8 = this.size();
        int n9 = 1;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = ~(~(n9 * 31 + this.get(i8).hashCode()));
        }
        return n9;
    }

    @Override
    public int indexOf(Object object) {
        if (object == null) {
            return -1;
        }
        return I.c(this, object);
    }

    @Override
    public int lastIndexOf(Object object) {
        if (object == null) {
            return -1;
        }
        return I.e(this, object);
    }

    @Override
    public j0<E> n() {
        return this.x();
    }

    @Override
    @Deprecated
    public final E remove(int n8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        j.List._CC.$default$replaceAll((List)this, (UnaryOperator)unaryOperator);
    }

    @Override
    @Deprecated
    public final E set(int n8, E e8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ void sort(Comparator comparator) {
        j.List._CC.$default$sort((List)this, (Comparator)comparator);
    }

    public k0<E> x() {
        return this.y(0);
    }

    public k0<E> y(int n8) {
        n.q(n8, this.size());
        if (this.isEmpty()) {
            return c0;
        }
        return new b(this, n8);
    }

    public static final class a<E>
    extends x.a<E> {
        public a() {
            this(4);
        }

        a(int n8) {
            super(n8);
        }

        public a<E> h(E e8) {
            super.d(e8);
            return this;
        }

        public a<E> i(E ... EArray) {
            super.e(EArray);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public z<E> k() {
            this.c = true;
            return z.q(this.a, this.b);
        }
    }

    static class b<E>
    extends ax.r7.a<E> {
        private final z<E> d0;

        b(z<E> z8, int n8) {
            super(z8.size(), n8);
            this.d0 = z8;
        }

        @Override
        protected E b(int n8) {
            return this.d0.get(n8);
        }
    }

    private static class c<E>
    extends z<E> {
        private final transient z<E> d0;

        c(z<E> z8) {
            this.d0 = z8;
        }

        private int N(int n8) {
            return this.size() - 1 - n8;
        }

        private int O(int n8) {
            return this.size() - n8;
        }

        @Override
        public z<E> I() {
            return this.d0;
        }

        @Override
        public z<E> K(int n8, int n9) {
            n.s(n8, n9, this.size());
            return this.d0.K(this.O(n9), this.O(n8)).I();
        }

        @Override
        public boolean contains(Object object) {
            return this.d0.contains(object);
        }

        @Override
        public E get(int n8) {
            n.l(n8, this.size());
            return this.d0.get(this.N(n8));
        }

        @Override
        public int indexOf(Object object) {
            int n8 = this.d0.lastIndexOf(object);
            if (n8 >= 0) {
                return this.N(n8);
            }
            return -1;
        }

        @Override
        boolean l() {
            return this.d0.l();
        }

        @Override
        public int lastIndexOf(Object object) {
            int n8 = this.d0.indexOf(object);
            if (n8 >= 0) {
                return this.N(n8);
            }
            return -1;
        }

        @Override
        public int size() {
            return this.d0.size();
        }
    }

    class d
    extends z<E> {
        final transient int d0;
        final transient int e0;
        final z f0;

        d(z z8, int n8, int n9) {
            this.f0 = z8;
            this.d0 = n8;
            this.e0 = n9;
        }

        @Override
        public z<E> K(int n8, int n9) {
            n.s(n8, n9, this.e0);
            z z8 = this.f0;
            int n10 = this.d0;
            return z8.K(n8 + n10, n9 + n10);
        }

        @Override
        public E get(int n8) {
            n.l(n8, this.e0);
            return this.f0.get(n8 + this.d0);
        }

        @Override
        Object[] h() {
            return this.f0.h();
        }

        @Override
        int i() {
            return this.f0.k() + this.d0 + this.e0;
        }

        @Override
        int k() {
            return this.f0.k() + this.d0;
        }

        @Override
        boolean l() {
            return true;
        }

        @Override
        public int size() {
            return this.e0;
        }
    }
}

