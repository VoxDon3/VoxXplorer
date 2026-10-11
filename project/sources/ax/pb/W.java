package ax.pb;

import ax.jb.C2345a;

/* loaded from: classes3.dex */
class W extends AbstractC2795b {
    private static final int O0 = C2345a.d("jcifs.smb.client.WriteAndX.ReadAndX", 1);
    private static final int P0 = C2345a.d("jcifs.smb.client.WriteAndX.Close", 1);
    private int F0;
    private int G0;
    private int H0;
    private int I0;
    private int J0;
    private byte[] K0;
    private long L0;
    private int M0;
    int N0;

    W() {
        super(null);
        this.d0 = (byte) 47;
    }

    @Override // ax.pb.AbstractC2795b
    int E(byte b) {
        if (b == 46) {
            return O0;
        }
        if (b == 4) {
            return P0;
        }
        return 0;
    }

    void H(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.F0 = i;
        this.L0 = j;
        this.G0 = i2;
        this.K0 = bArr;
        this.J0 = i3;
        this.H0 = i4;
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

    @Override // ax.pb.AbstractC2795b, ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComWriteAndX[" + super.toString() + ",fid=" + this.F0 + ",offset=" + this.L0 + ",writeMode=" + this.N0 + ",remaining=" + this.G0 + ",dataLength=" + this.H0 + ",dataOffset=" + this.I0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        int i2 = i;
        while (true) {
            int i3 = this.M0;
            this.M0 = i3 - 1;
            if (i3 <= 0) {
                System.arraycopy(this.K0, this.J0, bArr, i2, this.H0);
                return (i2 + this.H0) - i;
            }
            bArr[i2] = -18;
            i2++;
        }
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        int i2 = this.f0;
        int i3 = (i - i2) + 26;
        this.I0 = i3;
        int i4 = (i3 - i2) % 4;
        this.M0 = i4;
        int i5 = i4 == 0 ? 0 : 4 - i4;
        this.M0 = i5;
        this.I0 = i3 + i5;
        AbstractC2818s.w(this.F0, bArr, i);
        AbstractC2818s.x(this.L0, bArr, i + 2);
        int i6 = i + 6;
        int i7 = 0;
        while (i7 < 4) {
            bArr[i6] = -1;
            i7++;
            i6++;
        }
        AbstractC2818s.w(this.N0, bArr, i6);
        AbstractC2818s.w(this.G0, bArr, i6 + 2);
        bArr[i6 + 4] = 0;
        bArr[i6 + 5] = 0;
        AbstractC2818s.w(this.H0, bArr, i6 + 6);
        AbstractC2818s.w(this.I0, bArr, i6 + 8);
        AbstractC2818s.x(this.L0 >> 32, bArr, i6 + 10);
        return (i6 + 14) - i;
    }

    W(int i, long j, int i2, byte[] bArr, int i3, int i4, AbstractC2818s abstractC2818s) {
        super(abstractC2818s);
        this.F0 = i;
        this.L0 = j;
        this.G0 = i2;
        this.K0 = bArr;
        this.J0 = i3;
        this.H0 = i4;
        this.d0 = (byte) 47;
    }
}
