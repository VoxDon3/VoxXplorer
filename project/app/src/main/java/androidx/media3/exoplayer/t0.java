/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.J0;
import androidx.media3.exoplayer.q0;
import androidx.media3.exoplayer.r0;
import androidx.media3.exoplayer.s0;
import ax.P0.N;
import ax.S0.q;
import ax.Z0.a;
import ax.i1.C;
import ax.i1.F;
import ax.r7.z;
import java.util.ArrayList;
import java.util.List;

final class t0 {
    private final N.b a;
    private final N.c b;
    private final a c;
    private final q d;
    private final q0.a e;
    private long f;
    private int g;
    private boolean h;
    private ExoPlayer.c i;
    private q0 j;
    private q0 k;
    private q0 l;
    private q0 m;
    private q0 n;
    private int o;
    private Object p;
    private long q;
    private List<q0> r;

    public t0(a a8, q q8, q0.a a9, ExoPlayer.c c8) {
        this.c = a8;
        this.d = q8;
        this.e = a9;
        this.i = c8;
        this.a = new N.b();
        this.b = new N.c();
        this.r = new ArrayList<q0>();
    }

    private boolean A(Object object, N n8) {
        int n9 = n8.h(object, this.a).c();
        int n10 = this.a.p();
        return n9 > 0 && this.a.s(n10) && (n9 > 1 || this.a.f(n10) != Long.MIN_VALUE);
    }

    private boolean C(F.b b8) {
        return !b8.b() && b8.e == -1;
    }

    private boolean D(N n8, F.b b8, boolean bl) {
        int n9 = n8.b(b8.a);
        return !n8.n((int)n8.f((int)n9, (N.b)this.a).c, (N.c)this.b).i && n8.r(n9, this.a, this.b, this.g, this.h) && bl;
    }

    private boolean E(N n8, F.b b8) {
        if (!this.C(b8)) {
            return false;
        }
        int n9 = n8.h((Object)b8.a, (N.b)this.a).c;
        int n10 = n8.b(b8.a);
        return n8.n((int)n9, (N.c)this.b).o == n10;
    }

    private static boolean H(N.b b8) {
        int n8 = b8.c();
        if (n8 != 0 && (n8 != 1 || !b8.r(0)) && b8.s(b8.p())) {
            long l8 = 0L;
            if (b8.e(0L) == -1) {
                if (b8.d == 0L) {
                    return true;
                }
                int n9 = b8.r(n8 - 1) ? 2 : 1;
                for (int i8 = 0; i8 <= n8 - n9; ++i8) {
                    l8 += b8.i(i8);
                }
                if (b8.d <= l8) {
                    return true;
                }
            }
        }
        return false;
    }

    private void J() {
        Object object;
        z.a<F.b> a8 = z.r();
        for (object = this.j; object != null; object = ((q0)object).k()) {
            a8.h(((q0)object).h.a);
        }
        object = this.k;
        object = object == null ? null : ((q0)object).h.a;
        this.d.c(new s0(this, a8, (F.b)object));
    }

    private void L(List<q0> list) {
        for (int i8 = 0; i8 < this.r.size(); ++i8) {
            this.r.get(i8).x();
        }
        this.r = list;
        this.n = null;
        this.I();
    }

    private q0 O(r0 r02) {
        for (int i8 = 0; i8 < this.r.size(); ++i8) {
            if (!this.r.get(i8).d(r02)) continue;
            return this.r.remove(i8);
        }
        return null;
    }

    private static F.b P(N n8, Object object, long l8, long l9, N.c c8, N.b b8) {
        int n9;
        n8.h(object, b8);
        n8.n(b8.c, c8);
        for (n9 = n8.b(object); t0.H(b8) && n9 <= c8.o; ++n9) {
            n8.g(n9, b8, true);
            object = ax.S0.a.e(b8.b);
        }
        n8.h(object, b8);
        n9 = b8.e(l8);
        if (n9 == -1) {
            return new F.b(object, l9, b8.d(l8));
        }
        return new F.b(object, n9, b8.l(n9), l9);
    }

