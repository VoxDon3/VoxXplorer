package ax.H9;

/* loaded from: classes3.dex */
public class g extends m {
    c[] c;

    public g(int i, String str, double d) {
        super(str);
        n(i, d);
    }

    public void i() {
        j(0);
    }

    public void j(int i) {
        this.c[i].h();
    }

    public double k(int i) {
        return this.c[i].n();
    }

    public double[] l() {
        return this.c[0].o();
    }

    public double[] m(int i) {
        return this.c[i].o();
    }

    protected void n(int i, double d) {
        this.c = new c[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.c[i2] = new c(this, d);
        }
    }

    public void o(double d) {
        p(0, d);
    }

    protected void p(int i, double d) {
        this.c[i].q(d);
    }
}
