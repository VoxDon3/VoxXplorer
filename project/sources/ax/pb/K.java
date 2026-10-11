package ax.pb;

import ax.jb.C2345a;

/* loaded from: classes3.dex */
class K extends AbstractC2795b {
    private static final int L0 = C2345a.d("jcifs.smb.client.ReadAndX.Close", 1);
    private long F0;
    private int G0;
    private int H0;
    int I0;
    int J0;
    int K0;

    K(int i, long j, int i2, AbstractC2818s abstractC2818s) {
        super(abstractC2818s);
        this.G0 = i;
        this.F0 = j;
        this.J0 = i2;
        this.I0 = i2;
        this.d0 = (byte) 46;
        this.H0 = -1;
    }

    @Override // ax.pb.AbstractC2795b
    int E(byte b) {
        if (b == 4) {
            return L0;
        }
        return 0;
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
        return new String("SmbComReadAndX[" + super.toString() + ",fid=" + this.G0 + ",offset=" + this.F0 + ",maxCount=" + this.I0 + ",minCount=" + this.J0 + ",openTimeout=" + this.H0 + ",remaining=" + this.K0 + ",offset=" + this.F0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        AbstractC2818s.w(this.G0, bArr, i);
        AbstractC2818s.x(this.F0, bArr, i + 2);
        AbstractC2818s.w(this.I0, bArr, i + 6);
        AbstractC2818s.w(this.J0, bArr, i + 8);
        AbstractC2818s.x(this.H0, bArr, i + 10);
        AbstractC2818s.w(this.K0, bArr, i + 14);
        AbstractC2818s.x(this.F0 >> 32, bArr, i + 16);
        return (i + 20) - i;
    }
}
