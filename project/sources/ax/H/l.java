package ax.H;

import ax.H.e;
import ax.I.b;
import java.util.HashSet;

/* loaded from: classes.dex */
public class l extends j {
    private int N0 = 0;
    private int O0 = 0;
    private int P0 = 0;
    private int Q0 = 0;
    private int R0 = 0;
    private int S0 = 0;
    private int T0 = 0;
    private int U0 = 0;
    private boolean V0 = false;
    private int W0 = 0;
    private int X0 = 0;
    protected b.a Y0 = new b.a();
    b.InterfaceC0089b Z0 = null;

    public int A1() {
        return this.U0;
    }

    public int B1() {
        return this.N0;
    }

    protected void D1(e eVar, e.b bVar, int i, e.b bVar2, int i2) {
        while (this.Z0 == null && K() != null) {
            this.Z0 = ((f) K()).I1();
        }
        b.a aVar = this.Y0;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.Z0.a(eVar, aVar);
        eVar.k1(this.Y0.e);
        eVar.L0(this.Y0.f);
        eVar.K0(this.Y0.h);
        eVar.A0(this.Y0.g);
    }

    protected boolean E1() {
        e eVar = this.a0;
        b.InterfaceC0089b I1 = eVar != null ? ((f) eVar).I1() : null;
        if (I1 == null) {
            return false;
        }
        for (int i = 0; i < this.M0; i++) {
            e eVar2 = this.L0[i];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b u = eVar2.u(0);
                e.b u2 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u != bVar || eVar2.w == 1 || u2 != bVar || eVar2.x == 1) {
                    if (u == bVar) {
                        u = e.b.WRAP_CONTENT;
                    }
                    if (u2 == bVar) {
                        u2 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.Y0;
                    aVar.a = u;
                    aVar.b = u2;
                    aVar.c = eVar2.W();
                    this.Y0.d = eVar2.x();
                    I1.a(eVar2, this.Y0);
                    eVar2.k1(this.Y0.e);
                    eVar2.L0(this.Y0.f);
                    eVar2.A0(this.Y0.g);
                }
            }
        }
        return true;
    }

    public boolean F1() {
        return this.V0;
    }

    protected void G1(boolean z) {
        this.V0 = z;
    }

    public void H1(int i, int i2) {
        this.W0 = i;
        this.X0 = i2;
    }

    public void I1(int i) {
        this.P0 = i;
        this.N0 = i;
        this.Q0 = i;
        this.O0 = i;
        this.R0 = i;
        this.S0 = i;
    }

    public void J1(int i) {
        this.O0 = i;
    }

    public void K1(int i) {
        this.S0 = i;
    }

    public void L1(int i) {
        this.P0 = i;
        this.T0 = i;
    }

    public void M1(int i) {
        this.Q0 = i;
        this.U0 = i;
    }

    public void N1(int i) {
        this.R0 = i;
        this.T0 = i;
        this.U0 = i;
    }

    public void O1(int i) {
        this.N0 = i;
    }

    @Override // ax.H.j, ax.H.i
    public void a(f fVar) {
        u1();
    }

    public void t1(boolean z) {
        int i = this.R0;
        if (i > 0 || this.S0 > 0) {
            if (z) {
                this.T0 = this.S0;
                this.U0 = i;
            } else {
                this.T0 = i;
                this.U0 = this.S0;
            }
        }
    }

    public void u1() {
        for (int i = 0; i < this.M0; i++) {
            e eVar = this.L0[i];
            if (eVar != null) {
                eVar.U0(true);
            }
        }
    }

    public boolean v1(HashSet<e> hashSet) {
        for (int i = 0; i < this.M0; i++) {
            if (hashSet.contains(this.L0[i])) {
                return true;
            }
        }
        return false;
    }

    public int w1() {
        return this.X0;
    }

    public int x1() {
        return this.W0;
    }

    public int y1() {
        return this.O0;
    }

    public int z1() {
        return this.T0;
    }

    public void C1(int i, int i2, int i3, int i4) {
    }
}