    private long R(N n8, Object object) {
        int n9;
        int n10 = n8.h((Object)object, (N.b)this.a).c;
        Object object2 = this.p;
        if (object2 != null && (n9 = n8.b(object2)) != -1 && n8.f((int)n9, (N.b)this.a).c == n10) {
            return this.q;
        }
        for (object2 = this.j; object2 != null; object2 = ((q0)object2).k()) {
            if (!((q0)object2).b.equals(object)) continue;
            return ((q0)object2).h.a.d;
        }
        for (object2 = this.j; object2 != null; object2 = ((q0)object2).k()) {
            n9 = n8.b(((q0)object2).b);
            if (n9 == -1 || n8.f((int)n9, (N.b)this.a).c != n10) continue;
            return ((q0)object2).h.a.d;
        }
        long l8 = this.S(object);
        if (l8 != -1L) {
            return l8;
        }
        l8 = this.f;
        this.f = 1L + l8;
        if (this.j == null) {
            this.p = object;
            this.q = l8;
        }
        return l8;
    }

    private long S(Object object) {
        for (int i8 = 0; i8 < this.r.size(); ++i8) {
            q0 q02 = this.r.get(i8);
            if (!q02.b.equals(object)) continue;
            return q02.h.a.d;
        }
        return -1L;
    }

    private int U(N object) {
        q0 q02 = this.j;
        if (q02 == null) {
            return 0;
        }
        int n8 = ((N)object).b(q02.b);
        N n9 = object;
        object = q02;
        while (true) {
            n8 = n9.d(n8, this.a, this.b, this.g, this.h);
            while (((q0)ax.S0.a.e(object)).k() != null && !((q0)object).h.h) {
                object = ((q0)object).k();
            }
            q02 = ((q0)object).k();
            if (n8 == -1 || q02 == null || n9.b(q02.b) != n8) break;
            object = q02;
        }
        n8 = this.N((q0)object);
        ((q0)object).h = this.z(n9, ((q0)object).h);
        return n8;
    }

    public static /* synthetic */ void a(t0 t02, z.a a8, F.b b8) {
        t02.c.m0(a8.k(), b8);
    }

    static boolean e(long l8, long l9) {
        return l8 == -9223372036854775807L || l8 == l9;
        {
        }
    }

    private boolean f(r0 r02, r0 r03) {
        return r02.b == r03.b && r02.a.equals(r03.a);
    }

    private Pair<Object, Long> i(N n8, Object object, long l8) {
        int n9 = n8.e(n8.h((Object)object, (N.b)this.a).c, this.g, this.h);
        if (n9 != -1) {
            return n8.k(this.b, this.a, n9, -9223372036854775807L, l8);
        }
        return null;
    }

    private r0 j(J0 j02) {
        return this.o(j02.a, j02.b, j02.c, j02.s);
    }

    /*
     * Enabled aggressive block sorting
     */
    private r0 k(N n8, q0 object, long l8) {
        long l9;
        r0 r02 = ((q0)object).h;
        int n9 = n8.d(n8.b(r02.a.a), this.a, this.b, this.g, this.h);
        if (n9 == -1) {
            return null;
        }
        int n10 = n8.g((int)n9, (N.b)this.a, (boolean)true).c;
        Object object2 = ax.S0.a.e(this.a.b);
        long l10 = r02.a.d;
        int n11 = n8.n((int)n10, (N.c)this.b).n;
        long l11 = 0L;
        if (n11 == n9) {
            Pair<Object, Long> pair = n8.k(this.b, this.a, n10, -9223372036854775807L, Math.max(0L, l8));
            if (pair == null) {
                return null;
            }
            object2 = pair.first;
            l10 = (Long)pair.second;
            if ((object = ((q0)object).k()) != null && ((q0)object).b.equals(object2)) {
                l11 = ((q0)object).h.a.d;
            } else {
                l8 = l11 = this.S(object2);
                if (l11 == -1L) {
                    l8 = this.f;
                    this.f = 1L + l8;
                }
                l11 = l8;
            }
            object = object2;
            l8 = l10;
            l9 = -9223372036854775807L;
            l10 = l11;
            l11 = l9;
        } else {
            object = object2;
            l8 = 0L;
        }
        object = t0.P(n8, object, l8, l10, this.b, this.a);
        l10 = l8;
        l9 = l11;
        if (l11 == -9223372036854775807L) return this.o(n8, (F.b)object, l9, l10);
        l10 = l8;
        l9 = l11;
        if (r02.c == -9223372036854775807L) return this.o(n8, (F.b)object, l9, l10);
        boolean bl = this.A(r02.a.a, n8);
        if (((F.b)object).b() && bl) {
            l9 = r02.c;
            l10 = l8;
            return this.o(n8, (F.b)object, l9, l10);
        }
        l10 = l8;
        l9 = l11;
        if (!bl) return this.o(n8, (F.b)object, l9, l10);
        l10 = r02.c;
        l9 = l11;
        return this.o(n8, (F.b)object, l9, l10);
    }

