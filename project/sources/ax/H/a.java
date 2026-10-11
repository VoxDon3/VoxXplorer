package ax.H;

import ax.H.d;
import ax.H.e;

/* loaded from: classes.dex */
public class a extends j {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    public void A1(int i) {
        this.N0 = i;
    }

    public void B1(int i) {
        this.P0 = i;
    }

    @Override // ax.H.e
    public void g(ax.E.d dVar, boolean z) {
        d[] dVarArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        d[] dVarArr2 = this.W;
        dVarArr2[0] = this.O;
        dVarArr2[2] = this.P;
        dVarArr2[1] = this.Q;
        dVarArr2[3] = this.R;
        int i4 = 0;
        while (true) {
            dVarArr = this.W;
            if (i4 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i4];
            dVar2.i = dVar.q(dVar2);
            i4++;
        }
        int i5 = this.N0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i5];
        if (!this.Q0) {
            t1();
        }
        if (this.Q0) {
            this.Q0 = false;
            int i6 = this.N0;
            if (i6 == 0 || i6 == 1) {
                dVar.f(this.O.i, this.f0);
                dVar.f(this.Q.i, this.f0);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    dVar.f(this.P.i, this.g0);
                    dVar.f(this.R.i, this.g0);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.M0; i7++) {
            e eVar = this.L0[i7];
            if ((this.O0 || eVar.h()) && ((((i2 = this.N0) == 0 || i2 == 1) && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.O.f != null && eVar.Q.f != null) || (((i3 = this.N0) == 2 || i3 == 3) && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.P.f != null && eVar.R.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.O.l() || this.Q.l();
        boolean z4 = this.P.l() || this.R.l();
        int i8 = !(!z2 && (((i = this.N0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < this.M0; i9++) {
            e eVar2 = this.L0[i9];
            if (this.O0 || eVar2.h()) {
                ax.E.i q = dVar.q(eVar2.W[this.N0]);
                d[] dVarArr3 = eVar2.W;
                int i10 = this.N0;
                d dVar4 = dVarArr3[i10];
                dVar4.i = q;
                d dVar5 = dVar4.f;
                int i11 = (dVar5 == null || dVar5.d != this) ? 0 : dVar4.g;
                if (i10 == 0 || i10 == 2) {
                    dVar.i(dVar3.i, q, this.P0 - i11, z2);
                } else {
                    dVar.g(dVar3.i, q, this.P0 + i11, z2);
                }
                dVar.e(dVar3.i, q, this.P0 + i11, i8);
            }
        }
        int i12 = this.N0;
        if (i12 == 0) {
            dVar.e(this.Q.i, this.O.i, 0, 8);
            dVar.e(this.O.i, this.a0.Q.i, 0, 4);
            dVar.e(this.O.i, this.a0.O.i, 0, 0);
            return;
        }
        if (i12 == 1) {
            dVar.e(this.O.i, this.Q.i, 0, 8);
            dVar.e(this.O.i, this.a0.O.i, 0, 4);
            dVar.e(this.O.i, this.a0.Q.i, 0, 0);
        } else if (i12 == 2) {
            dVar.e(this.R.i, this.P.i, 0, 8);
            dVar.e(this.P.i, this.a0.R.i, 0, 4);
            dVar.e(this.P.i, this.a0.P.i, 0, 0);
        } else if (i12 == 3) {
            dVar.e(this.P.i, this.R.i, 0, 8);
            dVar.e(this.P.i, this.a0.P.i, 0, 4);
            dVar.e(this.P.i, this.a0.R.i, 0, 0);
        }
    }

    @Override // ax.H.e
    public boolean h() {
        return true;
    }

    @Override // ax.H.e
    public boolean n0() {
        return this.Q0;
    }

    @Override // ax.H.e
    public boolean o0() {
        return this.Q0;
    }

    public boolean t1() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.M0;
            if (i4 >= i) {
                break;
            }
            e eVar = this.L0[i4];
            if ((this.O0 || eVar.h()) && ((((i2 = this.N0) == 0 || i2 == 1) && !eVar.n0()) || (((i3 = this.N0) == 2 || i3 == 3) && !eVar.o0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.M0; i6++) {
            e eVar2 = this.L0[i6];
            if (this.O0 || eVar2.h()) {
                if (!z2) {
                    int i7 = this.N0;
                    if (i7 == 0) {
                        i5 = eVar2.o(d.b.LEFT).e();
                    } else if (i7 == 1) {
                        i5 = eVar2.o(d.b.RIGHT).e();
                    } else if (i7 == 2) {
                        i5 = eVar2.o(d.b.TOP).e();
                    } else if (i7 == 3) {
                        i5 = eVar2.o(d.b.BOTTOM).e();
                    }
                    z2 = true;
                }
                int i8 = this.N0;
                if (i8 == 0) {
                    i5 = Math.min(i5, eVar2.o(d.b.LEFT).e());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, eVar2.o(d.b.RIGHT).e());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, eVar2.o(d.b.TOP).e());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, eVar2.o(d.b.BOTTOM).e());
                }
            }
        }
        int i9 = i5 + this.P0;
        int i10 = this.N0;
        if (i10 == 0 || i10 == 1) {
            F0(i9, i9);
        } else {
            I0(i9, i9);
        }
        this.Q0 = true;
        return true;
    }

    @Override // ax.H.e
    public String toString() {
        String str = "[Barrier] " + t() + " {";
        for (int i = 0; i < this.M0; i++) {
            e eVar = this.L0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.t();
        }
        return str + "}";
    }

    public boolean u1() {
        return this.O0;
    }

    public int v1() {
        return this.N0;
    }

    public int w1() {
        return this.P0;
    }

    public int x1() {
        int i = this.N0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    protected void y1() {
        for (int i = 0; i < this.M0; i++) {
            e eVar = this.L0[i];
            if (this.O0 || eVar.h()) {
                int i2 = this.N0;
                if (i2 == 0 || i2 == 1) {
                    eVar.S0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    eVar.S0(1, true);
                }
            }
        }
    }

    public void z1(boolean z) {
        this.O0 = z;
    }
}
