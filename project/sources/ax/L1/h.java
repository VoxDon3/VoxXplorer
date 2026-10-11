package ax.L1;

import ax.L1.i;
import ax.P0.C;
import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.G;
import ax.q1.L;
import ax.q1.X;
import ax.r7.AbstractC2991z;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class h extends i {
    private static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean n;

    h() {
    }

    private static boolean n(G g, byte[] bArr) {
        if (g.a() < bArr.length) {
            return false;
        }
        int g2 = g.g();
        byte[] bArr2 = new byte[bArr.length];
        g.q(bArr2, 0, bArr.length);
        g.b0(g2);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(G g) {
        return n(g, o);
    }

    @Override // ax.L1.i
    protected long f(G g) {
        return c(L.e(g.f()));
    }

    @Override // ax.L1.i
    protected boolean h(G g, long j, i.b bVar) throws E {
        if (n(g, o)) {
            byte[] copyOf = Arrays.copyOf(g.f(), g.j());
            int c = L.c(copyOf);
            List<byte[]> a = L.a(copyOf);
            if (bVar.a != null) {
                return true;
            }
            bVar.a = new C0912v.b().W("audio/ogg").y0("audio/opus").T(c).z0(48000).k0(a).P();
            return true;
        }
        byte[] bArr = p;
        if (!n(g, bArr)) {
            C0968a.i(bVar.a);
            return false;
        }
        C0968a.i(bVar.a);
        if (this.n) {
            return true;
        }
        this.n = true;
        g.c0(bArr.length);
        C d = X.d(AbstractC2991z.w(X.k(g, false, false).b));
        if (d == null) {
            return true;
        }
        bVar.a = bVar.a.b().r0(d.b(bVar.a.l)).P();
        return true;
    }

    @Override // ax.L1.i
    protected void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = false;
        }
    }
}
