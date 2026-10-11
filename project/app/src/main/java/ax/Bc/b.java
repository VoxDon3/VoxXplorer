/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.i;
import ax.Bc.l;
import ax.Bc.t;
import ax.Bc.u;
import java.util.BitSet;

class b {
    long a;
    long[] b = new long[0];
    BitSet c;
    long[] d;
    i[] e = i.j;
    u f;
    l[] g = l.t0;
    t h;

    b() {
    }

    private static String a(long[] lArray) {
        if (lArray == null) {
            return "(null)";
        }
        return String.valueOf(lArray.length);
    }

    private static String b(Object[] objectArray) {
        if (objectArray == null) {
            return "(null)";
        }
        return String.valueOf(objectArray.length);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Archive with packed streams starting at offset ");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(ax.Bc.b.a(this.b));
        stringBuilder.append(" pack sizes, ");
        stringBuilder.append(ax.Bc.b.a(this.d));
        stringBuilder.append(" CRCs, ");
        stringBuilder.append(ax.Bc.b.b(this.e));
        stringBuilder.append(" folders, ");
        stringBuilder.append(ax.Bc.b.b(this.g));
        stringBuilder.append(" files and ");
        stringBuilder.append(this.h);
        return stringBuilder.toString();
    }
}

