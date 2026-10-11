package ax.Bc;

import java.util.BitSet;

/* loaded from: classes3.dex */
class b {
    long a;
    BitSet c;
    long[] d;
    u f;
    t h;
    long[] b = new long[0];
    i[] e = i.j;
    l[] g = l.t0;

    b() {
    }

    private static String a(long[] jArr) {
        return jArr == null ? "(null)" : String.valueOf(jArr.length);
    }

    private static String b(Object[] objArr) {
        return objArr == null ? "(null)" : String.valueOf(objArr.length);
    }

    public String toString() {
        return "Archive with packed streams starting at offset " + this.a + ", " + a(this.b) + " pack sizes, " + a(this.d) + " CRCs, " + b(this.e) + " folders, " + b(this.g) + " files and " + this.h;
    }
}
