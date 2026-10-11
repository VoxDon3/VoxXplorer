/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.H.e;
import ax.H.f;
import ax.H.h;
import ax.H.j;
import ax.I.b;
import java.util.HashSet;

public class l
extends j {
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
    b.b Z0 = null;

    public int A1() {
        return this.U0;
    }

    public int B1() {
        return this.N0;
    }

    public void C1(int n8, int n9, int n10, int n11) {
    }

    protected void D1(e e8, e.b b8, int n8, e.b b9, int n9) {
        while (this.Z0 == null && this.K() != null) {
            this.Z0 = ((f)this.K()).I1();
        }
        b.a a8 = this.Y0;
        a8.a = b8;
        a8.b = b9;
        a8.c = n8;
        a8.d = n9;
        this.Z0.a(e8, a8);
        e8.k1(this.Y0.e);
        e8.L0(this.Y0.f);
        e8.K0(this.Y0.h);
        e8.A0(this.Y0.g);
    }

    protected boolean E1() {
        Object object = this.a0;
        object = object != null ? ((f)object).I1() : null;
        if (object == null) {
            return false;
        }
        for (int i8 = 0; i8 < this.M0; ++i8) {
            e e8 = this.L0[i8];
            if (e8 == null || e8 instanceof h) continue;
            e.b b8 = e8.u(0);
            Object object2 = e8.u(1);
            e.b b9 = e.b.d0;
            if (b8 == b9 && e8.w != 1 && object2 == b9 && e8.x != 1) continue;
            e.b b10 = b8;
            if (b8 == b9) {
                b10 = e.b.c0;
            }
            b8 = object2;
            if (object2 == b9) {
                b8 = e.b.c0;
            }
            object2 = this.Y0;
            ((b.a)object2).a = b10;
            ((b.a)object2).b = b8;
            ((b.a)object2).c = e8.W();
            this.Y0.d = e8.x();
            object.a(e8, this.Y0);
            e8.k1(this.Y0.e);
            e8.L0(this.Y0.f);
            e8.A0(this.Y0.g);
        }
        return true;
    }

    public boolean F1() {
        return this.V0;
    }

    protected void G1(boolean bl) {
        this.V0 = bl;
    }

    public void H1(int n8, int n9) {
        this.W0 = n8;
        this.X0 = n9;
    }

    public void I1(int n8) {
        this.P0 = n8;
        this.N0 = n8;
        this.Q0 = n8;
        this.O0 = n8;
        this.R0 = n8;
        this.S0 = n8;
    }

    public void J1(int n8) {
        this.O0 = n8;
    }

    public void K1(int n8) {
        this.S0 = n8;
    }

    public void L1(int n8) {
        this.P0 = n8;
        this.T0 = n8;
    }

    public void M1(int n8) {
        this.Q0 = n8;
        this.U0 = n8;
    }

    public void N1(int n8) {
        this.R0 = n8;
        this.T0 = n8;
        this.U0 = n8;
    }

    public void O1(int n8) {
        this.N0 = n8;
    }

    @Override
    public void a(f f8) {
        this.u1();
    }

    public void t1(boolean bl) {
        int n8 = this.R0;
        if (n8 <= 0 && this.S0 <= 0) {
            return;
        }
        if (bl) {
            this.T0 = this.S0;
            this.U0 = n8;
            return;
        }
        this.T0 = n8;
        this.U0 = this.S0;
    }

    public void u1() {
        for (int i8 = 0; i8 < this.M0; ++i8) {
            e e8 = this.L0[i8];
            if (e8 == null) continue;
            e8.U0(true);
        }
    }

    public boolean v1(HashSet<e> hashSet) {
        for (int i8 = 0; i8 < this.M0; ++i8) {
            if (!hashSet.contains(this.L0[i8])) continue;
            return true;
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
}

