/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Wc.A;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.j0;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public abstract class b
extends A
implements G {
    static final O c0 = new O(b.class, 30){

        @Override
        A d(t0 t02) {
            return b.C(t02.G());
        }
    };
    final char[] q;

    b(byte[] byArray) {
        if (byArray != null) {
            int n8 = byArray.length;
            if ((n8 & 1) == 0) {
                int n9 = n8 / 2;
                char[] cArray = new char[n9];
                for (n8 = 0; n8 != n9; ++n8) {
                    int n10 = n8 * 2;
                    byte by = byArray[n10];
                    cArray[n8] = (char)(byArray[n10 + 1] & 0xFF | by << 8);
                }
                this.q = cArray;
                return;
            }
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        throw new NullPointerException("'string' cannot be null");
    }

    b(char[] cArray) {
        if (cArray != null) {
            this.q = cArray;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    static b C(byte[] byArray) {
        return new j0(byArray);
    }

    static b D(char[] cArray) {
        return new j0(cArray);
    }

    @Override
    public final String h() {
        return new String(this.q);
    }

    @Override
    public final int hashCode() {
        return a.n(this.q);
    }

    @Override
    final boolean r(A a8) {
        if (!(a8 instanceof b)) {
            return false;
        }
        a8 = (b)a8;
        return a.c(this.q, ((b)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        char c8;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12 = this.q.length;
        y8.s(bl, 30);
        y8.k(n12 * 2);
        byte[] byArray = new byte[8];
        for (n11 = 0; n11 < (n12 & 0xFFFFFFFC); n11 += 4) {
            char[] cArray = this.q;
            n10 = cArray[n11];
            n9 = cArray[n11 + 1];
            n8 = cArray[n11 + 2];
            c8 = cArray[n11 + 3];
            byArray[0] = (byte)(n10 >> 8);
            byArray[1] = (byte)n10;
            byArray[2] = (byte)(n9 >> 8);
            byArray[3] = (byte)n9;
            byArray[4] = (byte)(n8 >> 8);
            byArray[5] = (byte)n8;
            byArray[6] = (byte)(c8 >> 8);
            byArray[7] = (byte)c8;
            y8.j(byArray, 0, 8);
        }
        if (n11 < n12) {
            n10 = 0;
            do {
                c8 = this.q[n11];
                n9 = n11 + 1;
                byArray[n10] = (byte)(c8 >> 8);
                n8 = n10 + 2;
                byArray[n10 + '\u0001'] = (byte)c8;
                n11 = n9;
                n10 = n8;
            } while (n9 < n12);
            y8.j(byArray, 0, n8);
        }
    }

    @Override
    final boolean t() {
        return false;
    }

    public String toString() {
        return this.h();
    }

    @Override
    final int w(boolean bl) {
        return y.g(bl, this.q.length * 2);
    }
}

