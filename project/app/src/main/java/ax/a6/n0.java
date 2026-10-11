/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.g0;
import ax.a6.o0;

final class n0
extends o0 {
    final transient int e0;
    final transient int f0;
    final o0 g0;

    n0(o0 o02, int n8, int n9) {
        this.g0 = o02;
        this.e0 = n8;
        this.f0 = n9;
    }

    @Override
    final int g() {
        return this.g0.h() + this.e0 + this.f0;
    }

    public final Object get(int n8) {
        ax.a6.g0.a(n8, this.f0, "index");
        return this.g0.get(n8 + this.e0);
    }

    @Override
    final int h() {
        return this.g0.h() + this.e0;
    }

    @Override
    final Object[] i() {
        return this.g0.i();
    }

    @Override
    public final o0 k(int n8, int n9) {
        ax.a6.g0.c(n8, n9, this.f0);
        int n10 = this.e0;
        return this.g0.k(n8 + n10, n9 + n10);
    }

    @Override
    public final int size() {
        return this.f0;
    }
}

