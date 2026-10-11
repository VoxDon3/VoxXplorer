/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.i;

public final class t
implements Comparable<t> {
    public static final t c0 = new t(0L);
    private final long q;

    private t(long l8) {
        this.q = l8;
    }

    public int d(t t8) {
        long l8 = this.q;
        long l9 = t8.q;
        if (l8 < l9) {
            return -1;
        }
        if (l8 == l9) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof t)) {
            return false;
        }
        object = (t)object;
        return this.q == ((t)object).q;
    }

    public void h(char[] cArray, int n8) {
        i.d(this.q, cArray, n8);
    }

    public int hashCode() {
        long l8 = this.q;
        return (int)(l8 ^ l8 >>> 32);
    }

    public byte[] j() {
        byte[] byArray = new byte[8];
        i.e(this.q, byArray, 0);
        return byArray;
    }

    public String l() {
        char[] cArray = new char[16];
        this.h(cArray, 0);
        return new String(cArray);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpanId{spanId=");
        stringBuilder.append(this.l());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

