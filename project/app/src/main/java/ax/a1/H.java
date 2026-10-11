/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.a;
import androidx.media3.exoplayer.s;
import ax.P0.D;
import ax.P0.G;
import ax.P0.v;
import ax.S0.N;
import ax.S0.d0;
import ax.S0.u;
import ax.V0.g;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.S;
import ax.Y0.V;
import ax.a1.B;
import ax.a1.C;
import ax.a1.h;
import ax.a1.z;
import ax.b1.m;
import ax.b1.n;
import ax.i1.F;

public abstract class H<T extends g<i, ? extends SimpleDecoderOutputBuffer, ? extends ax.V0.h>>
extends androidx.media3.exoplayer.h
implements S {
    private boolean A0;
    private T B0;
    private i C0;
    private SimpleDecoderOutputBuffer D0;
    private n E0;
    private n F0;
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
    private final z.a t0;
    private final B u0;
    private final i v0;
    private ax.Y0.b w0;
    private v x0;
    private int y0;
    private int z0;

    public H(Handler handler, z z8, B b8) {
        super(1);
        this.t0 = new z.a(handler, z8);
        this.u0 = b8;
        b8.x(new c(this));
        this.v0 = i.F();
        this.G0 = 0;
        this.I0 = true;
        this.A0(-9223372036854775807L);
        this.O0 = new long[10];
        this.S0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
    }

    private void A0(long l8) {
        this.N0 = l8;
        if (l8 != -9223372036854775807L) {
            this.u0.u(l8);
        }
    }

    private void B0(n n8) {
        m.a(this.F0, n8);
        this.F0 = n8;
    }

    private void E0() {
        long l8 = this.u0.s(this.c());
        if (l8 != Long.MIN_VALUE) {
            if (!this.K0) {
                l8 = Math.max(this.J0, l8);
            }
            this.J0 = l8;
            this.K0 = false;
        }
    }

    static /* synthetic */ boolean i0(H h8, boolean bl) {
        h8.Q0 = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean n0() throws s, ax.V0.h, B.b, B.c, B.f {
        Object object;
        if (this.D0 == null) {
            object = (SimpleDecoderOutputBuffer)this.B0.a();
            this.D0 = object;
            if (object == null) {
                return false;
            }
            int n8 = ((a)object).d0;
            if (n8 > 0) {
                object = this.w0;
                ((ax.Y0.b)object).f += n8;
                this.u0.v();
            }
            if (this.D0.t()) {
                this.x0();
            }
        }
        if (this.D0.s()) {
            if (this.G0 == 2) {
                this.y0();
                this.t0();
                this.I0 = true;
                return false;
            }
            this.D0.B();
            this.D0 = null;
            try {
                this.w0();
                return false;
            }
            catch (B.f f8) {
                throw this.J(f8, f8.d0, f8.c0, 5002);
            }
        }
        this.U0 = -9223372036854775807L;
        if (this.I0) {
            object = this.r0(this.B0).b().d0(this.y0).e0(this.z0).r0(this.x0.l).Z(this.x0.m).j0(this.x0.a).l0(this.x0.b).m0(this.x0.c).n0(this.x0.d).A0(this.x0.e).w0(this.x0.f).P();
            this.u0.j((v)object, 0, this.q0(this.B0));
            this.I0 = false;
        }
        object = this.u0;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.D0;
        if (object.D(simpleDecoderOutputBuffer.g0, simpleDecoderOutputBuffer.c0, 1)) {
            object = this.w0;
            ++((ax.Y0.b)object).e;
            this.D0.B();
            this.D0 = null;
            return true;
        }
        this.U0 = this.D0.c0;
        return false;
    }

    private boolean o0() throws ax.V0.h, s {
        Object object = this.B0;
        if (object != null && this.G0 != 2 && !this.L0) {
            if (this.C0 == null) {
                object = (i)object.f();
                this.C0 = object;
                if (object == null) {
                    return false;
                }
            }
            if (this.G0 == 1) {
                this.C0.A(4);
                this.B0.g((i)this.C0);
                this.C0 = null;
                this.G0 = 2;
                return false;
            }
            object = this.M();
            int n8 = this.f0((O)object, this.C0, 0);
            if (n8 != -5) {
                if (n8 != -4) {
                    if (n8 == -3) {
                        if (this.n()) {
                            this.T0 = this.S0;
                        }
                        return false;
                    }
                    throw new IllegalStateException();
                }
                if (this.C0.s()) {
                    this.L0 = true;
                    this.T0 = this.S0;
                    this.B0.g((i)this.C0);
                    this.C0 = null;
                    return false;
                }
                if (!this.A0) {
                    this.A0 = true;
                    this.C0.n(0x8000000);
                }
                this.S0 = this.C0.g0;
                if (this.n() || this.C0.w()) {
                    this.T0 = this.S0;
                }
                this.C0.D();
                object = this.C0;
                ((i)object).c0 = this.x0;
                this.B0.g(object);
                this.H0 = true;
                object = this.w0;
                ++((ax.Y0.b)object).c;
                this.C0 = null;
                return true;
            }
            this.u0((O)object);
            return true;
        }
        return false;
    }

    private void p0() throws s {
        if (this.G0 != 0) {
            this.y0();
            this.t0();
            return;
        }
        this.C0 = null;
        Object object = this.D0;
        if (object != null) {
            ((SimpleDecoderOutputBuffer)object).B();
            this.D0 = null;
        }
        object = (g)ax.S0.a.e(this.B0);
        object.flush();
        object.b(this.O());
        this.H0 = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void t0() throws s {
        if (this.B0 != null) return;
        this.z0(this.F0);
        Object object = this.E0;
        if (object != null) {
            ax.V0.b b8 = object.h();
            object = b8;
            if (b8 == null) {
                if (this.E0.g() == null) return;
                object = b8;
            }
        } else {
            object = null;
        }
        try {
            long l8 = SystemClock.elapsedRealtime();
            N.a("createAudioDecoder");
            object = this.m0(this.x0, (ax.V0.b)object);
            this.B0 = object;
            object.b(this.O());
            N.b();
            long l9 = SystemClock.elapsedRealtime();
            this.t0.s(this.B0.getName(), l9, l9 - l8);
            object = this.w0;
            ++((ax.Y0.b)object).a;
            return;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            throw this.I(outOfMemoryError, this.x0, 4001);
        }
        catch (ax.V0.h h8) {}
        u.d("DecoderAudioRenderer", "Audio codec error", h8);
        this.t0.n(h8);
        throw this.I(h8, this.x0, 4001);
    }

    private void u0(O object) throws s {
        v v8 = ax.S0.a.e(((O)object).b);
        this.B0(((O)object).a);
        object = this.x0;
        this.x0 = v8;
        this.y0 = v8.J;
        this.z0 = v8.K;
        T t8 = this.B0;
        if (t8 == null) {
            this.t0();
            this.t0.w(this.x0, null);
            return;
        }
        object = this.F0 != this.E0 ? new ax.Y0.c(t8.getName(), (v)object, v8, 0, 128) : this.l0(t8.getName(), (v)object, v8);
        if (((ax.Y0.c)object).d == 0) {
            if (this.H0) {
                this.G0 = 1;
            } else {
                this.y0();
                this.t0();
                this.I0 = true;
            }
        }
        this.t0.w(this.x0, (ax.Y0.c)object);
    }

    private void w0() throws B.f {
        this.M0 = true;
        this.u0.i();
        this.U0 = this.T0;
    }

    private void x0() {
        this.u0.v();
        if (this.P0 != 0) {
            int n8;
            this.A0(this.O0[0]);
            this.P0 = n8 = this.P0 - 1;
            long[] lArray = this.O0;
            System.arraycopy(lArray, 1, lArray, 0, n8);
        }
    }

    private void y0() {
        this.C0 = null;
        this.D0 = null;
        this.G0 = 0;
        this.H0 = false;
        this.S0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        T t8 = this.B0;
        if (t8 != null) {
            ax.Y0.b b8 = this.w0;
            ++b8.b;
            t8.d();
            this.t0.t(this.B0.getName());
            this.B0 = null;
        }
        this.z0(null);
    }

    private void z0(n n8) {
        m.a(this.E0, n8);
        this.E0 = n8;
    }

    @Override
    public void B(int n8, Object object) throws s {
        if (n8 != 2) {
            if (n8 != 3) {
                if (n8 != 6) {
                    if (n8 != 12) {
                        if (n8 != 9) {
                            if (n8 != 10) {
                                super.B(n8, object);
                                return;
                            }
                            this.u0.o((Integer)object);
                            return;
                        }
                        this.u0.E((Boolean)object);
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        b.a(this.u0, object);
                    }
                    return;
                }
                object = (ax.P0.g)object;
                this.u0.C((ax.P0.g)object);
                return;
            }
            object = (ax.P0.c)object;
            this.u0.A((ax.P0.c)object);
            return;
        }
        this.u0.l(((Float)object).floatValue());
    }

    protected final boolean C0(v v8) {
        return this.u0.b(v8);
    }

    protected abstract int D0(v var1);

    @Override
    public S H() {
        return this;
    }

    @Override
    protected void U() {
        this.x0 = null;
        this.I0 = true;
        this.A0(-9223372036854775807L);
        this.Q0 = false;
        this.U0 = -9223372036854775807L;
        try {
            this.B0(null);
            this.y0();
            this.u0.a();
            return;
        }
        finally {
            this.t0.u(this.w0);
        }
    }

    @Override
    protected void V(boolean bl, boolean bl2) throws s {
        ax.Y0.b b8;
        this.w0 = b8 = new ax.Y0.b();
        this.t0.v(b8);
        if (this.L().b) {
            this.u0.y();
        } else {
            this.u0.t();
        }
        this.u0.w(this.P());
        this.u0.B(this.K());
    }

    @Override
    protected void X(long l8, boolean bl) throws s {
        this.u0.flush();
        this.J0 = l8;
        this.U0 = -9223372036854775807L;
        this.Q0 = false;
        this.K0 = true;
        this.L0 = false;
        this.M0 = false;
        if (this.B0 != null) {
            this.p0();
        }
    }

    @Override
    public final int b(v v8) {
        if (!D.o(v8.o)) {
            return V.a(0);
        }
        int n8 = this.D0(v8);
        if (n8 <= 2) {
            return V.a(n8);
        }
        return V.b(n8, 8, 32);
    }

    @Override
    protected void b0() {
        this.u0.m();
        this.R0 = true;
    }

    @Override
    public boolean c() {
        return this.M0 && this.u0.c();
    }

    @Override
    protected void c0() {
        this.E0();
        this.u0.f();
        this.R0 = false;
    }

    @Override
    protected void d0(v[] object, long l8, long l9, F.b b8) throws s {
        super.d0((v[])object, l8, l9, b8);
        this.A0 = false;
        if (this.N0 == -9223372036854775807L) {
            this.A0(l9);
            return;
        }
        int n8 = this.P0;
        if (n8 == this.O0.length) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Too many stream changes, so dropping offset: ");
            ((StringBuilder)object).append(this.O0[this.P0 - 1]);
            u.h("DecoderAudioRenderer", ((StringBuilder)object).toString());
        } else {
            this.P0 = n8 + 1;
        }
        this.O0[this.P0 - 1] = l9;
    }

    @Override
    public void e(G g8) {
        this.u0.e(g8);
    }

    @Override
    public G h() {
        return this.u0.h();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void i(long l8, long l9) throws s {
        if (this.M0) {
            try {
                this.u0.i();
                this.U0 = this.T0;
                return;
            }
            catch (B.f f8) {
                throw this.J(f8, f8.d0, f8.c0, 5002);
            }
        }
        if (this.x0 == null) {
            O o8 = this.M();
            this.v0.p();
            int n8 = this.f0(o8, this.v0, 2);
            if (n8 == -5) {
                this.u0(o8);
            } else {
                if (n8 != -4) return;
                ax.S0.a.g(this.v0.s());
                this.L0 = true;
                try {
                    this.w0();
                    return;
                }
                catch (B.f f9) {
                    throw this.I(f9, null, 5002);
                }
            }
        }
        this.t0();
        if (this.B0 == null) return;
        try {
            N.a("drainAndFeed");
            while (this.n0()) {
            }
            while (this.o0()) {
            }
            N.b();
            this.w0.c();
            return;
        }
        catch (B.f f10) {
            throw this.J(f10, f10.d0, f10.c0, 5002);
        }
        catch (B.c c8) {
            throw this.J(c8, c8.d0, c8.c0, 5001);
        }
        catch (B.b b8) {
            throw this.I(b8, b8.q, 5001);
        }
        catch (ax.V0.h h8) {}
        u.d("DecoderAudioRenderer", "Audio codec error", h8);
        this.t0.n(h8);
        throw this.I(h8, this.x0, 4003);
    }

    @Override
    public boolean isReady() {
        return this.u0.k() || this.x0 != null && (this.T() || this.D0 != null);
        {
        }
    }

    protected ax.Y0.c l0(String string, v v8, v v9) {
        return new ax.Y0.c(string, v8, v9, 0, 1);
    }

    protected abstract T m0(v var1, ax.V0.b var2) throws ax.V0.h;

    @Override
    public long o(long l8, long l9) {
        boolean bl = this.U0 != -9223372036854775807L;
        if (!this.R0) {
            if (!bl && !this.M0) {
                return 10000L;
            }
            return 1000000L;
        }
        long l10 = this.u0.p();
        if (bl && l10 != -9223372036854775807L) {
            float f8 = Math.min(l10, this.U0 - l8);
            float f9 = this.h() != null ? this.h().a : 1.0f;
            return Math.max(10000L, (long)(f8 / f9 / 2.0f) - (d0.a1(this.K().b()) - l9));
        }
        return 10000L;
    }

    protected int[] q0(T t8) {
        return null;
    }

    protected abstract v r0(T var1);

    protected final int s0(v v8) {
        return this.u0.n(v8);
    }

    protected void v0() {
        this.K0 = true;
    }

    @Override
    public long w() {
        if (this.getState() == 2) {
            this.E0();
        }
        return this.J0;
    }

    @Override
    public boolean z() {
        boolean bl = this.Q0;
        this.Q0 = false;
        return bl;
    }

    private static final class b {
        public static void a(B b8, Object object) {
            b8.g(h.a(object));
        }
    }

    private final class c
    implements B.d {
        final H a;

        private c(H h8) {
            this.a = h8;
        }

        @Override
        public void a(long l8) {
            this.a.t0.x(l8);
        }

        @Override
        public void b(B.a a8) {
            this.a.t0.r(a8);
        }

        @Override
        public void c(int n8) {
            this.a.t0.o(n8);
        }

        @Override
        public void d() {
            H.i0(this.a, true);
        }

        @Override
        public void e(boolean bl) {
            this.a.t0.y(bl);
        }

        @Override
        public void f(Exception exception) {
            u.d("DecoderAudioRenderer", "Audio sink error", exception);
            this.a.t0.p(exception);
        }

        @Override
        public void g(B.a a8) {
            this.a.t0.q(a8);
        }

        @Override
        public /* synthetic */ void h() {
            C.b(this);
        }

        @Override
        public void i(int n8, long l8, long l9) {
            this.a.t0.z(n8, l8, l9);
        }

        @Override
        public void j() {
            this.a.Z();
        }

        @Override
        public void k() {
            this.a.v0();
        }

        @Override
        public /* synthetic */ void l() {
            C.a(this);
        }
    }
}

