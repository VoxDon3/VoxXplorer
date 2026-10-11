package ax.tb;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ax.tb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3132h<E> extends AbstractC3129e<E> {
    public static final a e0 = new a(null);
    private static final Object[] f0 = new Object[0];
    private Object[] c0 = f0;
    private int d0;
    private int q;

    /* renamed from: ax.tb.h$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    private final void i(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.c0.length;
        while (i < length && it.hasNext()) {
            this.c0[i] = it.next();
            i++;
        }
        int i2 = this.q;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.c0[i3] = it.next();
        }
        this.d0 = size() + collection.size();
    }

    private final void k(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.c0;
        C3136l.g(objArr2, objArr, 0, this.q, objArr2.length);
        Object[] objArr3 = this.c0;
        int length = objArr3.length;
        int i2 = this.q;
        C3136l.g(objArr3, objArr, length - i2, 0, i2);
        this.q = 0;
        this.c0 = objArr;
    }

    private final int l(int i) {
        return i == 0 ? C3137m.v(this.c0) : i - 1;
    }

    private final void n(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.c0;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f0) {
            this.c0 = new Object[ax.Lb.f.b(i, 10)];
        } else {
            k(AbstractC3127c.q.e(objArr.length, i));
        }
    }

    private final int p(int i) {
        if (i == C3137m.v(this.c0)) {
            return 0;
        }
        return i + 1;
    }

    private final int q(int i) {
        return i < 0 ? i + this.c0.length : i;
    }

    private final void r(int i, int i2) {
        if (i < i2) {
            C3136l.n(this.c0, null, i, i2);
            return;
        }
        Object[] objArr = this.c0;
        C3136l.n(objArr, null, i, objArr.length);
        C3136l.n(this.c0, null, 0, i2);
    }

    private final int s(int i) {
        Object[] objArr = this.c0;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final void t() {
        ((AbstractList) this).modCount++;
    }

    private final void w(int i, int i2) {
        int s = s(this.q + (i - 1));
        int s2 = s(this.q + (i2 - 1));
        while (i > 0) {
            int i3 = s + 1;
            int min = Math.min(i, Math.min(i3, s2 + 1));
            Object[] objArr = this.c0;
            int i4 = s2 - min;
            int i5 = s - min;
            C3136l.g(objArr, objArr, i4 + 1, i5 + 1, i3);
            s = q(i5);
            s2 = q(i4);
            i -= min;
        }
    }

    private final void x(int i, int i2) {
        int s = s(this.q + i2);
        int s2 = s(this.q + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.c0;
            i2 = Math.min(size, Math.min(objArr.length - s, objArr.length - s2));
            Object[] objArr2 = this.c0;
            int i3 = s + i2;
            C3136l.g(objArr2, objArr2, s2, s, i3);
            s = s(i3);
            s2 = s(s2 + i2);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        ax.Gb.l.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        t();
        n(size() + collection.size());
        i(s(this.q + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        t();
        n(size() + 1);
        int l = l(this.q);
        this.q = l;
        this.c0[l] = e;
        this.d0 = size() + 1;
    }

    public final void addLast(E e) {
        t();
        n(size() + 1);
        this.c0[s(this.q + size())] = e;
        this.d0 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            t();
            r(this.q, s(this.q + size()));
        }
        this.q = 0;
        this.d0 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ax.tb.AbstractC3129e
    public int e() {
        return this.d0;
    }

    @Override // ax.tb.AbstractC3129e
    public E g(int i) {
        AbstractC3127c.q.b(i, size());
        if (i == C3141q.k(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        t();
        int s = s(this.q + i);
        E e = (E) this.c0[s];
        if (i < (size() >> 1)) {
            int i2 = this.q;
            if (s >= i2) {
                Object[] objArr = this.c0;
                C3136l.g(objArr, objArr, i2 + 1, i2, s);
            } else {
                Object[] objArr2 = this.c0;
                C3136l.g(objArr2, objArr2, 1, 0, s);
                Object[] objArr3 = this.c0;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.q;
                C3136l.g(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.c0;
            int i4 = this.q;
            objArr4[i4] = null;
            this.q = p(i4);
        } else {
            int s2 = s(this.q + C3141q.k(this));
            if (s <= s2) {
                Object[] objArr5 = this.c0;
                C3136l.g(objArr5, objArr5, s, s + 1, s2 + 1);
            } else {
                Object[] objArr6 = this.c0;
                C3136l.g(objArr6, objArr6, s, s + 1, objArr6.length);
                Object[] objArr7 = this.c0;
                objArr7[objArr7.length - 1] = objArr7[0];
                C3136l.g(objArr7, objArr7, 0, 1, s2 + 1);
            }
            this.c0[s2] = null;
        }
        this.d0 = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC3127c.q.b(i, size());
        return (E) this.c0[s(this.q + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int s = s(this.q + size());
        int i2 = this.q;
        if (i2 < s) {
            while (i2 < s) {
                if (ax.Gb.l.a(obj, this.c0[i2])) {
                    i = this.q;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < s) {
            return -1;
        }
        int length = this.c0.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < s; i3++) {
                    if (ax.Gb.l.a(obj, this.c0[i3])) {
                        i2 = i3 + this.c0.length;
                        i = this.q;
                    }
                }
                return -1;
            }
            if (ax.Gb.l.a(obj, this.c0[i2])) {
                i = this.q;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int v;
        int i;
        int s = s(this.q + size());
        int i2 = this.q;
        if (i2 < s) {
            v = s - 1;
            if (i2 <= v) {
                while (!ax.Gb.l.a(obj, this.c0[v])) {
                    if (v != i2) {
                        v--;
                    }
                }
                i = this.q;
                return v - i;
            }
            return -1;
        }
        if (i2 > s) {
            int i3 = s - 1;
            while (true) {
                if (-1 >= i3) {
                    v = C3137m.v(this.c0);
                    int i4 = this.q;
                    if (i4 <= v) {
                        while (!ax.Gb.l.a(obj, this.c0[v])) {
                            if (v != i4) {
                                v--;
                            }
                        }
                        i = this.q;
                    }
                } else {
                    if (ax.Gb.l.a(obj, this.c0[i3])) {
                        v = i3 + this.c0.length;
                        i = this.q;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        int s;
        ax.Gb.l.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.c0.length != 0) {
            int s2 = s(this.q + size());
            int i = this.q;
            if (i < s2) {
                s = i;
                while (i < s2) {
                    Object obj = this.c0[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.c0[s] = obj;
                        s++;
                    }
                    i++;
                }
                C3136l.n(this.c0, null, s, s2);
            } else {
                int length = this.c0.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.c0;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.c0[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                s = s(i2);
                for (int i3 = 0; i3 < s2; i3++) {
                    Object[] objArr2 = this.c0;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.c0[s] = obj3;
                        s = p(s);
                    }
                }
                z = z2;
            }
            if (z) {
                t();
                this.d0 = q(s - this.q);
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        Object[] objArr = this.c0;
        int i = this.q;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.q = p(i);
        this.d0 = size() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        int s = s(this.q + C3141q.k(this));
        Object[] objArr = this.c0;
        E e = (E) objArr[s];
        objArr[s] = null;
        this.d0 = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        AbstractC3127c.q.d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        t();
        if (i < size() - i2) {
            w(i, i2);
            int s = s(this.q + i3);
            r(this.q, s);
            this.q = s;
        } else {
            x(i, i2);
            int s2 = s(this.q + size());
            r(q(s2 - i3), s2);
        }
        this.d0 = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        int s;
        ax.Gb.l.f(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.c0.length != 0) {
            int s2 = s(this.q + size());
            int i = this.q;
            if (i < s2) {
                s = i;
                while (i < s2) {
                    Object obj = this.c0[i];
                    if (collection.contains(obj)) {
                        this.c0[s] = obj;
                        s++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C3136l.n(this.c0, null, s, s2);
            } else {
                int length = this.c0.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.c0;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.c0[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                s = s(i2);
                for (int i3 = 0; i3 < s2; i3++) {
                    Object[] objArr2 = this.c0;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.c0[s] = obj3;
                        s = p(s);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                t();
                this.d0 = q(s - this.q);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractC3127c.q.b(i, size());
        int s = s(this.q + i);
        Object[] objArr = this.c0;
        E e2 = (E) objArr[s];
        objArr[s] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        ax.Gb.l.f(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) C3134j.a(tArr, size());
        }
        T[] tArr2 = tArr;
        int s = s(this.q + size());
        int i = this.q;
        if (i < s) {
            C3136l.j(this.c0, tArr2, 0, i, s, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.c0;
            C3136l.g(objArr, tArr2, 0, this.q, objArr.length);
            Object[] objArr2 = this.c0;
            C3136l.g(objArr2, tArr2, objArr2.length - this.q, 0, s);
        }
        return (T[]) C3140p.e(size(), tArr2);
    }

    public final E u() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractC3127c.q.c(i, size());
        if (i == size()) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        t();
        n(size() + 1);
        int s = s(this.q + i);
        if (i < ((size() + 1) >> 1)) {
            int l = l(s);
            int l2 = l(this.q);
            int i2 = this.q;
            if (l >= i2) {
                Object[] objArr = this.c0;
                objArr[l2] = objArr[i2];
                C3136l.g(objArr, objArr, i2, i2 + 1, l + 1);
            } else {
                Object[] objArr2 = this.c0;
                C3136l.g(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.c0;
                objArr3[objArr3.length - 1] = objArr3[0];
                C3136l.g(objArr3, objArr3, 0, 1, l + 1);
            }
            this.c0[l] = e;
            this.q = l2;
        } else {
            int s2 = s(this.q + size());
            if (s < s2) {
                Object[] objArr4 = this.c0;
                C3136l.g(objArr4, objArr4, s + 1, s, s2);
            } else {
                Object[] objArr5 = this.c0;
                C3136l.g(objArr5, objArr5, 1, 0, s2);
                Object[] objArr6 = this.c0;
                objArr6[0] = objArr6[objArr6.length - 1];
                C3136l.g(objArr6, objArr6, s + 1, s, objArr6.length - 1);
            }
            this.c0[s] = e;
        }
        this.d0 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        ax.Gb.l.f(collection, "elements");
        AbstractC3127c.q.c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        t();
        n(size() + collection.size());
        int s = s(this.q + size());
        int s2 = s(this.q + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.q;
            int i3 = i2 - size;
            if (s2 < i2) {
                Object[] objArr = this.c0;
                C3136l.g(objArr, objArr, i3, i2, objArr.length);
                if (size >= s2) {
                    Object[] objArr2 = this.c0;
                    C3136l.g(objArr2, objArr2, objArr2.length - size, 0, s2);
                } else {
                    Object[] objArr3 = this.c0;
                    C3136l.g(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.c0;
                    C3136l.g(objArr4, objArr4, 0, size, s2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.c0;
                C3136l.g(objArr5, objArr5, i3, i2, s2);
            } else {
                Object[] objArr6 = this.c0;
                i3 += objArr6.length;
                int i4 = s2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    C3136l.g(objArr6, objArr6, i3, i2, s2);
                } else {
                    C3136l.g(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.c0;
                    C3136l.g(objArr7, objArr7, 0, this.q + length, s2);
                }
            }
            this.q = i3;
            i(q(s2 - size), collection);
        } else {
            int i5 = s2 + size;
            if (s2 < s) {
                int i6 = size + s;
                Object[] objArr8 = this.c0;
                if (i6 <= objArr8.length) {
                    C3136l.g(objArr8, objArr8, i5, s2, s);
                } else if (i5 >= objArr8.length) {
                    C3136l.g(objArr8, objArr8, i5 - objArr8.length, s2, s);
                } else {
                    int length2 = s - (i6 - objArr8.length);
                    C3136l.g(objArr8, objArr8, 0, length2, s);
                    Object[] objArr9 = this.c0;
                    C3136l.g(objArr9, objArr9, i5, s2, length2);
                }
            } else {
                Object[] objArr10 = this.c0;
                C3136l.g(objArr10, objArr10, size, 0, s);
                Object[] objArr11 = this.c0;
                if (i5 >= objArr11.length) {
                    C3136l.g(objArr11, objArr11, i5 - objArr11.length, s2, objArr11.length);
                } else {
                    C3136l.g(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.c0;
                    C3136l.g(objArr12, objArr12, i5, s2, objArr12.length - size);
                }
            }
            i(s2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
