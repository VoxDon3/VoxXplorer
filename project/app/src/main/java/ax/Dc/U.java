/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Kc.f;
import java.io.Serializable;

public final class U
implements Cloneable,
Serializable {
    public static final U c0 = new U(33639248L);
    public static final U d0 = new U(67324752L);
    public static final U e0 = new U(134695760L);
    static final U f0 = new U(0xFFFFFFFFL);
    public static final U g0 = new U(808471376L);
    public static final U h0 = new U(134630224L);
    private final long q;

    public U(long l8) {
        this.q = l8;
    }

    public U(byte[] byArray, int n8) {
        this.q = U.i(byArray, n8);
    }

    public static byte[] c(long l8) {
        byte[] byArray = new byte[4];
        U.j(l8, byArray, 0);
        return byArray;
    }

    public static long h(byte[] byArray) {
        return U.i(byArray, 0);
    }

    public static long i(byte[] byArray, int n8) {
        return f.c(byArray, n8, 4);
    }

    public static void j(long l8, byte[] byArray, int n8) {
        f.d(byArray, l8, n8, 4);
    }

    public byte[] b() {
        return U.c(this.q);
    }

    public Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public int d() {
        return (int)this.q;
    }

    public boolean equals(Object object) {
        if (!(object instanceof U)) {
            return false;
        }
        return this.q == ((U)object).f();
    }

    public long f() {
        return this.q;
    }

    public int hashCode() {
        return (int)this.q;
    }

    public void k(byte[] byArray, int n8) {
        U.j(this.q, byArray, n8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ZipLong value: ");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }
}

