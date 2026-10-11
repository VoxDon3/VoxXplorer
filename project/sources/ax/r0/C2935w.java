package ax.r0;

import ax.r0.C2904A;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: ax.r0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2935w extends AbstractC2916c<Float> implements C2904A.f, RandomAccess, b0 {
    private static final C2935w e0;
    private float[] c0;
    private int d0;

    static {
        C2935w c2935w = new C2935w(new float[0], 0);
        e0 = c2935w;
        c2935w.F();
    }

    C2935w() {
        this(new float[10], 0);
    }

    private void k(int i, float f) {
        int i2;
        e();
        if (i < 0 || i > (i2 = this.d0)) {
            throw new IndexOutOfBoundsException(q(i));
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
        this.c0[i] = f;
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
    public boolean addAll(Collection<? extends Float> collection) {
        e();
        C2904A.a(collection);
        if (!(collection instanceof C2935w)) {
            return super.addAll(collection);
        }
        C2935w c2935w = (C2935w) collection;
        int i = c2935w.d0;
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
        System.arraycopy(c2935w.c0, 0, this.c0, this.d0, c2935w.d0);
        this.d0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2935w)) {
            return super.equals(obj);
        }
        C2935w c2935w = (C2935w) obj;
        if (this.d0 != c2935w.d0) {
            return false;
        }
        float[] fArr = c2935w.c0;
        for (int i = 0; i < this.d0; i++) {
            if (Float.floatToIntBits(this.c0[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void add(int i, Float f) {
        k(i, f.floatValue());
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f) {
        i(f.floatValue());
        return true;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d0; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.c0[i2]);
        }
        return i;
    }

    public void i(float f) {
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
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float get(int i) {
        return Float.valueOf(p(i));
    }

    public float p(int i) {
        l(i);
        return this.c0[i];
    }

    @Override // ax.r0.C2904A.i
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C2904A.f L(int i) {
        if (i >= this.d0) {
            return new C2935w(Arrays.copyOf(this.c0, i), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
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
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float remove(int i) {
        e();
        l(i);
        float[] fArr = this.c0;
        float f = fArr[i];
        if (i < this.d0 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.d0--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.d0;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float set(int i, Float f) {
        return Float.valueOf(u(i, f.floatValue()));
    }

    public float u(int i, float f) {
        e();
        l(i);
        float[] fArr = this.c0;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    private C2935w(float[] fArr, int i) {
        this.c0 = fArr;
        this.d0 = i;
    }

    @Override // ax.r0.AbstractC2916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        for (int i = 0; i < this.d0; i++) {
            if (obj.equals(Float.valueOf(this.c0[i]))) {
                float[] fArr = this.c0;
                System.arraycopy(fArr, i + 1, fArr, i, (this.d0 - i) - 1);
                this.d0--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
