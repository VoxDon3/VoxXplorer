/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.M0;
import ax.W5.O0;
import ax.W5.e0;
import ax.W5.r1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class K0
extends e0
implements RandomAccess,
M0,
r1 {
    private static final K0 e0 = new K0(new int[0], 0, false);
    private int[] c0;
    private int d0;

    K0() {
        this(new int[10], 0, true);
    }

    private K0(int[] nArray, int n8, boolean bl) {
        super(bl);
        this.c0 = nArray;
        this.d0 = n8;
    }

    private final String h(int n8) {
        int n9 = this.d0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    private final void i(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n8));
    }

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
        throw new IndexOutOfBoundsException(this.h(n8));
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.e();
        Object[] objectArray = O0.d;
        collection.getClass();
        if (!(collection instanceof K0)) {
            return super.addAll(collection);
        }
        collection = (K0)collection;
        int n8 = ((K0)collection).d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            objectArray = this.c0;
            if ((n9 += n8) > objectArray.length) {
                this.c0 = Arrays.copyOf((int[])objectArray, n9);
            }
            System.arraycopy(((K0)collection).c0, 0, this.c0, this.d0, ((K0)collection).d0);
            this.d0 = n9;
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
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof K0)) {
            return super.equals(object);
        }
        object = (K0)object;
        if (this.d0 != ((K0)object).d0) {
            return false;
        }
        object = ((K0)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (this.c0[i8] == object[i8]) continue;
            return false;
        }
        return true;
    }

    public final void g(int n8) {
        int[] nArray;
        this.e();
        int n9 = this.d0;
        int[] nArray2 = this.c0;
        if (n9 == nArray2.length) {
            nArray = new int[n9 * 3 / 2 + 1];
            System.arraycopy(nArray2, 0, nArray, 0, n9);
            this.c0 = nArray;
        }
        nArray = this.c0;
        n9 = this.d0;
        this.d0 = n9 + 1;
        nArray[n9] = n8;
    }

    public final /* synthetic */ Object get(int n8) {
        this.i(n8);
        return this.c0[n8];
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + this.c0[i8];
        }
        return n8;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Integer)) {
            return -1;
        }
        int n8 = (Integer)object;
        int n9 = this.d0;
        for (int i8 = 0; i8 < n9; ++i8) {
            if (this.c0[i8] != n8) continue;
            return i8;
        }
        return -1;
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
    public final int size() {
        return this.d0;
    }
}

