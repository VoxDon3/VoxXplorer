package ax.W5;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ax.W5.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1084y0 extends AbstractC1025e0 implements RandomAccess, M0, InterfaceC1064r1 {
    private static final C1084y0 e0 = new C1084y0(new double[0], 0, false);
    private double[] c0;
    private int d0;

    C1084y0() {
        this(new double[10], 0, true);
    }

    private final String h(int i) {
        return "Index:" + i + ", Size:" + this.d0;
    }

    private final void i(int i) {
        if (i < 0 || i >= this.d0) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(h(i));
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

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = O0.d;
        collection.getClass();
        if (!(collection instanceof C1084y0)) {
            return super.addAll(collection);
        }
        C1084y0 c1084y0 = (C1084y0) collection;
        int i = c1084y0.d0;
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
        System.arraycopy(c1084y0.c0, 0, this.c0, this.d0, c1084y0.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1084y0)) {
            return super.equals(obj);
        }
        C1084y0 c1084y0 = (C1084y0) obj;
        if (this.d0 != c1084y0.d0) {
            return false;
        }
        double[] dArr = c1084y0.c0;
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
        i(i);
        return Double.valueOf(this.c0[i]);
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.c0[i2]);
            byte[] bArr = O0.d;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.d0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c0[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        e();
        i(i);
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
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        e();
        i(i);
        double[] dArr = this.c0;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    @Override // ax.W5.M0
    public final /* bridge */ /* synthetic */ M0 v(int i) {
        if (i >= this.d0) {
            return new C1084y0(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    private C1084y0(double[] dArr, int i, boolean z) {
        super(z);
        this.c0 = dArr;
        this.d0 = i;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Double) obj).doubleValue());
        return true;
    }
}
