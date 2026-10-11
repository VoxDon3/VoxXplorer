package ax.W5;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class F0 extends AbstractC1025e0 implements RandomAccess, M0, InterfaceC1064r1 {
    private static final F0 e0 = new F0(new float[0], 0, false);
    private float[] c0;
    private int d0;

    F0() {
        this(new float[10], 0, true);
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
        float floatValue = ((Float) obj).floatValue();
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(h(i));
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

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        byte[] bArr = O0.d;
        collection.getClass();
        if (!(collection instanceof F0)) {
            return super.addAll(collection);
        }
        F0 f0 = (F0) collection;
        int i = f0.d0;
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
        System.arraycopy(f0.c0, 0, this.c0, this.d0, f0.d0);
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
        if (!(obj instanceof F0)) {
            return super.equals(obj);
        }
        F0 f0 = (F0) obj;
        if (this.d0 != f0.d0) {
            return false;
        }
        float[] fArr = f0.c0;
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
        i(i);
        return Float.valueOf(this.c0[i]);
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.Collection, java.util.List
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
        int i = this.d0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c0[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        e();
        i(i);
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
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        e();
        i(i);
        float[] fArr = this.c0;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d0;
    }

    @Override // ax.W5.M0
    public final /* bridge */ /* synthetic */ M0 v(int i) {
        if (i >= this.d0) {
            return new F0(Arrays.copyOf(this.c0, i), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    private F0(float[] fArr, int i, boolean z) {
        super(z);
        this.c0 = fArr;
        this.d0 = i;
    }

    @Override // ax.W5.AbstractC1025e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Float) obj).floatValue());
        return true;
    }
}
