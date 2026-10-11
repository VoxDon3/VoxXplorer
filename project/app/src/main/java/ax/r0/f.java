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

final class f
extends c<Boolean>
implements A.a,
RandomAccess,
b0 {
    private static final f e0;
    private boolean[] c0;
    private int d0;

    static {
        f f8;
        e0 = f8 = new f(new boolean[0], 0);
        f8.F();
    }

    f() {
        this(new boolean[10], 0);
    }

    private f(boolean[] blArray, int n8) {
        this.c0 = blArray;
        this.d0 = n8;
    }

    private void i(int n8, boolean bl) {
        int n9;
        this.e();
        if (n8 >= 0 && n8 <= (n9 = this.d0)) {
            boolean[] blArray = this.c0;
            if (n9 < blArray.length) {
                System.arraycopy(blArray, n8, blArray, n8 + 1, n9 - n8);
            } else {
                boolean[] blArray2 = new boolean[n9 * 3 / 2 + 1];
                System.arraycopy(blArray, 0, blArray2, 0, n8);
                System.arraycopy(this.c0, n8, blArray2, n8 + 1, this.d0 - n8);
                this.c0 = blArray2;
            }
            this.c0[n8] = bl;
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
    public boolean addAll(Collection<? extends Boolean> f8) {
        this.e();
        A.a(f8);
        if (!(f8 instanceof f)) {
            return super.addAll(f8);
        }
        f8 = f8;
        int n8 = f8.d0;
        if (n8 == 0) {
            return false;
        }
        int n9 = this.d0;
        if (Integer.MAX_VALUE - n9 >= n8) {
            boolean[] blArray = this.c0;
            if ((n9 += n8) > blArray.length) {
                this.c0 = Arrays.copyOf(blArray, n9);
            }
            System.arraycopy(f8.c0, 0, this.c0, this.d0, f8.d0);
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
        if (!(object instanceof f)) {
            return super.equals(object);
        }
        object = (f)object;
        if (this.d0 != ((f)object).d0) {
            return false;
        }
        object = ((f)object).c0;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            if (this.c0[i8] == object[i8]) continue;
            return false;
        }
        return true;
    }

    public void g(int n8, Boolean bl) {
        this.i(n8, bl);
    }

    public boolean h(Boolean bl) {
        this.k(bl);
        return true;
    }

    @Override
    public int hashCode() {
        int n8 = 1;
        for (int i8 = 0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + A.c(this.c0[i8]);
        }
        return n8;
    }

    public void k(boolean bl) {
        this.e();
        int n8 = this.d0;
        boolean[] blArray = this.c0;
        if (n8 == blArray.length) {
            boolean[] blArray2 = new boolean[n8 * 3 / 2 + 1];
            System.arraycopy(blArray, 0, blArray2, 0, n8);
            this.c0 = blArray2;
        }
        blArray = this.c0;
        n8 = this.d0;
        this.d0 = n8 + 1;
        blArray[n8] = bl;
    }

    public Boolean n(int n8) {
        return this.p(n8);
    }

    public boolean p(int n8) {
        this.l(n8);
        return this.c0[n8];
    }

    public A.a r(int n8) {
        if (n8 >= this.d0) {
            return new f(Arrays.copyOf(this.c0, n8), this.d0);
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
            boolean[] blArray = this.c0;
            System.arraycopy(blArray, n9, blArray, n8, this.d0 - n9);
            this.d0 -= n9 - n8;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Boolean s(int n8) {
        this.e();
        this.l(n8);
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
    public int size() {
        return this.d0;
    }

    public Boolean t(int n8, Boolean bl) {
        return this.u(n8, bl);
    }

    public boolean u(int n8, boolean bl) {
        this.e();
        this.l(n8);
        boolean[] blArray = this.c0;
        boolean bl2 = blArray[n8];
        blArray[n8] = bl;
        return bl2;
    }
}

