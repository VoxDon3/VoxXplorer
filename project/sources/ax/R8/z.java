package ax.R8;

import ax.h9.C2171b;
import ax.o9.AbstractC2736c;

/* loaded from: classes3.dex */
public class z extends ax.Q8.p {
    private final ax.Q8.i f;
    private final AbstractC2736c g;

    public z(ax.Q8.g gVar, ax.Q8.i iVar, long j, long j2, AbstractC2736c abstractC2736c, int i) {
        super(49, gVar, ax.Q8.m.SMB2_WRITE, j, j2, Math.min(i, abstractC2736c.a()));
        this.f = iVar;
        this.g = abstractC2736c;
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        c2171b.s(112);
        c2171b.u(n());
        c2171b.w(this.g.d());
        this.f.b(c2171b);
        c2171b.u(0L);
        c2171b.u(Math.max(0, this.g.a() - n()));
        c2171b.s(0);
        c2171b.s(0);
        c2171b.u(0L);
        this.g.j(c2171b, d());
    }
}
