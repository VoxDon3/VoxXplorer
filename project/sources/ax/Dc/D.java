package ax.Dc;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.zip.ZipException;

/* loaded from: classes3.dex */
public class D implements N, Cloneable, Serializable {
    private static final W i0 = new W(21589);
    private boolean c0;
    private boolean d0;
    private boolean e0;
    private U f0;
    private U g0;
    private U h0;
    private byte q;

    private void o() {
        r((byte) 0);
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
    }

    private static Date t(U u) {
        if (u != null) {
            return new Date(u.d() * 1000);
        }
        return null;
    }

    @Override // ax.Dc.N
    public W b() {
        return i0;
    }

    @Override // ax.Dc.N
    public W c() {
        int i = 0;
        int i2 = (this.c0 ? 4 : 0) + 1 + ((!this.d0 || this.g0 == null) ? 0 : 4);
        if (this.e0 && this.h0 != null) {
            i = 4;
        }
        return new W(i2 + i);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        int i3;
        int i4;
        o();
        if (i2 < 1) {
            throw new ZipException("X5455_ExtendedTimestamp too short, only " + i2 + " bytes");
        }
        int i5 = i2 + i;
        int i6 = i + 1;
        r(bArr[i]);
        if (!this.c0 || (i4 = i + 5) > i5) {
            this.c0 = false;
        } else {
            this.f0 = new U(bArr, i6);
            i6 = i4;
        }
        if (!this.d0 || (i3 = i6 + 4) > i5) {
            this.d0 = false;
        } else {
            this.g0 = new U(bArr, i6);
            i6 = i3;
        }
        if (!this.e0 || i6 + 4 > i5) {
            this.e0 = false;
        } else {
            this.h0 = new U(bArr, i6);
        }
    }

    public boolean equals(Object obj) {
        U u;
        U u2;
        U u3;
        U u4;
        if (obj instanceof D) {
            D d = (D) obj;
            if ((this.q & 7) == (d.q & 7) && (((u = this.f0) == (u2 = d.f0) || (u != null && u.equals(u2))) && ((u3 = this.g0) == (u4 = d.g0) || (u3 != null && u3.equals(u4))))) {
                U u5 = this.h0;
                U u6 = d.h0;
                if (u5 == u6) {
                    return true;
                }
                if (u5 != null && u5.equals(u6)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ax.Dc.N
    public byte[] f() {
        U u;
        U u2;
        byte[] bArr = new byte[c().d()];
        bArr[0] = 0;
        int i = 1;
        if (this.c0) {
            bArr[0] = (byte) 1;
            System.arraycopy(this.f0.b(), 0, bArr, 1, 4);
            i = 5;
        }
        if (this.d0 && (u2 = this.g0) != null) {
            bArr[0] = (byte) (bArr[0] | 2);
            System.arraycopy(u2.b(), 0, bArr, i, 4);
            i += 4;
        }
        if (this.e0 && (u = this.h0) != null) {
            bArr[0] = (byte) (bArr[0] | 4);
            System.arraycopy(u.b(), 0, bArr, i, 4);
        }
        return bArr;
    }

    @Override // ax.Dc.N
    public byte[] h() {
        return Arrays.copyOf(f(), i().d());
    }

    public int hashCode() {
        int i = (this.q & 7) * (-123);
        U u = this.f0;
        if (u != null) {
            i ^= u.hashCode();
        }
        U u2 = this.g0;
        if (u2 != null) {
            i ^= Integer.rotateLeft(u2.hashCode(), 11);
        }
        U u3 = this.h0;
        return u3 != null ? i ^ Integer.rotateLeft(u3.hashCode(), 22) : i;
    }

    @Override // ax.Dc.N
    public W i() {
        return new W((this.c0 ? 4 : 0) + 1);
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        o();
        d(bArr, i, i2);
    }

    public Date k() {
        return t(this.g0);
    }

    public Date l() {
        return t(this.h0);
    }

    public Date m() {
        return t(this.f0);
    }

    public U n() {
        return this.f0;
    }

    public void r(byte b) {
        this.q = b;
        this.c0 = (b & 1) == 1;
        this.d0 = (b & 2) == 2;
        this.e0 = (b & 4) == 4;
    }

    public void s(U u) {
        this.c0 = u != null;
        this.q = (byte) (u != null ? 1 | this.q : this.q & (-2));
        this.f0 = u;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("0x5455 Zip Extra Field: Flags=");
        sb.append(Integer.toBinaryString(Z.l(this.q)));
        sb.append(" ");
        if (this.c0 && this.f0 != null) {
            Date m = m();
            sb.append(" Modify:[");
            sb.append(m);
            sb.append("] ");
        }
        if (this.d0 && this.g0 != null) {
            Date k = k();
            sb.append(" Access:[");
            sb.append(k);
            sb.append("] ");
        }
        if (this.e0 && this.h0 != null) {
            Date l = l();
            sb.append(" Create:[");
            sb.append(l);
            sb.append("] ");
        }
        return sb.toString();
    }
}
