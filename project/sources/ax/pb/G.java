package ax.pb;

import ax.jb.C2345a;
import ax.qb.C2896d;
import java.util.Date;

/* loaded from: classes3.dex */
class G extends AbstractC2795b {
    private static final int M0 = C2345a.d("jcifs.smb.client.OpenAndX.ReadAndX", 1);
    int F0;
    int G0;
    int H0;
    int I0;
    int J0;
    int K0;
    int L0;

    G(String str, int i, int i2, AbstractC2818s abstractC2818s) {
        super(abstractC2818s);
        this.x0 = str;
        this.d0 = (byte) 45;
        int i3 = i & 3;
        this.G0 = i3;
        if (i3 == 3) {
            this.G0 = 2;
        }
        this.G0 = (this.G0 | 64) & (-2);
        this.H0 = 22;
        this.I0 = 0;
        if ((i2 & 64) == 64) {
            if ((i2 & 16) == 16) {
                this.K0 = 18;
                return;
            } else {
                this.K0 = 2;
                return;
            }
        }
        if ((i2 & 16) != 16) {
            this.K0 = 1;
        } else if ((i2 & 32) == 32) {
            this.K0 = 16;
        } else {
            this.K0 = 17;
        }
    }

    @Override // ax.pb.AbstractC2795b
    int E(byte b) {
        if (b == 46) {
            return M0;
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
        return new String("SmbComOpenAndX[" + super.toString() + ",flags=0x" + C2896d.c(this.F0, 2) + ",desiredAccess=0x" + C2896d.c(this.G0, 4) + ",searchAttributes=0x" + C2896d.c(this.H0, 4) + ",fileAttributes=0x" + C2896d.c(this.I0, 4) + ",creationTime=" + new Date(this.J0) + ",openFunction=0x" + C2896d.c(this.K0, 2) + ",allocationSize=" + this.L0 + ",fileName=" + this.x0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        int i2;
        if (this.q0) {
            i2 = i + 1;
            bArr[i] = 0;
        } else {
            i2 = i;
        }
        return (i2 + A(this.x0, bArr, i2)) - i;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        AbstractC2818s.w(this.F0, bArr, i);
        AbstractC2818s.w(this.G0, bArr, i + 2);
        AbstractC2818s.w(this.H0, bArr, i + 4);
        AbstractC2818s.w(this.I0, bArr, i + 6);
        this.J0 = 0;
        AbstractC2818s.x(0, bArr, i + 8);
        AbstractC2818s.w(this.K0, bArr, i + 12);
        AbstractC2818s.x(this.L0, bArr, i + 14);
        int i2 = i + 18;
        int i3 = 0;
        while (i3 < 8) {
            bArr[i2] = 0;
            i3++;
            i2++;
        }
        return i2 - i;
    }
}
