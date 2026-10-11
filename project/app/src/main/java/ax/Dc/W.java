/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Kc.f;
import java.io.Serializable;

public final class W
implements Cloneable,
Serializable {
    public static final W c0 = new W(0);
    private final int q;

    public W(int n8) {
        this.q = n8;
    }

    public W(byte[] byArray, int n8) {
        this.q = W.h(byArray, n8);
    }

    public static byte[] c(int n8) {
        byte[] byArray = new byte[2];
        W.i(n8, byArray, 0);
        return byArray;
    }

    public static int f(byte[] byArray) {
        return W.h(byArray, 0);
    }

    public static int h(byte[] byArray, int n8) {
        return (int)f.c(byArray, n8, 2);
    }

    public static void i(int n8, byte[] byArray, int n9) {
        f.d(byArray, n8, n9, 2);
    }

    public byte[] b() {
        byte[] byArray = new byte[2];
        f.d(byArray, this.q, 0, 2);
        return byArray;
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
        return this.q;
    }

    public boolean equals(Object object) {
        if (!(object instanceof W)) {
            return false;
        }
        return this.q == ((W)object).d();
    }

    public int hashCode() {
        return this.q;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ZipShort value: ");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }
}

