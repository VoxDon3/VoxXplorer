/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.g5;
import ax.b6.m4;
import ax.b6.r4;
import ax.b6.t4;
import ax.b6.u3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class n4
extends u3<Integer>
implements r4,
g5,
RandomAccess {
    private static final n4 e0 = new n4(new int[0], 0, false);
    private int[] c0;
    private int d0;

    n4() {
        this(new int[10], 0, true);
    }

    private n4(int[] nArray, int n8, boolean bl) {
        super(bl);
        this.c0 = nArray;
        this.d0 = n8;
    }

    public static n4 h() {
        return e0;
    }

    private final String k(int n8) {
        int n9 = this.d0;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    private final void l(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.k(n8));
    }

    @Override
    public final /* synthetic */ void add(int n8, Object object) {
        int n9;
        int n10 = (Integer)object;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            int[] nArray = this.c0;
            if (n9 < nArray.length) {
                System.arraycopy(nArray, n8, nArray, n8 + 1, n9 - n8);
            } else {
                object = new int[n9 * 3 / 2 + 1];
                System.arraycopy(nArray, 0, object, 0, n8);
                System.arraycopy(this.c0, n8, object, n8 + 1, this.d0 - n8);
                this.c0 = (int[])object;
            }
            this.c0[n8] = n10;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.k(n8));
    }

    @Override
    public final /* synthetic */ boolean add(Object object) {
        this.i((Integer)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Integer> n42) {
        this.e();
        m4.e(n42);
        if (!(n42 instanceof n4)) {
            return super.addAll(n42);
        }
        n42 = n42;
        int n8 = n42.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            int[] nArray = this.c0;
            if ((n8 = n9 + n8) > nArray.length) {
                this.c0 = Arrays.copyOf(nArray, n8);
            }
            System.arraycopy(n42.c0, 0, this.c0, this.d0, n42.d0);
            this.d0 = n8;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override
    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    @Override
    public final /* synthetic */ t4 d(int n8) {
        return this.o(n8);
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof n4)) {
            return super.equals(object);
        }
        object = (n4)object;
        if (this.d0 != ((n4)object).d0) {
            return false;
        }
        object = ((n4)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (this.c0[i8] == object[i8]) continue;
            return false;
        }
        return true;
    }

    public final int g(int n8) {
        this.l(n8);
        return this.c0[n8];
    }

    @Override
    public final /* synthetic */ Object get(int n8) {
        return this.g(n8);
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + this.c0[i8];
        }
        return n8;
    }

    public final void i(int n8) {
        this.e();
        int n9 = this.d0;
        int[] nArray = this.c0;
        if (n9 == nArray.length) {
            int[] nArray2 = new int[n9 * 3 / 2 + 1];
            System.arraycopy(nArray, 0, nArray2, 0, n9);
            this.c0 = nArray2;
        }
        nArray = this.c0;
        n9 = this.d0;
        this.d0 = n9 + 1;
        nArray[n9] = n8;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        int n8 = (Integer)object;
        int n9 = this.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            if (this.c0[i8] != n8) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public final r4 o(int n8) {
        if (n8 >= this.d0) {
            return new n4(Arrays.copyOf(this.c0, n8), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final /* synthetic */ Object remove(int n8) {
        this.e();
        this.l(n8);
        int[] nArray = this.c0;
        int n9 = nArray[n8];
        int n10 = this.d0;
        if (n8 < n10 - 1) {
            System.arraycopy(nArray, n8 + 1, nArray, n8, n10 - n8 - 1);
        }
        --this.d0;
        ++this.modCount;
        return n9;
    }

    @Override
    protected final void removeRange(int n8, int n9) {
        this.e();
        if (n9 >= n8) {
            int[] nArray = this.c0;
            System.arraycopy(nArray, n9, nArray, n8, this.d0 - n9);
            this.d0 -= n9 - n8;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final /* synthetic */ Object set(int n8, Object object) {
        int n9 = (Integer)object;
        this.e();
        this.l(n8);
        object = this.c0;
        Object object2 = object[n8];
        object[n8] = n9;
        return (int)object2;
    }

    @Override
    public final int size() {
        return this.d0;
    }
}

