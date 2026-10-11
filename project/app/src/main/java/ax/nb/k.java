/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.nb.b;
import ax.nb.l;

public class k
extends l {
    private b c;
    private b d;

    public k(b b8, b b9) {
        this.a = 129;
        this.c = b8;
        this.d = b9;
    }

    @Override
    int c(byte[] byArray, int n8) {
        int n9 = this.c.d(byArray, n8) + n8;
        return n9 + this.d.d(byArray, n9) - n8;
    }
}

