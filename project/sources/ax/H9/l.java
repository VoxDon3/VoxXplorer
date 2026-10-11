package ax.H9;

/* loaded from: classes3.dex */
public class l extends g {
    public l() {
        this("Output");
    }

    public void q(int i, k kVar, int i2) {
        this.c[i].f(kVar.c[i2]);
    }

    public void r(k kVar) {
        q(0, kVar, 0);
    }

    public void s() {
        for (c cVar : this.c) {
            cVar.j();
        }
    }

    public l(String str) {
        this(1, str, 0.0d);
    }

    public l(int i, String str) {
        this(i, str, 0.0d);
    }

    public l(int i, String str, double d) {
        super(i, str, d);
    }
}
