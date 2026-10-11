package ax.pb;

import ax.jb.C2345a;
import ax.qb.C2896d;
import java.util.Enumeration;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
abstract class P extends AbstractC2818s implements Enumeration {
    private static final int c1 = C2345a.d("jcifs.smb.client.transaction_buf_size", Settings.DEFAULT_INITIAL_WINDOW_SIZE) - 512;
    private int H0;
    private int I0;
    protected int L0;
    protected int M0;
    protected int N0;
    protected int O0;
    protected int P0;
    protected int Q0;
    int R0;
    int S0;
    byte V0;
    byte Y0;
    int a1;
    byte[] b1;
    private int C0 = 0;
    private int D0 = 0;
    private int E0 = 0;
    private boolean F0 = true;
    private boolean G0 = true;
    int U0 = c1;
    int W0 = 0;
    int X0 = 1;
    String Z0 = HttpUrl.FRAGMENT_ENCODE_SET;
    int T0 = 1024;
    protected int J0 = 61;
    protected int K0 = 51;

    P() {
    }

    void E(int i, String str) {
        s();
    }

    abstract int F(byte[] bArr, int i);

    abstract int G(byte[] bArr, int i);

    abstract int H(byte[] bArr, int i);

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.F0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        if (this.G0) {
            this.G0 = false;
            int i = this.J0 + (this.X0 * 2);
            this.M0 = i + 2;
            byte b = this.d0;
            if (b != -96) {
                if (b == 37 && !f()) {
                    int i2 = this.M0;
                    this.M0 = i2 + t(this.Z0, i2);
                }
            } else if (b == -96) {
                this.M0 = i + 4;
            }
            int i3 = this.M0;
            int i4 = i3 % 2;
            this.D0 = i4;
            int i5 = i4 == 0 ? 0 : 2 - i4;
            this.D0 = i5;
            this.M0 = i3 + i5;
            int G = G(this.b1, this.H0);
            this.R0 = G;
            this.I0 = G;
            int i6 = this.a1 - this.M0;
            int min = Math.min(G, i6);
            this.L0 = min;
            int i7 = i6 - min;
            int i8 = this.M0 + min;
            this.P0 = i8;
            int i9 = i8 % 2;
            this.E0 = i9;
            int i10 = i9 == 0 ? 0 : 2 - i9;
            this.E0 = i10;
            this.P0 = i8 + i10;
            int F = F(this.b1, this.I0);
            this.S0 = F;
            this.O0 = Math.min(F, i7);
        } else {
            if (this.d0 != -96) {
                this.d0 = (byte) 38;
            } else {
                this.d0 = (byte) -95;
            }
            this.M0 = 51;
            int i11 = this.R0;
            int i12 = this.N0;
            if (i11 - i12 > 0) {
                int i13 = 51 % 2;
                this.D0 = i13;
                int i14 = i13 == 0 ? 0 : 2 - i13;
                this.D0 = i14;
                this.M0 = 51 + i14;
            }
            int i15 = i12 + this.L0;
            this.N0 = i15;
            int i16 = (this.a1 - this.M0) - this.D0;
            int min2 = Math.min(i11 - i15, i16);
            this.L0 = min2;
            int i17 = i16 - min2;
            int i18 = this.M0 + min2;
            this.P0 = i18;
            int i19 = i18 % 2;
            this.E0 = i19;
            int i20 = i19 == 0 ? 0 : 2 - i19;
            this.E0 = i20;
            this.P0 = i18 + i20;
            int i21 = this.Q0 + this.O0;
            this.Q0 = i21;
            this.O0 = Math.min(this.S0 - i21, i17 - i20);
        }
        if (this.N0 + this.L0 >= this.R0 && this.Q0 + this.O0 >= this.S0) {
            this.F0 = false;
        }
        return this;
    }

    @Override // ax.pb.AbstractC2818s
    void s() {
        super.s();
        this.F0 = true;
        this.G0 = true;
    }

    @Override // ax.pb.AbstractC2818s
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.R0 + ",totalDataCount=" + this.S0 + ",maxParameterCount=" + this.T0 + ",maxDataCount=" + this.U0 + ",maxSetupCount=" + ((int) this.V0) + ",flags=0x" + C2896d.c(this.C0, 2) + ",timeout=" + this.W0 + ",parameterCount=" + this.L0 + ",parameterOffset=" + this.M0 + ",parameterDisplacement=" + this.N0 + ",dataCount=" + this.O0 + ",dataOffset=" + this.P0 + ",dataDisplacement=" + this.Q0 + ",setupCount=" + this.X0 + ",pad=" + this.D0 + ",pad1=" + this.E0);
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        int i2 = this.D0;
        int A = (this.d0 != 37 || f()) ? i : A(this.Z0, bArr, i) + i;
        if (this.L0 > 0) {
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                bArr[A] = 0;
                A++;
                i2 = i3;
            }
            System.arraycopy(this.b1, this.H0, bArr, A, this.L0);
            A += this.L0;
        }
        if (this.O0 > 0) {
            int i4 = this.E0;
            while (true) {
                int i5 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                bArr[A] = 0;
                A++;
                i4 = i5;
            }
            System.arraycopy(this.b1, this.I0, bArr, A, this.O0);
            int i6 = this.I0;
            int i7 = this.O0;
            this.I0 = i6 + i7;
            A += i7;
        }
        return A - i;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        int H;
        AbstractC2818s.w(this.R0, bArr, i);
        AbstractC2818s.w(this.S0, bArr, i + 2);
        int i2 = i + 4;
        if (this.d0 != 38) {
            AbstractC2818s.w(this.T0, bArr, i2);
            AbstractC2818s.w(this.U0, bArr, i + 6);
            bArr[i + 8] = this.V0;
            bArr[i + 9] = 0;
            AbstractC2818s.w(this.C0, bArr, i + 10);
            AbstractC2818s.x(this.W0, bArr, i + 12);
            bArr[i + 16] = 0;
            i2 = i + 18;
            bArr[i + 17] = 0;
        }
        AbstractC2818s.w(this.L0, bArr, i2);
        AbstractC2818s.w(this.M0, bArr, i2 + 2);
        int i3 = i2 + 4;
        if (this.d0 == 38) {
            AbstractC2818s.w(this.N0, bArr, i3);
            i3 = i2 + 6;
        }
        AbstractC2818s.w(this.O0, bArr, i3);
        AbstractC2818s.w(this.O0 == 0 ? 0 : this.P0, bArr, i3 + 2);
        int i4 = i3 + 4;
        if (this.d0 == 38) {
            AbstractC2818s.w(this.Q0, bArr, i4);
            H = i3 + 6;
        } else {
            int i5 = i3 + 5;
            bArr[i4] = (byte) this.X0;
            int i6 = i3 + 6;
            bArr[i5] = 0;
            H = i6 + H(bArr, i6);
        }
        return H - i;
    }
}
