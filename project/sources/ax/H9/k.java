package ax.H9;

/* loaded from: classes3.dex */
public class k extends g implements ax.H9.a {
    private double d;
    private double e;
    private double f;
    private double[] g;
    private boolean h;

    class a implements ax.Qa.a {
        final /* synthetic */ double c0;
        final /* synthetic */ int q;

        a(int i, double d) {
            this.q = i;
            this.c0 = d;
        }

        @Override // ax.Qa.a
        public void run() {
            k.this.p(this.q, this.c0);
        }
    }

    class b implements ax.Qa.a {
        final /* synthetic */ double c0;
        final /* synthetic */ int q;

        b(int i, double d) {
            this.q = i;
            this.c0 = d;
        }

        @Override // ax.Qa.a
        public void run() {
            k.this.p(this.q, this.c0);
        }
    }

    public k(int i, String str, double d) {
        super(i, str, d);
        this.d = 0.0d;
        this.e = 1.0d;
        this.f = 0.0d;
        this.h = false;
        y(d);
        this.g = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2] = d;
        }
    }

    public void A(double d) {
        this.d = d;
    }

    public void B(boolean z) {
        this.h = z;
    }

    public void C(double d, double d2, double d3) {
        A(d);
        z(d3);
        y(d2);
        u(d2);
    }

    public void D(k kVar) {
        C(kVar.s(), kVar.q(), kVar.r());
    }

    @Override // ax.H9.a
    public void a(long j, int i, int i2) {
        for (c cVar : this.c) {
            ((ax.H9.b) cVar).a(j, i, i2);
        }
    }

    @Override // ax.H9.g
    protected void n(int i, double d) {
        this.c = new ax.H9.b[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.c[i2] = new ax.H9.b(this, d);
        }
    }

    @Override // ax.H9.g
    protected void p(int i, double d) {
        super.p(i, d);
        this.g[i] = d;
    }

    public double q() {
        return this.f;
    }

    public double r() {
        return this.e;
    }

    public double s() {
        return this.d;
    }

    public boolean t() {
        return this.h;
    }

    public void u(double d) {
        w(0, d);
    }

    public void v(double d, ax.Qa.c cVar) {
        x(0, d, cVar);
    }

    public void w(int i, double d) {
        this.g[i] = d;
        e(new a(i, d));
    }

    public void x(int i, double d, ax.Qa.c cVar) {
        k(i);
        f(cVar, new b(i, d));
    }

    public void y(double d) {
        this.f = d;
    }

    public void z(double d) {
        this.e = d;
    }

    public k(String str, double d) {
        this(1, str, d);
    }

    public k(String str) {
        this(1, str, 0.0d);
    }

    public k(int i, String str) {
        this(i, str, 0.0d);
    }
}
