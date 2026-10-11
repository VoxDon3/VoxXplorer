/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.K1.b;
import ax.K1.j;
import ax.K1.k;
import ax.K1.l;
import ax.K1.m;
import ax.K1.q;
import ax.K1.s;
import ax.K1.t;
import ax.K1.w;
import ax.N1.t;
import ax.N1.u;
import ax.P0.C;
import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.T0.e;
import ax.T0.h;
import ax.q1.F;
import ax.q1.M;
import ax.q1.N;
import ax.q1.O;
import ax.q1.S;
import ax.q1.U;
import ax.q1.V;
import ax.q1.c;
import ax.q1.r;
import ax.q1.x;
import ax.r7.z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class n
implements r,
N {
    @Deprecated
    public static final x G = new m();
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
    private z<S> j;
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
    private ax.q1.t z;

    @Deprecated
    public n() {
        this(t.a.a, 16);
    }

    public n(t.a a8, int n8) {
        this.a = a8;
        this.b = n8;
        this.j = ax.r7.z.z();
        n8 = (n8 & 4) != 0 ? 3 : 0;
        this.k = n8;
        this.h = new q();
        this.i = new ArrayList<C.a>();
        this.f = new G(16);
        this.g = new ArrayDeque();
        this.c = new G(ax.T0.h.a);
        this.d = new G(6);
        this.e = new G();
        this.p = -1;
        this.z = ax.q1.t.a0;
        this.A = new a[0];
    }

    private static long A(w w8, long l8, long l9) {
        int n8 = ax.K1.n.y(w8, l8);
        if (n8 == -1) {
            return l9;
        }
        return Math.min(w8.c[n8], l9);
    }

    private void B(C object) {
        if ((object = ax.K1.j.a((C)object, "auxiliary.tracks.interleaved")) != null && ((ax.T0.c)object).b[0] == 0) {
            this.y = this.w + 16L;
        }
    }

    private void C(ax.q1.s s8) throws IOException {
        this.e.X(8);
        s8.p(this.e.f(), 0, 8);
        ax.K1.b.g(this.e);
        s8.n(this.e.g());
        s8.m();
    }

    private void D(long l8) throws E {
        while (!this.g.isEmpty() && this.g.peek().b == l8) {
            e.b b8 = this.g.pop();
            if (b8.a == 1836019574) {
                this.G(b8);
                this.g.clear();
                if (this.v) continue;
                this.k = 2;
                continue;
            }
            if (this.g.isEmpty()) continue;
            this.g.peek().b(b8);
        }
        if (this.k != 2) {
            this.u();
        }
    }

    private void E() {
        if (this.E == 2 && (this.b & 2) != 0) {
            U u8 = this.z.u(0, 4);
            Object object = this.F;
            object = object == null ? null : new C(new C.a[]{object});
            u8.e(new v.b().r0((C)object).P());
            this.z.o();
            this.z.h(new N.b(-9223372036854775807L));
        }
    }

    private static int F(G g8) {
        g8.b0(8);
        int n8 = ax.K1.n.q(g8.v());
        if (n8 != 0) {
            return n8;
        }
        g8.c0(4);
        while (g8.a() > 0) {
            n8 = ax.K1.n.q(g8.v());
            if (n8 == 0) continue;
            return n8;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void G(e.b object) throws E {
        Object object2;
        ArrayList arrayList = ((e.b)object).d(1835365473);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Object var13_5;
            arrayList = ax.K1.b.u((e.b)((Object)arrayList));
            if (this.x) {
                ax.S0.a.i(arrayList);
                this.B((C)((Object)arrayList));
                List<Integer> list = this.v((C)((Object)arrayList));
            } else if (this.O((C)((Object)arrayList))) {
                this.v = true;
                return;
            }
            object2 = var13_5;
            ArrayList arrayList3 = arrayList;
            arrayList = object2;
        } else {
            object2 = null;
            arrayList = arrayList2;
            e.c c8 = object2;
        }
        ArrayList<Object> arrayList4 = new ArrayList<Object>();
        boolean bl = this.E == 1;
        F f8 = new F();
        object2 = ((e.b)object).e(1969517665);
        if (object2 != null) {
            object2 = ax.K1.b.I((e.c)object2);
            f8.c((C)object2);
        } else {
            object2 = null;
        }
        C c9 = new C(ax.K1.b.w(ax.S0.a.e(((e.b)object).e((int)1836476516)).b));
        boolean bl2 = (this.b & 1) != 0;
        object = ax.K1.b.H((e.b)object, f8, -9223372036854775807L, null, bl2, bl, new l());
        if (this.x) {
            bl = arrayList.size() == object.size();
            ax.S0.a.h(bl, String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", arrayList.size(), object.size()));
        }
        String string = ax.K1.k.b((List<w>)object);
        long l8 = -9223372036854775807L;
        int n8 = 0;
        int n9 = -1;
        int n10 = 0;
        while (true) {
            int n11;
            if (n8 >= object.size()) {
                this.C = n9;
                this.D = l8;
                object = arrayList4.toArray(new a[0]);
                this.A = object;
                this.B = ax.K1.n.r((a[])object);
                this.z.o();
                this.z.h(this);
                return;
            }
            Object object3 = (w)object.get(n8);
            if (((w)object3).b == 0) {
                n11 = n10;
                n10 = n9;
                n9 = n11;
            } else {
                C var13_8;
                t t8 = ((w)object3).a;
                Object object4 = this.z;
                int n12 = n10 + 1;
                object4 = new a(t8, (w)object3, object4.u(n10, t8.b));
                long l9 = t8.e;
                if (l9 == -9223372036854775807L) {
                    l9 = ((w)object3).h;
                }
                ((a)object4).c.d(l9);
                l8 = Math.max(l8, l9);
                n10 = "audio/true-hd".equals(t8.g.o) ? ((w)object3).e * 16 : ((w)object3).e + 30;
                v.b b8 = t8.g.b();
                b8.o0(n10);
                if (t8.b == 2) {
                    n10 = n11 = t8.g.f;
                    if ((this.b & 8) != 0) {
                        n10 = n9 == -1 ? 1 : 2;
                        n10 = n11 | n10;
                    }
                    n11 = n10;
                    if (this.x) {
                        n11 = n10 | 0x8000;
                        b8.R((Integer)arrayList.get(n8));
                    }
                    b8.w0(n11);
                }
                ax.K1.j.l(t8.b, f8, b8);
                n10 = t8.b;
                C c10 = t8.g.l;
                object3 = this.i.isEmpty() ? null : new C(this.i);
                ax.K1.j.m(n10, (C)var13_8, b8, c10, new C[]{object3, object2, c9});
                b8.W(string);
                ((a)object4).c.e(b8.P());
                n10 = n9;
                if (t8.b == 2) {
                    n10 = n9;
                    if (n9 == -1) {
                        n10 = arrayList4.size();
                    }
                }
                arrayList4.add(object4);
                n9 = n12;
            }
            ++n8;
            n11 = n9;
            n9 = n10;
            n10 = n11;
        }
    }

    private void H(long l8) {
        if (this.l == 1836086884) {
            int n8 = this.n;
            this.F = new ax.F1.a(0L, l8, -9223372036854775807L, l8 + (long)n8, this.m - (long)n8);
        }
    }

    private boolean I(ax.q1.s object) throws IOException {
        long l8;
        long l9;
        if (this.n == 0) {
            if (!object.e(this.f.f(), 0, 8, true)) {
                this.E();
                return false;
            }
            this.n = 8;
            this.f.b0(0);
            this.m = this.f.O();
            this.l = this.f.v();
        }
        if ((l9 = this.m) == 1L) {
            object.readFully(this.f.f(), 8, 8);
            this.n += 8;
            this.m = this.f.T();
        } else if (l9 == 0L) {
            l9 = l8 = object.getLength();
            if (l8 == -1L) {
                e.b b8 = this.g.peek();
                l9 = l8;
                if (b8 != null) {
                    l9 = b8.b;
                }
            }
            if (l9 != -1L) {
                this.m = l9 - object.getPosition() + (long)this.n;
            }
        }
        if (this.m >= (long)this.n) {
            if (ax.K1.n.M(this.l)) {
                l8 = object.getPosition();
                l9 = this.m;
                int n8 = this.n;
                l8 = l8 + l9 - (long)n8;
                if (l9 != (long)n8 && this.l == 1835365473) {
                    this.C((ax.q1.s)object);
                }
                this.g.push(new e.b(this.l, l8));
                if (this.m == (long)this.n) {
                    this.D(l8);
                } else {
                    this.u();
                }
            } else if (ax.K1.n.N(this.l)) {
                boolean bl = this.n == 8;
                ax.S0.a.g(bl);
                bl = this.m <= Integer.MAX_VALUE;
                ax.S0.a.g(bl);
                object = new G((int)this.m);
                System.arraycopy(this.f.f(), 0, ((G)object).f(), 0, 8);
                this.o = object;
                this.k = 1;
            } else {
                this.H(object.getPosition() - (long)this.n);
                this.o = null;
                this.k = 1;
            }
            return true;
        }
        throw ax.P0.E.d("Atom size less than header length (unsupported).");
    }

    /*
     * Unable to fully structure code
     */
    private boolean J(ax.q1.s var1_1, M var2_2) throws IOException {
        block7: {
            var6_3 = this.m - (long)this.n;
            var4_4 = var1_1.getPosition();
            var8_5 = this.o;
            if (var8_5 == null) break block7;
            var1_1.readFully(var8_5.f(), this.n, (int)var6_3);
            if (this.l == 1718909296) {
                this.u = true;
                this.E = ax.K1.n.F(var8_5);
            } else if (!this.g.isEmpty()) {
                this.g.peek().c(new e.c(this.l, var8_5));
            }
            ** GOTO lbl18
        }
        if (!this.u && this.l == 1835295092) {
            this.E = 1;
        }
        if (var6_3 < 262144L) {
            var1_1.n((int)var6_3);
lbl18:
            // 3 sources

            var3_6 = false;
        } else {
            var2_2.a = var1_1.getPosition() + var6_3;
            var3_6 = true;
        }
        this.D(var4_4 + var6_3);
        if (this.v) {
            this.x = true;
            var2_2.a = this.w;
            this.v = false;
            var3_6 = true;
        }
        return var3_6 != false && this.k != 2;
    }

    private int K(ax.q1.s object, M object2) throws IOException {
        int n8;
        long l8 = object.getPosition();
        if (this.p == -1) {
            this.p = n8 = this.z(l8);
            if (n8 == -1) {
                return -1;
            }
        }
        a a8 = this.A[this.p];
        U u8 = a8.c;
        int n9 = a8.e;
        Object object3 = a8.b;
        long l9 = ((w)object3).c[n9] + this.y;
        n8 = ((w)object3).d[n9];
        object3 = a8.d;
        if ((l8 = l9 - l8 + (long)this.q) >= 0L && l8 < 262144L) {
            int n10;
            l9 = l8;
            int n11 = n8;
            if (a8.a.h == 1) {
                l9 = l8 + 8L;
                n11 = n8 - 8;
            }
            object.n((int)l9);
            if (!this.s(a8.a.g)) {
                this.t = true;
            }
            object2 = a8.a;
            if (((t)object2).k != 0) {
                byte[] byArray = this.d.f();
                byArray[0] = 0;
                byArray[1] = 0;
                byArray[2] = 0;
                int n12 = 4 - a8.a.k;
                n10 = n11 + n12;
                while (this.r < n10) {
                    n8 = this.s;
                    if (n8 == 0) {
                        object2 = a8.a;
                        n11 = ((t)object2).k;
                        if (!this.t && ax.T0.h.o(((t)object2).g) + n11 <= a8.b.d[n9] - this.q) {
                            n8 = ax.T0.h.o(a8.a.g);
                            n11 = a8.a.k + n8;
                        } else {
                            n8 = 0;
                        }
                        object.readFully(byArray, n12, n11);
                        this.q += n11;
                        this.d.b0(0);
                        n11 = this.d.v();
                        if (n11 >= 0) {
                            this.s = n11 - n8;
                            this.c.b0(0);
                            u8.g(this.c, 4);
                            this.r += 4;
                            if (n8 <= 0) continue;
                            u8.g(this.d, n8);
                            this.r += n8;
                            if (!ax.T0.h.k(byArray, 4, n8, a8.a.g)) continue;
                            this.t = true;
                            continue;
                        }
                        throw ax.P0.E.a("Invalid NAL length", null);
                    }
                    n8 = u8.a((ax.P0.k)object, n8, false);
                    this.q += n8;
                    this.r += n8;
                    this.s -= n8;
                }
                n11 = n10;
            } else {
                if ("audio/ac4".equals(((t)object2).g.o)) {
                    if (this.r == 0) {
                        ax.q1.c.b(n11, this.e);
                        u8.g(this.e, 7);
                        this.r += 7;
                    }
                    n8 = n11 + 7;
                } else {
                    n8 = n11;
                    if (object3 != null) {
                        ((V)object3).d((ax.q1.s)object);
                        n8 = n11;
                    }
                }
                while (true) {
                    n10 = this.r;
                    n11 = n8;
                    if (n10 >= n8) break;
                    n11 = u8.a((ax.P0.k)object, n8 - n10, false);
                    this.q += n11;
                    this.r += n11;
                    this.s -= n11;
                }
            }
            object = a8.b;
            l9 = ((w)object).f[n9];
            n8 = n10 = ((w)object).g[n9];
            if (!this.t) {
                n8 = n10 | 0x4000000;
            }
            if (object3 != null) {
                ((V)object3).c(u8, l9, n8, n11, 0, null);
                if (n9 + 1 == a8.b.b) {
                    ((V)object3).a(u8, null);
                }
            } else {
                u8.f(l9, n8, n11, 0, null);
            }
            ++a8.e;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = false;
            return 0;
        }
        ((M)object2).a = l9;
        return 1;
    }

    private int L(ax.q1.s s8, M m8) throws IOException {
        int n8 = this.h.c(s8, m8, this.i);
        if (n8 == 1 && m8.a == 0L) {
            this.u();
        }
        return n8;
    }

    private static boolean M(int n8) {
        return n8 == 1836019574 || n8 == 1953653099 || n8 == 1835297121 || n8 == 1835626086 || n8 == 1937007212 || n8 == 1701082227 || n8 == 1835365473 || n8 == 1635284069;
        {
        }
    }

    private static boolean N(int n8) {
        return n8 == 1835296868 || n8 == 1836476516 || n8 == 1751411826 || n8 == 1937011556 || n8 == 0x73747473 || n8 == 0x73747373 || n8 == 1668576371 || n8 == 1701606260 || n8 == 1937011555 || n8 == 1937011578 || n8 == 1937013298 || n8 == 1937007471 || n8 == 1668232756 || n8 == 1953196132 || n8 == 1718909296 || n8 == 1969517665 || n8 == 1801812339 || n8 == 1768715124;
        {
        }
    }

    private boolean O(C object) {
        long l8;
        if (object == null) {
            return false;
        }
        if ((this.b & 0x40) != 0 && (object = ax.K1.j.a((C)object, "auxiliary.tracks.offset")) != null && (l8 = new G(((ax.T0.c)object).b).T()) > 0L) {
            this.w = l8;
            return true;
        }
        return false;
    }

    private void P(a a8, long l8) {
        int n8;
        w w8 = a8.b;
        int n9 = n8 = w8.a(l8);
        if (n8 == -1) {
            n9 = w8.b(l8);
        }
        a8.e = n9;
    }

    public static /* synthetic */ t o(t t8) {
        return t8;
    }

    public static /* synthetic */ r[] p() {
        return new r[]{new n(t.a.a, 16)};
    }

    private static int q(int n8) {
        if (n8 != 1751476579) {
            if (n8 != 1903435808) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    private static long[][] r(a[] aArray) {
        int n8;
        long[][] lArrayArray = new long[aArray.length][];
        int[] nArray = new int[aArray.length];
        long[] lArray = new long[aArray.length];
        boolean[] blArray = new boolean[aArray.length];
        for (n8 = 0; n8 < aArray.length; ++n8) {
            lArrayArray[n8] = new long[aArray[n8].b.b];
            lArray[n8] = aArray[n8].b.f[0];
        }
        long l8 = 0L;
        int n9 = 0;
        while (n9 < aArray.length) {
            long l9 = Long.MAX_VALUE;
            int n10 = -1;
            for (n8 = 0; n8 < aArray.length; ++n8) {
                long l10 = l9;
                int n11 = n10;
                if (!blArray[n8]) {
                    long l11 = lArray[n8];
                    l10 = l9;
                    n11 = n10;
                    if (l11 <= l9) {
                        n11 = n8;
                        l10 = l11;
                    }
                }
                l9 = l10;
                n10 = n11;
            }
            n8 = nArray[n10];
            long[] lArray2 = lArrayArray[n10];
            lArray2[n8] = l8;
            w w8 = aArray[n10].b;
            l8 += (long)w8.d[n8];
            nArray[n10] = ++n8;
            if (n8 < lArray2.length) {
                lArray[n10] = w8.f[n8];
                continue;
            }
            blArray[n10] = true;
            ++n9;
        }
        return lArrayArray;
    }

    private boolean s(v v8) {
        if (j.Objects.equals((Object)v8.o, (Object)"video/avc")) {
            return (this.b & 0x20) != 0;
        }
        return j.Objects.equals((Object)v8.o, (Object)"video/hevc") && (this.b & 0x80) != 0;
    }

    public static int t(int n8) {
        int n9 = (n8 & 1) != 0 ? 32 : 0;
        if ((n8 & 2) != 0) {
            return n9 | 0x80;
        }
        return n9;
    }

    private void u() {
        this.k = 0;
        this.n = 0;
    }

    private List<Integer> v(C object) {
        object = ax.S0.a.i(ax.K1.j.a((C)object, "auxiliary.tracks.map")).d();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(object.size());
        for (int i8 = 0; i8 < object.size(); ++i8) {
            int n8 = (Integer)object.get(i8);
            int n9 = 1;
            if (n8 != 0) {
                if (n8 != 1) {
                    n9 = 3;
                    if (n8 != 2) {
                        n9 = n8 != 3 ? 0 : 4;
                    }
                } else {
                    n9 = 2;
                }
            }
            arrayList.add(n9);
        }
        return arrayList;
    }

    private static int y(w w8, long l8) {
        int n8 = w8.a(l8);
        if (n8 == -1) {
            return w8.b(l8);
        }
        return n8;
    }

    private int z(long l8) {
        Object object;
        int n8 = -1;
        int n9 = -1;
        long l9 = Long.MAX_VALUE;
        int n10 = 1;
        long l10 = Long.MAX_VALUE;
        int n11 = 1;
        long l11 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < ((a[])(object = this.A)).length; ++i8) {
            long l12;
            block7: {
                int n12;
                long l13;
                int n13;
                long l14;
                long l15;
                int n14;
                block9: {
                    block8: {
                        block6: {
                            object = object[i8];
                            n14 = object.e;
                            object = object.b;
                            if (n14 != object.b) break block6;
                            l12 = l9;
                            break block7;
                        }
                        l15 = object.c[n14];
                        l14 = d0.i(this.B)[i8][n14];
                        l12 = l15 - l8;
                        n14 = l12 >= 0L && l12 < 262144L ? 0 : 1;
                        if (n14 == 0 && n11 != 0) break block8;
                        n13 = n9;
                        l13 = l10;
                        n12 = n11;
                        l15 = l11;
                        if (n14 != n11) break block9;
                        n13 = n9;
                        l13 = l10;
                        n12 = n11;
                        l15 = l11;
                        if (l12 >= l11) break block9;
                    }
                    n12 = n14;
                    l13 = l14;
                    n13 = i8;
                    l15 = l12;
                }
                n9 = n13;
                l12 = l9;
                l10 = l13;
                n11 = n12;
                l11 = l15;
                if (l14 < l9) {
                    n8 = i8;
                    l11 = l15;
                    n11 = n12;
                    l10 = l13;
                    n10 = n14;
                    l12 = l14;
                    n9 = n13;
                }
            }
            l9 = l12;
        }
        if (l9 != Long.MAX_VALUE && n10 != 0 && l10 >= l9 + 0xA00000L) {
            return n8;
        }
        return n9;
    }

    @Override
    public void a(ax.q1.t t8) {
        ax.q1.t t9 = t8;
        if ((this.b & 0x10) == 0) {
            t9 = new u(t8, this.a);
        }
        this.z = t9;
    }

    @Override
    public void b(long l8, long l9) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        if (l8 == 0L) {
            if (this.k != 3) {
                this.u();
                return;
            }
            this.h.g();
            this.i.clear();
            return;
        }
        for (a a8 : this.A) {
            this.P(a8, l9);
            V object = a8.d;
            if (object == null) continue;
            object.b();
        }
    }

    @Override
    public boolean c(ax.q1.s z8) throws IOException {
        boolean bl = (this.b & 2) != 0;
        S s8 = ax.K1.s.d((ax.q1.s)((Object)z8), bl);
        z8 = s8 != null ? ax.r7.z.A(s8) : ax.r7.z.z();
        this.j = z8;
        return s8 == null;
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return ax.q1.q.b(this);
    }

    @Override
    public int f(ax.q1.s s8, M m8) throws IOException {
        while (true) {
            int n8;
            if ((n8 = this.k) != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 == 3) {
                            return this.L(s8, m8);
                        }
                        throw new IllegalStateException();
                    }
                    return this.K(s8, m8);
                }
                if (!this.J(s8, m8)) continue;
                return 1;
            }
            if (!this.I(s8)) break;
        }
        return -1;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public N.a l(long l8) {
        return this.w(l8, -1);
    }

    @Override
    public long n() {
        return this.D;
    }

    public N.a w(long l8, int n8) {
        long l9;
        long l10;
        long l11;
        long l12;
        Object object;
        block9: {
            block8: {
                block7: {
                    object = this.A;
                    if (((a[])object).length == 0) {
                        return new N.a(O.c);
                    }
                    int n9 = n8 != -1 ? n8 : this.C;
                    if (n9 == -1) break block7;
                    object = object[n9].b;
                    n9 = ax.K1.n.y((w)object, l8);
                    if (n9 == -1) {
                        return new N.a(O.c);
                    }
                    l12 = ((w)object).f[n9];
                    l11 = ((w)object).c[n9];
                    l10 = l12;
                    l9 = l11;
                    if (l12 >= l8) break block8;
                    l10 = l12;
                    l9 = l11;
                    if (n9 >= ((w)object).b - 1) break block8;
                    int n10 = ((w)object).b(l8);
                    l10 = l12;
                    l9 = l11;
                    if (n10 == -1) break block8;
                    l10 = l12;
                    l9 = l11;
                    if (n10 == n9) break block8;
                    l10 = ((w)object).f[n10];
                    l8 = ((w)object).c[n10];
                    l9 = l11;
                    break block9;
                }
                l9 = Long.MAX_VALUE;
                l10 = l8;
            }
            l8 = -1L;
            l11 = -9223372036854775807L;
            l12 = l10;
            l10 = l11;
        }
        long l13 = l8;
        l11 = l9;
        if (n8 == -1) {
            n8 = 0;
            while (true) {
                object = this.A;
                l13 = l8;
                l11 = l9;
                if (n8 >= ((a[])object).length) break;
                l13 = l8;
                l11 = l9;
                if (n8 != this.C) {
                    object = ((a)object[n8]).b;
                    l11 = ax.K1.n.A((w)object, l12, l9);
                    l9 = l8;
                    if (l10 != -9223372036854775807L) {
                        l9 = ax.K1.n.A((w)object, l10, l8);
                    }
                    l13 = l9;
                }
                ++n8;
                l8 = l13;
                l9 = l11;
            }
        }
        object = new O(l12, l11);
        if (l10 == -9223372036854775807L) {
            return new N.a((O)object);
        }
        return new N.a((O)object, new O(l10, l13));
    }

    public z<S> x() {
        return this.j;
    }

    private static final class a {
        public final t a;
        public final w b;
        public final U c;
        public final V d;
        public int e;

        public a(t object, w w8, U u8) {
            this.a = object;
            this.b = w8;
            this.c = u8;
            object = "audio/true-hd".equals(((t)object).g.o) ? new V() : null;
            this.d = object;
        }
    }
}

