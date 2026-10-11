package ax.I9;

/* loaded from: classes3.dex */
public class k extends u {
    public ax.H9.k h;
    public ax.H9.k i;
    public ax.H9.l j;

    public k() {
        ax.H9.k kVar = new ax.H9.k("Input");
        this.h = kVar;
        f(kVar);
        ax.H9.k kVar2 = new ax.H9.k("Pan");
        this.i = kVar2;
        f(kVar2);
        this.i.C(-1.0d, 0.0d, 1.0d);
        ax.H9.l lVar = new ax.H9.l(2, "Output");
        this.j = lVar;
        f(lVar);
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l = this.h.l();
        double[] l2 = this.i.l();
        double[] m = this.j.m(0);
        double[] m2 = this.j.m(1);
        while (i < i2) {
            double d = (l2[i] * 0.5d) + 0.5d;
            double d2 = l[i];
            m[i] = (1.0d - d) * d2;
            m2[i] = d2 * d;
            i++;
        }
    }
}
