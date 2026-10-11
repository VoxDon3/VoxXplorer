package androidx.media3.exoplayer;

import androidx.media3.exoplayer.N0;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.InterfaceC0975h;
import ax.Z0.I1;
import ax.i1.InterfaceC2209F;
import j$.util.Objects;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0601h implements M0, N0 {
    private final int c0;
    private ax.Y0.W e0;
    private int f0;
    private I1 g0;
    private InterfaceC0975h h0;
    private int i0;
    private ax.i1.e0 j0;
    private C0912v[] k0;
    private long l0;
    private long m0;
    private boolean o0;
    private boolean p0;
    private InterfaceC2209F.b r0;
    private N0.a s0;
    private final Object q = new Object();
    private final ax.Y0.O d0 = new ax.Y0.O();
    private long n0 = Long.MIN_VALUE;
    private ax.P0.N q0 = ax.P0.N.a;

    public AbstractC0601h(int i) {
        this.c0 = i;
    }

    private void g0(long j, boolean z) throws C0622s {
        this.o0 = false;
        this.m0 = j;
        this.n0 = j;
        X(j, z);
    }

    public int A() throws C0622s {
        return 0;
    }

    @Override // androidx.media3.exoplayer.K0.b
    public void B(int i, Object obj) throws C0622s {
    }

    @Override // androidx.media3.exoplayer.M0
    public final void C() throws IOException {
        ((ax.i1.e0) C0968a.e(this.j0)).b();
    }

    @Override // androidx.media3.exoplayer.M0
    public final long D() {
        return this.n0;
    }

    @Override // androidx.media3.exoplayer.M0
    public final void F(long j) throws C0622s {
        g0(j, false);
    }

    @Override // androidx.media3.exoplayer.M0
    public final boolean G() {
        return this.o0;
    }

    @Override // androidx.media3.exoplayer.M0
    public ax.Y0.S H() {
        return null;
    }

    protected final C0622s I(Throwable th, C0912v c0912v, int i) {
        return J(th, c0912v, false, i);
    }

    protected final C0622s J(Throwable th, C0912v c0912v, boolean z, int i) {
        int i2;
        if (c0912v != null && !this.p0) {
            this.p0 = true;
            try {
                int i3 = ax.Y0.V.i(b(c0912v));
                this.p0 = false;
                i2 = i3;
            } catch (C0622s unused) {
                this.p0 = false;
            } catch (Throwable th2) {
                this.p0 = false;
                throw th2;
            }
            return C0622s.d(th, getName(), N(), c0912v, i2, this.r0, z, i);
        }
        i2 = 4;
        return C0622s.d(th, getName(), N(), c0912v, i2, this.r0, z, i);
    }

    protected final InterfaceC0975h K() {
        return (InterfaceC0975h) C0968a.e(this.h0);
    }

    protected final ax.Y0.W L() {
        return (ax.Y0.W) C0968a.e(this.e0);
    }

    protected final ax.Y0.O M() {
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
        return (I1) C0968a.e(this.g0);
    }

    protected final C0912v[] Q() {
        return (C0912v[]) C0968a.e(this.k0);
    }

    protected final long R() {
        return this.l0;
    }

    protected final ax.P0.N S() {
        return this.q0;
    }

    protected final boolean T() {
        return n() ? this.o0 : ((ax.i1.e0) C0968a.e(this.j0)).isReady();
    }

    protected abstract void U();

    protected void V(boolean z, boolean z2) throws C0622s {
    }

    protected void W() {
    }

    protected abstract void X(long j, boolean z) throws C0622s;

    protected void Y() {
    }

    protected final void Z() {
        N0.a aVar;
        synchronized (this.q) {
            aVar = this.s0;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // androidx.media3.exoplayer.M0
    public final void a() {
        C0968a.g(this.i0 == 0);
        this.d0.a();
        a0();
    }

    protected void a0() {
    }

    protected void b0() throws C0622s {
    }

    protected void c0() {
    }

    @Override // androidx.media3.exoplayer.M0
    public final void d() {
        C0968a.g(this.i0 == 0);
        Y();
    }

    @Override // androidx.media3.exoplayer.M0
    public final void f() {
        C0968a.g(this.i0 == 1);
        this.d0.a();
        this.i0 = 0;
        this.j0 = null;
        this.k0 = null;
        this.o0 = false;
        U();
        this.r0 = null;
    }

    protected final int f0(ax.Y0.O o, ax.V0.i iVar, int i) {
        int a = ((ax.i1.e0) C0968a.e(this.j0)).a(o, iVar, i);
        if (a != -4) {
            if (a == -5) {
                C0912v c0912v = (C0912v) C0968a.e(o.b);
                if (c0912v.t != Long.MAX_VALUE) {
                    o.b = c0912v.b().C0(c0912v.t + this.l0).P();
                }
            }
            return a;
        }
        if (iVar.s()) {
            this.n0 = Long.MIN_VALUE;
            return this.o0 ? -4 : -3;
        }
        long j = iVar.g0 + this.l0;
        iVar.g0 = j;
        this.n0 = Math.max(this.n0, j);
        return a;
    }

    @Override // androidx.media3.exoplayer.M0
    public final int getState() {
        return this.i0;
    }

    protected int h0(long j) {
        return ((ax.i1.e0) C0968a.e(this.j0)).c(j - this.l0);
    }

    @Override // androidx.media3.exoplayer.M0
    public final ax.i1.e0 j() {
        return this.j0;
    }

    @Override // androidx.media3.exoplayer.M0, androidx.media3.exoplayer.N0
    public final int k() {
        return this.c0;
    }

    @Override // androidx.media3.exoplayer.N0
    public final void l() {
        synchronized (this.q) {
            this.s0 = null;
        }
    }

    @Override // androidx.media3.exoplayer.M0
    public final void m(int i, I1 i1, InterfaceC0975h interfaceC0975h) {
        this.f0 = i;
        this.g0 = i1;
        this.h0 = interfaceC0975h;
        W();
    }

    @Override // androidx.media3.exoplayer.M0
    public final boolean n() {
        return this.n0 == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.M0
    public /* synthetic */ long o(long j, long j2) {
        return ax.Y0.U.b(this, j, j2);
    }

    @Override // androidx.media3.exoplayer.M0
    public /* synthetic */ void p() {
        ax.Y0.U.a(this);
    }

    @Override // androidx.media3.exoplayer.M0
    public final void q() {
        this.o0 = true;
    }

    @Override // androidx.media3.exoplayer.M0
    public final void r(ax.P0.N n) {
        if (Objects.equals(this.q0, n)) {
            return;
        }
        this.q0 = n;
        e0(n);
    }

    @Override // androidx.media3.exoplayer.M0
    public final void s(ax.Y0.W w, C0912v[] c0912vArr, ax.i1.e0 e0Var, long j, boolean z, boolean z2, long j2, long j3, InterfaceC2209F.b bVar) throws C0622s {
        C0968a.g(this.i0 == 0);
        this.e0 = w;
        this.r0 = bVar;
        this.i0 = 1;
        V(z, z2);
        t(c0912vArr, e0Var, j2, j3, bVar);
        g0(j2, z);
    }

    @Override // androidx.media3.exoplayer.M0
    public final void start() throws C0622s {
        C0968a.g(this.i0 == 1);
        this.i0 = 2;
        b0();
    }

    @Override // androidx.media3.exoplayer.M0
    public final void stop() {
        C0968a.g(this.i0 == 2);
        this.i0 = 1;
        c0();
    }

    @Override // androidx.media3.exoplayer.M0
    public final void t(C0912v[] c0912vArr, ax.i1.e0 e0Var, long j, long j2, InterfaceC2209F.b bVar) throws C0622s {
        C0968a.g(!this.o0);
        this.j0 = e0Var;
        this.r0 = bVar;
        if (this.n0 == Long.MIN_VALUE) {
            this.n0 = j;
        }
        this.k0 = c0912vArr;
        this.l0 = j2;
        d0(c0912vArr, j, j2, bVar);
    }

    @Override // androidx.media3.exoplayer.M0
    public final N0 u() {
        return this;
    }

    @Override // androidx.media3.exoplayer.N0
    public final void v(N0.a aVar) {
        synchronized (this.q) {
            this.s0 = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.M0
    public /* synthetic */ void x(float f, float f2) {
        ax.Y0.U.c(this, f, f2);
    }

    protected void e0(ax.P0.N n) {
    }

    protected void d0(C0912v[] c0912vArr, long j, long j2, InterfaceC2209F.b bVar) throws C0622s {
    }
}
