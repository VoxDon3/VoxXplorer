/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.h;
import ax.pb.s;
import ax.qb.e;
import java.io.PrintStream;
import java.util.Enumeration;

abstract class Q
extends s
implements Enumeration {
    private int C0;
    private int D0;
    private boolean E0;
    private boolean F0;
    protected int G0;
    protected int H0;
    protected int I0;
    protected int J0;
    protected int K0;
    protected int L0;
    protected int M0;
    protected int N0;
    protected int O0;
    protected int P0;
    int Q0;
    byte R0;
    boolean S0 = true;
    boolean T0 = true;
    byte[] U0 = null;
    int V0;
    int W0;
    h[] X0;

    Q() {
    }

    abstract int E(byte[] var1, int var2, int var3);

    abstract int F(byte[] var1, int var2, int var3);

    @Override
    int g(byte[] byArray, int n8) {
        this.D0 = 0;
        this.C0 = 0;
        int n9 = this.I0;
        int n10 = n8;
        if (n9 > 0) {
            this.C0 = n10 = this.J0 - (n8 - this.f0);
            System.arraycopy(byArray, n8 += n10, this.U0, this.O0 + this.K0, n9);
            n10 = n8 + this.I0;
        }
        if ((n8 = this.Q0) > 0) {
            this.D0 = n9 = this.L0 - (n10 - this.f0);
            System.arraycopy(byArray, n10 + n9, this.U0, this.P0 + this.M0, n8);
        }
        if (!this.E0 && this.K0 + this.I0 == this.G0) {
            this.E0 = true;
        }
        if (!this.F0 && this.M0 + this.Q0 == this.H0) {
            this.F0 = true;
        }
        if (this.E0 && this.F0) {
            this.S0 = false;
            this.F(this.U0, this.O0, this.G0);
            this.E(this.U0, this.P0, this.H0);
        }
        return this.C0 + this.I0 + this.D0 + this.Q0;
    }

    @Override
    public boolean hasMoreElements() {
        return this.i0 == 0 && this.S0;
    }

    @Override
    int l(byte[] object, int n8) {
        int n9;
        this.G0 = n9 = s.i((byte[])object, n8);
        if (this.P0 == 0) {
            this.P0 = n9;
        }
        this.H0 = s.i((byte[])object, n8 + 2);
        this.I0 = s.i((byte[])object, n8 + 6);
        this.J0 = s.i((byte[])object, n8 + 8);
        this.K0 = s.i((byte[])object, n8 + 10);
        this.Q0 = s.i((byte[])object, n8 + 12);
        this.L0 = s.i((byte[])object, n8 + 14);
        this.M0 = s.i((byte[])object, n8 + 16);
        this.N0 = n9 = object[n8 + 18] & 0xFF;
        if (n9 != 0 && e.c0 > 2) {
            object = s.A0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setupCount is not zero: ");
            stringBuilder.append(this.N0);
            ((PrintStream)object).println(stringBuilder.toString());
        }
        return n8 + 20 - n8;
    }

    public Object nextElement() {
        if (this.T0) {
            this.T0 = false;
        }
        return this;
    }

    @Override
    void s() {
        super.s();
        this.P0 = 0;
        this.S0 = true;
        this.T0 = true;
        this.F0 = false;
        this.E0 = false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(",totalParameterCount=");
        stringBuilder.append(this.G0);
        stringBuilder.append(",totalDataCount=");
        stringBuilder.append(this.H0);
        stringBuilder.append(",parameterCount=");
        stringBuilder.append(this.I0);
        stringBuilder.append(",parameterOffset=");
        stringBuilder.append(this.J0);
        stringBuilder.append(",parameterDisplacement=");
        stringBuilder.append(this.K0);
        stringBuilder.append(",dataCount=");
        stringBuilder.append(this.Q0);
        stringBuilder.append(",dataOffset=");
        stringBuilder.append(this.L0);
        stringBuilder.append(",dataDisplacement=");
        stringBuilder.append(this.M0);
        stringBuilder.append(",setupCount=");
        stringBuilder.append(this.N0);
        stringBuilder.append(",pad=");
        stringBuilder.append(this.C0);
        stringBuilder.append(",pad1=");
        stringBuilder.append(this.D0);
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int z(byte[] byArray, int n8) {
        return 0;
    }
}

