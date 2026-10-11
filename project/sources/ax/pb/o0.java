package ax.pb;

import ax.qb.C2896d;

/* loaded from: classes3.dex */
class o0 extends P {
    private int d1;
    private int e1;
    private int f1;
    private int g1;
    private String h1;

    o0(int i, int i2, String str) {
        this.d1 = i;
        this.f1 = i2;
        this.h1 = str;
        this.d0 = (byte) 50;
        this.Y0 = (byte) 2;
        this.e1 = 260;
        this.g1 = 0;
        this.T0 = 8;
        this.U0 = m0.i1;
        this.V0 = (byte) 0;
    }

    @Override // ax.pb.P
    void E(int i, String str) {
        super.s();
        this.f1 = i;
        this.h1 = str;
        this.j0 = 0;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.P
    int G(byte[] bArr, int i) {
        AbstractC2818s.w(this.d1, bArr, i);
        AbstractC2818s.w(m0.j1, bArr, i + 2);
        AbstractC2818s.w(this.e1, bArr, i + 4);
        AbstractC2818s.x(this.f1, bArr, i + 6);
        AbstractC2818s.w(this.g1, bArr, i + 10);
        int i2 = i + 12;
        return (i2 + A(this.h1, bArr, i2)) - i;
    }

    @Override // ax.pb.P
    int H(byte[] bArr, int i) {
        bArr[i] = this.Y0;
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // ax.pb.P, ax.pb.AbstractC2818s
    public String toString() {
        return new String("Trans2FindNext2[" + super.toString() + ",sid=" + this.d1 + ",searchCount=" + m0.i1 + ",informationLevel=0x" + C2896d.c(this.e1, 3) + ",resumeKey=0x" + C2896d.c(this.f1, 4) + ",flags=0x" + C2896d.c(this.g1, 2) + ",filename=" + this.h1 + "]");
    }
}
