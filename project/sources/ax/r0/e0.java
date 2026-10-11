package ax.r0;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class e0<E> extends AbstractC2916c<E> implements RandomAccess {
    private static final e0<Object> e0;
    private E[] c0;
    private int d0;

    static {
        e0<Object> e0Var = new e0<>(new Object[0], 0);
        e0 = e0Var;
        e0Var.F();
    }

    private e0(E[] eArr, int i) {
        this.c0 = eArr;
        this.d0 = i;
    }

    private static <E> E[] g(int i) {
        return (E[]) new Object[i];
    }

    public static <E> e0<E> h() {
        return (e0<E>) e0;
    }

    private void i(int i) {
        if (i < 0 || i >= this.d0) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    private String k(int i) {
        return "Index:" + i + ", Size:" + this.d0;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
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

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        i(i);
        return this.c0[i];
    }

    @Override // ax.r0.C2904A.i
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e0<E> L(int i) {
        if (i >= this.d0) {
            return new e0<>(Arrays.copyOf(this.c0, i), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        e();
        i(i);
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
    public E set(int i, E e) {
        e();
        i(i);
        E[] eArr = this.c0;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d0;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        e();
        if (i >= 0 && i <= (i2 = this.d0)) {
            E[] eArr = this.c0;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) g(((i2 * 3) / 2) + 1);
                System.arraycopy(this.c0, 0, eArr2, 0, i);
                System.arraycopy(this.c0, i, eArr2, i + 1, this.d0 - i);
                this.c0 = eArr2;
            }
            this.c0[i] = e;
            this.d0++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i));
    }
}