    private r0 l(N n8, q0 q02, long l8) {
        r0 r02 = q02.h;
        l8 = q02.m() + r02.e - l8;
        if (r02.h) {
            return this.k(n8, q02, l8);
        }
        return this.m(n8, q02, l8);
    }

    private r0 m(N n8, q0 pair, long l8) {
        r0 r02 = pair.h;
        F.b b8 = r02.a;
        n8.h(b8.a, this.a);
        boolean bl = r02.g;
        if (b8.b()) {
            long l9;
            int n9 = b8.b;
            int n10 = this.a.a(n9);
            if (n10 == -1) {
                return null;
            }
            int n11 = this.a.m(n9, b8.c);
            if (n11 < n10) {
                return this.p(n8, b8.a, n9, n11, r02.c, b8.d, bl);
            }
            long l10 = l9 = r02.c;
            if (l9 == -9223372036854775807L) {
                N.c c8 = this.b;
                pair = this.a;
                if ((pair = n8.k(c8, (N.b)pair, pair.c, -9223372036854775807L, Math.max(0L, l8))) == null) {
                    return null;
                }
                l10 = (Long)pair.second;
            }
            l8 = this.s(n8, b8.a, b8.b);
            return this.q(n8, b8.a, Math.max(l8, l10), r02.c, b8.d, bl);
        }
        int n12 = b8.e;
        if (n12 != -1 && this.a.r(n12)) {
            return this.k(n8, (q0)pair, l8);
        }
        int n13 = this.a.l(b8.e);
        n12 = this.a.s(b8.e) && this.a.h(b8.e, n13) == 3 ? 1 : 0;
        if (n13 != this.a.a(b8.e) && n12 == 0) {
            return this.p(n8, b8.a, b8.e, n13, r02.e, b8.d, bl);
        }
        l8 = this.s(n8, b8.a, b8.e);
        return this.q(n8, b8.a, l8, r02.e, b8.d, false);
    }

    private r0 o(N n8, F.b b8, long l8, long l9) {
        n8.h(b8.a, this.a);
        if (b8.b()) {
            return this.p(n8, b8.a, b8.b, b8.c, l8, b8.d, false);
        }
        return this.q(n8, b8.a, l9, l8, b8.d, false);
    }

    private r0 p(N n8, Object object, int n9, int n10, long l8, long l9, boolean bl) {
        object = new F.b(object, n9, n10, l9);
        long l10 = n8.h(((F.b)object).a, this.a).b(((F.b)object).b, ((F.b)object).c);
        l9 = n10 == this.a.l(n9) ? this.a.g() : 0L;
        boolean bl2 = this.a.s(((F.b)object).b);
        long l11 = l9;
        if (l10 != -9223372036854775807L) {
            l11 = l9;
            if (l9 >= l10) {
                l11 = Math.max(0L, l10 - 1L);
            }
        }
        return new r0((F.b)object, l11, l8, -9223372036854775807L, l10, bl, bl2, false, false, false);
    }

