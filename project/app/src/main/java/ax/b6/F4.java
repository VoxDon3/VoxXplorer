/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.g5;
import ax.b6.m4;
import ax.b6.q4;
import ax.b6.t4;
import ax.b6.u3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class F4
extends u3<Long>
implements q4,
g5,
RandomAccess {
    private static final F4 e0 = new F4(new long[0], 0, false);
    private long[] c0;
    private int d0;

    F4() {
        this(new long[10], 0, true);
    }

    private F4(long[] lArray, int n8, boolean bl) {
        super(bl);
        this.c0 = lArray;
        this.d0 = n8;
    }

    public static F4 h() {
        return e0;
    }

    private final String i(int n8) {
        int n9 = this.d0;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    private final void k(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    @Override
    public final /* synthetic */ void add(int n8, Object object) {
        int n9;
        long l8 = (Long)object;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            long[] lArray = this.c0;
            if (n9 < lArray.length) {
                System.arraycopy(lArray, n8, lArray, n8 + 1, n9 - n8);
            } else {
                object = new long[n9 * 3 / 2 + 1];
                System.arraycopy(lArray, 0, object, 0, n8);
                System.arraycopy(this.c0, n8, object, n8 + 1, this.d0 - n8);
                this.c0 = (long[])object;
            }
            this.c0[n8] = l8;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    @Override
    public final /* synthetic */ boolean add(Object object) {
        this.g((Long)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Long> f42) {
        this.e();
        m4.e(f42);
        if (!(f42 instanceof F4)) {
            return super.addAll(f42);
        }
        f42 = f42;
        int n8 = f42.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            long[] lArray = this.c0;
            if ((n9 += n8) > lArray.length) {
                this.c0 = Arrays.copyOf(lArray, n9);
            }
            System.arraycopy(f42.c0, 0, this.c0, this.d0, f42.d0);
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
    public final /* synthetic */ t4 d(int n8) {
        return this.o(n8);
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof F4)) {
            return super.equals(object);
        }
        object = (F4)object;
        if (this.d0 != ((F4)object).d0) {
            return false;
        }
        object = ((F4)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (this.c0[i8] == object[i8]) continue;
            return false;
        }
        return true;
    }

    public final void g(long l8) {
        this.e();
        int n8 = this.d0;
        long[] lArray = this.c0;
        if (n8 == lArray.length) {
            long[] lArray2 = new long[n8 * 3 / 2 + 1];
            System.arraycopy(lArray, 0, lArray2, 0, n8);
            this.c0 = lArray2;
        }
        lArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        lArray[n8] = l8;
    }

    @Override
    public final /* synthetic */ Object get(int n8) {
        return this.m(n8);
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + m4.b(this.c0[i8]);
        }
        return n8;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Long)) {
            return -1;
        }
        long l8 = (Long)object;
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.c0[i8] != l8) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public final long m(int n8) {
        this.k(n8);
        return this.c0[n8];
    }

    @Override
    public final q4 o(int n8) {
        if (n8 >= this.d0) {
            return new F4(Arrays.copyOf(this.c0, n8), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final /* synthetic */ Object remove(int n8) {
        this.e();
        this.k(n8);
        long[] lArray = this.c0;
        long l8 = lArray[n8];
        int n9 = this.d0;
        if (n8 < n9 - 1) {
            System.arraycopy(lArray, n8 + 1, lArray, n8, n9 - n8 - 1);
        }
        --this.d0;
        ++this.modCount;
        return l8;
    }

    @Override
    protected final void removeRange(int n8, int n9) {
        this.e();
        if (n9 >= n8) {
            long[] lArray = this.c0;
            System.arraycopy(lArray, n9, lArray, n8, this.d0 - n9);
            this.d0 -= n9 - n8;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final /* synthetic */ Object set(int n8, Object object) {
        long l8 = (Long)object;
        this.e();
        this.k(n8);
        object = this.c0;
        Object object2 = object[n8];
        object[n8] = l8;
        return (long)object2;
    }

    @Override
    public final int size() {
        return this.d0;
    }
}

