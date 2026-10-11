package ax.Qc;

/* loaded from: classes3.dex */
public class b extends Number implements Comparable<b> {
    private long q;

    public void d(Number number) {
        this.q += number.longValue();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && this.q == ((b) obj).longValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.q;
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        return ax.Pc.a.b(this.q, bVar.q);
    }

    public int hashCode() {
        long j = this.q;
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.q;
    }

    public Long j() {
        return Long.valueOf(this.q);
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.q;
    }

    public String toString() {
        return String.valueOf(this.q);
    }
}
