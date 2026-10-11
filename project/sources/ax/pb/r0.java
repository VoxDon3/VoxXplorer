package ax.pb;

import ax.qb.C2896d;

/* loaded from: classes3.dex */
class r0 extends P {
    private int d1;

    r0(int i) {
        this.d0 = (byte) 50;
        this.Y0 = (byte) 3;
        this.d1 = i;
        this.R0 = 2;
        this.S0 = 0;
        this.T0 = 0;
        this.U0 = 800;
        this.V0 = (byte) 0;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.P
    int G(byte[] bArr, int i) {
        AbstractC2818s.w(this.d1, bArr, i);
        return (i + 2) - i;
    }

    @Override // ax.pb.P
    int H(byte[] bArr, int i) {
        bArr[i] = this.Y0;
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // ax.pb.P, ax.pb.AbstractC2818s
    public String toString() {
        return new String("Trans2QueryFSInformation[" + super.toString() + ",informationLevel=0x" + C2896d.c(this.d1, 3) + "]");
    }
}
