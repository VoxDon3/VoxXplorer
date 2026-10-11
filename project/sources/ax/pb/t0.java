package ax.pb;

import ax.qb.C2896d;

/* loaded from: classes3.dex */
class t0 extends P {
    private int d1;

    t0(String str, int i) {
        this.x0 = str;
        this.d1 = i;
        this.d0 = (byte) 50;
        this.Y0 = (byte) 5;
        this.S0 = 0;
        this.T0 = 2;
        this.U0 = 40;
        this.V0 = (byte) 0;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.P
    int G(byte[] bArr, int i) {
        AbstractC2818s.w(this.d1, bArr, i);
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        bArr[i + 4] = 0;
        int i2 = i + 6;
        bArr[i + 5] = 0;
        return (i2 + A(this.x0, bArr, i2)) - i;
    }

    @Override // ax.pb.P
    int H(byte[] bArr, int i) {
        bArr[i] = this.Y0;
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // ax.pb.P, ax.pb.AbstractC2818s
    public String toString() {
        return new String("Trans2QueryPathInformation[" + super.toString() + ",informationLevel=0x" + C2896d.c(this.d1, 3) + ",filename=" + this.x0 + "]");
    }
}
