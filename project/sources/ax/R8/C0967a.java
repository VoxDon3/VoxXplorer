package ax.R8;

import ax.Z8.a;
import ax.h9.C2171b;

/* renamed from: ax.R8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0967a extends ax.Q8.q {
    public C0967a() {
    }

    @Override // ax.Q8.q
    protected void j(C2171b c2171b) throws a.b {
        c2171b.J();
        c2171b.U(2);
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        c2171b.X();
    }

    public C0967a(ax.Q8.g gVar, long j, long j2, long j3) {
        super(4, gVar, ax.Q8.m.SMB2_CANCEL, j);
        ((ax.Q8.t) this.a).w(j2);
        if (j3 != 0) {
            ((ax.Q8.t) this.a).u(ax.Q8.o.SMB2_FLAGS_ASYNC_COMMAND);
            ((ax.Q8.t) this.a).q(j3);
        }
    }
}
