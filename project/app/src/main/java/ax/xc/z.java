/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.tb.i;
import ax.xc.b;
import ax.xc.e;
import ax.xc.h;
import ax.xc.x;
import ax.yc.c;
import java.security.MessageDigest;

public final class z
extends h {
    private final transient byte[][] g0;
    private final transient int[] h0;

    public z(byte[][] byArray, int[] nArray) {
        l.f(byArray, "segments");
        l.f(nArray, "directory");
        super(h.f0.p());
        this.g0 = byArray;
        this.h0 = nArray;
    }

    private final h O() {
        return new h(this.J());
    }

    @Override
    public boolean A(int n8, h h8, int n9, int n10) {
        l.f(h8, "other");
        if (n8 >= 0 && n8 <= this.G() - n10) {
            int n11 = n10 + n8;
            int n12 = c.b(this, n8);
            n10 = n9;
            n9 = n12;
            while (n8 < n11) {
                n12 = n9 == 0 ? 0 : this.M()[n9 - 1];
                int n13 = this.M()[n9];
                int n14 = this.M()[this.N().length + n9];
                n13 = Math.min(n11, n13 - n12 + n12) - n8;
                if (!h8.B(n10, this.N()[n9], n14 + (n8 - n12), n13)) {
                    return false;
                }
                n10 += n13;
                n8 += n13;
                ++n9;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean B(int n8, byte[] byArray, int n9, int n10) {
        l.f(byArray, "other");
        if (n8 >= 0 && n8 <= this.G() - n10 && n9 >= 0 && n9 <= byArray.length - n10) {
            int n11 = n10 + n8;
            int n12 = c.b(this, n8);
            n10 = n9;
            n9 = n12;
            while (n8 < n11) {
                n12 = n9 == 0 ? 0 : this.M()[n9 - 1];
                int n13 = this.M()[n9];
                int n14 = this.M()[this.N().length + n9];
                n13 = Math.min(n11, n13 - n12 + n12) - n8;
                if (!b.a(this.N()[n9], n14 + (n8 - n12), byArray, n10, n13)) {
                    return false;
                }
                n10 += n13;
                n8 += n13;
                ++n9;
            }
            return true;
        }
        return false;
    }

    @Override
    public h I() {
        return this.O().I();
    }

    @Override
    public byte[] J() {
        byte[] byArray = new byte[this.G()];
        int n8 = this.N().length;
        int n9 = 0;
        int n10 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n11 = this.M()[n8 + i8];
            int n12 = this.M()[i8];
            byte[] byArray2 = this.N()[i8];
            n9 = n12 - n9;
            i.d(byArray2, byArray, n10, n11, n11 + n9);
            n10 += n9;
            n9 = n12;
        }
        return byArray;
    }

    @Override
    public void L(e e8, int n8, int n9) {
        l.f(e8, "buffer");
        int n10 = n8 + n9;
        int n11 = c.b(this, n8);
        while (n8 < n10) {
            int n12 = n11 == 0 ? 0 : this.M()[n11 - 1];
            int n13 = this.M()[n11];
            int n14 = this.M()[this.N().length + n11];
            n13 = Math.min(n10, n13 - n12 + n12) - n8;
            n12 = n14 + (n8 - n12);
            x x8 = new x(this.N()[n11], n12, n12 + n13, true, false);
            x x9 = e8.q;
            if (x9 == null) {
                x8.g = x8;
                x8.f = x8;
                e8.q = x8;
            } else {
                l.c(x9);
                x9 = x9.g;
                l.c(x9);
                x9.c(x8);
            }
            n8 += n13;
            ++n11;
        }
        e8.b1(e8.size() + (long)n9);
    }

    public final int[] M() {
        return this.h0;
    }

    public final byte[][] N() {
        return this.g0;
    }

    @Override
    public String d() {
        return this.O().d();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof h && ((h)(object = (h)object)).G() == this.G() && this.A(0, (h)object, 0, this.G());
    }

    @Override
    public int hashCode() {
        int n8 = this.q();
        if (n8 != 0) {
            return n8;
        }
        int n9 = this.N().length;
        int n10 = 0;
        int n11 = 1;
        for (int i8 = 0; i8 < n9; ++i8) {
            int n12 = this.M()[n9 + i8];
            int n13 = this.M()[i8];
            byte[] byArray = this.N()[i8];
            for (n8 = n12; n8 < n13 - n10 + n12; ++n8) {
                n11 = n11 * 31 + byArray[n8];
            }
            n10 = n13;
        }
        this.C(n11);
        return n11;
    }

    @Override
    public h l(String object) {
        l.f(object, "algorithm");
        object = MessageDigest.getInstance((String)object);
        int n8 = this.N().length;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = this.M()[n8 + i8];
            int n11 = this.M()[i8];
            ((MessageDigest)object).update(this.N()[i8], n10, n11 - n9);
            n9 = n11;
        }
        object = ((MessageDigest)object).digest();
        l.c(object);
        return new h((byte[])object);
    }

    @Override
    public int r() {
        return this.M()[this.N().length - 1];
    }

    @Override
    public String t() {
        return this.O().t();
    }

    @Override
    public String toString() {
        return this.O().toString();
    }

    @Override
    public byte[] u() {
        return this.J();
    }

    @Override
    public byte w(int n8) {
        b.b(this.M()[this.N().length - 1], n8, 1L);
        int n9 = c.b(this, n8);
        int n10 = n9 == 0 ? 0 : this.M()[n9 - 1];
        int n11 = this.M()[this.N().length + n9];
        return this.N()[n9][n8 - n10 + n11];
    }
}

