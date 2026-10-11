package ax.P0;

import ax.P0.N;
import ax.r7.AbstractC2991z;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.List;

/* renamed from: ax.P0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0899h implements H {
    protected final N.c a = new N.c();

    protected AbstractC0899h() {
    }

    private void B0(long j, int i) {
        A0(b0(), j, i, false);
    }

    private void C0(int i, int i2) {
        A0(i, -9223372036854775807L, i2, false);
    }

    private void D0(int i) {
        int v0 = v0();
        if (v0 == -1) {
            y0(i);
        } else if (v0 == b0()) {
            z0(i);
        } else {
            C0(v0, i);
        }
    }

    private void E0(long j, int i) {
        long s0 = s0() + j;
        long g0 = g0();
        if (g0 != -9223372036854775807L) {
            s0 = Math.min(s0, g0);
        }
        B0(Math.max(s0, 0L), i);
    }

    private void F0(int i) {
        int w0 = w0();
        if (w0 == -1) {
            y0(i);
        } else if (w0 == b0()) {
            z0(i);
        } else {
            C0(w0, i);
        }
    }

    private int x0() {
        int o = o();
        if (o == 1) {
            return 0;
        }
        return o;
    }

    private void y0(int i) {
        A0(-1, -9223372036854775807L, i, false);
    }

    private void z0(int i) {
        A0(b0(), -9223372036854775807L, i, true);
    }

    protected abstract void A0(int i, long j, int i2, boolean z);

    @Override // ax.P0.H
    public final void B(C0915y c0915y, boolean z) {
        I(AbstractC2991z.A(c0915y), z);
    }

    @Override // ax.P0.H
    public final long C() {
        N h0 = h0();
        if (h0.q()) {
            return -9223372036854775807L;
        }
        return h0.n(b0(), this.a).d();
    }

    public final void G0(List<C0915y> list) {
        I(list, true);
    }

    @Override // ax.P0.H
    public final void H() {
        C0(b0(), 4);
    }

    @Override // ax.P0.H
    public final boolean J() {
        return w0() != -1;
    }

    @Override // ax.P0.H
    @Deprecated
    public final int P() {
        return b0();
    }

    @Override // ax.P0.H
    public final void Q() {
        if (h0().q() || p()) {
            y0(7);
            return;
        }
        boolean J = J();
        if (u0() && !W()) {
            if (J) {
                F0(7);
                return;
            } else {
                y0(7);
                return;
            }
        }
        if (!J || s0() > A()) {
            B0(0L, 7);
        } else {
            F0(7);
        }
    }

    @Override // ax.P0.H
    public final void U(C0915y c0915y) {
        G0(AbstractC2991z.A(c0915y));
    }

    @Override // ax.P0.H
    public final boolean W() {
        N h0 = h0();
        return !h0.q() && h0.n(b0(), this.a).h;
    }

    @Override // ax.P0.H
    public final boolean Y() {
        return v0() != -1;
    }

    @Override // ax.P0.H
    public final boolean c0(int i) {
        return u().b(i);
    }

    @Override // ax.P0.H
    public final boolean e0() {
        N h0 = h0();
        return !h0.q() && h0.n(b0(), this.a).i;
    }

    @Override // ax.P0.H
    public final void f() {
        S(false);
    }

    @Override // ax.P0.H
    public final void g(float f) {
        e(h().b(f));
    }

    @Override // ax.P0.H
    public final void m() {
        S(true);
    }

    @Override // ax.P0.H
    public final void m0() {
        if (h0().q() || p()) {
            y0(9);
            return;
        }
        if (Y()) {
            D0(9);
        } else if (u0() && e0()) {
            C0(b0(), 9);
        } else {
            y0(9);
        }
    }

    @Override // ax.P0.H
    public final boolean n() {
        return i() == 3 && v() && f0() == 0;
    }

    @Override // ax.P0.H
    public final void n0() {
        E0(T(), 12);
    }

    @Override // ax.P0.H
    public final void p0() {
        E0(-t0(), 11);
    }

    @Override // ax.P0.H
    public final void s(int i, long j) {
        A0(i, j, 10, false);
    }

    @Override // ax.P0.H
    public final void t(long j) {
        B0(j, 5);
    }

    @Override // ax.P0.H
    public final boolean u0() {
        N h0 = h0();
        return !h0.q() && h0.n(b0(), this.a).f();
    }

    public final int v0() {
        N h0 = h0();
        if (h0.q()) {
            return -1;
        }
        return h0.e(b0(), x0(), j0());
    }

    public final int w0() {
        N h0 = h0();
        if (h0.q()) {
            return -1;
        }
        return h0.l(b0(), x0(), j0());
    }

    @Override // ax.P0.H
    public final void x() {
        O(0, SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    @Override // ax.P0.H
    public final C0915y y() {
        N h0 = h0();
        if (h0.q()) {
            return null;
        }
        return h0.n(b0(), this.a).c;
    }
}
