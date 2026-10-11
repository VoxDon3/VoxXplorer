package ax.i1;

import ax.P0.N;
import ax.S0.C0968a;
import ax.i1.InterfaceC2209F;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: ax.i1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2216f extends s0 {
    private final long m;
    private final long n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final ArrayList<C2215e> s;
    private final N.c t;
    private c u;
    private d v;
    private long w;
    private long x;

    /* renamed from: ax.i1.f$b */
    public static final class b {
        private final InterfaceC2209F a;
        private long b;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean d = true;
        private long c = Long.MIN_VALUE;

        public b(InterfaceC2209F interfaceC2209F) {
            this.a = (InterfaceC2209F) C0968a.e(interfaceC2209F);
        }

        public C2216f h() {
            this.h = true;
            return new C2216f(this);
        }

        public b i(boolean z) {
            C0968a.g(!this.h);
            this.e = z;
            return this;
        }

        public b j(boolean z) {
            C0968a.g(!this.h);
            this.g = z;
            return this;
        }

        public b k(boolean z) {
            C0968a.g(!this.h);
            this.d = z;
            return this;
        }

        public b l(long j) {
            C0968a.g(!this.h);
            this.c = j;
            return this;
        }

        public b m(boolean z) {
            C0968a.g(!this.h);
            this.f = z;
            return this;
        }

        public b n(long j) {
            C0968a.a(j >= 0);
            C0968a.g(!this.h);
            this.b = j;
            return this;
        }
    }

    /* renamed from: ax.i1.f$c */
    private static final class c extends AbstractC2232w {
        private final long f;
        private final long g;
        private final long h;
        private final boolean i;

        public c(ax.P0.N n, long j, long j2, boolean z) throws d {
            super(n);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new d(2, j, j2);
            }
            boolean z2 = false;
            if (n.i() != 1) {
                throw new d(0);
            }
            N.c n2 = n.n(0, new N.c());
            long max = Math.max(0L, j);
            if (!z && !n2.k && max != 0 && !n2.h) {
                throw new d(1);
            }
            long max2 = j2 == Long.MIN_VALUE ? n2.m : Math.max(0L, j2);
            long j3 = n2.m;
            if (j3 != -9223372036854775807L) {
                max2 = max2 > j3 ? j3 : max2;
                if (max > max2) {
                    max = max2;
                }
            }
            this.f = max;
            this.g = max2;
            this.h = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (n2.i && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
                z2 = true;
            }
            this.i = z2;
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public N.b g(int i, N.b bVar, boolean z) {
            this.e.g(0, bVar, z);
            long o = bVar.o() - this.f;
            long j = this.h;
            return bVar.t(bVar.a, bVar.b, 0, j != -9223372036854775807L ? j - o : -9223372036854775807L, o);
        }

        @Override // ax.i1.AbstractC2232w, ax.P0.N
        public N.c o(int i, N.c cVar, long j) {
            this.e.o(0, cVar, 0L);
            long j2 = cVar.p;
            long j3 = this.f;
            cVar.p = j2 + j3;
            cVar.m = this.h;
            cVar.i = this.i;
            long j4 = cVar.l;
            if (j4 != -9223372036854775807L) {
                long max = Math.max(j4, j3);
                cVar.l = max;
                long j5 = this.g;
                if (j5 != -9223372036854775807L) {
                    max = Math.min(max, j5);
                }
                cVar.l = max - this.f;
            }
            long E1 = ax.S0.d0.E1(this.f);
            long j6 = cVar.e;
            if (j6 != -9223372036854775807L) {
                cVar.e = j6 + E1;
            }
            long j7 = cVar.f;
            if (j7 != -9223372036854775807L) {
                cVar.f = j7 + E1;
            }
            return cVar;
        }
    }

    /* renamed from: ax.i1.f$d */
    public static final class d extends IOException {
        public final int q;

        public d(int i) {
            this(i, -9223372036854775807L, -9223372036854775807L);
        }

        private static String a(int i, long j, long j2) {
            if (i == 0) {
                return "invalid period count";
            }
            if (i == 1) {
                return "not seekable to start";
            }
            if (i != 2) {
                return "unknown";
            }
            C0968a.g((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j + ", End time: " + j2;
        }

        public d(int i, long j, long j2) {
            super("Illegal clipping: " + a(i, j, j2));
            this.q = i;
        }
    }

    private void T(ax.P0.N n) {
        long j;
        n.n(0, this.t);
        long e = this.t.e();
        if (this.u == null || this.s.isEmpty() || this.p) {
            j = this.m;
            long j2 = this.n;
            if (this.q) {
                long c2 = this.t.c();
                j += c2;
                j2 += c2;
            }
            this.w = e + j;
            this.x = this.n != Long.MIN_VALUE ? e + j2 : Long.MIN_VALUE;
            int size = this.s.size();
            for (int i = 0; i < size; i++) {
                this.s.get(i).x(this.w, this.x);
            }
            r6 = j2;
        } else {
            j = this.w - e;
            if (this.n != Long.MIN_VALUE) {
                r6 = this.x - e;
            }
        }
        try {
            c cVar = new c(n, j, r6, this.r);
            this.u = cVar;
            B(cVar);
        } catch (d e2) {
            this.v = e2;
            for (int i2 = 0; i2 < this.s.size(); i2++) {
                this.s.get(i2).u(this.v);
            }
        }
    }

    @Override // ax.i1.AbstractC2218h, ax.i1.AbstractC2211a
    protected void C() {
        super.C();
        this.v = null;
        this.u = null;
    }

    @Override // ax.i1.s0
    protected void P(ax.P0.N n) {
        if (this.v != null) {
            return;
        }
        T(n);
    }

    @Override // ax.i1.InterfaceC2209F
    public void e(InterfaceC2206C interfaceC2206C) {
        C0968a.g(this.s.remove(interfaceC2206C));
        this.k.e(((C2215e) interfaceC2206C).q);
        if (!this.s.isEmpty() || this.p) {
            return;
        }
        T(((c) C0968a.e(this.u)).e);
    }

    @Override // ax.i1.InterfaceC2209F
    public InterfaceC2206C i(InterfaceC2209F.b bVar, ax.m1.b bVar2, long j) {
        C2215e c2215e = new C2215e(this.k.i(bVar, bVar2, j), this.o, this.w, this.x);
        this.s.add(c2215e);
        return c2215e;
    }

    @Override // ax.i1.AbstractC2218h, ax.i1.InterfaceC2209F
    public void k() throws IOException {
        d dVar = this.v;
        if (dVar != null) {
            throw dVar;
        }
        super.k();
    }

    private C2216f(b bVar) {
        super(bVar.a);
        this.m = bVar.b;
        this.n = bVar.c;
        this.o = bVar.d;
        this.p = bVar.e;
        this.q = bVar.f;
        this.r = bVar.g;
        this.s = new ArrayList<>();
        this.t = new N.c();
    }
}
