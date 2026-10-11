/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import ax.P0.H;
import ax.P0.N;
import ax.P0.y;
import ax.r7.z;
import java.util.List;

public abstract class h
implements H {
    protected final N.c a = new N.c();

    protected h() {
    }

    private void B0(long l8, int n8) {
        this.A0(this.b0(), l8, n8, false);
    }

    private void C0(int n8, int n9) {
        this.A0(n8, -9223372036854775807L, n9, false);
    }

    private void D0(int n8) {
        int n9 = this.v0();
        if (n9 == -1) {
            this.y0(n8);
            return;
        }
        if (n9 == this.b0()) {
            this.z0(n8);
            return;
        }
        this.C0(n9, n8);
    }

    private void E0(long l8, int n8) {
        long l9 = this.s0() + l8;
        long l10 = this.g0();
        l8 = l9;
        if (l10 != -9223372036854775807L) {
            l8 = Math.min(l9, l10);
        }
        this.B0(Math.max(l8, 0L), n8);
    }

    private void F0(int n8) {
        int n9 = this.w0();
        if (n9 == -1) {
            this.y0(n8);
            return;
        }
        if (n9 == this.b0()) {
            this.z0(n8);
            return;
        }
        this.C0(n9, n8);
    }

    private int x0() {
        int n8;
        int n9 = n8 = this.o();
        if (n8 == 1) {
            n9 = 0;
        }
        return n9;
    }

    private void y0(int n8) {
        this.A0(-1, -9223372036854775807L, n8, false);
    }

    private void z0(int n8) {
        this.A0(this.b0(), -9223372036854775807L, n8, true);
    }

    protected abstract void A0(int var1, long var2, int var4, boolean var5);

    @Override
    public final void B(y y8, boolean bl) {
        this.I(z.A(y8), bl);
    }

    @Override
    public final long C() {
        N n8 = this.h0();
        if (n8.q()) {
            return -9223372036854775807L;
        }
        return n8.n(this.b0(), this.a).d();
    }

    public final void G0(List<y> list) {
        this.I(list, true);
    }

    @Override
    public final void H() {
        this.C0(this.b0(), 4);
    }

    @Override
    public final boolean J() {
        return this.w0() != -1;
    }

    @Override
    @Deprecated
    public final int P() {
        return this.b0();
    }

    @Override
    public final void Q() {
        if (!this.h0().q() && !this.p()) {
            boolean bl = this.J();
            if (this.u0() && !this.W()) {
                if (bl) {
                    this.F0(7);
                    return;
                }
                this.y0(7);
                return;
            }
            if (bl && this.s0() <= this.A()) {
                this.F0(7);
                return;
            }
            this.B0(0L, 7);
            return;
        }
        this.y0(7);
    }

    @Override
    public final void U(y y8) {
        this.G0(z.A(y8));
    }

    @Override
    public final boolean W() {
        N n8 = this.h0();
        return !n8.q() && n8.n((int)this.b0(), (N.c)this.a).h;
    }

    @Override
    public final boolean Y() {
        return this.v0() != -1;
    }

    @Override
    public final boolean c0(int n8) {
        return this.u().b(n8);
    }

    @Override
    public final boolean e0() {
        N n8 = this.h0();
        return !n8.q() && n8.n((int)this.b0(), (N.c)this.a).i;
    }

    @Override
    public final void f() {
        this.S(false);
    }

    @Override
    public final void g(float f8) {
        this.e(this.h().b(f8));
    }

    @Override
    public final void m() {
        this.S(true);
    }

    @Override
    public final void m0() {
        if (!this.h0().q() && !this.p()) {
            if (this.Y()) {
                this.D0(9);
                return;
            }
            if (this.u0() && this.e0()) {
                this.C0(this.b0(), 9);
                return;
            }
            this.y0(9);
            return;
        }
        this.y0(9);
    }

    @Override
    public final boolean n() {
        return this.i() == 3 && this.v() && this.f0() == 0;
    }

    @Override
    public final void n0() {
        this.E0(this.T(), 12);
    }

    @Override
    public final void p0() {
        this.E0(-this.t0(), 11);
    }

    @Override
    public final void s(int n8, long l8) {
        this.A0(n8, l8, 10, false);
    }

    @Override
    public final void t(long l8) {
        this.B0(l8, 5);
    }

    @Override
    public final boolean u0() {
        N n8 = this.h0();
        return !n8.q() && n8.n(this.b0(), this.a).f();
    }

    public final int v0() {
        N n8 = this.h0();
        if (n8.q()) {
            return -1;
        }
        return n8.e(this.b0(), this.x0(), this.j0());
    }

    public final int w0() {
        N n8 = this.h0();
        if (n8.q()) {
            return -1;
        }
        return n8.l(this.b0(), this.x0(), this.j0());
    }

    @Override
    public final void x() {
        this.O(0, Integer.MAX_VALUE);
    }

    @Override
    public final y y() {
        N n8 = this.h0();
        if (n8.q()) {
            return null;
        }
        return n8.n((int)this.b0(), (N.c)this.a).c;
    }
}

