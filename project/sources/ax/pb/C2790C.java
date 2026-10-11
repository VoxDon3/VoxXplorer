package ax.pb;

import ax.qb.C2896d;

/* renamed from: ax.pb.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2790C extends AbstractC2795b {
    private int F0;
    private int G0;
    private int H0;
    private int I0;
    private int J0;
    private int K0;
    private long L0;
    private byte M0;
    private int N0;
    int O0;
    int P0;

    C2790C(String str, int i, int i2, int i3, int i4, int i5, AbstractC2818s abstractC2818s) {
        super(abstractC2818s);
        this.x0 = str;
        this.d0 = (byte) -94;
        this.P0 = i2 | 137;
        this.G0 = i4;
        this.H0 = i3;
        if ((i & 64) == 64) {
            if ((i & 16) == 16) {
                this.I0 = 5;
            } else {
                this.I0 = 4;
            }
        } else if ((i & 16) != 16) {
            this.I0 = 1;
        } else if ((i & 32) == 32) {
            this.I0 = 2;
        } else {
            this.I0 = 3;
        }
        if ((i5 & 1) == 0) {
            this.J0 = i5 | 64;
        } else {
            this.J0 = i5;
        }
        this.K0 = 2;
        this.M0 = (byte) 3;
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2795b, ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComNTCreateAndX[" + super.toString() + ",flags=0x" + C2896d.c(this.O0, 2) + ",rootDirectoryFid=" + this.F0 + ",desiredAccess=0x" + C2896d.c(this.P0, 4) + ",allocationSize=" + this.L0 + ",extFileAttributes=0x" + C2896d.c(this.G0, 4) + ",shareAccess=0x" + C2896d.c(this.H0, 4) + ",createDisposition=0x" + C2896d.c(this.I0, 4) + ",createOptions=0x" + C2896d.c(this.J0, 8) + ",impersonationLevel=0x" + C2896d.c(this.K0, 4) + ",securityFlags=0x" + C2896d.c(this.M0, 2) + ",name=" + this.x0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        int A = A(this.x0, bArr, i);
        AbstractC2818s.w(this.q0 ? this.x0.length() * 2 : A, bArr, this.N0);
        return A;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        bArr[i] = 0;
        this.N0 = i + 1;
        AbstractC2818s.x(this.O0, bArr, i + 3);
        AbstractC2818s.x(this.F0, bArr, i + 7);
        AbstractC2818s.x(this.P0, bArr, i + 11);
        AbstractC2818s.y(this.L0, bArr, i + 15);
        AbstractC2818s.x(this.G0, bArr, i + 23);
        AbstractC2818s.x(this.H0, bArr, i + 27);
        AbstractC2818s.x(this.I0, bArr, i + 31);
        AbstractC2818s.x(this.J0, bArr, i + 35);
        AbstractC2818s.x(this.K0, bArr, i + 39);
        bArr[i + 43] = this.M0;
        return (i + 44) - i;
    }
}
