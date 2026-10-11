package ax.pb;

/* loaded from: classes3.dex */
class p0 extends P {
    private int d1 = 3;

    p0(String str) {
        this.x0 = str;
        this.d0 = (byte) 50;
        this.Y0 = (byte) 16;
        this.S0 = 0;
        this.T0 = 0;
        this.U0 = 4096;
        this.V0 = (byte) 0;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.P
    int G(byte[] bArr, int i) {
        AbstractC2818s.w(this.d1, bArr, i);
        int i2 = i + 2;
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
        return new String("Trans2GetDfsReferral[" + super.toString() + ",maxReferralLevel=0x" + this.d1 + ",filename=" + this.x0 + "]");
    }
}
