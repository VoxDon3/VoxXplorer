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

final class m
extends c<Double>
implements A.b,
RandomAccess,
b0 {
    private static final m e0;
    private double[] c0;
    private int d0;

    static {
        m m8;
        e0 = m8 = new m(new double[0], 0);
        m8.F();
    }

    m() {
        this(new double[10], 0);
    }

    private m(double[] dArray, int n8) {
        this.c0 = dArray;
        this.d0 = n8;
    }

    private void k(int n8, double d8) {
        int n9;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            double[] dArray = this.c0;
            if (n9 < dArray.length) {
                System.arraycopy(dArray, n8, dArray, n8 + 1, n9 - n8);
            } else {
                double[] dArray2 = new double[n9 * 3 / 2 + 1];
                System.arraycopy(dArray, 0, dArray2, 0, n8);
                System.arraycopy(this.c0, n8, dArray2, n8 + 1, this.d0 - n8);
                this.c0 = dArray2;
            }
            this.c0[n8] = d8;
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
    public boolean addAll(Collection<? extends Double> object) {
        this.e();
        A.a(object);
        if (!(object instanceof m)) {
            return super.addAll(object);
        }
        m m8 = (m)object;
        int n8 = m8.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            object = this.c0;
            if ((n9 += n8) > ((Object)object).length) {
                this.c0 = Arrays.copyOf((double[])object, n9);
            }
            System.arraycopy(m8.c0, 0, this.c0, this.d0, m8.d0);
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
        if (!(object instanceof m)) {
            return super.equals(object);
        }
        object = (m)object;
        if (this.d0 != ((m)object).d0) {
            return false;
        }
        object = ((m)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (Double.doubleToLongBits(this.c0[i8]) == Double.doubleToLongBits((double)object[i8])) continue;
            return false;
        }
        return true;
    }

    public void g(int n8, Double d8) {
        this.k(n8, d8);
    }

    public boolean h(Double d8) {
        this.i(d8);
        return true;
    }

    @Override
    public int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + A.f(Double.doubleToLongBits(this.c0[i8]));
        }
        return n8;
    }

    public void i(double d8) {
        double[] dArray;
        this.e();
        int n8 = this.d0;
        double[] dArray2 = this.c0;
        if (n8 == dArray2.length) {
            dArray = new double[n8 * 3 / 2 + 1];
            System.arraycopy(dArray2, 0, dArray, 0, n8);
            this.c0 = dArray;
        }
        dArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        dArray[n8] = d8;
    }

    public Double n(int n8) {
        return this.p(n8);
    }

    public double p(int n8) {
        this.l(n8);
        return this.c0[n8];
    }

    public A.b r(int n8) {
        if (n8 >= this.d0) {
            return new m(Arrays.copyOf(this.c0, n8), this.d0);
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
            double[] dArray = this.c0;
            System.arraycopy(dArray, n9, dArray, n8, this.d0 - n9);
            this.d0 -= n9 - n8;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Double s(int n8) {
        this.e();
        this.l(n8);
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
    public int size() {
        return this.d0;
    }

    public Double t(int n8, Double d8) {
        return this.u(n8, d8);
    }

    public double u(int n8, double d8) {
        this.e();
        this.l(n8);
        double[] dArray = this.c0;
        double d9 = dArray[n8];
        dArray[n8] = d8;
        return d9;
    }
}

