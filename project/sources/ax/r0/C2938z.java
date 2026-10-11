package ax.r0;

import ax.r0.C2904A;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ax.r0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2938z extends AbstractC2916c<Integer> implements C2904A.g, RandomAccess, b0 {
    private static final C2938z e0;
    private int[] c0;
    private int d0;

    static {
        C2938z c2938z = new C2938z(new int[0], 0);
        e0 = c2938z;
        c2938z.F();
    }

    C2938z() {
        this(new int[10], 0);
    }

    private void k(int i, int i2) {
        int i3;
        e();
        if (i < 0 || i > (i3 = this.d0)) {
            throw new IndexOutOfBoundsException(q(i));
        }
        int[] iArr = this.c0;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.c0, i, iArr2, i + 1, this.d0 - i);
            this.c0 = iArr2;
        }
        this.c0[i] = i2;
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
    public boolean addAll(Collection<? extends Integer> collection) {
        e();
        C2904A.a(collection);
        if (!(collection instanceof C2938z)) {
            return super.addAll(collection);
        }
        C2938z c2938z = (C2938z) collection;
        int i = c2938z.d0;
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
        System.arraycopy(c2938z.c0, 0, this.c0, this.d0, c2938z.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2938z)) {
            return super.equals(obj);
        }
        C2938z c2938z = (C2938z) obj;
        if (this.d0 != c2938z.d0) {
            return false;
        }
        int[] iArr = c2938z.c0;
        for (int i = 0; i < this.d0; i++) {
            if (this.c0[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void add(int i, Integer num) {
        k(i, num.intValue());
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        i(num.intValue());
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + this.c0[i2];
        }
        return i;
    }

    public void i(int i) {
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
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer get(int i) {
        return Integer.valueOf(p(i));
    }

    public int p(int i) {
        l(i);
        return this.c0[i];
    }

    @Override // ax.r0.C2904A.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2904A.g L(int i) {
        if (i >= this.d0) {
            return new C2938z(Arrays.copyOf(this.c0, i), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
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
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d0;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(u(i, num.intValue()));
    }

    public int u(int i, int i2) {
        e();
        l(i);
        int[] iArr = this.c0;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    private C2938z(int[] iArr, int i) {
        this.c0 = iArr;
        this.d0 = i;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        for (int i = 0; i < this.d0; i++) {
            if (obj.equals(Integer.valueOf(this.c0[i]))) {
                int[] iArr = this.c0;
                System.arraycopy(iArr, i + 1, iArr, i, (this.d0 - i) - 1);
                this.d0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
