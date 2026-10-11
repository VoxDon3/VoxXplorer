/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.c;
import java.util.Arrays;
import java.util.RandomAccess;

final class e0<E>
extends c<E>
implements RandomAccess {
    private static final e0<Object> e0;
    private E[] c0;
    private int d0;

    static {
        e0<Object> e02 = new e0<Object>(new Object[0], 0);
        e0 = e02;
        e02.F();
    }

    private e0(E[] EArray, int n8) {
        this.c0 = EArray;
        this.d0 = n8;
    }

    private static <E> E[] g(int n8) {
        return new Object[n8];
    }

    public static <E> e0<E> h() {
        return e0;
    }

    private void i(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.k(n8));
    }

    private String k(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(this.d0);
        return stringBuilder.toString();
    }

    @Override
    public void add(int n8, E e8) {
        int n9;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            E[] EArray = this.c0;
            if (n9 < EArray.length) {
                System.arraycopy(EArray, n8, EArray, n8 + 1, n9 - n8);
            } else {
                EArray = ax.r0.e0.g(n9 * 3 / 2 + 1);
                System.arraycopy(this.c0, 0, EArray, 0, n8);
                System.arraycopy(this.c0, n8, EArray, n8 + 1, this.d0 - n8);
                this.c0 = EArray;
            }
            this.c0[n8] = e8;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.k(n8));
    }

    @Override
    public boolean add(E e8) {
        this.e();
        int n8 = this.d0;
        E[] EArray = this.c0;
        if (n8 == EArray.length) {
            this.c0 = Arrays.copyOf(EArray, n8 * 3 / 2 + 1);
        }
        EArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        EArray[n8] = e8;
        ++this.modCount;
        return true;
    }

    @Override
    public E get(int n8) {
        this.i(n8);
        return this.c0[n8];
    }

    public e0<E> l(int n8) {
        if (n8 >= this.d0) {
            return new e0<E>(Arrays.copyOf(this.c0, n8), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public E remove(int n8) {
        this.e();
        this.i(n8);
        E[] EArray = this.c0;
        E e8 = EArray[n8];
        int n9 = this.d0;
        if (n8 < n9 - 1) {
            System.arraycopy(EArray, n8 + 1, EArray, n8, n9 - n8 - 1);
        }
        --this.d0;
        ++this.modCount;
        return e8;
    }

    @Override
    public E set(int n8, E e8) {
        this.e();
        this.i(n8);
        E[] EArray = this.c0;
        E e9 = EArray[n8];
        EArray[n8] = e8;
        ++this.modCount;
        return e9;
    }

    @Override
    public int size() {
        return this.d0;
    }
}

