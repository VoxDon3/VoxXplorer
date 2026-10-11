package ax.b6;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ax.b6.j4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1590j4 extends AbstractC1678u3<Float> implements InterfaceC1671t4<Float>, InterfaceC1564g5, RandomAccess {
    private float[] c0;
    private int d0;

    static {
        new C1590j4(new float[0], 0, false);
    }

    C1590j4() {
        this(new float[10], 0, true);
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
        float floatValue = ((Float) obj).floatValue();
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(i(i));
        }
        float[] fArr = this.c0;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.c0, i, fArr2, i + 1, this.d0 - i);
            this.c0 = fArr2;
        }
        this.c0[i] = floatValue;
        this.d0++;
        ((AbstractList) this).modCount++;
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        e();
        C1616m4.e(collection);
        if (!(collection instanceof C1590j4)) {
            return super.addAll(collection);
        }
        C1590j4 c1590j4 = (C1590j4) collection;
        int i = c1590j4.d0;
        if (i == 0) {
            return false;
        }
        int i2 = this.d0;
        if (SubsamplingScaleImageView.TILE_SIZE_AUTO - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.c0;
        if (i3 > fArr.length) {
            this.c0 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c1590j4.c0, 0, this.c0, this.d0, c1590j4.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ax.b6.InterfaceC1671t4
    public final /* synthetic */ InterfaceC1671t4<Float> d(int i) {
        if (i >= this.d0) {
            return new C1590j4(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1590j4)) {
            return super.equals(obj);
        }
        C1590j4 c1590j4 = (C1590j4) obj;
        if (this.d0 != c1590j4.d0) {
            return false;
        }
        float[] fArr = c1590j4.c0;
        for (int i = 0; i < this.d0; i++) {
            if (Float.floatToIntBits(this.c0[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void g(float f) {
        e();
        int i = this.d0;
        float[] fArr = this.c0;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.c0 = fArr2;
        }
        float[] fArr3 = this.c0;
        int i2 = this.d0;
        this.d0 = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Float.valueOf(h(i));
    }

    public final float h(int i) {
        k(i);
        return this.c0[i];
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.c0[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.c0[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // ax.b6.AbstractC1678u3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        e();
        k(i);
        float[] fArr = this.c0;
        float f = fArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        e();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.c0;
        System.arraycopy(fArr, i2, fArr, i, this.d0 - i2);
        this.d0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        e();
        k(i);
        float[] fArr = this.c0;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    private C1590j4(float[] fArr, int i, boolean z) {
        super(z);
        this.c0 = fArr;
        this.d0 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
