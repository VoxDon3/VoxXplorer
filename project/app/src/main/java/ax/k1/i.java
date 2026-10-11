/*
 * Decompiled with CFR 0.152.
 */
package ax.k1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ax.N1.b;
import ax.N1.k;
import ax.N1.l;
import ax.N1.m;
import ax.N1.p;
import ax.N1.q;
import ax.P0.D;
import ax.P0.v;
import ax.R0.c;
import ax.S0.d0;
import ax.S0.u;
import ax.Y0.O;
import ax.Y0.V;
import ax.i1.F;
import ax.k1.a;
import ax.k1.e;
import ax.k1.f;
import ax.k1.g;
import ax.k1.h;
import ax.r7.z;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class i
extends androidx.media3.exoplayer.h
implements Handler.Callback {
    private p A0;
    private q B0;
    private q C0;
    private int D0;
    private final Handler E0;
    private final h F0;
    private final O G0;
    private boolean H0;
    private boolean I0;
    private v J0;
    private long K0;
    private long L0;
    private boolean M0;
    private final b t0;
    private final ax.V0.i u0;
    private a v0;
    private final g w0;
    private boolean x0;
    private int y0;
    private l z0;

    public i(h h8, Looper looper) {
        this(h8, looper, g.a);
    }

    public i(h h8, Looper looper, g g8) {
        super(3);
        this.F0 = ax.S0.a.e(h8);
        h8 = looper == null ? null : d0.z(looper, this);
        this.E0 = h8;
        this.w0 = g8;
        this.t0 = new b();
        this.u0 = new ax.V0.i(1);
        this.G0 = new O();
        this.L0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.M0 = false;
    }

    private void i0() {
        boolean bl = this.M0 || j.Objects.equals((Object)this.J0.o, (Object)"application/cea-608") || j.Objects.equals((Object)this.J0.o, (Object)"application/x-mp4-cea-608") || j.Objects.equals((Object)this.J0.o, (Object)"application/cea-708");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Legacy decoding is disabled, can't handle ");
        stringBuilder.append(this.J0.o);
        stringBuilder.append(" samples (expected ");
        stringBuilder.append("application/x-media3-cues");
        stringBuilder.append(").");
        ax.S0.a.h(bl, stringBuilder.toString());
    }

    private void j0() {
        this.z0(new c(z.<ax.R0.a>z(), this.m0(this.K0)));
    }

    private long k0(long l8) {
        int n8 = this.B0.d(l8);
        if (n8 != 0 && this.B0.l() != 0) {
            if (n8 == -1) {
                q q8 = this.B0;
                return q8.h(q8.l() - 1);
            }
            return this.B0.h(n8 - 1);
        }
        return this.B0.c0;
    }

    private long l0() {
        if (this.D0 == -1) {
            return Long.MAX_VALUE;
        }
        ax.S0.a.e(this.B0);
        if (this.D0 >= this.B0.l()) {
            return Long.MAX_VALUE;
        }
        return this.B0.h(this.D0);
    }

    private long m0(long l8) {
        boolean bl = l8 != -9223372036854775807L;
        ax.S0.a.g(bl);
        return l8 - this.R();
    }

    private void n0(m m8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Subtitle decoding failed. streamFormat=");
        stringBuilder.append(this.J0);
        u.d("TextRenderer", stringBuilder.toString(), m8);
        this.j0();
        this.x0();
    }

    private static boolean o0(k k8, long l8) {
        return k8 != null && k8.l() > 0 && k8.h(k8.l() - 1) > l8;
    }

    private void p0() {
        l l8;
        this.x0 = true;
        this.z0 = l8 = this.w0.a(ax.S0.a.e(this.J0));
        l8.b(this.O());
    }

    private void q0(c c8) {
        this.F0.t(c8.a);
        this.F0.s(c8);
    }

    private static boolean r0(v v8) {
        return j.Objects.equals((Object)v8.o, (Object)"application/x-media3-cues");
    }

    private boolean s0(long l8) {
        if (this.H0) {
            return false;
        }
        if (this.f0(this.G0, this.u0, 0) != -4) {
            return false;
        }
        if (this.u0.s()) {
            this.H0 = true;
            return false;
        }
        this.u0.D();
        Object object = ax.S0.a.e(this.u0.e0);
        object = this.t0.a(this.u0.g0, ((ByteBuffer)object).array(), ((ByteBuffer)object).arrayOffset(), ((Buffer)object).limit());
        this.u0.p();
        return this.v0.b((ax.N1.e)object, l8);
    }

    private void t0() {
        this.A0 = null;
        this.D0 = -1;
        q q8 = this.B0;
        if (q8 != null) {
            q8.B();
            this.B0 = null;
        }
        if ((q8 = this.C0) != null) {
            q8.B();
            this.C0 = null;
        }
    }

    private void u0() {
        this.t0();
        ax.S0.a.e(this.z0).d();
        this.z0 = null;
        this.y0 = 0;
    }

    private void v0(long l8) {
        boolean bl = this.s0(l8);
        long l9 = this.v0.a(this.K0);
        long l10 = l9 - Long.MIN_VALUE;
        long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
        if (l11 == false && this.H0 && !bl) {
            this.I0 = true;
        }
        boolean bl2 = bl;
        if (l11 != false) {
            bl2 = bl;
            if (l9 <= l8) {
                bl2 = true;
            }
        }
        if (bl2) {
            z<ax.R0.a> z8 = this.v0.c(l8);
            l9 = this.v0.d(l8);
            this.z0(new c(z8, this.m0(l9)));
            this.v0.e(l9);
        }
        this.K0 = l8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void w0(long l8) {
        Object object;
        int n8;
        ax.V0.a a8;
        int n9;
        long l9;
        block25: {
            block26: {
                this.K0 = l8;
                if (this.C0 == null) {
                    ax.S0.a.e(this.z0).e(l8);
                    try {
                        this.C0 = (q)ax.S0.a.e(this.z0).a();
                    }
                    catch (m m8) {
                        this.n0(m8);
                        return;
                    }
                }
                if (this.getState() != 2) {
                    return;
                }
                if (this.B0 != null) {
                    l9 = this.l0();
                    n9 = 0;
                    while (l9 <= l8) {
                        ++this.D0;
                        l9 = this.l0();
                        n9 = 1;
                    }
                } else {
                    n9 = 0;
                }
                a8 = this.C0;
                n8 = n9;
                if (a8 == null) break block25;
                if (!a8.s()) break block26;
                n8 = n9;
                if (n9 != 0) break block25;
                n8 = n9;
                if (this.l0() == Long.MAX_VALUE) {
                    if (this.y0 == 2) {
                        this.x0();
                        n8 = n9;
                        break block25;
                    } else {
                        this.t0();
                        this.I0 = true;
                        n8 = n9;
                    }
                }
                break block25;
            }
            n8 = n9;
            if (((androidx.media3.decoder.a)a8).c0 <= l8) {
                object = this.B0;
                if (object != null) {
                    ((androidx.media3.decoder.a)object).B();
                }
                this.D0 = ((q)a8).d(l8);
                this.B0 = a8;
                this.C0 = null;
                n8 = 1;
            }
        }
        if (n8 != 0) {
            ax.S0.a.e(this.B0);
            l9 = this.m0(this.k0(l8));
            this.z0(new c(this.B0.j(l8), l9));
        }
        if (this.y0 == 2) {
            return;
        }
        try {
            while (!this.H0) {
                object = this.A0;
                a8 = object;
                if (object == null) {
                    a8 = (p)ax.S0.a.e(this.z0).f();
                    if (a8 == null) {
                        return;
                    }
                    this.A0 = a8;
                }
                if (this.y0 == 1) {
                    a8.A(4);
                    ax.S0.a.e(this.z0).g(a8);
                    this.A0 = null;
                    this.y0 = 2;
                    return;
                }
                n9 = this.f0(this.G0, (ax.V0.i)a8, 0);
                if (n9 == -4) {
                    if (a8.s()) {
                        this.H0 = true;
                        this.x0 = false;
                    } else {
                        object = this.G0.b;
                        if (object == null) {
                            return;
                        }
                        ((p)a8).k0 = ((v)object).t;
                        ((ax.V0.i)a8).D();
                        this.x0 &= a8.u() ^ true;
                    }
                    if (this.x0) continue;
                    ax.S0.a.e(this.z0).g(a8);
                    this.A0 = null;
                    continue;
                }
                if (n9 == -3) return;
            }
            return;
        }
        catch (m m9) {}
        this.n0(m9);
    }

    private void x0() {
        this.u0();
        this.p0();
    }

    private void z0(c c8) {
        Handler handler = this.E0;
        if (handler != null) {
            handler.obtainMessage(1, (Object)c8).sendToTarget();
            return;
        }
        this.q0(c8);
    }

    @Override
    protected void U() {
        this.J0 = null;
        this.L0 = -9223372036854775807L;
        this.j0();
        this.K0 = -9223372036854775807L;
        if (this.z0 != null) {
            this.u0();
        }
    }

    @Override
    protected void X(long l8, boolean bl) {
        this.K0 = l8;
        Object object = this.v0;
        if (object != null) {
            object.clear();
        }
        this.j0();
        this.H0 = false;
        this.I0 = false;
        this.L0 = -9223372036854775807L;
        object = this.J0;
        if (object != null && !i.r0((v)object)) {
            if (this.y0 != 0) {
                this.x0();
                return;
            }
            this.t0();
            object = ax.S0.a.e(this.z0);
            object.flush();
            object.b(this.O());
        }
    }

    @Override
    public int b(v v8) {
        if (!i.r0(v8) && !this.w0.b(v8)) {
            if (D.r(v8.o)) {
                return V.a(1);
            }
            return V.a(0);
        }
        int n8 = v8.P == 0 ? 4 : 2;
        return V.a(n8);
    }

    @Override
    public boolean c() {
        return this.I0;
    }

    @Override
    protected void d0(v[] object, long l8, long l9, F.b b8) {
        this.J0 = object = object[0];
        if (!i.r0((v)object)) {
            this.i0();
            if (this.z0 != null) {
                this.y0 = 1;
                return;
            }
            this.p0();
            return;
        }
        object = this.J0.M == 1 ? new e() : new f();
        this.v0 = object;
    }

    @Override
    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.q0((c)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public void i(long l8, long l9) {
        if (this.G() && (l9 = this.L0) != -9223372036854775807L && l8 >= l9) {
            this.t0();
            this.I0 = true;
        }
        if (this.I0) {
            return;
        }
        if (i.r0(ax.S0.a.e(this.J0))) {
            ax.S0.a.e(this.v0);
            this.v0(l8);
            return;
        }
        this.i0();
        this.w0(l8);
    }

    @Override
    public boolean isReady() {
        v v8 = this.J0;
        if (v8 == null) {
            return true;
        }
        if (i.r0(ax.S0.a.e(v8))) {
            if (ax.S0.a.e(this.v0).a(this.K0) != Long.MIN_VALUE) {
                return true;
            }
            try {
                this.C();
                return true;
            }
            catch (IOException iOException) {
                return false;
            }
        }
        return !this.I0 && (!this.H0 || i.o0(this.B0, this.K0) || i.o0(this.C0, this.K0) || this.A0 == null);
    }

    public void y0(long l8) {
        ax.S0.a.g(this.G());
        this.L0 = l8;
    }
}

