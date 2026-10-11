package ax.I;

import ax.I.f;
import java.util.Iterator;

/* loaded from: classes.dex */
class k extends p {
    public k(ax.H.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.h.k.add(fVar);
        fVar.l.add(this.h);
    }

    @Override // ax.I.p, ax.I.d
    public void a(d dVar) {
        ax.H.a aVar = (ax.H.a) this.b;
        int v1 = aVar.v1();
        Iterator<f> it = this.h.l.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (v1 == 0 || v1 == 2) {
            this.h.d(i2 + aVar.w1());
        } else {
            this.h.d(i + aVar.w1());
        }
    }

    @Override // ax.I.p
    void d() {
        ax.H.e eVar = this.b;
        if (eVar instanceof ax.H.a) {
            this.h.b = true;
            ax.H.a aVar = (ax.H.a) eVar;
            int v1 = aVar.v1();
            boolean u1 = aVar.u1();
            int i = 0;
            if (v1 == 0) {
                this.h.e = f.a.LEFT;
                while (i < aVar.M0) {
                    ax.H.e eVar2 = aVar.L0[i];
                    if (u1 || eVar2.V() != 8) {
                        f fVar = eVar2.e.h;
                        fVar.k.add(this.h);
                        this.h.l.add(fVar);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (v1 == 1) {
                this.h.e = f.a.RIGHT;
                while (i < aVar.M0) {
                    ax.H.e eVar3 = aVar.L0[i];
                    if (u1 || eVar3.V() != 8) {
                        f fVar2 = eVar3.e.i;
                        fVar2.k.add(this.h);
                        this.h.l.add(fVar2);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (v1 == 2) {
                this.h.e = f.a.TOP;
                while (i < aVar.M0) {
                    ax.H.e eVar4 = aVar.L0[i];
                    if (u1 || eVar4.V() != 8) {
                        f fVar3 = eVar4.f.h;
                        fVar3.k.add(this.h);
                        this.h.l.add(fVar3);
                    }
                    i++;
                }
                q(this.b.f.h);
                q(this.b.f.i);
                return;
            }
            if (v1 != 3) {
                return;
            }
            this.h.e = f.a.BOTTOM;
            while (i < aVar.M0) {
                ax.H.e eVar5 = aVar.L0[i];
                if (u1 || eVar5.V() != 8) {
                    f fVar4 = eVar5.f.i;
                    fVar4.k.add(this.h);
                    this.h.l.add(fVar4);
                }
                i++;
            }
            q(this.b.f.h);
            q(this.b.f.i);
        }
    }

    @Override // ax.I.p
    public void e() {
        ax.H.e eVar = this.b;
        if (eVar instanceof ax.H.a) {
            int v1 = ((ax.H.a) eVar).v1();
            if (v1 == 0 || v1 == 1) {
                this.b.m1(this.h.g);
            } else {
                this.b.n1(this.h.g);
            }
        }
    }

    @Override // ax.I.p
    void f() {
        this.c = null;
        this.h.c();
    }

    @Override // ax.I.p
    boolean m() {
        return false;
    }
}
