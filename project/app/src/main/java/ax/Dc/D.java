/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.N;
import ax.Dc.U;
import ax.Dc.W;
import ax.Dc.Z;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.zip.ZipException;

public class D
implements N,
Cloneable,
Serializable {
    private static final W i0 = new W(21589);
    private boolean c0;
    private boolean d0;
    private boolean e0;
    private U f0;
    private U g0;
    private U h0;
    private byte q;

    private void o() {
        this.r((byte)0);
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
    }

    private static Date t(U u8) {
        if (u8 != null) {
            return new Date((long)u8.d() * 1000L);
        }
        return null;
    }

    @Override
    public W b() {
        return i0;
    }

    @Override
    public W c() {
        boolean bl = this.c0;
        int n8 = 0;
        int n9 = bl ? 4 : 0;
        int n10 = this.d0 && this.g0 != null ? 4 : 0;
        int n11 = n8;
        if (this.e0) {
            n11 = n8;
            if (this.h0 != null) {
                n11 = 4;
            }
        }
        return new W(n9 + 1 + n10 + n11);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void d(byte[] object, int n8, int n9) throws ZipException {
        this.o();
        if (n9 >= 1) {
            int n10 = n9 + n8;
            n9 = n8 + 1;
            this.r((byte)object[n8]);
            if (this.c0 && (n8 += 5) <= n10) {
                this.f0 = new U((byte[])object, n9);
            } else {
                this.c0 = false;
                n8 = n9;
            }
            if (this.d0 && (n9 = n8 + 4) <= n10) {
                this.g0 = new U((byte[])object, n8);
                n8 = n9;
            } else {
                this.d0 = false;
            }
            if (this.e0 && n8 + 4 <= n10) {
                this.h0 = new U((byte[])object, n8);
                return;
            }
            this.e0 = false;
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("X5455_ExtendedTimestamp too short, only ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" bytes");
        throw new ZipException(((StringBuilder)object).toString());
    }

    public boolean equals(Object object) {
        if (object instanceof D) {
            U u8;
            U u9;
            object = (D)object;
            if ((this.q & 7) == (((D)object).q & 7) && ((u9 = this.f0) == (u8 = ((D)object).f0) || u9 != null && u9.equals(u8)) && ((u9 = this.g0) == (u8 = ((D)object).g0) || u9 != null && u9.equals(u8)) && ((u9 = this.h0) == (object = ((D)object).h0) || u9 != null && u9.equals(object))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public byte[] f() {
        U u8;
        byte[] byArray = new byte[this.c().d()];
        byArray[0] = 0;
        boolean bl = this.c0;
        int n8 = 1;
        if (bl) {
            byArray[0] = (byte)1;
            System.arraycopy(this.f0.b(), 0, byArray, 1, 4);
            n8 = 5;
        }
        int n9 = n8;
        if (this.d0) {
            u8 = this.g0;
            n9 = n8;
            if (u8 != null) {
                byArray[0] = (byte)(byArray[0] | 2);
                System.arraycopy(u8.b(), 0, byArray, n8, 4);
                n9 = n8 + 4;
            }
        }
        if (this.e0 && (u8 = this.h0) != null) {
            byArray[0] = (byte)(byArray[0] | 4);
            System.arraycopy(u8.b(), 0, byArray, n9, 4);
        }
        return byArray;
    }

    @Override
    public byte[] h() {
        return Arrays.copyOf(this.f(), this.i().d());
    }

    public int hashCode() {
        int n8 = (this.q & 7) * -123;
        U u8 = this.f0;
        int n9 = n8;
        if (u8 != null) {
            n9 = n8 ^ u8.hashCode();
        }
        u8 = this.g0;
        n8 = n9;
        if (u8 != null) {
            n8 = n9 ^ Integer.rotateLeft(u8.hashCode(), 11);
        }
        u8 = this.h0;
        n9 = n8;
        if (u8 != null) {
            n9 = n8 ^ Integer.rotateLeft(u8.hashCode(), 22);
        }
        return n9;
    }

    @Override
    public W i() {
        int n8 = this.c0 ? 4 : 0;
        return new W(n8 + 1);
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
        this.o();
        this.d(byArray, n8, n9);
    }

    public Date k() {
        return D.t(this.g0);
    }

    public Date l() {
        return D.t(this.h0);
    }

    public Date m() {
        return D.t(this.f0);
    }

    public U n() {
        return this.f0;
    }

    public void r(byte by) {
        this.q = by;
        boolean bl = false;
        boolean bl2 = (by & 1) == 1;
        this.c0 = bl2;
        bl2 = (by & 2) == 2;
        this.d0 = bl2;
        bl2 = bl;
        if ((by & 4) == 4) {
            bl2 = true;
        }
        this.e0 = bl2;
    }

    public void s(U u8) {
        boolean bl = u8 != null;
        this.c0 = bl;
        int n8 = u8 != null ? 1 | this.q : this.q & 0xFFFFFFFE;
        this.q = (byte)n8;
        this.f0 = u8;
    }

    public String toString() {
        Date date;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x5455 Zip Extra Field: Flags=");
        stringBuilder.append(Integer.toBinaryString(Z.l(this.q)));
        stringBuilder.append(" ");
        if (this.c0 && this.f0 != null) {
            date = this.m();
            stringBuilder.append(" Modify:[");
            stringBuilder.append(date);
            stringBuilder.append("] ");
        }
        if (this.d0 && this.g0 != null) {
            date = this.k();
            stringBuilder.append(" Access:[");
            stringBuilder.append(date);
            stringBuilder.append("] ");
        }
        if (this.e0 && this.h0 != null) {
            date = this.l();
            stringBuilder.append(" Create:[");
            stringBuilder.append(date);
            stringBuilder.append("] ");
        }
        return stringBuilder.toString();
    }
}

