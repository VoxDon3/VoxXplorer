package ax.db;

/* loaded from: classes3.dex */
public final class t implements Comparable<t> {
    public static final t c0 = new t(0);
    private final long q;

    private t(long j) {
        this.q = j;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(t tVar) {
        long j = this.q;
        long j2 = tVar.q;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof t) && this.q == ((t) obj).q;
    }

    public void h(char[] cArr, int i) {
        i.d(this.q, cArr, i);
    }

    public int hashCode() {
        long j = this.q;
        return (int) (j ^ (j >>> 32));
    }

    public byte[] j() {
        byte[] bArr = new byte[8];
        i.e(this.q, bArr, 0);
        return bArr;
    }

    public String l() {
        char[] cArr = new char[16];
        h(cArr, 0);
        return new String(cArr);
    }

    public String toString() {
        return "SpanId{spanId=" + l() + "}";
    }
}
