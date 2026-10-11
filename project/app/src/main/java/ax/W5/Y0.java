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

final class Y0
extends e0
implements RandomAccess,
M0,
r1 {
    private static final Y0 e0 = new Y0(new long[0], 0, false);
    private long[] c0;
    private int d0;

    Y0() {
        this(new long[10], 0, true);
    }

    private Y0(long[] lArray, int n8, boolean bl) {
        super(bl);
        this.c0 = lArray;
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
        long l8 = (Long)object;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            object = this.c0;
            if (n9 < ((Object)object).length) {
                System.arraycopy(object, n8, object, n8 + 1, n9 - n8);
            } else {
                long[] lArray = new long[n9 * 3 / 2 + 1];
                System.arraycopy(object, 0, lArray, 0, n8);
                System.arraycopy(this.c0, n8, lArray, n8 + 1, this.d0 - n8);
                this.c0 = lArray;
            }
            this.c0[n8] = l8;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n8));
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.e();
        Object[] objectArray = O0.d;
        collection.getClass();
        if (!(collection instanceof Y0)) {
            return super.addAll(collection);
        }
        collection = (Y0)collection;
        int n8 = ((Y0)collection).d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            objectArray = this.c0;
            if ((n9 += n8) > objectArray.length) {
                this.c0 = Arrays.copyOf((long[])objectArray, n9);
            }
            System.arraycopy(((Y0)collection).c0, 0, this.c0, this.d0, ((Y0)collection).d0);
            this.d0 = n9;
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
        if (!(object instanceof Y0)) {
            return super.equals(object);
        }
        object = (Y0)object;
        if (this.d0 != ((Y0)object).d0) {
            return false;
        }
        object = ((Y0)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (this.c0[i8] == object[i8]) continue;
            return false;
        }
        return true;
    }

    public final void g(long l8) {
        this.e();
        int n8 = this.d0;
        long[] lArray = this.c0;
        if (n8 == lArray.length) {
            long[] lArray2 = new long[n8 * 3 / 2 + 1];
            System.arraycopy(lArray, 0, lArray2, 0, n8);
            this.c0 = lArray2;
        }
        lArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        lArray[n8] = l8;
    }

    public final /* synthetic */ Object get(int n8) {
        this.i(n8);
        return this.c0[n8];
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            long l8 = this.c0[i8];
            byte[] byArray = O0.d;
            n8 = n8 * 31 + (int)(l8 ^ l8 >>> 32);
        }
        return n8;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Long)) {
            return -1;
        }
        long l8 = (Long)object;
        int n8 = this.d0;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.c0[i8] != l8) continue;
            return i8;
        }
        return -1;
    }

    @Override
    protected final void removeRange(int n8, int n9) {
        this.e();
        if (n9 >= n8) {
            long[] lArray = this.c0;
            System.arraycopy(lArray, n9, lArray, n8, this.d0 - n9);
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

