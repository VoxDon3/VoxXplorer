package ax.Q8;

/* loaded from: classes3.dex */
public class p extends q {
    private int e;

    public p(int i, g gVar, m mVar, long j, long j2, int i2) {
        super(i, gVar, mVar, j, j2);
        this.e = i2;
    }

    @Override // ax.Q8.q
    public int f() {
        return this.e;
    }

    protected int n() {
        return Math.min(this.e, d() * 65536);
    }
}
