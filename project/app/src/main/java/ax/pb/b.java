/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.D;
import ax.pb.Z;
import ax.pb.s;
import ax.pb.t;
import ax.qb.d;

abstract class b
extends s {
    private byte C0 = (byte)-1;
    private int D0 = 0;
    s E0 = null;

    b() {
    }

    b(s s8) {
        if (s8 != null) {
            this.E0 = s8;
            this.C0 = s8.d0;
        }
    }

    int E(byte by) {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    int F(byte[] byArray, int n8) {
        byte by;
        int n9;
        int n10 = n8 + 1;
        this.o0 = n9 = byArray[n8];
        int n11 = n10;
        if (n9 != 0) {
            this.C0 = byArray[n10];
            this.D0 = n11 = s.i(byArray, n8 + 3);
            if (n11 == 0) {
                this.C0 = (byte)-1;
            }
            if (this.o0 > 2) {
                this.l(byArray, n8 + 5);
                if (this.d0 == -94 && ((D)this).S0) {
                    this.o0 += 8;
                }
            }
            n11 = n10 + this.o0 * 2;
        }
        this.p0 = n9 = s.i(byArray, n11);
        n11 = n10 = n11 + 2;
        if (n9 != 0) {
            this.g(byArray, n10);
            n11 = n10 + this.p0;
        }
        if ((n10 = this.i0) == 0 && (by = this.C0) != -1) {
            s s8 = this.E0;
            if (s8 == null) {
                this.C0 = (byte)-1;
                throw new RuntimeException("no andx command supplied with response");
            }
            n9 = this.f0;
            n11 = this.D0 + n9;
            s8.f0 = n9;
            s8.d0 = by;
            s8.i0 = n10;
            s8.e0 = this.e0;
            s8.j0 = this.j0;
            s8.k0 = this.k0;
            s8.l0 = this.l0;
            s8.m0 = this.m0;
            s8.n0 = this.n0;
            s8.q0 = this.q0;
            if (s8 instanceof b) {
                n11 += ((b)s8).F(byArray, n11);
            } else {
                n10 = n11 + 1;
                n9 = s8.o0;
                byArray[n11] = (byte)(n9 & 0xFF);
                n11 = n10;
                if (n9 != 0) {
                    n11 = n10;
                    if (n9 > 2) {
                        n11 = n10 + s8.l(byArray, n10);
                    }
                }
                this.E0.p0 = s.i(byArray, n11);
                n10 = n11 + 2;
                s8 = this.E0;
                n11 = n10;
                if (s8.p0 != 0) {
                    s8.g(byArray, n10);
                    n11 = n10 + this.E0.p0;
                }
            }
            this.E0.r0 = true;
            return n11 - n8;
        }
        this.C0 = (byte)-1;
        this.E0 = null;
        return n11 - n8;
    }

    int G(byte[] byArray, int n8) {
        int n9 = n8 + 3;
        int n10 = this.z(byArray, n8 + 5);
        int n11 = n10 + 5 + n8;
        this.o0 = n10 = (n10 + 4) / 2;
        byArray[n8] = (byte)(n10 & 0xFF);
        this.p0 = n10 = this.u(byArray, n11 + 2);
        byArray[n11] = (byte)(n10 & 0xFF);
        byArray[n11 + 1] = (byte)(n10 >> 8 & 0xFF);
        n11 = n11 + 2 + n10;
        s s8 = this.E0;
        if (s8 != null && Z.J && this.h0 < this.E(s8.d0)) {
            this.E0.h0 = this.h0 + 1;
            byArray[n8 + 1] = this.C0;
            byArray[n8 + 2] = 0;
            this.D0 = n10 = n11 - this.f0;
            s.w(n10, byArray, n9);
            s8 = this.E0;
            s8.q0 = this.q0;
            if (s8 instanceof b) {
                s8.m0 = this.m0;
                n9 = n11 + ((b)s8).G(byArray, n11);
            } else {
                s8.o0 = s8.z(byArray, n11);
                s8 = this.E0;
                n10 = s8.o0;
                n9 = n10 + 1 + n11;
                s8.o0 = n10 /= 2;
                byArray[n11] = (byte)(n10 & 0xFF);
                s8.p0 = s8.u(byArray, n9 + 2);
                n11 = this.E0.p0;
                byArray[n9] = (byte)(n11 & 0xFF);
                byArray[n9 + 1] = (byte)(n11 >> 8 & 0xFF);
                n9 = n11 + (n9 + 2);
            }
            return n9 - n8;
        }
        this.C0 = (byte)-1;
        this.E0 = null;
        byArray[n8 + 1] = -1;
        byArray[n8 + 2] = 0;
        byArray[n9] = -34;
        byArray[n8 + 4] = -34;
        return n11 - n8;
    }

    @Override
    int d(byte[] byArray, int n8) {
        this.f0 = n8;
        int n9 = this.h(byArray, n8) + n8;
        this.g0 = n8 = n9 + this.F(byArray, n9) - n8;
        return n8;
    }

    @Override
    int e(byte[] byArray, int n8) {
        block0: {
            this.f0 = n8;
            int n9 = this.v(byArray, n8) + n8;
            this.g0 = n8 = n9 + this.G(byArray, n9) - n8;
            t t8 = this.y0;
            if (t8 == null) break block0;
            t8.b(byArray, this.f0, n8, this, this.z0);
        }
        return this.g0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(",andxCommand=0x");
        stringBuilder.append(d.c(this.C0, 2));
        stringBuilder.append(",andxOffset=");
        stringBuilder.append(this.D0);
        return new String(stringBuilder.toString());
    }
}

