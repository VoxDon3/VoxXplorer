/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.g5;
import ax.b6.m4;
import ax.b6.t4;
import ax.b6.u3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class U3
extends u3<Double>
implements t4<Double>,
g5,
RandomAccess {
    private double[] c0;
    private int d0;

    static {
        new U3(new double[0], 0, false);
    }

    U3() {
        this(new double[10], 0, true);
    }

    private U3(double[] dArray, int n8, boolean bl) {
        super(bl);
        this.c0 = dArray;
        this.d0 = n8;
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
        double d8 = (Double)object;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            object = this.c0;
            if (n9 < ((Object)object).length) {
                System.arraycopy(object, n8, object, n8 + 1, n9 - n8);
            } else {
                double[] dArray = new double[n9 * 3 / 2 + 1];
                System.arraycopy(object, 0, dArray, 0, n8);
                System.arraycopy(this.c0, n8, dArray, n8 + 1, this.d0 - n8);
                this.c0 = dArray;
            }
            this.c0[n8] = d8;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    @Override
    public final /* synthetic */ boolean add(Object object) {
        this.g((Double)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Double> u32) {
        this.e();
        m4.e(u32);
        if (!(u32 instanceof U3)) {
            return super.addAll(u32);
        }
        u32 = u32;
        int n8 = u32.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            double[] dArray = this.c0;
            if ((n8 = n9 + n8) > dArray.length) {
                this.c0 = Arrays.copyOf(dArray, n8);
            }
            System.arraycopy(u32.c0, 0, this.c0, this.d0, u32.d0);
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
        if (n8 >= this.d0) {
            return new U3(Arrays.copyOf(this.c0, n8), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof U3)) {
            return super.equals(object);
        }
        object = (U3)object;
        if (this.d0 != ((U3)object).d0) {
            return false;
        }
        object = ((U3)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (Double.doubleToLongBits(this.c0[i8]) == Double.doubleToLongBits((double)object[i8])) continue;
            return false;
        }
        return true;
    }

    public final void g(double d8) {
        this.e();
        int n8 = this.d0;
        double[] dArray = this.c0;
        if (n8 == dArray.length) {
            double[] dArray2 = new double[n8 * 3 / 2 + 1];
            System.arraycopy(dArray, 0, dArray2, 0, n8);
            this.c0 = dArray2;
        }
        dArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        dArray[n8] = d8;
    }

    @Override
    public final /* synthetic */ Object get(int n8) {
        return this.h(n8);
    }

    public final double h(int n8) {
        this.k(n8);
        return this.c0[n8];
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + m4.b(Double.doubleToLongBits(this.c0[i8]));
        }
        return n8;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Double)) {
            return -1;
        }
        double d8 = (Double)object;
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.c0[i8] != d8) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public final /* synthetic */ Object remove(int n8) {
        this.e();
        this.k(n8);
        double[] dArray = this.c0;
        double d8 = dArray[n8];
        int n9 = this.d0;
        if (n8 < n9 - 1) {
            System.arraycopy(dArray, n8 + 1, dArray, n8, n9 - n8 - 1);
        }
        --this.d0;
        ++this.modCount;
        return d8;
    }

    @Override
    protected final void removeRange(int n8, int n9) {
        this.e();
        if (n9 >= n8) {
            double[] dArray = this.c0;
            System.arraycopy(dArray, n9, dArray, n8, this.d0 - n9);
            this.d0 -= n9 - n8;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override
    public final /* synthetic */ Object set(int n8, Object object) {
        double d8 = (Double)object;
        this.e();
        this.k(n8);
        object = this.c0;
        Object object2 = object[n8];
        object[n8] = d8;
        return (double)object2;
    }

    @Override
    public final int size() {
        return this.d0;
    }
}

