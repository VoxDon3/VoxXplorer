/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.t0;
import ax.Wc.w;
import ax.Wc.y;
import java.io.IOException;

public class Y
extends w {
    private final int e0;
    private final w[] f0;

    public Y(byte[] byArray) {
        this(byArray, 1000);
    }

    public Y(byte[] byArray, int n8) {
        this(byArray, null, n8);
    }

    private Y(byte[] byArray, w[] wArray, int n8) {
        super(byArray);
        this.f0 = wArray;
        this.e0 = n8;
    }

    public Y(w[] wArray) {
        this(wArray, 1000);
    }

    public Y(w[] wArray, int n8) {
        this(Y.I(wArray), wArray, n8);
    }

    static byte[] I(w[] wArray) {
        int n8 = wArray.length;
        if (n8 != 0) {
            if (n8 != 1) {
                int n9;
                int n10 = 0;
                for (n9 = 0; n9 < n8; ++n9) {
                    n10 += wArray[n9].q.length;
                }
                byte[] byArray = new byte[n10];
                n9 = 0;
                for (n10 = 0; n10 < n8; ++n10) {
                    byte[] byArray2 = wArray[n10].q;
                    System.arraycopy(byArray2, 0, byArray, n9, byArray2.length);
                    n9 += byArray2.length;
                }
                return byArray;
            }
            return wArray[0].q;
        }
        return w.d0;
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        if (!this.t()) {
            byte[] byArray = this.q;
            t0.I(y8, bl, byArray, 0, byArray.length);
            return;
        }
        y8.s(bl, 36);
        y8.i(128);
        Object[] objectArray = this.f0;
        if (objectArray != null) {
            y8.v((A[])objectArray);
        } else {
            int n8;
            for (int i8 = 0; i8 < (objectArray = (Object[])this.q).length; i8 += n8) {
                n8 = Math.min(objectArray.length - i8, this.e0);
                t0.I(y8, true, this.q, i8, n8);
            }
        }
        y8.i(0);
        y8.i(0);
    }

    @Override
    boolean t() {
        return this.f0 != null || this.q.length > this.e0;
        {
        }
    }

    @Override
    int w(boolean bl) throws IOException {
        if (!this.t()) {
            return t0.J(bl, this.q.length);
        }
        int n8 = bl ? 4 : 3;
        if (this.f0 != null) {
            w[] wArray;
            int n9 = 0;
            int n10 = n8;
            for (n8 = n9; n8 < (wArray = this.f0).length; ++n8) {
                n10 += wArray[n8].w(true);
            }
            return n10;
        }
        int n11 = this.q.length;
        int n12 = this.e0;
        n11 /= n12;
        n12 = n8 + t0.J(true, n12) * n11;
        n11 = this.q.length - n11 * this.e0;
        n8 = n12;
        if (n11 > 0) {
            n8 = n12 + t0.J(true, n11);
        }
        return n8;
    }
}

