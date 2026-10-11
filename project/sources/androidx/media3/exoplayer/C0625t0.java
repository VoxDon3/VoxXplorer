package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.C0620q0;
import androidx.media3.exoplayer.ExoPlayer;
import ax.P0.N;
import ax.S0.C0968a;
import ax.S0.InterfaceC0984q;
import ax.Z0.InterfaceC1200a;
import ax.i1.InterfaceC2206C;
import ax.i1.InterfaceC2209F;
import ax.r7.AbstractC2991z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0625t0 {
    private final InterfaceC1200a c;
    private final InterfaceC0984q d;
    private final C0620q0.a e;
    private long f;
    private int g;
    private boolean h;
    private ExoPlayer.c i;
    private C0620q0 j;
    private C0620q0 k;
    private C0620q0 l;
    private C0620q0 m;
    private C0620q0 n;
    private int o;
    private Object p;
    private long q;
    private final N.b a = new N.b();
    private final N.c b = new N.c();
    private List<C0620q0> r = new ArrayList();

    public C0625t0(InterfaceC1200a interfaceC1200a, InterfaceC0984q interfaceC0984q, C0620q0.a aVar, ExoPlayer.c cVar) {
        this.c = interfaceC1200a;
        this.d = interfaceC0984q;
        this.e = aVar;
        this.i = cVar;
    }

    private boolean A(Object obj, ax.P0.N n) {
        int c = n.h(obj, this.a).c();
        int p = this.a.p();
        if (c <= 0 || !this.a.s(p)) {
            return false;
        }
        return c > 1 || this.a.f(p) != Long.MIN_VALUE;
    }

    private boolean C(InterfaceC2209F.b bVar) {
        return !bVar.b() && bVar.e == -1;
    }

    private boolean D(ax.P0.N n, InterfaceC2209F.b bVar, boolean z) {
        int b = n.b(bVar.a);
        return !n.n(n.f(b, this.a).c, this.b).i && n.r(b, this.a, this.b, this.g, this.h) && z;
    }

    private boolean E(ax.P0.N n, InterfaceC2209F.b bVar) {
        if (C(bVar)) {
            return n.n(n.h(bVar.a, this.a).c, this.b).o == n.b(bVar.a);
        }
        return false;
    }

    private static boolean H(N.b bVar) {
        int c = bVar.c();
        if (c != 0 && ((c != 1 || !bVar.r(0)) && bVar.s(bVar.p()))) {
            long j = 0;
            if (bVar.e(0L) == -1) {
                if (bVar.d == 0) {
                    return true;
                }
                int i = c - (bVar.r(c + (-1)) ? 2 : 1);
                for (int i2 = 0; i2 <= i; i2++) {
                    j += bVar.i(i2);
                }
                if (bVar.d <= j) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        final AbstractC2991z.a r = AbstractC2991z.r();
        for (C0620q0 c0620q0 = this.j; c0620q0 != null; c0620q0 = c0620q0.k()) {
            r.a(c0620q0.h.a);
        }
        C0620q0 c0620q02 = this.k;
        final InterfaceC2209F.b bVar = c0620q02 == null ? null : c0620q02.h.a;
        this.d.c(new Runnable() { // from class: androidx.media3.exoplayer.s0
            @Override // java.lang.Runnable
            public final void run() {
                C0625t0.this.c.m0(r.k(), bVar);
            }
        });
    }

    private void L(List<C0620q0> list) {
        for (int i = 0; i < this.r.size(); i++) {
            this.r.get(i).x();
        }
        this.r = list;
        this.n = null;
        I();
    }

    private C0620q0 O(C0621r0 c0621r0) {
        for (int i = 0; i < this.r.size(); i++) {
            if (this.r.get(i).d(c0621r0)) {
                return this.r.remove(i);
            }
        }
        return null;
    }

    private static InterfaceC2209F.b P(ax.P0.N n, Object obj, long j, long j2, N.c cVar, N.b bVar) {
        n.h(obj, bVar);
        n.n(bVar.c, cVar);
        for (int b = n.b(obj); H(bVar) && b <= cVar.o; b++) {
            n.g(b, bVar, true);
            obj = C0968a.e(bVar.b);
        }
        n.h(obj, bVar);
        int e = bVar.e(j);
        return e == -1 ? new InterfaceC2209F.b(obj, j2, bVar.d(j)) : new InterfaceC2209F.b(obj, e, bVar.l(e), j2);
    }

    private long R(ax.P0.N n, Object obj) {
        int b;
        int i = n.h(obj, this.a).c;
        Object obj2 = this.p;
        if (obj2 != null && (b = n.b(obj2)) != -1 && n.f(b, this.a).c == i) {
            return this.q;
        }
        for (C0620q0 c0620q0 = this.j; c0620q0 != null; c0620q0 = c0620q0.k()) {
            if (c0620q0.b.equals(obj)) {
                return c0620q0.h.a.d;
            }
        }
        for (C0620q0 c0620q02 = this.j; c0620q02 != null; c0620q02 = c0620q02.k()) {
            int b2 = n.b(c0620q02.b);
            if (b2 != -1 && n.f(b2, this.a).c == i) {
                return c0620q02.h.a.d;
            }
        }
        long S = S(obj);
        if (S != -1) {
            return S;
        }
        long j = this.f;
        this.f = 1 + j;
        if (this.j == null) {
            this.p = obj;
            this.q = j;
        }
        return j;
    }

    private long S(Object obj) {
        for (int i = 0; i < this.r.size(); i++) {
            C0620q0 c0620q0 = this.r.get(i);
            if (c0620q0.b.equals(obj)) {
                return c0620q0.h.a.d;
            }
        }
        return -1L;
    }

    private int U(ax.P0.N n) {
        ax.P0.N n2;
        C0620q0 c0620q0 = this.j;
        if (c0620q0 == null) {
            return 0;
        }
        int b = n.b(c0620q0.b);
        while (true) {
            n2 = n;
            b = n2.d(b, this.a, this.b, this.g, this.h);
            while (((C0620q0) C0968a.e(c0620q0)).k() != null && !c0620q0.h.h) {
                c0620q0 = c0620q0.k();
            }
            C0620q0 k = c0620q0.k();
            if (b == -1 || k == null || n2.b(k.b) != b) {
                break;
            }
            c0620q0 = k;
            n = n2;
        }
        int N = N(c0620q0);
        c0620q0.h = z(n2, c0620q0.h);
        return N;
    }

    static boolean e(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    private boolean f(C0621r0 c0621r0, C0621r0 c0621r02) {
        return c0621r0.b == c0621r02.b && c0621r0.a.equals(c0621r02.a);
    }

    private Pair<Object, Long> i(ax.P0.N n, Object obj, long j) {
        int e = n.e(n.h(obj, this.a).c, this.g, this.h);
        if (e != -1) {
            return n.k(this.b, this.a, e, -9223372036854775807L, j);
        }
        return null;
    }

    private C0621r0 j(J0 j0) {
        return o(j0.a, j0.b, j0.c, j0.s);
    }

    private C0621r0 k(ax.P0.N n, C0620q0 c0620q0, long j) {
        Object obj;
        long j2;
        C0621r0 c0621r0 = c0620q0.h;
        int d = n.d(n.b(c0621r0.a.a), this.a, this.b, this.g, this.h);
        if (d == -1) {
            return null;
        }
        int i = n.g(d, this.a, true).c;
        Object e = C0968a.e(this.a.b);
        long j3 = c0621r0.a.d;
        long j4 = 0;
        if (n.n(i, this.b).n == d) {
            Pair<Object, Long> k = n.k(this.b, this.a, i, -9223372036854775807L, Math.max(0L, j));
            if (k == null) {
                return null;
            }
            Object obj2 = k.first;
            long longValue = ((Long) k.second).longValue();
            C0620q0 k2 = c0620q0.k();
            if (k2 == null || !k2.b.equals(obj2)) {
                long S = S(obj2);
                if (S == -1) {
                    S = this.f;
                    this.f = 1 + S;
                }
                j3 = S;
            } else {
                j3 = k2.h.a.d;
            }
            obj = obj2;
            j2 = longValue;
            j4 = -9223372036854775807L;
        } else {
            obj = e;
            j2 = 0;
        }
        InterfaceC2209F.b P = P(n, obj, j2, j3, this.b, this.a);
        if (j4 != -9223372036854775807L && c0621r0.c != -9223372036854775807L) {
            boolean A = A(c0621r0.a.a, n);
            if (P.b() && A) {
                j4 = c0621r0.c;
            } else if (A) {
                j2 = c0621r0.c;
            }
        }
        return o(n, P, j4, j2);
    }

    private C0621r0 l(ax.P0.N n, C0620q0 c0620q0, long j) {
        C0621r0 c0621r0 = c0620q0.h;
        long m = (c0620q0.m() + c0621r0.e) - j;
        return c0621r0.h ? k(n, c0620q0, m) : m(n, c0620q0, m);
    }

    private C0621r0 m(ax.P0.N n, C0620q0 c0620q0, long j) {
        C0621r0 c0621r0 = c0620q0.h;
        InterfaceC2209F.b bVar = c0621r0.a;
        n.h(bVar.a, this.a);
        boolean z = c0621r0.g;
        if (!bVar.b()) {
            int i = bVar.e;
            if (i != -1 && this.a.r(i)) {
                return k(n, c0620q0, j);
            }
            int l = this.a.l(bVar.e);
            boolean z2 = this.a.s(bVar.e) && this.a.h(bVar.e, l) == 3;
            if (l == this.a.a(bVar.e) || z2) {
                return q(n, bVar.a, s(n, bVar.a, bVar.e), c0621r0.e, bVar.d, false);
            }
            return p(n, bVar.a, bVar.e, l, c0621r0.e, bVar.d, z);
        }
        int i2 = bVar.b;
        int a = this.a.a(i2);
        if (a == -1) {
            return null;
        }
        int m = this.a.m(i2, bVar.c);
        if (m < a) {
            return p(n, bVar.a, i2, m, c0621r0.c, bVar.d, z);
        }
        long j2 = c0621r0.c;
        if (j2 == -9223372036854775807L) {
            N.c cVar = this.b;
            N.b bVar2 = this.a;
            Pair<Object, Long> k = n.k(cVar, bVar2, bVar2.c, -9223372036854775807L, Math.max(0L, j));
            if (k == null) {
                return null;
            }
            j2 = ((Long) k.second).longValue();
        }
        return q(n, bVar.a, Math.max(s(n, bVar.a, bVar.b), j2), c0621r0.c, bVar.d, z);
    }

    private C0621r0 o(ax.P0.N n, InterfaceC2209F.b bVar, long j, long j2) {
        n.h(bVar.a, this.a);
        return bVar.b() ? p(n, bVar.a, bVar.b, bVar.c, j, bVar.d, false) : q(n, bVar.a, j2, j, bVar.d, false);
    }

    private C0621r0 p(ax.P0.N n, Object obj, int i, int i2, long j, long j2, boolean z) {
        InterfaceC2209F.b bVar = new InterfaceC2209F.b(obj, i, i2, j2);
        long b = n.h(bVar.a, this.a).b(bVar.b, bVar.c);
        long g = i2 == this.a.l(i) ? this.a.g() : 0L;
        boolean s = this.a.s(bVar.b);
        if (b != -9223372036854775807L && g >= b) {
            g = Math.max(0L, b - 1);
        }
        return new C0621r0(bVar, g, j, -9223372036854775807L, b, z, s, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r9.s(r9.p()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.media3.exoplayer.C0621r0 q(ax.P0.N r26, java.lang.Object r27, long r28, long r30, long r32, boolean r34) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C0625t0.q(ax.P0.N, java.lang.Object, long, long, long, boolean):androidx.media3.exoplayer.r0");
    }

    private C0621r0 r(ax.P0.N n, Object obj, long j, long j2) {
        InterfaceC2209F.b P = P(n, obj, j, j2, this.b, this.a);
        return P.b() ? p(n, P.a, P.b, P.c, j, P.d, false) : q(n, P.a, j, -9223372036854775807L, P.d, false);
    }

    private long s(ax.P0.N n, Object obj, int i) {
        n.h(obj, this.a);
        long f = this.a.f(i);
        return f == Long.MIN_VALUE ? this.a.d : f + this.a.i(i);
    }

    public void B(ax.P0.N n) {
        C0620q0 c0620q0;
        if (this.i.a == -9223372036854775807L || (c0620q0 = this.m) == null) {
            M();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair<Object, Long> i = i(n, c0620q0.h.a.a, 0L);
        if (i != null && !n.n(n.h(i.first, this.a).c, this.b).f()) {
            long S = S(i.first);
            if (S == -1) {
                S = this.f;
                this.f = 1 + S;
            }
            C0621r0 r = r(n, i.first, ((Long) i.second).longValue(), S);
            C0620q0 O = O(r);
            if (O == null) {
                O = this.e.a(r, (c0620q0.m() + c0620q0.h.e) - r.b);
            }
            arrayList.add(O);
        }
        L(arrayList);
    }

    public boolean F(InterfaceC2206C interfaceC2206C) {
        C0620q0 c0620q0 = this.m;
        return c0620q0 != null && c0620q0.a == interfaceC2206C;
    }

    public boolean G(InterfaceC2206C interfaceC2206C) {
        C0620q0 c0620q0 = this.n;
        return c0620q0 != null && c0620q0.a == interfaceC2206C;
    }

    public void I() {
        C0620q0 c0620q0 = this.n;
        if (c0620q0 == null || c0620q0.t()) {
            this.n = null;
            for (int i = 0; i < this.r.size(); i++) {
                C0620q0 c0620q02 = this.r.get(i);
                if (!c0620q02.t()) {
                    this.n = c0620q02;
                    return;
                }
            }
        }
    }

    public void K(long j) {
        C0620q0 c0620q0 = this.m;
        if (c0620q0 != null) {
            c0620q0.w(j);
        }
    }

    public void M() {
        if (this.r.isEmpty()) {
            return;
        }
        L(new ArrayList());
    }

    public int N(C0620q0 c0620q0) {
        C0968a.i(c0620q0);
        int i = 0;
        if (c0620q0.equals(this.m)) {
            return 0;
        }
        this.m = c0620q0;
        while (c0620q0.k() != null) {
            c0620q0 = (C0620q0) C0968a.e(c0620q0.k());
            if (c0620q0 == this.k) {
                C0620q0 c0620q02 = this.j;
                this.k = c0620q02;
                this.l = c0620q02;
                i = 3;
            }
            if (c0620q0 == this.l) {
                this.l = this.k;
                i |= 2;
            }
            c0620q0.x();
            this.o--;
        }
        ((C0620q0) C0968a.e(this.m)).A(null);
        J();
        return i;
    }

    public InterfaceC2209F.b Q(ax.P0.N n, Object obj, long j) {
        long R = R(n, obj);
        n.h(obj, this.a);
        n.n(this.a.c, this.b);
        boolean z = false;
        for (int b = n.b(obj); b >= this.b.n; b--) {
            n.g(b, this.a, true);
            boolean z2 = this.a.c() > 0;
            z |= z2;
            N.b bVar = this.a;
            if (bVar.e(bVar.d) != -1) {
                obj = C0968a.e(this.a.b);
            }
            if (z && (!z2 || this.a.d != 0)) {
                break;
            }
        }
        return P(n, obj, j, R, this.b, this.a);
    }

    public boolean T() {
        C0620q0 c0620q0 = this.m;
        if (c0620q0 != null) {
            return !c0620q0.h.j && c0620q0.s() && this.m.h.e != -9223372036854775807L && this.o < 100;
        }
        return true;
    }

    public void V(ax.P0.N n, ExoPlayer.c cVar) {
        this.i = cVar;
        B(n);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int W(ax.P0.N r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.media3.exoplayer.q0 r2 = r0.j
            r3 = 0
        L7:
            if (r2 == 0) goto Lb6
            androidx.media3.exoplayer.r0 r5 = r2.h
            if (r3 != 0) goto L14
            androidx.media3.exoplayer.r0 r3 = r0.z(r1, r5)
            r6 = r19
            goto L25
        L14:
            r6 = r19
            androidx.media3.exoplayer.r0 r8 = r0.l(r1, r3, r6)
            if (r8 == 0) goto Lb1
            boolean r9 = r0.f(r5, r8)
            if (r9 != 0) goto L24
            goto Lb1
        L24:
            r3 = r8
        L25:
            long r8 = r5.c
            androidx.media3.exoplayer.r0 r8 = r3.a(r8)
            r2.h = r8
            long r8 = r5.e
            long r10 = r3.e
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto La6
            r2.E()
            long r6 = r3.e
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L49
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L4d
        L49:
            long r6 = r2.D(r6)
        L4d:
            androidx.media3.exoplayer.q0 r1 = r0.k
            r10 = 1
            r11 = -9223372036854775808
            if (r2 != r1) goto L64
            androidx.media3.exoplayer.r0 r1 = r2.h
            boolean r1 = r1.g
            if (r1 != 0) goto L64
            int r1 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r1 == 0) goto L62
            int r1 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r1 < 0) goto L64
        L62:
            r1 = 1
            goto L65
        L64:
            r1 = 0
        L65:
            androidx.media3.exoplayer.q0 r13 = r0.l
            if (r2 != r13) goto L73
            int r13 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r13 == 0) goto L71
            int r13 = (r23 > r6 ? 1 : (r23 == r6 ? 0 : -1))
            if (r13 < 0) goto L73
        L71:
            r6 = 1
            goto L74
        L73:
            r6 = 0
        L74:
            int r2 = r0.N(r2)
            if (r2 == 0) goto L7b
            return r2
        L7b:
            long r13 = r5.e
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            r15 = 0
            if (r2 != 0) goto L94
            long r4 = r5.d
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 != 0) goto L94
            long r2 = r3.d
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 == 0) goto L94
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L94
            r2 = 1
            goto L95
        L94:
            r2 = 0
        L95:
            if (r1 == 0) goto L9f
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 != 0) goto L9d
            if (r2 == 0) goto L9f
        L9d:
            r4 = 1
            goto La0
        L9f:
            r4 = 0
        La0:
            if (r6 == 0) goto La5
            r1 = r4 | 2
            return r1
        La5:
            return r4
        La6:
            androidx.media3.exoplayer.q0 r3 = r2.k()
            r16 = r3
            r3 = r2
            r2 = r16
            goto L7
        Lb1:
            int r1 = r0.N(r3)
            return r1
        Lb6:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C0625t0.W(ax.P0.N, long, long, long):int");
    }

    public int X(ax.P0.N n, int i) {
        this.g = i;
        return U(n);
    }

    public int Y(ax.P0.N n, boolean z) {
        this.h = z;
        return U(n);
    }

    public C0620q0 b() {
        C0620q0 c0620q0 = this.j;
        if (c0620q0 == null) {
            return null;
        }
        if (c0620q0 == this.k) {
            this.k = c0620q0.k();
        }
        C0620q0 c0620q02 = this.j;
        if (c0620q02 == this.l) {
            this.l = c0620q02.k();
        }
        this.j.x();
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.m = null;
            C0620q0 c0620q03 = this.j;
            this.p = c0620q03.b;
            this.q = c0620q03.h.a.d;
        }
        this.j = this.j.k();
        J();
        return this.j;
    }

    public C0620q0 c() {
        this.l = ((C0620q0) C0968a.i(this.l)).k();
        J();
        return (C0620q0) C0968a.i(this.l);
    }

    public C0620q0 d() {
        C0620q0 c0620q0 = this.l;
        C0620q0 c0620q02 = this.k;
        if (c0620q0 == c0620q02) {
            this.l = ((C0620q0) C0968a.i(c0620q02)).k();
        }
        this.k = ((C0620q0) C0968a.i(this.k)).k();
        J();
        return (C0620q0) C0968a.i(this.k);
    }

    public void g() {
        if (this.o == 0) {
            return;
        }
        C0620q0 c0620q0 = (C0620q0) C0968a.i(this.j);
        this.p = c0620q0.b;
        this.q = c0620q0.h.a.d;
        while (c0620q0 != null) {
            c0620q0.x();
            c0620q0 = c0620q0.k();
        }
        this.j = null;
        this.m = null;
        this.k = null;
        this.l = null;
        this.o = 0;
        J();
    }

    public C0620q0 h(C0621r0 c0621r0) {
        C0620q0 c0620q0 = this.m;
        long m = c0620q0 == null ? 1000000000000L : (c0620q0.m() + this.m.h.e) - c0621r0.b;
        C0620q0 O = O(c0621r0);
        if (O == null) {
            O = this.e.a(c0621r0, m);
        } else {
            O.h = c0621r0;
            O.B(m);
        }
        C0620q0 c0620q02 = this.m;
        if (c0620q02 != null) {
            c0620q02.A(O);
        } else {
            this.j = O;
            this.k = O;
            this.l = O;
        }
        this.p = null;
        this.m = O;
        this.o++;
        J();
        return O;
    }

    public C0620q0 n() {
        return this.m;
    }

    public C0621r0 t(long j, J0 j0) {
        C0620q0 c0620q0 = this.m;
        return c0620q0 == null ? j(j0) : l(j0.a, c0620q0, j);
    }

    public C0620q0 u() {
        return this.j;
    }

    public C0620q0 v(InterfaceC2206C interfaceC2206C) {
        for (int i = 0; i < this.r.size(); i++) {
            C0620q0 c0620q0 = this.r.get(i);
            if (c0620q0.a == interfaceC2206C) {
                return c0620q0;
            }
        }
        return null;
    }

    public C0620q0 w() {
        return this.n;
    }

    public C0620q0 x() {
        return this.l;
    }

    public C0620q0 y() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.C0621r0 z(ax.P0.N r18, androidx.media3.exoplayer.C0621r0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            ax.i1.F$b r3 = r2.a
            boolean r13 = r0.C(r3)
            boolean r14 = r0.E(r1, r3)
            boolean r15 = r0.D(r1, r3, r13)
            ax.i1.F$b r4 = r2.a
            java.lang.Object r4 = r4.a
            ax.P0.N$b r5 = r0.a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            ax.P0.N$b r7 = r0.a
            long r7 = r7.f(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            ax.P0.N$b r1 = r0.a
            int r4 = r3.b
            int r5 = r3.c
            long r4 = r1.b(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            ax.P0.N$b r1 = r0.a
            long r4 = r1.k()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            ax.P0.N$b r1 = r0.a
            int r4 = r3.b
            boolean r1 = r1.s(r4)
            r12 = r1
            goto L7d
        L6c:
            int r1 = r3.e
            if (r1 == r6) goto L7b
            ax.P0.N$b r4 = r0.a
            boolean r1 = r4.s(r1)
            if (r1 == 0) goto L7b
            r1 = 1
            r12 = 1
            goto L7d
        L7b:
            r1 = 0
            r12 = 0
        L7d:
            androidx.media3.exoplayer.r0 r1 = new androidx.media3.exoplayer.r0
            r5 = r3
            long r3 = r2.b
            r11 = r5
            long r5 = r2.c
            boolean r2 = r2.f
            r16 = r11
            r11 = r2
            r2 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C0625t0.z(ax.P0.N, androidx.media3.exoplayer.r0):androidx.media3.exoplayer.r0");
    }
}
