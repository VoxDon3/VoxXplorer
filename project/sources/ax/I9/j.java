package ax.I9;

/* loaded from: classes3.dex */
public class j extends r {
    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l = this.h.l();
        double[] l2 = this.i.l();
        double[] l3 = this.j.l();
        while (i < i2) {
            l3[i] = l[i] * l2[i];
            i++;
        }
    }
}
