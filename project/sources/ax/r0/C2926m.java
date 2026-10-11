package ax.r0;

import ax.r0.C2904A;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ax.r0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2926m extends AbstractC2916c<Double> implements C2904A.b, RandomAccess, b0 {
    private static final C2926m e0;
    private double[] c0;
    private int d0;

    static {
        C2926m c2926m = new C2926m(new double[0], 0);
        e0 = c2926m;
        c2926m.F();
    }

    C2926m() {
        this(new double[10], 0);
    }

    private void k(int i, double d) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(q(i));
        }
        double[] dArr = this.c0;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.c0, i, dArr2, i + 1, this.d0 - i);
            this.c0 = dArr2;
        }
        this.c0[i] = d;
        this.d0++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i) {
        if (i < 0 || i >= this.d0) {
            throw new IndexOutOfBoundsException(q(i));
        }
    }

    private String q(int i) {
        return "Index:" + i + ", Size:" + this.d0;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        e();
        C2904A.a(collection);
        if (!(collection instanceof C2926m)) {
            return super.addAll(collection);
        }
        C2926m c2926m = (C2926m) collection;
        int i = c2926m.d0;
        if (i == 0) {
            return false;
        }
        int i2 = this.d0;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.c0;
        if (i3 > dArr.length) {
            this.c0 = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c2926m.c0, 0, this.c0, this.d0, c2926m.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2926m)) {
            return super.equals(obj);
        }
        C2926m c2926m = (C2926m) obj;
        if (this.d0 != c2926m.d0) {
            return false;
        }
        double[] dArr = c2926m.c0;
        for (int i = 0; i < this.d0; i++) {
            if (Double.doubleToLongBits(this.c0[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void add(int i, Double d) {
        k(i, d.doubleValue());
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d) {
        i(d.doubleValue());
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + C2904A.f(Double.doubleToLongBits(this.c0[i2]));
        }
        return i;
    }

    public void i(double d) {
        e();
        int i = this.d0;
        double[] dArr = this.c0;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.c0 = dArr2;
        }
        double[] dArr3 = this.c0;
        int i2 = this.d0;
        this.d0 = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Double get(int i) {
        return Double.valueOf(p(i));
    }

    public double p(int i) {
        l(i);
        return this.c0[i];
    }

    @Override // ax.r0.C2904A.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2904A.b L(int i) {
        if (i >= this.d0) {
            return new C2926m(Arrays.copyOf(this.c0, i), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.c0;
        System.arraycopy(dArr, i2, dArr, i, this.d0 - i2);
        this.d0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Double remove(int i) {
        e();
        l(i);
        double[] dArr = this.c0;
        double d = dArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d0;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Double set(int i, Double d) {
        return Double.valueOf(u(i, d.doubleValue()));
    }

    public double u(int i, double d) {
        e();
        l(i);
        double[] dArr = this.c0;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    private C2926m(double[] dArr, int i) {
        this.c0 = dArr;
        this.d0 = i;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        for (int i = 0; i < this.d0; i++) {
            if (obj.equals(Double.valueOf(this.c0[i]))) {
                double[] dArr = this.c0;
                System.arraycopy(dArr, i + 1, dArr, i, (this.d0 - i) - 1);
                this.d0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
