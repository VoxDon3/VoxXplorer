package ax.w1;

import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.G;
import ax.T0.h;
import ax.q1.C2844d;
import ax.q1.U;
import ax.w1.AbstractC3327e;

/* renamed from: ax.w1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3328f extends AbstractC3327e {
    private final G b;
    private final G c;
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public C3328f(U u) {
        super(u);
        this.b = new G(h.a);
        this.c = new G(4);
    }

    @Override // ax.w1.AbstractC3327e
    protected boolean b(G g) throws AbstractC3327e.a {
        int M = g.M();
        int i = (M >> 4) & 15;
        int i2 = M & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        throw new AbstractC3327e.a("Video format not supported: " + i2);
    }

    @Override // ax.w1.AbstractC3327e
    protected boolean c(G g, long j) throws E {
        int M = g.M();
        long w = j + (g.w() * 1000);
        if (M == 0 && !this.e) {
            G g2 = new G(new byte[g.a()]);
            g.q(g2.f(), 0, g.a());
            C2844d b = C2844d.b(g2);
            this.d = b.b;
            this.a.e(new C0912v.b().W("video/x-flv").y0("video/avc").U(b.l).F0(b.c).h0(b.d).u0(b.k).k0(b.a).P());
            this.e = true;
            return false;
        }
        if (M != 1 || !this.e) {
            return false;
        }
        int i = this.g == 1 ? 1 : 0;
        if (!this.f && i == 0) {
            return false;
        }
        byte[] f = this.c.f();
        f[0] = 0;
        f[1] = 0;
        f[2] = 0;
        int i2 = 4 - this.d;
        int i3 = 0;
        while (g.a() > 0) {
            g.q(this.c.f(), i2, this.d);
            this.c.b0(0);
            int Q = this.c.Q();
            this.b.b0(0);
            this.a.g(this.b, 4);
            this.a.g(g, Q);
            i3 = i3 + 4 + Q;
        }
        this.a.f(w, i, i3, 0, null);
        this.f = true;
        return true;
    }
}
