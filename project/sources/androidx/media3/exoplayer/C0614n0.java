package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.exoplayer.C0599g;
import androidx.media3.exoplayer.C0607k;
import androidx.media3.exoplayer.C0618p0;
import androidx.media3.exoplayer.C0620q0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.InterfaceC0616o0;
import androidx.media3.exoplayer.K0;
import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.N0;
import ax.P0.C;
import ax.P0.C0894c;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.N;
import ax.S0.C0968a;
import ax.S0.C0978k;
import ax.S0.C0987u;
import ax.S0.InterfaceC0975h;
import ax.S0.InterfaceC0984q;
import ax.Z0.I1;
import ax.Z0.InterfaceC1200a;
import ax.b1.InterfaceC1465n;
import ax.i1.C2212b;
import ax.i1.InterfaceC2206C;
import ax.i1.InterfaceC2209F;
import ax.l1.AbstractC2451J;
import ax.l1.InterfaceC2445D;
import ax.r7.AbstractC2991z;
import ax.t7.C3104a;
import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0614n0 implements Handler.Callback, InterfaceC2206C.a, AbstractC2451J.a, I0.d, C0607k.a, K0.a, C0599g.a, ax.o1.z {
    private static final long k1 = ax.S0.d0.E1(10000);
    private final InterfaceC0984q A0;
    private final boolean B0;
    private final C0599g C0;
    private ax.Y0.Z D0;
    private ax.Y0.Z F0;
    private boolean G0;
    private boolean H0;
    private h I0;
    private J0 J0;
    private e K0;
    private boolean L0;
    private boolean M0;
    private boolean N0;
    private boolean O0;
    private boolean Q0;
    private int R0;
    private boolean S0;
    private boolean T0;
    private boolean U0;
    private boolean V0;
    private int W0;
    private h X0;
    private long Y0;
    private long Z0;
    private int a1;
    private boolean b1;
    private final N0[] c0;
    private C0622s c1;
    private final boolean[] d0;
    private long d1;
    private final AbstractC2451J e0;
    private final ax.l1.K f0;
    private ExoPlayer.c f1;
    private final InterfaceC0616o0 g0;
    private final ax.m1.e h0;
    private final InterfaceC0984q i0;
    private boolean i1;
    private final ax.Y0.T j0;
    private final Looper k0;
    private final N.c l0;
    private final N.b m0;
    private final long n0;
    private final boolean o0;
    private final C0607k p0;
    private final O0[] q;
    private final ArrayList<d> q0;
    private final InterfaceC0975h r0;
    private final f s0;
    private final C0625t0 t0;
    private final I0 u0;
    private final ax.Y0.P v0;
    private final long w0;
    private final I1 x0;
    private final boolean y0;
    private final InterfaceC1200a z0;
    private long h1 = -9223372036854775807L;
    private float j1 = 1.0f;
    private ax.Y0.Y E0 = ax.Y0.Y.i;
    private long e1 = -9223372036854775807L;
    private long P0 = -9223372036854775807L;
    private ax.P0.N g1 = ax.P0.N.a;

    /* renamed from: androidx.media3.exoplayer.n0$a */
    class a implements M0.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.M0.a
        public void a() {
            C0614n0.this.U0 = true;
        }

        @Override // androidx.media3.exoplayer.M0.a
        public void b() {
            if (C0614n0.this.g0() || C0614n0.this.V0) {
                C0614n0.this.i0.f(2);
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.n0$b */
    private static final class b {
        private final List<I0.c> a;
        private final ax.i1.g0 b;
        private final int c;
        private final long d;

        /* synthetic */ b(List list, ax.i1.g0 g0Var, int i, long j, a aVar) {
            this(list, g0Var, i, j);
        }

        private b(List<I0.c> list, ax.i1.g0 g0Var, int i, long j) {
            this.a = list;
            this.b = g0Var;
            this.c = i;
            this.d = j;
        }
    }

    /* renamed from: androidx.media3.exoplayer.n0$c */
    private static class c {
        public final int a;
        public final int b;
        public final int c;
        public final ax.i1.g0 d;
    }

    /* renamed from: androidx.media3.exoplayer.n0$d */
    private static final class d implements Comparable<d> {
        public int c0;
        public long d0;
        public Object e0;
        public final K0 q;

        public d(K0 k0) {
            this.q = k0;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.e0;
            if ((obj == null) != (dVar.e0 == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.c0 - dVar.c0;
            return i != 0 ? i : Long.compare(this.d0, dVar.d0);
        }

        public void h(int i, long j, Object obj) {
            this.c0 = i;
            this.d0 = j;
            this.e0 = obj;
        }
    }

    /* renamed from: androidx.media3.exoplayer.n0$e */
    public static final class e {
        private boolean a;
        public J0 b;
        public int c;
        public boolean d;
        public int e;

        public e(J0 j0) {
            this.b = j0;
        }

        public void b(int i) {
            this.a |= i > 0;
            this.c += i;
        }

        public void c(J0 j0) {
            this.a |= this.b != j0;
            this.b = j0;
        }

        public void d(int i) {
            if (this.d && this.e != 5) {
                C0968a.a(i == 5);
                return;
            }
            this.a = true;
            this.d = true;
            this.e = i;
        }
    }

    /* renamed from: androidx.media3.exoplayer.n0$f */
    public interface f {
        void a(e eVar);
    }

    /* renamed from: androidx.media3.exoplayer.n0$g */
    private static final class g {
        public final InterfaceC2209F.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(InterfaceC2209F.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    /* renamed from: androidx.media3.exoplayer.n0$h */
    private static final class h {
        public final ax.P0.N a;
        public final int b;
        public final long c;

        public h(ax.P0.N n, int i, long j) {
            this.a = n;
            this.b = i;
            this.c = j;
        }
    }

    public C0614n0(Context context, M0[] m0Arr, M0[] m0Arr2, AbstractC2451J abstractC2451J, ax.l1.K k, InterfaceC0616o0 interfaceC0616o0, ax.m1.e eVar, int i, boolean z, InterfaceC1200a interfaceC1200a, ax.Y0.Z z2, ax.Y0.P p, long j, boolean z3, boolean z4, Looper looper, InterfaceC0975h interfaceC0975h, f fVar, I1 i1, ax.Y0.T t, ExoPlayer.c cVar, final ax.o1.z zVar) {
        this.s0 = fVar;
        this.e0 = abstractC2451J;
        this.f0 = k;
        this.g0 = interfaceC0616o0;
        this.h0 = eVar;
        this.R0 = i;
        this.S0 = z;
        this.D0 = z2;
        this.v0 = p;
        this.w0 = j;
        this.d1 = j;
        this.M0 = z3;
        this.y0 = z4;
        this.r0 = interfaceC0975h;
        this.x0 = i1;
        this.f1 = cVar;
        this.z0 = interfaceC1200a;
        this.n0 = interfaceC0616o0.j(i1);
        this.o0 = interfaceC0616o0.c(i1);
        J0 k2 = J0.k(k);
        this.J0 = k2;
        this.K0 = new e(k2);
        this.c0 = new N0[m0Arr.length];
        this.d0 = new boolean[m0Arr.length];
        N0.a d2 = abstractC2451J.d();
        this.q = new O0[m0Arr.length];
        boolean z5 = false;
        for (int i2 = 0; i2 < m0Arr.length; i2++) {
            m0Arr[i2].m(i2, i1, interfaceC0975h);
            this.c0[i2] = m0Arr[i2].u();
            if (d2 != null) {
                this.c0[i2].v(d2);
            }
            M0 m0 = m0Arr2[i2];
            if (m0 != null) {
                m0.m(i2, i1, interfaceC0975h);
                z5 = true;
            }
            this.q[i2] = new O0(m0Arr[i2], m0Arr2[i2], i2);
        }
        this.B0 = z5;
        this.p0 = new C0607k(this, interfaceC0975h);
        this.q0 = new ArrayList<>();
        this.l0 = new N.c();
        this.m0 = new N.b();
        abstractC2451J.e(this, eVar);
        this.b1 = true;
        InterfaceC0984q d3 = interfaceC0975h.d(looper, null);
        this.A0 = d3;
        this.t0 = new C0625t0(interfaceC1200a, d3, new C0620q0.a() { // from class: androidx.media3.exoplayer.l0
            @Override // androidx.media3.exoplayer.C0620q0.a
            public final C0620q0 a(C0621r0 c0621r0, long j2) {
                C0620q0 z6;
                z6 = C0614n0.this.z(c0621r0, j2);
                return z6;
            }
        }, cVar);
        this.u0 = new I0(this, interfaceC1200a, d3, i1);
        ax.Y0.T t2 = t == null ? new ax.Y0.T() : t;
        this.j0 = t2;
        Looper a2 = t2.a();
        this.k0 = a2;
        InterfaceC0984q d4 = interfaceC0975h.d(a2, this);
        this.i0 = d4;
        this.C0 = new C0599g(context, a2, this);
        d4.j(35, new ax.o1.z() { // from class: androidx.media3.exoplayer.m0
            @Override // ax.o1.z
            public final void g(long j2, long j3, C0912v c0912v, MediaFormat mediaFormat) {
                C0614n0.o(C0614n0.this, zVar, j2, j3, c0912v, mediaFormat);
            }
        }).a();
    }

    private void A(K0 k0) throws C0622s {
        if (k0.i()) {
            return;
        }
        try {
            k0.f().B(k0.h(), k0.d());
        } finally {
            k0.j(true);
        }
    }

    private void A0() throws C0622s {
        C0620q0 y = this.t0.y();
        if (y == null || this.t0.u() == y || y.i || !i2()) {
            return;
        }
        this.t0.y().i = true;
    }

    private void B() {
        if (this.B0 && x()) {
            for (O0 o0 : this.q) {
                int h2 = o0.h();
                o0.c(this.p0);
                this.W0 -= h2 - o0.h();
            }
            this.h1 = -9223372036854775807L;
        }
    }

    private void B0() throws C0622s {
        a0(this.u0.i(), true);
    }

    private void B1(ax.Y0.Y y) throws C0622s {
        this.E0 = y;
        w();
    }

    private void C(int i) throws C0622s {
        int h2 = this.q[i].h();
        this.q[i].b(this.p0);
        s0(i, false);
        this.W0 -= h2;
    }

    private void C0(c cVar) throws C0622s {
        this.K0.b(1);
        a0(this.u0.v(cVar.a, cVar.b, cVar.c, cVar.d), false);
    }

    private void D() throws C0622s {
        for (int i = 0; i < this.q.length; i++) {
            C(i);
        }
        this.h1 = -9223372036854775807L;
    }

    private void D0() {
        for (C0620q0 u = this.t0.u(); u != null; u = u.k()) {
            for (InterfaceC2445D interfaceC2445D : u.p().c) {
                if (interfaceC2445D != null) {
                    interfaceC2445D.r();
                }
            }
        }
    }

    private void D1(ax.Y0.Z z) {
        this.D0 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r11 <= r17.J0.s) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void E() throws androidx.media3.exoplayer.C0622s, java.io.IOException {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C0614n0.E():void");
    }

    private void E0(boolean z) {
        for (C0620q0 u = this.t0.u(); u != null; u = u.k()) {
            for (InterfaceC2445D interfaceC2445D : u.p().c) {
                if (interfaceC2445D != null) {
                    interfaceC2445D.g(z);
                }
            }
        }
    }

    private void F(C0620q0 c0620q0, int i, boolean z, long j) throws C0622s {
        O0 o0 = this.q[i];
        if (o0.y()) {
            return;
        }
        boolean z2 = c0620q0 == this.t0.u();
        ax.l1.K p = c0620q0.p();
        ax.Y0.W w = p.b[i];
        InterfaceC2445D interfaceC2445D = p.c[i];
        boolean z3 = P1() && this.J0.e == 3;
        boolean z4 = !z && z3;
        this.W0++;
        o0.e(w, interfaceC2445D, c0620q0.c[i], this.Y0, z4, z2, j, c0620q0.m(), c0620q0.h.a, this.p0);
        o0.n(11, new a(), c0620q0);
        if (z3 && z2) {
            o0.W();
        }
    }

    private void F0() {
        for (C0620q0 u = this.t0.u(); u != null; u = u.k()) {
            for (InterfaceC2445D interfaceC2445D : u.p().c) {
                if (interfaceC2445D != null) {
                    interfaceC2445D.s();
                }
            }
        }
    }

    private void F1(boolean z) throws C0622s {
        this.S0 = z;
        int Y = this.t0.Y(this.J0.a, z);
        if ((Y & 1) != 0) {
            b1(true);
        } else if ((Y & 2) != 0) {
            B();
        }
        Y(false);
    }

    private void G() throws C0622s {
        H(new boolean[this.q.length], this.t0.y().n());
    }

    private void G1(ax.i1.g0 g0Var) throws C0622s {
        this.K0.b(1);
        a0(this.u0.D(g0Var), false);
    }

    private void H(boolean[] zArr, long j) throws C0622s {
        long j2;
        C0620q0 y = this.t0.y();
        ax.l1.K p = y.p();
        for (int i = 0; i < this.q.length; i++) {
            if (!p.c(i)) {
                this.q[i].L();
            }
        }
        int i2 = 0;
        while (i2 < this.q.length) {
            if (!p.c(i2) || this.q[i2].x(y)) {
                j2 = j;
            } else {
                j2 = j;
                F(y, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private void H1(int i) {
        J0 j0 = this.J0;
        if (j0.e != i) {
            if (i != 2) {
                this.e1 = -9223372036854775807L;
            }
            if (i != 3 && j0.p) {
                this.J0 = j0.i(false);
            }
            this.J0 = this.J0.h(i);
        }
    }

    private void I0() throws C0622s {
        this.K0.b(1);
        Q0(false, false, false, true);
        this.g0.i(this.x0);
        H1(this.J0.a.q() ? 4 : 2);
        b2();
        this.u0.w(this.h0.d());
        this.i0.f(2);
    }

    private void I1(ax.o1.z zVar) throws C0622s {
        for (O0 o0 : this.q) {
            o0.T(zVar);
        }
    }

    private AbstractC2991z<ax.P0.C> J(InterfaceC2445D[] interfaceC2445DArr) {
        AbstractC2991z.a aVar = new AbstractC2991z.a();
        boolean z = false;
        for (InterfaceC2445D interfaceC2445D : interfaceC2445DArr) {
            if (interfaceC2445D != null) {
                ax.P0.C c2 = interfaceC2445D.h(0).l;
                if (c2 == null) {
                    aVar.a(new ax.P0.C(new C.a[0]));
                } else {
                    aVar.a(c2);
                    z = true;
                }
            }
        }
        return z ? aVar.k() : AbstractC2991z.z();
    }

    private long K() {
        J0 j0 = this.J0;
        return M(j0.a, j0.b.a, j0.s);
    }

    private void K0(C0978k c0978k) {
        try {
            Q0(true, false, true, false);
            L0();
            this.g0.f(this.x0);
            this.C0.h();
            this.e0.j();
            H1(1);
        } finally {
            this.i0.k(null);
            this.j0.b();
            c0978k.f();
        }
    }

    private void K1(Object obj, C0978k c0978k) throws C0622s {
        for (O0 o0 : this.q) {
            o0.U(obj);
        }
        int i = this.J0.e;
        if (i == 3 || i == 2) {
            this.i0.f(2);
        }
        if (c0978k != null) {
            c0978k.f();
        }
    }

    private long L() {
        long j = this.J0.e == 3 ? 1000L : k1;
        for (O0 o0 : this.q) {
            j = Math.min(j, ax.S0.d0.E1(o0.j(this.Y0, this.Z0)));
        }
        if (!this.J0.n()) {
            return j;
        }
        C0620q0 k = this.t0.u() != null ? this.t0.u().k() : null;
        return (k == null || ((float) this.Y0) + (((float) ax.S0.d0.a1(j)) * this.J0.o.a) < ((float) k.n())) ? j : Math.min(j, k1);
    }

    private void L0() {
        for (int i = 0; i < this.q.length; i++) {
            this.c0[i].l();
            this.q[i].H();
        }
    }

    private long M(ax.P0.N n, Object obj, long j) {
        n.n(n.h(obj, this.m0).c, this.l0);
        N.c cVar = this.l0;
        if (cVar.f != -9223372036854775807L && cVar.f()) {
            N.c cVar2 = this.l0;
            if (cVar2.i) {
                return ax.S0.d0.a1(cVar2.a() - this.l0.f) - (j + this.m0.o());
            }
        }
        return -9223372036854775807L;
    }

    private void M0(int i, int i2, ax.i1.g0 g0Var) throws C0622s {
        this.K0.b(1);
        a0(this.u0.A(i, i2, g0Var), false);
    }

    private void M1(float f2) throws C0622s {
        this.j1 = f2;
        float f3 = f2 * this.C0.f();
        for (O0 o0 : this.q) {
            o0.V(f3);
        }
    }

    private long N(C0620q0 c0620q0) {
        if (c0620q0 == null) {
            return 0L;
        }
        long m = c0620q0.m();
        if (!c0620q0.f) {
            return m;
        }
        int i = 0;
        while (true) {
            O0[] o0Arr = this.q;
            if (i >= o0Arr.length) {
                return m;
            }
            if (o0Arr[i].x(c0620q0)) {
                long k = this.q[i].k(c0620q0);
                if (k == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m = Math.max(k, m);
            }
            i++;
        }
    }

    private boolean N1() {
        C0620q0 u;
        C0620q0 k;
        return P1() && !this.N0 && (u = this.t0.u()) != null && (k = u.k()) != null && this.Y0 >= k.n() && k.i;
    }

    private Pair<InterfaceC2209F.b, Long> O(ax.P0.N n) {
        if (n.q()) {
            return Pair.create(J0.l(), 0L);
        }
        Pair<Object, Long> j = n.j(this.l0, this.m0, n.a(this.S0), -9223372036854775807L);
        InterfaceC2209F.b Q = this.t0.Q(n, j.first, 0L);
        long longValue = ((Long) j.second).longValue();
        if (Q.b()) {
            n.h(Q.a, this.m0);
            longValue = Q.c == this.m0.l(Q.b) ? this.m0.g() : 0L;
        }
        return Pair.create(Q, Long.valueOf(longValue));
    }

    private void O0() throws C0622s {
        float f2 = this.p0.h().a;
        C0620q0 y = this.t0.y();
        ax.l1.K k = null;
        boolean z = true;
        for (C0620q0 u = this.t0.u(); u != null && u.f; u = u.k()) {
            J0 j0 = this.J0;
            ax.l1.K z2 = u.z(f2, j0.a, j0.l);
            if (u == this.t0.u()) {
                k = z2;
            }
            if (!z2.a(u.p())) {
                if (z) {
                    C0620q0 u2 = this.t0.u();
                    boolean z3 = (this.t0.N(u2) & 1) != 0;
                    boolean[] zArr = new boolean[this.q.length];
                    long b2 = u2.b((ax.l1.K) C0968a.e(k), this.J0.s, z3, zArr);
                    J0 j02 = this.J0;
                    boolean z4 = (j02.e == 4 || b2 == j02.s) ? false : true;
                    J0 j03 = this.J0;
                    this.J0 = e0(j03.b, b2, j03.c, j03.d, z4, 5);
                    if (z4) {
                        S0(b2);
                    }
                    B();
                    boolean[] zArr2 = new boolean[this.q.length];
                    int i = 0;
                    while (true) {
                        O0[] o0Arr = this.q;
                        if (i >= o0Arr.length) {
                            break;
                        }
                        int h2 = o0Arr[i].h();
                        zArr2[i] = this.q[i].y();
                        this.q[i].B(u2.c[i], this.p0, this.Y0, zArr[i]);
                        if (h2 - this.q[i].h() > 0) {
                            s0(i, false);
                        }
                        this.W0 -= h2 - this.q[i].h();
                        i++;
                    }
                    H(zArr2, this.Y0);
                    u2.i = true;
                } else {
                    this.t0.N(u);
                    if (u.f) {
                        long max = Math.max(u.h.b, u.C(this.Y0));
                        if (this.B0 && x() && this.t0.x() == u) {
                            B();
                        }
                        u.a(z2, max, false);
                    }
                }
                Y(true);
                if (this.J0.e != 4) {
                    m0();
                    e2();
                    this.i0.f(2);
                    return;
                }
                return;
            }
            if (u == y) {
                z = false;
            }
        }
    }

    private boolean O1() {
        if (!i0(this.t0.n())) {
            return false;
        }
        C0620q0 n = this.t0.n();
        long T = T(n.l());
        InterfaceC0616o0.a aVar = new InterfaceC0616o0.a(this.x0, this.J0.a, n.h.a, n == this.t0.u() ? n.C(this.Y0) : n.C(this.Y0) - n.h.b, T, this.p0.h().a, this.J0.l, this.O0, R1(this.J0.a, n.h.a) ? this.v0.b() : -9223372036854775807L, this.P0);
        boolean b2 = this.g0.b(aVar);
        C0620q0 u = this.t0.u();
        if (b2 || !u.f || T >= 500000) {
            return b2;
        }
        if (this.n0 <= 0 && !this.o0) {
            return b2;
        }
        u.a.v(this.J0.s, false);
        return this.g0.b(aVar);
    }

    private void P0() throws C0622s {
        O0();
        b1(true);
    }

    private boolean P1() {
        J0 j0 = this.J0;
        return j0.l && j0.n == 0;
    }

    private ax.Y0.Z Q(long j) {
        ax.Y0.Y y;
        Double d2;
        if (!this.G0 || j == -9223372036854775807L || (d2 = (y = this.E0).b) == null || y.c == null) {
            return this.D0;
        }
        double d3 = j;
        double doubleValue = d2.doubleValue() * d3;
        RoundingMode roundingMode = RoundingMode.FLOOR;
        long f2 = C3104a.f(doubleValue, roundingMode);
        long f3 = C3104a.f(this.E0.c.doubleValue() * d3, roundingMode);
        ax.Y0.Z z = this.F0;
        if (z == null || z.a != f2 || z.b != f3) {
            this.F0 = new ax.Y0.Z(f2, f3);
        }
        return this.F0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Q0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C0614n0.Q0(boolean, boolean, boolean, boolean):void");
    }

    private boolean Q1(boolean z) {
        if (this.W0 == 0) {
            return k0();
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        if (!this.J0.g) {
            return true;
        }
        C0620q0 u = this.t0.u();
        long b2 = R1(this.J0.a, u.h.a) ? this.v0.b() : -9223372036854775807L;
        C0620q0 n = this.t0.n();
        boolean z3 = n.s() && n.h.j;
        if (n.h.a.b() && !n.f) {
            z2 = true;
        }
        if (z3 || z2) {
            return true;
        }
        return this.g0.a(new InterfaceC0616o0.a(this.x0, this.J0.a, u.h.a, u.C(this.Y0), T(n.j()), this.p0.h().a, this.J0.l, this.O0, b2, this.P0));
    }

    private long R() {
        if (this.J0.e != 3 || P1()) {
            return k1;
        }
        return 1000L;
    }

    private void R0() {
        C0620q0 u = this.t0.u();
        this.N0 = u != null && u.h.i && this.M0;
    }

    private boolean R1(ax.P0.N n, InterfaceC2209F.b bVar) {
        if (!bVar.b() && !n.q()) {
            n.n(n.h(bVar.a, this.m0).c, this.l0);
            if (this.l0.f()) {
                N.c cVar = this.l0;
                if (cVar.i && cVar.f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private long S() {
        return T(this.J0.q);
    }

    private void S0(long j) throws C0622s {
        C0620q0 u = this.t0.u();
        long D = u == null ? j + 1000000000000L : u.D(j);
        this.Y0 = D;
        this.p0.c(D);
        for (O0 o0 : this.q) {
            o0.M(u, this.Y0);
        }
        D0();
    }

    private void S1() throws C0622s {
        C0620q0 u = this.t0.u();
        if (u == null) {
            return;
        }
        ax.l1.K p = u.p();
        for (int i = 0; i < this.q.length; i++) {
            if (p.c(i)) {
                this.q[i].W();
            }
        }
    }

    private long T(long j) {
        C0620q0 n = this.t0.n();
        if (n == null) {
            return 0L;
        }
        return Math.max(0L, j - n.C(this.Y0));
    }

    private static void T0(ax.P0.N n, d dVar, N.c cVar, N.b bVar) {
        int i = n.n(n.h(dVar.e0, bVar).c, cVar).o;
        Object obj = n.g(i, bVar, true).b;
        long j = bVar.d;
        dVar.h(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    private void U(int i) throws C0622s {
        J0 j0 = this.J0;
        d2(j0.l, i, j0.n, j0.m);
    }

    private static boolean U0(d dVar, ax.P0.N n, ax.P0.N n2, int i, boolean z, N.c cVar, N.b bVar) {
        Object obj = dVar.e0;
        if (obj == null) {
            Pair<Object, Long> X0 = X0(n, new h(dVar.q.g(), dVar.q.c(), dVar.q.e() == Long.MIN_VALUE ? -9223372036854775807L : ax.S0.d0.a1(dVar.q.e())), false, i, z, cVar, bVar);
            if (X0 == null) {
                return false;
            }
            dVar.h(n.b(X0.first), ((Long) X0.second).longValue(), X0.first);
            if (dVar.q.e() == Long.MIN_VALUE) {
                T0(n, dVar, cVar, bVar);
            }
            return true;
        }
        int b2 = n.b(obj);
        if (b2 == -1) {
            return false;
        }
        if (dVar.q.e() == Long.MIN_VALUE) {
            T0(n, dVar, cVar, bVar);
            return true;
        }
        dVar.c0 = b2;
        n2.h(dVar.e0, bVar);
        if (bVar.f && n2.n(bVar.c, cVar).n == n2.b(dVar.e0)) {
            Pair<Object, Long> j = n.j(cVar, bVar, n.h(dVar.e0, bVar).c, dVar.d0 + bVar.o());
            dVar.h(n.b(j.first), ((Long) j.second).longValue(), j.first);
        }
        return true;
    }

    private void U1(boolean z, boolean z2) {
        Q0(z || !this.T0, false, true, false);
        this.K0.b(z2 ? 1 : 0);
        this.g0.g(this.x0);
        this.C0.n(this.J0.l, 1);
        H1(1);
    }

    private void V() throws C0622s {
        M1(this.j1);
    }

    private void V0(ax.P0.N n, ax.P0.N n2) {
        if (n.q() && n2.q()) {
            return;
        }
        int size = this.q0.size() - 1;
        while (size >= 0) {
            ax.P0.N n3 = n;
            ax.P0.N n4 = n2;
            if (!U0(this.q0.get(size), n3, n4, this.R0, this.S0, this.l0, this.m0)) {
                this.q0.get(size).q.j(false);
                this.q0.remove(size);
            }
            size--;
            n = n3;
            n2 = n4;
        }
        Collections.sort(this.q0);
    }

    private void V1() throws C0622s {
        this.p0.g();
        for (O0 o0 : this.q) {
            o0.Y();
        }
    }

    private void W(InterfaceC2206C interfaceC2206C) {
        if (this.t0.F(interfaceC2206C)) {
            this.t0.K(this.Y0);
            m0();
        } else if (this.t0.G(interfaceC2206C)) {
            n0();
        }
    }

    private static g W0(ax.P0.N n, J0 j0, h hVar, C0625t0 c0625t0, int i, boolean z, N.c cVar, N.b bVar) {
        ax.P0.N n2;
        N.b bVar2;
        int i2;
        long j;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        long j3;
        int i4;
        long longValue;
        boolean z6;
        boolean z7;
        boolean z8;
        if (n.q()) {
            return new g(J0.l(), 0L, -9223372036854775807L, false, true, false);
        }
        InterfaceC2209F.b bVar3 = j0.b;
        Object obj = bVar3.a;
        boolean l0 = l0(j0, bVar);
        long j4 = (j0.b.b() || l0) ? j0.c : j0.s;
        boolean z9 = false;
        if (hVar != null) {
            n2 = n;
            Pair<Object, Long> X0 = X0(n2, hVar, true, i, z, cVar, bVar);
            if (X0 == null) {
                i3 = n2.a(z);
                longValue = j4;
                z6 = false;
                z7 = false;
                z8 = true;
            } else {
                if (hVar.c == -9223372036854775807L) {
                    i3 = n2.h(X0.first, bVar).c;
                    longValue = j4;
                    z6 = false;
                } else {
                    obj = X0.first;
                    longValue = ((Long) X0.second).longValue();
                    i3 = -1;
                    z6 = true;
                }
                z7 = j0.e == 4;
                z8 = false;
            }
            z4 = z6;
            z2 = z7;
            z3 = z8;
            j = longValue;
            bVar2 = bVar;
            i2 = -1;
        } else {
            n2 = n;
            if (j0.a.q()) {
                i3 = n2.a(z);
            } else if (n2.b(obj) == -1) {
                int Y0 = Y0(cVar, bVar, i, z, obj, j0.a, n2);
                n2 = n2;
                if (Y0 == -1) {
                    Y0 = n2.a(z);
                    z5 = true;
                } else {
                    z5 = false;
                }
                i3 = Y0;
                obj = obj;
                bVar2 = bVar;
                z3 = z5;
                i2 = -1;
                z2 = false;
                z4 = false;
                j = j4;
            } else if (j4 == -9223372036854775807L) {
                i3 = n2.h(obj, bVar).c;
                obj = obj;
            } else if (l0) {
                j0.a.h(bVar3.a, bVar);
                if (j0.a.n(bVar.c, cVar).n == j0.a.b(bVar3.a)) {
                    bVar2 = bVar;
                    Pair<Object, Long> j5 = n2.j(cVar, bVar2, n2.h(obj, bVar).c, bVar.o() + j4);
                    obj = j5.first;
                    j = ((Long) j5.second).longValue();
                    i2 = -1;
                } else {
                    bVar2 = bVar;
                    if (n2.h(obj, bVar2).d != -9223372036854775807L) {
                        i2 = -1;
                        j = ax.S0.d0.q(j4, 0L, bVar2.d - 1);
                        obj = obj;
                    } else {
                        i2 = -1;
                        obj = obj;
                        j = j4;
                    }
                }
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = true;
            } else {
                bVar2 = bVar;
                i2 = -1;
                obj = obj;
                j = j4;
                i3 = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            bVar2 = bVar;
            j = j4;
            i2 = -1;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (i3 != i2) {
            Pair<Object, Long> j6 = n2.j(cVar, bVar2, i3, -9223372036854775807L);
            obj = j6.first;
            j2 = ((Long) j6.second).longValue();
            j3 = -9223372036854775807L;
        } else {
            j2 = j;
            j3 = j2;
        }
        InterfaceC2209F.b Q = c0625t0.Q(n2, obj, j2);
        int i5 = Q.e;
        boolean z10 = i5 == i2 || ((i4 = bVar3.e) != i2 && i5 >= i4);
        if (bVar3.a.equals(obj) && !bVar3.b() && !Q.b() && z10) {
            z9 = true;
        }
        InterfaceC2209F.b bVar4 = Q;
        boolean h0 = h0(l0, bVar3, j4, bVar4, n2.h(obj, bVar2), j3);
        if (z9 || h0) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                j2 = j0.s;
            } else {
                n2.h(bVar4.a, bVar2);
                j2 = bVar4.c == bVar2.l(bVar4.b) ? bVar2.g() : 0L;
            }
        }
        return new g(bVar4, j2, j3, z2, z3, z4);
    }

    private void W1() {
        C0620q0 n = this.t0.n();
        boolean z = this.Q0 || (n != null && n.a.c());
        J0 j0 = this.J0;
        if (z != j0.g) {
            this.J0 = j0.b(z);
        }
    }

    private void X(IOException iOException, int i) {
        C0622s e2 = C0622s.e(iOException, i);
        C0620q0 u = this.t0.u();
        if (u != null) {
            e2 = e2.c(u.h.a);
        }
        C0987u.d("ExoPlayerImplInternal", "Playback error", e2);
        U1(false, false);
        this.J0 = this.J0.f(e2);
    }

    private static Pair<Object, Long> X0(ax.P0.N n, h hVar, boolean z, int i, boolean z2, N.c cVar, N.b bVar) {
        Pair<Object, Long> j;
        ax.P0.N n2;
        int Y0;
        ax.P0.N n3 = hVar.a;
        if (n.q()) {
            return null;
        }
        if (n3.q()) {
            n3 = n;
        }
        try {
            j = n3.j(cVar, bVar, hVar.b, hVar.c);
            n2 = n3;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (n.equals(n2)) {
            return j;
        }
        if (n.b(j.first) != -1) {
            return (n2.h(j.first, bVar).f && n2.n(bVar.c, cVar).n == n2.b(j.first)) ? n.j(cVar, bVar, n.h(j.first, bVar).c, hVar.c) : j;
        }
        if (z && (Y0 = Y0(cVar, bVar, i, z2, j.first, n2, n)) != -1) {
            return n.j(cVar, bVar, Y0, -9223372036854775807L);
        }
        return null;
    }

    private void X1(InterfaceC2209F.b bVar, ax.i1.q0 q0Var, ax.l1.K k) {
        C0620q0 c0620q0 = (C0620q0) C0968a.e(this.t0.n());
        this.g0.d(new InterfaceC0616o0.a(this.x0, this.J0.a, bVar, c0620q0 == this.t0.u() ? c0620q0.C(this.Y0) : c0620q0.C(this.Y0) - c0620q0.h.b, T(c0620q0.j()), this.p0.h().a, this.J0.l, this.O0, R1(this.J0.a, c0620q0.h.a) ? this.v0.b() : -9223372036854775807L, this.P0), q0Var, k.c);
    }

    private void Y(boolean z) {
        C0620q0 n = this.t0.n();
        InterfaceC2209F.b bVar = n == null ? this.J0.b : n.h.a;
        boolean equals = this.J0.k.equals(bVar);
        if (!equals) {
            this.J0 = this.J0.c(bVar);
        }
        J0 j0 = this.J0;
        j0.q = n == null ? j0.s : n.j();
        this.J0.r = S();
        if ((!equals || z) && n != null && n.f) {
            X1(n.h.a, n.o(), n.p());
        }
    }

    static int Y0(N.c cVar, N.b bVar, int i, boolean z, Object obj, ax.P0.N n, ax.P0.N n2) {
        N.b bVar2;
        Object obj2 = n.n(n.h(obj, bVar).c, cVar).a;
        int i2 = 0;
        for (int i3 = 0; i3 < n2.p(); i3++) {
            if (n2.n(i3, cVar).a.equals(obj2)) {
                return i3;
            }
        }
        int b2 = n.b(obj);
        int i4 = n.i();
        int i5 = b2;
        int i6 = -1;
        while (i2 < i4 && i6 == -1) {
            N.c cVar2 = cVar;
            bVar2 = bVar;
            int i7 = i;
            boolean z2 = z;
            ax.P0.N n3 = n;
            i5 = n3.d(i5, bVar2, cVar2, i7, z2);
            if (i5 == -1) {
                break;
            }
            i6 = n2.b(n3.m(i5));
            i2++;
            n = n3;
            bVar = bVar2;
            cVar = cVar2;
            i = i7;
            z = z2;
        }
        bVar2 = bVar;
        if (i6 == -1) {
            return -1;
        }
        return n2.f(i6, bVar2).c;
    }

    private void Y1(int i, int i2, List<C0915y> list) throws C0622s {
        this.K0.b(1);
        a0(this.u0.E(i, i2, list), false);
    }

    private void Z(C0620q0 c0620q0) throws C0622s {
        if (!c0620q0.f) {
            float f2 = this.p0.h().a;
            J0 j0 = this.J0;
            c0620q0.q(f2, j0.a, j0.l);
        }
        X1(c0620q0.h.a, c0620q0.o(), c0620q0.p());
        if (c0620q0 == this.t0.u()) {
            S0(c0620q0.h.b);
            G();
            c0620q0.i = true;
            J0 j02 = this.J0;
            InterfaceC2209F.b bVar = j02.b;
            long j = c0620q0.h.b;
            this.J0 = e0(bVar, j, j02.c, j, false, 5);
        }
        m0();
    }

    private void Z0(long j) {
        this.i0.h(2, j + (g0() ? L() : R()));
    }

    private void Z1() throws C0622s {
        if (this.J0.a.q() || !this.u0.t()) {
            return;
        }
        boolean u0 = u0();
        y0();
        z0();
        A0();
        w0();
        x0(u0);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a0(ax.P0.N r27, boolean r28) throws androidx.media3.exoplayer.C0622s {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C0614n0.a0(ax.P0.N, boolean):void");
    }

    private static int a2(int i, int i2) {
        if (i == -1) {
            return 2;
        }
        if (i2 == 2) {
            return 1;
        }
        return i2;
    }

    private void b0(InterfaceC2206C interfaceC2206C) throws C0622s {
        if (this.t0.F(interfaceC2206C)) {
            Z((C0620q0) C0968a.e(this.t0.n()));
            return;
        }
        C0620q0 v = this.t0.v(interfaceC2206C);
        if (v != null) {
            C0968a.g(!v.f);
            float f2 = this.p0.h().a;
            J0 j0 = this.J0;
            v.q(f2, j0.a, j0.l);
            if (this.t0.G(interfaceC2206C)) {
                n0();
            }
        }
    }

    private void b1(boolean z) throws C0622s {
        InterfaceC2209F.b bVar = this.t0.u().h.a;
        long e1 = e1(bVar, this.J0.s, true, false);
        if (e1 != this.J0.s) {
            J0 j0 = this.J0;
            this.J0 = e0(bVar, e1, j0.c, j0.d, z, 5);
        }
    }

    private void b2() throws C0622s {
        J0 j0 = this.J0;
        c2(j0.l, j0.n, j0.m);
    }

    private void c0(ax.P0.G g2, float f2, boolean z, boolean z2) throws C0622s {
        if (z) {
            if (z2) {
                this.K0.b(1);
            }
            this.J0 = this.J0.g(g2);
        }
        j2(g2.a);
        for (O0 o0 : this.q) {
            o0.Q(f2, g2.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:24|(7:(11:26|(1:74)(1:32)|33|34|35|36|(1:46)|43|44|16|17)(1:75)|58|59|60|15|16|17)|47|(1:49)(1:70)|50|51|(1:53)|54|55|56|57) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0154, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0155, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa A[Catch: all -> 0x00ad, TryCatch #2 {all -> 0x00ad, blocks: (B:11:0x00a0, B:13:0x00aa, B:20:0x00b5, B:22:0x00bb, B:23:0x00be, B:24:0x00c5, B:26:0x00cf, B:28:0x00d7, B:32:0x00df, B:33:0x00ef, B:47:0x0122, B:50:0x012f), top: B:10:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c1(androidx.media3.exoplayer.C0614n0.h r18, boolean r19) throws androidx.media3.exoplayer.C0622s {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C0614n0.c1(androidx.media3.exoplayer.n0$h, boolean):void");
    }

    private void c2(boolean z, int i, int i2) throws C0622s {
        d2(z, this.C0.n(z, this.J0.e), i, i2);
    }

    private void d0(ax.P0.G g2, boolean z) throws C0622s {
        c0(g2, g2.a, true, z);
    }

    private long d1(InterfaceC2209F.b bVar, long j, boolean z) throws C0622s {
        return e1(bVar, j, this.t0.u() != this.t0.y(), z);
    }

    private void d2(boolean z, int i, int i2, int i3) throws C0622s {
        boolean z2 = z && i != -1;
        int a2 = a2(i, i3);
        int g2 = g2(i, i2);
        J0 j0 = this.J0;
        if (j0.l == z2 && j0.n == g2 && j0.m == a2) {
            return;
        }
        this.J0 = j0.e(z2, a2, g2);
        h2(false, false);
        E0(z2);
        if (!P1()) {
            V1();
            e2();
            J0 j02 = this.J0;
            if (j02.p) {
                this.J0 = j02.i(false);
            }
            this.t0.K(this.Y0);
            return;
        }
        int i4 = this.J0.e;
        if (i4 == 3) {
            this.p0.f();
            S1();
            this.i0.f(2);
        } else if (i4 == 2) {
            this.i0.f(2);
        }
    }

    private J0 e0(InterfaceC2209F.b bVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        ax.i1.q0 q0Var;
        ax.l1.K k;
        this.b1 = (!this.b1 && j == this.J0.s && bVar.equals(this.J0.b)) ? false : true;
        R0();
        J0 j0 = this.J0;
        ax.i1.q0 q0Var2 = j0.h;
        ax.l1.K k2 = j0.i;
        List list2 = j0.j;
        if (this.u0.t()) {
            C0620q0 u = this.t0.u();
            ax.i1.q0 o = u == null ? ax.i1.q0.d : u.o();
            ax.l1.K p = u == null ? this.f0 : u.p();
            List J = J(p.c);
            if (u != null) {
                C0621r0 c0621r0 = u.h;
                if (c0621r0.c != j2) {
                    u.h = c0621r0.a(j2);
                }
            }
            v0();
            q0Var = o;
            k = p;
            list = J;
        } else {
            if (!bVar.equals(this.J0.b)) {
                q0Var2 = ax.i1.q0.d;
                k2 = this.f0;
                list2 = AbstractC2991z.z();
            }
            list = list2;
            q0Var = q0Var2;
            k = k2;
        }
        if (z) {
            this.K0.d(i);
        }
        return this.J0.d(bVar, j, j2, j3, S(), q0Var, k, list);
    }

    private long e1(InterfaceC2209F.b bVar, long j, boolean z, boolean z2) throws C0622s {
        V1();
        h2(false, true);
        if (z2 || this.J0.e == 3) {
            H1(2);
        }
        C0620q0 u = this.t0.u();
        C0620q0 c0620q0 = u;
        while (c0620q0 != null && !bVar.equals(c0620q0.h.a)) {
            c0620q0 = c0620q0.k();
        }
        if (z || u != c0620q0 || (c0620q0 != null && c0620q0.D(j) < 0)) {
            D();
            if (c0620q0 != null) {
                while (this.t0.u() != c0620q0) {
                    this.t0.b();
                }
                this.t0.N(c0620q0);
                c0620q0.B(1000000000000L);
                G();
                c0620q0.i = true;
            }
        }
        B();
        if (c0620q0 != null) {
            this.t0.N(c0620q0);
            if (!c0620q0.f) {
                c0620q0.h = c0620q0.h.b(j);
            } else if (c0620q0.g) {
                j = c0620q0.a.m(j);
                c0620q0.a.v(j - this.n0, this.o0);
            }
            S0(j);
            m0();
        } else {
            this.t0.g();
            S0(j);
        }
        Y(false);
        this.i0.f(2);
        return j;
    }

    private void e2() throws C0622s {
        C0620q0 u = this.t0.u();
        if (u == null) {
            return;
        }
        long s = u.f ? u.a.s() : -9223372036854775807L;
        if (s != -9223372036854775807L) {
            if (!u.s()) {
                this.t0.N(u);
                Y(false);
                m0();
            }
            S0(s);
            if (s != this.J0.s) {
                J0 j0 = this.J0;
                long j = s;
                this.J0 = e0(j0.b, j, j0.c, j, true, 5);
            }
        } else {
            long i = this.p0.i(u != this.t0.y());
            this.Y0 = i;
            long C = u.C(i);
            t0(this.J0.s, C);
            if (this.p0.z()) {
                boolean z = !this.K0.d;
                J0 j02 = this.J0;
                this.J0 = e0(j02.b, C, j02.c, C, z, 6);
            } else {
                this.J0.o(C);
            }
        }
        this.J0.q = this.t0.n().j();
        this.J0.r = S();
        J0 j03 = this.J0;
        if (j03.l && j03.e == 3 && R1(j03.a, j03.b) && this.J0.o.a == 1.0f) {
            float a2 = this.v0.a(K(), this.J0.r);
            if (this.p0.h().a != a2) {
                m1(this.J0.o.b(a2));
                c0(this.J0.o, this.p0.h().a, false, false);
            }
        }
    }

    private boolean f0() {
        C0620q0 y = this.t0.y();
        if (!y.f) {
            return false;
        }
        int i = 0;
        while (true) {
            O0[] o0Arr = this.q;
            if (i >= o0Arr.length) {
                return true;
            }
            if (!o0Arr[i].o(y)) {
                return false;
            }
            i++;
        }
    }

    private void f1(K0 k0) throws C0622s {
        if (k0.e() == -9223372036854775807L) {
            g1(k0);
            return;
        }
        if (this.J0.a.q()) {
            this.q0.add(new d(k0));
            return;
        }
        d dVar = new d(k0);
        ax.P0.N n = this.J0.a;
        if (!U0(dVar, n, n, this.R0, this.S0, this.l0, this.m0)) {
            k0.j(false);
        } else {
            this.q0.add(dVar);
            Collections.sort(this.q0);
        }
    }

    private void f2(ax.P0.N n, InterfaceC2209F.b bVar, ax.P0.N n2, InterfaceC2209F.b bVar2, long j, boolean z) throws C0622s {
        if (!R1(n, bVar)) {
            ax.P0.G g2 = bVar.b() ? ax.P0.G.d : this.J0.o;
            if (this.p0.h().equals(g2)) {
                return;
            }
            m1(g2);
            c0(this.J0.o, g2.a, false, false);
            return;
        }
        n.n(n.h(bVar.a, this.m0).c, this.l0);
        this.v0.d((C0915y.g) ax.S0.d0.i(this.l0.j));
        if (j != -9223372036854775807L) {
            this.v0.e(M(n, bVar.a, j));
            return;
        }
        if (!Objects.equals(!n2.q() ? n2.n(n2.h(bVar2.a, this.m0).c, this.l0).a : null, this.l0.a) || z) {
            this.v0.e(-9223372036854775807L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g0() {
        if (this.y0) {
            return true;
        }
        return this.G0 && this.E0.g;
    }

    private void g1(K0 k0) throws C0622s {
        if (k0.b() != this.k0) {
            this.i0.j(15, k0).a();
            return;
        }
        A(k0);
        int i = this.J0.e;
        if (i == 3 || i == 2) {
            this.i0.f(2);
        }
    }

    private static int g2(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        return i2;
    }

    private static boolean h0(boolean z, InterfaceC2209F.b bVar, long j, InterfaceC2209F.b bVar2, N.b bVar3, long j2) {
        if (!z && j == j2 && bVar.a.equals(bVar2.a)) {
            if (bVar.b() && bVar3.s(bVar.b)) {
                return (bVar3.h(bVar.b, bVar.c) == 4 || bVar3.h(bVar.b, bVar.c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.s(bVar2.b)) {
                return true;
            }
        }
        return false;
    }

    private void h1(final K0 k0) {
        Looper b2 = k0.b();
        if (b2.getThread().isAlive()) {
            this.r0.d(b2, null).c(new Runnable() { // from class: androidx.media3.exoplayer.k0
                @Override // java.lang.Runnable
                public final void run() {
                    C0614n0.p(C0614n0.this, k0);
                }
            });
        } else {
            C0987u.h("TAG", "Trying to send message on a dead thread.");
            k0.j(false);
        }
    }

    private void h2(boolean z, boolean z2) {
        this.O0 = z;
        this.P0 = (!z || z2) ? -9223372036854775807L : this.r0.b();
    }

    private boolean i0(C0620q0 c0620q0) {
        return (c0620q0 == null || c0620q0.r() || c0620q0.l() == Long.MIN_VALUE) ? false : true;
    }

    private void i1(long j) {
        for (O0 o0 : this.q) {
            o0.N(j);
        }
    }

    private boolean i2() throws C0622s {
        C0620q0 y = this.t0.y();
        ax.l1.K p = y.p();
        int i = 0;
        boolean z = true;
        while (true) {
            O0[] o0Arr = this.q;
            if (i >= o0Arr.length) {
                break;
            }
            int h2 = o0Arr[i].h();
            int J = this.q[i].J(y, p, this.p0);
            if ((J & 2) != 0 && this.V0) {
                p1(false);
            }
            this.W0 -= h2 - this.q[i].h();
            z &= (J & 1) != 0;
            i++;
        }
        if (z) {
            for (int i2 = 0; i2 < this.q.length; i2++) {
                if (p.c(i2) && !this.q[i2].x(y)) {
                    F(y, i2, false, y.n());
                }
            }
        }
        return z;
    }

    private boolean j0(int i, InterfaceC2209F.b bVar) {
        if (this.t0.x() == null || !this.t0.x().h.a.equals(bVar)) {
            return false;
        }
        return this.q[i].v(this.t0.x());
    }

    private void j2(float f2) {
        for (C0620q0 u = this.t0.u(); u != null; u = u.k()) {
            for (InterfaceC2445D interfaceC2445D : u.p().c) {
                if (interfaceC2445D != null) {
                    interfaceC2445D.p(f2);
                }
            }
        }
    }

    private boolean k0() {
        C0620q0 u = this.t0.u();
        long j = u.h.e;
        if (u.f) {
            return j == -9223372036854775807L || this.J0.s < j || !P1();
        }
        return false;
    }

    private void k1(C0894c c0894c, boolean z) throws C0622s {
        this.e0.l(c0894c);
        C0599g c0599g = this.C0;
        if (!z) {
            c0894c = null;
        }
        c0599g.k(c0894c);
        b2();
    }

    private static boolean l0(J0 j0, N.b bVar) {
        InterfaceC2209F.b bVar2 = j0.b;
        ax.P0.N n = j0.a;
        return n.q() || n.h(bVar2.a, bVar).f;
    }

    private void l1(boolean z, C0978k c0978k) {
        if (this.T0 != z) {
            this.T0 = z;
            if (!z) {
                for (O0 o0 : this.q) {
                    o0.L();
                }
            }
        }
        if (c0978k != null) {
            c0978k.f();
        }
    }

    private void m0() {
        boolean O1 = O1();
        this.Q0 = O1;
        if (O1) {
            C0620q0 c0620q0 = (C0620q0) C0968a.e(this.t0.n());
            c0620q0.e(new C0618p0.b().f(c0620q0.C(this.Y0)).g(this.p0.h().a).e(this.P0).d());
        }
        W1();
    }

    private void m1(ax.P0.G g2) {
        this.i0.i(16);
        this.p0.e(g2);
    }

    private void n0() {
        this.t0.I();
        C0620q0 w = this.t0.w();
        if (w != null) {
            if ((!w.e || w.f) && !w.a.c()) {
                if (this.g0.e(this.J0.a, w.h.a, w.f ? w.a.d() : 0L)) {
                    if (w.e) {
                        w.e(new C0618p0.b().f(w.C(this.Y0)).g(this.p0.h().a).e(this.P0).d());
                    } else {
                        w.v(this, w.h.b);
                    }
                }
            }
        }
    }

    private void n1(b bVar) throws C0622s {
        this.K0.b(1);
        if (bVar.c != -1) {
            this.X0 = new h(new L0(bVar.a, bVar.b), bVar.c, bVar.d);
        }
        a0(this.u0.C(bVar.a, bVar.b), false);
    }

    public static /* synthetic */ void o(C0614n0 c0614n0, ax.o1.z zVar, long j, long j2, C0912v c0912v, MediaFormat mediaFormat) {
        c0614n0.getClass();
        zVar.g(j, j2, c0912v, mediaFormat);
        c0614n0.g(j, j2, c0912v, mediaFormat);
    }

    private void o0() throws C0622s {
        for (O0 o0 : this.q) {
            o0.D();
        }
    }

    public static /* synthetic */ void p(C0614n0 c0614n0, K0 k0) {
        c0614n0.getClass();
        try {
            c0614n0.A(k0);
        } catch (C0622s e2) {
            C0987u.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void p0() {
        this.K0.c(this.J0);
        if (this.K0.a) {
            this.s0.a(this.K0);
            this.K0 = new e(this.J0);
        }
    }

    private void p1(boolean z) {
        if (z == this.V0) {
            return;
        }
        this.V0 = z;
        if (z || !this.J0.p) {
            return;
        }
        this.i0.f(2);
    }

    private void q0() throws C0622s {
        C0620q0 x = this.t0.x();
        if (x == null) {
            return;
        }
        ax.l1.K p = x.p();
        for (int i = 0; i < this.q.length; i++) {
            if (p.c(i) && this.q[i].s() && !this.q[i].u()) {
                this.q[i].X();
                F(x, i, false, x.n());
            }
        }
        if (x()) {
            this.h1 = x.a.s();
            if (x.s()) {
                return;
            }
            this.t0.N(x);
            Y(false);
            m0();
        }
    }

    private void q1(boolean z) throws C0622s {
        this.M0 = z;
        R0();
        if (!this.N0 || this.t0.y() == this.t0.u()) {
            return;
        }
        b1(true);
        Y(false);
    }

    private void r0(int i) throws IOException, C0622s {
        O0 o0 = this.q[i];
        try {
            o0.G((C0620q0) C0968a.e(this.t0.u()));
        } catch (IOException | RuntimeException e2) {
            int m = o0.m();
            if (m != 3 && m != 5) {
                throw e2;
            }
            ax.l1.K p = this.t0.u().p();
            C0987u.d("ExoPlayerImplInternal", "Disabling track due to error: " + C0912v.l(p.c[i].m()), e2);
            ax.l1.K k = new ax.l1.K((ax.Y0.W[]) p.b.clone(), (InterfaceC2445D[]) p.c.clone(), p.d, p.e);
            k.b[i] = null;
            k.c[i] = null;
            C(i);
            this.t0.u().a(k, this.J0.s, false);
        }
    }

    private void s0(final int i, final boolean z) {
        boolean[] zArr = this.d0;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.A0.c(new Runnable() { // from class: androidx.media3.exoplayer.j0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.z0.T(r1, C0614n0.this.q[i].m(), z);
                }
            });
        }
    }

    private void s1(boolean z, int i, boolean z2, int i2) throws C0622s {
        this.K0.b(z2 ? 1 : 0);
        c2(z, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t0(long r9, long r11) throws androidx.media3.exoplayer.C0622s {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C0614n0.t0(long, long):void");
    }

    private void u(b bVar, int i) throws C0622s {
        this.K0.b(1);
        I0 i0 = this.u0;
        if (i == -1) {
            i = i0.r();
        }
        a0(i0.f(i, bVar.a, bVar.b), false);
    }

    private boolean u0() throws C0622s {
        C0621r0 t;
        this.t0.K(this.Y0);
        boolean z = false;
        if (this.t0.T() && (t = this.t0.t(this.Y0, this.J0)) != null) {
            C0620q0 h2 = this.t0.h(t);
            if (!h2.e) {
                h2.v(this, t.b);
            } else if (h2.f) {
                this.i0.j(8, h2.a).a();
            }
            if (this.t0.u() == h2) {
                S0(t.b);
            }
            Y(false);
            z = true;
        }
        if (!this.Q0) {
            m0();
            return z;
        }
        this.Q0 = i0(this.t0.n());
        W1();
        return z;
    }

    private void u1(ax.P0.G g2) throws C0622s {
        m1(g2);
        d0(this.p0.h(), true);
    }

    private void v() {
        ax.l1.K p = this.t0.u().p();
        for (int i = 0; i < this.q.length; i++) {
            if (p.c(i)) {
                this.q[i].f();
            }
        }
    }

    private void v0() {
        C0620q0 u;
        boolean z;
        if (this.t0.u() == this.t0.y() && (u = this.t0.u()) != null) {
            ax.l1.K p = u.p();
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (true) {
                if (i >= this.q.length) {
                    z = true;
                    break;
                }
                if (p.c(i)) {
                    if (this.q[i].m() != 1) {
                        z = false;
                        break;
                    } else if (p.b[i].a != 0) {
                        z3 = true;
                    }
                }
                i++;
            }
            if (z3 && z) {
                z2 = true;
            }
            p1(z2);
        }
    }

    private void v1(ExoPlayer.c cVar) {
        this.f1 = cVar;
        this.t0.V(this.J0.a, cVar);
    }

    private void w() throws C0622s {
        for (O0 o0 : this.q) {
            o0.R(this.G0 ? this.E0 : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w0() throws androidx.media3.exoplayer.C0622s {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
        L2:
            boolean r2 = r15.N1()
            if (r2 == 0) goto L81
            if (r1 == 0) goto Ld
            r15.p0()
        Ld:
            r15.i1 = r0
            androidx.media3.exoplayer.t0 r1 = r15.t0
            androidx.media3.exoplayer.q0 r1 = r1.b()
            java.lang.Object r1 = ax.S0.C0968a.e(r1)
            androidx.media3.exoplayer.q0 r1 = (androidx.media3.exoplayer.C0620q0) r1
            androidx.media3.exoplayer.J0 r2 = r15.J0
            ax.i1.F$b r2 = r2.b
            java.lang.Object r2 = r2.a
            androidx.media3.exoplayer.r0 r3 = r1.h
            ax.i1.F$b r3 = r3.a
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L47
            androidx.media3.exoplayer.J0 r2 = r15.J0
            ax.i1.F$b r2 = r2.b
            int r4 = r2.b
            r5 = -1
            if (r4 != r5) goto L47
            androidx.media3.exoplayer.r0 r4 = r1.h
            ax.i1.F$b r4 = r4.a
            int r6 = r4.b
            if (r6 != r5) goto L47
            int r2 = r2.e
            int r4 = r4.e
            if (r2 == r4) goto L47
            r2 = 1
            goto L48
        L47:
            r2 = 0
        L48:
            androidx.media3.exoplayer.r0 r4 = r1.h
            ax.i1.F$b r6 = r4.a
            long r7 = r4.b
            long r9 = r4.c
            r13 = r2 ^ 1
            r14 = 0
            r11 = r7
            r5 = r15
            androidx.media3.exoplayer.J0 r2 = r5.e0(r6, r7, r9, r11, r13, r14)
            r5.J0 = r2
            r15.R0()
            r15.e2()
            boolean r2 = r15.x()
            if (r2 == 0) goto L72
            androidx.media3.exoplayer.t0 r2 = r5.t0
            androidx.media3.exoplayer.q0 r2 = r2.x()
            if (r1 != r2) goto L72
            r15.o0()
        L72:
            androidx.media3.exoplayer.J0 r1 = r5.J0
            int r1 = r1.e
            r2 = 3
            if (r1 != r2) goto L7c
            r15.S1()
        L7c:
            r15.v()
            r1 = 1
            goto L2
        L81:
            r5 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C0614n0.w0():void");
    }

    private boolean x() {
        if (!this.B0) {
            return false;
        }
        for (O0 o0 : this.q) {
            if (o0.u()) {
                return true;
            }
        }
        return false;
    }

    private void x0(boolean z) {
        if (this.f1.a == -9223372036854775807L) {
            return;
        }
        if (z || !this.J0.a.equals(this.g1)) {
            ax.P0.N n = this.J0.a;
            this.g1 = n;
            this.t0.B(n);
        }
        n0();
    }

    private void x1(int i) throws C0622s {
        this.R0 = i;
        int X = this.t0.X(this.J0.a, i);
        if ((X & 1) != 0) {
            b1(true);
        } else if ((X & 2) != 0) {
            B();
        }
        Y(false);
    }

    private void y() throws C0622s {
        P0();
    }

    private void y0() throws C0622s {
        C0620q0 x;
        if (this.N0 || !this.B0 || this.i1 || x() || (x = this.t0.x()) == null || x != this.t0.y() || x.k() == null || !x.k().f) {
            return;
        }
        this.t0.c();
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0620q0 z(C0621r0 c0621r0, long j) {
        return new C0620q0(this.c0, j, this.e0, this.g0.h(), this.u0, c0621r0, this.f0, this.f1.a);
    }

    private void z0() throws C0622s {
        C0620q0 y = this.t0.y();
        if (y == null) {
            return;
        }
        int i = 0;
        if (y.k() == null || this.N0) {
            if (y.h.j || this.N0) {
                O0[] o0Arr = this.q;
                int length = o0Arr.length;
                while (i < length) {
                    O0 o0 = o0Arr[i];
                    if (o0.x(y) && o0.r(y)) {
                        long j = y.h.e;
                        o0.O(y, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : y.m() + y.h.e);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (f0()) {
            if (x() && this.t0.x() == this.t0.y()) {
                return;
            }
            if (y.k().f || this.Y0 >= y.k().n()) {
                ax.l1.K p = y.p();
                C0620q0 d2 = this.t0.d();
                ax.l1.K p2 = d2.p();
                ax.P0.N n = this.J0.a;
                f2(n, d2.h.a, n, y.h.a, -9223372036854775807L, false);
                if (d2.f && ((this.B0 && this.h1 != -9223372036854775807L) || d2.a.s() != -9223372036854775807L)) {
                    this.h1 = -9223372036854775807L;
                    boolean z = this.B0 && !this.i1;
                    if (z) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < this.q.length) {
                                if (p2.c(i2) && this.q[i2].m() != -2 && !ax.P0.D.a(p2.c[i2].m().o, p2.c[i2].m().k) && !this.q[i2].u()) {
                                    z = false;
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                    }
                    if (!z) {
                        i1(d2.n());
                        if (d2.s()) {
                            return;
                        }
                        this.t0.N(d2);
                        Y(false);
                        m0();
                        return;
                    }
                }
                O0[] o0Arr2 = this.q;
                int length2 = o0Arr2.length;
                while (i < length2) {
                    o0Arr2[i].F(p, p2, d2.n());
                    i++;
                }
            }
        }
    }

    private void z1(boolean z) throws C0622s {
        if (!z) {
            this.H0 = false;
            this.i0.i(37);
            h hVar = this.I0;
            if (hVar != null) {
                c1(hVar, false);
                this.I0 = null;
            }
        }
        this.G0 = z;
        w();
    }

    public void A1(ax.Y0.Y y) {
        this.i0.j(38, y).a();
    }

    public void C1(ax.Y0.Z z) {
        this.i0.j(5, z).a();
    }

    public void E1(boolean z) {
        this.i0.a(12, z ? 1 : 0, 0).a();
    }

    @Override // ax.i1.f0.a
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public void i(InterfaceC2206C interfaceC2206C) {
        this.i0.j(9, interfaceC2206C).a();
    }

    public void H0() {
        this.i0.d(29).a();
    }

    public void I(long j) {
        this.d1 = j;
    }

    public boolean J0() {
        if (this.L0 || !this.k0.getThread().isAlive()) {
            return true;
        }
        this.L0 = true;
        C0978k c0978k = new C0978k(this.r0);
        this.i0.j(7, c0978k).a();
        return c0978k.c(this.w0);
    }

    public boolean J1(Object obj, long j) {
        if (!this.L0 && this.k0.getThread().isAlive()) {
            C0978k c0978k = new C0978k(this.r0);
            this.i0.j(30, new Pair(obj, c0978k)).a();
            if (j != -9223372036854775807L) {
                return c0978k.c(j);
            }
        }
        return true;
    }

    public void L1(float f2) {
        this.i0.j(32, Float.valueOf(f2)).a();
    }

    public void N0(int i, int i2, ax.i1.g0 g0Var) {
        this.i0.g(20, i, i2, g0Var).a();
    }

    public Looper P() {
        return this.k0;
    }

    public void T1() {
        this.i0.d(6).a();
    }

    @Override // ax.l1.AbstractC2451J.a
    public void a(M0 m0) {
        this.i0.f(26);
    }

    public void a1(ax.P0.N n, int i, long j) {
        this.i0.j(3, new h(n, i, j)).a();
    }

    @Override // ax.l1.AbstractC2451J.a
    public void b() {
        this.i0.f(10);
    }

    @Override // androidx.media3.exoplayer.C0599g.a
    public void c(float f2) {
        this.i0.f(34);
    }

    @Override // androidx.media3.exoplayer.C0599g.a
    public void d(int i) {
        this.i0.a(33, i, 0).a();
    }

    @Override // androidx.media3.exoplayer.I0.d
    public void e() {
        this.i0.i(2);
        this.i0.f(22);
    }

    @Override // ax.i1.InterfaceC2206C.a
    public void f(InterfaceC2206C interfaceC2206C) {
        this.i0.j(8, interfaceC2206C).a();
    }

    @Override // ax.o1.z
    public void g(long j, long j2, C0912v c0912v, MediaFormat mediaFormat) {
        if (this.H0) {
            this.i0.d(37).a();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i;
        InterfaceC2209F.b bVar;
        C0620q0 y;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i2 = message.arg2;
                    s1(z, i2 >> 4, true, i2 & 15);
                    break;
                case 2:
                    E();
                    break;
                case 3:
                    c1((h) message.obj, true);
                    break;
                case 4:
                    u1((ax.P0.G) message.obj);
                    break;
                case 5:
                    D1((ax.Y0.Z) message.obj);
                    break;
                case 6:
                    U1(false, true);
                    break;
                case 7:
                    K0((C0978k) message.obj);
                    return true;
                case 8:
                    b0((InterfaceC2206C) message.obj);
                    break;
                case 9:
                    W((InterfaceC2206C) message.obj);
                    break;
                case 10:
                    O0();
                    break;
                case 11:
                    x1(message.arg1);
                    break;
                case 12:
                    F1(message.arg1 != 0);
                    break;
                case 13:
                    l1(message.arg1 != 0, (C0978k) message.obj);
                    break;
                case 14:
                    f1((K0) message.obj);
                    break;
                case 15:
                    h1((K0) message.obj);
                    break;
                case 16:
                    d0((ax.P0.G) message.obj, false);
                    break;
                case 17:
                    n1((b) message.obj);
                    break;
                case 18:
                    u((b) message.obj, message.arg1);
                    break;
                case 19:
                    C0((c) message.obj);
                    break;
                case 20:
                    M0(message.arg1, message.arg2, (ax.i1.g0) message.obj);
                    break;
                case 21:
                    G1((ax.i1.g0) message.obj);
                    break;
                case 22:
                    B0();
                    break;
                case 23:
                    q1(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    y();
                    break;
                case 26:
                    P0();
                    break;
                case 27:
                    Y1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    v1((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    I0();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    K1(pair.first, (C0978k) pair.second);
                    break;
                case 31:
                    k1((C0894c) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    M1(((Float) message.obj).floatValue());
                    break;
                case 33:
                    U(message.arg1);
                    break;
                case 34:
                    V();
                    break;
                case 35:
                    I1((ax.o1.z) message.obj);
                    break;
                case 36:
                    z1(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.H0 = false;
                    h hVar = this.I0;
                    if (hVar != null) {
                        c1(hVar, false);
                        this.I0 = null;
                        break;
                    }
                    break;
                case 38:
                    B1((ax.Y0.Y) message.obj);
                    break;
            }
        } catch (C0622s e2) {
            e = e2;
            if (e.k0 == 1 && (y = this.t0.y()) != null && e.p0 == null) {
                e = e.c(y.h.a);
            }
            if (e.k0 == 1 && (bVar = e.p0) != null && j0(e.m0, bVar)) {
                this.i1 = true;
                B();
                C0620q0 x = this.t0.x();
                C0620q0 u = this.t0.u();
                if (this.t0.u() != x) {
                    while (u != null && u.k() != x) {
                        u = u.k();
                    }
                }
                this.t0.N(u);
                if (this.J0.e != 4) {
                    m0();
                    this.i0.f(2);
                }
            } else {
                C0622s c0622s = this.c1;
                if (c0622s != null) {
                    c0622s.addSuppressed(e);
                    e = this.c1;
                }
                if (e.k0 == 1 && this.t0.u() != this.t0.y()) {
                    while (this.t0.u() != this.t0.y()) {
                        this.t0.b();
                    }
                    C0620q0 c0620q0 = (C0620q0) C0968a.e(this.t0.u());
                    p0();
                    C0621r0 c0621r0 = c0620q0.h;
                    InterfaceC2209F.b bVar2 = c0621r0.a;
                    long j = c0621r0.b;
                    this.J0 = e0(bVar2, j, c0621r0.c, j, true, 0);
                }
                if (e.q0 && (this.c1 == null || (i = e.q) == 5004 || i == 5003)) {
                    C0987u.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.c1 == null) {
                        this.c1 = e;
                    }
                    InterfaceC0984q interfaceC0984q = this.i0;
                    interfaceC0984q.b(interfaceC0984q.j(25, e));
                } else {
                    C0987u.d("ExoPlayerImplInternal", "Playback error", e);
                    U1(true, false);
                    this.J0 = this.J0.f(e);
                }
            }
        } catch (ax.P0.E e3) {
            int i3 = e3.c0;
            if (i3 == 1) {
                r2 = e3.q ? 3001 : 3003;
            } else if (i3 == 4) {
                r2 = e3.q ? 3002 : 3004;
            }
            X(e3, r2);
        } catch (ax.U0.h e4) {
            X(e4, e4.q);
        } catch (InterfaceC1465n.a e5) {
            X(e5, e5.q);
        } catch (C2212b e6) {
            X(e6, 1002);
        } catch (IOException e7) {
            X(e7, 2000);
        } catch (RuntimeException e8) {
            C0622s f2 = C0622s.f(e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            C0987u.d("ExoPlayerImplInternal", "Playback error", f2);
            U1(true, false);
            this.J0 = this.J0.f(f2);
        }
        p0();
        return true;
    }

    @Override // androidx.media3.exoplayer.C0607k.a
    public void j(ax.P0.G g2) {
        this.i0.j(16, g2).a();
    }

    public void j1(C0894c c0894c, boolean z) {
        this.i0.g(31, z ? 1 : 0, 0, c0894c).a();
    }

    @Override // androidx.media3.exoplayer.K0.a
    public void l(K0 k0) {
        if (!this.L0 && this.k0.getThread().isAlive()) {
            this.i0.j(14, k0).a();
        } else {
            C0987u.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            k0.j(false);
        }
    }

    public void o1(List<I0.c> list, int i, long j, ax.i1.g0 g0Var) {
        this.i0.j(17, new b(list, g0Var, i, j, null)).a();
    }

    public void r1(boolean z, int i, int i2) {
        this.i0.a(1, z ? 1 : 0, i | (i2 << 4)).a();
    }

    public void t1(ax.P0.G g2) {
        this.i0.j(4, g2).a();
    }

    public void w1(int i) {
        this.i0.a(11, i, 0).a();
    }

    public void y1(boolean z) {
        this.i0.j(36, Boolean.valueOf(z)).a();
    }
}
