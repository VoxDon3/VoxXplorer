/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.D;
import ax.Wc.E;
import ax.Wc.V;
import ax.Wc.Y;
import ax.Wc.c;
import ax.Wc.c0;
import ax.Wc.g;
import ax.Wc.h;
import ax.Wc.k;
import ax.Wc.w;
import ax.Wc.y;
import java.io.IOException;

public class a0
extends D {
    public a0() {
    }

    public a0(g g8) {
        super(g8);
    }

    public a0(h h8) {
        super(h8);
    }

    @Override
    c K() {
        return new V(this.C());
    }

    @Override
    k M() {
        return ((D)this.B()).M();
    }

    @Override
    w N() {
        return new Y(this.D());
    }

    @Override
    E O() {
        return new c0(false, this.P());
    }

    @Override
    void s(y y8, boolean bl) throws IOException {
        y8.r(bl, 48, this.q);
    }

    @Override
    int w(boolean bl) throws IOException {
        int n8 = bl ? 4 : 3;
        int n9 = this.q.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            n8 += this.q[i8].g().w(true);
        }
        return n8;
    }
}

