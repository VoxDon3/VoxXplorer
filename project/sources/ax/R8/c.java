package ax.R8;

import ax.Z8.a;
import ax.h9.C2171b;

/* loaded from: classes3.dex */
public class c extends ax.Q8.q {
    private ax.Q8.i e;
    private ax.J8.b f;
    private ax.J8.b g;
    private ax.J8.b h;
    private ax.J8.b i;
    private long j;
    private long k;
    private byte[] l;

    public c() {
    }

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.J();
        c2171b.J();
        c2171b.U(4);
        this.f = ax.J8.c.c(c2171b);
        this.g = ax.J8.c.c(c2171b);
        this.h = ax.J8.c.c(c2171b);
        this.i = ax.J8.c.c(c2171b);
        this.j = c2171b.Q();
        this.k = c2171b.Q();
        this.l = c2171b.G(4);
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        c2171b.s(1);
        c2171b.Y();
        this.e.b(c2171b);
    }

    public c(ax.Q8.g gVar, long j, long j2, ax.Q8.i iVar) {
        super(24, gVar, ax.Q8.m.SMB2_CLOSE, j, j2);
        this.e = iVar;
    }
}
