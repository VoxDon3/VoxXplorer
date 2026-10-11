/*
 * Decompiled with CFR 0.152.
 */
package ax.H;

import ax.E.i;
import ax.H.d;
import ax.H.e;
import ax.H.j;

public class a
extends j {
    private int N0 = 0;
    private boolean O0 = true;
    private int P0 = 0;
    boolean Q0 = false;

    public void A1(int n8) {
        this.N0 = n8;
    }

    public void B1(int n8) {
        this.P0 = n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void g(ax.E.d d8, boolean bl) {
        int n8;
        int n9;
        Object object;
        d d9;
        int n10;
        block14: {
            d[] dArray;
            d[] dArray2 = this.W;
            dArray2[0] = this.O;
            dArray2[2] = this.P;
            dArray2[1] = this.Q;
            dArray2[3] = this.R;
            for (n10 = 0; n10 < (dArray = this.W).length; ++n10) {
                d d10 = dArray[n10];
                d10.i = d8.q(d10);
            }
            n10 = this.N0;
            if (n10 < 0 || n10 >= 4) return;
            d9 = dArray[n10];
            if (!this.Q0) {
                this.t1();
            }
            if (this.Q0) {
                this.Q0 = false;
                n10 = this.N0;
                if (n10 != 0 && n10 != 1) {
                    if (n10 != 2 && n10 != 3) return;
                    d8.f(this.P.i, this.g0);
                    d8.f(this.R.i, this.g0);
                    return;
                } else {
                    d8.f(this.O.i, this.f0);
                    d8.f(this.Q.i, this.f0);
                    return;
                }
            }
            for (n10 = 0; n10 < this.M0; ++n10) {
                object = this.L0[n10];
                if (!this.O0 && !((e)object).h() || ((n9 = this.N0) != 0 && n9 != 1 || ((e)object).A() != e.b.d0 || ((e)object).O.f == null || ((e)object).Q.f == null) && ((n9 = this.N0) != 2 && n9 != 3 || ((e)object).T() != e.b.d0 || ((e)object).P.f == null || ((e)object).R.f == null)) continue;
                bl = true;
                break block14;
            }
            bl = false;
        }
        n10 = !this.O.l() && !this.Q.l() ? 0 : 1;
        n9 = !this.P.l() && !this.R.l() ? 0 : 1;
        n10 = !bl && ((n8 = this.N0) == 0 && n10 != 0 || n8 == 2 && n9 != 0 || n8 == 1 && n10 != 0 || n8 == 3 && n9 != 0) ? 1 : 0;
        n10 = n10 == 0 ? 4 : 5;
        for (n9 = 0; n9 < this.M0; ++n9) {
            e e8 = this.L0[n9];
            if (!this.O0 && !e8.h()) continue;
            object = d8.q(e8.W[this.N0]);
            d[] dArray = e8.W;
            int n11 = this.N0;
            d d11 = dArray[n11];
            d11.i = object;
            d d12 = d11.f;
            n8 = d12 != null && d12.d == this ? d11.g : 0;
            if (n11 != 0 && n11 != 2) {
                d8.g(d9.i, (i)object, this.P0 + n8, bl);
            } else {
                d8.i(d9.i, (i)object, this.P0 - n8, bl);
            }
            d8.e(d9.i, (i)object, this.P0 + n8, n10);
        }
        n10 = this.N0;
        if (n10 == 0) {
            d8.e(this.Q.i, this.O.i, 0, 8);
            d8.e(this.O.i, this.a0.Q.i, 0, 4);
            d8.e(this.O.i, this.a0.O.i, 0, 0);
            return;
        }
        if (n10 == 1) {
            d8.e(this.O.i, this.Q.i, 0, 8);
            d8.e(this.O.i, this.a0.O.i, 0, 4);
            d8.e(this.O.i, this.a0.Q.i, 0, 0);
            return;
        }
        if (n10 == 2) {
            d8.e(this.R.i, this.P.i, 0, 8);
            d8.e(this.P.i, this.a0.R.i, 0, 4);
            d8.e(this.P.i, this.a0.P.i, 0, 0);
            return;
        }
        if (n10 != 3) return;
        d8.e(this.P.i, this.R.i, 0, 8);
        d8.e(this.P.i, this.a0.P.i, 0, 4);
        d8.e(this.P.i, this.a0.R.i, 0, 0);
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public boolean n0() {
        return this.Q0;
    }

    @Override
    public boolean o0() {
        return this.Q0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean t1() {
        int n8;
        e e8;
        int n9;
        int n10;
        int n11 = 0;
        int n12 = 1;
        for (n10 = 0; n10 < (n9 = this.M0); ++n10) {
            block26: {
                block27: {
                    block28: {
                        block25: {
                            e8 = this.L0[n10];
                            if (this.O0 || e8.h()) break block25;
                            n9 = n12;
                            break block26;
                        }
                        n9 = this.N0;
                        if ((n9 == 0 || n9 == 1) && !e8.n0()) break block27;
                        n8 = this.N0;
                        if (n8 == 2) break block28;
                        n9 = n12;
                        if (n8 != 3) break block26;
                    }
                    n9 = n12;
                    if (e8.o0()) break block26;
                }
                n9 = 0;
            }
            n12 = n9;
        }
        if (n12 != 0 && n9 > 0) {
            n10 = 0;
            n9 = 0;
        } else {
            return false;
        }
        while (n11 < this.M0) {
            e8 = this.L0[n11];
            if (this.O0 || e8.h()) {
                int n13;
                n8 = n10;
                n12 = n9;
                if (n9 == 0) {
                    n12 = this.N0;
                    if (n12 == 0) {
                        n10 = e8.o(d.b.c0).e();
                    } else if (n12 == 1) {
                        n10 = e8.o(d.b.e0).e();
                    } else if (n12 == 2) {
                        n10 = e8.o(d.b.d0).e();
                    } else if (n12 == 3) {
                        n10 = e8.o(d.b.f0).e();
                    }
                    n12 = 1;
                    n8 = n10;
                }
                if ((n13 = this.N0) == 0) {
                    n10 = Math.min(n8, e8.o(d.b.c0).e());
                    n9 = n12;
                } else if (n13 == 1) {
                    n10 = Math.max(n8, e8.o(d.b.e0).e());
                    n9 = n12;
                } else if (n13 == 2) {
                    n10 = Math.min(n8, e8.o(d.b.d0).e());
                    n9 = n12;
                } else {
                    n10 = n8;
                    n9 = n12;
                    if (n13 == 3) {
                        n10 = Math.max(n8, e8.o(d.b.f0).e());
                        n9 = n12;
                    }
                }
            }
            ++n11;
        }
        n10 += this.P0;
        n12 = this.N0;
        if (n12 != 0 && n12 != 1) {
            this.I0(n10, n10);
        } else {
            this.F0(n10, n10);
        }
        this.Q0 = true;
        return true;
    }

    @Override
    public String toString() {
        CharSequence charSequence;
        CharSequence charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append("[Barrier] ");
        ((StringBuilder)charSequence2).append(this.t());
        ((StringBuilder)charSequence2).append(" {");
        charSequence2 = ((StringBuilder)charSequence2).toString();
        for (int i8 = 0; i8 < this.M0; ++i8) {
            e e8 = this.L0[i8];
            charSequence = charSequence2;
            if (i8 > 0) {
                charSequence = new StringBuilder();
                charSequence.append((String)charSequence2);
                charSequence.append(", ");
                charSequence = charSequence.toString();
            }
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append(e8.t());
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        charSequence = new StringBuilder();
        charSequence.append((String)charSequence2);
        charSequence.append("}");
        return charSequence.toString();
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
        int n8 = this.N0;
        if (n8 != 0 && n8 != 1) {
            if (n8 != 2 && n8 != 3) {
                return -1;
            }
            return 1;
        }
        return 0;
    }

    protected void y1() {
        for (int i8 = 0; i8 < this.M0; ++i8) {
            e e8 = this.L0[i8];
            if (!this.O0 && !e8.h()) continue;
            int n8 = this.N0;
            if (n8 != 0 && n8 != 1) {
                if (n8 != 2 && n8 != 3) continue;
                e8.S0(1, true);
                continue;
            }
            e8.S0(0, true);
        }
    }

    public void z1(boolean bl) {
        this.O0 = bl;
    }
}

