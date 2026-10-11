package ax.db;

/* loaded from: classes3.dex */
public final class w implements Comparable<w> {
    public static final w d0 = new w(0, 0);
    private final long c0;
    private final long q;

    private w(long j, long j2) {
        this.q = j;
        this.c0 = j2;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(w wVar) {
        long j = this.q;
        long j2 = wVar.q;
        if (j != j2) {
            return j < j2 ? -1 : 1;
        }
        long j3 = this.c0;
        long j4 = wVar.c0;
        if (j3 == j4) {
            return 0;
        }
        return j3 < j4 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.q == wVar.q && this.c0 == wVar.c0;
    }

    public void h(char[] cArr, int i) {
        i.d(this.q, cArr, i);
        i.d(this.c0, cArr, i + 16);
    }

    public int hashCode() {
        long j = this.q;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        long j2 = this.c0;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String j() {
        char[] cArr = new char[32];
        h(cArr, 0);
        return new String(cArr);
    }

    public String toString() {
        return "TraceId{traceId=" + j() + "}";
    }
}
