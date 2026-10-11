/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.g;
import ax.Wc.w;
import ax.Wc.y;
import java.io.IOException;

public class t0
extends w {
    public t0(g g8) throws IOException {
        super(g8.g().q("DER"));
    }

    public t0(byte[] byArray) {
        super(byArray);
    }

    static void I(y y8, boolean bl, byte[] byArray, int n8, int n9) throws IOException {
        y8.p(bl, 4, byArray, n8, n9);
    }

    static int J(boolean bl, int n8) {
        return y.g(bl, n8);
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
        y8.o(bl, 4, this.q);
    }

    @Override
    boolean t() {
        return false;
    }

    @Override
    int w(boolean bl) {
        return y.g(bl, this.q.length);
    }
}

