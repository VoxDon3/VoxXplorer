/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.jb.a;
import ax.pb.b;
import ax.pb.s;
import ax.qb.d;
import java.util.Date;

class G
extends b {
    private static final int M0 = a.d("jcifs.smb.client.OpenAndX.ReadAndX", 1);
    int F0;
    int G0;
    int H0;
    int I0;
    int J0;
    int K0;
    int L0;

    G(String string, int n8, int n9, s s8) {
        super(s8);
        this.x0 = string;
        this.d0 = (byte)45;
        this.G0 = n8 &= 3;
        if (n8 == 3) {
            this.G0 = 2;
        }
        this.G0 = (this.G0 | 0x40) & 0xFFFFFFFE;
        this.H0 = 22;
        this.I0 = 0;
        if ((n9 & 0x40) == 64) {
            if ((n9 & 0x10) == 16) {
                this.K0 = 18;
                return;
            }
            this.K0 = 2;
            return;
        }
        if ((n9 & 0x10) == 16) {
            if ((n9 & 0x20) == 32) {
                this.K0 = 16;
                return;
            }
            this.K0 = 17;
            return;
        }
        this.K0 = 1;
    }

    @Override
    int E(byte by) {
        if (by == 46) {
            return M0;
        }
        return 0;
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int l(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbComOpenAndX[");
        stringBuilder.append(super.toString());
        stringBuilder.append(",flags=0x");
        stringBuilder.append(d.c(this.F0, 2));
        stringBuilder.append(",desiredAccess=0x");
        stringBuilder.append(d.c(this.G0, 4));
        stringBuilder.append(",searchAttributes=0x");
        stringBuilder.append(d.c(this.H0, 4));
        stringBuilder.append(",fileAttributes=0x");
        stringBuilder.append(d.c(this.I0, 4));
        stringBuilder.append(",creationTime=");
        stringBuilder.append(new Date(this.J0));
        stringBuilder.append(",openFunction=0x");
        stringBuilder.append(d.c(this.K0, 2));
        stringBuilder.append(",allocationSize=");
        stringBuilder.append(this.L0);
        stringBuilder.append(",fileName=");
        stringBuilder.append(this.x0);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    @Override
    int u(byte[] byArray, int n8) {
        int n9;
        if (this.q0) {
            n9 = n8 + 1;
            byArray[n8] = 0;
        } else {
            n9 = n8;
        }
        return n9 + this.A(this.x0, byArray, n9) - n8;
    }

    @Override
    int z(byte[] byArray, int n8) {
        s.w(this.F0, byArray, n8);
        s.w(this.G0, byArray, n8 + 2);
        s.w(this.H0, byArray, n8 + 4);
        s.w(this.I0, byArray, n8 + 6);
        this.J0 = 0;
        s.x(0, byArray, n8 + 8);
        s.w(this.K0, byArray, n8 + 12);
        s.x(this.L0, byArray, n8 + 14);
        int n9 = n8 + 18;
        int n10 = 0;
        while (n10 < 8) {
            byArray[n9] = 0;
            ++n10;
            ++n9;
        }
        return n9 - n8;
    }
}

