/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.e0;
import java.util.Arrays;
import java.util.RandomAccess;

final class t1
extends e0
implements RandomAccess {
    private static final t1 e0 = new t1(new Object[0], 0, false);
    private Object[] c0;
    private int d0;

    private t1(Object[] objectArray, int n8, boolean bl) {
        super(bl);
        this.c0 = objectArray;
        this.d0 = n8;
    }

    public static t1 g() {
        return e0;
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

    public final void add(int n8, Object object) {
        int n9;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            Object[] objectArray = this.c0;
            if (n9 < objectArray.length) {
                System.arraycopy(objectArray, n8, objectArray, n8 + 1, n9 - n8);
            } else {
                Object[] objectArray2 = new Object[n9 * 3 / 2 + 1];
                System.arraycopy(objectArray, 0, objectArray2, 0, n8);
                System.arraycopy(this.c0, n8, objectArray2, n8 + 1, this.d0 - n8);
                this.c0 = objectArray2;
            }
            this.c0[n8] = object;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n8));
    }

    @Override
    public final boolean add(Object object) {
        this.e();
        int n8 = this.d0;
        Object[] objectArray = this.c0;
        if (n8 == objectArray.length) {
            this.c0 = Arrays.copyOf(objectArray, n8 * 3 / 2 + 1);
        }
        objectArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        objectArray[n8] = object;
        ++this.modCount;
        return true;
    }

    public final Object get(int n8) {
        this.i(n8);
        return this.c0[n8];
    }

    @Override
    public final Object remove(int n8) {
        this.e();
        this.i(n8);
        Object[] objectArray = this.c0;
        Object object = objectArray[n8];
        int n9 = this.d0;
        if (n8 < n9 - 1) {
            System.arraycopy(objectArray, n8 + 1, objectArray, n8, n9 - n8 - 1);
        }
        --this.d0;
        ++this.modCount;
        return object;
    }

    public final Object set(int n8, Object object) {
        this.e();
        this.i(n8);
        Object[] objectArray = this.c0;
        Object object2 = objectArray[n8];
        objectArray[n8] = object;
        ++this.modCount;
        return object2;
    }

    @Override
    public final int size() {
        return this.d0;
    }
}

