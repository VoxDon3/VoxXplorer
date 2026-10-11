package ax.r7;

import ax.r7.AbstractC2989x;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: ax.r7.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2964C<E> extends AbstractC2989x<E> implements Set<E>, j$.util.Set {
    private transient AbstractC2991z<E> c0;

    /* renamed from: ax.r7.C$a */
    public static class a<E> extends AbstractC2989x.a<E> {
        Object[] d;
        private int e;

        public a() {
            super(4);
        }

        private void k(E e) {
            Objects.requireNonNull(this.d);
            int length = this.d.length - 1;
            int hashCode = e.hashCode();
            int b = C2988w.b(hashCode);
            while (true) {
                int i = b & length;
                Object[] objArr = this.d;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.e += hashCode;
                    super.d(e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    b = i + 1;
                }
            }
        }

        @Override // ax.r7.AbstractC2989x.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e) {
            ax.q7.n.n(e);
            if (this.d != null && AbstractC2964C.r(this.b) <= this.d.length) {
                k(e);
                return this;
            }
            this.d = null;
            super.d(e);
            return this;
        }

        public a<E> i(E... eArr) {
            if (this.d == null) {
                super.e(eArr);
                return this;
            }
            for (E e : eArr) {
                a(e);
            }
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            ax.q7.n.n(iterable);
            if (this.d == null) {
                super.b(iterable);
                return this;
            }
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public AbstractC2964C<E> l() {
            AbstractC2964C<E> s;
            int i = this.b;
            if (i == 0) {
                return AbstractC2964C.y();
            }
            if (i == 1) {
                Object obj = this.a[0];
                Objects.requireNonNull(obj);
                return AbstractC2964C.z(obj);
            }
            if (this.d == null || AbstractC2964C.r(i) != this.d.length) {
                s = AbstractC2964C.s(this.b, this.a);
                this.b = s.size();
            } else {
                Object[] copyOf = AbstractC2964C.E(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a;
                s = new X<>(copyOf, this.e, this.d, r5.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return s;
        }
    }

    AbstractC2964C() {
    }

    public static <E> AbstractC2964C<E> A(E e, E e2) {
        return s(2, e, e2);
    }

    public static <E> AbstractC2964C<E> B(E e, E e2, E e3) {
        return s(3, e, e2, e3);
    }

    public static <E> AbstractC2964C<E> C(E e, E e2, E e3, E e4, E e5) {
        return s(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> AbstractC2964C<E> D(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        ax.q7.n.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return s(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    static int r(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            ax.q7.n.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> AbstractC2964C<E> s(int i, Object... objArr) {
        if (i == 0) {
            return y();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return z(obj);
        }
        int r = r(i);
        Object[] objArr2 = new Object[r];
        int i2 = r - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a2 = S.a(objArr[i5], i5);
            int hashCode = a2.hashCode();
            int b = C2988w.b(hashCode);
            while (true) {
                int i6 = b & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = a2;
                    objArr2[i6] = a2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(a2)) {
                    break;
                }
                b++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new e0(obj3);
        }
        if (r(i4) < r / 2) {
            return s(i4, objArr);
        }
        if (E(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new X(objArr, i3, objArr2, i2, i4);
    }

    public static <E> AbstractC2964C<E> t(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC2964C) && !(collection instanceof SortedSet)) {
            AbstractC2964C<E> abstractC2964C = (AbstractC2964C) collection;
            if (!abstractC2964C.l()) {
                return abstractC2964C;
            }
        }
        Object[] array = collection.toArray();
        return s(array.length, array);
    }

    public static <E> AbstractC2964C<E> u(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? s(eArr.length, (Object[]) eArr.clone()) : z(eArr[0]) : y();
    }

    public static <E> AbstractC2964C<E> y() {
        return X.j0;
    }

    public static <E> AbstractC2964C<E> z(E e) {
        return new e0(e);
    }

    @Override // ax.r7.AbstractC2989x
    public AbstractC2991z<E> e() {
        AbstractC2991z<E> abstractC2991z = this.c0;
        if (abstractC2991z != null) {
            return abstractC2991z;
        }
        AbstractC2991z<E> w = w();
        this.c0 = w;
        return w;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2964C) && x() && ((AbstractC2964C) obj).x() && hashCode() != obj.hashCode()) {
            return false;
        }
        return d0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d0.d(this);
    }

    @Override // ax.r7.AbstractC2989x, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract j0<E> iterator();

    AbstractC2991z<E> w() {
        return AbstractC2991z.p(toArray());
    }

    boolean x() {
        return false;
    }
}
