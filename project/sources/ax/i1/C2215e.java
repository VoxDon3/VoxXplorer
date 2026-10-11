package ax.i1;

import androidx.media3.exoplayer.C0618p0;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.i1.C2216f;
import ax.i1.InterfaceC2206C;
import ax.l1.InterfaceC2445D;
import java.io.IOException;

/* renamed from: ax.i1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2215e implements InterfaceC2206C, InterfaceC2206C.a {
    private InterfaceC2206C.a c0;
    private a[] d0 = new a[0];
    private long e0;
    long f0;
    long g0;
    private C2216f.d h0;
    public final InterfaceC2206C q;

    /* renamed from: ax.i1.e$a */
    private final class a implements e0 {
        public final e0 a;
        private boolean b;

        public a(e0 e0Var) {
            this.a = e0Var;
        }

        @Override // ax.i1.e0
        public int a(ax.Y0.O o, ax.V0.i iVar, int i) {
            if (C2215e.this.p()) {
                return -3;
            }
            if (this.b) {
                iVar.A(4);
                return -4;
            }
            long d = C2215e.this.d();
            int a = this.a.a(o, iVar, i);
            if (a == -5) {
                C0912v c0912v = (C0912v) C0968a.e(o.b);
                int i2 = c0912v.J;
                if (i2 != 0 || c0912v.K != 0) {
                    C2215e c2215e = C2215e.this;
                    if (c2215e.f0 != 0) {
                        i2 = 0;
                    }
                    o.b = c0912v.b().d0(i2).e0(c2215e.g0 == Long.MIN_VALUE ? c0912v.K : 0).P();
                }
                return -5;
            }
            long j = C2215e.this.g0;
            if (j == Long.MIN_VALUE || ((a != -4 || iVar.g0 < j) && !(a == -3 && d == Long.MIN_VALUE && !iVar.f0))) {
                return a;
            }
            iVar.p();
            iVar.A(4);
            this.b = true;
            return -4;
        }

        @Override // ax.i1.e0
        public void b() throws IOException {
            this.a.b();
        }

        @Override // ax.i1.e0
        public int c(long j) {
            if (C2215e.this.p()) {
                return -3;
            }
            return this.a.c(j);
        }

        public void d() {
            this.b = false;
        }

        @Override // ax.i1.e0
        public boolean isReady() {
            return !C2215e.this.p() && this.a.isReady();
        }
    }

    public C2215e(InterfaceC2206C interfaceC2206C, boolean z, long j, long j2) {
        this.q = interfaceC2206C;
        this.e0 = z ? j : -9223372036854775807L;
        this.f0 = j;
        this.g0 = j2;
    }

    private ax.Y0.Z j(long j, ax.Y0.Z z) {
        long q = ax.S0.d0.q(z.a, 0L, j - this.f0);
        long j2 = z.b;
        long j3 = this.g0;
        long q2 = ax.S0.d0.q(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (q == z.a && q2 == z.b) ? z : new ax.Y0.Z(q, q2);
    }

    private static long o(long j, long j2, long j3) {
        long max = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    private static boolean w(long j, long j2, InterfaceC2445D[] interfaceC2445DArr) {
        if (j < j2) {
            return true;
        }
        if (j != 0) {
            for (InterfaceC2445D interfaceC2445D : interfaceC2445DArr) {
                if (interfaceC2445D != null) {
                    C0912v m = interfaceC2445D.m();
                    if (!ax.P0.D.a(m.o, m.k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        return this.q.a(c0618p0);
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long b() {
        long b = this.q.b();
        if (b != Long.MIN_VALUE) {
            long j = this.g0;
            if (j == Long.MIN_VALUE || b < j) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean c() {
        return this.q.c();
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long d() {
        long d = this.q.d();
        if (d != Long.MIN_VALUE) {
            long j = this.g0;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public void e(long j) {
        this.q.e(j);
    }

    @Override // ax.i1.InterfaceC2206C.a
    public void f(InterfaceC2206C interfaceC2206C) {
        if (this.h0 != null) {
            return;
        }
        ((InterfaceC2206C.a) C0968a.e(this.c0)).f(this);
    }

    @Override // ax.i1.InterfaceC2206C
    public long g(InterfaceC2445D[] interfaceC2445DArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j) {
        this.d0 = new a[e0VarArr.length];
        e0[] e0VarArr2 = new e0[e0VarArr.length];
        int i = 0;
        while (true) {
            e0 e0Var = null;
            if (i >= e0VarArr.length) {
                break;
            }
            a[] aVarArr = this.d0;
            a aVar = (a) e0VarArr[i];
            aVarArr[i] = aVar;
            if (aVar != null) {
                e0Var = aVar.a;
            }
            e0VarArr2[i] = e0Var;
            i++;
        }
        long g = this.q.g(interfaceC2445DArr, zArr, e0VarArr2, zArr2, j);
        long o = o(g, j, this.g0);
        this.e0 = (p() && w(g, j, interfaceC2445DArr)) ? o : -9223372036854775807L;
        for (int i2 = 0; i2 < e0VarArr.length; i2++) {
            e0 e0Var2 = e0VarArr2[i2];
            if (e0Var2 == null) {
                this.d0[i2] = null;
            } else {
                a[] aVarArr2 = this.d0;
                a aVar2 = aVarArr2[i2];
                if (aVar2 == null || aVar2.a != e0Var2) {
                    aVarArr2[i2] = new a(e0Var2);
                }
            }
            e0VarArr[i2] = this.d0[i2];
        }
        return o;
    }

    @Override // ax.i1.InterfaceC2206C
    public void l() throws IOException {
        C2216f.d dVar = this.h0;
        if (dVar != null) {
            throw dVar;
        }
        this.q.l();
    }

    @Override // ax.i1.InterfaceC2206C
    public long m(long j) {
        this.e0 = -9223372036854775807L;
        for (a aVar : this.d0) {
            if (aVar != null) {
                aVar.d();
            }
        }
        return o(this.q.m(j), this.f0, this.g0);
    }

    @Override // ax.i1.InterfaceC2206C
    public void n(InterfaceC2206C.a aVar, long j) {
        this.c0 = aVar;
        this.q.n(this, j);
    }

    boolean p() {
        return this.e0 != -9223372036854775807L;
    }

    @Override // ax.i1.InterfaceC2206C
    public long q(long j, ax.Y0.Z z) {
        long j2 = this.f0;
        if (j == j2) {
            return j2;
        }
        return this.q.q(j, j(j, z));
    }

    @Override // ax.i1.f0.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void i(InterfaceC2206C interfaceC2206C) {
        ((InterfaceC2206C.a) C0968a.e(this.c0)).i(this);
    }

    @Override // ax.i1.InterfaceC2206C
    public long s() {
        if (p()) {
            long j = this.e0;
            this.e0 = -9223372036854775807L;
            long s = s();
            return s != -9223372036854775807L ? s : j;
        }
        long s2 = this.q.s();
        if (s2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o(s2, this.f0, this.g0);
    }

    @Override // ax.i1.InterfaceC2206C
    public q0 t() {
        return this.q.t();
    }

    public void u(C2216f.d dVar) {
        this.h0 = dVar;
    }

    @Override // ax.i1.InterfaceC2206C
    public void v(long j, boolean z) {
        this.q.v(j, z);
    }

    public void x(long j, long j2) {
        this.f0 = j;
        this.g0 = j2;
    }
}
