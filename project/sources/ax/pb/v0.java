package ax.pb;

/* loaded from: classes3.dex */
class v0 extends P {
    private int d1;
    private int e1;
    private long f1;
    private long g1;

    v0(int i, int i2, long j, long j2) {
        this.d1 = i;
        this.e1 = i2;
        this.f1 = j;
        this.g1 = j2;
        this.d0 = (byte) 50;
        this.Y0 = (byte) 8;
        this.T0 = 6;
        this.U0 = 0;
        this.V0 = (byte) 0;
    }

    @Override // ax.pb.P
    int F(byte[] bArr, int i) {
        AbstractC2818s.C(this.f1, bArr, i);
        AbstractC2818s.y(0L, bArr, i + 8);
        AbstractC2818s.C(this.g1, bArr, i + 16);
        AbstractC2818s.y(0L, bArr, i + 24);
        AbstractC2818s.w(this.e1 | 128, bArr, i + 32);
        AbstractC2818s.y(0L, bArr, i + 34);
        return (i + 40) - i;
    }

    @Override // ax.pb.P
    int G(byte[] bArr, int i) {
        AbstractC2818s.w(this.d1, bArr, i);
        AbstractC2818s.w(257L, bArr, i + 2);
        AbstractC2818s.w(0L, bArr, i + 4);
        return (i + 6) - i;
    }

    @Override // ax.pb.P
    int H(byte[] bArr, int i) {
        bArr[i] = this.Y0;
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // ax.pb.P, ax.pb.AbstractC2818s
    public String toString() {
        return new String("Trans2SetFileInformation[" + super.toString() + ",fid=" + this.d1 + "]");
    }
}
