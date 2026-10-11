package ax.I9;

/* loaded from: classes3.dex */
public class B extends u implements w {
    private ax.J9.d h = new ax.J9.d();
    public ax.H9.k i;
    public ax.H9.l j;

    public B() {
        ax.H9.k kVar = new ax.H9.k("Amplitude", 1.0d);
        this.i = kVar;
        f(kVar);
        ax.H9.l lVar = new ax.H9.l("Output");
        this.j = lVar;
        f(lVar);
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l = this.i.l();
        double[] l2 = this.j.l();
        while (i < i2) {
            l2[i] = this.h.a() * l[i];
            i++;
        }
    }
}
