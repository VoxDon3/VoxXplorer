/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Nd.j;
import ax.Wc.A;
import ax.Wc.m;
import ax.Wc.y;
import java.io.IOException;

public class o0
extends m {
    public o0(String string) {
        super(string);
    }

    public o0(byte[] byArray) {
        super(byArray);
    }

    private byte[] Q() {
        byte[] byArray;
        byte[] byArray2 = byArray = this.q;
        if (byArray[byArray.length - 1] == 90) {
            if (!this.M()) {
                byArray2 = this.q;
                byArray = new byte[byArray2.length + 4];
                System.arraycopy(byArray2, 0, byArray, 0, byArray2.length - 1);
                System.arraycopy(j.e("0000Z"), 0, byArray, this.q.length - 1, 5);
                return byArray;
            }
            if (!this.N()) {
                byArray = this.q;
                byArray2 = new byte[byArray.length + 2];
                System.arraycopy(byArray, 0, byArray2, 0, byArray.length - 1);
                System.arraycopy(j.e("00Z"), 0, byArray2, this.q.length - 1, 3);
                return byArray2;
            }
            if (this.K()) {
                int n8;
                for (n8 = this.q.length - 2; n8 > 0 && this.q[n8] == 48; --n8) {
                }
                byArray2 = this.q;
                if (byArray2[n8] == 46) {
                    byArray = new byte[n8 + 1];
                    System.arraycopy(byArray2, 0, byArray, 0, n8);
                    byArray[n8] = 90;
                    return byArray;
                }
                byArray = new byte[n8 + 2];
                System.arraycopy(byArray2, 0, byArray, 0, ++n8);
                byArray[n8] = 90;
                return byArray;
            }
            byArray2 = this.q;
        }
        return byArray2;
    }

    @Override
    A A() {
        return this;
    }

    @Override
    A B() {
        return this;
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 24, this.Q());
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, this.Q().length);
    }
}

