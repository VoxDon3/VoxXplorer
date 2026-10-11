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

final class i0
extends e0
implements RandomAccess,
M0,
r1 {
    private static final i0 e0 = new i0(new boolean[0], 0, false);
    private boolean[] c0;
    private int d0;

    i0() {
        this(new boolean[10], 0, true);
    }

    private i0(boolean[] blArray, int n8, boolean bl) {
        super(bl);
        this.c0 = blArray;
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
        boolean bl = (Boolean)object;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            boolean[] blArray = this.c0;
            if (n9 < blArray.length) {
                System.arraycopy(blArray, n8, blArray, n8 + 1, n9 - n8);
            } else {
                object = new boolean[n9 * 3 / 2 + 1];
                System.arraycopy(blArray, 0, object, 0, n8);
                System.arraycopy(this.c0, n8, object, n8 + 1, this.d0 - n8);
                this.c0 = (boolean[])object;
            }
            this.c0[n8] = bl;
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
        if (!(object instanceof i0)) {
            return super.addAll((Collection)object);
        }
        object2 = (i0)object;
        int n8 = object2.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            object = this.c0;
            if ((n8 = n9 + n8) > ((Object)object).length) {
                this.c0 = Arrays.copyOf((boolean[])object, n8);
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
        if (!(object instanceof i0)) {
            return super.equals(object);
        }
        object = (i0)object;
        if (this.d0 != ((i0)object).d0) {
            return false;
        }
        object = ((i0)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (this.c0[i8] == object[i8]) continue;
            return false;
        }
        return true;
    }

    public final void g(boolean bl) {
        boolean[] blArray;
        this.e();
        int n8 = this.d0;
        boolean[] blArray2 = this.c0;
        if (n8 == blArray2.length) {
            blArray = new boolean[n8 * 3 / 2 + 1];
            System.arraycopy(blArray2, 0, blArray, 0, n8);
            this.c0 = blArray;
        }
        blArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        blArray[n8] = bl;
    }

    public final /* synthetic */ Object get(int n8) {
        this.i(n8);
        return this.c0[n8];
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + O0.a(this.c0[i8]);
        }
        return n8;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Boolean)) {
            return -1;
        }
        boolean bl = (Boolean)object;
        int n8 = this.d0;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.c0[i8] != bl) continue;
            return i8;
        }
        return -1;
    }

    @Override
    protected final void removeRange(int n8, int n9) {
        this.e();
        if (n9 >= n8) {
            boolean[] blArray = this.c0;
            System.arraycopy(blArray, n9, blArray, n8, this.d0 - n9);
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

