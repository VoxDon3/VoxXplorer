package ax.I;

import ax.H.d;
import ax.H.e;

/* loaded from: classes.dex */
public abstract class p implements d {
    public int a;
    ax.H.e b;
    m c;
    protected e.b d;
    g e = new g(this);
    public int f = 0;
    boolean g = false;
    public f h = new f(this);
    public f i = new f(this);
    protected b j = b.NONE;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.b.values().length];
            a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(ax.H.e eVar) {
        this.b = eVar;
    }

    private void l(int i, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            this.e.d(g(i2, i));
            return;
        }
        if (i3 == 1) {
            this.e.d(Math.min(g(this.e.m, i), i2));
            return;
        }
        if (i3 == 2) {
            ax.H.e K = this.b.K();
            if (K != null) {
                if ((i == 0 ? K.e : K.f).e.j) {
                    ax.H.e eVar = this.b;
                    this.e.d(g((int) ((r9.g * (i == 0 ? eVar.B : eVar.E)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        ax.H.e eVar2 = this.b;
        p pVar = eVar2.e;
        e.b bVar = pVar.d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.a == 3) {
            n nVar = eVar2.f;
            if (nVar.d == bVar2 && nVar.a == 3) {
                return;
            }
        }
        if (i == 0) {
            pVar = eVar2.f;
        }
        if (pVar.e.j) {
            float v = eVar2.v();
            this.e.d(i == 1 ? (int) ((pVar.e.g / v) + 0.5f) : (int) ((v * pVar.e.g) + 0.5f));
        }
    }

    protected final void b(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f = i;
        fVar2.k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i, int i2) {
        if (i2 == 0) {
            ax.H.e eVar = this.b;
            int i3 = eVar.A;
            int max = Math.max(eVar.z, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            ax.H.e eVar2 = this.b;
            int i4 = eVar2.D;
            int max2 = Math.max(eVar2.C, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    protected final f h(ax.H.d dVar) {
        ax.H.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        ax.H.e eVar = dVar2.d;
        int i = a.a[dVar2.e.ordinal()];
        if (i == 1) {
            return eVar.e.h;
        }
        if (i == 2) {
            return eVar.e.i;
        }
        if (i == 3) {
            return eVar.f.h;
        }
        if (i == 4) {
            return eVar.f.k;
        }
        if (i != 5) {
            return null;
        }
        return eVar.f.i;
    }

    protected final f i(ax.H.d dVar, int i) {
        ax.H.d dVar2 = dVar.f;
        if (dVar2 == null) {
            return null;
        }
        ax.H.e eVar = dVar2.d;
        p pVar = i == 0 ? eVar.e : eVar.f;
        int i2 = a.a[dVar2.e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.i;
        }
        return pVar.h;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    abstract boolean m();

    protected void n(d dVar, ax.H.d dVar2, ax.H.d dVar3, int i) {
        f h = h(dVar2);
        f h2 = h(dVar3);
        if (h.j && h2.j) {
            int f = h.g + dVar2.f();
            int f2 = h2.g - dVar3.f();
            int i2 = f2 - f;
            if (!this.e.j && this.d == e.b.MATCH_CONSTRAINT) {
                l(i, i2);
            }
            g gVar = this.e;
            if (gVar.j) {
                if (gVar.g == i2) {
                    this.h.d(f);
                    this.i.d(f2);
                    return;
                }
                ax.H.e eVar = this.b;
                float y = i == 0 ? eVar.y() : eVar.R();
                if (h == h2) {
                    f = h.g;
                    f2 = h2.g;
                    y = 0.5f;
                }
                this.h.d((int) (f + 0.5f + (((f2 - f) - this.e.g) * y)));
                this.i.d(this.h.g + this.e.g);
            }
        }
    }

    @Override // ax.I.d
    public void a(d dVar) {
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
