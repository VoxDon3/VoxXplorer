package ax.pb;

import ax.jb.C2345a;
import ax.pb.k0;

/* loaded from: classes3.dex */
class N extends AbstractC2795b {
    private static final int O0 = C2345a.d("jcifs.smb.client.SessionSetupAndX.TreeConnectAndX", 1);
    private static final boolean P0 = C2345a.a("jcifs.smb.client.disablePlainTextPasswords", false);
    private byte[] F0;
    private byte[] G0;
    private byte[] H0;
    private int I0;
    private int J0;
    private String K0;
    private String L0;
    i0 M0;
    Object N0;

    N(i0 i0Var, AbstractC2818s abstractC2818s, Object obj) throws C2794a0 {
        super(abstractC2818s);
        this.H0 = null;
        this.d0 = (byte) 115;
        this.M0 = i0Var;
        this.N0 = obj;
        k0 k0Var = i0Var.h;
        this.I0 = k0Var.C0;
        int i = k0Var.B0;
        this.J0 = i;
        k0.a aVar = k0Var.w0;
        int i2 = aVar.g;
        if (i2 != 1) {
            if (i2 != 0) {
                throw new C2794a0("Unsupported");
            }
            if (!(obj instanceof r)) {
                throw new C2794a0("Unsupported credential type");
            }
            r rVar = (r) obj;
            this.F0 = new byte[0];
            this.G0 = new byte[0];
            String str = rVar.c0;
            this.K0 = str;
            if (this.q0) {
                this.K0 = str.toUpperCase();
            }
            this.L0 = rVar.q.toUpperCase();
            return;
        }
        if (!(obj instanceof r)) {
            if (!(obj instanceof byte[])) {
                throw new C2794a0("Unsupported credential type");
            }
            this.H0 = (byte[]) obj;
            return;
        }
        r rVar2 = (r) obj;
        if (rVar2 == r.q0) {
            this.F0 = new byte[0];
            this.G0 = new byte[0];
            this.J0 = Integer.MAX_VALUE & i;
        } else if (aVar.h) {
            this.F0 = rVar2.c(aVar.p);
            byte[] l = rVar2.l(i0Var.h.w0.p);
            this.G0 = l;
            if (this.F0.length == 0 && l.length == 0) {
                throw new RuntimeException("Null setup prohibited.");
            }
        } else {
            if (P0) {
                throw new RuntimeException("Plain text passwords are disabled");
            }
            if (this.q0) {
                String i3 = rVar2.i();
                this.F0 = new byte[0];
                byte[] bArr = new byte[(i3.length() + 1) * 2];
                this.G0 = bArr;
                A(i3, bArr, 0);
            } else {
                String i4 = rVar2.i();
                byte[] bArr2 = new byte[(i4.length() + 1) * 2];
                this.F0 = bArr2;
                this.G0 = new byte[0];
                A(i4, bArr2, 0);
            }
        }
        String str2 = rVar2.c0;
        this.K0 = str2;
        if (this.q0) {
            this.K0 = str2.toUpperCase();
        }
        this.L0 = rVar2.q.toUpperCase();
    }

    @Override // ax.pb.AbstractC2795b
    int E(byte b) {
        if (b == 117) {
            return O0;
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
        StringBuilder sb = new StringBuilder();
        sb.append("SmbComSessionSetupAndX[");
        sb.append(super.toString());
        sb.append(",snd_buf_size=");
        sb.append(this.M0.h.z0);
        sb.append(",maxMpxCount=");
        sb.append(this.M0.h.y0);
        sb.append(",VC_NUMBER=");
        k0 k0Var = this.M0.h;
        sb.append(1);
        sb.append(",sessionKey=");
        sb.append(this.I0);
        sb.append(",lmHash.length=");
        byte[] bArr = this.F0;
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(",ntHash.length=");
        byte[] bArr2 = this.G0;
        sb.append(bArr2 != null ? bArr2.length : 0);
        sb.append(",capabilities=");
        sb.append(this.J0);
        sb.append(",accountName=");
        sb.append(this.K0);
        sb.append(",primaryDomain=");
        sb.append(this.L0);
        sb.append(",NATIVE_OS=");
        k0 k0Var2 = this.M0.h;
        sb.append(Z.V);
        sb.append(",NATIVE_LANMAN=");
        k0 k0Var3 = this.M0.h;
        sb.append(Z.W);
        sb.append("]");
        return new String(sb.toString());
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        int A;
        byte[] bArr2 = this.H0;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            A = this.H0.length + i;
        } else {
            byte[] bArr3 = this.F0;
            System.arraycopy(bArr3, 0, bArr, i, bArr3.length);
            int length = this.F0.length + i;
            byte[] bArr4 = this.G0;
            System.arraycopy(bArr4, 0, bArr, length, bArr4.length);
            int length2 = length + this.G0.length;
            int A2 = length2 + A(this.K0, bArr, length2);
            A = A2 + A(this.L0, bArr, A2);
        }
        k0 k0Var = this.M0.h;
        int A3 = A + A(Z.V, bArr, A);
        k0 k0Var2 = this.M0.h;
        return (A3 + A(Z.W, bArr, A3)) - i;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        int i2;
        AbstractC2818s.w(this.M0.h.z0, bArr, i);
        AbstractC2818s.w(this.M0.h.y0, bArr, i + 2);
        k0 k0Var = this.M0.h;
        AbstractC2818s.w(1L, bArr, i + 4);
        AbstractC2818s.x(this.I0, bArr, i + 6);
        int i3 = i + 10;
        if (this.H0 != null) {
            AbstractC2818s.w(r1.length, bArr, i3);
            i2 = i + 12;
        } else {
            AbstractC2818s.w(this.F0.length, bArr, i3);
            AbstractC2818s.w(this.G0.length, bArr, i + 12);
            i2 = i + 14;
        }
        bArr[i2] = 0;
        bArr[i2 + 1] = 0;
        bArr[i2 + 2] = 0;
        bArr[i2 + 3] = 0;
        AbstractC2818s.x(this.J0, bArr, i2 + 4);
        return (i2 + 8) - i;
    }
}
