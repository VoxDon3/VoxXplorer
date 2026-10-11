/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.W;

public final class j
implements Cloneable {
    private boolean c0;
    private boolean d0;
    private boolean e0;
    private int f0;
    private int g0;
    private boolean q;

    public static j f(byte[] object, int n8) {
        int n9 = W.h((byte[])object, n8);
        object = new j();
        boolean bl = false;
        boolean bl2 = (n9 & 8) != 0;
        ((j)object).h(bl2);
        bl2 = (n9 & 0x800) != 0;
        ((j)object).k(bl2);
        bl2 = (n9 & 0x40) != 0;
        ((j)object).j(bl2);
        bl2 = bl;
        if ((n9 & 1) != 0) {
            bl2 = true;
        }
        ((j)object).i(bl2);
        n8 = (n9 & 2) != 0 ? 8192 : 4096;
        ((j)object).f0 = n8;
        n8 = (n9 & 4) != 0 ? 3 : 2;
        ((j)object).g0 = n8;
        return object;
    }

    public void b(byte[] byArray, int n8) {
        boolean n9 = this.c0;
        int n10 = 0;
        int n11 = n9 ? 8 : 0;
        int n12 = this.q ? 2048 : 0;
        int n13 = this.d0;
        if (this.e0) {
            n10 = 64;
        }
        W.i(n11 | n12 | n13 | n10, byArray, n8);
    }

    int c() {
        return this.g0;
    }

    public Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", cloneNotSupportedException);
        }
    }

    int d() {
        return this.f0;
    }

    public boolean equals(Object object) {
        if (!(object instanceof j)) {
            return false;
        }
        object = (j)object;
        return ((j)object).d0 == this.d0 && ((j)object).e0 == this.e0 && ((j)object).q == this.q && ((j)object).c0 == this.c0;
    }

    public void h(boolean bl) {
        this.c0 = bl;
    }

    public int hashCode() {
        return (((this.d0 * 17 + this.e0) * 13 + this.q) * 7 + this.c0) * 3;
    }

    public void i(boolean bl) {
        this.d0 = bl;
    }

    public void j(boolean bl) {
        this.e0 = bl;
        if (bl) {
            this.i(true);
        }
    }

    public void k(boolean bl) {
        this.q = bl;
    }

    public boolean l() {
        return this.d0;
    }

    public boolean m() {
        return this.q;
    }
}

