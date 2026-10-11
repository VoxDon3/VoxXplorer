/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.b0;
import ax.r0.c;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class I
extends c<Long>
implements A.h,
RandomAccess,
b0 {
    private static final I e0;
    private long[] c0;
    private int d0;

    static {
        I i8;
        e0 = i8 = new I(new long[0], 0);
        i8.F();
    }

    I() {
        this(new long[10], 0);
    }

    private I(long[] lArray, int n8) {
        this.c0 = lArray;
        this.d0 = n8;
    }

    private void i(int n8, long l8) {
        int n9;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            long[] lArray = this.c0;
            if (n9 < lArray.length) {
                System.arraycopy(lArray, n8, lArray, n8 + 1, n9 - n8);
            } else {
                long[] lArray2 = new long[n9 * 3 / 2 + 1];
                System.arraycopy(lArray, 0, lArray2, 0, n8);
                System.arraycopy(this.c0, n8, lArray2, n8 + 1, this.d0 - n8);
                this.c0 = lArray2;
            }
            this.c0[n8] = l8;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.q(n8));
    }

    private void l(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.q(n8));
    }

    private String q(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(this.d0);
        return stringBuilder.toString();
    }

    @Override
    public boolean addAll(Collection<? extends Long> i8) {
        this.e();
        A.a(i8);
        if (!(i8 instanceof I)) {
            return super.addAll(i8);
        }
        i8 = i8;
        int n8 = i8.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            long[] lArray = this.c0;
            if ((n9 += n8) > lArray.length) {
                this.c0 = Arrays.copyOf(lArray, n9);
            }
            System.arraycopy(i8.c0, 0, this.c0, this.d0, i8.d0);
            this.d0 = n9;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof I)) {
            return super.equals(object);
        }
        object = (I)object;
        if (this.d0 != ((I)object).d0) {
            return false;
        }
        object = ((I)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (this.c0[i8] == object[i8]) continue;
            return false;
        }
        return true;
    }

    public void g(int n8, Long l8) {
        this.i(n8, l8);
    }

    public boolean h(Long l8) {
        this.k(l8);
        return true;
    }

    @Override
    public int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + A.f(this.c0[i8]);
        }
        return n8;
    }

    public void k(long l8) {
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

    public Long n(int n8) {
        return this.p(n8);
    }

    public long p(int n8) {
        this.l(n8);
        return this.c0[n8];
    }

    public A.h r(int n8) {
        if (n8 >= this.d0) {
            return new I(Arrays.copyOf(this.c0, n8), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public boolean remove(Object object) {
        this.e();
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (!object.equals(this.c0[i8])) continue;
            object = this.c0;
            System.arraycopy(object, i8 + 1, object, i8, this.d0 - i8 - 1);
            --this.d0;
            ++this.modCount;
            return true;
        }
        return false;
    }

    @Override
    protected void removeRange(int n8, int n9) {
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

    public Long s(int n8) {
        this.e();
        this.l(n8);
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
    public int size() {
        return this.d0;
    }

    public Long t(int n8, Long l8) {
        return this.u(n8, l8);
    }

    public long u(int n8, long l8) {
        this.e();
        this.l(n8);
        long[] lArray = this.c0;
        long l9 = lArray[n8];
        lArray[n8] = l8;
        return l9;
    }
}

