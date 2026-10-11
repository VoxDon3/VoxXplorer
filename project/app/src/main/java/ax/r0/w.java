/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.b0;
import ax.r0.c;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class w
extends c<Float>
implements A.f,
RandomAccess,
b0 {
    private static final w e0;
    private float[] c0;
    private int d0;

    static {
        w w8;
        e0 = w8 = new w(new float[0], 0);
        w8.F();
    }

    w() {
        this(new float[10], 0);
    }

    private w(float[] fArray, int n8) {
        this.c0 = fArray;
        this.d0 = n8;
    }

    private void k(int n8, float f8) {
        int n9;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            float[] fArray = this.c0;
            if (n9 < fArray.length) {
                System.arraycopy(fArray, n8, fArray, n8 + 1, n9 - n8);
            } else {
                float[] fArray2 = new float[n9 * 3 / 2 + 1];
                System.arraycopy(fArray, 0, fArray2, 0, n8);
                System.arraycopy(this.c0, n8, fArray2, n8 + 1, this.d0 - n8);
                this.c0 = fArray2;
            }
            this.c0[n8] = f8;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.q(n8));
    }

    private void l(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.q(n8));
    }

    private String q(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(this.d0);
        return stringBuilder.toString();
    }

    @Override
    public boolean addAll(Collection<? extends Float> w8) {
        this.e();
        A.a(w8);
        if (!(w8 instanceof w)) {
            return super.addAll(w8);
        }
        w8 = w8;
        int n8 = w8.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            float[] fArray = this.c0;
            if ((n8 = n9 + n8) > fArray.length) {
                this.c0 = Arrays.copyOf(fArray, n8);
            }
            System.arraycopy(w8.c0, 0, this.c0, this.d0, w8.d0);
            this.d0 = n8;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof w)) {
            return super.equals(object);
        }
        object = (w)object;
        if (this.d0 != ((w)object).d0) {
            return false;
        }
        object = ((w)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (Float.floatToIntBits(this.c0[i8]) == Float.floatToIntBits((float)object[i8])) continue;
            return false;
        }
        return true;
    }

    public void g(int n8, Float f8) {
        this.k(n8, f8.floatValue());
    }

    public boolean h(Float f8) {
        this.i(f8.floatValue());
        return true;
    }

    @Override
    public int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + Float.floatToIntBits(this.c0[i8]);
        }
        return n8;
    }

    public void i(float f8) {
        float[] fArray;
        this.e();
        int n8 = this.d0;
        float[] fArray2 = this.c0;
        if (n8 == fArray2.length) {
            fArray = new float[n8 * 3 / 2 + 1];
            System.arraycopy(fArray2, 0, fArray, 0, n8);
            this.c0 = fArray;
        }
        fArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        fArray[n8] = f8;
    }

    public Float n(int n8) {
        return Float.valueOf(this.p(n8));
    }

    public float p(int n8) {
        this.l(n8);
        return this.c0[n8];
    }

    public A.f r(int n8) {
        if (n8 >= this.d0) {
            return new w(Arrays.copyOf(this.c0, n8), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public boolean remove(Object object) {
        this.e();
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (!object.equals(Float.valueOf(this.c0[i8]))) continue;
            object = this.c0;
            System.arraycopy(object, i8 + 1, object, i8, this.d0 - i8 - 1);
            --this.d0;
            ++this.modCount;
            return true;
        }
        return false;
    }

    @Override
    protected void removeRange(int n8, int n9) {
        this.e();
        if (n9 >= n8) {
            float[] fArray = this.c0;
            System.arraycopy(fArray, n9, fArray, n8, this.d0 - n9);
            this.d0 -= n9 - n8;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Float s(int n8) {
        this.e();
        this.l(n8);
        float[] fArray = this.c0;
        float f8 = fArray[n8];
        int n9 = this.d0;
        if (n8 < n9 - 1) {
            System.arraycopy(fArray, n8 + 1, fArray, n8, n9 - n8 - 1);
        }
        --this.d0;
        ++this.modCount;
        return Float.valueOf(f8);
    }

    @Override
    public int size() {
        return this.d0;
    }

    public Float t(int n8, Float f8) {
        return Float.valueOf(this.u(n8, f8.floatValue()));
    }

    public float u(int n8, float f8) {
        this.e();
        this.l(n8);
        float[] fArray = this.c0;
        float f9 = fArray[n8];
        fArray[n8] = f8;
        return f9;
    }
}

