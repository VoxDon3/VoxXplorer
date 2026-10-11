package ax.I;

import ax.H.d;
import ax.H.e;
import ax.I.f;
import ax.I.p;

/* loaded from: classes.dex */
public class l extends p {
    private static int[] k = new int[2];

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

    public l(ax.H.e eVar) {
        super(eVar);
        this.h.e = f.a.LEFT;
        this.i.e = f.a.RIGHT;
        this.f = 0;
    }

    private void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a8, code lost:
    
        if (r7 != 1) goto L131;
     */
    @Override // ax.I.p, ax.I.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(ax.I.d r14) {
        /*
            Method dump skipped, instructions count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.I.l.a(ax.I.d):void");
    }

    @Override // ax.I.p
    void d() {
        ax.H.e K;
        ax.H.e K2;
        ax.H.e eVar = this.b;
        if (eVar.a) {
            this.e.d(eVar.W());
        }
        if (this.e.j) {
            e.b bVar = this.d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (K = this.b.K()) != null && (K.A() == e.b.FIXED || K.A() == bVar2)) {
                b(this.h, K.e.h, this.b.O.f());
                b(this.i, K.e.i, -this.b.Q.f());
                return;
            }
        } else {
            e.b A = this.b.A();
            this.d = A;
            if (A != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (A == bVar3 && (K2 = this.b.K()) != null && (K2.A() == e.b.FIXED || K2.A() == bVar3)) {
                    int W = (K2.W() - this.b.O.f()) - this.b.Q.f();
                    b(this.h, K2.e.h, this.b.O.f());
                    b(this.i, K2.e.i, -this.b.Q.f());
                    this.e.d(W);
                    return;
                }
                if (this.d == e.b.FIXED) {
                    this.e.d(this.b.W());
                }
            }
        }
        g gVar = this.e;
        if (gVar.j) {
            ax.H.e eVar2 = this.b;
            if (eVar2.a) {
                ax.H.d[] dVarArr = eVar2.W;
                ax.H.d dVar = dVarArr[0];
                ax.H.d dVar2 = dVar.f;
                if (dVar2 != null && dVarArr[1].f != null) {
                    if (eVar2.i0()) {
                        this.h.f = this.b.W[0].f();
                        this.i.f = -this.b.W[1].f();
                        return;
                    }
                    f h = h(this.b.W[0]);
                    if (h != null) {
                        b(this.h, h, this.b.W[0].f());
                    }
                    f h2 = h(this.b.W[1]);
                    if (h2 != null) {
                        b(this.i, h2, -this.b.W[1].f());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (dVar2 != null) {
                    f h3 = h(dVar);
                    if (h3 != null) {
                        b(this.h, h3, this.b.W[0].f());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                }
                ax.H.d dVar3 = dVarArr[1];
                if (dVar3.f != null) {
                    f h4 = h(dVar3);
                    if (h4 != null) {
                        b(this.i, h4, -this.b.W[1].f());
                        b(this.h, this.i, -this.e.g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof ax.H.i) || eVar2.K() == null || this.b.o(d.b.CENTER).f != null) {
                    return;
                }
                b(this.h, this.b.K().e.h, this.b.X());
                b(this.i, this.h, this.e.g);
                return;
            }
        }
        if (this.d == e.b.MATCH_CONSTRAINT) {
            ax.H.e eVar3 = this.b;
            int i = eVar3.w;
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
            } else if (i == 3) {
                if (eVar3.x == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    n nVar = eVar3.f;
                    nVar.h.a = this;
                    nVar.i.a = this;
                    gVar.a = this;
                    if (eVar3.k0()) {
                        this.e.l.add(this.b.f.e);
                        this.b.f.e.k.add(this.e);
                        n nVar2 = this.b.f;
                        nVar2.e.a = this;
                        this.e.l.add(nVar2.h);
                        this.e.l.add(this.b.f.i);
                        this.b.f.h.k.add(this.e);
                        this.b.f.i.k.add(this.e);
                    } else if (this.b.i0()) {
                        this.b.f.e.l.add(this.e);
                        this.e.k.add(this.b.f.e);
                    } else {
                        this.b.f.e.l.add(this.e);
                    }
                } else {
                    g gVar4 = eVar3.f.e;
                    gVar.l.add(gVar4);
                    gVar4.k.add(this.e);
                    this.b.f.h.k.add(this.e);
                    this.b.f.i.k.add(this.e);
                    g gVar5 = this.e;
                    gVar5.b = true;
                    gVar5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        ax.H.e eVar4 = this.b;
        ax.H.d[] dVarArr2 = eVar4.W;
        ax.H.d dVar4 = dVarArr2[0];
        ax.H.d dVar5 = dVar4.f;
        if (dVar5 != null && dVarArr2[1].f != null) {
            if (eVar4.i0()) {
                this.h.f = this.b.W[0].f();
                this.i.f = -this.b.W[1].f();
                return;
            }
            f h5 = h(this.b.W[0]);
            f h6 = h(this.b.W[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f h7 = h(dVar4);
            if (h7 != null) {
                b(this.h, h7, this.b.W[0].f());
                c(this.i, this.h, 1, this.e);
                return;
            }
            return;
        }
        ax.H.d dVar6 = dVarArr2[1];
        if (dVar6.f != null) {
            f h8 = h(dVar6);
            if (h8 != null) {
                b(this.i, h8, -this.b.W[1].f());
                c(this.h, this.i, -1, this.e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof ax.H.i) || eVar4.K() == null) {
            return;
        }
        b(this.h, this.b.K().e.h, this.b.X());
        c(this.i, this.h, 1, this.e);
    }

    @Override // ax.I.p
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.b.m1(fVar.g);
        }
    }

    @Override // ax.I.p
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // ax.I.p
    boolean m() {
        return this.d != e.b.MATCH_CONSTRAINT || this.b.w == 0;
    }

    void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.t();
    }
}
