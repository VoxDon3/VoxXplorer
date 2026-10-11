/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.exoplayer.hls.c;
import androidx.media3.exoplayer.hls.e;
import androidx.media3.exoplayer.hls.h;
import androidx.media3.exoplayer.hls.i;
import androidx.media3.exoplayer.hls.j;
import androidx.media3.exoplayer.hls.k;
import androidx.media3.exoplayer.p0;
import ax.E1.m;
import ax.P0.C;
import ax.P0.D;
import ax.P0.E;
import ax.P0.P;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import ax.U0.u;
import ax.Y0.O;
import ax.Y0.Z;
import ax.b1.u;
import ax.b1.w;
import ax.c1.g;
import ax.i1.B;
import ax.i1.N;
import ax.i1.d0;
import ax.i1.e0;
import ax.i1.f0;
import ax.i1.q0;
import ax.i1.y;
import ax.l1.I;
import ax.m1.m;
import ax.m1.o;
import ax.q1.N;
import ax.q1.T;
import ax.q1.U;
import ax.q1.t;
import ax.r7.F;
import ax.r7.z;
import ax.u7.f;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class l
implements o.b<ax.j1.b>,
o.f,
f0,
t,
d0.d {
    private static final Set<Integer> Z0 = java.util.DesugarCollections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(1, 2, 5)));
    private U A0;
    private int B0;
    private int C0;
    private boolean D0;
    private boolean E0;
    private int F0;
    private v G0;
    private v H0;
    private boolean I0;
    private q0 J0;
    private Set<P> K0;
    private int[] L0;
    private int M0;
    private boolean N0;
    private boolean[] O0;
    private boolean[] P0;
    private long Q0;
    private long R0;
    private boolean S0;
    private boolean T0;
    private boolean U0;
    private boolean V0;
    private long W0;
    private ax.P0.o X0;
    private e Y0;
    private final int c0;
    private final b d0;
    private final androidx.media3.exoplayer.hls.c e0;
    private final ax.m1.b f0;
    private final v g0;
    private final w h0;
    private final u.a i0;
    private final ax.m1.m j0;
    private final o k0;
    private final N.a l0;
    private final int m0;
    private final c.b n0;
    private final ArrayList<e> o0;
    private final List<e> p0;
    private final String q;
    private final Runnable q0;
    private final Runnable r0;
    private final Handler s0;
    private final ArrayList<h> t0;
    private final Map<String, ax.P0.o> u0;
    private ax.j1.b v0;
    private d[] w0;
    private int[] x0;
    private Set<Integer> y0;
    private SparseIntArray z0;

    public l(String arrayList, int n8, b b8, androidx.media3.exoplayer.hls.c c8, Map<String, ax.P0.o> map, ax.m1.b b9, long l8, v v8, w w8, u.a a8, ax.m1.m m8, N.a a9, int n9) {
        this.q = arrayList;
        this.c0 = n8;
        this.d0 = b8;
        this.e0 = c8;
        this.u0 = map;
        this.f0 = b9;
        this.g0 = v8;
        this.h0 = w8;
        this.i0 = a8;
        this.j0 = m8;
        this.l0 = a9;
        this.m0 = n9;
        this.k0 = new o("Loader:HlsSampleStreamWrapper");
        this.n0 = new c.b();
        this.x0 = new int[0];
        arrayList = Z0;
        this.y0 = new HashSet<Integer>(arrayList.size());
        this.z0 = new SparseIntArray(arrayList.size());
        this.w0 = new d[0];
        this.P0 = new boolean[0];
        this.O0 = new boolean[0];
        arrayList = new ArrayList();
        this.o0 = arrayList;
        this.p0 = java.util.DesugarCollections.unmodifiableList(arrayList);
        this.t0 = new ArrayList();
        this.q0 = new j(this);
        this.r0 = new k(this);
        this.s0 = ax.S0.d0.A();
        this.Q0 = l8;
        this.R0 = l8;
    }

    private void B() {
        int n8;
        Object object;
        int n9;
        boolean bl = true;
        int n10 = this.w0.length;
        int n11 = 0;
        int n12 = -2;
        int n13 = -1;
        while (true) {
            int n14;
            n9 = 2;
            if (n11 >= n10) break;
            object = a.i(this.w0[n11].D()).o;
            if (!D.s((String)object)) {
                n9 = D.o((String)object) ? 1 : (D.r((String)object) ? 3 : -2);
            }
            if (l.O(n9) > l.O(n12)) {
                n8 = n11;
                n14 = n9;
            } else {
                n14 = n12;
                n8 = n13;
                if (n9 == n12) {
                    n14 = n12;
                    n8 = n13;
                    if (n13 != -1) {
                        n8 = -1;
                        n14 = n12;
                    }
                }
            }
            ++n11;
            n12 = n14;
            n13 = n8;
        }
        P p8 = this.e0.l();
        n8 = p8.a;
        this.M0 = -1;
        this.L0 = new int[n10];
        for (n9 = 0; n9 < n10; ++n9) {
            this.L0[n9] = n9;
        }
        P[] pArray = new P[n10];
        for (n9 = 0; n9 < n10; ++n9) {
            Object object2;
            v v8 = a.i(this.w0[n9].D());
            if (n9 == n13) {
                v[] vArray = new v[n8];
                for (n11 = 0; n11 < n8; ++n11) {
                    object = object2 = p8.b(n11);
                    if (n12 == 1) {
                        v v9 = this.g0;
                        object = object2;
                        if (v9 != null) {
                            object = ((v)object2).m(v9);
                        }
                    }
                    object = n8 == 1 ? v8.m((v)object) : l.H((v)object, v8, true);
                    vArray[n11] = object;
                }
                pArray[n9] = new P(this.q, vArray);
                this.M0 = n9;
                continue;
            }
            object = n12 == 2 && D.o(v8.o) ? this.g0 : null;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(this.q);
            ((StringBuilder)object2).append(":muxed:");
            n11 = n9 < n13 ? n9 : n9 - 1;
            ((StringBuilder)object2).append(n11);
            pArray[n9] = new P(((StringBuilder)object2).toString(), l.H((v)object, v8, false));
        }
        this.J0 = this.G(pArray);
        if (this.K0 != null) {
            bl = false;
        }
        a.g(bl);
        this.K0 = Collections.EMPTY_SET;
    }

    private boolean C(int n8) {
        int n9;
        for (n9 = n8; n9 < this.o0.size(); ++n9) {
            if (!this.o0.get(n9).x()) continue;
            return false;
        }
        e e8 = this.o0.get(n8);
        for (n8 = 0; n8 < this.w0.length; ++n8) {
            n9 = e8.m(n8);
            if (this.w0[n8].A() <= n9) continue;
            return false;
        }
        return true;
    }

    private static ax.q1.o E(int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unmapped track with id ");
        stringBuilder.append(n8);
        stringBuilder.append(" of type ");
        stringBuilder.append(n9);
        ax.S0.u.h("HlsSampleStreamWrapper", stringBuilder.toString());
        return new ax.q1.o();
    }

    private ax.i1.d0 F(int n8, int n9) {
        boolean bl;
        int n10 = this.w0.length;
        boolean bl2 = bl = true;
        if (n9 != 1) {
            bl2 = n9 == 2 ? bl : false;
        }
        d d8 = new d(this.f0, this.h0, this.i0, this.u0);
        d8.Y(this.Q0);
        if (bl2) {
            d8.f0(this.X0);
        }
        d8.X(this.W0);
        Object object = this.Y0;
        if (object != null) {
            d8.g0((e)object);
        }
        d8.a0(this);
        object = this.x0;
        int n11 = n10 + 1;
        object = Arrays.copyOf((int[])object, n11);
        this.x0 = (int[])object;
        object[n10] = n8;
        this.w0 = ax.S0.d0.e1(this.w0, d8);
        object = Arrays.copyOf(this.P0, n11);
        this.P0 = (boolean[])object;
        object[n10] = bl2;
        this.N0 |= bl2;
        this.y0.add(n9);
        this.z0.append(n9, n10);
        if (l.O(n9) > l.O(this.B0)) {
            this.C0 = n10;
            this.B0 = n9;
        }
        this.O0 = Arrays.copyOf(this.O0, n11);
        return d8;
    }

    private q0 G(P[] pArray) {
        for (int i8 = 0; i8 < pArray.length; ++i8) {
            P p8 = pArray[i8];
            v[] vArray = new v[p8.a];
            for (int i9 = 0; i9 < p8.a; ++i9) {
                v v8 = p8.b(i9);
                vArray[i9] = v8.c(this.h0.a(v8));
            }
            pArray[i8] = new P(p8.b, vArray);
        }
        return new q0(pArray);
    }

    private static v H(v object, v object2, boolean bl) {
        Object object3;
        Object object4;
        if (object == null) {
            return object2;
        }
        int n8 = D.k(((v)object2).o);
        if (ax.S0.d0.R(((v)object).k, n8) == 1) {
            object4 = ax.S0.d0.S(((v)object).k, n8);
            object3 = D.g((String)object4);
        } else {
            object4 = D.d(((v)object).k, ((v)object2).o);
            object3 = ((v)object2).o;
        }
        v.b b8 = ((v)object2).b().j0(((v)object).a).l0(((v)object).b).m0(((v)object).c).n0(((v)object).d).A0(((v)object).e).w0(((v)object).f);
        int n9 = bl ? ((v)object).h : -1;
        b8 = b8.S(n9);
        n9 = bl ? ((v)object).i : -1;
        object4 = b8.t0(n9).U((String)object4);
        if (n8 == 2) {
            ((v.b)object4).F0(((v)object).v).h0(((v)object).w).f0(((v)object).z);
        }
        if (object3 != null) {
            ((v.b)object4).y0((String)object3);
        }
        if ((n9 = ((v)object).G) != -1 && n8 == 1) {
            ((v.b)object4).T(n9);
        }
        if ((object3 = ((v)object).l) != null) {
            object2 = ((v)object2).l;
            object = object3;
            if (object2 != null) {
                object = ((C)object2).b((C)object3);
            }
            ((v.b)object4).r0((C)object);
        }
        return ((v.b)object4).P();
    }

    private void I(int n8) {
        block5: {
            a.g(this.k0.i() ^ true);
            while (n8 < this.o0.size()) {
                if (!this.C(n8)) {
                    ++n8;
                    continue;
                }
                break block5;
            }
            n8 = -1;
        }
        if (n8 == -1) {
            return;
        }
        long l8 = this.M().h;
        e e8 = this.J(n8);
        if (this.o0.isEmpty()) {
            this.R0 = this.Q0;
        } else {
            F.e(this.o0).p();
        }
        this.U0 = false;
        this.l0.y(this.B0, e8.g, l8);
    }

    private e J(int n8) {
        e e8 = this.o0.get(n8);
        ArrayList<e> arrayList = this.o0;
        ax.S0.d0.l1(arrayList, n8, arrayList.size());
        for (n8 = 0; n8 < this.w0.length; ++n8) {
            int n9 = e8.m(n8);
            this.w0[n8].s(n9);
        }
        return e8;
    }

    private boolean K(e e8) {
        int n8 = e8.k;
        int n9 = this.w0.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            if (!this.O0[i8] || this.w0[i8].N() != (long)n8) continue;
            return false;
        }
        return true;
    }

    private static boolean L(v v8, v v9) {
        String string = v8.o;
        String string2 = v9.o;
        int n8 = D.k(string);
        if (n8 != 3) {
            return n8 == D.k(string2);
        }
        if (!j.Objects.equals((Object)string, (Object)string2)) {
            return false;
        }
        if (!"application/cea-608".equals(string) && !"application/cea-708".equals(string)) {
            return true;
        }
        return v8.L == v9.L;
    }

    private e M() {
        ArrayList<e> arrayList = this.o0;
        return arrayList.get(arrayList.size() - 1);
    }

    private U N(int n8, int n9) {
        a.a(Z0.contains(n9));
        int n10 = this.z0.get(n9, -1);
        if (n10 == -1) {
            return null;
        }
        if (this.y0.add(n9)) {
            this.x0[n10] = n8;
        }
        if (this.x0[n10] == n8) {
            return this.w0[n10];
        }
        return l.E(n8, n9);
    }

    private static int O(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return 0;
                }
                return 1;
            }
            return 3;
        }
        return 2;
    }

    private void P(e e8) {
        int n8;
        this.Y0 = e8;
        this.G0 = e8.d;
        this.R0 = -9223372036854775807L;
        this.o0.add(e8);
        d[] dArray = z.r();
        Object object = this.w0;
        int n9 = ((d[])object).length;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            dArray.h(object[n8].E());
        }
        e8.o(this, dArray.k());
        dArray = this.w0;
        n9 = dArray.length;
        for (n8 = n10; n8 < n9; ++n8) {
            object = dArray[n8];
            ((d)object).g0(e8);
            if (!e8.x()) continue;
            ((ax.i1.d0)object).d0();
        }
    }

    private static boolean Q(ax.j1.b b8) {
        return b8 instanceof e;
    }

    private boolean R() {
        return this.R0 != -9223372036854775807L;
    }

    private void U() {
        int n8;
        int n9;
        int n10 = this.J0.a;
        Object object = new int[n10];
        this.L0 = object;
        Arrays.fill(object, -1);
        int n11 = 0;
        block0: for (n9 = 0; n9 < n10; ++n9) {
            for (n8 = 0; n8 < ((int[])(object = (Object)this.w0)).length; ++n8) {
                if (!l.L(a.i(object[n8].D()), this.J0.c(n9).b(0))) continue;
                this.L0[n9] = n8;
                continue block0;
            }
        }
        ArrayList<h> arrayList = this.t0;
        n8 = arrayList.size();
        for (n9 = n11; n9 < n8; ++n9) {
            object = arrayList.get(n9);
            ((h)object).d();
        }
    }

    private void V(e e8) {
        if (!this.o0.isEmpty()) {
            if (!this.M().r()) {
                this.I(this.o0.size() - 1);
            }
            if (e8.n && e8.x()) {
                long l8;
                long l9;
                for (int i8 = this.o0.size() - 1; i8 >= 0 && (l9 = this.o0.get((int)i8).g) >= (l8 = e8.g); --i8) {
                    if (l9 != l8 || !this.C(i8)) continue;
                    this.I(i8);
                    e8.i();
                    return;
                }
            }
        }
    }

    private void W() {
        block4: {
            if (!this.I0 && this.L0 == null && this.D0) {
                d[] dArray = this.w0;
                int n8 = dArray.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (dArray[i8].D() != null) {
                        continue;
                    }
                    break block4;
                }
                if (this.J0 != null) {
                    this.U();
                    return;
                }
                this.B();
                this.p0();
                this.d0.h();
            }
        }
    }

    private void g0() {
        this.D0 = true;
        this.W();
    }

    private void k0() {
        d[] dArray = this.w0;
        int n8 = dArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            dArray[i8].T(this.S0);
        }
        this.S0 = false;
    }

    private boolean l0(long l8, e e8) {
        int n8 = this.w0.length;
        int n9 = 0;
        while (true) {
            boolean bl;
            boolean bl2 = true;
            if (n9 >= n8) break;
            d d8 = this.w0[n9];
            if (e8 != null) {
                bl = d8.V(e8.m(n9));
            } else {
                long l9 = this.b();
                bl = bl2;
                if (l9 != Long.MIN_VALUE) {
                    bl = l8 < l9 ? bl2 : false;
                }
                bl = d8.W(l8, bl);
            }
            if (!(bl || !this.P0[n9] && this.N0)) {
                return false;
            }
            ++n9;
        }
        return true;
    }

    private void p0() {
        this.E0 = true;
    }

    private void u0(e0[] e0Array) {
        this.t0.clear();
        for (e0 e02 : e0Array) {
            if (e02 == null) continue;
            this.t0.add((h)e02);
        }
    }

    public static /* synthetic */ void w(l l8) {
        l8.g0();
    }

    public static /* synthetic */ void x(l l8) {
        l8.W();
    }

    public static /* synthetic */ void y(l l8, e e8) {
        l8.d0.k(e8.m);
    }

    private void z() {
        a.g(this.E0);
        a.e(this.J0);
        a.e(this.K0);
    }

    public int A(int n8) {
        this.z();
        a.e(this.L0);
        int n9 = this.L0[n8];
        if (n9 == -1) {
            if (this.K0.contains(this.J0.c(n8))) {
                return -3;
            }
            return -2;
        }
        boolean[] blArray = this.O0;
        if (blArray[n9]) {
            return -2;
        }
        blArray[n9] = true;
        return n9;
    }

    public void D() {
        if (!this.E0) {
            this.a(new p0.b().f(this.Q0).d());
        }
    }

    public boolean S(int n8) {
        return !this.R() && this.w0[n8].I(this.U0);
    }

    public boolean T() {
        return this.B0 == 2;
    }

    public void X() throws IOException {
        this.k0.j();
        this.e0.r();
    }

    public void Y(int n8) throws IOException {
        this.X();
        this.w0[n8].K();
    }

    public void Z(ax.j1.b b8, long l8, long l9, boolean bl) {
        this.v0 = null;
        y y8 = new y(b8.a, b8.b, b8.f(), b8.e(), l8, l9, b8.b());
        this.j0.a(b8.a);
        this.l0.m(y8, b8.c, this.c0, b8.d, b8.e, b8.f, b8.g, b8.h);
        if (!bl) {
            if (this.R() || this.F0 == 0) {
                this.k0();
            }
            if (this.F0 > 0) {
                this.d0.i(this);
            }
        }
    }

    @Override
    public boolean a(p0 object) {
        if (!(this.U0 || this.k0.i() || this.k0.h())) {
            long l8;
            Object object2;
            long l9;
            Object object3;
            if (this.R()) {
                long l10;
                object3 = Collections.EMPTY_LIST;
                l9 = this.R0;
                object2 = this.w0;
                int n8 = ((d[])object2).length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    object2[i8].Y(this.R0);
                }
                l8 = l10 = l9;
            } else {
                object3 = this.p0;
                object2 = this.M();
                long l11 = ((e)object2).q() && ((e)object2).r() ? ((e)object2).n() : Math.max(this.Q0, ((ax.j1.b)object2).g);
                l9 = l8 = this.Q0;
                if (this.D0) {
                    object2 = this.w0;
                    int n9 = ((d[])object2).length;
                    int n10 = 0;
                    while (true) {
                        l9 = l8;
                        if (n10 >= n9) break;
                        l8 = Math.max(l8, object2[n10].y());
                        ++n10;
                    }
                }
                l8 = l9;
                l9 = l11;
            }
            this.n0.a();
            object2 = this.e0;
            boolean bl = this.E0 || !object3.isEmpty();
            ((androidx.media3.exoplayer.hls.c)object2).f((p0)object, l9, l8, (List<e>)object3, bl, this.n0);
            object3 = this.n0;
            bl = ((c.b)object3).b;
            object = ((c.b)object3).a;
            object3 = ((c.b)object3).c;
            if (bl) {
                this.R0 = -9223372036854775807L;
                this.U0 = true;
                return true;
            }
            if (object == null) {
                if (object3 != null) {
                    this.d0.k((Uri)object3);
                }
                return false;
            }
            if (l.Q((ax.j1.b)object)) {
                object3 = (e)object;
                this.V((e)object3);
                this.P((e)object3);
            }
            this.v0 = object;
            this.k0.n(object, this, this.j0.c(((ax.j1.b)object).c));
            return true;
        }
        return false;
    }

    public void a0(ax.j1.b b8, long l8, long l9) {
        this.v0 = null;
        this.e0.t(b8);
        y y8 = new y(b8.a, b8.b, b8.f(), b8.e(), l8, l9, b8.b());
        this.j0.a(b8.a);
        this.l0.p(y8, b8.c, this.c0, b8.d, b8.e, b8.f, b8.g, b8.h);
        if (!this.E0) {
            this.a(new p0.b().f(this.Q0).d());
            return;
        }
        this.d0.i(this);
    }

    @Override
    public long b() {
        if (this.R()) {
            return this.R0;
        }
        if (this.U0) {
            return Long.MIN_VALUE;
        }
        return this.M().h;
    }

    public o.c b0(ax.j1.b b8, long l8, long l9, IOException iOException, int n8) {
        int n9;
        boolean bl = l.Q(b8);
        if (bl && !((e)b8).r() && iOException instanceof u && ((n9 = ((u)iOException).e0) == 410 || n9 == 404)) {
            return o.d;
        }
        long l10 = b8.b();
        y y8 = new y(b8.a, b8.b, b8.f(), b8.e(), l8, l9, l10);
        m.c c8 = new m.c(y8, new B(b8.c, this.c0, b8.d, b8.e, b8.f, ax.S0.d0.E1(b8.g), ax.S0.d0.E1(b8.h)), iOException, n8);
        ArrayList<e> arrayList = this.j0.d(I.c(this.e0.m()), c8);
        boolean bl2 = false;
        boolean bl3 = arrayList != null && ((m.b)((Object)arrayList)).a == 2 ? this.e0.q(b8, ((m.b)((Object)arrayList)).b) : false;
        if (bl3) {
            if (bl && l10 == 0L) {
                arrayList = this.o0;
                if (arrayList.remove(arrayList.size() - 1) == b8) {
                    bl2 = true;
                }
                a.g(bl2);
                if (this.o0.isEmpty()) {
                    this.R0 = this.Q0;
                } else {
                    F.e(this.o0).p();
                }
            }
            arrayList = o.f;
        } else {
            l8 = this.j0.b(c8);
            arrayList = l8 != -9223372036854775807L ? o.g(false, l8) : o.g;
        }
        bl2 = ((o.c)((Object)arrayList)).c();
        this.l0.r(y8, b8.c, this.c0, b8.d, b8.e, b8.f, b8.g, b8.h, iOException, bl2 ^ true);
        if (!bl2) {
            this.v0 = null;
            this.j0.a(b8.a);
        }
        if (bl3) {
            if (!this.E0) {
                this.a(new p0.b().f(this.Q0).d());
                return arrayList;
            }
            this.d0.i(this);
        }
        return arrayList;
    }

    @Override
    public boolean c() {
        return this.k0.i();
    }

    public void c0(ax.j1.b b8, long l8, long l9, int n8) {
        y y8 = n8 == 0 ? new y(b8.a, b8.b, l8) : new y(b8.a, b8.b, b8.f(), b8.e(), l8, l9, b8.b());
        this.l0.v(y8, b8.c, this.c0, b8.d, b8.e, b8.f, b8.g, b8.h, n8);
    }

    @Override
    public long d() {
        if (this.U0) {
            return Long.MIN_VALUE;
        }
        if (this.R()) {
            return this.R0;
        }
        long l8 = this.Q0;
        Object object = this.M();
        if (!object.q()) {
            if (this.o0.size() > 1) {
                object = this.o0;
                object = (e)object.get(object.size() - 2);
            } else {
                object = null;
            }
        }
        long l9 = l8;
        if (object != null) {
            l9 = Math.max(l8, object.h);
        }
        l8 = l9;
        if (this.D0) {
            object = this.w0;
            int n8 = ((d[])object).length;
            int n9 = 0;
            while (true) {
                l8 = l9;
                if (n9 >= n8) break;
                l9 = Math.max(l9, object[n9].x());
                ++n9;
            }
        }
        return l8;
    }

    public void d0() {
        this.y0.clear();
    }

    @Override
    public void e(long l8) {
        if (!this.k0.h() && !this.R()) {
            if (this.k0.i()) {
                a.e(this.v0);
                if (this.e0.z(l8, this.v0, this.p0)) {
                    this.k0.e();
                    return;
                }
            } else {
                int n8;
                for (n8 = this.p0.size(); n8 > 0 && this.e0.d(this.p0.get(n8 - 1)) == 2; --n8) {
                }
                if (n8 < this.p0.size()) {
                    this.I(n8);
                }
                if ((n8 = this.e0.i(l8, this.p0)) < this.o0.size()) {
                    this.I(n8);
                }
            }
        }
    }

    public boolean e0(Uri uri, m.c object, boolean bl) {
        if (!this.e0.s(uri)) {
            return true;
        }
        long l8 = !bl && (object = this.j0.d(I.c(this.e0.m()), (m.c)object)) != null && ((m.b)object).a == 2 ? ((m.b)object).b : -9223372036854775807L;
        return this.e0.u(uri, l8);
    }

    @Override
    public void f() {
        d[] dArray = this.w0;
        int n8 = dArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            dArray[i8].Q();
        }
    }

    public void f0() {
        if (!this.o0.isEmpty()) {
            e e8 = F.e(this.o0);
            int n8 = this.e0.d(e8);
            if (n8 == 1) {
                if (!e8.r()) {
                    e8.w(this.e0.j(e8));
                    return;
                }
            } else {
                if (n8 == 0) {
                    this.s0.post((Runnable)new i(this, e8));
                    return;
                }
                if (n8 == 2 && !this.U0 && this.k0.i()) {
                    this.k0.e();
                }
            }
        }
    }

    @Override
    public void h(N n8) {
    }

    public void h0(P[] handler, int n8, int ... object) {
        this.J0 = this.G((P[])handler);
        this.K0 = new HashSet<P>();
        for (Object object2 : object) {
            this.K0.add(this.J0.c((int)object2));
        }
        this.M0 = n8;
        handler = this.s0;
        b b8 = this.d0;
        j.Objects.requireNonNull((Object)b8);
        handler.post((Runnable)new g(b8));
        this.p0();
    }

    @Override
    public void i(v v8) {
        this.s0.post(this.q0);
    }

    public int i0(int n8, O o8, ax.V0.i object, int n9) {
        Object object2;
        int n10;
        if (this.R()) {
            return -3;
        }
        boolean bl = this.o0.isEmpty();
        int n11 = 0;
        if (!bl) {
            for (n10 = 0; n10 < this.o0.size() - 1 && this.K(this.o0.get(n10)); ++n10) {
            }
            ax.S0.d0.l1(this.o0, 0, n10);
            object2 = this.o0.get(0);
            v v8 = ((ax.j1.b)object2).d;
            if (!v8.equals(this.H0)) {
                this.l0.j(this.c0, v8, ((ax.j1.b)object2).e, ((ax.j1.b)object2).f, ((ax.j1.b)object2).g);
            }
            this.H0 = v8;
        }
        if (!this.o0.isEmpty() && !this.o0.get(0).r()) {
            return -3;
        }
        if ((n9 = this.w0[n8].P(o8, (ax.V0.i)object, n9, this.U0)) == -5) {
            object = object2 = a.e(o8.b);
            if (n8 == this.C0) {
                n10 = f.e(this.w0[n8].N());
                for (n8 = n11; n8 < this.o0.size() && this.o0.get((int)n8).k != n10; ++n8) {
                }
                object = n8 < this.o0.size() ? this.o0.get((int)n8).d : a.e(this.G0);
                object = ((v)object2).m((v)object);
            }
            o8.b = object;
        }
        return n9;
    }

    public void j0() {
        if (this.E0) {
            d[] dArray = this.w0;
            int n8 = dArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                dArray[i8].O();
            }
        }
        this.e0.v();
        this.k0.m(this);
        this.s0.removeCallbacksAndMessages(null);
        this.I0 = true;
        this.t0.clear();
    }

    public void l() throws IOException {
        this.X();
        if (this.U0 && !this.E0) {
            throw E.a("Loading finished before preparation is complete.", null);
        }
    }

    public boolean m0(long l8, boolean bl) {
        d[] dArray;
        int n8;
        this.Q0 = l8;
        if (this.R()) {
            this.R0 = l8;
            return true;
        }
        boolean bl2 = this.e0.n();
        int n9 = 0;
        if (bl2) {
            for (n8 = 0; n8 < this.o0.size(); ++n8) {
                dArray = this.o0.get(n8);
                if (dArray.g != l8) {
                    continue;
                }
                break;
            }
        } else {
            dArray = null;
        }
        if (this.D0 && !bl && !this.o0.isEmpty() && this.l0(l8, (e)dArray)) {
            return false;
        }
        this.R0 = l8;
        this.U0 = false;
        this.o0.clear();
        if (this.k0.i()) {
            if (this.D0) {
                dArray = this.w0;
                int n10 = dArray.length;
                for (n8 = n9; n8 < n10; ++n8) {
                    dArray[n8].q();
                }
            }
            this.k0.e();
        } else {
            this.k0.f();
            this.k0();
        }
        return true;
    }

    public boolean n0(ax.l1.D[] object, boolean[] object2, e0[] e0Array, boolean[] blArray, long l8, boolean bl) {
        boolean bl2;
        block20: {
            boolean bl3;
            int n8;
            int n9;
            block21: {
                block22: {
                    ax.l1.D d8;
                    Object object3;
                    block19: {
                        this.z();
                        int n10 = this.F0;
                        n9 = 0;
                        int n11 = 0;
                        for (n8 = 0; n8 < ((ax.l1.D[])object).length; ++n8) {
                            object3 = (h)e0Array[n8];
                            if (object3 == null || object[n8] != null && object2[n8]) continue;
                            --this.F0;
                            ((h)object3).f();
                            e0Array[n8] = null;
                        }
                        bl3 = bl || (this.T0 ? n10 == 0 : l8 != this.Q0);
                        d8 = this.e0.m();
                        object2 = d8;
                        for (n8 = 0; n8 < ((ax.l1.D[])object).length; ++n8) {
                            object3 = object[n8];
                            if (object3 == null) {
                                object3 = object2;
                                bl2 = bl3;
                            } else {
                                n10 = this.J0.e(object3.b());
                                if (n10 == this.M0) {
                                    this.e0.y((ax.l1.D)object3);
                                    object2 = object3;
                                }
                                object3 = object2;
                                bl2 = bl3;
                                if (e0Array[n8] == null) {
                                    ++this.F0;
                                    h h8 = new h(this, n10);
                                    e0Array[n8] = h8;
                                    blArray[n8] = true;
                                    object3 = object2;
                                    bl2 = bl3;
                                    if (this.L0 != null) {
                                        h8.d();
                                        object3 = object2;
                                        bl2 = bl3;
                                        if (!bl3) {
                                            object3 = this.w0[this.L0[n10]];
                                            bl3 = ((ax.i1.d0)object3).A() != 0 && !((ax.i1.d0)object3).W(l8, true);
                                            bl2 = bl3;
                                            object3 = object2;
                                        }
                                    }
                                }
                            }
                            object2 = object3;
                            bl3 = bl2;
                        }
                        if (this.F0 != 0) break block19;
                        this.e0.v();
                        this.H0 = null;
                        this.S0 = true;
                        this.o0.clear();
                        if (this.k0.i()) {
                            if (this.D0) {
                                object = this.w0;
                                n9 = ((ax.l1.D[])object).length;
                                for (n8 = n11; n8 < n9; ++n8) {
                                    ((ax.i1.d0)((Object)object[n8])).q();
                                }
                            }
                            this.k0.e();
                            bl2 = bl3;
                        } else {
                            this.k0();
                            bl2 = bl3;
                        }
                        break block20;
                    }
                    if (this.o0.isEmpty() || j.Objects.equals((Object)object2, (Object)d8)) break block21;
                    if (this.T0) break block22;
                    long l9 = 0L;
                    if (l8 < 0L) {
                        l9 = -l8;
                    }
                    object = this.M();
                    object3 = this.e0.a((e)object, l8);
                    object2.c(l8, l9, -9223372036854775807L, this.p0, (ax.j1.e[])object3);
                    n8 = this.e0.l().c(object.d);
                    if (object2.l() == n8) break block21;
                }
                this.S0 = true;
                bl = true;
                bl3 = true;
            }
            bl2 = bl3;
            if (bl3) {
                this.m0(l8, bl);
                n8 = n9;
                while (true) {
                    bl2 = bl3;
                    if (n8 >= e0Array.length) break;
                    if (e0Array[n8] != null) {
                        blArray[n8] = true;
                    }
                    ++n8;
                }
            }
        }
        this.u0(e0Array);
        this.T0 = true;
        return bl2;
    }

    @Override
    public void o() {
        this.V0 = true;
        this.s0.post(this.r0);
    }

    public void o0(ax.P0.o o8) {
        if (!j.Objects.equals((Object)this.X0, (Object)o8)) {
            d[] dArray;
            this.X0 = o8;
            for (int i8 = 0; i8 < (dArray = this.w0).length; ++i8) {
                if (!this.P0[i8]) continue;
                dArray[i8].f0(o8);
            }
        }
    }

    public long q(long l8, Z z8) {
        return this.e0.c(l8, z8);
    }

    public void q0(boolean bl) {
        this.e0.x(bl);
    }

    public void r0(long l8) {
        if (this.W0 != l8) {
            this.W0 = l8;
            d[] dArray = this.w0;
            int n8 = dArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                dArray[i8].X(l8);
            }
        }
    }

    public int s0(int n8, long l8) {
        if (this.R()) {
            return 0;
        }
        d d8 = this.w0[n8];
        int n9 = d8.C(l8, this.U0);
        e e8 = F.f(this.o0, null);
        int n10 = n9;
        if (e8 != null) {
            n10 = n9;
            if (!e8.r()) {
                n10 = d8.A();
                n10 = Math.min(n9, e8.m(n8) - n10);
            }
        }
        d8.b0(n10);
        return n10;
    }

    public q0 t() {
        this.z();
        return this.J0;
    }

    public void t0(int n8) {
        this.z();
        a.e(this.L0);
        n8 = this.L0[n8];
        a.g(this.O0[n8]);
        this.O0[n8] = false;
    }

    @Override
    public U u(int n8, int n9) {
        Object object;
        block7: {
            if (Z0.contains(n9)) {
                object = this.N(n8, n9);
            } else {
                for (int i8 = 0; i8 < ((d[])(object = this.w0)).length; ++i8) {
                    if (this.x0[i8] != n8) continue;
                    object = object[i8];
                    break block7;
                }
                object = null;
            }
        }
        Object object2 = object;
        if (object == null) {
            if (this.V0) {
                return l.E(n8, n9);
            }
            object2 = this.F(n8, n9);
        }
        if (n9 == 5) {
            if (this.A0 == null) {
                this.A0 = new c((U)object2, this.m0);
            }
            return this.A0;
        }
        return object2;
    }

    public void v(long l8, boolean bl) {
        if (this.D0 && !this.R()) {
            int n8 = this.w0.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                this.w0[i8].p(l8, bl, this.O0[i8]);
            }
        }
    }

    public static interface b
    extends f0.a<l> {
        public void h();

        public void k(Uri var1);
    }

    private static class c
    implements U {
        private static final v g = new v.b().y0("application/id3").P();
        private static final v h = new v.b().y0("application/x-emsg").P();
        private final ax.B1.b a = new ax.B1.b();
        private final U b;
        private final v c;
        private v d;
        private byte[] e;
        private int f;

        /*
         * Enabled aggressive block sorting
         */
        public c(U object, int n8) {
            this.b = object;
            if (n8 != 1) {
                if (n8 != 3) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unknown metadataType: ");
                    ((StringBuilder)object).append(n8);
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                this.c = h;
            } else {
                this.c = g;
            }
            this.e = new byte[0];
            this.f = 0;
        }

        private boolean h(ax.B1.a object) {
            return (object = ((ax.B1.a)object).a()) != null && j.Objects.equals((Object)this.c.o, (Object)((v)object).o);
        }

        private void i(int n8) {
            byte[] byArray = this.e;
            if (byArray.length < n8) {
                this.e = Arrays.copyOf(byArray, n8 + n8 / 2);
            }
        }

        private G j(int n8, int n9) {
            int n10 = this.f - n9;
            G g8 = new G(Arrays.copyOfRange(this.e, n10 - n8, n10));
            byte[] byArray = this.e;
            System.arraycopy(byArray, n10, byArray, 0, n9);
            this.f = n9;
            return g8;
        }

        @Override
        public /* synthetic */ int a(ax.P0.k k8, int n8, boolean bl) {
            return T.b(this, k8, n8, bl);
        }

        @Override
        public void b(G g8, int n8, int n9) {
            this.i(this.f + n8);
            g8.q(this.e, this.f, n8);
            this.f += n8;
        }

        @Override
        public int c(ax.P0.k k8, int n8, boolean bl, int n9) throws IOException {
            this.i(this.f + n8);
            n8 = k8.c(this.e, this.f, n8);
            if (n8 == -1) {
                if (bl) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f += n8;
            return n8;
        }

        @Override
        public /* synthetic */ void d(long l8) {
            T.a(this, l8);
        }

        @Override
        public void e(v v8) {
            this.d = v8;
            this.b.e(this.c);
        }

        @Override
        public void f(long l8, int n8, int n9, int n10, U.a object) {
            block5: {
                Object object2;
                block4: {
                    ax.S0.a.e(this.d);
                    object2 = this.j(n9, n10);
                    if (j.Objects.equals((Object)this.d.o, (Object)this.c.o)) break block4;
                    if (!"application/x-emsg".equals(this.d.o)) break block5;
                    if (!this.h((ax.B1.a)(object2 = this.a.c((G)object2)))) {
                        ax.S0.u.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.c.o, ((ax.B1.a)object2).a()));
                        return;
                    }
                    object2 = new G(ax.S0.a.e(((ax.B1.a)object2).c()));
                }
                n9 = ((G)object2).a();
                this.b.g((G)object2, n9);
                this.b.f(l8, n8, n9, 0, (U.a)object);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Ignoring sample for unsupported format: ");
            ((StringBuilder)object).append(this.d.o);
            ax.S0.u.h("HlsSampleStreamWrapper", ((StringBuilder)object).toString());
        }

        @Override
        public /* synthetic */ void g(G g8, int n8) {
            T.c(this, g8, n8);
        }
    }

    private static final class d
    extends ax.i1.d0 {
        private final Map<String, ax.P0.o> H;
        private ax.P0.o I;

        private d(ax.m1.b b8, w w8, u.a a8, Map<String, ax.P0.o> map) {
            super(b8, w8, a8);
            this.H = map;
        }

        private C e0(C c8) {
            int n8;
            C.a[] aArray;
            int n9;
            int n10;
            int n11;
            block5: {
                if (c8 == null) {
                    return null;
                }
                n11 = c8.e();
                n10 = 0;
                for (n9 = 0; n9 < n11; ++n9) {
                    aArray = c8.d(n9);
                    if (!(aArray instanceof m) || !"com.apple.streaming.transportStreamTimestamp".equals(((m)aArray).b)) continue;
                    n8 = n9;
                    break block5;
                }
                n8 = -1;
            }
            if (n8 == -1) {
                return c8;
            }
            if (n11 == 1) {
                return null;
            }
            aArray = new C.a[n11 - 1];
            for (n9 = n10; n9 < n11; ++n9) {
                if (n9 == n8) continue;
                n10 = n9 < n8 ? n9 : n9 - 1;
                aArray[n10] = c8.d(n9);
            }
            return new C(aArray);
        }

        @Override
        public void f(long l8, int n8, int n9, int n10, U.a a8) {
            super.f(l8, n8, n9, n10, a8);
        }

        public void f0(ax.P0.o o8) {
            this.I = o8;
            this.G();
        }

        public void g0(e e8) {
            this.c0(e8.k);
        }

        @Override
        public v v(v v8) {
            Object object;
            block7: {
                Object object2;
                Object object3;
                block6: {
                    object = this.I;
                    if (object == null) {
                        object = v8.s;
                    }
                    object3 = object;
                    if (object != null) {
                        object2 = this.H.get(((ax.P0.o)object).d0);
                        object3 = object;
                        if (object2 != null) {
                            object3 = object2;
                        }
                    }
                    object2 = this.e0(v8.l);
                    if (object3 != v8.s) break block6;
                    object = v8;
                    if (object2 == v8.l) break block7;
                }
                object = v8.b().c0((ax.P0.o)object3).r0((C)object2).P();
            }
            return super.v((v)object);
        }
    }
}

