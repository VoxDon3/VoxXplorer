/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.M0;
import ax.W5.O0;
import ax.W5.e0;
import ax.W5.r1;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class F0
extends e0
implements RandomAccess,
M0,
r1 {
    private static final F0 e0 = new F0(new float[0], 0, false);
    private float[] c0;
    private int d0;

    F0() {
        this(new float[10], 0, true);
    }

    private F0(float[] fArray, int n8, boolean bl) {
        super(bl);
        this.c0 = fArray;
        this.d0 = n8;
    }

    private final String h(int n8) {
        int n9 = this.d0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index:");
        stringBuilder.append(n8);
        stringBuilder.append(", Size:");
        stringBuilder.append(n9);
        return stringBuilder.toString();
    }

    private final void i(int n8) {
        if (n8 >= 0 && n8 < this.d0) {
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n8));
    }

    public final /* synthetic */ void add(int n8, Object object) {
        int n9;
        float f8 = ((Float)object).floatValue();
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            object = this.c0;
            if (n9 < ((Object)object).length) {
                System.arraycopy(object, n8, object, n8 + 1, n9 - n8);
            } else {
                float[] fArray = new float[n9 * 3 / 2 + 1];
                System.arraycopy(object, 0, fArray, 0, n8);
                System.arraycopy(this.c0, n8, fArray, n8 + 1, this.d0 - n8);
                this.c0 = fArray;
            }
            this.c0[n8] = f8;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n8));
    }

    @Override
    public final boolean addAll(Collection object) {
        this.e();
        Object object2 = O0.d;
        object.getClass();
        if (!(object instanceof F0)) {
            return super.addAll((Collection)object);
        }
        object2 = (F0)object;
        int n8 = object2.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            object = this.c0;
            if ((n8 = n9 + n8) > ((Object)object).length) {
                this.c0 = Arrays.copyOf((float[])object, n8);
            }
            System.arraycopy(object2.c0, 0, this.c0, this.d0, object2.d0);
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
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof F0)) {
            return super.equals(object);
        }
        object = (F0)object;
        if (this.d0 != ((F0)object).d0) {
            return false;
        }
        object = ((F0)object).c0;
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

    public final /* synthetic */ Object get(int n8) {
        this.i(n8);
        return Float.valueOf(this.c0[n8]);
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
        int n8 = this.d0;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.c0[i8] != f8) continue;
            return i8;
        }
        return -1;
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
    public final int size() {
        return this.d0;
    }
}

