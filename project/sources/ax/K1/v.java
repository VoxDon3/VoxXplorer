package ax.K1;

import ax.S0.G;
import ax.q1.InterfaceC2858s;
import java.io.IOException;

/* loaded from: classes.dex */
final class v {
    public c a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public boolean l;
    public u n;
    public boolean p;
    public long q;
    public boolean r;
    public long[] g = new long[0];
    public int[] h = new int[0];
    public int[] i = new int[0];
    public long[] j = new long[0];
    public boolean[] k = new boolean[0];
    public boolean[] m = new boolean[0];
    public final G o = new G();

    public void a(G g) {
        g.q(this.o.f(), 0, this.o.j());
        this.o.b0(0);
        this.p = false;
    }

    public void b(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.readFully(this.o.f(), 0, this.o.j());
        this.o.b0(0);
        this.p = false;
    }

    public long c(int i) {
        return this.j[i];
    }

    public void d(int i) {
        this.o.X(i);
        this.l = true;
        this.p = true;
    }

    public void e(int i, int i2) {
        this.e = i;
        this.f = i2;
        if (this.h.length < i) {
            this.g = new long[i];
            this.h = new int[i];
        }
        if (this.i.length < i2) {
            int i3 = (i2 * ax.m.j.L0) / 100;
            this.i = new int[i3];
            this.j = new long[i3];
            this.k = new boolean[i3];
            this.m = new boolean[i3];
        }
    }

    public void f() {
        this.e = 0;
        this.q = 0L;
        this.r = false;
        this.l = false;
        this.p = false;
        this.n = null;
    }

    public boolean g(int i) {
        return this.l && this.m[i];
    }
}
