/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B3;
import ax.b6.F3;
import ax.b6.I3;
import ax.b6.m4;
import ax.b6.x3;
import java.io.IOException;

class K3
extends I3 {
    protected final byte[] e0;

    K3(byte[] byArray) {
        super(null);
        byArray.getClass();
        this.e0 = byArray;
    }

    @Override
    public byte e(int n8) {
        return this.e0[n8];
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof B3)) {
            return false;
        }
        if (((B3)this).s() != ((B3)object).s()) {
            return false;
        }
        if (((B3)this).s() == 0) {
            return true;
        }
        if (object instanceof K3) {
            object = (K3)object;
            int n8 = this.g();
            int n9 = ((B3)object).g();
            if (n8 != 0 && n9 != 0 && n8 != n9) {
                return false;
            }
            return ((I3)this).w((B3)object, 0, ((B3)this).s());
        }
        return object.equals(this);
    }

    @Override
    public final B3 k(int n8, int n9) {
        n8 = B3.i(0, n9, ((B3)this).s());
        if (n8 == 0) {
            return B3.c0;
        }
        return new F3(this.e0, this.x(), n8);
    }

    @Override
    final void q(x3 x32) throws IOException {
        x32.a(this.e0, this.x(), ((B3)this).s());
    }

    @Override
    byte r(int n8) {
        return this.e0[n8];
    }

    @Override
    public int s() {
        return this.e0.length;
    }

    @Override
    protected final int t(int n8, int n9, int n10) {
        return m4.a(n8, this.e0, this.x(), n10);
    }

    @Override
    final boolean w(B3 object, int n8, int n9) {
        if (n9 <= ((B3)object).s()) {
            if (n9 <= ((B3)object).s()) {
                if (object instanceof K3) {
                    K3 k32 = (K3)object;
                    byte[] byArray = this.e0;
                    object = k32.e0;
                    int n10 = this.x();
                    int n11 = this.x();
                    n8 = k32.x();
                    while (n11 < n10 + n9) {
                        if (byArray[n11] != object[n8]) {
                            return false;
                        }
                        ++n11;
                        ++n8;
                    }
                    return true;
                }
                return ((B3)object).k(0, n9).equals(((B3)this).k(0, n9));
            }
            n8 = ((B3)object).s();
            object = new StringBuilder("Ran off end of other: ");
            ((StringBuilder)object).append(0);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(n9);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(n8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        n8 = ((B3)this).s();
        object = new StringBuilder("Length too large: ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(n8);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    protected int x() {
        return 0;
    }
}

