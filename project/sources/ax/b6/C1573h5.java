package ax.b6;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: ax.b6.h5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1573h5<E> extends AbstractC1678u3<E> implements RandomAccess {
    private static final C1573h5<Object> e0 = new C1573h5<>(new Object[0], 0, false);
    private E[] c0;
    private int d0;

    private C1573h5(E[] eArr, int i, boolean z) {
        super(z);
        this.c0 = eArr;
        this.d0 = i;
    }

    private final String g(int i) {
        return "Index:" + i + ", Size:" + this.d0;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.d0) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public static <E> C1573h5<E> i() {
        return (C1573h5<E>) e0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        E[] eArr = this.c0;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.c0, i, eArr2, i + 1, this.d0 - i);
            this.c0 = eArr2;
        }
        this.c0[i] = e;
        this.d0++;
        ((AbstractList) this).modCount++;
    }

    @Override // ax.b6.InterfaceC1671t4
    public final /* synthetic */ InterfaceC1671t4 d(int i) {
        if (i >= this.d0) {
            return new C1573h5(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        h(i);
        return this.c0[i];
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        e();
        h(i);
        E[] eArr = this.c0;
        E e = eArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (r2 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        e();
        h(i);
        E[] eArr = this.c0;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        e();
        int i = this.d0;
        E[] eArr = this.c0;
        if (i == eArr.length) {
            this.c0 = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.c0;
        int i2 = this.d0;
        this.d0 = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
