/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.P0.N;

public abstract class w
extends N {
    protected final N e;

    public w(N n8) {
        this.e = n8;
    }

    @Override
    public int a(boolean bl) {
        return this.e.a(bl);
    }

    @Override
    public int b(Object object) {
        return this.e.b(object);
    }

    @Override
    public int c(boolean bl) {
        return this.e.c(bl);
    }

    @Override
    public int e(int n8, int n9, boolean bl) {
        return this.e.e(n8, n9, bl);
    }

    @Override
    public final boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public N.b g(int n8, N.b b8, boolean bl) {
        return this.e.g(n8, b8, bl);
    }

    @Override
    public final N.b h(Object object, N.b b8) {
        return super.h(object, b8);
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    @Override
    public int i() {
        return this.e.i();
    }

    @Override
    public int l(int n8, int n9, boolean bl) {
        return this.e.l(n8, n9, bl);
    }

    @Override
    public Object m(int n8) {
        return this.e.m(n8);
    }

    @Override
    public N.c o(int n8, N.c c8, long l8) {
        return this.e.o(n8, c8, l8);
    }

    @Override
    public int p() {
        return this.e.p();
    }
}

