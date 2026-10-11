package ax.I9;

/* loaded from: classes3.dex */
public class q extends u {
    public ax.H9.k h;
    public ax.H9.k i;
    public ax.H9.l j;

    public q() {
        ax.H9.k kVar = new ax.H9.k("InputA");
        this.h = kVar;
        f(kVar);
        ax.H9.k kVar2 = new ax.H9.k("InputB");
        this.i = kVar2;
        f(kVar2);
        ax.H9.l lVar = new ax.H9.l(2, "OutputB");
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
            m[i] = l[i];
            m2[i] = l2[i];
            i++;
        }
    }
}
