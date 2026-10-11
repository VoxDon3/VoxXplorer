/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.s;
import ax.P0.N;
import ax.P0.v;
import ax.S0.a;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.S;
import ax.Y0.U;
import ax.Y0.V;
import ax.Y0.W;
import ax.Z0.I1;
import ax.i1.F;
import ax.i1.e0;
import java.io.IOException;

public abstract class h
implements M0,
N0 {
    private final int c0;
    private final O d0;
    private W e0;
    private int f0;
    private I1 g0;
    private ax.S0.h h0;
    private int i0;
    private e0 j0;
    private v[] k0;
    private long l0;
    private long m0;
    private long n0;
    private boolean o0;
    private boolean p0;
    private final Object q = new Object();
    private N q0;
    private F.b r0;
    private N0.a s0;

    public h(int n8) {
        this.c0 = n8;
        this.d0 = new O();
        this.n0 = Long.MIN_VALUE;
        this.q0 = N.a;
    }

    private void g0(long l8, boolean bl) throws s {
        this.o0 = false;
        this.m0 = l8;
        this.n0 = l8;
        this.X(l8, bl);
    }

    @Override
    public int A() throws s {
        return 0;
    }

    @Override
    public void B(int n8, Object object) throws s {
    }

    @Override
    public final void C() throws IOException {
        a.e(this.j0).b();
    }

    @Override
    public final long D() {
        return this.n0;
    }

    @Override
    public final void F(long l8) throws s {
        this.g0(l8, false);
    }

    @Override
    public final boolean G() {
        return this.o0;
    }

    @Override
    public S H() {
        return null;
    }

    protected final s I(Throwable throwable, v v8, int n8) {
        return this.J(throwable, v8, false, n8);
    }

    protected final s J(Throwable throwable, v v8, boolean bl, int n8) {
        int n9;
        block5: {
            if (v8 != null && !this.p0) {
                this.p0 = true;
                try {
                    n9 = V.i(this.b(v8));
                    break block5;
                }
                catch (s s8) {
                    this.p0 = false;
                }
                finally {
                    this.p0 = false;
                }
            }
            n9 = 4;
        }
        return s.d(throwable, this.getName(), this.N(), v8, n9, this.r0, bl, n8);
    }

    protected final ax.S0.h K() {
        return a.e(this.h0);
    }

    protected final W L() {
        return a.e(this.e0);
    }

    protected final O M() {
        this.d0.a();
        return this.d0;
    }

    protected final int N() {
        return this.f0;
    }

    protected final long O() {
        return this.m0;
    }

    protected final I1 P() {
        return a.e(this.g0);
    }

    protected final v[] Q() {
        return a.e(this.k0);
    }

    protected final long R() {
        return this.l0;
    }

    protected final N S() {
        return this.q0;
    }

    protected final boolean T() {
        if (this.n()) {
            return this.o0;
        }
        return a.e(this.j0).isReady();
    }

    protected abstract void U();

    protected void V(boolean bl, boolean bl2) throws s {
    }

    protected void W() {
    }

    protected abstract void X(long var1, boolean var3) throws s;

    protected void Y() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected final void Z() {
        Object object = this.q;
        // MONITORENTER : object
        N0.a a8 = this.s0;
        // MONITOREXIT : object
        if (a8 == null) return;
        a8.a(this);
    }

    @Override
    public final void a() {
        boolean bl = this.i0 == 0;
        a.g(bl);
        this.d0.a();
        this.a0();
    }

    protected void a0() {
    }

    protected void b0() throws s {
    }

    protected void c0() {
    }

    @Override
    public final void d() {
        boolean bl = this.i0 == 0;
        a.g(bl);
        this.Y();
    }

    protected void d0(v[] vArray, long l8, long l9, F.b b8) throws s {
    }

    protected void e0(N n8) {
    }

    @Override
    public final void f() {
        int n8 = this.i0;
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        a.g(bl);
        this.d0.a();
        this.i0 = 0;
        this.j0 = null;
        this.k0 = null;
        this.o0 = false;
        this.U();
        this.r0 = null;
    }

    protected final int f0(O o8, i object, int n8) {
        n8 = a.e(this.j0).a(o8, (i)object, n8);
        if (n8 == -4) {
            long l8;
            if (((ax.V0.a)object).s()) {
                this.n0 = Long.MIN_VALUE;
                if (this.o0) {
                    return -4;
                }
                return -3;
            }
            ((i)object).g0 = l8 = ((i)object).g0 + this.l0;
            this.n0 = Math.max(this.n0, l8);
            return n8;
        }
        if (n8 == -5) {
            object = a.e(o8.b);
            if (((v)object).t != Long.MAX_VALUE) {
                o8.b = ((v)object).b().C0(((v)object).t + this.l0).P();
            }
        }
        return n8;
    }

    @Override
    public final int getState() {
        return this.i0;
    }

    protected int h0(long l8) {
        return a.e(this.j0).c(l8 - this.l0);
    }

    @Override
    public final e0 j() {
        return this.j0;
    }

    @Override
    public final int k() {
        return this.c0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void l() {
        Object object = this.q;
        synchronized (object) {
            this.s0 = null;
            return;
        }
    }

    @Override
    public final void m(int n8, I1 i12, ax.S0.h h8) {
        this.f0 = n8;
        this.g0 = i12;
        this.h0 = h8;
        this.W();
    }

    @Override
    public final boolean n() {
        return this.n0 == Long.MIN_VALUE;
    }

    @Override
    public /* synthetic */ long o(long l8, long l9) {
        return U.b(this, l8, l9);
    }

    @Override
    public /* synthetic */ void p() {
        U.a(this);
    }

    @Override
    public final void q() {
        this.o0 = true;
    }

    @Override
    public final void r(N n8) {
        if (!j.Objects.equals((Object)this.q0, (Object)n8)) {
            this.q0 = n8;
            this.e0(n8);
        }
    }

    @Override
    public final void s(W w8, v[] vArray, e0 e02, long l8, boolean bl, boolean bl2, long l9, long l10, F.b b8) throws s {
        boolean bl3 = this.i0 == 0;
        a.g(bl3);
        this.e0 = w8;
        this.r0 = b8;
        this.i0 = 1;
        this.V(bl, bl2);
        this.t(vArray, e02, l9, l10, b8);
        this.g0(l9, bl);
    }

    @Override
    public final void start() throws s {
        int n8 = this.i0;
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        a.g(bl);
        this.i0 = 2;
        this.b0();
    }

    @Override
    public final void stop() {
        boolean bl = this.i0 == 2;
        a.g(bl);
        this.i0 = 1;
        this.c0();
    }

    @Override
    public final void t(v[] vArray, e0 e02, long l8, long l9, F.b b8) throws s {
        a.g(this.o0 ^ true);
        this.j0 = e02;
        this.r0 = b8;
        if (this.n0 == Long.MIN_VALUE) {
            this.n0 = l8;
        }
        this.k0 = vArray;
        this.l0 = l9;
        this.d0(vArray, l8, l9, b8);
    }

    @Override
    public final N0 u() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void v(N0.a a8) {
        Object object = this.q;
        synchronized (object) {
            this.s0 = a8;
            return;
        }
    }

    @Override
    public /* synthetic */ void x(float f8, float f9) {
        U.c(this, f8, f9);
    }
}

