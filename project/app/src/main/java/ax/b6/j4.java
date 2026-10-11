/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.g5;
import ax.b6.m4;
import ax.b6.t4;
import ax.b6.u3;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class j4
extends u3<Float>
implements t4<Float>,
g5,
RandomAccess {
    private float[] c0;
    private int d0;

    static {
        new j4(new float[0], 0, false);
    }

    j4() {
        this(new float[10], 0, true);
    }

    private j4(float[] fArray, int n8, boolean bl) {
        super(bl);
        this.c0 = fArray;
        this.d0 = n8;
    }

    private final String i(int n8) {
        int n9 = this.d0;
        StringBuilder stringBuilder = new StringBuilder("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    private final void k(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    @Override
    public final /* synthetic */ void add(int n8, Object object) {
        int n9;
        float f8 = ((Float)object).floatValue();
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            float[] fArray = this.c0;
            if (n9 < fArray.length) {
                System.arraycopy(fArray, n8, fArray, n8 + 1, n9 - n8);
            } else {
                object = new float[n9 * 3 / 2 + 1];
                System.arraycopy(fArray, 0, object, 0, n8);
                System.arraycopy(this.c0, n8, object, n8 + 1, this.d0 - n8);
                this.c0 = (float[])object;
            }
            this.c0[n8] = f8;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    @Override
    public final /* synthetic */ boolean add(Object object) {
        this.g(((Float)object).floatValue());
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Float> j42) {
        this.e();
        m4.e(j42);
        if (!(j42 instanceof j4)) {
            return super.addAll(j42);
        }
        j42 = j42;
        int n8 = j42.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            float[] fArray = this.c0;
            if ((n8 = n9 + n8) > fArray.length) {
                this.c0 = Arrays.copyOf(fArray, n8);
            }
            System.arraycopy(j42.c0, 0, this.c0, this.d0, j42.d0);
            this.d0 = n8;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override
    public final boolean contains(Object object) {
        return this.indexOf(object) != -1;
    }

    @Override
    public final /* synthetic */ t4 d(int n8) {
        if (n8 >= this.d0) {
            return new j4(Arrays.copyOf(this.c0, n8), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof j4)) {
            return super.equals(object);
        }
        object = (j4)object;
        if (this.d0 != ((j4)object).d0) {
            return false;
        }
        object = ((j4)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (Float.floatToIntBits(this.c0[i8]) == Float.floatToIntBits((float)object[i8])) continue;
            return false;
        }
        return true;
    }

    public final void g(float f8) {
        this.e();
        int n8 = this.d0;
        float[] fArray = this.c0;
        if (n8 == fArray.length) {
            float[] fArray2 = new float[n8 * 3 / 2 + 1];
            System.arraycopy(fArray, 0, fArray2, 0, n8);
            this.c0 = fArray2;
        }
        fArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        fArray[n8] = f8;
    }

    @Override
    public final /* synthetic */ Object get(int n8) {
        return Float.valueOf(this.h(n8));
    }

    public final float h(int n8) {
        this.k(n8);
        return this.c0[n8];
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + Float.floatToIntBits(this.c0[i8]);
        }
        return n8;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Float)) {
            return -1;
        }
        float f8 = ((Float)object).floatValue();
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.c0[i8] != f8) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public final /* synthetic */ Object remove(int n8) {
        this.e();
        this.k(n8);
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
    protected final void removeRange(int n8, int n9) {
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

    @Override
    public final /* synthetic */ Object set(int n8, Object object) {
        float f8 = ((Float)object).floatValue();
        this.e();
        this.k(n8);
        object = this.c0;
        Object object2 = object[n8];
        object[n8] = f8;
        return Float.valueOf((float)object2);
    }

    @Override
    public final int size() {
        return this.d0;
    }
}

