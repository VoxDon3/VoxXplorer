package ax.pb;

import ax.jb.C2345a;
import ax.pb.k0;
import ax.qb.C2896d;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
class S extends AbstractC2795b {
    private static final boolean L0 = C2345a.a("jcifs.smb.client.disablePlainTextPasswords", false);
    private static byte[] M0 = {1, 1, 1, 1, 1, 1, 1, 1, 0};
    private i0 F0;
    private boolean G0;
    private String H0;
    private byte[] I0;
    private int J0;
    String K0;

    static {
        String g = C2345a.g("jcifs.smb.client.TreeConnectAndX.CheckDirectory");
        if (g != null) {
            M0[0] = Byte.parseByte(g);
        }
        String g2 = C2345a.g("jcifs.smb.client.TreeConnectAndX.CreateDirectory");
        if (g2 != null) {
            M0[2] = Byte.parseByte(g2);
        }
        String g3 = C2345a.g("jcifs.smb.client.TreeConnectAndX.Delete");
        if (g3 != null) {
            M0[3] = Byte.parseByte(g3);
        }
        String g4 = C2345a.g("jcifs.smb.client.TreeConnectAndX.DeleteDirectory");
        if (g4 != null) {
            M0[4] = Byte.parseByte(g4);
        }
        String g5 = C2345a.g("jcifs.smb.client.TreeConnectAndX.OpenAndX");
        if (g5 != null) {
            M0[5] = Byte.parseByte(g5);
        }
        String g6 = C2345a.g("jcifs.smb.client.TreeConnectAndX.Rename");
        if (g6 != null) {
            M0[6] = Byte.parseByte(g6);
        }
        String g7 = C2345a.g("jcifs.smb.client.TreeConnectAndX.Transaction");
        if (g7 != null) {
            M0[7] = Byte.parseByte(g7);
        }
        String g8 = C2345a.g("jcifs.smb.client.TreeConnectAndX.QueryInformation");
        if (g8 != null) {
            M0[8] = Byte.parseByte(g8);
        }
    }

    S(i0 i0Var, String str, String str2, AbstractC2818s abstractC2818s) {
        super(abstractC2818s);
        this.G0 = false;
        this.F0 = i0Var;
        this.K0 = str;
        this.H0 = str2;
        this.d0 = (byte) 117;
    }

    @Override // ax.pb.AbstractC2795b
    int E(byte b) {
        int i = b & 255;
        if (i == 0) {
            return M0[2];
        }
        if (i == 1) {
            return M0[4];
        }
        if (i == 6) {
            return M0[3];
        }
        if (i == 7) {
            return M0[6];
        }
        if (i == 8) {
            return M0[8];
        }
        if (i == 16) {
            return M0[0];
        }
        if (i == 37) {
            return M0[7];
        }
        if (i != 45) {
            return 0;
        }
        return M0[5];
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
        return new String("SmbComTreeConnectAndX[" + super.toString() + ",disconnectTid=" + this.G0 + ",passwordLength=" + this.J0 + ",password=" + C2896d.d(this.I0, this.J0, 0) + ",path=" + this.K0 + ",service=" + this.H0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        int i2;
        i0 i0Var = this.F0;
        try {
            if (i0Var.h.w0.g == 0) {
                r rVar = i0Var.i;
                if (rVar.g0 || rVar.d0.length() > 0) {
                    System.arraycopy(this.I0, 0, bArr, i, this.J0);
                    i2 = this.J0 + i;
                    int A = i2 + A(this.K0, bArr, i2);
                    System.arraycopy(this.H0.getBytes("ASCII"), 0, bArr, A, this.H0.length());
                    int length = A + this.H0.length();
                    bArr[length] = 0;
                    return (length + 1) - i;
                }
            }
            System.arraycopy(this.H0.getBytes("ASCII"), 0, bArr, A, this.H0.length());
            int length2 = A + this.H0.length();
            bArr[length2] = 0;
            return (length2 + 1) - i;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
        i2 = i + 1;
        bArr[i] = 0;
        int A2 = i2 + A(this.K0, bArr, i2);
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        i0 i0Var = this.F0;
        if (i0Var.h.w0.g == 0) {
            r rVar = i0Var.i;
            if (rVar.g0 || rVar.d0.length() > 0) {
                i0 i0Var2 = this.F0;
                k0.a aVar = i0Var2.h.w0;
                if (aVar.h) {
                    byte[] c = i0Var2.i.c(aVar.p);
                    this.I0 = c;
                    this.J0 = c.length;
                } else {
                    if (L0) {
                        throw new RuntimeException("Plain text passwords are disabled");
                    }
                    byte[] bArr2 = new byte[(i0Var2.i.d0.length() + 1) * 2];
                    this.I0 = bArr2;
                    this.J0 = A(this.F0.i.d0, bArr2, 0);
                }
                bArr[i] = this.G0;
                bArr[i + 1] = 0;
                AbstractC2818s.w(this.J0, bArr, i + 2);
                return 4;
            }
        }
        this.J0 = 1;
        bArr[i] = this.G0;
        bArr[i + 1] = 0;
        AbstractC2818s.w(this.J0, bArr, i + 2);
        return 4;
    }
}
