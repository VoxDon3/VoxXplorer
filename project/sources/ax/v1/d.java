package ax.v1;

import android.net.Uri;
import ax.N1.t;
import ax.P0.C;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.B;
import ax.q1.C2840A;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.C2864y;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.r;
import ax.q1.z;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements r {
    public static final InterfaceC2863x o = new InterfaceC2863x() { // from class: ax.v1.c
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final r[] c() {
            return d.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private final byte[] a;
    private final G b;
    private final boolean c;
    private final C2864y.a d;
    private InterfaceC2859t e;
    private U f;
    private int g;
    private C h;
    private B i;
    private int j;
    private int k;
    private b l;
    private int m;
    private long n;

    public d() {
        this(0);
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new d()};
    }

    private long h(G g, boolean z) {
        boolean z2;
        C0968a.e(this.i);
        int g2 = g.g();
        while (g2 <= g.j() - 16) {
            g.b0(g2);
            if (C2864y.d(g, this.i, this.k, this.d)) {
                g.b0(g2);
                return this.d.a;
            }
            g2++;
        }
        if (!z) {
            g.b0(g2);
            return -1L;
        }
        while (g2 <= g.j() - this.j) {
            g.b0(g2);
            try {
                z2 = C2864y.d(g, this.i, this.k, this.d);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (g.g() <= g.j() ? z2 : false) {
                g.b0(g2);
                return this.d.a;
            }
            g2++;
        }
        g.b0(g.j());
        return -1L;
    }

    private void i(InterfaceC2858s interfaceC2858s) throws IOException {
        this.k = z.b(interfaceC2858s);
        ((InterfaceC2859t) d0.i(this.e)).h(j(interfaceC2858s.getPosition(), interfaceC2858s.getLength()));
        this.g = 5;
    }

    private N j(long j, long j2) {
        C0968a.e(this.i);
        B b = this.i;
        B.a aVar = b.k;
        if (aVar != null && aVar.a.length > 0) {
            return new C2840A(b, j);
        }
        if (j2 == -1 || b.j <= 0) {
            return new N.b(b.f());
        }
        b bVar = new b(b, this.k, j, j2);
        this.l = bVar;
        return bVar.b();
    }

    private void l(InterfaceC2858s interfaceC2858s) throws IOException {
        byte[] bArr = this.a;
        interfaceC2858s.p(bArr, 0, bArr.length);
        interfaceC2858s.m();
        this.g = 2;
    }

    private void m() {
        ((U) d0.i(this.f)).f((this.n * 1000000) / ((B) d0.i(this.i)).e, 1, this.m, 0, null);
    }

    private int n(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        boolean z;
        C0968a.e(this.f);
        C0968a.e(this.i);
        b bVar = this.l;
        if (bVar != null && bVar.d()) {
            return this.l.c(interfaceC2858s, m);
        }
        if (this.n == -1) {
            this.n = C2864y.i(interfaceC2858s, this.i);
            return 0;
        }
        int j = this.b.j();
        if (j < 32768) {
            int c = interfaceC2858s.c(this.b.f(), j, 32768 - j);
            z = c == -1;
            if (!z) {
                this.b.a0(j + c);
            } else if (this.b.a() == 0) {
                m();
                return -1;
            }
        } else {
            z = false;
        }
        int g = this.b.g();
        int i = this.m;
        int i2 = this.j;
        if (i < i2) {
            G g2 = this.b;
            g2.c0(Math.min(i2 - i, g2.a()));
        }
        long h = h(this.b, z);
        int g3 = this.b.g() - g;
        this.b.b0(g);
        this.f.g(this.b, g3);
        this.m += g3;
        if (h != -1) {
            m();
            this.m = 0;
            this.n = h;
        }
        int length = this.b.f().length - this.b.j();
        if (this.b.a() < 16 && length < 16) {
            int a = this.b.a();
            System.arraycopy(this.b.f(), this.b.g(), this.b.f(), 0, a);
            this.b.b0(0);
            this.b.a0(a);
        }
        return 0;
    }

    private void o(InterfaceC2858s interfaceC2858s) throws IOException {
        this.h = z.d(interfaceC2858s, !this.c);
        this.g = 1;
    }

    private void p(InterfaceC2858s interfaceC2858s) throws IOException {
        z.a aVar = new z.a(this.i);
        boolean z = false;
        while (!z) {
            z = z.e(interfaceC2858s, aVar);
            this.i = (B) d0.i(aVar.a);
        }
        C0968a.e(this.i);
        this.j = Math.max(this.i.c, 6);
        ((U) d0.i(this.f)).e(this.i.g(this.a, this.h).b().W("audio/flac").P());
        ((U) d0.i(this.f)).d(this.i.f());
        this.g = 4;
    }

    private void q(InterfaceC2858s interfaceC2858s) throws IOException {
        z.i(interfaceC2858s);
        this.g = 3;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.e = interfaceC2859t;
        this.f = interfaceC2859t.u(0, 1);
        interfaceC2859t.o();
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            b bVar = this.l;
            if (bVar != null) {
                bVar.h(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.X(0);
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        z.c(interfaceC2858s, false);
        return z.a(interfaceC2858s);
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        int i = this.g;
        if (i == 0) {
            o(interfaceC2858s);
            return 0;
        }
        if (i == 1) {
            l(interfaceC2858s);
            return 0;
        }
        if (i == 2) {
            q(interfaceC2858s);
            return 0;
        }
        if (i == 3) {
            p(interfaceC2858s);
            return 0;
        }
        if (i == 4) {
            i(interfaceC2858s);
            return 0;
        }
        if (i == 5) {
            return n(interfaceC2858s, m);
        }
        throw new IllegalStateException();
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    public d(int i) {
        this.a = new byte[42];
        this.b = new G(new byte[32768], 0);
        this.c = (i & 1) != 0;
        this.d = new C2864y.a();
        this.g = 0;
    }

    @Override // ax.q1.r
    public void d() {
    }
}
