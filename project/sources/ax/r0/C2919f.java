package ax.r0;

import ax.r0.C2904A;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ax.r0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2919f extends AbstractC2916c<Boolean> implements C2904A.a, RandomAccess, b0 {
    private static final C2919f e0;
    private boolean[] c0;
    private int d0;

    static {
        C2919f c2919f = new C2919f(new boolean[0], 0);
        e0 = c2919f;
        c2919f.F();
    }

    C2919f() {
        this(new boolean[10], 0);
    }

    private void i(int i, boolean z) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(q(i));
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
        this.c0[i] = z;
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
    public boolean addAll(Collection<? extends Boolean> collection) {
        e();
        C2904A.a(collection);
        if (!(collection instanceof C2919f)) {
            return super.addAll(collection);
        }
        C2919f c2919f = (C2919f) collection;
        int i = c2919f.d0;
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
        System.arraycopy(c2919f.c0, 0, this.c0, this.d0, c2919f.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2919f)) {
            return super.equals(obj);
        }
        C2919f c2919f = (C2919f) obj;
        if (this.d0 != c2919f.d0) {
            return false;
        }
        boolean[] zArr = c2919f.c0;
        for (int i = 0; i < this.d0; i++) {
            if (this.c0[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void add(int i, Boolean bool) {
        i(i, bool.booleanValue());
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        k(bool.booleanValue());
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + C2904A.c(this.c0[i2]);
        }
        return i;
    }

    public void k(boolean z) {
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
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i) {
        return Boolean.valueOf(p(i));
    }

    public boolean p(int i) {
        l(i);
        return this.c0[i];
    }

    @Override // ax.r0.C2904A.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2904A.a L(int i) {
        if (i >= this.d0) {
            return new C2919f(Arrays.copyOf(this.c0, i), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
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
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i) {
        e();
        l(i);
        boolean[] zArr = this.c0;
        boolean z = zArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d0;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(u(i, bool.booleanValue()));
    }

    public boolean u(int i, boolean z) {
        e();
        l(i);
        boolean[] zArr = this.c0;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    private C2919f(boolean[] zArr, int i) {
        this.c0 = zArr;
        this.d0 = i;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        for (int i = 0; i < this.d0; i++) {
            if (obj.equals(Boolean.valueOf(this.c0[i]))) {
                boolean[] zArr = this.c0;
                System.arraycopy(zArr, i + 1, zArr, i, (this.d0 - i) - 1);
                this.d0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
