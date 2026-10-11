package ax.L1;

import ax.L1.i;
import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.G;
import ax.q1.X;
import ax.r7.AbstractC2991z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class j extends i {
    private a n;
    private int o;
    private boolean p;
    private X.c q;
    private X.a r;

    static final class a {
        public final X.c a;
        public final X.a b;
        public final byte[] c;
        public final X.b[] d;
        public final int e;

        public a(X.c cVar, X.a aVar, byte[] bArr, X.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = aVar;
            this.c = bArr;
            this.d = bVarArr;
            this.e = i;
        }
    }

    j() {
    }

    static void n(G g, long j) {
        if (g.b() < g.j() + 4) {
            g.Y(Arrays.copyOf(g.f(), g.j() + 4));
        } else {
            g.a0(g.j() + 4);
        }
        byte[] f = g.f();
        f[g.j() - 4] = (byte) (j & 255);
        f[g.j() - 3] = (byte) ((j >>> 8) & 255);
        f[g.j() - 2] = (byte) ((j >>> 16) & 255);
        f[g.j() - 1] = (byte) ((j >>> 24) & 255);
    }

    private static int o(byte b, a aVar) {
        return !aVar.d[p(b, aVar.e, 1)].a ? aVar.a.g : aVar.a.h;
    }

    static int p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean r(G g) {
        try {
            return X.o(1, g, true);
        } catch (E unused) {
            return false;
        }
    }

    @Override // ax.L1.i
    protected void e(long j) {
        super.e(j);
        this.p = j != 0;
        X.c cVar = this.q;
        this.o = cVar != null ? cVar.g : 0;
    }

    @Override // ax.L1.i
    protected long f(G g) {
        if ((g.f()[0] & 1) == 1) {
            return -1L;
        }
        int o = o(g.f()[0], (a) C0968a.i(this.n));
        long j = this.p ? (this.o + o) / 4 : 0;
        n(g, j);
        this.p = true;
        this.o = o;
        return j;
    }

    @Override // ax.L1.i
    protected boolean h(G g, long j, i.b bVar) throws IOException {
        if (this.n != null) {
            C0968a.e(bVar.a);
            return false;
        }
        a q = q(g);
        this.n = q;
        if (q == null) {
            return true;
        }
        X.c cVar = q.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.j);
        arrayList.add(q.c);
        bVar.a = new C0912v.b().W("audio/ogg").y0("audio/vorbis").S(cVar.e).t0(cVar.d).T(cVar.b).z0(cVar.c).k0(arrayList).r0(X.d(AbstractC2991z.w(q.b.b))).P();
        return true;
    }

    @Override // ax.L1.i
    protected void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    a q(G g) throws IOException {
        X.c cVar = this.q;
        if (cVar == null) {
            this.q = X.l(g);
            return null;
        }
        X.a aVar = this.r;
        if (aVar == null) {
            this.r = X.j(g);
            return null;
        }
        byte[] bArr = new byte[g.j()];
        System.arraycopy(g.f(), 0, bArr, 0, g.j());
        return new a(cVar, aVar, bArr, X.m(g, cVar.b), X.b(r4.length - 1));
    }
}
