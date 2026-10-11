package ax.s1;

import ax.N1.t;
import ax.N1.u;
import ax.P0.C0912v;
import ax.P0.D;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.q1.C2857q;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.K;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.r;
import ax.r7.j0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements r {
    private final G a;
    private final c b;
    private final boolean c;
    private final t.a d;
    private int e;
    private InterfaceC2859t f;
    private ax.s1.c g;
    private long h;
    private e[] i;
    private long j;
    private e k;
    private int l;
    private long m;
    private long n;
    private int o;
    private boolean p;

    /* renamed from: ax.s1.b$b, reason: collision with other inner class name */
    private class C0445b implements N {
        private final long a;

        public C0445b(long j) {
            this.a = j;
        }

        @Override // ax.q1.N
        public boolean i() {
            return true;
        }

        @Override // ax.q1.N
        public N.a l(long j) {
            N.a i = b.this.i[0].i(j);
            for (int i2 = 1; i2 < b.this.i.length; i2++) {
                N.a i3 = b.this.i[i2].i(j);
                if (i3.a.b < i.a.b) {
                    i = i3;
                }
            }
            return i;
        }

        @Override // ax.q1.N
        public long n() {
            return this.a;
        }
    }

    private static class c {
        public int a;
        public int b;
        public int c;

        private c() {
        }

        public void a(G g) {
            this.a = g.z();
            this.b = g.z();
            this.c = 0;
        }

        public void b(G g) throws E {
            a(g);
            if (this.a == 1414744396) {
                this.c = g.z();
                return;
            }
            throw E.a("LIST expected, found: " + this.a, null);
        }
    }

    public b(int i, t.a aVar) {
        this.d = aVar;
        this.c = (i & 1) == 0;
        this.a = new G(12);
        this.b = new c();
        this.f = new K();
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    private static void h(InterfaceC2858s interfaceC2858s) throws IOException {
        if ((interfaceC2858s.getPosition() & 1) == 1) {
            interfaceC2858s.n(1);
        }
    }

    private e i(int i) {
        for (e eVar : this.i) {
            if (eVar.j(i)) {
                return eVar;
            }
        }
        return null;
    }

    private void j(G g) throws IOException {
        f d = f.d(1819436136, g);
        if (d.a() != 1819436136) {
            throw E.a("Unexpected header list type " + d.a(), null);
        }
        ax.s1.c cVar = (ax.s1.c) d.c(ax.s1.c.class);
        if (cVar == null) {
            throw E.a("AviHeader not found", null);
        }
        this.g = cVar;
        this.h = cVar.c * cVar.a;
        ArrayList arrayList = new ArrayList();
        j0<InterfaceC3043a> it = d.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC3043a next = it.next();
            if (next.a() == 1819440243) {
                int i2 = i + 1;
                e n = n((f) next, i);
                if (n != null) {
                    arrayList.add(n);
                }
                i = i2;
            }
        }
        this.i = (e[]) arrayList.toArray(new e[0]);
        this.f.o();
    }

    private void l(G g) {
        int i;
        long m = m(g);
        while (true) {
            if (g.a() < 16) {
                break;
            }
            int z = g.z();
            int z2 = g.z();
            long z3 = g.z() + m;
            g.c0(4);
            e i2 = i(z);
            if (i2 != null) {
                i2.b(z3, (z2 & 16) == 16);
            }
        }
        for (e eVar : this.i) {
            eVar.c();
        }
        this.p = true;
        if (this.i.length == 0) {
            this.f.h(new N.b(this.h));
        } else {
            this.f.h(new C0445b(this.h));
        }
    }

    private long m(G g) {
        if (g.a() < 16) {
            return 0L;
        }
        int g2 = g.g();
        g.c0(8);
        long z = g.z();
        long j = this.m;
        long j2 = z <= j ? 8 + j : 0L;
        g.b0(g2);
        return j2;
    }

    private e n(f fVar, int i) {
        d dVar = (d) fVar.c(d.class);
        g gVar = (g) fVar.c(g.class);
        if (dVar == null) {
            C0987u.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            C0987u.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long b = dVar.b();
        C0912v c0912v = gVar.a;
        C0912v.b b2 = c0912v.b();
        b2.i0(i);
        int i2 = dVar.f;
        if (i2 != 0) {
            b2.o0(i2);
        }
        h hVar = (h) fVar.c(h.class);
        if (hVar != null) {
            b2.l0(hVar.a);
        }
        int k = D.k(c0912v.o);
        if (k != 1 && k != 2) {
            return null;
        }
        U u = this.f.u(i, k);
        u.e(b2.P());
        u.d(b);
        this.h = Math.max(this.h, b);
        return new e(i, dVar, u);
    }

    private int o(InterfaceC2858s interfaceC2858s) throws IOException {
        if (interfaceC2858s.getPosition() >= this.n) {
            return -1;
        }
        e eVar = this.k;
        if (eVar == null) {
            h(interfaceC2858s);
            interfaceC2858s.p(this.a.f(), 0, 12);
            this.a.b0(0);
            int z = this.a.z();
            if (z == 1414744396) {
                this.a.b0(8);
                interfaceC2858s.n(this.a.z() != 1769369453 ? 8 : 12);
                interfaceC2858s.m();
                return 0;
            }
            int z2 = this.a.z();
            if (z == 1263424842) {
                this.j = interfaceC2858s.getPosition() + z2 + 8;
                return 0;
            }
            interfaceC2858s.n(8);
            interfaceC2858s.m();
            e i = i(z);
            if (i == null) {
                this.j = interfaceC2858s.getPosition() + z2;
                return 0;
            }
            i.n(z2);
            this.k = i;
        } else if (eVar.m(interfaceC2858s)) {
            this.k = null;
        }
        return 0;
    }

    private boolean p(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        boolean z;
        if (this.j != -1) {
            long position = interfaceC2858s.getPosition();
            long j = this.j;
            if (j < position || j > 262144 + position) {
                m.a = j;
                z = true;
                this.j = -1L;
                return z;
            }
            interfaceC2858s.n((int) (j - position));
        }
        z = false;
        this.j = -1L;
        return z;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.e = 0;
        if (this.c) {
            interfaceC2859t = new u(interfaceC2859t, this.d);
        }
        this.f = interfaceC2859t;
        this.j = -1L;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (e eVar : this.i) {
            eVar.o(j);
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.p(this.a.f(), 0, 12);
        this.a.b0(0);
        if (this.a.z() != 1179011410) {
            return false;
        }
        this.a.c0(4);
        return this.a.z() == 541677121;
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        if (p(interfaceC2858s, m)) {
            return 1;
        }
        switch (this.e) {
            case 0:
                if (!c(interfaceC2858s)) {
                    throw E.a("AVI Header List not found", null);
                }
                interfaceC2858s.n(12);
                this.e = 1;
                return 0;
            case 1:
                interfaceC2858s.readFully(this.a.f(), 0, 12);
                this.a.b0(0);
                this.b.b(this.a);
                c cVar = this.b;
                if (cVar.c == 1819436136) {
                    this.l = cVar.b;
                    this.e = 2;
                    return 0;
                }
                throw E.a("hdrl expected, found: " + this.b.c, null);
            case 2:
                int i = this.l - 4;
                G g = new G(i);
                interfaceC2858s.readFully(g.f(), 0, i);
                j(g);
                this.e = 3;
                return 0;
            case 3:
                if (this.m != -1) {
                    long position = interfaceC2858s.getPosition();
                    long j = this.m;
                    if (position != j) {
                        this.j = j;
                        return 0;
                    }
                }
                interfaceC2858s.p(this.a.f(), 0, 12);
                interfaceC2858s.m();
                this.a.b0(0);
                this.b.a(this.a);
                int z = this.a.z();
                int i2 = this.b.a;
                if (i2 == 1179011410) {
                    interfaceC2858s.n(12);
                    return 0;
                }
                if (i2 != 1414744396 || z != 1769369453) {
                    this.j = interfaceC2858s.getPosition() + this.b.b + 8;
                    return 0;
                }
                long position2 = interfaceC2858s.getPosition();
                this.m = position2;
                this.n = position2 + this.b.b + 8;
                if (!this.p) {
                    if (((ax.s1.c) C0968a.e(this.g)).b()) {
                        this.e = 4;
                        this.j = this.n;
                        return 0;
                    }
                    this.f.h(new N.b(this.h));
                    this.p = true;
                }
                this.j = interfaceC2858s.getPosition() + 12;
                this.e = 6;
                return 0;
            case 4:
                interfaceC2858s.readFully(this.a.f(), 0, 8);
                this.a.b0(0);
                int z2 = this.a.z();
                int z3 = this.a.z();
                if (z2 == 829973609) {
                    this.e = 5;
                    this.o = z3;
                } else {
                    this.j = interfaceC2858s.getPosition() + z3;
                }
                return 0;
            case 5:
                G g2 = new G(this.o);
                interfaceC2858s.readFully(g2.f(), 0, this.o);
                l(g2);
                this.e = 6;
                this.j = this.m;
                return 0;
            case 6:
                return o(interfaceC2858s);
            default:
                throw new AssertionError();
        }
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    @Override // ax.q1.r
    public void d() {
    }
}
