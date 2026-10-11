package ax.X0;

import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.d0;
import ax.X0.j;
import ax.q1.C2857q;
import ax.q1.E;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.M;
import ax.q1.N;
import ax.q1.O;
import ax.q1.U;
import ax.q1.r;
import ax.u7.C3218f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class e implements r, N {
    private int e;
    private int f;
    private long g;
    private long h;
    private b i;
    private int d = 0;
    private final ArrayList<j> a = new ArrayList<>();
    private final PriorityQueue<j> b = new PriorityQueue<>();
    private final G c = new G(512);

    private static final class b extends E {
        private int b;

        @Override // ax.q1.E, ax.q1.U
        public void f(long j, int i, int i2, int i3, U.a aVar) {
            C0968a.g((i & 1) == 0);
            if (this.b == 0) {
                i |= 1;
            }
            super.f(j, i, i2, i3, aVar);
            this.b++;
        }

        public void h() {
            this.b = 0;
        }

        private b(U u) {
            super(u);
        }
    }

    private static boolean p(G g) {
        return g.v() == 1297377380;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i, long j) {
        ArrayList<j> arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = arrayList.get(i2);
            i2++;
            jVar.d(i, j);
        }
    }

    private void r() {
        ((b) C0968a.i(this.i)).f(this.g, 0, 0, 0, null);
    }

    private int s() throws ax.P0.E {
        if (this.c.a() < 8) {
            throw ax.P0.E.a(null, null);
        }
        if (this.c.v() != 1297379947) {
            throw ax.P0.E.a(null, null);
        }
        int v = this.c.v();
        if (v > 0) {
            return v;
        }
        throw ax.P0.E.a(null, null);
    }

    private void t() throws ax.P0.E {
        if (this.c.a() < 14) {
            throw ax.P0.E.a(null, null);
        }
        if (!p(this.c)) {
            throw ax.P0.E.a(null, null);
        }
        this.c.c0(4);
        short I = this.c.I();
        short I2 = this.c.I();
        if (I2 <= 0) {
            throw ax.P0.E.a(null, null);
        }
        this.f = this.c.I();
        for (int i = 0; i < I2; i++) {
            int s = s();
            byte[] bArr = new byte[s];
            if (this.c.a() < s) {
                throw ax.P0.E.a(null, null);
            }
            this.c.q(bArr, 0, s);
            this.a.add(new j(I, this.f, new G(bArr), new j.a() { // from class: ax.X0.d
                @Override // ax.X0.j.a
                public final void a(int i2, long j) {
                    e.this.q(i2, j);
                }
            }));
        }
    }

    private void u(long j) throws ax.P0.E {
        while (!this.b.isEmpty()) {
            j jVar = (j) C0968a.e(this.b.poll());
            long p = jVar.p();
            if (p != -9223372036854775807L && p < j) {
                jVar.n((U) C0968a.i(this.i), true);
                jVar.q();
                this.b.add(jVar);
            }
        }
        this.b.addAll(this.a);
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        if (this.d != 0) {
            throw new IllegalStateException();
        }
        b bVar = new b(interfaceC2859t.u(0, 1));
        this.i = bVar;
        bVar.e(new C0912v.b().U("audio/midi").W("audio/midi").y0("audio/x-exoplayer-midi").P());
        interfaceC2859t.o();
        interfaceC2859t.h(this);
        this.d = 1;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        C0968a.g(this.d != 4);
        this.h = j2;
        b bVar = this.i;
        if (bVar != null) {
            bVar.h();
        }
        if (this.d != 1) {
            this.d = 2;
        } else {
            this.c.b0(0);
            this.e = 0;
        }
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        G g = new G(4);
        interfaceC2858s.p(g.f(), 0, 4);
        return p(g);
    }

    @Override // ax.q1.r
    public void d() {
        this.a.clear();
        this.b.clear();
        this.c.Y(d0.f);
        this.d = 4;
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        int i = this.d;
        int i2 = -1;
        if (i == 1) {
            int e = C3218f.e(interfaceC2858s.getLength());
            int length = this.c.f().length;
            if (this.e == length) {
                G g = this.c;
                if (e != -1) {
                    length = e;
                }
                g.d((length * 3) / 2);
            }
            int c = interfaceC2858s.c(this.c.f(), this.e, this.c.b() - this.e);
            if (c != -1) {
                int i3 = this.e + c;
                this.e = i3;
                if (e == -1 || i3 != e) {
                    return 0;
                }
            }
            this.c.a0(this.e);
            t();
            this.d = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException();
            }
            j jVar = (j) C0968a.e(this.b.poll());
            long p = jVar.p();
            if (p != -9223372036854775807L) {
                long j = this.g;
                if (j + 100000 < p) {
                    this.g = j + 100000;
                    r();
                } else {
                    this.g = p;
                    jVar.n((U) C0968a.i(this.i), false);
                    jVar.q();
                }
                i2 = 0;
            }
            this.b.add(jVar);
            return i2;
        }
        this.b.clear();
        ArrayList<j> arrayList = this.a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            j jVar2 = arrayList.get(i4);
            i4++;
            j jVar3 = jVar2;
            jVar3.r();
            jVar3.q();
        }
        this.b.addAll(this.a);
        u(this.h);
        this.g = this.h;
        if (((j) C0968a.e(this.b.peek())).p() > this.g) {
            r();
        }
        this.d = 3;
        return 0;
    }

    @Override // ax.q1.N
    public boolean i() {
        return true;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        int i = this.d;
        return (i == 2 || i == 3) ? new N.a(new O(j, 14L)) : new N.a(O.c);
    }

    @Override // ax.q1.N
    public long n() {
        return -9223372036854775807L;
    }
}
