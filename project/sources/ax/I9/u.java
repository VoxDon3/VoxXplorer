package ax.I9;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class u {
    private static int g;
    protected ax.D9.b a;
    private C0739b c;
    private long d;
    private final int f;
    private final LinkedHashMap<String, ax.H9.m> b = new LinkedHashMap<>();
    private boolean e = true;

    public u() {
        int i = g;
        g = i + 1;
        this.f = i;
    }

    public void f(ax.H9.m mVar) {
        mVar.h(this);
        this.b.put(mVar.b().toLowerCase(), mVar);
    }

    public void g(ax.H9.m mVar, String str) {
        mVar.g(str);
        f(mVar);
    }

    protected void h() {
        this.a.m(r());
    }

    protected double i(double d) {
        if (d < this.a.v()) {
            return 1.0d;
        }
        return m() / d;
    }

    public void j() {
        for (ax.H9.m mVar : this.b.values()) {
            if (mVar instanceof ax.H9.l) {
                ((ax.H9.l) mVar).s();
            }
        }
    }

    public abstract void k(int i, int i2);

    public C0739b l() {
        return this.c;
    }

    public double m() {
        return this.a.t();
    }

    public int n() {
        return this.a.u();
    }

    public ax.H9.m o(String str) {
        return this.b.get(str.toLowerCase());
    }

    public ax.D9.b p() {
        return this.a;
    }

    public ax.A9.b q() {
        return this.a;
    }

    public u r() {
        u uVar = this;
        while (true) {
            C0739b c0739b = uVar.c;
            if (c0739b == null) {
                return uVar;
            }
            uVar = c0739b;
        }
    }

    protected double s(double d, double d2) {
        double d3 = d + d2;
        return d3 >= 1.0d ? d3 - 2.0d : d3 < -1.0d ? d3 + 2.0d : d3;
    }

    public boolean t() {
        return this.e;
    }

    public void u(long j, int i, int i2) {
        if (!this.e || j <= this.d) {
            return;
        }
        this.d = j;
        for (Object obj : this.b.values()) {
            if (obj instanceof ax.H9.a) {
                ((ax.H9.a) obj).a(j, i, i2);
            }
        }
        k(i, i2);
    }

    public void v(C0739b c0739b) {
        if (this.c != null && c0739b != null) {
            throw new RuntimeException("Unit is already in a circuit.");
        }
        this.c = c0739b;
    }

    public void w(boolean z) {
        this.e = z;
        if (z) {
            return;
        }
        j();
    }

    public void x(ax.D9.b bVar) {
        ax.D9.b bVar2 = this.a;
        if (bVar2 != null && bVar2 != bVar) {
            throw new RuntimeException("Unit synthesisEngine already set.");
        }
        this.a = bVar;
    }

    public void y() {
        if (p() != null) {
            p().C(this);
            return;
        }
        throw new RuntimeException("This " + getClass().getName() + " was not add()ed to a Synthesizer.");
    }

    public u d() {
        return this;
    }
}
