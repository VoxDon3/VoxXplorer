package ax.pb;

/* loaded from: classes3.dex */
class V extends AbstractC2818s {
    private int C0;
    private int D0;
    private int E0;
    private int F0;
    private int G0;
    private byte[] H0;

    V() {
        this.d0 = (byte) 11;
    }

    void E(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.C0 = i;
        this.E0 = (int) (j & 4294967295L);
        this.F0 = i2;
        this.H0 = bArr;
        this.G0 = i3;
        this.D0 = i4;
        this.y0 = null;
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComWrite[" + super.toString() + ",fid=" + this.C0 + ",count=" + this.D0 + ",offset=" + this.E0 + ",remaining=" + this.F0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        bArr[i] = 1;
        AbstractC2818s.w(this.D0, bArr, i + 1);
        int i2 = i + 3;
        System.arraycopy(this.H0, this.G0, bArr, i2, this.D0);
        return (i2 + this.D0) - i;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        AbstractC2818s.w(this.C0, bArr, i);
        AbstractC2818s.w(this.D0, bArr, i + 2);
        AbstractC2818s.x(this.E0, bArr, i + 4);
        AbstractC2818s.w(this.F0, bArr, i + 8);
        return (i + 10) - i;
    }
}
