package ax.b6;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class U3 extends AbstractC1678u3<Double> implements InterfaceC1671t4<Double>, InterfaceC1564g5, RandomAccess {
    private double[] c0;
    private int d0;

    static {
        new U3(new double[0], 0, false);
    }

    U3() {
        this(new double[10], 0, true);
    }

    private final String i(int i) {
        return "Index:" + i + ", Size:" + this.d0;
    }

    private final void k(int i) {
        if (i < 0 || i >= this.d0) {
            throw new IndexOutOfBoundsException(i(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(i(i));
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
        this.c0[i] = doubleValue;
        this.d0++;
        ((AbstractList) this).modCount++;
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        e();
        C1616m4.e(collection);
        if (!(collection instanceof U3)) {
            return super.addAll(collection);
        }
        U3 u3 = (U3) collection;
        int i = u3.d0;
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
        System.arraycopy(u3.c0, 0, this.c0, this.d0, u3.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ax.b6.InterfaceC1671t4
    public final /* synthetic */ InterfaceC1671t4<Double> d(int i) {
        if (i >= this.d0) {
            return new U3(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U3)) {
            return super.equals(obj);
        }
        U3 u3 = (U3) obj;
        if (this.d0 != u3.d0) {
            return false;
        }
        double[] dArr = u3.c0;
        for (int i = 0; i < this.d0; i++) {
            if (Double.doubleToLongBits(this.c0[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void g(double d) {
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
    public final /* synthetic */ Object get(int i) {
        return Double.valueOf(h(i));
    }

    public final double h(int i) {
        k(i);
        return this.c0[i];
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + C1616m4.b(Double.doubleToLongBits(this.c0[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.c0[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        e();
        k(i);
        double[] dArr = this.c0;
        double d = dArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
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
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        e();
        k(i);
        double[] dArr = this.c0;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    private U3(double[] dArr, int i, boolean z) {
        super(z);
        this.c0 = dArr;
        this.d0 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
