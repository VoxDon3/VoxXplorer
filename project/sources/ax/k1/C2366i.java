package ax.k1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.AbstractC0601h;
import ax.N1.k;
import ax.N1.l;
import ax.N1.m;
import ax.N1.p;
import ax.N1.q;
import ax.P0.C0912v;
import ax.P0.D;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.d0;
import ax.Y0.O;
import ax.Y0.V;
import ax.i1.InterfaceC2209F;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ax.k1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2366i extends AbstractC0601h implements Handler.Callback {
    private p A0;
    private q B0;
    private q C0;
    private int D0;
    private final Handler E0;
    private final InterfaceC2365h F0;
    private final O G0;
    private boolean H0;
    private boolean I0;
    private C0912v J0;
    private long K0;
    private long L0;
    private boolean M0;
    private final ax.N1.b t0;
    private final ax.V0.i u0;
    private InterfaceC2358a v0;
    private final InterfaceC2364g w0;
    private boolean x0;
    private int y0;
    private l z0;

    public C2366i(InterfaceC2365h interfaceC2365h, Looper looper) {
        this(interfaceC2365h, looper, InterfaceC2364g.a);
    }

    private void i0() {
        C0968a.h(this.M0 || Objects.equals(this.J0.o, "application/cea-608") || Objects.equals(this.J0.o, "application/x-mp4-cea-608") || Objects.equals(this.J0.o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.J0.o + " samples (expected application/x-media3-cues).");
    }

    private void j0() {
        z0(new ax.R0.c(AbstractC2991z.z(), m0(this.K0)));
    }

    private long k0(long j) {
        int d = this.B0.d(j);
        if (d == 0 || this.B0.l() == 0) {
            return this.B0.c0;
        }
        if (d != -1) {
            return this.B0.h(d - 1);
        }
        return this.B0.h(r2.l() - 1);
    }

    private long l0() {
        if (this.D0 == -1) {
            return Long.MAX_VALUE;
        }
        C0968a.e(this.B0);
        if (this.D0 >= this.B0.l()) {
            return Long.MAX_VALUE;
        }
        return this.B0.h(this.D0);
    }

    private long m0(long j) {
        C0968a.g(j != -9223372036854775807L);
        return j - R();
    }

    private void n0(m mVar) {
        C0987u.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.J0, mVar);
        j0();
        x0();
    }

    private static boolean o0(k kVar, long j) {
        return kVar != null && kVar.l() > 0 && kVar.h(kVar.l() - 1) > j;
    }

    private void p0() {
        this.x0 = true;
        l a = this.w0.a((C0912v) C0968a.e(this.J0));
        this.z0 = a;
        a.b(O());
    }

    private void q0(ax.R0.c cVar) {
        this.F0.t(cVar.a);
        this.F0.s(cVar);
    }

    private static boolean r0(C0912v c0912v) {
        return Objects.equals(c0912v.o, "application/x-media3-cues");
    }

    private boolean s0(long j) {
        if (this.H0 || f0(this.G0, this.u0, 0) != -4) {
            return false;
        }
        if (this.u0.s()) {
            this.H0 = true;
            return false;
        }
        this.u0.D();
        ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(this.u0.e0);
        ax.N1.e a = this.t0.a(this.u0.g0, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.u0.p();
        return this.v0.b(a, j);
    }

    private void t0() {
        this.A0 = null;
        this.D0 = -1;
        q qVar = this.B0;
        if (qVar != null) {
            qVar.B();
            this.B0 = null;
        }
        q qVar2 = this.C0;
        if (qVar2 != null) {
            qVar2.B();
            this.C0 = null;
        }
    }

    private void u0() {
        t0();
        ((l) C0968a.e(this.z0)).d();
        this.z0 = null;
        this.y0 = 0;
    }

    private void v0(long j) {
        boolean s0 = s0(j);
        long a = this.v0.a(this.K0);
        if (a == Long.MIN_VALUE && this.H0 && !s0) {
            this.I0 = true;
        }
        if (a != Long.MIN_VALUE && a <= j) {
            s0 = true;
        }
        if (s0) {
            AbstractC2991z<ax.R0.a> c = this.v0.c(j);
            long d = this.v0.d(j);
            z0(new ax.R0.c(c, m0(d)));
            this.v0.e(d);
        }
        this.K0 = j;
    }

    private void w0(long j) {
        boolean z;
        this.K0 = j;
        if (this.C0 == null) {
            ((l) C0968a.e(this.z0)).e(j);
            try {
                this.C0 = ((l) C0968a.e(this.z0)).a();
            } catch (m e) {
                n0(e);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.B0 != null) {
            long l0 = l0();
            z = false;
            while (l0 <= j) {
                this.D0++;
                l0 = l0();
                z = true;
            }
        } else {
            z = false;
        }
        q qVar = this.C0;
        if (qVar != null) {
            if (qVar.s()) {
                if (!z && l0() == Long.MAX_VALUE) {
                    if (this.y0 == 2) {
                        x0();
                    } else {
                        t0();
                        this.I0 = true;
                    }
                }
            } else if (qVar.c0 <= j) {
                q qVar2 = this.B0;
                if (qVar2 != null) {
                    qVar2.B();
                }
                this.D0 = qVar.d(j);
                this.B0 = qVar;
                this.C0 = null;
                z = true;
            }
        }
        if (z) {
            C0968a.e(this.B0);
            z0(new ax.R0.c(this.B0.j(j), m0(k0(j))));
        }
        if (this.y0 == 2) {
            return;
        }
        while (!this.H0) {
            try {
                p pVar = this.A0;
                if (pVar == null) {
                    pVar = ((l) C0968a.e(this.z0)).f();
                    if (pVar == null) {
                        return;
                    } else {
                        this.A0 = pVar;
                    }
                }
                if (this.y0 == 1) {
                    pVar.A(4);
                    ((l) C0968a.e(this.z0)).g(pVar);
                    this.A0 = null;
                    this.y0 = 2;
                    return;
                }
                int f0 = f0(this.G0, pVar, 0);
                if (f0 == -4) {
                    if (pVar.s()) {
                        this.H0 = true;
                        this.x0 = false;
                    } else {
                        C0912v c0912v = this.G0.b;
                        if (c0912v == null) {
                            return;
                        }
                        pVar.k0 = c0912v.t;
                        pVar.D();
                        this.x0 &= !pVar.u();
                    }
                    if (!this.x0) {
                        ((l) C0968a.e(this.z0)).g(pVar);
                        this.A0 = null;
                    }
                } else if (f0 == -3) {
                    return;
                }
            } catch (m e2) {
                n0(e2);
                return;
            }
        }
    }

    private void x0() {
        u0();
        p0();
    }

    private void z0(ax.R0.c cVar) {
        Handler handler = this.E0;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            q0(cVar);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void U() {
        this.J0 = null;
        this.L0 = -9223372036854775807L;
        j0();
        this.K0 = -9223372036854775807L;
        if (this.z0 != null) {
            u0();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void X(long j, boolean z) {
        this.K0 = j;
        InterfaceC2358a interfaceC2358a = this.v0;
        if (interfaceC2358a != null) {
            interfaceC2358a.clear();
        }
        j0();
        this.H0 = false;
        this.I0 = false;
        this.L0 = -9223372036854775807L;
        C0912v c0912v = this.J0;
        if (c0912v == null || r0(c0912v)) {
            return;
        }
        if (this.y0 != 0) {
            x0();
            return;
        }
        t0();
        l lVar = (l) C0968a.e(this.z0);
        lVar.flush();
        lVar.b(O());
    }

    @Override // androidx.media3.exoplayer.N0
    public int b(C0912v c0912v) {
        if (r0(c0912v) || this.w0.b(c0912v)) {
            return V.a(c0912v.P == 0 ? 4 : 2);
        }
        return D.r(c0912v.o) ? V.a(1) : V.a(0);
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean c() {
        return this.I0;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void d0(C0912v[] c0912vArr, long j, long j2, InterfaceC2209F.b bVar) {
        C0912v c0912v = c0912vArr[0];
        this.J0 = c0912v;
        if (r0(c0912v)) {
            this.v0 = this.J0.M == 1 ? new C2362e() : new C2363f();
            return;
        }
        i0();
        if (this.z0 != null) {
            this.y0 = 1;
        } else {
            p0();
        }
    }

    @Override // androidx.media3.exoplayer.M0, androidx.media3.exoplayer.N0
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        q0((ax.R0.c) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.M0
    public void i(long j, long j2) {
        if (G()) {
            long j3 = this.L0;
            if (j3 != -9223372036854775807L && j >= j3) {
                t0();
                this.I0 = true;
            }
        }
        if (this.I0) {
            return;
        }
        if (r0((C0912v) C0968a.e(this.J0))) {
            C0968a.e(this.v0);
            v0(j);
        } else {
            i0();
            w0(j);
        }
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean isReady() {
        C0912v c0912v = this.J0;
        if (c0912v == null) {
            return true;
        }
        if (!r0((C0912v) C0968a.e(c0912v))) {
            return !this.I0 && (!this.H0 || o0(this.B0, this.K0) || o0(this.C0, this.K0) || this.A0 == null);
        }
        if (((InterfaceC2358a) C0968a.e(this.v0)).a(this.K0) != Long.MIN_VALUE) {
            return true;
        }
        try {
            C();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void y0(long j) {
        C0968a.g(G());
        this.L0 = j;
    }

    public C2366i(InterfaceC2365h interfaceC2365h, Looper looper, InterfaceC2364g interfaceC2364g) {
        super(3);
        this.F0 = (InterfaceC2365h) C0968a.e(interfaceC2365h);
        this.E0 = looper == null ? null : d0.z(looper, this);
        this.w0 = interfaceC2364g;
        this.t0 = new ax.N1.b();
        this.u0 = new ax.V0.i(1);
        this.G0 = new O();
        this.L0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.M0 = false;
    }
}
