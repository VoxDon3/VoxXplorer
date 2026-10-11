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

final class z
extends c<Integer>
implements A.g,
RandomAccess,
b0 {
    private static final z e0;
    private int[] c0;
    private int d0;

    static {
        z z8;
        e0 = z8 = new z(new int[0], 0);
        z8.F();
    }

    z() {
        this(new int[10], 0);
    }

    private z(int[] nArray, int n8) {
        this.c0 = nArray;
        this.d0 = n8;
    }

    private void k(int n8, int n9) {
        int n10;
        this.e();
        if (n8 >= 0 && n8 <= (n10 = this.d0)) {
            int[] nArray = this.c0;
            if (n10 < nArray.length) {
                System.arraycopy(nArray, n8, nArray, n8 + 1, n10 - n8);
            } else {
                int[] nArray2 = new int[n10 * 3 / 2 + 1];
                System.arraycopy(nArray, 0, nArray2, 0, n8);
                System.arraycopy(this.c0, n8, nArray2, n8 + 1, this.d0 - n8);
                this.c0 = nArray2;
            }
            this.c0[n8] = n9;
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
    public boolean addAll(Collection<? extends Integer> object) {
        this.e();
        A.a(object);
        if (!(object instanceof z)) {
            return super.addAll(object);
        }
        z z8 = (z)object;
        int n8 = z8.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            object = this.c0;
            if ((n9 += n8) > ((Object)object).length) {
                this.c0 = Arrays.copyOf((int[])object, n9);
            }
            System.arraycopy(z8.c0, 0, this.c0, this.d0, z8.d0);
            this.d0 = n9;
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
        if (!(object instanceof z)) {
            return super.equals(object);
        }
        object = (z)object;
        if (this.d0 != ((z)object).d0) {
            return false;
        }
        object = ((z)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (this.c0[i8] == object[i8]) continue;
            return false;
        }
        return true;
    }

    public void g(int n8, Integer n9) {
        this.k(n8, n9);
    }

    public boolean h(Integer n8) {
        this.i(n8);
        return true;
    }

    @Override
    public int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + this.c0[i8];
        }
        return n8;
    }

    public void i(int n8) {
        this.e();
        int n9 = this.d0;
        int[] nArray = this.c0;
        if (n9 == nArray.length) {
            int[] nArray2 = new int[n9 * 3 / 2 + 1];
            System.arraycopy(nArray, 0, nArray2, 0, n9);
            this.c0 = nArray2;
        }
        nArray = this.c0;
        n9 = this.d0;
        this.d0 = n9 + 1;
        nArray[n9] = n8;
    }

    public Integer n(int n8) {
        return this.p(n8);
    }

    public int p(int n8) {
        this.l(n8);
        return this.c0[n8];
    }

    public A.g r(int n8) {
        if (n8 >= this.d0) {
            return new z(Arrays.copyOf(this.c0, n8), this.d0);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public boolean remove(Object object) {
        this.e();
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (!object.equals(this.c0[i8])) continue;
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
            int[] nArray = this.c0;
            System.arraycopy(nArray, n9, nArray, n8, this.d0 - n9);
            this.d0 -= n9 - n8;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Integer s(int n8) {
        this.e();
        this.l(n8);
        int[] nArray = this.c0;
        int n9 = nArray[n8];
        int n10 = this.d0;
        if (n8 < n10 - 1) {
            System.arraycopy(nArray, n8 + 1, nArray, n8, n10 - n8 - 1);
        }
        --this.d0;
        ++this.modCount;
        return n9;
    }

    @Override
    public int size() {
        return this.d0;
    }

    public Integer t(int n8, Integer n9) {
        return this.u(n8, n9);
    }

    public int u(int n8, int n9) {
        this.e();
        this.l(n8);
        int[] nArray = this.c0;
        int n10 = nArray[n8];
        nArray[n8] = n9;
        return n10;
    }
}

