/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.a;
import ax.Wc.A;
import ax.Wc.D0;
import ax.Wc.G;
import ax.Wc.O;
import ax.Wc.t0;
import ax.Wc.y;
import java.io.IOException;

public abstract class N
extends A
implements G {
    static final O c0 = new O(N.class, 28){

        @Override
        A d(t0 t02) {
            return N.C(t02.G());
        }
    };
    private static final char[] d0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] q;

    N(byte[] byArray, boolean bl) {
        byte[] byArray2 = byArray;
        if (bl) {
            byArray2 = a.d(byArray);
        }
        this.q = byArray2;
    }

    static N C(byte[] byArray) {
        return new D0(byArray, false);
    }

    private static void D(StringBuffer stringBuffer, int n8) {
        char[] cArray = d0;
        stringBuffer.append(cArray[n8 >>> 4 & 0xF]);
        stringBuffer.append(cArray[n8 & 0xF]);
    }

    private static void E(StringBuffer stringBuffer, int n8) {
        if (n8 < 128) {
            N.D(stringBuffer, n8);
            return;
        }
        byte[] byArray = new byte[5];
        int n9 = 5;
        int n10 = n8;
        n8 = n9;
        while (true) {
            n9 = n8 - 1;
            byArray[n9] = (byte)n10;
            if ((n10 >>>= 8) == 0) {
                byArray[n8 -= 2] = (byte)(5 - n9 | 0x80);
                while (true) {
                    n10 = n8 + 1;
                    N.D(stringBuffer, byArray[n8]);
                    if (n10 >= 5) {
                        return;
                    }
                    n8 = n10;
                }
            }
            n8 = n9;
        }
    }

    @Override
    public final String h() {
        int n8 = this.q.length;
        StringBuffer stringBuffer = new StringBuffer((y.f(n8) + n8) * 2 + 3);
        stringBuffer.append("#1C");
        N.E(stringBuffer, n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            N.D(stringBuffer, this.q[i8]);
        }
        return stringBuffer.toString();
    }

    @Override
    public final int hashCode() {
        return a.l(this.q);
    }

    @Override
    final boolean r(A a8) {
        if (!(a8 instanceof N)) {
            return false;
        }
        a8 = (N)a8;
        return a.b(this.q, ((N)a8).q);
    }

    @Override
    final void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 28, this.q);
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
        return y.g(bl, this.q.length);
    }
}

