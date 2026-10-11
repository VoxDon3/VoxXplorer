/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.T4.p;
import ax.W4.g;
import java.io.Serializable;

public class l
implements p,
Serializable {
    private static final g d0 = g.e();
    protected byte[] c0;
    protected final String q;

    public l(String string) {
        if (string != null) {
            this.q = string;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    @Override
    public int a(char[] cArray, int n8) {
        String string = this.q;
        int n9 = string.length();
        if (n8 + n9 > cArray.length) {
            return -1;
        }
        string.getChars(0, n9, cArray, n8);
        return n9;
    }

    @Override
    public int b(byte[] byArray, int n8) {
        int n9;
        byte[] byArray2;
        byte[] byArray3 = byArray2 = this.c0;
        if (byArray2 == null) {
            this.c0 = byArray3 = d0.d(this.q);
        }
        if (n8 + (n9 = byArray3.length) > byArray.length) {
            return -1;
        }
        System.arraycopy(byArray3, 0, byArray, n8, n9);
        return n9;
    }

    @Override
    public final byte[] c() {
        byte[] byArray;
        byte[] byArray2 = byArray = this.c0;
        if (byArray == null) {
            this.c0 = byArray2 = d0.d(this.q);
        }
        return byArray2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object != null && object.getClass() == this.getClass()) {
            object = (l)object;
            return this.q.equals(((l)object).q);
        }
        return false;
    }

    @Override
    public final String getValue() {
        return this.q;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public final String toString() {
        return this.q;
    }
}

