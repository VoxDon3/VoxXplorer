package ax.C2;

import ax.B2.l;

/* loaded from: classes.dex */
public class o implements ax.B2.l {
    private final ax.G0.l<l.b> c = new ax.G0.l<>();
    private final ax.M2.c<l.b.c> d = ax.M2.c.t();

    public o() {
        a(ax.B2.l.b);
    }

    public void a(l.b bVar) {
        this.c.l(bVar);
        if (bVar instanceof l.b.c) {
            this.d.p((l.b.c) bVar);
        } else if (bVar instanceof l.b.a) {
            this.d.q(((l.b.a) bVar).a());
        }
    }
}
