package ax.H;

import ax.H.d;
import ax.H.e;

/* loaded from: classes.dex */
public class h extends e {
    protected float L0 = -1.0f;
    protected int M0 = -1;
    protected int N0 = -1;
    protected boolean O0 = true;
    private d P0 = this.P;
    private int Q0 = 0;
    private int R0 = 0;
    private boolean S0;

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
                a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.X.clear();
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i = 0; i < length; i++) {
            this.W[i] = this.P0;
        }
    }

    public void A1(int i) {
        if (this.Q0 == i) {
            return;
        }
        this.Q0 = i;
        this.X.clear();
        if (this.Q0 == 1) {
            this.P0 = this.O;
        } else {
            this.P0 = this.P;
        }
        this.X.add(this.P0);
        int length = this.W.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.W[i2] = this.P0;
        }
    }

    @Override // ax.H.e
    public void g(ax.E.d dVar, boolean z) {
        f fVar = (f) K();
        if (fVar == null) {
            return;
        }
        d o = fVar.o(d.b.LEFT);
        d o2 = fVar.o(d.b.RIGHT);
        e eVar = this.a0;
        boolean z2 = eVar != null && eVar.Z[0] == e.b.WRAP_CONTENT;
        if (this.Q0 == 0) {
            o = fVar.o(d.b.TOP);
            o2 = fVar.o(d.b.BOTTOM);
            e eVar2 = this.a0;
            z2 = eVar2 != null && eVar2.Z[1] == e.b.WRAP_CONTENT;
        }
        if (this.S0 && this.P0.n()) {
            ax.E.i q = dVar.q(this.P0);
            dVar.f(q, this.P0.e());
            if (this.M0 != -1) {
                if (z2) {
                    dVar.h(dVar.q(o2), q, 0, 5);
                }
            } else if (this.N0 != -1 && z2) {
                ax.E.i q2 = dVar.q(o2);
                dVar.h(q, dVar.q(o), 0, 5);
                dVar.h(q2, q, 0, 5);
            }
            this.S0 = false;
            return;
        }
        if (this.M0 != -1) {
            ax.E.i q3 = dVar.q(this.P0);
            dVar.e(q3, dVar.q(o), this.M0, 8);
            if (z2) {
                dVar.h(dVar.q(o2), q3, 0, 5);
                return;
            }
            return;
        }
        if (this.N0 == -1) {
            if (this.L0 != -1.0f) {
                dVar.d(ax.E.d.s(dVar, dVar.q(this.P0), dVar.q(o2), this.L0));
                return;
            }
            return;
        }
        ax.E.i q4 = dVar.q(this.P0);
        ax.E.i q5 = dVar.q(o2);
        dVar.e(q4, q5, -this.N0, 8);
        if (z2) {
            dVar.h(q4, dVar.q(o), 0, 5);
            dVar.h(q5, q4, 0, 5);
        }
    }

    @Override // ax.H.e
    public boolean h() {
        return true;
    }

    @Override // ax.H.e
    public boolean n0() {
        return this.S0;
    }

    @Override // ax.H.e
    public d o(d.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.Q0 == 1) {
                return this.P0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.Q0 == 0) {
            return this.P0;
        }
        return null;
    }

    @Override // ax.H.e
    public boolean o0() {
        return this.S0;
    }

    @Override // ax.H.e
    public void q1(ax.E.d dVar, boolean z) {
        if (K() == null) {
            return;
        }
        int x = dVar.x(this.P0);
        if (this.Q0 == 1) {
            m1(x);
            n1(0);
            L0(K().x());
            k1(0);
            return;
        }
        m1(0);
        n1(x);
        k1(K().W());
        L0(0);
    }

    public d r1() {
        return this.P0;
    }

    public int s1() {
        return this.Q0;
    }

    public int t1() {
        return this.M0;
    }

    public int u1() {
        return this.N0;
    }

    public float v1() {
        return this.L0;
    }

    public void w1(int i) {
        this.P0.t(i);
        this.S0 = true;
    }

    public void x1(int i) {
        if (i > -1) {
            this.L0 = -1.0f;
            this.M0 = i;
            this.N0 = -1;
        }
    }

    public void y1(int i) {
        if (i > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = i;
        }
    }

    public void z1(float f) {
        if (f > -1.0f) {
            this.L0 = f;
            this.M0 = -1;
            this.N0 = -1;
        }
    }
}
