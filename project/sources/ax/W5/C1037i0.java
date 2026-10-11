package ax.W5;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ax.W5.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1037i0 extends AbstractC1025e0 implements RandomAccess, M0, InterfaceC1064r1 {
    private static final C1037i0 e0 = new C1037i0(new boolean[0], 0, false);
    private boolean[] c0;
    private int d0;

    C1037i0() {
        this(new boolean[10], 0, true);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        boolean[] zArr = this.c0;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.c0, i, zArr2, i + 1, this.d0 - i);
            this.c0 = zArr2;
        }
        this.c0[i] = booleanValue;
        this.d0++;
        ((AbstractList) this).modCount++;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = O0.d;
        collection.getClass();
        if (!(collection instanceof C1037i0)) {
            return super.addAll(collection);
        }
        C1037i0 c1037i0 = (C1037i0) collection;
        int i = c1037i0.d0;
        if (i == 0) {
            return false;
        }
        int i2 = this.d0;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.c0;
        if (i3 > zArr.length) {
            this.c0 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c1037i0.c0, 0, this.c0, this.d0, c1037i0.d0);
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
        if (!(obj instanceof C1037i0)) {
            return super.equals(obj);
        }
        C1037i0 c1037i0 = (C1037i0) obj;
        if (this.d0 != c1037i0.d0) {
            return false;
        }
        boolean[] zArr = c1037i0.c0;
        for (int i = 0; i < this.d0; i++) {
            if (this.c0[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void g(boolean z) {
        e();
        int i = this.d0;
        boolean[] zArr = this.c0;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.c0 = zArr2;
        }
        boolean[] zArr3 = this.c0;
        int i2 = this.d0;
        this.d0 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        i(i);
        return Boolean.valueOf(this.c0[i]);
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + O0.a(this.c0[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.d0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c0[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        e();
        i(i);
        boolean[] zArr = this.c0;
        boolean z = zArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.c0;
        System.arraycopy(zArr, i2, zArr, i, this.d0 - i2);
        this.d0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e();
        i(i);
        boolean[] zArr = this.c0;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    @Override // ax.W5.M0
    public final /* bridge */ /* synthetic */ M0 v(int i) {
        if (i >= this.d0) {
            return new C1037i0(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    private C1037i0(boolean[] zArr, int i, boolean z) {
        super(z);
        this.c0 = zArr;
        this.d0 = i;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Boolean) obj).booleanValue());
        return true;
    }
}
