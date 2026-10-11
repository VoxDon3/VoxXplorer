package ax.b6;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ax.b6.n4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1624n4 extends AbstractC1678u3<Integer> implements InterfaceC1655r4, InterfaceC1564g5, RandomAccess {
    private static final C1624n4 e0 = new C1624n4(new int[0], 0, false);
    private int[] c0;
    private int d0;

    C1624n4() {
        this(new int[10], 0, true);
    }

    public static C1624n4 h() {
        return e0;
    }

    private final String k(int i) {
        return "Index:" + i + ", Size:" + this.d0;
    }

    private final void l(int i) {
        if (i < 0 || i >= this.d0) {
            throw new IndexOutOfBoundsException(k(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(k(i));
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

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        e();
        C1616m4.e(collection);
        if (!(collection instanceof C1624n4)) {
            return super.addAll(collection);
        }
        C1624n4 c1624n4 = (C1624n4) collection;
        int i = c1624n4.d0;
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
        System.arraycopy(c1624n4.c0, 0, this.c0, this.d0, c1624n4.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1624n4)) {
            return super.equals(obj);
        }
        C1624n4 c1624n4 = (C1624n4) obj;
        if (this.d0 != c1624n4.d0) {
            return false;
        }
        int[] iArr = c1624n4.c0;
        for (int i = 0; i < this.d0; i++) {
            if (this.c0[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int g(int i) {
        l(i);
        return this.c0[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(g(i));
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + this.c0[i2];
        }
        return i;
    }

    public final void i(int i) {
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
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.c0[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // ax.b6.InterfaceC1671t4
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1655r4 d(int i) {
        if (i >= this.d0) {
            return new C1624n4(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        e();
        l(i);
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
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        l(i);
        int[] iArr = this.c0;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    private C1624n4(int[] iArr, int i, boolean z) {
        super(z);
        this.c0 = iArr;
        this.d0 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
