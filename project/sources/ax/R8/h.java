package ax.R8;

import ax.h9.C2171b;
import ax.o9.AbstractC2736c;

/* loaded from: classes3.dex */
public class h extends ax.Q8.p {
    private final long f;
    private final ax.Q8.i g;
    private final AbstractC2736c h;
    private final boolean i;
    private long j;

    public h(ax.Q8.g gVar, long j, long j2, long j3, ax.Q8.i iVar, AbstractC2736c abstractC2736c, boolean z, int i) {
        super(57, gVar, ax.Q8.m.SMB2_IOCTL, j, j2, Math.max(abstractC2736c.a(), i));
        this.f = j3;
        this.g = iVar;
        this.h = abstractC2736c;
        this.i = z;
        this.j = i;
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        c2171b.X();
        c2171b.u(this.f);
        this.g.b(c2171b);
        int a = this.h.a();
        if (a > 0) {
            c2171b.u(120);
            c2171b.u(a);
        } else {
            c2171b.u(0L);
            c2171b.u(0L);
        }
        c2171b.u(0L);
        c2171b.u(0L);
        c2171b.u(0L);
        c2171b.u(n());
        c2171b.u(this.i ? 1L : 0L);
        c2171b.Y();
        while (this.h.a() > 0) {
            this.h.g(c2171b);
        }
    }

    public long o() {
        return this.f;
    }
}
