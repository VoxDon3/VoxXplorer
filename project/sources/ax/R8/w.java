package ax.R8;

import ax.h9.C2171b;

/* loaded from: classes3.dex */
public class w extends ax.Q8.q {
    private final ax.Q8.g e;
    private boolean f;
    private ax.k9.e g;

    public w(ax.Q8.g gVar, ax.k9.e eVar, long j) {
        super(9, gVar, ax.Q8.m.SMB2_TREE_CONNECT, j, 0L);
        this.e = gVar;
        this.g = eVar;
    }

    private void n(C2171b c2171b) {
        if (this.e == ax.Q8.g.SMB_3_1_1 && this.f) {
            c2171b.s(1);
        } else {
            c2171b.X();
        }
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        c2171b.s(this.c);
        n(c2171b);
        c2171b.s(72);
        String eVar = this.g.toString();
        c2171b.a0(eVar);
        c2171b.Z(eVar);
    }
}
