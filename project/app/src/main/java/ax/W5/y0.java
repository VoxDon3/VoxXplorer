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

final class y0
extends e0
implements RandomAccess,
M0,
r1 {
    private static final y0 e0 = new y0(new double[0], 0, false);
    private double[] c0;
    private int d0;

    y0() {
        this(new double[10], 0, true);
    }

    private y0(double[] dArray, int n8, boolean bl) {
        super(bl);
        this.c0 = dArray;
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
        throw new IndexOutOfBoundsException(this.h(n8));
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.e();
        Object[] objectArray = O0.d;
        collection.getClass();
        if (!(collection instanceof y0)) {
            return super.addAll(collection);
        }
        collection = (y0)collection;
        int n8 = ((y0)collection).d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            objectArray = this.c0;
            if ((n8 = n9 + n8) > objectArray.length) {
                this.c0 = Arrays.copyOf((double[])objectArray, n8);
            }
            System.arraycopy(((y0)collection).c0, 0, this.c0, this.d0, ((y0)collection).d0);
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
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof y0)) {
            return super.equals(object);
        }
        object = (y0)object;
        if (this.d0 != ((y0)object).d0) {
            return false;
        }
        object = ((y0)object).c0;
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

    public final /* synthetic */ Object get(int n8) {
        this.i(n8);
        return this.c0[n8];
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            long l8 = Double.doubleToLongBits(this.c0[i8]);
            byte[] byArray = O0.d;
            n8 = n8 * 31 + (int)(l8 ^ l8 >>> 32);
        }
        return n8;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Double)) {
            return -1;
        }
        double d8 = (Double)object;
        int n8 = this.d0;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.c0[i8] != d8) continue;
            return i8;
        }
        return -1;
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
    public final int size() {
        return this.d0;
    }
}

