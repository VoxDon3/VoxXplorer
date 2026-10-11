/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.i;

public final class w
implements Comparable<w> {
    public static final w d0 = new w(0L, 0L);
    private final long c0;
    private final long q;

    private w(long l8, long l9) {
        this.q = l8;
        this.c0 = l9;
    }

    public int d(w w8) {
        long l8 = this.q;
        long l9 = w8.q;
        if (l8 == l9) {
            l8 = this.c0;
            l9 = w8.c0;
            if (l8 == l9) {
                return 0;
            }
            if (l8 < l9) {
                return -1;
            }
            return 1;
        }
        if (l8 < l9) {
            return -1;
        }
        return 1;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof w)) {
            return false;
        }
        object = (w)object;
        return this.q == ((w)object).q && this.c0 == ((w)object).c0;
    }

    public void h(char[] cArray, int n8) {
        i.d(this.q, cArray, n8);
        i.d(this.c0, cArray, n8 + 16);
    }

    public int hashCode() {
        long l8 = this.q;
        int n8 = (int)(l8 ^ l8 >>> 32);
        l8 = this.c0;
        return (n8 + 31) * 31 + (int)(l8 ^ l8 >>> 32);
    }

    public String j() {
        char[] cArray = new char[32];
        this.h(cArray, 0);
        return new String(cArray);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TraceId{traceId=");
        stringBuilder.append(this.j());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

