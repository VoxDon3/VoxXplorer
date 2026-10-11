/*
 * Decompiled with CFR 0.152.
 */
package ax.I9;

import ax.I9.f;

public class g
extends f {
    @Override
    public void D() {
        double d8;
        double d9 = this.A;
        double d10 = 1.0 / (d9 + 1.0);
        double d11 = this.x;
        double d12 = 1.0 - d11;
        this.l = d8 = 0.5 * d12 * d10;
        this.m = d12 * d10;
        this.n = d8;
        this.o = d11 * -2.0 * d10;
        this.p = (1.0 - d9) * d10;
    }
}

