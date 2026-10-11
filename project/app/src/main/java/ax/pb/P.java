/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.pb.s;
import ax.qb.d;
import java.util.Enumeration;

abstract class P
extends s
implements Enumeration {
    private static final int c1 = a.d("jcifs.smb.client.transaction_buf_size", 65535) - 512;
    private int C0 = 0;
    private int D0 = 0;
    private int E0 = 0;
    private boolean F0 = true;
    private boolean G0 = true;
    private int H0;
    private int I0;
    protected int J0 = 61;
    protected int K0 = 51;
    protected int L0;
    protected int M0;
    protected int N0;
    protected int O0;
    protected int P0;
    protected int Q0;
    int R0;
    int S0;
    int T0 = 1024;
    int U0 = c1;
    byte V0;
    int W0 = 0;
    int X0 = 1;
    byte Y0;
    String Z0 = "";
    int a1;
    byte[] b1;

    P() {
    }

    void E(int n8, String string) {
        this.s();
    }

    abstract int F(byte[] var1, int var2);

    abstract int G(byte[] var1, int var2);

    abstract int H(byte[] var1, int var2);

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    public boolean hasMoreElements() {
        return this.F0;
    }

    @Override
    int l(byte[] byArray, int n8) {
        return 0;
    }

    public Object nextElement() {
        if (this.G0) {
            int n8;
            int n9;
            this.G0 = false;
            int n10 = this.J0 + this.X0 * 2;
            this.M0 = n10 + 2;
            int n11 = this.d0;
            if (n11 != -96) {
                if (n11 == 37 && !this.f()) {
                    n10 = this.M0;
                    this.M0 = n10 + this.t(this.Z0, n10);
                }
            } else if (n11 == -96) {
                this.M0 = n10 + 4;
            }
            n11 = this.M0;
            this.D0 = n10 = n11 % 2;
            n10 = n10 == 0 ? 0 : 2 - n10;
            this.D0 = n10;
            this.M0 = n11 + n10;
            this.R0 = n10 = this.G(this.b1, this.H0);
            this.I0 = n10;
            n11 = this.a1 - this.M0;
            this.L0 = n9 = Math.min(n10, n11);
            this.P0 = n8 = this.M0 + n9;
            this.E0 = n10 = n8 % 2;
            n10 = n10 == 0 ? 0 : 2 - n10;
            this.E0 = n10;
            this.P0 = n8 + n10;
            this.S0 = n10 = this.F(this.b1, this.I0);
            this.O0 = Math.min(n10, n11 - n9);
        } else {
            int n12;
            int n13;
            this.d0 = this.d0 != -96 ? (byte)38 : (byte)-95;
            this.M0 = 51;
            int n14 = this.R0;
            int n15 = this.N0;
            if (n14 - n15 > 0) {
                this.D0 = n13 = 51 % 2;
                n13 = n13 == 0 ? 0 : 2 - n13;
                this.D0 = n13;
                this.M0 = 51 + n13;
            }
            this.N0 = n13 = n15 + this.L0;
            n15 = this.a1 - this.M0 - this.D0;
            this.L0 = n14 = Math.min(n14 - n13, n15);
            this.P0 = n12 = this.M0 + n14;
            this.E0 = n13 = n12 % 2;
            n13 = n13 == 0 ? 0 : 2 - n13;
            this.E0 = n13;
            this.P0 = n12 + n13;
            this.Q0 = n12 = this.Q0 + this.O0;
            this.O0 = Math.min(this.S0 - n12, n15 - n14 - n13);
        }
        if (this.N0 + this.L0 >= this.R0 && this.Q0 + this.O0 >= this.S0) {
            this.F0 = false;
        }
        return this;
    }

    @Override
    void s() {
        super.s();
        this.F0 = true;
        this.G0 = true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(",totalParameterCount=");
        stringBuilder.append(this.R0);
        stringBuilder.append(",totalDataCount=");
        stringBuilder.append(this.S0);
        stringBuilder.append(",maxParameterCount=");
        stringBuilder.append(this.T0);
        stringBuilder.append(",maxDataCount=");
        stringBuilder.append(this.U0);
        stringBuilder.append(",maxSetupCount=");
        stringBuilder.append(this.V0);
        stringBuilder.append(",flags=0x");
        stringBuilder.append(d.c(this.C0, 2));
        stringBuilder.append(",timeout=");
        stringBuilder.append(this.W0);
        stringBuilder.append(",parameterCount=");
        stringBuilder.append(this.L0);
        stringBuilder.append(",parameterOffset=");
        stringBuilder.append(this.M0);
        stringBuilder.append(",parameterDisplacement=");
        stringBuilder.append(this.N0);
        stringBuilder.append(",dataCount=");
        stringBuilder.append(this.O0);
        stringBuilder.append(",dataOffset=");
        stringBuilder.append(this.P0);
        stringBuilder.append(",dataDisplacement=");
        stringBuilder.append(this.Q0);
        stringBuilder.append(",setupCount=");
        stringBuilder.append(this.X0);
        stringBuilder.append(",pad=");
        stringBuilder.append(this.D0);
        stringBuilder.append(",pad1=");
        stringBuilder.append(this.E0);
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        int n9 = this.D0;
        int n10 = this.d0 == 37 && !this.f() ? this.A(this.Z0, byArray, n8) + n8 : n8;
        int n11 = n10;
        if (this.L0 > 0) {
            for (n11 = n9; n11 > 0; --n11) {
                byArray[n10] = 0;
                ++n10;
            }
            System.arraycopy(this.b1, this.H0, byArray, n10, this.L0);
            n11 = n10 + this.L0;
        }
        n10 = n11;
        if (this.O0 > 0) {
            for (n10 = this.E0; n10 > 0; --n10) {
                byArray[n11] = 0;
                ++n11;
            }
            System.arraycopy(this.b1, this.I0, byArray, n11, this.O0);
            n9 = this.I0;
            n10 = this.O0;
            this.I0 = n9 + n10;
            n10 = n11 + n10;
        }
        return n10 - n8;
    }

    @Override
    int z(byte[] byArray, int n8) {
        int n9;
        int n10;
        s.w(this.R0, byArray, n8);
        s.w(this.S0, byArray, n8 + 2);
        int n11 = n10 = n8 + 4;
        if (this.d0 != 38) {
            s.w(this.T0, byArray, n10);
            s.w(this.U0, byArray, n8 + 6);
            byArray[n8 + 8] = this.V0;
            byArray[n8 + 9] = 0;
            s.w(this.C0, byArray, n8 + 10);
            s.x(this.W0, byArray, n8 + 12);
            byArray[n8 + 16] = 0;
            n11 = n8 + 18;
            byArray[n8 + 17] = 0;
        }
        s.w(this.L0, byArray, n11);
        s.w(this.M0, byArray, n11 + 2);
        n10 = n9 = n11 + 4;
        if (this.d0 == 38) {
            s.w(this.N0, byArray, n9);
            n10 = n11 + 6;
        }
        s.w(this.O0, byArray, n10);
        n11 = this.O0 == 0 ? 0 : this.P0;
        s.w(n11, byArray, n10 + 2);
        n11 = n10 + 4;
        if (this.d0 == 38) {
            s.w(this.Q0, byArray, n11);
            n10 += 6;
        } else {
            byArray[n11] = (byte)this.X0;
            n11 = n10 + 6;
            byArray[n10 + 5] = 0;
            n10 = n11 + this.H(byArray, n11);
        }
        return n10 - n8;
    }
}

