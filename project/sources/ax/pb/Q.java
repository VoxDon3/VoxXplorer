package ax.pb;

import ax.qb.C2897e;
import java.util.Enumeration;

/* loaded from: classes3.dex */
abstract class Q extends AbstractC2818s implements Enumeration {
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
    InterfaceC2807h[] X0;

    Q() {
    }

    abstract int E(byte[] bArr, int i, int i2);

    abstract int F(byte[] bArr, int i, int i2);

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        this.D0 = 0;
        this.C0 = 0;
        int i2 = this.I0;
        if (i2 > 0) {
            int i3 = this.J0 - (i - this.f0);
            this.C0 = i3;
            int i4 = i + i3;
            System.arraycopy(bArr, i4, this.U0, this.O0 + this.K0, i2);
            i = i4 + this.I0;
        }
        int i5 = this.Q0;
        if (i5 > 0) {
            int i6 = this.L0 - (i - this.f0);
            this.D0 = i6;
            System.arraycopy(bArr, i + i6, this.U0, this.P0 + this.M0, i5);
        }
        if (!this.E0 && this.K0 + this.I0 == this.G0) {
            this.E0 = true;
        }
        if (!this.F0 && this.M0 + this.Q0 == this.H0) {
            this.F0 = true;
        }
        if (this.E0 && this.F0) {
            this.S0 = false;
            F(this.U0, this.O0, this.G0);
            E(this.U0, this.P0, this.H0);
        }
        return this.C0 + this.I0 + this.D0 + this.Q0;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.i0 == 0 && this.S0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        int i2 = AbstractC2818s.i(bArr, i);
        this.G0 = i2;
        if (this.P0 == 0) {
            this.P0 = i2;
        }
        this.H0 = AbstractC2818s.i(bArr, i + 2);
        this.I0 = AbstractC2818s.i(bArr, i + 6);
        this.J0 = AbstractC2818s.i(bArr, i + 8);
        this.K0 = AbstractC2818s.i(bArr, i + 10);
        this.Q0 = AbstractC2818s.i(bArr, i + 12);
        this.L0 = AbstractC2818s.i(bArr, i + 14);
        this.M0 = AbstractC2818s.i(bArr, i + 16);
        int i3 = bArr[i + 18] & 255;
        this.N0 = i3;
        int i4 = i + 20;
        if (i3 != 0 && C2897e.c0 > 2) {
            AbstractC2818s.A0.println("setupCount is not zero: " + this.N0);
        }
        return i4 - i;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        if (this.T0) {
            this.T0 = false;
        }
        return this;
    }

    @Override // ax.pb.AbstractC2818s
    void s() {
        super.s();
        this.P0 = 0;
        this.S0 = true;
        this.T0 = true;
        this.F0 = false;
        this.E0 = false;
    }

    @Override // ax.pb.AbstractC2818s
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.G0 + ",totalDataCount=" + this.H0 + ",parameterCount=" + this.I0 + ",parameterOffset=" + this.J0 + ",parameterDisplacement=" + this.K0 + ",dataCount=" + this.Q0 + ",dataOffset=" + this.L0 + ",dataDisplacement=" + this.M0 + ",setupCount=" + this.N0 + ",pad=" + this.C0 + ",pad1=" + this.D0);
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        return 0;
    }
}
