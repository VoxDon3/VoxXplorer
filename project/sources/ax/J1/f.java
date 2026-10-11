package ax.J1;

import android.net.Uri;
import ax.E1.h;
import ax.E1.l;
import ax.E1.n;
import ax.J1.g;
import ax.N1.t;
import ax.P0.C;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.C2855o;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.F;
import ax.q1.H;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.J;
import ax.q1.M;
import ax.q1.U;
import ax.q1.r;
import ax.u7.C3218f;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements r {
    public static final InterfaceC2863x v = new InterfaceC2863x() { // from class: ax.J1.d
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
            return f.g();
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
    private static final h.a w = new h.a() { // from class: ax.J1.e
        @Override // ax.E1.h.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return f.h(i, i2, i3, i4, i5);
        }
    };
    private final int a;
    private final long b;
    private final G c;
    private final J.a d;
    private final F e;
    private final H f;
    private final U g;
    private InterfaceC2859t h;
    private U i;
    private U j;
    private int k;
    private C l;
    private long m;
    private long n;
    private long o;
    private long p;
    private int q;
    private g r;
    private boolean s;
    private boolean t;
    private long u;

    public f() {
        this(0);
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new f()};
    }

    public static /* synthetic */ boolean h(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    private void i() {
        C0968a.i(this.i);
        d0.i(this.h);
    }

    private g j(InterfaceC2858s interfaceC2858s) throws IOException {
        long p;
        long j;
        long g;
        g t = t(interfaceC2858s);
        c s = s(this.l, interfaceC2858s.getPosition());
        if (this.s) {
            return new g.a();
        }
        if ((this.a & 4) != 0) {
            if (s != null) {
                p = s.n();
                g = s.g();
            } else if (t != null) {
                p = t.n();
                g = t.g();
            } else {
                p = p(this.l);
                j = -1;
                t = new b(p, interfaceC2858s.getPosition(), j);
            }
            j = g;
            t = new b(p, interfaceC2858s.getPosition(), j);
        } else if (s != null) {
            t = s;
        } else if (t == null) {
            t = null;
        }
        if (t != null && y(t) && t.n() != -9223372036854775807L && (t.g() != -1 || interfaceC2858s.getLength() != -1)) {
            long h = t.h() != -1 ? t.h() : 0L;
            long g2 = t.g() != -1 ? t.g() : interfaceC2858s.getLength();
            t = new a(g2, h, C3218f.n(d0.r1(g2 - h, 8000000L, t.n(), RoundingMode.HALF_UP)), -1, false);
        } else if (t == null || y(t)) {
            t = o(interfaceC2858s, (this.a & 2) != 0);
        }
        this.i.d(t.n());
        return t;
    }

    private long l(long j) {
        return this.m + ((j * 1000000) / this.d.d);
    }

    private g n(long j, i iVar, long j2) {
        long j3;
        long j4;
        long a = iVar.a();
        if (a == -9223372036854775807L) {
            return null;
        }
        long j5 = iVar.c;
        if (j5 != -1) {
            long j6 = j + j5;
            j3 = j5 - iVar.a.c;
            j4 = j6;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = (j2 - j) - iVar.a.c;
            j4 = j2;
        }
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j4, j + iVar.a.c, C3218f.e(d0.r1(j3, 8000000L, a, roundingMode)), C3218f.e(ax.t7.d.b(j3, iVar.b, roundingMode)), false);
    }

    private g o(InterfaceC2858s interfaceC2858s, boolean z) throws IOException {
        interfaceC2858s.p(this.c.f(), 0, 4);
        this.c.b0(0);
        this.d.a(this.c.v());
        return new a(interfaceC2858s.getLength(), interfaceC2858s.getPosition(), this.d, z);
    }

    private static long p(C c) {
        if (c == null) {
            return -9223372036854775807L;
        }
        int e = c.e();
        for (int i = 0; i < e; i++) {
            C.a d = c.d(i);
            if (d instanceof n) {
                n nVar = (n) d;
                if (nVar.a.equals("TLEN")) {
                    return d0.a1(Long.parseLong(nVar.d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int q(G g, int i) {
        if (g.j() >= i + 4) {
            g.b0(i);
            int v2 = g.v();
            if (v2 == 1483304551 || v2 == 1231971951) {
                return v2;
            }
        }
        if (g.j() < 40) {
            return 0;
        }
        g.b0(36);
        return g.v() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean r(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private static c s(C c, long j) {
        if (c == null) {
            return null;
        }
        int e = c.e();
        for (int i = 0; i < e; i++) {
            C.a d = c.d(i);
            if (d instanceof l) {
                return c.a(j, (l) d, p(c));
            }
        }
        return null;
    }

    private g t(InterfaceC2858s interfaceC2858s) throws IOException {
        int i;
        int i2;
        G g = new G(this.d.c);
        interfaceC2858s.p(g.f(), 0, this.d.c);
        J.a aVar = this.d;
        int i3 = 21;
        if ((aVar.a & 1) != 0) {
            if (aVar.e != 1) {
                i3 = 36;
            }
        } else if (aVar.e == 1) {
            i3 = 13;
        }
        int q = q(g, i3);
        if (q != 1231971951) {
            if (q == 1447187017) {
                h a = h.a(interfaceC2858s.getLength(), interfaceC2858s.getPosition(), this.d, g);
                interfaceC2858s.n(this.d.c);
                return a;
            }
            if (q != 1483304551) {
                interfaceC2858s.m();
                return null;
            }
        }
        i b = i.b(this.d, g);
        if (!this.e.a() && (i = b.d) != -1 && (i2 = b.e) != -1) {
            F f = this.e;
            f.a = i;
            f.b = i2;
        }
        long position = interfaceC2858s.getPosition();
        if (interfaceC2858s.getLength() != -1 && b.c != -1 && interfaceC2858s.getLength() != b.c + position) {
            C0987u.f("Mp3Extractor", "Data size mismatch between stream (" + interfaceC2858s.getLength() + ") and Xing frame (" + (b.c + position) + "), using Xing value.");
        }
        interfaceC2858s.n(this.d.c);
        return q == 1483304551 ? j.a(b, position) : n(position, b, interfaceC2858s.getLength());
    }

    private void u() {
        g gVar = this.r;
        if ((gVar instanceof a) && gVar.i()) {
            long j = this.p;
            if (j == -1 || j == this.r.g()) {
                return;
            }
            this.r = ((a) this.r).d(this.p);
            ((InterfaceC2859t) C0968a.e(this.h)).h(this.r);
            ((U) C0968a.e(this.i)).d(this.r.n());
        }
    }

    private boolean v(InterfaceC2858s interfaceC2858s) throws IOException {
        g gVar = this.r;
        if (gVar != null) {
            long g = gVar.g();
            if (g != -1 && interfaceC2858s.i() > g - 4) {
                return true;
            }
        }
        try {
            return !interfaceC2858s.h(this.c.f(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int w(InterfaceC2858s interfaceC2858s) throws IOException {
        if (this.k == 0) {
            try {
                z(interfaceC2858s, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.r == null) {
            g j = j(interfaceC2858s);
            this.r = j;
            this.h.h(j);
            C0912v.b r0 = new C0912v.b().W("audio/mpeg").y0(this.d.b).o0(4096).T(this.d.e).z0(this.d.d).d0(this.e.a).e0(this.e.b).r0((this.a & 8) != 0 ? null : this.l);
            if (this.r.m() != -2147483647) {
                r0.S(this.r.m());
            }
            this.j.e(r0.P());
            this.o = interfaceC2858s.getPosition();
        } else if (this.o != 0) {
            long position = interfaceC2858s.getPosition();
            long j2 = this.o;
            if (position < j2) {
                interfaceC2858s.n((int) (j2 - position));
            }
        }
        return x(interfaceC2858s);
    }

    private int x(InterfaceC2858s interfaceC2858s) throws IOException {
        if (this.q == 0) {
            interfaceC2858s.m();
            if (v(interfaceC2858s)) {
                return -1;
            }
            this.c.b0(0);
            int v2 = this.c.v();
            if (!r(v2, this.k) || J.j(v2) == -1) {
                interfaceC2858s.n(1);
                this.k = 0;
                return 0;
            }
            this.d.a(v2);
            if (this.m == -9223372036854775807L) {
                this.m = this.r.j(interfaceC2858s.getPosition());
                if (this.b != -9223372036854775807L) {
                    this.m += this.b - this.r.j(0L);
                }
            }
            this.q = this.d.c;
            long position = interfaceC2858s.getPosition();
            J.a aVar = this.d;
            this.p = position + aVar.c;
            g gVar = this.r;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(l(this.n + aVar.g), this.p);
                if (this.t && bVar.a(this.u)) {
                    this.t = false;
                    this.j = this.i;
                }
            }
        }
        int a = this.j.a(interfaceC2858s, this.q, true);
        if (a == -1) {
            return -1;
        }
        int i = this.q - a;
        this.q = i;
        if (i > 0) {
            return 0;
        }
        this.j.f(l(this.n), 1, this.d.c, 0, null);
        this.n += this.d.g;
        this.q = 0;
        return 0;
    }

    private boolean y(g gVar) {
        return (gVar.i() || (this.a & 1) == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r12 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        r11.n(r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
    
        r10.k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
    
        r11.m();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean z(ax.q1.InterfaceC2858s r11, boolean r12) throws java.io.IOException {
        /*
            r10 = this;
            if (r12 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r11.m()
            long r1 = r11.getPosition()
            r3 = 0
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L3d
            int r1 = r10.a
            r1 = r1 & 8
            if (r1 != 0) goto L1e
            r1 = 0
            goto L20
        L1e:
            ax.E1.h$a r1 = ax.J1.f.w
        L20:
            ax.q1.H r2 = r10.f
            ax.P0.C r1 = r2.a(r11, r1)
            r10.l = r1
            if (r1 == 0) goto L2f
            ax.q1.F r2 = r10.e
            r2.c(r1)
        L2f:
            long r1 = r11.i()
            int r2 = (int) r1
            if (r12 != 0) goto L39
            r11.n(r2)
        L39:
            r1 = 0
        L3a:
            r3 = 0
            r4 = 0
            goto L40
        L3d:
            r1 = 0
            r2 = 0
            goto L3a
        L40:
            boolean r6 = r10.v(r11)
            r7 = 1
            if (r6 == 0) goto L53
            if (r3 <= 0) goto L4a
            goto L9e
        L4a:
            r10.u()
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
        L53:
            ax.S0.G r6 = r10.c
            r6.b0(r5)
            ax.S0.G r6 = r10.c
            int r6 = r6.v()
            if (r1 == 0) goto L67
            long r8 = (long) r1
            boolean r8 = r(r6, r8)
            if (r8 == 0) goto L6e
        L67:
            int r8 = ax.q1.J.j(r6)
            r9 = -1
            if (r8 != r9) goto L90
        L6e:
            int r1 = r4 + 1
            if (r4 != r0) goto L7e
            if (r12 == 0) goto L75
            return r5
        L75:
            r10.u()
            java.io.EOFException r11 = new java.io.EOFException
            r11.<init>()
            throw r11
        L7e:
            if (r12 == 0) goto L89
            r11.m()
            int r3 = r2 + r1
            r11.j(r3)
            goto L8c
        L89:
            r11.n(r7)
        L8c:
            r4 = r1
            r1 = 0
            r3 = 0
            goto L40
        L90:
            int r3 = r3 + 1
            if (r3 != r7) goto L9b
            ax.q1.J$a r1 = r10.d
            r1.a(r6)
            r1 = r6
            goto Lab
        L9b:
            r6 = 4
            if (r3 != r6) goto Lab
        L9e:
            if (r12 == 0) goto La5
            int r2 = r2 + r4
            r11.n(r2)
            goto La8
        La5:
            r11.m()
        La8:
            r10.k = r1
            return r7
        Lab:
            int r8 = r8 + (-4)
            r11.j(r8)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.J1.f.z(ax.q1.s, boolean):boolean");
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.h = interfaceC2859t;
        U u = interfaceC2859t.u(0, 1);
        this.i = u;
        this.j = u;
        this.h.o();
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.q = 0;
        this.u = j2;
        g gVar = this.r;
        if (!(gVar instanceof b) || ((b) gVar).a(j2)) {
            return;
        }
        this.t = true;
        this.j = this.g;
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        return z(interfaceC2858s, true);
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        i();
        int w2 = w(interfaceC2858s);
        if (w2 == -1 && (this.r instanceof b)) {
            long l = l(this.n);
            if (this.r.n() != l) {
                ((b) this.r).c(l);
                this.h.h(this.r);
                this.i.d(this.r.n());
            }
        }
        return w2;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    public void m() {
        this.s = true;
    }

    public f(int i) {
        this(i, -9223372036854775807L);
    }

    public f(int i, long j) {
        this.a = (i & 2) != 0 ? i | 1 : i;
        this.b = j;
        this.c = new G(10);
        this.d = new J.a();
        this.e = new F();
        this.m = -9223372036854775807L;
        this.f = new H();
        C2855o c2855o = new C2855o();
        this.g = c2855o;
        this.j = c2855o;
        this.p = -1L;
    }

    @Override // ax.q1.r
    public void d() {
    }
}
