package ax.i1;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.C0618p0;
import ax.P0.C0912v;
import ax.P0.InterfaceC0902k;
import ax.S0.C0968a;
import ax.S0.C0978k;
import ax.S0.C0987u;
import ax.U0.k;
import ax.b1.InterfaceC1471u;
import ax.i1.C2233x;
import ax.i1.InterfaceC2206C;
import ax.i1.N;
import ax.i1.d0;
import ax.l1.InterfaceC2445D;
import ax.m1.m;
import ax.m1.o;
import ax.n1.InterfaceExecutorC2572c;
import ax.q1.C2855o;
import ax.q1.InterfaceC2859t;
import ax.q1.N;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class Y implements InterfaceC2206C, InterfaceC2859t, o.b<b>, o.f, d0.d {
    private static final Map<String, String> S0 = N();
    private static final C0912v T0 = new C0912v.b().j0("icy").y0("application/x-icy").P();
    private boolean A0;
    private boolean B0;
    private f C0;
    private ax.q1.N D0;
    private long E0;
    private boolean F0;
    private int G0;
    private boolean H0;
    private boolean I0;
    private boolean J0;
    private int K0;
    private boolean L0;
    private long M0;
    private long N0;
    private boolean O0;
    private int P0;
    private boolean Q0;
    private boolean R0;
    private final ax.U0.g c0;
    private final ax.b1.w d0;
    private final ax.m1.m e0;
    private final N.a f0;
    private final InterfaceC1471u.a g0;
    private final c h0;
    private final ax.m1.b i0;
    private final String j0;
    private final long k0;
    private final int l0;
    private final C0912v m0;
    private final long n0;
    private final ax.m1.o o0;
    private final T p0;
    private final Uri q;
    private final C0978k q0;
    private final Runnable r0;
    private final Runnable s0;
    private final Handler t0;
    private InterfaceC2206C.a u0;
    private ax.D1.b v0;
    private d0[] w0;
    private e[] x0;
    private boolean y0;
    private boolean z0;

    class a extends ax.q1.D {
        a(ax.q1.N n) {
            super(n);
        }

        @Override // ax.q1.D, ax.q1.N
        public long n() {
            return Y.this.E0;
        }
    }

    final class b implements o.e, C2233x.a {
        private final Uri b;
        private final ax.U0.y c;
        private final T d;
        private final InterfaceC2859t e;
        private final C0978k f;
        private volatile boolean h;
        private long j;
        private ax.q1.U l;
        private boolean m;
        private final ax.q1.M g = new ax.q1.M();
        private boolean i = true;
        private final long a = C2234y.a();
        private ax.U0.k k = i(0);

        public b(Uri uri, ax.U0.g gVar, T t, InterfaceC2859t interfaceC2859t, C0978k c0978k) {
            this.b = uri;
            this.c = new ax.U0.y(gVar);
            this.d = t;
            this.e = interfaceC2859t;
            this.f = c0978k;
        }

        private ax.U0.k i(long j) {
            return new k.b().i(this.b).h(j).f(Y.this.j0).b(6).e(Y.S0).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j, long j2) {
            this.g.a = j;
            this.j = j2;
            this.i = true;
            this.m = false;
        }

        @Override // ax.m1.o.e
        public void a() throws IOException {
            int i = 0;
            while (i == 0 && !this.h) {
                try {
                    long j = this.g.a;
                    ax.U0.k i2 = i(j);
                    this.k = i2;
                    long f = this.c.f(i2);
                    if (this.h) {
                        if (i != 1 && this.d.e() != -1) {
                            this.g.a = this.d.e();
                        }
                        ax.U0.j.a(this.c);
                        return;
                    }
                    if (f != -1) {
                        f += j;
                        Y.this.Y();
                    }
                    long j2 = f;
                    Y.this.v0 = ax.D1.b.d(this.c.l());
                    InterfaceC0902k interfaceC0902k = this.c;
                    if (Y.this.v0 != null && Y.this.v0.f != -1) {
                        interfaceC0902k = new C2233x(this.c, Y.this.v0.f, this);
                        ax.q1.U Q = Y.this.Q();
                        this.l = Q;
                        Q.e(Y.T0);
                    }
                    this.d.g(interfaceC0902k, this.b, this.c.l(), j, j2, this.e);
                    if (Y.this.v0 != null) {
                        this.d.f();
                    }
                    if (this.i) {
                        this.d.b(j, this.j);
                        this.i = false;
                    }
                    while (i == 0 && !this.h) {
                        try {
                            this.f.a();
                            i = this.d.c(this.g);
                            long e = this.d.e();
                            if (e > Y.this.k0 + j) {
                                this.f.d();
                                Y.this.t0.post(Y.this.s0);
                                j = e;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.d.e() != -1) {
                        this.g.a = this.d.e();
                    }
                    ax.U0.j.a(this.c);
                } catch (Throwable th) {
                    if (i != 1 && this.d.e() != -1) {
                        this.g.a = this.d.e();
                    }
                    ax.U0.j.a(this.c);
                    throw th;
                }
            }
        }

        @Override // ax.i1.C2233x.a
        public void b(ax.S0.G g) {
            long max = !this.m ? this.j : Math.max(Y.this.P(true), this.j);
            int a = g.a();
            ax.q1.U u = (ax.q1.U) C0968a.e(this.l);
            u.g(g, a);
            u.f(max, 1, a, 0, null);
            this.m = true;
        }

        @Override // ax.m1.o.e
        public void c() {
            this.h = true;
        }
    }

    interface c {
        void h(long j, ax.q1.N n, boolean z);
    }

    private final class d implements e0 {
        private final int a;

        public d(int i) {
            this.a = i;
        }

        @Override // ax.i1.e0
        public int a(ax.Y0.O o, ax.V0.i iVar, int i) {
            return Y.this.e0(this.a, o, iVar, i);
        }

        @Override // ax.i1.e0
        public void b() throws IOException {
            Y.this.X(this.a);
        }

        @Override // ax.i1.e0
        public int c(long j) {
            return Y.this.i0(this.a, j);
        }

        @Override // ax.i1.e0
        public boolean isReady() {
            return Y.this.S(this.a);
        }
    }

    private static final class e {
        public final int a;
        public final boolean b;

        public e(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.a == eVar.a && this.b == eVar.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    private static final class f {
        public final q0 a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public f(q0 q0Var, boolean[] zArr) {
            this.a = q0Var;
            this.b = zArr;
            int i = q0Var.a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    public Y(Uri uri, ax.U0.g gVar, T t, ax.b1.w wVar, InterfaceC1471u.a aVar, ax.m1.m mVar, N.a aVar2, c cVar, ax.m1.b bVar, String str, int i, int i2, C0912v c0912v, long j, InterfaceExecutorC2572c interfaceExecutorC2572c) {
        this.q = uri;
        this.c0 = gVar;
        this.d0 = wVar;
        this.g0 = aVar;
        this.e0 = mVar;
        this.f0 = aVar2;
        this.h0 = cVar;
        this.i0 = bVar;
        this.j0 = str;
        this.k0 = i;
        this.l0 = i2;
        this.m0 = c0912v;
        this.o0 = interfaceExecutorC2572c != null ? new ax.m1.o(interfaceExecutorC2572c) : new ax.m1.o("ProgressiveMediaPeriod");
        this.p0 = t;
        this.n0 = j;
        this.q0 = new C0978k();
        this.r0 = new Runnable() { // from class: ax.i1.U
            @Override // java.lang.Runnable
            public final void run() {
                Y.this.T();
            }
        };
        this.s0 = new Runnable() { // from class: ax.i1.V
            @Override // java.lang.Runnable
            public final void run() {
                Y.y(Y.this);
            }
        };
        this.t0 = ax.S0.d0.A();
        this.x0 = new e[0];
        this.w0 = new d0[0];
        this.N0 = -9223372036854775807L;
        this.G0 = 1;
    }

    private void L() {
        C0968a.g(this.z0);
        C0968a.e(this.C0);
        C0968a.e(this.D0);
    }

    private boolean M(b bVar, int i) {
        ax.q1.N n;
        if (this.L0 || !((n = this.D0) == null || n.n() == -9223372036854775807L)) {
            this.P0 = i;
            return true;
        }
        if (this.z0 && !k0()) {
            this.O0 = true;
            return false;
        }
        this.I0 = this.z0;
        this.M0 = 0L;
        this.P0 = 0;
        for (d0 d0Var : this.w0) {
            d0Var.S();
        }
        bVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> N() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    private int O() {
        int i = 0;
        for (d0 d0Var : this.w0) {
            i += d0Var.E();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P(boolean z) {
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.w0.length; i++) {
            if (z || ((f) C0968a.e(this.C0)).c[i]) {
                j = Math.max(j, this.w0[i].x());
            }
        }
        return j;
    }

    private boolean R() {
        return this.N0 != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.R0 || this.z0 || !this.y0 || this.D0 == null) {
            return;
        }
        for (d0 d0Var : this.w0) {
            if (d0Var.D() == null) {
                return;
            }
        }
        this.q0.d();
        int length = this.w0.length;
        ax.P0.P[] pArr = new ax.P0.P[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            C0912v c0912v = (C0912v) C0968a.e(this.w0[i].D());
            String str = c0912v.o;
            boolean o = ax.P0.D.o(str);
            boolean z = o || ax.P0.D.s(str);
            zArr[i] = z;
            this.A0 = z | this.A0;
            this.B0 = this.n0 != -9223372036854775807L && length == 1 && ax.P0.D.q(str);
            ax.D1.b bVar = this.v0;
            if (bVar != null) {
                if (o || this.x0[i].b) {
                    ax.P0.C c2 = c0912v.l;
                    c0912v = c0912v.b().r0(c2 == null ? new ax.P0.C(bVar) : c2.a(bVar)).P();
                }
                if (o && c0912v.h == -1 && c0912v.i == -1 && bVar.a != -1) {
                    c0912v = c0912v.b().S(bVar.a).P();
                }
            }
            C0912v c3 = c0912v.c(this.d0.a(c0912v));
            pArr[i] = new ax.P0.P(Integer.toString(i), c3);
            this.J0 = c3.u | this.J0;
        }
        this.C0 = new f(new q0(pArr), zArr);
        if (this.B0 && this.E0 == -9223372036854775807L) {
            this.E0 = this.n0;
            this.D0 = new a(this.D0);
        }
        this.h0.h(this.E0, this.D0, this.F0);
        this.z0 = true;
        ((InterfaceC2206C.a) C0968a.e(this.u0)).f(this);
    }

    private void U(int i) {
        L();
        f fVar = this.C0;
        boolean[] zArr = fVar.d;
        if (zArr[i]) {
            return;
        }
        C0912v b2 = fVar.a.c(i).b(0);
        this.f0.j(ax.P0.D.k(b2.o), b2, 0, null, this.M0);
        zArr[i] = true;
    }

    private void V(int i) {
        L();
        if (this.O0) {
            if (!this.A0 || this.C0.b[i]) {
                if (this.w0[i].I(false)) {
                    return;
                }
                this.N0 = 0L;
                this.O0 = false;
                this.I0 = true;
                this.M0 = 0L;
                this.P0 = 0;
                for (d0 d0Var : this.w0) {
                    d0Var.S();
                }
                ((InterfaceC2206C.a) C0968a.e(this.u0)).i(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        this.t0.post(new Runnable() { // from class: ax.i1.W
            @Override // java.lang.Runnable
            public final void run() {
                Y.this.L0 = true;
            }
        });
    }

    private ax.q1.U d0(e eVar) {
        int length = this.w0.length;
        for (int i = 0; i < length; i++) {
            if (eVar.equals(this.x0[i])) {
                return this.w0[i];
            }
        }
        if (this.y0) {
            C0987u.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.a + ") after finishing tracks.");
            return new C2855o();
        }
        d0 l = d0.l(this.i0, this.d0, this.g0);
        l.a0(this);
        int i2 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.x0, i2);
        eVarArr[length] = eVar;
        this.x0 = (e[]) ax.S0.d0.j(eVarArr);
        d0[] d0VarArr = (d0[]) Arrays.copyOf(this.w0, i2);
        d0VarArr[length] = l;
        this.w0 = (d0[]) ax.S0.d0.j(d0VarArr);
        return l;
    }

    private boolean g0(boolean[] zArr, long j, boolean z) {
        int length = this.w0.length;
        for (int i = 0; i < length; i++) {
            d0 d0Var = this.w0[i];
            if (d0Var.A() != 0 || !z) {
                if (!(this.B0 ? d0Var.V(d0Var.w()) : d0Var.W(j, this.Q0)) && (zArr[i] || !this.A0)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(ax.q1.N n) {
        this.D0 = this.v0 == null ? n : new N.b(-9223372036854775807L);
        this.E0 = n.n();
        boolean z = !this.L0 && n.n() == -9223372036854775807L;
        this.F0 = z;
        this.G0 = z ? 7 : 1;
        if (this.z0) {
            this.h0.h(this.E0, n, z);
        } else {
            T();
        }
    }

    private void j0() {
        b bVar = new b(this.q, this.c0, this.p0, this, this.q0);
        if (this.z0) {
            C0968a.g(R());
            long j = this.E0;
            if (j != -9223372036854775807L && this.N0 > j) {
                this.Q0 = true;
                this.N0 = -9223372036854775807L;
                return;
            }
            bVar.j(((ax.q1.N) C0968a.e(this.D0)).l(this.N0).a.b, this.N0);
            for (d0 d0Var : this.w0) {
                d0Var.Y(this.N0);
            }
            this.N0 = -9223372036854775807L;
        }
        this.P0 = O();
        this.o0.n(bVar, this, this.e0.c(this.G0));
    }

    private boolean k0() {
        return this.I0 || R();
    }

    public static /* synthetic */ void y(Y y) {
        if (y.R0) {
            return;
        }
        ((InterfaceC2206C.a) C0968a.e(y.u0)).i(y);
    }

    ax.q1.U Q() {
        return d0(new e(0, true));
    }

    boolean S(int i) {
        return !k0() && this.w0[i].I(this.Q0);
    }

    void W() throws IOException {
        this.o0.k(this.e0.c(this.G0));
    }

    void X(int i) throws IOException {
        this.w0[i].K();
        W();
    }

    @Override // ax.m1.o.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void p(b bVar, long j, long j2, boolean z) {
        ax.U0.y yVar = bVar.c;
        C2234y c2234y = new C2234y(bVar.a, bVar.k, yVar.r(), yVar.s(), j, j2, yVar.q());
        this.e0.a(bVar.a);
        this.f0.m(c2234y, 1, -1, null, 0, null, bVar.j, this.E0);
        if (z) {
            return;
        }
        for (d0 d0Var : this.w0) {
            d0Var.S();
        }
        if (this.K0 > 0) {
            ((InterfaceC2206C.a) C0968a.e(this.u0)).i(this);
        }
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean a(C0618p0 c0618p0) {
        if (this.Q0 || this.o0.h() || this.O0) {
            return false;
        }
        if ((this.z0 || this.m0 != null) && this.K0 == 0) {
            return false;
        }
        boolean f2 = this.q0.f();
        if (this.o0.i()) {
            return f2;
        }
        j0();
        return true;
    }

    @Override // ax.m1.o.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void r(b bVar, long j, long j2) {
        if (this.E0 == -9223372036854775807L && this.D0 != null) {
            long P = P(true);
            long j3 = P == Long.MIN_VALUE ? 0L : P + 10000;
            this.E0 = j3;
            this.h0.h(j3, this.D0, this.F0);
        }
        ax.U0.y yVar = bVar.c;
        C2234y c2234y = new C2234y(bVar.a, bVar.k, yVar.r(), yVar.s(), j, j2, yVar.q());
        this.e0.a(bVar.a);
        this.f0.p(c2234y, 1, -1, null, 0, null, bVar.j, this.E0);
        this.Q0 = true;
        ((InterfaceC2206C.a) C0968a.e(this.u0)).i(this);
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long b() {
        return d();
    }

    @Override // ax.m1.o.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public o.c j(b bVar, long j, long j2, IOException iOException, int i) {
        b bVar2;
        o.c g;
        ax.U0.y yVar = bVar.c;
        C2234y c2234y = new C2234y(bVar.a, bVar.k, yVar.r(), yVar.s(), j, j2, yVar.q());
        long b2 = this.e0.b(new m.c(c2234y, new C2205B(1, -1, null, 0, null, ax.S0.d0.E1(bVar.j), ax.S0.d0.E1(this.E0)), iOException, i));
        if (b2 == -9223372036854775807L) {
            g = ax.m1.o.g;
            bVar2 = bVar;
        } else {
            int O = O();
            bVar2 = bVar;
            g = M(bVar2, O) ? ax.m1.o.g(O > this.P0, b2) : ax.m1.o.f;
        }
        boolean c2 = g.c();
        this.f0.r(c2234y, 1, -1, null, 0, null, bVar2.j, this.E0, iOException, !c2);
        if (!c2) {
            this.e0.a(bVar2.a);
        }
        return g;
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public boolean c() {
        return this.o0.i() && this.q0.e();
    }

    @Override // ax.m1.o.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void k(b bVar, long j, long j2, int i) {
        ax.U0.y yVar = bVar.c;
        this.f0.v(i == 0 ? new C2234y(bVar.a, bVar.k, j) : new C2234y(bVar.a, bVar.k, yVar.r(), yVar.s(), j, j2, yVar.q()), 1, -1, null, 0, null, bVar.j, this.E0, i);
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public long d() {
        long j;
        L();
        if (this.Q0 || this.K0 == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.N0;
        }
        if (this.A0) {
            int length = this.w0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                f fVar = this.C0;
                if (fVar.b[i] && fVar.c[i] && !this.w0[i].H()) {
                    j = Math.min(j, this.w0[i].x());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = P(false);
        }
        return j == Long.MIN_VALUE ? this.M0 : j;
    }

    int e0(int i, ax.Y0.O o, ax.V0.i iVar, int i2) {
        if (k0()) {
            return -3;
        }
        U(i);
        int P = this.w0[i].P(o, iVar, i2, this.Q0);
        if (P == -3) {
            V(i);
        }
        return P;
    }

    @Override // ax.m1.o.f
    public void f() {
        for (d0 d0Var : this.w0) {
            d0Var.Q();
        }
        this.p0.d();
    }

    public void f0() {
        if (this.z0) {
            for (d0 d0Var : this.w0) {
                d0Var.O();
            }
        }
        this.o0.m(this);
        this.t0.removeCallbacksAndMessages(null);
        this.u0 = null;
        this.R0 = true;
    }

    @Override // ax.i1.InterfaceC2206C
    public long g(InterfaceC2445D[] interfaceC2445DArr, boolean[] zArr, e0[] e0VarArr, boolean[] zArr2, long j) {
        InterfaceC2445D interfaceC2445D;
        L();
        f fVar = this.C0;
        q0 q0Var = fVar.a;
        boolean[] zArr3 = fVar.c;
        int i = this.K0;
        int i2 = 0;
        for (int i3 = 0; i3 < interfaceC2445DArr.length; i3++) {
            e0 e0Var = e0VarArr[i3];
            if (e0Var != null && (interfaceC2445DArr[i3] == null || !zArr[i3])) {
                int i4 = ((d) e0Var).a;
                C0968a.g(zArr3[i4]);
                this.K0--;
                zArr3[i4] = false;
                e0VarArr[i3] = null;
            }
        }
        boolean z = !this.H0 ? j == 0 || this.B0 : i != 0;
        for (int i5 = 0; i5 < interfaceC2445DArr.length; i5++) {
            if (e0VarArr[i5] == null && (interfaceC2445D = interfaceC2445DArr[i5]) != null) {
                C0968a.g(interfaceC2445D.length() == 1);
                C0968a.g(interfaceC2445D.j(0) == 0);
                int e2 = q0Var.e(interfaceC2445D.b());
                C0968a.g(!zArr3[e2]);
                this.K0++;
                zArr3[e2] = true;
                this.J0 = interfaceC2445D.m().u | this.J0;
                e0VarArr[i5] = new d(e2);
                zArr2[i5] = true;
                if (!z) {
                    d0 d0Var = this.w0[e2];
                    z = (d0Var.A() == 0 || d0Var.W(j, true)) ? false : true;
                }
            }
        }
        if (this.K0 == 0) {
            this.O0 = false;
            this.I0 = false;
            this.J0 = false;
            if (this.o0.i()) {
                d0[] d0VarArr = this.w0;
                int length = d0VarArr.length;
                while (i2 < length) {
                    d0VarArr[i2].q();
                    i2++;
                }
                this.o0.e();
            } else {
                this.Q0 = false;
                d0[] d0VarArr2 = this.w0;
                int length2 = d0VarArr2.length;
                while (i2 < length2) {
                    d0VarArr2[i2].S();
                    i2++;
                }
            }
        } else if (z) {
            j = m(j);
            while (i2 < e0VarArr.length) {
                if (e0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.H0 = true;
        return j;
    }

    @Override // ax.q1.InterfaceC2859t
    public void h(final ax.q1.N n) {
        this.t0.post(new Runnable() { // from class: ax.i1.X
            @Override // java.lang.Runnable
            public final void run() {
                Y.this.h0(n);
            }
        });
    }

    @Override // ax.i1.d0.d
    public void i(C0912v c0912v) {
        this.t0.post(this.r0);
    }

    int i0(int i, long j) {
        if (k0()) {
            return 0;
        }
        U(i);
        d0 d0Var = this.w0[i];
        int C = d0Var.C(j, this.Q0);
        d0Var.b0(C);
        if (C == 0) {
            V(i);
        }
        return C;
    }

    @Override // ax.i1.InterfaceC2206C
    public void l() throws IOException {
        W();
        if (this.Q0 && !this.z0) {
            throw ax.P0.E.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // ax.i1.InterfaceC2206C
    public long m(long j) {
        L();
        boolean[] zArr = this.C0.b;
        if (!this.D0.i()) {
            j = 0;
        }
        int i = 0;
        this.I0 = false;
        boolean z = this.M0 == j;
        this.M0 = j;
        if (R()) {
            this.N0 = j;
            return j;
        }
        if (this.G0 == 7 || ((!this.Q0 && !this.o0.i()) || !g0(zArr, j, z))) {
            this.O0 = false;
            this.N0 = j;
            this.Q0 = false;
            this.J0 = false;
            if (this.o0.i()) {
                d0[] d0VarArr = this.w0;
                int length = d0VarArr.length;
                while (i < length) {
                    d0VarArr[i].q();
                    i++;
                }
                this.o0.e();
                return j;
            }
            this.o0.f();
            d0[] d0VarArr2 = this.w0;
            int length2 = d0VarArr2.length;
            while (i < length2) {
                d0VarArr2[i].S();
                i++;
            }
        }
        return j;
    }

    @Override // ax.i1.InterfaceC2206C
    public void n(InterfaceC2206C.a aVar, long j) {
        this.u0 = aVar;
        if (this.m0 == null) {
            this.q0.f();
            j0();
        } else {
            u(this.l0, 3).e(this.m0);
            h0(new ax.q1.I(new long[]{0}, new long[]{0}, -9223372036854775807L));
            o();
            this.N0 = j;
        }
    }

    @Override // ax.q1.InterfaceC2859t
    public void o() {
        this.y0 = true;
        this.t0.post(this.r0);
    }

    @Override // ax.i1.InterfaceC2206C
    public long q(long j, ax.Y0.Z z) {
        L();
        if (!this.D0.i()) {
            return 0L;
        }
        N.a l = this.D0.l(j);
        return z.a(j, l.a.a, l.b.a);
    }

    @Override // ax.i1.InterfaceC2206C
    public long s() {
        if (this.J0) {
            this.J0 = false;
            return this.M0;
        }
        if (!this.I0) {
            return -9223372036854775807L;
        }
        if (!this.Q0 && O() <= this.P0) {
            return -9223372036854775807L;
        }
        this.I0 = false;
        return this.M0;
    }

    @Override // ax.i1.InterfaceC2206C
    public q0 t() {
        L();
        return this.C0.a;
    }

    @Override // ax.q1.InterfaceC2859t
    public ax.q1.U u(int i, int i2) {
        return d0(new e(i, false));
    }

    @Override // ax.i1.InterfaceC2206C
    public void v(long j, boolean z) {
        if (this.B0) {
            return;
        }
        L();
        if (R()) {
            return;
        }
        boolean[] zArr = this.C0.c;
        int length = this.w0.length;
        for (int i = 0; i < length; i++) {
            this.w0[i].p(j, z, zArr[i]);
        }
    }

    @Override // ax.i1.InterfaceC2206C, ax.i1.f0
    public void e(long j) {
    }
}
