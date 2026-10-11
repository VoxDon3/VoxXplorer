package ax.Q8;

import ax.Z8.a;
import ax.h9.AbstractC2173d;
import ax.h9.C2171b;

/* loaded from: classes3.dex */
public class q extends AbstractC2173d<r, t> {
    protected int c;
    private h d;

    public q() {
        super(new t());
    }

    @Override // ax.h9.AbstractC2173d
    public C2171b b() {
        return this.b;
    }

    public int d() {
        return c().e();
    }

    public h e() {
        return this.d;
    }

    public int f() {
        return 65536;
    }

    protected final void h(r rVar) throws a.b {
        this.b = rVar.a();
        this.a = rVar.b();
        j(this.b);
        this.b.T(((t) this.a).c());
    }

    final void i(r rVar) throws a.b {
        this.b = rVar.a();
        this.a = rVar.b();
        this.d = new h().b((t) this.a, this.b);
        this.b.T(((t) this.a).c());
    }

    protected void j(C2171b c2171b) throws a.b {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    public void k(int i) {
        c().r(i);
    }

    @Override // ax.X8.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void a(C2171b c2171b) {
        this.b = c2171b;
        ((t) this.a).D(c2171b);
        m(c2171b);
        ((t) this.a).v(c2171b.V());
    }

    protected void m(C2171b c2171b) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    public String toString() {
        return ((t) this.a).h() + " with message id << " + ((t) this.a).i() + " >>";
    }

    protected q(int i, g gVar, m mVar) {
        this(i, gVar, mVar, 0L, 0L);
    }

    protected q(int i, g gVar, m mVar, long j) {
        this(i, gVar, mVar, j, 0L);
    }

    protected q(int i, g gVar, m mVar, long j, long j2) {
        super(new t());
        this.c = i;
        ((t) this.a).t(gVar);
        ((t) this.a).x(mVar);
        ((t) this.a).y(j);
        ((t) this.a).z(j2);
    }

    public q g() {
        return this;
    }
}
