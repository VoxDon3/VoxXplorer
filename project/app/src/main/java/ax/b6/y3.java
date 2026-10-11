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

final class y3
extends u3<Boolean>
implements t4<Boolean>,
g5,
RandomAccess {
    private boolean[] c0;
    private int d0;

    static {
        new y3(new boolean[0], 0, false);
    }

    y3() {
        this(new boolean[10], 0, true);
    }

    private y3(boolean[] blArray, int n8, boolean bl) {
        super(bl);
        this.c0 = blArray;
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
        boolean bl = (Boolean)object;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            object = this.c0;
            if (n9 < ((Object)object).length) {
                System.arraycopy(object, n8, object, n8 + 1, n9 - n8);
            } else {
                boolean[] blArray = new boolean[n9 * 3 / 2 + 1];
                System.arraycopy(object, 0, blArray, 0, n8);
                System.arraycopy(this.c0, n8, blArray, n8 + 1, this.d0 - n8);
                this.c0 = blArray;
            }
            this.c0[n8] = bl;
            ++this.d0;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException(this.i(n8));
    }

    @Override
    public final /* synthetic */ boolean add(Object object) {
        this.g((Boolean)object);
        return true;
    }

    @Override
    public final boolean addAll(Collection<? extends Boolean> object) {
        this.e();
        m4.e(object);
        if (!(object instanceof y3)) {
            return super.addAll(object);
        }
        y3 y32 = (y3)object;
        int n8 = y32.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            object = this.c0;
            if ((n9 += n8) > ((Object)object).length) {
                this.c0 = Arrays.copyOf((boolean[])object, n9);
            }
            System.arraycopy(y32.c0, 0, this.c0, this.d0, y32.d0);
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
    public final /* synthetic */ t4 d(int n8) {
        if (n8 >= this.d0) {
            return new y3(Arrays.copyOf(this.c0, n8), this.d0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof y3)) {
            return super.equals(object);
        }
        object = (y3)object;
        if (this.d0 != ((y3)object).d0) {
            return false;
        }
        object = ((y3)object).c0;
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

    @Override
    public final /* synthetic */ Object get(int n8) {
        return this.h(n8);
    }

    public final boolean h(int n8) {
        this.k(n8);
        return this.c0[n8];
    }

    @Override
    public final int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + m4.c(this.c0[i8]);
        }
        return n8;
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Boolean)) {
            return -1;
        }
        boolean bl = (Boolean)object;
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            if (this.c0[i8] != bl) continue;
            return i8;
        }
        return -1;
    }

    @Override
    public final /* synthetic */ Object remove(int n8) {
        this.e();
        this.k(n8);
        boolean[] blArray = this.c0;
        boolean bl = blArray[n8];
        int n9 = this.d0;
        if (n8 < n9 - 1) {
            System.arraycopy(blArray, n8 + 1, blArray, n8, n9 - n8 - 1);
        }
        --this.d0;
        ++this.modCount;
        return bl;
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
    public final /* synthetic */ Object set(int n8, Object object) {
        boolean bl = (Boolean)object;
        this.e();
        this.k(n8);
        object = this.c0;
        Object object2 = object[n8];
        object[n8] = bl;
        return (boolean)object2;
    }

    @Override
    public final int size() {
        return this.d0;
    }
}

