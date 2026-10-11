package ax.Qc;

/* loaded from: classes3.dex */
public class a extends Number implements Comparable<a> {
    private int q;

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return ax.Pc.a.a(this.q, aVar.q);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && this.q == ((a) obj).intValue();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.q;
    }

    public Integer h() {
        return Integer.valueOf(this.q);
    }

    public int hashCode() {
        return this.q;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.q;
    }

    public void j(int i) {
        this.q = i;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.q;
    }

    public String toString() {
        return String.valueOf(this.q);
    }
}
