package ax.i1;

import ax.P0.C0893b;
import ax.P0.C0915y;
import ax.P0.N;
import ax.i1.InterfaceC2209F;
import j$.util.Objects;

/* renamed from: ax.i1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2204A extends s0 {
    private final boolean m;
    private final N.c n;
    private final N.b o;
    private a p;
    private C2235z q;
    private boolean r;
    private boolean s;
    private boolean t;

    /* renamed from: ax.i1.A$a */
    private static final class a extends AbstractC2232w {
        public static final Object h = new Object();
        private final Object f;
        private final Object g;

        private a(ax.P0.N n, Object obj, Object obj2) {
            super(n);
            this.f = obj;
            this.g = obj2;
        }

        public static a u(C0915y c0915y) {
            return new a(new b(c0915y), N.c.q, h);
        }

        public static a v(ax.P0.N n, Object obj, Object obj2) {
            return new a(n, obj, obj2);
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public int b(Object obj) {
            Object obj2;
            ax.P0.N n = this.e;
            if (h.equals(obj) && (obj2 = this.g) != null) {
                obj = obj2;
            }
            return n.b(obj);
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public N.b g(int i, N.b bVar, boolean z) {
            this.e.g(i, bVar, z);
            if (Objects.equals(bVar.b, this.g) && z) {
                bVar.b = h;
            }
            return bVar;
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public Object m(int i) {
            Object m = this.e.m(i);
            return Objects.equals(m, this.g) ? h : m;
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public N.c o(int i, N.c cVar, long j) {
            this.e.o(i, cVar, j);
            if (Objects.equals(cVar.a, this.f)) {
                cVar.a = N.c.q;
            }
            return cVar;
        }

        public a t(ax.P0.N n) {
            return new a(n, this.f, this.g);
        }
    }

    /* renamed from: ax.i1.A$b */
    public static final class b extends ax.P0.N {
        private final C0915y e;

        public b(C0915y c0915y) {
            this.e = c0915y;
        }

        @Override // ax.P0.N
        public int b(Object obj) {
            return obj == a.h ? 0 : -1;
        }

        @Override // ax.P0.N
        public N.b g(int i, N.b bVar, boolean z) {
            bVar.u(z ? 0 : null, z ? a.h : null, 0, -9223372036854775807L, 0L, C0893b.g, true);
            return bVar;
        }

        @Override // ax.P0.N
        public int i() {
            return 1;
        }

        @Override // ax.P0.N
        public Object m(int i) {
            return a.h;
        }

        @Override // ax.P0.N
        public N.c o(int i, N.c cVar, long j) {
            cVar.g(N.c.q, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.k = true;
            return cVar;
        }

        @Override // ax.P0.N
        public int p() {
            return 1;
        }
    }

    public C2204A(InterfaceC2209F interfaceC2209F, boolean z) {
        super(interfaceC2209F);
        this.m = z && interfaceC2209F.m();
        this.n = new N.c();
        this.o = new N.b();
        ax.P0.N o = interfaceC2209F.o();
        if (o == null) {
            this.p = a.u(interfaceC2209F.j());
        } else {
            this.p = a.v(o, null, null);
            this.t = true;
        }
    }

    private Object U(Object obj) {
        return (this.p.g == null || !this.p.g.equals(obj)) ? obj : a.h;
    }

    private Object V(Object obj) {
        return (this.p.g == null || !obj.equals(a.h)) ? obj : this.p.g;
    }

    private boolean X(long j) {
        C2235z c2235z = this.q;
        int b2 = this.p.b(c2235z.q.a);
        if (b2 == -1) {
            return false;
        }
        long j2 = this.p.f(b2, this.o).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c2235z.w(j);
        return true;
    }

    @Override // ax.i1.AbstractC2218h, ax.i1.AbstractC2211a
    public void C() {
        this.s = false;
        this.r = false;
        super.C();
    }

    @Override // ax.i1.s0
    protected InterfaceC2209F.b J(InterfaceC2209F.b bVar) {
        return bVar.a(U(bVar.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    @Override // ax.i1.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void P(ax.P0.N r15) {
        /*
            r14 = this;
            boolean r0 = r14.s
            if (r0 == 0) goto L19
            ax.i1.A$a r0 = r14.p
            ax.i1.A$a r15 = r0.t(r15)
            r14.p = r15
            ax.i1.z r15 = r14.q
            if (r15 == 0) goto Lb1
            long r0 = r15.o()
            r14.X(r0)
            goto Lb1
        L19:
            boolean r0 = r15.q()
            if (r0 == 0) goto L36
            boolean r0 = r14.t
            if (r0 == 0) goto L2a
            ax.i1.A$a r0 = r14.p
            ax.i1.A$a r15 = r0.t(r15)
            goto L32
        L2a:
            java.lang.Object r0 = ax.P0.N.c.q
            java.lang.Object r1 = ax.i1.C2204A.a.h
            ax.i1.A$a r15 = ax.i1.C2204A.a.v(r15, r0, r1)
        L32:
            r14.p = r15
            goto Lb1
        L36:
            ax.P0.N$c r0 = r14.n
            r1 = 0
            r15.n(r1, r0)
            ax.P0.N$c r0 = r14.n
            long r2 = r0.c()
            ax.P0.N$c r0 = r14.n
            java.lang.Object r0 = r0.a
            ax.i1.z r4 = r14.q
            if (r4 == 0) goto L74
            long r4 = r4.p()
            ax.i1.A$a r6 = r14.p
            ax.i1.z r7 = r14.q
            ax.i1.F$b r7 = r7.q
            java.lang.Object r7 = r7.a
            ax.P0.N$b r8 = r14.o
            r6.h(r7, r8)
            ax.P0.N$b r6 = r14.o
            long r6 = r6.o()
            long r6 = r6 + r4
            ax.i1.A$a r4 = r14.p
            ax.P0.N$c r5 = r14.n
            ax.P0.N$c r1 = r4.n(r1, r5)
            long r4 = r1.c()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            ax.P0.N$c r9 = r14.n
            ax.P0.N$b r10 = r14.o
            r11 = 0
            r8 = r15
            android.util.Pair r15 = r8.j(r9, r10, r11, r12)
            java.lang.Object r1 = r15.first
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r2 = r15.longValue()
            boolean r15 = r14.t
            if (r15 == 0) goto L94
            ax.i1.A$a r15 = r14.p
            ax.i1.A$a r15 = r15.t(r8)
            goto L98
        L94:
            ax.i1.A$a r15 = ax.i1.C2204A.a.v(r8, r0, r1)
        L98:
            r14.p = r15
            ax.i1.z r15 = r14.q
            if (r15 == 0) goto Lb1
            boolean r0 = r14.X(r2)
            if (r0 == 0) goto Lb1
            ax.i1.F$b r15 = r15.q
            java.lang.Object r0 = r15.a
            java.lang.Object r0 = r14.V(r0)
            ax.i1.F$b r15 = r15.a(r0)
            goto Lb2
        Lb1:
            r15 = 0
        Lb2:
            r0 = 1
            r14.t = r0
            r14.s = r0
            ax.i1.A$a r0 = r14.p
            r14.B(r0)
            if (r15 == 0) goto Lc9
            ax.i1.z r0 = r14.q
            java.lang.Object r0 = ax.S0.C0968a.e(r0)
            ax.i1.z r0 = (ax.i1.C2235z) r0
            r0.j(r15)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.i1.C2204A.P(ax.P0.N):void");
    }

    @Override // ax.i1.s0
    public void S() {
        if (this.m) {
            return;
        }
        this.r = true;
        R();
    }

    @Override // ax.i1.InterfaceC2209F
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public C2235z i(InterfaceC2209F.b bVar, ax.m1.b bVar2, long j) {
        C2235z c2235z = new C2235z(bVar, bVar2, j);
        c2235z.y(this.k);
        if (this.s) {
            c2235z.j(bVar.a(V(bVar.a)));
            return c2235z;
        }
        this.q = c2235z;
        if (!this.r) {
            this.r = true;
            R();
        }
        return c2235z;
    }

    public ax.P0.N W() {
        return this.p;
    }

    @Override // ax.i1.s0, ax.i1.AbstractC2211a, ax.i1.InterfaceC2209F
    public void a(C0915y c0915y) {
        if (this.t) {
            this.p = this.p.t(new m0(this.p.e, c0915y));
        } else {
            this.p = a.u(c0915y);
        }
        this.k.a(c0915y);
    }

    @Override // ax.i1.InterfaceC2209F
    public void e(InterfaceC2206C interfaceC2206C) {
        ((C2235z) interfaceC2206C).x();
        if (interfaceC2206C == this.q) {
            this.q = null;
        }
    }
}
