/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.A;
import ax.Wc.c;
import ax.Wc.y;
import java.io.IOException;

public class H0
extends c {
    H0(byte[] byArray, boolean bl) {
        super(byArray, bl);
    }

    static void K(y y8, boolean bl, byte by, byte[] byArray, int n8, int n9) throws IOException {
        y8.n(bl, 3, by, byArray, n8, n9);
    }

    static void M(y y8, boolean bl, byte[] byArray, int n8, int n9) throws IOException {
        y8.p(bl, 3, byArray, n8, n9);
    }

    static int N(boolean bl, int n8) {
        return y.g(bl, n8);
    }

    @Override
    A B() {
        return this;
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.o(bl, 3, this.q);
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

