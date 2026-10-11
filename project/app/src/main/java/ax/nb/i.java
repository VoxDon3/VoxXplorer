/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.nb.b;
import ax.nb.f;

class i
extends f {
    i(b b8) {
        this.q = b8;
        this.s = 33;
        this.n = false;
        this.p = false;
    }

    @Override
    int a(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int j(byte[] byArray, int n8) {
        b b8 = this.q;
        int n9 = b8.c;
        b8.c = 0;
        n8 = this.m(byArray, n8);
        this.q.c = n9;
        return n8;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NodeStatusRequest[");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

