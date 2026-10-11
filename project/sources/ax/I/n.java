package ax.I;

import ax.H.d;
import ax.H.e;
import ax.I.f;
import ax.I.p;

/* loaded from: classes.dex */
public class n extends p {
    public f k;
    g l;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[p.b.values().length];
            a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(ax.H.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.k = fVar;
        this.l = null;
        this.h.e = f.a.TOP;
        this.i.e = f.a.BOTTOM;
        fVar.e = f.a.BASELINE;
        this.f = 1;
    }

    @Override // ax.I.p, ax.I.d
    public void a(d dVar) {
        float f;
        float v;
        float f2;
        int i;
        int i2 = a.a[this.j.ordinal()];
        if (i2 == 1) {
            p(dVar);
        } else if (i2 == 2) {
            o(dVar);
        } else if (i2 == 3) {
            ax.H.e eVar = this.b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.e;
        if (gVar.c && !gVar.j && this.d == e.b.MATCH_CONSTRAINT) {
            ax.H.e eVar2 = this.b;
            int i3 = eVar2.x;
            if (i3 == 2) {
                ax.H.e K = eVar2.K();
                if (K != null) {
                    if (K.f.e.j) {
                        this.e.d((int) ((r7.g * this.b.E) + 0.5f));
                    }
                }
            } else if (i3 == 3 && eVar2.e.e.j) {
                int w = eVar2.w();
                if (w == -1) {
                    ax.H.e eVar3 = this.b;
                    f = eVar3.e.e.g;
                    v = eVar3.v();
                } else if (w == 0) {
                    f2 = r7.e.e.g * this.b.v();
                    i = (int) (f2 + 0.5f);
                    this.e.d(i);
                } else if (w != 1) {
                    i = 0;
                    this.e.d(i);
                } else {
                    ax.H.e eVar4 = this.b;
                    f = eVar4.e.e.g;
                    v = eVar4.v();
                }
                f2 = f / v;
                i = (int) (f2 + 0.5f);
                this.e.d(i);
            }
        }
        f fVar = this.h;
        if (fVar.c) {
            f fVar2 = this.i;
            if (fVar2.c) {
                if (fVar.j && fVar2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == e.b.MATCH_CONSTRAINT) {
                    ax.H.e eVar5 = this.b;
                    if (eVar5.w == 0 && !eVar5.k0()) {
                        f fVar3 = this.h.l.get(0);
                        f fVar4 = this.i.l.get(0);
                        int i4 = fVar3.g;
                        f fVar5 = this.h;
                        int i5 = i4 + fVar5.f;
                        int i6 = fVar4.g + this.i.f;
                        fVar5.d(i5);
                        this.i.d(i6);
                        this.e.d(i6 - i5);
                        return;
                    }
                }
                if (!this.e.j && this.d == e.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    f fVar6 = this.h.l.get(0);
                    int i7 = (this.i.l.get(0).g + this.i.f) - (fVar6.g + this.h.f);
                    g gVar2 = this.e;
                    int i8 = gVar2.m;
                    if (i7 < i8) {
                        gVar2.d(i7);
                    } else {
                        gVar2.d(i8);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    f fVar7 = this.h.l.get(0);
                    f fVar8 = this.i.l.get(0);
                    int i9 = fVar7.g + this.h.f;
                    int i10 = fVar8.g + this.i.f;
                    float R = this.b.R();
                    if (fVar7 == fVar8) {
                        i9 = fVar7.g;
                        i10 = fVar8.g;
                        R = 0.5f;
                    }
                    this.h.d((int) (i9 + 0.5f + (((i10 - i9) - this.e.g) * R)));
                    this.i.d(this.h.g + this.e.g);
                }
            }
        }
    }

    @Override // ax.I.p
    void d() {
        ax.H.e K;
        ax.H.e K2;
        ax.H.e eVar = this.b;
        if (eVar.a) {
            this.e.d(eVar.x());
        }
        if (!this.e.j) {
            this.d = this.b.T();
            if (this.b.Z()) {
                this.l = new ax.I.a(this);
            }
            e.b bVar = this.d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (K2 = this.b.K()) != null && K2.T() == e.b.FIXED) {
                    int x = (K2.x() - this.b.P.f()) - this.b.R.f();
                    b(this.h, K2.f.h, this.b.P.f());
                    b(this.i, K2.f.i, -this.b.R.f());
                    this.e.d(x);
                    return;
                }
                if (this.d == e.b.FIXED) {
                    this.e.d(this.b.x());
                }
            }
        } else if (this.d == e.b.MATCH_PARENT && (K = this.b.K()) != null && K.T() == e.b.FIXED) {
            b(this.h, K.f.h, this.b.P.f());
            b(this.i, K.f.i, -this.b.R.f());
            return;
        }
        g gVar = this.e;
        boolean z = gVar.j;
        if (z) {
            ax.H.e eVar2 = this.b;
            if (eVar2.a) {
                ax.H.d[] dVarArr = eVar2.W;
                ax.H.d dVar = dVarArr[2];
                ax.H.d dVar2 = dVar.f;
                if (dVar2 != null && dVarArr[3].f != null) {
                    if (eVar2.k0()) {
                        this.h.f = this.b.W[2].f();
                        this.i.f = -this.b.W[3].f();
                    } else {
                        f h = h(this.b.W[2]);
                        if (h != null) {
                            b(this.h, h, this.b.W[2].f());
                        }
                        f h2 = h(this.b.W[3]);
                        if (h2 != null) {
                            b(this.i, h2, -this.b.W[3].f());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (this.b.Z()) {
                        b(this.k, this.h, this.b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f h3 = h(dVar);
                    if (h3 != null) {
                        b(this.h, h3, this.b.W[2].f());
                        b(this.i, this.h, this.e.g);
                        if (this.b.Z()) {
                            b(this.k, this.h, this.b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ax.H.d dVar3 = dVarArr[3];
                if (dVar3.f != null) {
                    f h4 = h(dVar3);
                    if (h4 != null) {
                        b(this.i, h4, -this.b.W[3].f());
                        b(this.h, this.i, -this.e.g);
                    }
                    if (this.b.Z()) {
                        b(this.k, this.h, this.b.p());
                        return;
                    }
                    return;
                }
                ax.H.d dVar4 = dVarArr[4];
                if (dVar4.f != null) {
                    f h5 = h(dVar4);
                    if (h5 != null) {
                        b(this.k, h5, 0);
                        b(this.h, this.k, -this.b.p());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof ax.H.i) || eVar2.K() == null || this.b.o(d.b.CENTER).f != null) {
                    return;
                }
                b(this.h, this.b.K().f.h, this.b.Y());
                b(this.i, this.h, this.e.g);
                if (this.b.Z()) {
                    b(this.k, this.h, this.b.p());
                    return;
                }
                return;
            }
        }
        if (z || this.d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            ax.H.e eVar3 = this.b;
            int i = eVar3.x;
            if (i == 2) {
                ax.H.e K3 = eVar3.K();
                if (K3 != null) {
                    g gVar2 = K3.f.e;
                    this.e.l.add(gVar2);
                    gVar2.k.add(this.e);
                    g gVar3 = this.e;
                    gVar3.b = true;
                    gVar3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3 && !eVar3.k0()) {
                ax.H.e eVar4 = this.b;
                if (eVar4.w != 3) {
                    g gVar4 = eVar4.e.e;
                    this.e.l.add(gVar4);
                    gVar4.k.add(this.e);
                    g gVar5 = this.e;
                    gVar5.b = true;
                    gVar5.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        }
        ax.H.e eVar5 = this.b;
        ax.H.d[] dVarArr2 = eVar5.W;
        ax.H.d dVar5 = dVarArr2[2];
        ax.H.d dVar6 = dVar5.f;
        if (dVar6 != null && dVarArr2[3].f != null) {
            if (eVar5.k0()) {
                this.h.f = this.b.W[2].f();
                this.i.f = -this.b.W[3].f();
            } else {
                f h6 = h(this.b.W[2]);
                f h7 = h(this.b.W[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = p.b.CENTER;
            }
            if (this.b.Z()) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (dVar6 != null) {
            f h8 = h(dVar5);
            if (h8 != null) {
                b(this.h, h8, this.b.W[2].f());
                c(this.i, this.h, 1, this.e);
                if (this.b.Z()) {
                    c(this.k, this.h, 1, this.l);
                }
                e.b bVar2 = this.d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.v() > 0.0f) {
                    l lVar = this.b.e;
                    if (lVar.d == bVar3) {
                        lVar.e.k.add(this.e);
                        this.e.l.add(this.b.e.e);
                        this.e.a = this;
                    }
                }
            }
        } else {
            ax.H.d dVar7 = dVarArr2[3];
            if (dVar7.f != null) {
                f h9 = h(dVar7);
                if (h9 != null) {
                    b(this.i, h9, -this.b.W[3].f());
                    c(this.h, this.i, -1, this.e);
                    if (this.b.Z()) {
                        c(this.k, this.h, 1, this.l);
                    }
                }
            } else {
                ax.H.d dVar8 = dVarArr2[4];
                if (dVar8.f != null) {
                    f h10 = h(dVar8);
                    if (h10 != null) {
                        b(this.k, h10, 0);
                        c(this.h, this.k, -1, this.l);
                        c(this.i, this.h, 1, this.e);
                    }
                } else if (!(eVar5 instanceof ax.H.i) && eVar5.K() != null) {
                    b(this.h, this.b.K().f.h, this.b.Y());
                    c(this.i, this.h, 1, this.e);
                    if (this.b.Z()) {
                        c(this.k, this.h, 1, this.l);
                    }
                    e.b bVar4 = this.d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.b.v() > 0.0f) {
                        l lVar2 = this.b.e;
                        if (lVar2.d == bVar5) {
                            lVar2.e.k.add(this.e);
                            this.e.l.add(this.b.e.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // ax.I.p
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.b.n1(fVar.g);
        }
    }

    @Override // ax.I.p
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // ax.I.p
    boolean m() {
        return this.d != e.b.MATCH_CONSTRAINT || this.b.x == 0;
    }

    void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.b.t();
    }
}
