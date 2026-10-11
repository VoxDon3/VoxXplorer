/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.nb.b;
import ax.nb.f;

class c
extends f {
    c(b b8) {
        this.q = b8;
        this.s = 32;
    }

    @Override
    int a(byte[] byArray, int n8) {
        return this.f(byArray, n8);
    }

    @Override
    int g(byte[] byArray, int n8) {
        return 0;
    }

    @Override
    int j(byte[] byArray, int n8) {
        return this.m(byArray, n8);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NameQueryRequest[");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }
}

