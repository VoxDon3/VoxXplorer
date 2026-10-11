/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.E;
import ax.r7.O;
import ax.r7.T;
import ax.r7.g0;
import ax.r7.j0;
import ax.r7.z;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class Y<E>
extends E<E> {
    static final Y<Comparable> g0 = new Y(z.z(), T.d());
    final transient z<E> f0;

    Y(z<E> z8, Comparator<? super E> comparator) {
        super(comparator);
        this.f0 = z8;
    }

    private int e0(Object object) throws ClassCastException {
        return Collections.binarySearch(this.f0, object, this.f0());
    }

    @Override
    E<E> K() {
        Comparator comparator = Collections.reverseOrder(this.d0);
        if (this.isEmpty()) {
            return E.O(comparator);
        }
        return new Y(this.f0.I(), comparator);
    }

    @Override
    public j0<E> M() {
        return this.f0.I().n();
    }

    @Override
    E<E> R(E e8, boolean bl) {
        return this.a0(0, this.b0(e8, bl));
    }

    @Override
    E<E> U(E e8, boolean bl, E e9, boolean bl2) {
        return this.X(e8, bl).R(e9, bl2);
    }

    @Override
    E<E> X(E e8, boolean bl) {
        return this.a0(this.c0(e8, bl), this.size());
    }

    Y<E> a0(int n8, int n9) {
        if (n8 == 0 && n9 == this.size()) {
            return this;
        }
        if (n8 < n9) {
            return new Y(this.f0.K(n8, n9), this.d0);
        }
        return E.O(this.d0);
    }

    int b0(E e8, boolean bl) {
        int n8 = Collections.binarySearch(this.f0, n.n(e8), this.comparator());
        if (n8 >= 0) {
            int n9 = n8;
            if (bl) {
                n9 = n8 + 1;
            }
            return n9;
        }
        return ~n8;
    }

    int c0(E e8, boolean bl) {
        int n8 = Collections.binarySearch(this.f0, n.n(e8), this.comparator());
        if (n8 >= 0) {
            if (bl) {
                return n8;
            }
            return n8 + 1;
        }
        return ~n8;
    }

    @Override
    public E ceiling(E e8) {
        int n8 = this.c0(e8, true);
        if (n8 == this.size()) {
            return null;
        }
        return this.f0.get(n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean contains(Object object) {
        if (object == null) return false;
        try {
            int n8 = this.e0(object);
            if (n8 < 0) return false;
            return true;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean containsAll(Collection<?> collection) {
        Collection<?> var3_8;
        Collection<Object> collection2 = collection;
        if (collection instanceof O) {
            Set set = ((O)collection).H();
        }
        if (!ax.r7.g0.b(this.comparator(), var3_8)) return super.containsAll((Collection<?>)var3_8);
        if (var3_8.size() <= 1) {
            return super.containsAll((Collection<?>)var3_8);
        }
        j0<E> j02 = this.n();
        Iterator iterator = var3_8.iterator();
        if (!j02.hasNext()) {
            return false;
        }
        Object e8 = iterator.next();
        Object e9 = j02.next();
        try {
            while (true) {
                Object var3_10;
                Object var1_3;
                int n8;
                if ((n8 = this.Y(var1_3, var3_10)) < 0) {
                    if (!j02.hasNext()) {
                        return false;
                    }
                    Object e10 = j02.next();
                    continue;
                }
                if (n8 == 0) {
                    if (!iterator.hasNext()) {
                        return true;
                    }
                    Object e11 = iterator.next();
                    continue;
                }
                if (n8 > 0) break;
            }
            return false;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    @Override
    public z<E> e() {
        return this.f0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        object = (Set)object;
        if (this.size() != object.size()) {
            return false;
        }
        if (this.isEmpty()) {
            return true;
        }
        if (!ax.r7.g0.b(this.d0, object)) {
            return this.containsAll((Collection<?>)object);
        }
        Iterator iterator = object.iterator();
        try {
            Object e8;
            int n8;
            j0<E> j02 = this.n();
            do {
                if (!j02.hasNext()) {
                    return true;
                }
                e8 = j02.next();
            } while ((object = iterator.next()) != null && (n8 = this.Y(e8, object)) == 0);
            return false;
        }
        catch (ClassCastException | NoSuchElementException runtimeException) {
            return false;
        }
    }

    Comparator<Object> f0() {
        return this.d0;
    }

    @Override
    public E first() {
        if (!this.isEmpty()) {
            return this.f0.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override
    public E floor(E e8) {
        int n8 = this.b0(e8, true) - 1;
        if (n8 == -1) {
            return null;
        }
        return this.f0.get(n8);
    }

    @Override
    int g(Object[] objectArray, int n8) {
        return this.f0.g(objectArray, n8);
    }

    @Override
    Object[] h() {
        return this.f0.h();
    }

    @Override
    public E higher(E e8) {
        int n8 = this.c0(e8, false);
        if (n8 == this.size()) {
            return null;
        }
        return this.f0.get(n8);
    }

    @Override
    int i() {
        return this.f0.i();
    }

    @Override
    int k() {
        return this.f0.k();
    }

    @Override
    boolean l() {
        return this.f0.l();
    }

    @Override
    public E last() {
        if (!this.isEmpty()) {
            return this.f0.get(this.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override
    public E lower(E e8) {
        int n8 = this.b0(e8, false) - 1;
        if (n8 == -1) {
            return null;
        }
        return this.f0.get(n8);
    }

    @Override
    public j0<E> n() {
        return this.f0.n();
    }

    @Override
    public int size() {
        return this.f0.size();
    }
}

