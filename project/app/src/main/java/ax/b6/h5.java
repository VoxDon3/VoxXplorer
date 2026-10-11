/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.t4;
import ax.b6.u3;
import java.util.Arrays;
import java.util.RandomAccess;

final class h5<E>
extends u3<E>
implements RandomAccess {
    private static final h5<Object> e0 = new h5<Object>(new Object[0], 0, false);
    private E[] c0;
    private int d0;

    private h5(E[] EArray, int n8, boolean bl) {
        super(bl);
        this.c0 = EArray;
        this.d0 = n8;
    }

    private final String g(int n8) {
        int n9 = this.d0;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    private final void h(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n8));
    }

    public static <E> h5<E> i() {
        return e0;
    }

    @Override
    public final void add(int n8, E e8) {
        int n9;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            E[] EArray = this.c0;
            if (n9 < EArray.length) {
                System.arraycopy(EArray, n8, EArray, n8 + 1, n9 - n8);
            } else {
                Object[] objectArray = new Object[n9 * 3 / 2 + 1];
                System.arraycopy(EArray, 0, objectArray, 0, n8);
                System.arraycopy(this.c0, n8, objectArray, n8 + 1, this.d0 - n8);
                this.c0 = objectArray;
            }
            this.c0[n8] = e8;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n8));
    }

    @Override
    public final boolean add(E e8) {
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
    public final /* synthetic */ t4 d(int n8) {
        if (n8 >= this.d0) {
            return new h5<E>(Arrays.copyOf(this.c0, n8), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final E get(int n8) {
        this.h(n8);
        return this.c0[n8];
    }

    @Override
    public final E remove(int n8) {
        this.e();
        this.h(n8);
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
    public final E set(int n8, E e8) {
        this.e();
        this.h(n8);
        E[] EArray = this.c0;
        E e9 = EArray[n8];
        EArray[n8] = e8;
        ++this.modCount;
        return e9;
    }

    @Override
    public final int size() {
        return this.d0;
    }
}