    /*
     * Unable to fully structure code
     */
    private r0 q(N var1_1, Object var2_2, long var3_3, long var5_4, long var7_5, boolean var9_6) {
        block5: {
            var14_7 = var3_3;
            var1_1.h(var2_2, this.a);
            var11_8 = this.a.d(var14_7);
            var13_9 = 1;
            if (var11_8 != -1) break block5;
            if (this.a.c() <= 0 || !(var22_10 = this.a).s(var22_10.p())) ** GOTO lbl-1000
            var10_12 = var11_8;
            ** GOTO lbl16
        }
        if (!this.a.s(var11_8)) ** GOTO lbl-1000
        var3_3 = this.a.f(var11_8);
        var22_11 = this.a;
        if (var3_3 == var22_11.d && var22_11.q(var11_8)) {
            var10_12 = -1;
lbl16:
            // 2 sources

            var12_13 = 1;
            var11_8 = var10_12;
            var10_12 = var12_13;
        } else lbl-1000:
        // 3 sources

        {
            var10_12 = 0;
        }
        var2_2 = new F.b(var2_2, var7_5, var11_8);
        var20_14 = this.C((F.b)var2_2);
        var19_15 = this.E(var1_1, (F.b)var2_2);
        var21_16 = this.D(var1_1, (F.b)var2_2, var20_14);
        var18_17 = var11_8 != -1 && this.a.s(var11_8) != false && this.a.r(var11_8) == false;
        var12_13 = var11_8 != -1 && this.a.r(var11_8) != false && this.a.s(var11_8) != false ? 1 : 0;
        var3_3 = var11_8 != -1 && var12_13 == 0 ? this.a.f(var11_8) : (var10_12 != 0 ? this.a.d : -9223372036854775807L);
        var7_5 = var3_3 != -9223372036854775807L && var3_3 != -9223372036854775808L ? var3_3 : this.a.d;
        var16_18 = var14_7;
        if (var7_5 != -9223372036854775807L) {
            var16_18 = var14_7;
            if (var14_7 >= var7_5) {
                var11_8 = var13_9;
                if (!var21_16) {
                    var11_8 = var10_12 == 0 ? var13_9 : 0;
                }
                var16_18 = Math.max(0L, var7_5 - (long)var11_8);
            }
        }
        return new r0((F.b)var2_2, var16_18, var5_4, var3_3, var7_5, var9_6, var18_17, var20_14, var19_15, var21_16);
    }

    private r0 r(N n8, Object object, long l8, long l9) {
        if (((F.b)(object = t0.P(n8, object, l8, l9, this.b, this.a))).b()) {
            return this.p(n8, ((F.b)object).a, ((F.b)object).b, ((F.b)object).c, l8, ((F.b)object).d, false);
        }
        return this.q(n8, ((F.b)object).a, l8, -9223372036854775807L, ((F.b)object).d, false);
    }

    private long s(N n8, Object object, int n9) {
        n8.h(object, this.a);
        long l8 = this.a.f(n9);
        if (l8 == Long.MIN_VALUE) {
            return this.a.d;
        }
        return l8 + this.a.i(n9);
    }

    public void B(N object) {
        q0 q02;
        if (this.i.a != -9223372036854775807L && (q02 = this.m) != null) {
            ArrayList<q0> arrayList = new ArrayList<q0>();
            Object object2 = this.i((N)object, q02.h.a.a, 0L);
            if (object2 != null && !object.n(object.h((Object)object2.first, (N.b)this.a).c, this.b).f()) {
                long l8;
                long l9 = l8 = this.S(object2.first);
                if (l8 == -1L) {
                    l9 = this.f;
                    this.f = 1L + l9;
                }
                r0 r02 = this.r((N)object, object2.first, (Long)object2.second, l9);
                object = object2 = this.O(r02);
                if (object2 == null) {
                    long l10 = q02.m();
                    l9 = q02.h.e;
                    l8 = r02.b;
                    object = this.e.a(r02, l10 + l9 - l8);
                }
                arrayList.add((q0)object);
            }
            this.L(arrayList);
            return;
        }
        this.M();
    }

    public boolean F(C c8) {
        q0 q02 = this.m;
        return q02 != null && q02.a == c8;
    }

