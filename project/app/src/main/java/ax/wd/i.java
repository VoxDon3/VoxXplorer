/*
 * Decompiled with CFR 0.152.
 */
package ax.wd;

import ax.vd.u;
import ax.wd.c;

public class i
extends c
implements u {
    public i(int n8) {
        super(i.s(n8));
    }

    private static int s(int n8) {
        if (n8 != 128 && n8 != 256) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("'bitLength' ");
            stringBuilder.append(n8);
            stringBuilder.append(" not supported for SHAKE");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return n8;
    }

    @Override
    public int c(byte[] byArray, int n8) {
        return this.e(byArray, n8, this.i());
    }

    @Override
    public int e(byte[] byArray, int n8, int n9) {
        n8 = this.t(byArray, n8, n9);
        this.a();
        return n8;
    }

    @Override
    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SHAKE");
        stringBuilder.append(this.e);
        return stringBuilder.toString();
    }

    @Override
    public int i() {
        return this.e / 4;
    }

    public int t(byte[] byArray, int n8, int n9) {
        if (!this.f) {
            this.n(15, 4);
        }
        this.r(byArray, n8, (long)n9 * 8L);
        return n9;
    }
}

