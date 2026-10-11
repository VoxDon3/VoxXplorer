package ax.I;

/* loaded from: classes.dex */
class j extends p {
    public j(ax.H.e eVar) {
        super(eVar);
        eVar.e.f();
        eVar.f.f();
        this.f = ((ax.H.h) eVar).s1();
    }

    private void q(f fVar) {
        this.h.k.add(fVar);
        fVar.l.add(this.h);
    }

    @Override // ax.I.p, ax.I.d
    public void a(d dVar) {
        f fVar = this.h;
        if (fVar.c && !fVar.j) {
            this.h.d((int) ((fVar.l.get(0).g * ((ax.H.h) this.b).v1()) + 0.5f));
        }
    }

    @Override // ax.I.p
    void d() {
        ax.H.h hVar = (ax.H.h) this.b;
        int t1 = hVar.t1();
        int u1 = hVar.u1();
        hVar.v1();
        if (hVar.s1() == 1) {
            if (t1 != -1) {
                this.h.l.add(this.b.a0.e.h);
                this.b.a0.e.h.k.add(this.h);
                this.h.f = t1;
            } else if (u1 != -1) {
                this.h.l.add(this.b.a0.e.i);
                this.b.a0.e.i.k.add(this.h);
                this.h.f = -u1;
            } else {
                f fVar = this.h;
                fVar.b = true;
                fVar.l.add(this.b.a0.e.i);
                this.b.a0.e.i.k.add(this.h);
            }
            q(this.b.e.h);
            q(this.b.e.i);
            return;
        }
        if (t1 != -1) {
            this.h.l.add(this.b.a0.f.h);
            this.b.a0.f.h.k.add(this.h);
            this.h.f = t1;
        } else if (u1 != -1) {
            this.h.l.add(this.b.a0.f.i);
            this.b.a0.f.i.k.add(this.h);
            this.h.f = -u1;
        } else {
            f fVar2 = this.h;
            fVar2.b = true;
            fVar2.l.add(this.b.a0.f.i);
            this.b.a0.f.i.k.add(this.h);
        }
        q(this.b.f.h);
        q(this.b.f.i);
    }

    @Override // ax.I.p
    public void e() {
        if (((ax.H.h) this.b).s1() == 1) {
            this.b.m1(this.h.g);
        } else {
            this.b.n1(this.h.g);
        }
    }

    @Override // ax.I.p
    void f() {
        this.h.c();
    }

    @Override // ax.I.p
    boolean m() {
        return false;
    }
}
