package ax.pb;

/* loaded from: classes3.dex */
class L extends AbstractC2795b {
    byte[] F0;
    int G0;
    int H0;
    int I0;
    int J0;

    L() {
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        this.H0 = AbstractC2818s.i(bArr, i + 2);
        this.I0 = AbstractC2818s.i(bArr, i + 6);
        this.J0 = AbstractC2818s.i(bArr, i + 8);
        return (i + 20) - i;
    }

    @Override // ax.pb.AbstractC2795b, ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComReadAndXResponse[" + super.toString() + ",dataCompactionMode=" + this.H0 + ",dataLength=" + this.I0 + ",dataOffset=" + this.J0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        return 0;
    }

    L(byte[] bArr, int i) {
        this.F0 = bArr;
        this.G0 = i;
    }
}
