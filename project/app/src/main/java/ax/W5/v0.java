/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.P0;
import ax.W5.u0;
import ax.W5.x0;

final class v0
extends x0 {
    private final byte[] b;
    private int c;
    private int d;
    private int e = Integer.MAX_VALUE;

    /* synthetic */ v0(byte[] byArray, int n8, int n9, boolean bl, u0 u02) {
        super(null);
        this.b = byArray;
        this.c = 0;
    }

    public final int c(int n8) throws P0 {
        int n9;
        n8 = this.e;
        this.e = 0;
        this.c = n9 = this.c + this.d;
        if (n9 > 0) {
            this.d = n9;
            this.c = 0;
            return n8;
        }
        this.d = 0;
        return n8;
    }
}

