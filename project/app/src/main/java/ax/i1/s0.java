/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.P0.N;
import ax.P0.y;
import ax.U0.z;
import ax.i1.F;
import ax.i1.h;

public abstract class s0
extends h<Void> {
    private static final Void l;
    protected final F k;

    protected s0(F f8) {
        this.k = f8;
    }

    @Override
    protected final void A(z z8) {
        super.A(z8);
        this.S();
    }

    protected F.b J(F.b b8) {
        return b8;
    }

    protected final F.b K(Void void_, F.b b8) {
        return this.J(b8);
    }

    protected long L(long l8, F.b b8) {
        return l8;
    }

    protected final long M(Void void_, long l8, F.b b8) {
        return this.L(l8, b8);
    }

    protected int N(int n8) {
        return n8;
    }

    protected final int O(Void void_, int n8) {
        return this.N(n8);
    }

    protected abstract void P(N var1);

    protected final void Q(Void void_, F f8, N n8) {
        this.P(n8);
    }

    protected final void R() {
        this.I(l, this.k);
    }

    protected void S() {
        this.R();
    }

    @Override
    public void a(y y8) {
        this.k.a(y8);
    }

    @Override
    public y j() {
        return this.k.j();
    }

    @Override
    public boolean m() {
        return this.k.m();
    }

    @Override
    public N o() {
        return this.k.o();
    }
}

