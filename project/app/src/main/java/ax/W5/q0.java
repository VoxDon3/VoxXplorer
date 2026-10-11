/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.O0;
import ax.W5.b2;
import ax.W5.m0;
import ax.W5.p0;
import ax.W5.t0;
import java.nio.charset.Charset;

class q0
extends p0 {
    protected final byte[] f0;

    q0(byte[] byArray) {
        byArray.getClass();
        this.f0 = byArray;
    }

    @Override
    public byte e(int n8) {
        return this.f0[n8];
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof t0)) {
            return false;
        }
        if (this.h() != ((t0)object).h()) {
            return false;
        }
        if (this.h() == 0) {
            return true;
        }
        if (object instanceof q0) {
            q0 q02 = (q0)object;
            int n8 = this.q();
            int n9 = q02.q();
            if (n8 != 0 && n9 != 0 && n8 != n9) {
                return false;
            }
            int n10 = this.h();
            if (n10 <= ((t0)q02).h()) {
                if (n10 <= ((t0)q02).h()) {
                    object = this.f0;
                    byte[] byArray = q02.f0;
                    q02.t();
                    n9 = 0;
                    n8 = 0;
                    while (n9 < n10) {
                        if (object[n9] != byArray[n8]) {
                            return false;
                        }
                        ++n9;
                        ++n8;
                    }
                    return true;
                }
                n9 = ((t0)q02).h();
                object = new StringBuilder();
                ((StringBuilder)object).append("Ran off end of other: 0, ");
                ((StringBuilder)object).append(n10);
                ((StringBuilder)object).append(", ");
                ((StringBuilder)object).append(n9);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            n9 = this.h();
            object = new StringBuilder();
            ((StringBuilder)object).append("Length too large: ");
            ((StringBuilder)object).append(n10);
            ((StringBuilder)object).append(n9);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        return object.equals(this);
    }

    @Override
    byte g(int n8) {
        return this.f0[n8];
    }

    @Override
    public int h() {
        return this.f0.length;
    }

    @Override
    protected final int i(int n8, int n9, int n10) {
        return O0.b(n8, this.f0, 0, n10);
    }

    @Override
    public final t0 k(int n8, int n9) {
        n8 = t0.p(0, n9, this.h());
        if (n8 == 0) {
            return t0.c0;
        }
        return new m0(this.f0, 0, n8);
    }

    @Override
    protected final String l(Charset charset) {
        return new String(this.f0, 0, this.h(), charset);
    }

    @Override
    public final boolean n() {
        return b2.c(this.f0, 0, this.h());
    }

    protected int t() {
        return 0;
    }
}

