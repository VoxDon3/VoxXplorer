/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.H0;
import ax.Wc.c;
import ax.Wc.y;
import java.io.IOException;

public class V
extends c {
    private final int e0;
    private final c[] f0;

    public V(byte[] byArray, int n8) {
        this(byArray, n8, 1000);
    }

    public V(byte[] byArray, int n8, int n9) {
        super(byArray, n8);
        this.f0 = null;
        this.e0 = n9;
    }

    public V(c[] cArray) {
        this(cArray, 1000);
    }

    public V(c[] cArray, int n8) {
        super(V.K(cArray), false);
        this.f0 = cArray;
        this.e0 = n8;
    }

    static byte[] K(c[] cArray) {
        int n8 = 0;
        int n9 = cArray.length;
        if (n9 != 0) {
            if (n9 != 1) {
                byte[] byArray;
                int n10;
                int n11 = n9 - 1;
                int n12 = 0;
                for (n10 = 0; n10 < n11; ++n10) {
                    byArray = cArray[n10].q;
                    if (byArray[0] == 0) {
                        n12 += byArray.length - 1;
                        continue;
                    }
                    throw new IllegalArgumentException("only the last nested bitstring can have padding");
                }
                byArray = cArray[n11].q;
                byte by = byArray[0];
                byte[] byArray2 = new byte[n12 + byArray.length];
                byArray2[0] = by;
                n10 = 1;
                for (n12 = n8; n12 < n9; ++n12) {
                    byArray = cArray[n12].q;
                    n8 = byArray.length - 1;
                    System.arraycopy(byArray, 1, byArray2, n10, n8);
                    n10 += n8;
                }
                return byArray2;
            }
            return cArray[0].q;
        }
        return new byte[]{0};
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        if (!this.t()) {
            byte[] byArray = this.q;
            H0.M(y8, bl, byArray, 0, byArray.length);
            return;
        }
        y8.s(bl, 35);
        y8.i(128);
        Object[] objectArray = this.f0;
        if (objectArray != null) {
            y8.v((A[])objectArray);
        } else {
            objectArray = this.q;
            if (objectArray.length >= 2) {
                int n8;
                A a8 = objectArray[0];
                int n9 = objectArray.length;
                int n10 = this.e0 - 1;
                for (n8 = n9 - 1; n8 > n10; n8 -= n10) {
                    H0.K(y8, true, (byte)0, this.q, n9 - n8, n10);
                }
                H0.K(y8, true, (byte)a8, this.q, n9 - n8, n8);
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
            return H0.N(bl, this.q.length);
        }
        int n8 = bl ? 4 : 3;
        if (this.f0 != null) {
            c[] cArray;
            int n9 = 0;
            int n10 = n8;
            for (n8 = n9; n8 < (cArray = this.f0).length; ++n8) {
                n10 += cArray[n8].w(true);
            }
            return n10;
        }
        byte[] byArray = this.q;
        if (byArray.length < 2) {
            return n8;
        }
        int n11 = byArray.length;
        int n12 = this.e0;
        n11 = (n11 - 2) / (n12 - 1);
        return n8 + H0.N(true, n12) * n11 + H0.N(true, this.q.length - n11 * (this.e0 - 1));
    }
}

