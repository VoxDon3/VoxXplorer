package ax.Qb;

/* loaded from: classes3.dex */
public abstract class y0 extends B implements Z, InterfaceC0950n0 {
    public z0 e0;

    @Override // ax.Qb.InterfaceC0950n0
    public E0 a() {
        return null;
    }

    @Override // ax.Qb.Z
    public void d() {
        y().r0(this);
    }

    @Override // ax.Qb.InterfaceC0950n0
    public boolean e() {
        return true;
    }

    @Override // ax.Vb.q
    public String toString() {
        return N.a(this) + '@' + N.b(this) + "[job@" + N.b(y()) + ']';
    }

    public final z0 y() {
        z0 z0Var = this.e0;
        if (z0Var != null) {
            return z0Var;
        }
        ax.Gb.l.t("job");
        return null;
    }

    public final void z(z0 z0Var) {
        this.e0 = z0Var;
    }
}
