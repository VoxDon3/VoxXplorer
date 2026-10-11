package ax.a1;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.exoplayer.AbstractC0601h;
import androidx.media3.exoplayer.C0622s;
import ax.P0.C0894c;
import ax.P0.C0898g;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.V0.g;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.a1.InterfaceC1276B;
import ax.a1.InterfaceC1309z;
import ax.b1.C1464m;
import ax.b1.InterfaceC1465n;
import ax.i1.InterfaceC2209F;

/* loaded from: classes.dex */
public abstract class H<T extends ax.V0.g<ax.V0.i, ? extends SimpleDecoderOutputBuffer, ? extends ax.V0.h>> extends AbstractC0601h implements ax.Y0.S {
    private boolean A0;
    private T B0;
    private ax.V0.i C0;
    private SimpleDecoderOutputBuffer D0;
    private InterfaceC1465n E0;
    private InterfaceC1465n F0;
    private int G0;
    private boolean H0;
    private boolean I0;
    private long J0;
    private boolean K0;
    private boolean L0;
    private boolean M0;
    private long N0;
    private final long[] O0;
    private int P0;
    private boolean Q0;
    private boolean R0;
    private long S0;
    private long T0;
    private long U0;
    private final InterfaceC1309z.a t0;
    private final InterfaceC1276B u0;
    private final ax.V0.i v0;
    private C1176b w0;
    private C0912v x0;
    private int y0;
    private int z0;

    private static final class b {
        public static void a(InterfaceC1276B interfaceC1276B, Object obj) {
            interfaceC1276B.g(C1291h.a(obj));
        }
    }

