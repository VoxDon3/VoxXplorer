package ax.K1;

import android.net.Uri;
import ax.N1.t;
import ax.P0.C;
import ax.P0.C0912v;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.d0;
import ax.T0.e;
import ax.q1.C2843c;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.F;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.M;
import ax.q1.N;
import ax.q1.S;
import ax.q1.U;
import ax.q1.V;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class n implements ax.q1.r, N {

    @Deprecated
    public static final InterfaceC2863x G = new InterfaceC2863x() { // from class: ax.K1.m
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final ax.q1.r[] c() {
            return n.p();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ ax.q1.r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private a[] A;
    private long[][] B;
    private int C;
    private long D;
    private int E;
    private ax.F1.a F;
    private final t.a a;
    private final int b;
    private final G c;
    private final G d;
    private final G e;
    private final G f;
    private final ArrayDeque<e.b> g;
    private final q h;
    private final List<C.a> i;
    private AbstractC2991z<S> j;
    private int k;
    private int l;
    private long m;
    private int n;
    private G o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private long w;
    private boolean x;
    private long y;
    private InterfaceC2859t z;

    private static final class a {
        public final t a;
        public final w b;
        public final U c;
        public final V d;
        public int e;

        public a(t tVar, w wVar, U u) {
            this.a = tVar;
            this.b = wVar;
            this.c = u;
            this.d = "audio/true-hd".equals(tVar.g.o) ? new V() : null;
        }
    }

    @Deprecated
    public n() {
        this(t.a.a, 16);
    }

    private static long A(w wVar, long j, long j2) {
        int y = y(wVar, j);
        return y == -1 ? j2 : Math.min(wVar.c[y], j2);
    }

    private void B(C c) {
        ax.T0.c a2 = j.a(c, "auxiliary.tracks.interleaved");
        if (a2 == null || a2.b[0] != 0) {
            return;
        }
        this.y = this.w + 16;
    }

    private void C(InterfaceC2858s interfaceC2858s) throws IOException {
        this.e.X(8);
        interfaceC2858s.p(this.e.f(), 0, 8);
        b.g(this.e);
        interfaceC2858s.n(this.e.g());
        interfaceC2858s.m();
    }

    private void D(long j) throws E {
        while (!this.g.isEmpty() && this.g.peek().b == j) {
            e.b pop = this.g.pop();
            if (pop.a == 1836019574) {
                G(pop);
                this.g.clear();
                if (!this.v) {
                    this.k = 2;
                }
            } else if (!this.g.isEmpty()) {
                this.g.peek().b(pop);
            }
        }
        if (this.k != 2) {
            u();
        }
    }

    private void E() {
        if (this.E != 2 || (this.b & 2) == 0) {
            return;
        }
        U u = this.z.u(0, 4);
        ax.F1.a aVar = this.F;
        u.e(new C0912v.b().r0(aVar == null ? null : new C(aVar)).P());
        this.z.o();
        this.z.h(new N.b(-9223372036854775807L));
    }

    private static int F(G g) {
        g.b0(8);
        int q = q(g.v());
        if (q != 0) {
            return q;
        }
        g.c0(4);
        while (g.a() > 0) {
            int q2 = q(g.v());
            if (q2 != 0) {
                return q2;
            }
        }
        return 0;
    }

    private void G(e.b bVar) throws E {
        List<Integer> list;
        C c;
        C c2;
        int i;
        List<w> list2;
        F f;
        C c3;
        long j;
        e.b d = bVar.d(1835365473);
        List<Integer> arrayList = new ArrayList<>();
        if (d != null) {
            C u = b.u(d);
            if (this.x) {
                C0968a.i(u);
                B(u);
                arrayList = v(u);
            } else if (O(u)) {
                this.v = true;
                return;
            }
            c = u;
            list = arrayList;
        } else {
            list = arrayList;
            c = null;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.E == 1;
        F f2 = new F();
        e.c e = bVar.e(1969517665);
        if (e != null) {
            C I = b.I(e);
            f2.c(I);
            c2 = I;
        } else {
            c2 = null;
        }
        C c4 = new C(b.w(((e.c) C0968a.e(bVar.e(1836476516))).b));
        List<w> H = b.H(bVar, f2, -9223372036854775807L, null, (this.b & 1) != 0, z, new InterfaceC2879f() { // from class: ax.K1.l
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return n.o((t) obj);
            }
        });
        if (this.x) {
            C0968a.h(list.size() == H.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(H.size())));
        }
        String b = k.b(H);
        long j2 = -9223372036854775807L;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i2 < H.size()) {
            w wVar = H.get(i2);
            if (wVar.b == 0) {
                list2 = H;
                f = f2;
                i = i4;
            } else {
                t tVar = wVar.a;
                i = i4 + 1;
                list2 = H;
                a aVar = new a(tVar, wVar, this.z.u(i4, tVar.b));
                f = f2;
                long j3 = tVar.e;
                if (j3 == -9223372036854775807L) {
                    j3 = wVar.h;
                }
                aVar.c.d(j3);
                long max = Math.max(j2, j3);
                int i5 = "audio/true-hd".equals(tVar.g.o) ? wVar.e * 16 : wVar.e + 30;
                C0912v.b b2 = tVar.g.b();
                b2.o0(i5);
                if (tVar.b == 2) {
                    int i6 = tVar.g.f;
                    if ((this.b & 8) != 0) {
                        i6 |= i3 == -1 ? 1 : 2;
                    }
                    if (this.x) {
                        i6 |= 32768;
                        b2.R(list.get(i2).intValue());
                    }
                    b2.w0(i6);
                }
                j.l(tVar.b, f, b2);
                int i7 = tVar.b;
                C c5 = tVar.g.l;
                if (this.i.isEmpty()) {
                    j = max;
                    c3 = null;
                } else {
                    j = max;
                    c3 = new C(this.i);
                }
                j.m(i7, c, b2, c5, c3, c2, c4);
                b2.W(b);
                aVar.c.e(b2.P());
                if (tVar.b == 2 && i3 == -1) {
                    i3 = arrayList2.size();
                }
                arrayList2.add(aVar);
                j2 = j;
            }
            i2++;
            f2 = f;
            i4 = i;
            H = list2;
        }
        this.C = i3;
        this.D = j2;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.A = aVarArr;
        this.B = r(aVarArr);
        this.z.o();
        this.z.h(this);
    }

    private void H(long j) {
        if (this.l == 1836086884) {
            int i = this.n;
            this.F = new ax.F1.a(0L, j, -9223372036854775807L, j + i, this.m - i);
        }
    }

    private boolean I(InterfaceC2858s interfaceC2858s) throws IOException {
        e.b peek;
        if (this.n == 0) {
            if (!interfaceC2858s.e(this.f.f(), 0, 8, true)) {
                E();
                return false;
            }
            this.n = 8;
            this.f.b0(0);
            this.m = this.f.O();
            this.l = this.f.v();
        }
        long j = this.m;
        if (j == 1) {
            interfaceC2858s.readFully(this.f.f(), 8, 8);
            this.n += 8;
            this.m = this.f.T();
        } else if (j == 0) {
            long length = interfaceC2858s.getLength();
            if (length == -1 && (peek = this.g.peek()) != null) {
                length = peek.b;
            }
            if (length != -1) {
                this.m = (length - interfaceC2858s.getPosition()) + this.n;
            }
        }
        if (this.m < this.n) {
            throw E.d("Atom size less than header length (unsupported).");
        }
        if (M(this.l)) {
            long position = interfaceC2858s.getPosition();
            long j2 = this.m;
            int i = this.n;
            long j3 = (position + j2) - i;
            if (j2 != i && this.l == 1835365473) {
                C(interfaceC2858s);
            }
            this.g.push(new e.b(this.l, j3));
            if (this.m == this.n) {
                D(j3);
            } else {
                u();
            }
        } else if (N(this.l)) {
            C0968a.g(this.n == 8);
            C0968a.g(this.m <= 2147483647L);
            G g = new G((int) this.m);
            System.arraycopy(this.f.f(), 0, g.f(), 0, 8);
            this.o = g;
            this.k = 1;
        } else {
            H(interfaceC2858s.getPosition() - this.n);
            this.o = null;
            this.k = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean J(ax.q1.InterfaceC2858s r10, ax.q1.M r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.m
            int r2 = r9.n
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            ax.S0.G r4 = r9.o
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L46
            byte[] r7 = r4.f()
            int r8 = r9.n
            int r1 = (int) r0
            r10.readFully(r7, r8, r1)
            int r10 = r9.l
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2b
            r9.u = r5
            int r10 = F(r4)
            r9.E = r10
            goto L5e
        L2b:
            java.util.ArrayDeque<ax.T0.e$b> r10 = r9.g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L5e
            java.util.ArrayDeque<ax.T0.e$b> r10 = r9.g
            java.lang.Object r10 = r10.peek()
            ax.T0.e$b r10 = (ax.T0.e.b) r10
            ax.T0.e$c r0 = new ax.T0.e$c
            int r1 = r9.l
            r0.<init>(r1, r4)
            r10.c(r0)
            goto L5e
        L46:
            boolean r4 = r9.u
            if (r4 != 0) goto L53
            int r4 = r9.l
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L53
            r9.E = r5
        L53:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r1 = (int) r0
            r10.n(r1)
        L5e:
            r10 = 0
            goto L68
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.a = r7
            r10 = 1
        L68:
            r9.D(r2)
            boolean r0 = r9.v
            if (r0 == 0) goto L78
            r9.x = r5
            long r0 = r9.w
            r11.a = r0
            r9.v = r6
            r10 = 1
        L78:
            if (r10 == 0) goto L80
            int r10 = r9.k
            r11 = 2
            if (r10 == r11) goto L80
            return r5
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.K1.n.J(ax.q1.s, ax.q1.M):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    private int K(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        U.a aVar;
        ?? r1;
        int i;
        long position = interfaceC2858s.getPosition();
        if (this.p == -1) {
            int z = z(position);
            this.p = z;
            if (z == -1) {
                return -1;
            }
        }
        a aVar2 = this.A[this.p];
        U u = aVar2.c;
        int i2 = aVar2.e;
        w wVar = aVar2.b;
        long j = wVar.c[i2] + this.y;
        int i3 = wVar.d[i2];
        V v = aVar2.d;
        long j2 = (j - position) + this.q;
        if (j2 < 0 || j2 >= 262144) {
            m.a = j;
            return 1;
        }
        if (aVar2.a.h == 1) {
            j2 += 8;
            i3 -= 8;
        }
        interfaceC2858s.n((int) j2);
        if (!s(aVar2.a.g)) {
            this.t = true;
        }
        t tVar = aVar2.a;
        if (tVar.k == 0) {
            aVar = null;
            if ("audio/ac4".equals(tVar.g.o)) {
                if (this.r == 0) {
                    C2843c.b(i3, this.e);
                    u.g(this.e, 7);
                    this.r += 7;
                }
                i3 += 7;
            } else if (v != null) {
                v.d(interfaceC2858s);
            }
            while (true) {
                int i4 = this.r;
                if (i4 >= i3) {
                    break;
                }
                int a2 = u.a(interfaceC2858s, i3 - i4, false);
                this.q += a2;
                this.r += a2;
                this.s -= a2;
            }
        } else {
            byte[] f = this.d.f();
            f[0] = 0;
            f[1] = 0;
            f[2] = 0;
            int i5 = 4 - aVar2.a.k;
            i3 += i5;
            while (this.r < i3) {
                int i6 = this.s;
                if (i6 == 0) {
                    t tVar2 = aVar2.a;
                    int i7 = tVar2.k;
                    if (this.t || ax.T0.h.o(tVar2.g) + i7 > aVar2.b.d[i2] - this.q) {
                        i = 0;
                    } else {
                        i = ax.T0.h.o(aVar2.a.g);
                        i7 = aVar2.a.k + i;
                    }
                    interfaceC2858s.readFully(f, i5, i7);
                    this.q += i7;
                    this.d.b0(0);
                    int v2 = this.d.v();
                    if (v2 < 0) {
                        throw E.a("Invalid NAL length", null);
                    }
                    this.s = v2 - i;
                    this.c.b0(0);
                    u.g(this.c, 4);
                    this.r += 4;
                    if (i > 0) {
                        u.g(this.d, i);
                        this.r += i;
                        if (ax.T0.h.k(f, 4, i, aVar2.a.g)) {
                            this.t = true;
                        }
                    }
                } else {
                    int a3 = u.a(interfaceC2858s, i6, false);
                    this.q += a3;
                    this.r += a3;
                    this.s -= a3;
                }
            }
            aVar = null;
        }
        int i8 = i3;
        w wVar2 = aVar2.b;
        long j3 = wVar2.f[i2];
        int i9 = wVar2.g[i2];
        if (!this.t) {
            i9 |= 67108864;
        }
        int i10 = i9;
        if (v != null) {
            r1 = 0;
            r1 = 0;
            v.c(u, j3, i10, i8, 0, null);
            if (i2 + 1 == aVar2.b.b) {
                v.a(u, aVar);
            }
        } else {
            r1 = 0;
            u.f(j3, i10, i8, 0, null);
        }
        aVar2.e++;
        this.p = -1;
        this.q = r1;
        this.r = r1;
        this.s = r1;
        this.t = r1;
        return r1;
    }

    private int L(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        int c = this.h.c(interfaceC2858s, m, this.i);
        if (c == 1 && m.a == 0) {
            u();
        }
        return c;
    }

    private static boolean M(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473 || i == 1635284069;
    }

    private static boolean N(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    private boolean O(C c) {
        ax.T0.c a2;
        if (c != null && (this.b & 64) != 0 && (a2 = j.a(c, "auxiliary.tracks.offset")) != null) {
            long T = new G(a2.b).T();
            if (T > 0) {
                this.w = T;
                return true;
            }
        }
        return false;
    }

    private void P(a aVar, long j) {
        w wVar = aVar.b;
        int a2 = wVar.a(j);
        if (a2 == -1) {
            a2 = wVar.b(j);
        }
        aVar.e = a2;
    }

    public static /* synthetic */ t o(t tVar) {
        return tVar;
    }

    public static /* synthetic */ ax.q1.r[] p() {
        return new ax.q1.r[]{new n(t.a.a, 16)};
    }

    private static int q(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] r(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].b.b];
            jArr2[i] = aVarArr[i].b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            w wVar = aVarArr[i3].b;
            j += wVar.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = wVar.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private boolean s(C0912v c0912v) {
        return Objects.equals(c0912v.o, "video/avc") ? (this.b & 32) != 0 : Objects.equals(c0912v.o, "video/hevc") && (this.b & 128) != 0;
    }

    public static int t(int i) {
        int i2 = (i & 1) != 0 ? 32 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    private void u() {
        this.k = 0;
        this.n = 0;
    }

    private List<Integer> v(C c) {
        List<Integer> d = ((ax.T0.c) C0968a.i(j.a(c, "auxiliary.tracks.map"))).d();
        ArrayList arrayList = new ArrayList(d.size());
        for (int i = 0; i < d.size(); i++) {
            int intValue = d.get(i).intValue();
            int i2 = 1;
            if (intValue != 0) {
                if (intValue != 1) {
                    i2 = 3;
                    if (intValue != 2) {
                        i2 = intValue != 3 ? 0 : 4;
                    }
                } else {
                    i2 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    private static int y(w wVar, long j) {
        int a2 = wVar.a(j);
        return a2 == -1 ? wVar.b(j) : a2;
    }

    private int z(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.A;
            if (i3 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i3];
            int i4 = aVar.e;
            w wVar = aVar.b;
            if (i4 != wVar.b) {
                long j5 = wVar.c[i4];
                long j6 = ((long[][]) d0.i(this.B))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j3 = j6;
                    i2 = i3;
                    j4 = j7;
                }
                if (j6 < j2) {
                    z = z3;
                    j2 = j6;
                    i = i3;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        if ((this.b & 16) == 0) {
            interfaceC2859t = new ax.N1.u(interfaceC2859t, this.a);
        }
        this.z = interfaceC2859t;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (j == 0) {
            if (this.k != 3) {
                u();
                return;
            } else {
                this.h.g();
                this.i.clear();
                return;
            }
        }
        for (a aVar : this.A) {
            P(aVar, j2);
            V v = aVar.d;
            if (v != null) {
                v.b();
            }
        }
    }

    @Override // ax.q1.r
    public boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        S d = s.d(interfaceC2858s, (this.b & 2) != 0);
        this.j = d != null ? AbstractC2991z.A(d) : AbstractC2991z.z();
        return d == null;
    }

    @Override // ax.q1.r
    public /* synthetic */ ax.q1.r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        while (true) {
            int i = this.k;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return K(interfaceC2858s, m);
                    }
                    if (i == 3) {
                        return L(interfaceC2858s, m);
                    }
                    throw new IllegalStateException();
                }
                if (J(interfaceC2858s, m)) {
                    return 1;
                }
            } else if (!I(interfaceC2858s)) {
                return -1;
            }
        }
    }

    @Override // ax.q1.N
    public boolean i() {
        return true;
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        return w(j, -1);
    }

    @Override // ax.q1.N
    public long n() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.q1.N.a w(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            ax.K1.n$a[] r4 = r0.A
            int r5 = r4.length
            if (r5 != 0) goto L13
            ax.q1.N$a r1 = new ax.q1.N$a
            ax.q1.O r2 = ax.q1.O.c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.C
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            ax.K1.w r4 = r4.b
            int r6 = y(r4, r1)
            if (r6 != r5) goto L35
            ax.q1.N$a r1 = new ax.q1.N$a
            ax.q1.O r2 = ax.q1.O.c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f
            r12 = r11[r6]
            long[] r11 = r4.c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f
            r9 = r2[r1]
            long[] r2 = r4.c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            ax.K1.n$a[] r4 = r0.A
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.C
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            ax.K1.w r4 = r4.b
            long r5 = A(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = A(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            ax.q1.O r3 = new ax.q1.O
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            ax.q1.N$a r1 = new ax.q1.N$a
            r1.<init>(r3)
            return r1
        L8f:
            ax.q1.O r4 = new ax.q1.O
            r4.<init>(r9, r1)
            ax.q1.N$a r1 = new ax.q1.N$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.K1.n.w(long, int):ax.q1.N$a");
    }

    @Override // ax.q1.r
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public AbstractC2991z<S> k() {
        return this.j;
    }

    public n(t.a aVar, int i) {
        this.a = aVar;
        this.b = i;
        this.j = AbstractC2991z.z();
        this.k = (i & 4) != 0 ? 3 : 0;
        this.h = new q();
        this.i = new ArrayList();
        this.f = new G(16);
        this.g = new ArrayDeque<>();
        this.c = new G(ax.T0.h.a);
        this.d = new G(6);
        this.e = new G();
        this.p = -1;
        this.z = InterfaceC2859t.a0;
        this.A = new a[0];
    }

    @Override // ax.q1.r
    public void d() {
    }
}
