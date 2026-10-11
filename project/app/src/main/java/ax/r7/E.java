/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.C;
import ax.r7.F;
import ax.r7.G;
import ax.r7.S;
import ax.r7.T;
import ax.r7.Y;
import ax.r7.f0;
import ax.r7.g0;
import ax.r7.j0;
import ax.r7.z;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

public abstract class E<E>
extends C<E>
implements NavigableSet<E>,
f0<E>,
j.SortedSet {
    final transient Comparator<? super E> d0;
    transient E<E> e0;

    E(Comparator<? super E> comparator) {
        this.d0 = comparator;
    }

    static <E> E<E> G(Comparator<? super E> comparator, int n8, E ... EArray) {
        Object object;
        if (n8 == 0) {
            return E.O(comparator);
        }
        S.c(EArray, n8);
        Arrays.sort(EArray, 0, n8, comparator);
        int n9 = 1;
        for (int i8 = 1; i8 < n8; ++i8) {
            object = EArray[i8];
            int n10 = n9;
            if (comparator.compare(object, EArray[n9 - 1]) != 0) {
                EArray[n9] = object;
                n10 = n9 + 1;
            }
            n9 = n10;
        }
        Arrays.fill(EArray, n9, n8, null);
        object = EArray;
        if (n9 < EArray.length / 2) {
            object = Arrays.copyOf(EArray, n9);
        }
        return new Y<E>(z.q(object, n9), comparator);
    }

    public static <E> E<E> I(Comparator<? super E> comparator, Iterable<? extends E> objectArray) {
        E e8;
        n.n(comparator);
        if (g0.b(comparator, objectArray) && objectArray instanceof E && !(e8 = (E)objectArray).l()) {
            return e8;
        }
        objectArray = F.m(objectArray);
        return E.G(comparator, objectArray.length, objectArray);
    }

    public static <E> E<E> J(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return E.I(comparator, collection);
    }

    static <E> Y<E> O(Comparator<? super E> comparator) {
        if (T.d().equals(comparator)) {
            return Y.g0;
        }
        return new Y<E>(z.z(), comparator);
    }

    static int Z(Comparator<?> comparator, Object object, Object object2) {
        return comparator.compare(object, object2);
    }

    abstract E<E> K();

    public abstract j0<E> M();

    public E<E> N() {
        E<E> e8;
        E<E> e9 = e8 = this.e0;
        if (e8 == null) {
            this.e0 = e9 = this.K();
            e9.e0 = this;
        }
        return e9;
    }

    public E<E> P(E e8) {
        return this.Q(e8, false);
    }

    public E<E> Q(E e8, boolean bl) {
        return this.R(n.n(e8), bl);
    }

    abstract E<E> R(E var1, boolean var2);

    public E<E> S(E e8, E e9) {
        return this.T(e8, true, e9, false);
    }

    public E<E> T(E e8, boolean bl, E e9, boolean bl2) {
        n.n(e8);
        n.n(e9);
        boolean bl3 = this.d0.compare(e8, e9) <= 0;
        n.d(bl3);
        return this.U(e8, bl, e9, bl2);
    }

    abstract E<E> U(E var1, boolean var2, E var3, boolean var4);

    public E<E> V(E e8) {
        return this.W(e8, true);
    }

    public E<E> W(E e8, boolean bl) {
        return this.X(n.n(e8), bl);
    }

    abstract E<E> X(E var1, boolean var2);

    int Y(Object object, Object object2) {
        return E.Z(this.d0, object, object2);
    }

    @Override
    public E ceiling(E e8) {
        return F.d(this.W(e8, true), null);
    }

    @Override
    public Comparator<? super E> comparator() {
        return this.d0;
    }

    @Override
    public E first() {
        return this.n().next();
    }

    @Override
    public E floor(E e8) {
        return G.n(this.Q(e8, true).M(), null);
    }

    @Override
    public E higher(E e8) {
        return F.d(this.W(e8, false), null);
    }

    @Override
    public E last() {
        return this.M().next();
    }

    @Override
    public E lower(E e8) {
        return G.n(this.Q(e8, false).M(), null);
    }

    @Override
    public abstract j0<E> n();

    @Override
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }
}