    private final class c implements InterfaceC1276B.d {
        private c() {
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void a(long j) {
            H.this.t0.x(j);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void b(InterfaceC1276B.a aVar) {
            H.this.t0.r(aVar);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void c(int i) {
            H.this.t0.o(i);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void d() {
            H.this.Q0 = true;
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void e(boolean z) {
            H.this.t0.y(z);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void f(Exception exc) {
            C0987u.d("DecoderAudioRenderer", "Audio sink error", exc);
            H.this.t0.p(exc);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void g(InterfaceC1276B.a aVar) {
            H.this.t0.q(aVar);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public /* synthetic */ void h() {
            C.b(this);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void i(int i, long j, long j2) {
            H.this.t0.z(i, j, j2);
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void j() {
            H.this.Z();
        }

        @Override // ax.a1.InterfaceC1276B.d
        public void k() {
            H.this.v0();
        }

        @Override // ax.a1.InterfaceC1276B.d
        public /* synthetic */ void l() {
            C.a(this);
        }
    }

    public H(Handler handler, InterfaceC1309z interfaceC1309z, InterfaceC1276B interfaceC1276B) {
        super(1);
        this.t0 = new InterfaceC1309z.a(handler, interfaceC1309z);
        this.u0 = interfaceC1276B;
        interfaceC1276B.x(new c());
        this.v0 = ax.V0.i.F();
        this.G0 = 0;
        this.I0 = true;
        A0(-9223372036854775807L);
        this.O0 = new long[10];
        this.S0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
    }

    private void A0(long j) {
        this.N0 = j;
        if (j != -9223372036854775807L) {
            this.u0.u(j);
        }
    }

    private void B0(InterfaceC1465n interfaceC1465n) {
        C1464m.a(this.F0, interfaceC1465n);
        this.F0 = interfaceC1465n;
    }

    private void E0() {
        long s = this.u0.s(c());
        if (s != Long.MIN_VALUE) {
            if (!this.K0) {
                s = Math.max(this.J0, s);
            }
            this.J0 = s;
            this.K0 = false;
        }
    }

    private boolean n0() throws C0622s, ax.V0.h, InterfaceC1276B.b, InterfaceC1276B.c, InterfaceC1276B.f {
        if (this.D0 == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.B0.a();
            this.D0 = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i = simpleDecoderOutputBuffer.d0;
            if (i > 0) {
                this.w0.f += i;
                this.u0.v();
            }
            if (this.D0.t()) {
                x0();
            }
        }
        if (this.D0.s()) {
            if (this.G0 == 2) {
                y0();
                t0();
                this.I0 = true;
            } else {
                this.D0.B();
                this.D0 = null;
                try {
                    w0();
                } catch (InterfaceC1276B.f e) {
                    throw J(e, e.d0, e.c0, 5002);
                }
            }
            return false;
        }
        this.U0 = -9223372036854775807L;
        if (this.I0) {
            this.u0.j(r0(this.B0).b().d0(this.y0).e0(this.z0).r0(this.x0.l).Z(this.x0.m).j0(this.x0.a).l0(this.x0.b).m0(this.x0.c).n0(this.x0.d).A0(this.x0.e).w0(this.x0.f).P(), 0, q0(this.B0));
            this.I0 = false;
        }
        InterfaceC1276B interfaceC1276B = this.u0;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.D0;
        if (!interfaceC1276B.D(simpleDecoderOutputBuffer2.g0, simpleDecoderOutputBuffer2.c0, 1)) {
            this.U0 = this.D0.c0;
            return false;
        }
        this.w0.e++;
        this.D0.B();
        this.D0 = null;
        return true;
    }

    private boolean o0() throws ax.V0.h, C0622s {
        T t = this.B0;
        if (t == null || this.G0 == 2 || this.L0) {
            return false;
        }
        if (this.C0 == null) {
            ax.V0.i iVar = (ax.V0.i) t.f();
            this.C0 = iVar;
            if (iVar == null) {
                return false;
            }
        }
        if (this.G0 == 1) {
            this.C0.A(4);
            this.B0.g(this.C0);
            this.C0 = null;
            this.G0 = 2;
            return false;
        }
        ax.Y0.O M = M();
        int f0 = f0(M, this.C0, 0);
        if (f0 == -5) {
            u0(M);
            return true;
        }
        if (f0 != -4) {
            if (f0 != -3) {
                throw new IllegalStateException();
            }
            if (n()) {
                this.T0 = this.S0;
            }
            return false;
        }
        if (this.C0.s()) {
            this.L0 = true;
            this.T0 = this.S0;
            this.B0.g(this.C0);
            this.C0 = null;
            return false;
        }
        if (!this.A0) {
            this.A0 = true;
            this.C0.n(134217728);
        }
        this.S0 = this.C0.g0;
        if (n() || this.C0.w()) {
            this.T0 = this.S0;
        }
        this.C0.D();
        ax.V0.i iVar2 = this.C0;
        iVar2.c0 = this.x0;
        this.B0.g(iVar2);
        this.H0 = true;
        this.w0.c++;
        this.C0 = null;
        return true;
    }

    private void p0() throws C0622s {
        if (this.G0 != 0) {
            y0();
            t0();
            return;
        }
        this.C0 = null;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.D0;
        if (simpleDecoderOutputBuffer != null) {
            simpleDecoderOutputBuffer.B();
            this.D0 = null;
        }
        ax.V0.g gVar = (ax.V0.g) C0968a.e(this.B0);
        gVar.flush();
        gVar.b(O());
        this.H0 = false;
    }

    private void t0() throws C0622s {
        ax.V0.b bVar;
        if (this.B0 != null) {
            return;
        }
        z0(this.F0);
        InterfaceC1465n interfaceC1465n = this.E0;
        if (interfaceC1465n != null) {
            bVar = interfaceC1465n.h();
            if (bVar == null && this.E0.g() == null) {
                return;
            }
        } else {
            bVar = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ax.S0.N.a("createAudioDecoder");
            T m0 = m0(this.x0, bVar);
            this.B0 = m0;
            m0.b(O());
            ax.S0.N.b();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.t0.s(this.B0.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.w0.a++;
        } catch (ax.V0.h e) {
            C0987u.d("DecoderAudioRenderer", "Audio codec error", e);
            this.t0.n(e);
            throw I(e, this.x0, 4001);
        } catch (OutOfMemoryError e2) {
            throw I(e2, this.x0, 4001);
        }
    }

    private void u0(ax.Y0.O o) throws C0622s {
        C0912v c0912v = (C0912v) C0968a.e(o.b);
        B0(o.a);
        C0912v c0912v2 = this.x0;
        this.x0 = c0912v;
        this.y0 = c0912v.J;
        this.z0 = c0912v.K;
        T t = this.B0;
        if (t == null) {
            t0();
            this.t0.w(this.x0, null);
            return;
        }
        C1177c c1177c = this.F0 != this.E0 ? new C1177c(t.getName(), c0912v2, c0912v, 0, 128) : l0(t.getName(), c0912v2, c0912v);
        if (c1177c.d == 0) {
            if (this.H0) {
                this.G0 = 1;
            } else {
                y0();
                t0();
                this.I0 = true;
            }
        }
        this.t0.w(this.x0, c1177c);
    }

    private void w0() throws InterfaceC1276B.f {
        this.M0 = true;
        this.u0.i();
        this.U0 = this.T0;
    }

    private void x0() {
        this.u0.v();
        if (this.P0 != 0) {
            A0(this.O0[0]);
            int i = this.P0 - 1;
            this.P0 = i;
            long[] jArr = this.O0;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    private void y0() {
        this.C0 = null;
        this.D0 = null;
        this.G0 = 0;
        this.H0 = false;
        this.S0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        T t = this.B0;
        if (t != null) {
            this.w0.b++;
            t.d();
            this.t0.t(this.B0.getName());
            this.B0 = null;
        }
        z0(null);
    }

    private void z0(InterfaceC1465n interfaceC1465n) {
        C1464m.a(this.E0, interfaceC1465n);
        this.E0 = interfaceC1465n;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.K0.b
    public void B(int i, Object obj) throws C0622s {
        if (i == 2) {
            this.u0.l(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.u0.A((C0894c) obj);
            return;
        }
        if (i == 6) {
            this.u0.C((C0898g) obj);
            return;
        }
        if (i == 12) {
            if (Build.VERSION.SDK_INT >= 23) {
                b.a(this.u0, obj);
            }
        } else if (i == 9) {
            this.u0.E(((Boolean) obj).booleanValue());
        } else if (i != 10) {
            super.B(i, obj);
        } else {
            this.u0.o(((Integer) obj).intValue());
        }
    }

    protected final boolean C0(C0912v c0912v) {
        return this.u0.b(c0912v);
    }

    protected abstract int D0(C0912v c0912v);

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void U() {
        this.x0 = null;
        this.I0 = true;
        A0(-9223372036854775807L);
        this.Q0 = false;
        this.U0 = -9223372036854775807L;
        try {
            B0(null);
            y0();
            this.u0.a();
        } finally {
            this.t0.u(this.w0);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void V(boolean z, boolean z2) throws C0622s {
        C1176b c1176b = new C1176b();
        this.w0 = c1176b;
        this.t0.v(c1176b);
        if (L().b) {
            this.u0.y();
        } else {
            this.u0.t();
        }
        this.u0.w(P());
        this.u0.B(K());
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void X(long j, boolean z) throws C0622s {
        this.u0.flush();
        this.J0 = j;
        this.U0 = -9223372036854775807L;
        this.Q0 = false;
        this.K0 = true;
        this.L0 = false;
        this.M0 = false;
        if (this.B0 != null) {
            p0();
        }
    }

    @Override // androidx.media3.exoplayer.N0
    public final int b(C0912v c0912v) {
        if (!ax.P0.D.o(c0912v.o)) {
            return ax.Y0.V.a(0);
        }
        int D0 = D0(c0912v);
        return D0 <= 2 ? ax.Y0.V.a(D0) : ax.Y0.V.b(D0, 8, 32);
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void b0() {
        this.u0.m();
        this.R0 = true;
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean c() {
        return this.M0 && this.u0.c();
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void c0() {
        E0();
        this.u0.f();
        this.R0 = false;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void d0(C0912v[] c0912vArr, long j, long j2, InterfaceC2209F.b bVar) throws C0622s {
        super.d0(c0912vArr, j, j2, bVar);
        this.A0 = false;
        if (this.N0 == -9223372036854775807L) {
            A0(j2);
            return;
        }
        int i = this.P0;
        if (i == this.O0.length) {
            C0987u.h("DecoderAudioRenderer", "Too many stream changes, so dropping offset: " + this.O0[this.P0 - 1]);
        } else {
            this.P0 = i + 1;
        }
        this.O0[this.P0 - 1] = j2;
    }

    @Override // ax.Y0.S
    public void e(ax.P0.G g) {
        this.u0.e(g);
    }

    @Override // ax.Y0.S
    public ax.P0.G h() {
        return this.u0.h();
    }

    @Override // androidx.media3.exoplayer.M0
    public void i(long j, long j2) throws C0622s {
        if (this.M0) {
            try {
                this.u0.i();
                this.U0 = this.T0;
                return;
            } catch (InterfaceC1276B.f e) {
                throw J(e, e.d0, e.c0, 5002);
            }
        }
        if (this.x0 == null) {
            ax.Y0.O M = M();
            this.v0.p();
            int f0 = f0(M, this.v0, 2);
            if (f0 != -5) {
                if (f0 == -4) {
                    C0968a.g(this.v0.s());
                    this.L0 = true;
                    try {
                        w0();
                        return;
                    } catch (InterfaceC1276B.f e2) {
                        throw I(e2, null, 5002);
                    }
                }
                return;
            }
            u0(M);
        }
        t0();
        if (this.B0 != null) {
            try {
                ax.S0.N.a("drainAndFeed");
                while (n0()) {
                }
                while (o0()) {
                }
                ax.S0.N.b();
                this.w0.c();
            } catch (ax.V0.h e3) {
                C0987u.d("DecoderAudioRenderer", "Audio codec error", e3);
                this.t0.n(e3);
                throw I(e3, this.x0, 4003);
            } catch (InterfaceC1276B.b e4) {
                throw I(e4, e4.q, 5001);
            } catch (InterfaceC1276B.c e5) {
                throw J(e5, e5.d0, e5.c0, 5001);
            } catch (InterfaceC1276B.f e6) {
                throw J(e6, e6.d0, e6.c0, 5002);
            }
        }
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean isReady() {
        if (this.u0.k()) {
            return true;
        }
        if (this.x0 != null) {
            return T() || this.D0 != null;
        }
        return false;
    }

    protected C1177c l0(String str, C0912v c0912v, C0912v c0912v2) {
        return new C1177c(str, c0912v, c0912v2, 0, 1);
    }

    protected abstract T m0(C0912v c0912v, ax.V0.b bVar) throws ax.V0.h;

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.M0
    public long o(long j, long j2) {
        boolean z = this.U0 != -9223372036854775807L;
        if (!this.R0) {
            return (z || this.M0) ? 1000000L : 10000L;
        }
        long p = this.u0.p();
        if (!z || p == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(p, this.U0 - j) / (h() != null ? h().a : 1.0f)) / 2.0f)) - (ax.S0.d0.a1(K().b()) - j2));
    }

    protected int[] q0(T t) {
        return null;
    }

    protected abstract C0912v r0(T t);

    protected final int s0(C0912v c0912v) {
        return this.u0.n(c0912v);
    }

    protected void v0() {
        this.K0 = true;
    }

    @Override // ax.Y0.S
    public long w() {
        if (getState() == 2) {
            E0();
        }
        return this.J0;
    }

    @Override // ax.Y0.S
    public boolean z() {
        boolean z = this.Q0;
        this.Q0 = false;
        return z;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.M0
    public ax.Y0.S H() {
        return this;
    }
}
