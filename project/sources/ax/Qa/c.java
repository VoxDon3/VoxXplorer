package ax.Qa;

/* loaded from: classes3.dex */
public class c implements Comparable<c> {
    private final double q;

    public c(double d) {
        this.q = d;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        double d = this.q;
        double d2 = cVar.q;
        if (d < d2) {
            return -1;
        }
        return d == d2 ? 0 : 1;
    }

    public double h() {
        return this.q;
    }
}