    public boolean G(C c8) {
        q0 q02 = this.n;
        return q02 != null && q02.a == c8;
    }

    public void I() {
        q0 q02 = this.n;
        if (q02 == null || q02.t()) {
            this.n = null;
            for (int i8 = 0; i8 < this.r.size(); ++i8) {
                q02 = this.r.get(i8);
                if (q02.t()) continue;
                this.n = q02;
                return;
            }
        }
    }

    public void K(long l8) {
        q0 q02 = this.m;
        if (q02 != null) {
            q02.w(l8);
        }
    }

    public void M() {
        if (!this.r.isEmpty()) {
            this.L(new ArrayList<q0>());
        }
    }

    public int N(q0 q02) {
        ax.S0.a.i(q02);
        boolean bl = q02.equals(this.m);
        int n8 = 0;
        if (bl) {
            return 0;
        }
        this.m = q02;
        while (q02.k() != null) {
            if ((q02 = ax.S0.a.e(q02.k())) == this.k) {
                q0 q03;
                this.k = q03 = this.j;
                this.l = q03;
                n8 = 3;
            }
            int n9 = n8;
            if (q02 == this.l) {
                this.l = this.k;
                n9 = n8 | 2;
            }
            q02.x();
            --this.o;
            n8 = n9;
        }
        ax.S0.a.e(this.m).A(null);
        this.J();
        return n8;
    }

    public F.b Q(N n8, Object object, long l8) {
        Object object2;
        long l9 = this.R(n8, object);
        n8.h(object, this.a);
        n8.n(this.a.c, this.b);
        int n9 = n8.b(object);
        boolean bl = false;
        while (true) {
            object2 = object;
            if (n9 < this.b.n) break;
            object2 = this.a;
            boolean bl2 = true;
            n8.g(n9, (N.b)object2, true);
            if (this.a.c() <= 0) {
                bl2 = false;
            }
            bl |= bl2;
            object2 = this.a;
            if (((N.b)object2).e(((N.b)object2).d) != -1) {
                object = ax.S0.a.e(this.a.b);
            }
            if (bl) {
                object2 = object;
                if (!bl2) break;
                if (this.a.d != 0L) {
                    object2 = object;
                    break;
                }
            }
            --n9;
        }
        return t0.P(n8, object2, l8, l9, this.b, this.a);
    }

    public boolean T() {
        q0 q02 = this.m;
        return q02 == null || !q02.h.j && q02.s() && this.m.h.e != -9223372036854775807L && this.o < 100;
        {
        }
    }

    public void V(N n8, ExoPlayer.c c8) {
        this.i = c8;
        this.B(n8);
    }

    public int W(N n8, long l8, long l9, long l10) {
        Object object = this.j;
        Object object2 = null;
        while (object != null) {
            block9: {
                Object object3;
                r0 r02;
                block8: {
                    block7: {
                        r02 = ((q0)object).h;
                        if (object2 != null) break block7;
                        object2 = this.z(n8, r02);
                        break block8;
                    }
                    object3 = this.l(n8, (q0)object2, l8);
                    if (object3 == null || !this.f(r02, (r0)object3)) break block9;
                    object2 = object3;
                }
                ((q0)object).h = ((r0)object2).a(r02.c);
                if (r02.e != ((r0)object2).e) {
                    ((q0)object).E();
                    l8 = ((r0)object2).e;
                    l8 = l8 == -9223372036854775807L ? Long.MAX_VALUE : ((q0)object).D(l8);
                    int n9 = object == this.k && !((q0)object).h.g && (l9 == Long.MIN_VALUE || l9 >= l8) ? 1 : 0;
                    boolean bl = object == this.l && (l10 == Long.MIN_VALUE || l10 >= l8);
                    int n10 = this.N((q0)object);
                    if (n10 != 0) {
                        return n10;
                    }
                    l8 = r02.e;
                    n10 = l8 == -9223372036854775807L && r02.d == Long.MIN_VALUE && (l9 = ((r0)object2).d) != -9223372036854775807L && l9 != Long.MIN_VALUE ? 1 : 0;
                    n9 = n9 != 0 && (l8 != -9223372036854775807L || n10 != 0) ? 1 : 0;
                    if (bl) {
                        return n9 | 2;
                    }
                    return n9;
                }
                object3 = ((q0)object).k();
                object2 = object;
                object = object3;
                continue;
            }
            return this.N((q0)object2);
        }
        return 0;
    }

