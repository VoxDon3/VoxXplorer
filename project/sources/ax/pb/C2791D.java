package ax.pb;

import ax.qb.C2896d;
import java.util.Date;

/* renamed from: ax.pb.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2791D extends AbstractC2795b {
    byte F0;
    int G0;
    int H0;
    int I0;
    int J0;
    int K0;
    long L0;
    long M0;
    long N0;
    long O0;
    long P0;
    long Q0;
    boolean R0;
    boolean S0;

    C2791D() {
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        this.F0 = bArr[i];
        this.G0 = AbstractC2818s.i(bArr, i + 1);
        this.H0 = AbstractC2818s.j(bArr, i + 3);
        this.L0 = AbstractC2818s.q(bArr, i + 7);
        this.M0 = AbstractC2818s.q(bArr, i + 15);
        this.N0 = AbstractC2818s.q(bArr, i + 23);
        this.O0 = AbstractC2818s.q(bArr, i + 31);
        this.I0 = AbstractC2818s.j(bArr, i + 39);
        this.P0 = AbstractC2818s.k(bArr, i + 43);
        this.Q0 = AbstractC2818s.k(bArr, i + 51);
        this.J0 = AbstractC2818s.i(bArr, i + 59);
        this.K0 = AbstractC2818s.i(bArr, i + 61);
        int i2 = i + 64;
        this.R0 = (bArr[i + 63] & 255) > 0;
        return i2 - i;
    }

    @Override // ax.pb.AbstractC2795b, ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComNTCreateAndXResponse[" + super.toString() + ",oplockLevel=" + ((int) this.F0) + ",fid=" + this.G0 + ",createAction=0x" + C2896d.c(this.H0, 4) + ",creationTime=" + new Date(this.L0) + ",lastAccessTime=" + new Date(this.M0) + ",lastWriteTime=" + new Date(this.N0) + ",changeTime=" + new Date(this.O0) + ",extFileAttributes=0x" + C2896d.c(this.I0, 4) + ",allocationSize=" + this.P0 + ",endOfFile=" + this.Q0 + ",fileType=" + this.J0 + ",deviceState=" + this.K0 + ",directory=" + this.R0 + "]");
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
