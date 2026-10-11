package ax.w1;

import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.G;
import ax.q1.C2841a;
import ax.q1.U;
import ax.w1.AbstractC3327e;
import java.util.Collections;

/* renamed from: ax.w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3323a extends AbstractC3327e {
    private static final int[] e = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public C3323a(U u) {
        super(u);
    }

    @Override // ax.w1.AbstractC3327e
    protected boolean b(G g) throws AbstractC3327e.a {
        if (this.b) {
            g.c0(1);
        } else {
            int M = g.M();
            int i = (M >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.a.e(new C0912v.b().W("video/x-flv").y0("audio/mpeg").T(1).z0(e[(M >> 2) & 3]).P());
                this.c = true;
            } else if (i == 7 || i == 8) {
                this.a.e(new C0912v.b().W("video/x-flv").y0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").T(1).z0(8000).P());
                this.c = true;
            } else if (i != 10) {
                throw new AbstractC3327e.a("Audio format not supported: " + this.d);
            }
            this.b = true;
        }
        return true;
    }

    @Override // ax.w1.AbstractC3327e
    protected boolean c(G g, long j) throws E {
        if (this.d == 2) {
            int a = g.a();
            this.a.g(g, a);
            this.a.f(j, 1, a, 0, null);
            return true;
        }
        int M = g.M();
        if (M != 0 || this.c) {
            if (this.d == 10 && M != 1) {
                return false;
            }
            int a2 = g.a();
            this.a.g(g, a2);
            this.a.f(j, 1, a2, 0, null);
            return true;
        }
        int a3 = g.a();
        byte[] bArr = new byte[a3];
        g.q(bArr, 0, a3);
        C2841a.b e2 = C2841a.e(bArr);
        this.a.e(new C0912v.b().W("video/x-flv").y0("audio/mp4a-latm").U(e2.c).T(e2.b).z0(e2.a).k0(Collections.singletonList(bArr)).P());
        this.c = true;
        return false;
    }
}