    public int X(N n8, int n9) {
        this.g = n9;
        return this.U(n8);
    }

    public int Y(N n8, boolean bl) {
        this.h = bl;
        return this.U(n8);
    }

    public q0 b() {
        int n8;
        q0 q02 = this.j;
        if (q02 == null) {
            return null;
        }
        if (q02 == this.k) {
            this.k = q02.k();
        }
        if ((q02 = this.j) == this.l) {
            this.l = q02.k();
        }
        this.j.x();
        this.o = n8 = this.o - 1;
        if (n8 == 0) {
            this.m = null;
            q02 = this.j;
            this.p = q02.b;
            this.q = q02.h.a.d;
        }
        this.j = this.j.k();
        this.J();
        return this.j;
    }

    public q0 c() {
        this.l = ax.S0.a.i(this.l).k();
        this.J();
        return ax.S0.a.i(this.l);
    }

    public q0 d() {
        q0 q02 = this.l;
        q0 q03 = this.k;
        if (q02 == q03) {
            this.l = ax.S0.a.i(q03).k();
        }
        this.k = ax.S0.a.i(this.k).k();
        this.J();
        return ax.S0.a.i(this.k);
    }

    public void g() {
        q0 q02;
        if (this.o == 0) {
            return;
        }
        this.p = q02.b;
        this.q = q02.h.a.d;
        for (q02 = ax.S0.a.i(this.j); q02 != null; q02 = q02.k()) {
            q02.x();
        }
        this.j = null;
        this.m = null;
        this.k = null;
        this.l = null;
        this.o = 0;
        this.J();
    }

    public q0 h(r0 object) {
        q0 q02 = this.m;
        long l8 = q02 == null ? 1000000000000L : q02.m() + this.m.h.e - ((r0)object).b;
        q02 = this.O((r0)object);
        if (q02 == null) {
            object = this.e.a((r0)object, l8);
        } else {
            q02.h = object;
            q02.B(l8);
            object = q02;
        }
        q02 = this.m;
        if (q02 != null) {
            q02.A((q0)object);
        } else {
            this.j = object;
            this.k = object;
            this.l = object;
        }
        this.p = null;
        this.m = object;
        ++this.o;
        this.J();
        return object;
    }

    public q0 n() {
        return this.m;
    }

    public r0 t(long l8, J0 j02) {
        q0 q02 = this.m;
        if (q02 == null) {
            return this.j(j02);
        }
        return this.l(j02.a, q02, l8);
    }

    public q0 u() {
        return this.j;
    }

    public q0 v(C c8) {
        for (int i8 = 0; i8 < this.r.size(); ++i8) {
            q0 q02 = this.r.get(i8);
            if (q02.a != c8) continue;
            return q02;
        }
        return null;
    }

    public q0 w() {
        return this.n;
    }

    public q0 x() {
        return this.l;
    }

    public q0 y() {
        return this.k;
    }

    public r0 z(N n8, r0 r02) {
        int n9;
        F.b b8 = r02.a;
        boolean bl = this.C(b8);
        boolean bl2 = this.E(n8, b8);
        boolean bl3 = this.D(n8, b8, bl);
        n8.h(r02.a.a, this.a);
        long l8 = !b8.b() && (n9 = b8.e) != -1 ? this.a.f(n9) : -9223372036854775807L;
        long l9 = b8.b() ? this.a.b(b8.b, b8.c) : (l8 != -9223372036854775807L && l8 != Long.MIN_VALUE ? l8 : this.a.k());
        boolean bl4 = b8.b() ? this.a.s(b8.b) : (n9 = b8.e) != -1 && this.a.s(n9);
        return new r0(b8, r02.b, r02.c, l8, l9, r02.f, bl4, bl, bl2, bl3);
    }
}

