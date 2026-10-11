/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.S;
import ax.r7.X;
import ax.r7.d0;
import ax.r7.e0;
import ax.r7.j0;
import ax.r7.w;
import ax.r7.x;
import ax.r7.z;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

public abstract class C<E>
extends x<E>
implements Set<E>,
j.Set {
    private transient z<E> c0;

    C() {
    }

    public static <E> C<E> A(E e8, E e9) {
        return C.s(2, e8, e9);
    }

    public static <E> C<E> B(E e8, E e9, E e10) {
        return C.s(3, e8, e9, e10);
    }

    public static <E> C<E> C(E e8, E e9, E e10, E e11, E e12) {
        return C.s(5, e8, e9, e10, e11, e12);
    }

    @SafeVarargs
    public static <E> C<E> D(E e8, E e9, E e10, E e11, E e12, E e13, E ... EArray) {
        boolean bl = EArray.length <= 0x7FFFFFF9;
        n.e(bl, "the total number of elements must fit in an int");
        int n8 = EArray.length + 6;
        Object[] objectArray = new Object[n8];
        objectArray[0] = e8;
        objectArray[1] = e9;
        objectArray[2] = e10;
        objectArray[3] = e11;
        objectArray[4] = e12;
        objectArray[5] = e13;
        System.arraycopy(EArray, 0, objectArray, 6, EArray.length);
        return C.s(n8, objectArray);
    }

    private static boolean E(int n8, int n9) {
        return n8 < (n9 >> 1) + (n9 >> 2);
    }

    static int r(int n8) {
        int n9 = Math.max(n8, 2);
        boolean bl = true;
        if (n9 < 0x2CCCCCCC) {
            n8 = Integer.highestOneBit(n9 - 1) << 1;
            while ((double)n8 * 0.7 < (double)n9) {
                n8 <<= 1;
            }
            return n8;
        }
        if (n9 >= 0x40000000) {
            bl = false;
        }
        n.e(bl, "collection too large");
        return 0x40000000;
    }

    private static <E> C<E> s(int n8, Object ... objectArray) {
        if (n8 != 0) {
            if (n8 != 1) {
                Object[] objectArray2;
                int n9 = C.r(n8);
                Object[] objectArray3 = new Object[n9];
                int n10 = n9 - 1;
                int n11 = 0;
                int n12 = 0;
                block0: for (int i8 = 0; i8 < n8; ++i8) {
                    objectArray2 = S.a(objectArray[i8], i8);
                    int n13 = objectArray2.hashCode();
                    int n14 = w.b(n13);
                    while (true) {
                        int n15;
                        Object object;
                        if ((object = objectArray3[n15 = n14 & n10]) == null) {
                            objectArray[n12] = objectArray2;
                            objectArray3[n15] = objectArray2;
                            n11 += n13;
                            ++n12;
                            continue block0;
                        }
                        if (object.equals(objectArray2)) {
                            continue block0;
                        }
                        ++n14;
                    }
                }
                Arrays.fill(objectArray, n12, n8, null);
                if (n12 == 1) {
                    objectArray = objectArray[0];
                    j.Objects.requireNonNull((Object)objectArray);
                    return new e0<Object[]>(objectArray);
                }
                if (C.r(n12) < n9 / 2) {
                    return C.s(n12, objectArray);
                }
                objectArray2 = objectArray;
                if (C.E(n12, objectArray.length)) {
                    objectArray2 = Arrays.copyOf(objectArray, n12);
                }
                return new X(objectArray2, n11, objectArray3, n10, n12);
            }
            objectArray = objectArray[0];
            j.Objects.requireNonNull((Object)objectArray);
            return C.z(objectArray);
        }
        return C.y();
    }

    public static <E> C<E> t(Collection<? extends E> objectArray) {
        C c8;
        if (objectArray instanceof C && !(objectArray instanceof SortedSet) && !(c8 = (C)objectArray).l()) {
            return c8;
        }
        objectArray = objectArray.toArray();
        return C.s(objectArray.length, objectArray);
    }

    public static <E> C<E> u(E[] EArray) {
        int n8 = EArray.length;
        if (n8 != 0) {
            if (n8 != 1) {
                return C.s(EArray.length, (Object[])EArray.clone());
            }
            return C.z(EArray[0]);
        }
        return C.y();
    }

    public static <E> C<E> y() {
        return X.j0;
    }

    public static <E> C<E> z(E e8) {
        return new e0<E>(e8);
    }

    @Override
    public z<E> e() {
        z<E> z8;
        z<E> z9 = z8 = this.c0;
        if (z8 == null) {
            this.c0 = z9 = this.w();
        }
        return z9;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof C && this.x() && ((C)object).x() && this.hashCode() != object.hashCode()) {
            return false;
        }
        return d0.a(this, object);
    }

    @Override
    public int hashCode() {
        return d0.d(this);
    }

    @Override
    public abstract j0<E> n();

    z<E> w() {
        return z.p(this.toArray());
    }

    boolean x() {
        return false;
    }

    public static class a<E>
    extends x.a<E> {
        Object[] d;
        private int e;

        public a() {
            super(4);
        }

        private void k(E e8) {
            j.Objects.requireNonNull((Object)this.d);
            int n8 = this.d.length;
            int n9 = e8.hashCode();
            int n10 = w.b(n9);
            while (true) {
                Object[] objectArray;
                Object object;
                if ((object = (objectArray = this.d)[n10 &= n8 - 1]) == null) {
                    objectArray[n10] = e8;
                    this.e += n9;
                    super.d(e8);
                    return;
                }
                if (object.equals(e8)) {
                    return;
                }
                ++n10;
            }
        }

        public a<E> h(E e8) {
            n.n(e8);
            if (this.d != null && C.r(this.b) <= this.d.length) {
                this.k(e8);
                return this;
            }
            this.d = null;
            super.d(e8);
            return this;
        }

        public a<E> i(E ... EArray) {
            if (this.d != null) {
                int n8 = EArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.h(EArray[i8]);
                }
                return this;
            }
            super.e(EArray);
            return this;
        }

        public a<E> j(Iterable<? extends E> object) {
            n.n(object);
            if (this.d != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    this.h(object.next());
                }
                return this;
            }
            super.b(object);
            return this;
        }

        public C<E> l() {
            int n8 = this.b;
            if (n8 != 0) {
                if (n8 != 1) {
                    Object object;
                    if (this.d != null && C.r(n8) == this.d.length) {
                        object = C.E(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a;
                        n8 = this.e;
                        Object[] objectArray = this.d;
                        object = new X((Object[])object, n8, objectArray, objectArray.length - 1, this.b);
                    } else {
                        object = C.s(this.b, this.a);
                        this.b = object.size();
                    }
                    this.c = true;
                    this.d = null;
                    return object;
                }
                Object object = this.a[0];
                j.Objects.requireNonNull((Object)object);
                return C.z(object);
            }
            return C.y();
        }
    }
}

