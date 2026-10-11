/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.E.i;
import ax.H.d;
import ax.H.e;
import ax.H.f;

public class h
extends e {
    protected float L0 = -1.0f;
    protected int M0 = -1;
    protected int N0 = -1;
    protected boolean O0 = true;
    private d P0 = this.P;
    private int Q0 = 0;
    private int R0 = 0;
    private boolean S0;

    public h() {
        this.X.clear();
        this.X.add(this.P0);
        int n8 = this.W.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.W[i8] = this.P0;
        }
    }

    public void A1(int n8) {
        if (this.Q0 != n8) {
            this.Q0 = n8;
            this.X.clear();
            this.P0 = this.Q0 == 1 ? this.O : this.P;
            this.X.add(this.P0);
            int n9 = this.W.length;
            for (n8 = 0; n8 < n9; ++n8) {
                this.W[n8] = this.P0;
            }
        }
    }

    @Override
    public void g(ax.E.d d8, boolean bl) {
        Object object = (f)this.K();
        if (object != null) {
            d d9 = ((e)object).o(d.b.c0);
            Object object2 = ((e)object).o(d.b.e0);
            e e8 = this.a0;
            boolean bl2 = true;
            boolean bl3 = e8 != null && e8.Z[0] == e.b.c0;
            if (this.Q0 == 0) {
                d9 = ((e)object).o(d.b.d0);
                object2 = ((e)object).o(d.b.f0);
                object = this.a0;
                bl3 = object != null && ((e)object).Z[1] == e.b.c0 ? bl2 : false;
            }
            if (this.S0 && this.P0.n()) {
                object = d8.q(this.P0);
                d8.f((i)object, this.P0.e());
                if (this.M0 != -1) {
                    if (bl3) {
                        d8.h(d8.q(object2), (i)object, 0, 5);
                    }
                } else if (this.N0 != -1 && bl3) {
                    object2 = d8.q(object2);
                    d8.h((i)object, d8.q(d9), 0, 5);
                    d8.h((i)object2, (i)object, 0, 5);
                }
                this.S0 = false;
                return;
            }
            if (this.M0 != -1) {
                object = d8.q(this.P0);
                d8.e((i)object, d8.q(d9), this.M0, 8);
                if (bl3) {
                    d8.h(d8.q(object2), (i)object, 0, 5);
                    return;
                }
            } else if (this.N0 != -1) {
                object = d8.q(this.P0);
                object2 = d8.q(object2);
                d8.e((i)object, (i)object2, -this.N0, 8);
                if (bl3) {
                    d8.h((i)object, d8.q(d9), 0, 5);
                    d8.h((i)object2, (i)object, 0, 5);
                    return;
                }
            } else if (this.L0 != -1.0f) {
                d8.d(ax.E.d.s(d8, d8.q(this.P0), d8.q(object2), this.L0));
            }
        }
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean n0() {
        return this.S0;
    }

    @Override
    public d o(d.b b8) {
        int n8 = ax.H.h$a.a[b8.ordinal()];
        if (n8 != 1 && n8 != 2 ? (n8 == 3 || n8 == 4) && this.Q0 == 0 : this.Q0 == 1) {
            return this.P0;
        }
        return null;
    }

    @Override
    public boolean o0() {
        return this.S0;
    }

    @Override
    public void q1(ax.E.d d8, boolean bl) {
        if (this.K() == null) {
            return;
        }
        int n8 = d8.x(this.P0);
        if (this.Q0 == 1) {
            this.m1(n8);
            this.n1(0);
            this.L0(this.K().x());
            this.k1(0);
            return;
        }
        this.m1(0);
        this.n1(n8);
        this.k1(this.K().W());
        this.L0(0);
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

    public void w1(int n8) {
        this.P0.t(n8);
        this.S0 = true;
    }

    public void x1(int n8) {
        if (n8 > -1) {
            this.L0 = -1.0f;
            this.M0 = n8;
            this.N0 = -1;
        }
    }

    public void y1(int n8) {
        if (n8 > -1) {
            this.L0 = -1.0f;
            this.M0 = -1;
            this.N0 = n8;
        }
    }

    public void z1(float f8) {
        if (f8 > -1.0f) {
            this.L0 = f8;
            this.M0 = -1;
            this.N0 = -1;
        }
    }
}

