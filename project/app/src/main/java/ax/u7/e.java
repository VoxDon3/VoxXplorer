/*
 * Decompiled with CFR 0.152.
 */
package ax.u7;

import ax.q7.n;
import ax.u7.f;
import java.io.Serializable;
import java.util.Arrays;

public final class e
implements Serializable {
    private static final e e0 = new e(new int[0]);
    private final transient int c0;
    private final int d0;
    private final int[] q;

    private e(int[] nArray) {
        this(nArray, 0, nArray.length);
    }

    private e(int[] nArray, int n8, int n9) {
        this.q = nArray;
        this.c0 = n8;
        this.d0 = n9;
    }

    public static e a(int[] nArray) {
        if (nArray.length == 0) {
            return e0;
        }
        return new e(Arrays.copyOf(nArray, nArray.length));
    }

    public static e e() {
        return e0;
    }

    public int b(int n8) {
        n.l(n8, this.d());
        return this.q[this.c0 + n8];
    }

    public boolean c() {
        return this.d0 == this.c0;
    }

    public int d() {
        return this.d0 - this.c0;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        if (this.d() != ((e)object).d()) {
            return false;
        }
        for (int i8 = 0; i8 < this.d(); ++i8) {
            if (this.b(i8) == ((e)object).b(i8)) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        int n8 = 1;
        for (int i8 = this.c0; i8 < this.d0; ++i8) {
            n8 = n8 * 31 + f.j(this.q[i8]);
        }
        return n8;
    }

    public String toString() {
        if (this.c()) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder(this.d() * 5);
        stringBuilder.append('[');
        stringBuilder.append(this.q[this.c0]);
        int n8 = this.c0;
        while (++n8 < this.d0) {
            stringBuilder.append(", ");
            stringBuilder.append(this.q[n8]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

