package ax.pb;

/* loaded from: classes3.dex */
class H extends AbstractC2795b {
    int F0;
    int G0;
    int H0;
    int I0;
    int J0;
    int K0;
    int L0;
    int M0;
    long N0;

    H() {
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        this.F0 = AbstractC2818s.i(bArr, i);
        this.G0 = AbstractC2818s.i(bArr, i + 2);
        this.N0 = AbstractC2818s.r(bArr, i + 4);
        this.H0 = AbstractC2818s.j(bArr, i + 8);
        this.I0 = AbstractC2818s.i(bArr, i + 12);
        this.J0 = AbstractC2818s.i(bArr, i + 14);
        this.K0 = AbstractC2818s.i(bArr, i + 16);
        this.L0 = AbstractC2818s.i(bArr, i + 18);
        this.M0 = AbstractC2818s.j(bArr, i + 20);
        return (i + 26) - i;
    }

    @Override // ax.pb.AbstractC2795b, ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComOpenAndXResponse[" + super.toString() + ",fid=" + this.F0 + ",fileAttributes=" + this.G0 + ",lastWriteTime=" + this.N0 + ",dataSize=" + this.H0 + ",grantedAccess=" + this.I0 + ",fileType=" + this.J0 + ",deviceState=" + this.K0 + ",action=" + this.L0 + ",serverFid=" + this.M0 + "]");
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
