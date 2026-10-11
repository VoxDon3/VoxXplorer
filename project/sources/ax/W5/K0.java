package ax.W5;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class K0 extends AbstractC1025e0 implements RandomAccess, M0, InterfaceC1064r1 {
    private static final K0 e0 = new K0(new int[0], 0, false);
    private int[] c0;
    private int d0;

    K0() {
        this(new int[10], 0, true);
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
        int intValue = ((Integer) obj).intValue();
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.c0;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.c0, i, iArr2, i + 1, this.d0 - i);
            this.c0 = iArr2;
        }
        this.c0[i] = intValue;
        this.d0++;
        ((AbstractList) this).modCount++;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = O0.d;
        collection.getClass();
        if (!(collection instanceof K0)) {
            return super.addAll(collection);
        }
        K0 k0 = (K0) collection;
        int i = k0.d0;
        if (i == 0) {
            return false;
        }
        int i2 = this.d0;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.c0;
        if (i3 > iArr.length) {
            this.c0 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(k0.c0, 0, this.c0, this.d0, k0.d0);
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
        if (!(obj instanceof K0)) {
            return super.equals(obj);
        }
        K0 k0 = (K0) obj;
        if (this.d0 != k0.d0) {
            return false;
        }
        int[] iArr = k0.c0;
        for (int i = 0; i < this.d0; i++) {
            if (this.c0[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i) {
        e();
        int i2 = this.d0;
        int[] iArr = this.c0;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.c0 = iArr2;
        }
        int[] iArr3 = this.c0;
        int i3 = this.d0;
        this.d0 = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        i(i);
        return Integer.valueOf(this.c0[i]);
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + this.c0[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.d0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c0[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        e();
        i(i);
        int[] iArr = this.c0;
        int i2 = iArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.c0;
        System.arraycopy(iArr, i2, iArr, i, this.d0 - i2);
        this.d0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        i(i);
        int[] iArr = this.c0;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    @Override // ax.W5.M0
    public final /* bridge */ /* synthetic */ M0 v(int i) {
        if (i >= this.d0) {
            return new K0(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    private K0(int[] iArr, int i, boolean z) {
        super(z);
        this.c0 = iArr;
        this.d0 = i;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
