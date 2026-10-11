/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Gb.g;
import ax.Lb.f;
import ax.tb.c;
import ax.tb.e;
import ax.tb.j;
import ax.tb.l;
import ax.tb.m;
import ax.tb.p;
import ax.tb.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class h<E>
extends e<E> {
    public static final a e0 = new a(null);
    private static final Object[] f0 = new Object[0];
    private Object[] c0 = f0;
    private int d0;
    private int q;

    private final void i(int n8, Collection<? extends E> collection) {
        Iterator<E> iterator = collection.iterator();
        int n9 = this.c0.length;
        while (n8 < n9 && iterator.hasNext()) {
            this.c0[n8] = iterator.next();
            ++n8;
        }
        n9 = this.q;
        for (n8 = 0; n8 < n9 && iterator.hasNext(); ++n8) {
            this.c0[n8] = iterator.next();
        }
        this.d0 = this.size() + collection.size();
    }

    private final void k(int n8) {
        Object[] objectArray = new Object[n8];
        Object[] objectArray2 = this.c0;
        l.g(objectArray2, objectArray, 0, this.q, objectArray2.length);
        objectArray2 = this.c0;
        n8 = objectArray2.length;
        int n9 = this.q;
        l.g(objectArray2, objectArray, n8 - n9, 0, n9);
        this.q = 0;
        this.c0 = objectArray;
    }

    private final int l(int n8) {
        if (n8 == 0) {
            return m.v(this.c0);
        }
        return n8 - 1;
    }

    private final void n(int n8) {
        if (n8 >= 0) {
            Object[] objectArray = this.c0;
            if (n8 <= objectArray.length) {
                return;
            }
            if (objectArray == f0) {
                this.c0 = new Object[f.b(n8, 10)];
                return;
            }
            this.k(c.q.e(objectArray.length, n8));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int p(int n8) {
        if (n8 == m.v(this.c0)) {
            return 0;
        }
        return n8 + 1;
    }

    private final int q(int n8) {
        int n9 = n8;
        if (n8 < 0) {
            n9 = n8 + this.c0.length;
        }
        return n9;
    }

    private final void r(int n8, int n9) {
        if (n8 < n9) {
            l.n(this.c0, null, n8, n9);
            return;
        }
        Object[] objectArray = this.c0;
        l.n(objectArray, null, n8, objectArray.length);
        l.n(this.c0, null, 0, n9);
    }

    private final int s(int n8) {
        Object[] objectArray = this.c0;
        int n9 = n8;
        if (n8 >= objectArray.length) {
            n9 = n8 - objectArray.length;
        }
        return n9;
    }

    private final void t() {
        ++this.modCount;
    }

    private final void w(int n8, int n9) {
        int n10 = this.s(this.q + (n8 - 1));
        int n11 = this.s(this.q + (n9 - 1));
        n9 = n10;
        while (n8 > 0) {
            int n12 = n9 + 1;
            n10 = Math.min(n8, Math.min(n12, n11 + 1));
            Object[] objectArray = this.c0;
            l.g(objectArray, objectArray, (n11 -= n10) + 1, (n9 -= n10) + 1, n12);
            n9 = this.q(n9);
            n11 = this.q(n11);
            n8 -= n10;
        }
    }

    private final void x(int n8, int n9) {
        int n10 = this.s(this.q + n9);
        n8 = this.s(this.q + n8);
        int n11 = this.size();
        int n12 = n9;
        n9 = n10;
        while ((n11 -= n12) > 0) {
            Object[] objectArray = this.c0;
            n12 = Math.min(n11, Math.min(objectArray.length - n9, objectArray.length - n8));
            objectArray = this.c0;
            n10 = n9 + n12;
            l.g(objectArray, objectArray, n8, n9, n10);
            n9 = this.s(n10);
            n8 = this.s(n8 + n12);
        }
    }

    @Override
    public void add(int n8, E e8) {
        c.q.c(n8, this.size());
        if (n8 == this.size()) {
            this.addLast(e8);
            return;
        }
        if (n8 == 0) {
            this.addFirst(e8);
            return;
        }
        this.t();
        this.n(this.size() + 1);
        int n9 = this.s(this.q + n8);
        if (n8 < this.size() + 1 >> 1) {
            int n10 = this.l(n9);
            n9 = this.l(this.q);
            n8 = this.q;
            if (n10 >= n8) {
                Object[] objectArray = this.c0;
                objectArray[n9] = objectArray[n8];
                l.g(objectArray, objectArray, n8, n8 + 1, n10 + 1);
            } else {
                Object[] objectArray = this.c0;
                l.g(objectArray, objectArray, n8 - 1, n8, objectArray.length);
                objectArray = this.c0;
                objectArray[objectArray.length - 1] = objectArray[0];
                l.g(objectArray, objectArray, 0, 1, n10 + 1);
            }
            this.c0[n10] = e8;
            this.q = n9;
        } else {
            n8 = this.s(this.q + this.size());
            if (n9 < n8) {
                Object[] objectArray = this.c0;
                l.g(objectArray, objectArray, n9 + 1, n9, n8);
            } else {
                Object[] objectArray = this.c0;
                l.g(objectArray, objectArray, 1, 0, n8);
                objectArray = this.c0;
                objectArray[0] = objectArray[objectArray.length - 1];
                l.g(objectArray, objectArray, n9 + 1, n9, objectArray.length - 1);
            }
            this.c0[n9] = e8;
        }
        this.d0 = this.size() + 1;
    }

    @Override
    public boolean add(E e8) {
        this.addLast(e8);
        return true;
    }

    @Override
    public boolean addAll(int n8, Collection<? extends E> collection) {
        ax.Gb.l.f(collection, "elements");
        c.q.c(n8, this.size());
        if (collection.isEmpty()) {
            return false;
        }
        if (n8 == this.size()) {
            return this.addAll(collection);
        }
        this.t();
        this.n(this.size() + collection.size());
        int n9 = this.s(this.q + this.size());
        int n10 = this.s(this.q + n8);
        int n11 = collection.size();
        if (n8 < this.size() + 1 >> 1) {
            n9 = this.q;
            n8 = n9 - n11;
            if (n10 >= n9) {
                if (n8 >= 0) {
                    Object[] objectArray = this.c0;
                    l.g(objectArray, objectArray, n8, n9, n10);
                } else {
                    Object[] objectArray = this.c0;
                    int n12 = objectArray.length - (n8 += objectArray.length);
                    if (n12 >= n10 - n9) {
                        l.g(objectArray, objectArray, n8, n9, n10);
                    } else {
                        l.g(objectArray, objectArray, n8, n9, n9 + n12);
                        objectArray = this.c0;
                        l.g(objectArray, objectArray, 0, this.q + n12, n10);
                    }
                }
            } else {
                Object[] objectArray = this.c0;
                l.g(objectArray, objectArray, n8, n9, objectArray.length);
                if (n11 >= n10) {
                    objectArray = this.c0;
                    l.g(objectArray, objectArray, objectArray.length - n11, 0, n10);
                } else {
                    objectArray = this.c0;
                    l.g(objectArray, objectArray, objectArray.length - n11, 0, n11);
                    objectArray = this.c0;
                    l.g(objectArray, objectArray, 0, n11, n10);
                }
            }
            this.q = n8;
            this.i(this.q(n10 - n11), collection);
        } else {
            n8 = n10 + n11;
            if (n10 < n9) {
                Object[] objectArray = this.c0;
                if ((n11 += n9) <= objectArray.length) {
                    l.g(objectArray, objectArray, n8, n10, n9);
                } else if (n8 >= objectArray.length) {
                    l.g(objectArray, objectArray, n8 - objectArray.length, n10, n9);
                } else {
                    n11 = n9 - (n11 - objectArray.length);
                    l.g(objectArray, objectArray, 0, n11, n9);
                    objectArray = this.c0;
                    l.g(objectArray, objectArray, n8, n10, n11);
                }
            } else {
                Object[] objectArray = this.c0;
                l.g(objectArray, objectArray, n11, 0, n9);
                objectArray = this.c0;
                if (n8 >= objectArray.length) {
                    l.g(objectArray, objectArray, n8 - objectArray.length, n10, objectArray.length);
                } else {
                    l.g(objectArray, objectArray, 0, objectArray.length - n11, objectArray.length);
                    objectArray = this.c0;
                    l.g(objectArray, objectArray, n8, n10, objectArray.length - n11);
                }
            }
            this.i(n10, collection);
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        ax.Gb.l.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.t();
        this.n(this.size() + collection.size());
        this.i(this.s(this.q + this.size()), collection);
        return true;
    }

    public final void addFirst(E e8) {
        int n8;
        this.t();
        this.n(this.size() + 1);
        this.q = n8 = this.l(this.q);
        this.c0[n8] = e8;
        this.d0 = this.size() + 1;
    }

    public final void addLast(E e8) {
        this.t();
        this.n(this.size() + 1);
        this.c0[this.s((int)(this.q + this.size()))] = e8;
        this.d0 = this.size() + 1;
    }

    @Override
    public void clear() {
        if (!this.isEmpty()) {
            this.t();
            int n8 = this.s(this.q + this.size());
            this.r(this.q, n8);
        }
        this.q = 0;
        this.d0 = 0;
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    @Override
    public int e() {
        return this.d0;
    }

    @Override
    public E g(int n8) {
        c.q.b(n8, this.size());
        if (n8 == ax.tb.q.k(this)) {
            return this.removeLast();
        }
        if (n8 == 0) {
            return this.removeFirst();
        }
        this.t();
        int n9 = this.s(this.q + n8);
        Object object = this.c0[n9];
        if (n8 < this.size() >> 1) {
            Object[] objectArray;
            n8 = this.q;
            if (n9 >= n8) {
                objectArray = this.c0;
                l.g(objectArray, objectArray, n8 + 1, n8, n9);
            } else {
                objectArray = this.c0;
                l.g(objectArray, objectArray, 1, 0, n9);
                objectArray = this.c0;
                objectArray[0] = objectArray[objectArray.length - 1];
                n8 = this.q;
                l.g(objectArray, objectArray, n8 + 1, n8, objectArray.length - 1);
            }
            objectArray = this.c0;
            n8 = this.q;
            objectArray[n8] = null;
            this.q = this.p(n8);
        } else {
            n8 = this.s(this.q + ax.tb.q.k(this));
            if (n9 <= n8) {
                Object[] objectArray = this.c0;
                l.g(objectArray, objectArray, n9, n9 + 1, n8 + 1);
            } else {
                Object[] objectArray = this.c0;
                l.g(objectArray, objectArray, n9, n9 + 1, objectArray.length);
                objectArray = this.c0;
                objectArray[objectArray.length - 1] = objectArray[0];
                l.g(objectArray, objectArray, 0, 1, n8 + 1);
            }
            this.c0[n8] = null;
        }
        this.d0 = this.size() - 1;
        return (E)object;
    }

    @Override
    public E get(int n8) {
        c.q.b(n8, this.size());
        return (E)this.c0[this.s(this.q + n8)];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int indexOf(Object object) {
        int n8 = this.q;
        int n9 = this.s(this.q + this.size());
        if (n8 < n9) {
            while (n8 < n9) {
                if (ax.Gb.l.a(object, this.c0[n8])) {
                    n9 = this.q;
                    return n8 - n9;
                }
                ++n8;
            }
            return -1;
        }
        if (n8 < n9) return -1;
        int n10 = this.c0.length;
        while (n8 < n10) {
            if (ax.Gb.l.a(object, this.c0[n8])) {
                n9 = this.q;
                return n8 - n9;
            }
            ++n8;
        }
        for (n8 = 0; n8 < n9; ++n8) {
            if (!ax.Gb.l.a(object, this.c0[n8])) continue;
            n8 += this.c0.length;
            n9 = this.q;
            return n8 - n9;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int lastIndexOf(Object object) {
        int n8 = this.q;
        int n9 = this.s(this.q + this.size());
        if (n8 < n9) {
            if (n8 > --n9) return -1;
            while (true) {
                if (ax.Gb.l.a(object, this.c0[n9])) {
                    n8 = this.q;
                    return n9 - n8;
                }
                if (n9 == n8) return -1;
                --n9;
            }
        }
        if (n8 <= n9) return -1;
        --n9;
        while (-1 < n9) {
            if (ax.Gb.l.a(object, this.c0[n9])) {
                n9 += this.c0.length;
                n8 = this.q;
                return n9 - n8;
            }
            --n9;
        }
        n8 = this.q;
        n9 = m.v(this.c0);
        if (n8 > n9) return -1;
        while (true) {
            if (ax.Gb.l.a(object, this.c0[n9])) {
                n8 = this.q;
                return n9 - n8;
            }
            if (n9 == n8) return -1;
            --n9;
        }
    }

    @Override
    public boolean remove(Object object) {
        int n8 = this.indexOf(object);
        if (n8 == -1) {
            return false;
        }
        this.remove(n8);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        ax.Gb.l.f(collection, "elements");
        boolean bl = this.isEmpty();
        int n8 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl2;
        if (!bl) {
            if (this.c0.length == 0) {
                bl4 = bl2;
            } else {
                int n9 = this.q;
                int n10 = this.s(this.q + this.size());
                if (n9 < n10) {
                    int n11 = n9;
                    bl2 = bl3;
                    while (n9 < n10) {
                        Object object = this.c0[n9];
                        if (!collection.contains(object)) {
                            this.c0[n11] = object;
                            ++n11;
                        } else {
                            bl2 = true;
                        }
                        ++n9;
                    }
                    l.n(this.c0, null, n11, n10);
                    n9 = n11;
                } else {
                    Object[] objectArray;
                    Object object;
                    int n12 = this.c0.length;
                    int n13 = n9;
                    bl2 = false;
                    while (n9 < n12) {
                        object = this.c0;
                        objectArray = object[n9];
                        object[n9] = null;
                        if (!collection.contains(objectArray)) {
                            this.c0[n13] = objectArray;
                            ++n13;
                        } else {
                            bl2 = true;
                        }
                        ++n9;
                    }
                    n9 = this.s(n13);
                    for (n13 = n8; n13 < n10; ++n13) {
                        objectArray = this.c0;
                        object = objectArray[n13];
                        objectArray[n13] = null;
                        if (!collection.contains(object)) {
                            this.c0[n9] = object;
                            n9 = this.p(n9);
                            continue;
                        }
                        bl2 = true;
                    }
                }
                bl4 = bl2;
                if (bl2) {
                    this.t();
                    this.d0 = this.q(n9 - this.q);
                    bl4 = bl2;
                }
            }
        }
        return bl4;
    }

    public final E removeFirst() {
        if (!this.isEmpty()) {
            this.t();
            Object[] objectArray = this.c0;
            int n8 = this.q;
            Object object = objectArray[n8];
            objectArray[n8] = null;
            this.q = this.p(n8);
            this.d0 = this.size() - 1;
            return (E)object;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!this.isEmpty()) {
            this.t();
            int n8 = this.s(this.q + ax.tb.q.k(this));
            Object[] objectArray = this.c0;
            Object object = objectArray[n8];
            objectArray[n8] = null;
            this.d0 = this.size() - 1;
            return (E)object;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override
    protected void removeRange(int n8, int n9) {
        c.q.d(n8, n9, this.size());
        int n10 = n9 - n8;
        if (n10 == 0) {
            return;
        }
        if (n10 == this.size()) {
            this.clear();
            return;
        }
        if (n10 == 1) {
            this.remove(n8);
            return;
        }
        this.t();
        if (n8 < this.size() - n9) {
            this.w(n8, n9);
            n8 = this.s(this.q + n10);
            this.r(this.q, n8);
            this.q = n8;
        } else {
            this.x(n8, n9);
            n8 = this.s(this.q + this.size());
            this.r(this.q(n8 - n10), n8);
        }
        this.d0 = this.size() - n10;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        ax.Gb.l.f(collection, "elements");
        boolean bl = this.isEmpty();
        int n8 = 0;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl2;
        if (!bl) {
            if (this.c0.length == 0) {
                bl4 = bl2;
            } else {
                int n9 = this.q;
                int n10 = this.s(this.q + this.size());
                if (n9 < n10) {
                    int n11 = n9;
                    bl2 = bl3;
                    while (n9 < n10) {
                        Object object = this.c0[n9];
                        if (collection.contains(object)) {
                            this.c0[n11] = object;
                            ++n11;
                        } else {
                            bl2 = true;
                        }
                        ++n9;
                    }
                    l.n(this.c0, null, n11, n10);
                    n9 = n11;
                } else {
                    Object[] objectArray;
                    Object object;
                    int n12 = this.c0.length;
                    int n13 = n9;
                    bl2 = false;
                    while (n9 < n12) {
                        object = this.c0;
                        objectArray = object[n9];
                        object[n9] = null;
                        if (collection.contains(objectArray)) {
                            this.c0[n13] = objectArray;
                            ++n13;
                        } else {
                            bl2 = true;
                        }
                        ++n9;
                    }
                    n9 = this.s(n13);
                    for (n13 = n8; n13 < n10; ++n13) {
                        objectArray = this.c0;
                        object = objectArray[n13];
                        objectArray[n13] = null;
                        if (collection.contains(object)) {
                            this.c0[n9] = object;
                            n9 = this.p(n9);
                            continue;
                        }
                        bl2 = true;
                    }
                }
                bl4 = bl2;
                if (bl2) {
                    this.t();
                    this.d0 = this.q(n9 - this.q);
                    bl4 = bl2;
                }
            }
        }
        return bl4;
    }

    @Override
    public E set(int n8, E e8) {
        c.q.b(n8, this.size());
        n8 = this.s(this.q + n8);
        Object[] objectArray = this.c0;
        Object object = objectArray[n8];
        objectArray[n8] = e8;
        return (E)object;
    }

    @Override
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        ax.Gb.l.f(TArray, "array");
        if (TArray.length < this.size()) {
            TArray = j.a(TArray, this.size());
        }
        int n8 = this.s(this.q + this.size());
        int n9 = this.q;
        if (n9 < n8) {
            l.j(this.c0, TArray, 0, n9, n8, 2, null);
        } else if (!this.isEmpty()) {
            Object[] objectArray = this.c0;
            l.g(objectArray, TArray, 0, this.q, objectArray.length);
            objectArray = this.c0;
            l.g(objectArray, TArray, objectArray.length - this.q, 0, n8);
        }
        return p.e(this.size(), TArray);
    }

    public final E u() {
        if (this.isEmpty()) {
            return null;
        }
        return this.removeFirst();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

