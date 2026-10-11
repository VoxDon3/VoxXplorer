/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.J0;
import androidx.media3.exoplayer.K0;
import androidx.media3.exoplayer.L0;
import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.O0;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.j0;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.k0;
import androidx.media3.exoplayer.l0;
import androidx.media3.exoplayer.m0;
import androidx.media3.exoplayer.o0;
import androidx.media3.exoplayer.p0;
import androidx.media3.exoplayer.q0;
import androidx.media3.exoplayer.r0;
import androidx.media3.exoplayer.s;
import androidx.media3.exoplayer.t0;
import ax.P0.C;
import ax.P0.D;
import ax.P0.E;
import ax.P0.F;
import ax.P0.G;
import ax.P0.N;
import ax.P0.v;
import ax.P0.y;
import ax.S0.d0;
import ax.S0.q;
import ax.S0.u;
import ax.Y0.P;
import ax.Y0.T;
import ax.Y0.W;
import ax.Y0.Y;
import ax.Y0.Z;
import ax.Z0.I1;
import ax.Z0.a;
import ax.b1.n;
import ax.i1.C;
import ax.i1.F;
import ax.i1.g0;
import ax.l1.J;
import ax.l1.K;
import ax.o1.z;
import ax.r7.z;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class n0
implements Handler.Callback,
C.a,
J.a,
I0.d,
k.a,
K0.a,
g.a,
z {
    private static final long k1 = ax.S0.d0.E1(10000L);
    private final q A0;
    private final boolean B0;
    private final androidx.media3.exoplayer.g C0;
    private Z D0;
    private Y E0;
    private Z F0;
    private boolean G0;
    private boolean H0;
    private h I0;
    private J0 J0;
    private e K0;
    private boolean L0;
    private boolean M0;
    private boolean N0;
    private boolean O0;
    private long P0;
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
    private s c1;
    private final boolean[] d0;
    private long d1;
    private final J e0;
    private long e1;
    private final K f0;
    private ExoPlayer.c f1;
    private final o0 g0;
    private N g1;
    private final ax.m1.e h0;
    private long h1 = -9223372036854775807L;
    private final q i0;
    private boolean i1;
    private final T j0;
    private float j1;
    private final Looper k0;
    private final N.c l0;
    private final N.b m0;
    private final long n0;
    private final boolean o0;
    private final k p0;
    private final O0[] q;
    private final ArrayList<d> q0;
    private final ax.S0.h r0;
    private final f s0;
    private final t0 t0;
    private final I0 u0;
    private final P v0;
    private final long w0;
    private final I1 x0;
    private final boolean y0;
    private final a z0;

    public n0(Context context, M0[] looper, M0[] object, J j8, K object2, o0 object3, ax.m1.e e8, int n8, boolean bl, a a8, Z z8, P p8, long l8, boolean bl2, boolean bl3, Looper looper2, ax.S0.h h8, f f8, I1 i12, T t8, ExoPlayer.c c8, z z9) {
        this.s0 = f8;
        this.e0 = j8;
        this.f0 = object2;
        this.g0 = object3;
        this.h0 = e8;
        this.R0 = n8;
        this.S0 = bl;
        this.D0 = z8;
        this.v0 = p8;
        this.w0 = l8;
        this.d1 = l8;
        this.M0 = bl2;
        this.y0 = bl3;
        this.r0 = h8;
        this.x0 = i12;
        this.f1 = c8;
        this.z0 = a8;
        this.j1 = 1.0f;
        this.E0 = Y.i;
        this.e1 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.n0 = object3.j(i12);
        this.o0 = object3.c(i12);
        this.g1 = N.a;
        this.J0 = object2 = androidx.media3.exoplayer.J0.k((K)object2);
        this.K0 = new e((J0)object2);
        this.c0 = new N0[((M0[])looper).length];
        this.d0 = new boolean[((M0[])looper).length];
        object3 = j8.d();
        this.q = new O0[((M0[])looper).length];
        bl = false;
        for (n8 = 0; n8 < ((M0[])looper).length; ++n8) {
            looper[n8].m(n8, i12, h8);
            this.c0[n8] = looper[n8].u();
            if (object3 != null) {
                this.c0[n8].v((N0.a)object3);
            }
            if ((object2 = object[n8]) != null) {
                object2.m(n8, i12, h8);
                bl = true;
            }
            this.q[n8] = new O0(looper[n8], object[n8], n8);
        }
        this.B0 = bl;
        this.p0 = new k(this, h8);
        this.q0 = new ArrayList();
        this.l0 = new N.c();
        this.m0 = new N.b();
        j8.e(this, e8);
        this.b1 = true;
        looper = h8.d(looper2, null);
        this.A0 = looper;
        this.t0 = new t0(a8, (q)looper, new l0(this), c8);
        this.u0 = new I0(this, a8, (q)looper, i12);
        if (t8 == null) {
            t8 = new T();
        }
        this.j0 = t8;
        this.k0 = looper = t8.a();
        this.i0 = object = h8.d(looper, this);
        this.C0 = new androidx.media3.exoplayer.g(context, looper, this);
        object.j(35, new m0(this, z9)).a();
    }

    private void A(K0 k02) throws s {
        if (k02.i()) {
            return;
        }
        try {
            k02.f().B(k02.h(), k02.d());
            return;
        }
        finally {
            k02.j(true);
        }
    }

    private void A0() throws s {
        q0 q02 = this.t0.y();
        if (q02 != null && this.t0.u() != q02 && !q02.i && this.i2()) {
            this.t0.y().i = true;
        }
    }

    private void B() {
        if (this.B0 && this.x()) {
            for (O0 o02 : this.q) {
                int n8 = o02.h();
                o02.c(this.p0);
                this.W0 -= n8 - o02.h();
            }
            this.h1 = -9223372036854775807L;
        }
    }

    private void B0() throws s {
        this.a0(this.u0.i(), true);
    }

    private void B1(Y y8) throws s {
        this.E0 = y8;
        this.w();
    }

    private void C(int n8) throws s {
        int n9 = this.q[n8].h();
        this.q[n8].b(this.p0);
        this.s0(n8, false);
        this.W0 -= n9;
    }

    private void C0(c c8) throws s {
        this.K0.b(1);
        this.a0(this.u0.v(c8.a, c8.b, c8.c, c8.d), false);
    }

    private void D() throws s {
        for (int i8 = 0; i8 < this.q.length; ++i8) {
            this.C(i8);
        }
        this.h1 = -9223372036854775807L;
    }

    private void D0() {
        for (q0 q02 = this.t0.u(); q02 != null; q02 = q02.k()) {
            for (ax.l1.D d8 : q02.p().c) {
                if (d8 == null) continue;
                d8.r();
            }
        }
    }

    private void D1(Z z8) {
        this.D0 = z8;
    }

    /*
     * Unable to fully structure code
     */
    private void E() throws s, IOException {
        block24: {
            var8_1 = this.r0.c();
            this.i0.i(2);
            this.Z1();
            var1_2 = this.J0.e;
            var6_3 = true;
            if (var1_2 == 1 || var1_2 == 4) break block24;
            var12_4 = this.t0.u();
            if (var12_4 == null) {
                this.Z0(var8_1);
                return;
            }
            ax.S0.N.a("doSomeWork");
            this.e2();
            if (var12_4.f) {
                this.Z0 = ax.S0.d0.a1(this.r0.b());
                var12_4.a.v(this.J0.s - this.n0, this.o0);
                var2_5 = 0;
                var1_2 = 1;
                var4_6 = true;
                while (true) {
                    var13_10 = this.q;
                    var3_7 = var1_2;
                    var5_8 = var4_6;
                    if (var2_5 < ((O0[])var13_10).length) {
                        if ((var13_10 = var13_10[var2_5]).h() == 0) {
                            this.s0(var2_5, false);
                            var3_7 = var1_2;
                            var5_8 = var4_6;
                        } else {
                            var13_10.I(this.Y0, this.Z0);
                            var1_2 = var1_2 != 0 && var13_10.t() != false ? 1 : 0;
                            var7_9 = var13_10.a((q0)var12_4);
                            this.s0(var2_5, var7_9);
                            var4_6 = var4_6 != false && var7_9 != false;
                            var3_7 = var1_2;
                            var5_8 = var4_6;
                            if (!var7_9) {
                                this.r0(var2_5);
                                var5_8 = var4_6;
                                var3_7 = var1_2;
                            }
                        }
                        ++var2_5;
                        var1_2 = var3_7;
                        var4_6 = var5_8;
                        continue;
                    }
                    break;
                }
            } else {
                var12_4.a.l();
                var3_7 = 1;
                var5_8 = true;
            }
            var10_11 = var12_4.h.e;
            var1_2 = var3_7 != 0 && var12_4.f != false && (var10_11 == -9223372036854775807L || var10_11 <= this.J0.s) ? 1 : 0;
            if (var1_2 != 0 && this.N0) {
                this.N0 = false;
                this.s1(false, this.J0.n, false, 5);
            }
            if (var1_2 != 0 && var12_4.h.j) {
                this.H1(4);
                this.V1();
            } else if (this.J0.e == 2 && this.Q1(var5_8)) {
                this.H1(3);
                this.c1 = null;
                if (this.P1()) {
                    this.h2(false, false);
                    this.p0.f();
                    this.S1();
                }
            } else if (this.J0.e == 3 && !(this.W0 != 0 ? var5_8 != false : this.k0() != false)) {
                this.h2(this.P1(), false);
                this.H1(2);
                if (this.O0) {
                    this.F0();
                    this.v0.c();
                }
                this.V1();
            }
            if (this.J0.e != 2) ** GOTO lbl-1000
            for (var1_2 = 0; var1_2 < ((Object)(var13_10 = this.q)).length; ++var1_2) {
                if (!var13_10[var1_2].x((q0)var12_4)) continue;
                this.r0(var1_2);
            }
            var12_4 = this.J0;
            if (!var12_4.g && var12_4.r < 500000L && this.i0(this.t0.n()) && this.P1()) {
                if (this.e1 == -9223372036854775807L) {
                    this.e1 = this.r0.b();
                } else if (this.r0.b() - this.e1 >= 4000L) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            } else lbl-1000:
            // 2 sources

            {
                this.e1 = -9223372036854775807L;
            }
            var1_2 = this.P1() != false && this.J0.e == 3 ? 1 : 0;
            var4_6 = this.V0 != false && this.U0 != false && var1_2 != 0 ? var6_3 : false;
            var12_4 = this.J0;
            if (var12_4.p != var4_6) {
                this.J0 = var12_4.i(var4_6);
            }
            this.U0 = false;
            if (!var4_6 && (var2_5 = this.J0.e) != 4 && (var1_2 != 0 || var2_5 == 2 || var2_5 == 3 && this.W0 != 0)) {
                this.Z0(var8_1);
            }
            ax.S0.N.b();
        }
    }

    private void E0(boolean bl) {
        for (q0 q02 = this.t0.u(); q02 != null; q02 = q02.k()) {
            for (ax.l1.D d8 : q02.p().c) {
                if (d8 == null) continue;
                d8.g(bl);
            }
        }
    }

    private void F(q0 q02, int n8, boolean bl, long l8) throws s {
        O0 o02 = this.q[n8];
        if (!o02.y()) {
            boolean bl2 = q02 == this.t0.u();
            Object object = q02.p();
            W w8 = ((K)object).b[n8];
            object = ((K)object).c[n8];
            boolean bl3 = this.P1() && this.J0.e == 3;
            bl = !bl && bl3;
            ++this.W0;
            o02.e(w8, (ax.l1.D)object, q02.c[n8], this.Y0, bl, bl2, l8, q02.m(), q02.h.a, this.p0);
            o02.n(11, new M0.a(this){
                final n0 a;
                {
                    this.a = n02;
                }

                @Override
                public void a() {
                    androidx.media3.exoplayer.n0.q(this.a, true);
                }

                @Override
                public void b() {
                    if (!this.a.g0() && !this.a.V0) {
                        return;
                    }
                    this.a.i0.f(2);
                }
            }, q02);
            if (bl3 && bl2) {
                o02.W();
            }
        }
    }

    private void F0() {
        for (q0 q02 = this.t0.u(); q02 != null; q02 = q02.k()) {
            for (ax.l1.D d8 : q02.p().c) {
                if (d8 == null) continue;
                d8.s();
            }
        }
    }

    private void F1(boolean bl) throws s {
        this.S0 = bl;
        int n8 = this.t0.Y(this.J0.a, bl);
        if ((n8 & 1) != 0) {
            this.b1(true);
        } else if ((n8 & 2) != 0) {
            this.B();
        }
        this.Y(false);
    }

    private void G() throws s {
        this.H(new boolean[this.q.length], this.t0.y().n());
    }

    private void G1(g0 g02) throws s {
        this.K0.b(1);
        this.a0(this.u0.D(g02), false);
    }

    private void H(boolean[] blArray, long l8) throws s {
        int n8;
        q0 q02 = this.t0.y();
        K k8 = q02.p();
        for (n8 = 0; n8 < this.q.length; ++n8) {
            if (k8.c(n8)) continue;
            this.q[n8].L();
        }
        for (n8 = 0; n8 < this.q.length; ++n8) {
            if (!k8.c(n8) || this.q[n8].x(q02)) continue;
            this.F(q02, n8, blArray[n8], l8);
        }
    }

    private void H1(int n8) {
        J0 j02 = this.J0;
        if (j02.e != n8) {
            if (n8 != 2) {
                this.e1 = -9223372036854775807L;
            }
            if (n8 != 3 && j02.p) {
                this.J0 = j02.i(false);
            }
            this.J0 = this.J0.h(n8);
        }
    }

    private void I0() throws s {
        this.K0.b(1);
        this.Q0(false, false, false, true);
        this.g0.i(this.x0);
        int n8 = this.J0.a.q() ? 4 : 2;
        this.H1(n8);
        this.b2();
        this.u0.w(this.h0.d());
        this.i0.f(2);
    }

    private void I1(z z8) throws s {
        O0[] o0Array = this.q;
        int n8 = o0Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            o0Array[i8].T(z8);
        }
    }

    private ax.r7.z<C> J(ax.l1.D[] dArray) {
        z.a<Object> a8 = new z.a<Object>();
        int n8 = dArray.length;
        boolean bl = false;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = dArray[i8];
            boolean bl2 = bl;
            if (object != null) {
                object = object.h((int)0).l;
                if (object == null) {
                    a8.h(new C(new C.a[0]));
                    bl2 = bl;
                } else {
                    a8.h(object);
                    bl2 = true;
                }
            }
            bl = bl2;
        }
        if (bl) {
            return a8.k();
        }
        return ax.r7.z.z();
    }

    private long K() {
        J0 j02 = this.J0;
        return this.M(j02.a, j02.b.a, j02.s);
    }

    private void K0(ax.S0.k k8) {
        try {
            this.Q0(true, false, true, false);
            this.L0();
            this.g0.f(this.x0);
            this.C0.h();
            this.e0.j();
            this.H1(1);
            return;
        }
        finally {
            this.i0.k(null);
            this.j0.b();
            k8.f();
        }
    }

    private void K1(Object object, ax.S0.k k8) throws s {
        int n8;
        O0[] o0Array = this.q;
        int n9 = o0Array.length;
        for (n8 = 0; n8 < n9; ++n8) {
            o0Array[n8].U(object);
        }
        n8 = this.J0.e;
        if (n8 == 3 || n8 == 2) {
            this.i0.f(2);
        }
        if (k8 != null) {
            k8.f();
        }
    }

    private long L() {
        long l8 = this.J0.e == 3 ? 1000L : k1;
        Object object = this.q;
        int n8 = ((O0[])object).length;
        for (int i8 = 0; i8 < n8; ++i8) {
            l8 = Math.min(l8, ax.S0.d0.E1(object[i8].j(this.Y0, this.Z0)));
        }
        long l9 = l8;
        if (this.J0.n()) {
            object = this.t0.u() != null ? this.t0.u().k() : null;
            l9 = l8;
            if (object != null) {
                l9 = l8;
                if ((float)this.Y0 + (float)ax.S0.d0.a1(l8) * this.J0.o.a >= (float)((q0)object).n()) {
                    l9 = Math.min(l8, k1);
                }
            }
        }
        return l9;
    }

    private void L0() {
        for (int i8 = 0; i8 < this.q.length; ++i8) {
            this.c0[i8].l();
            this.q[i8].H();
        }
    }

    private long M(N object, Object object2, long l8) {
        ((N)object).n(((N)object).h((Object)object2, (N.b)this.m0).c, this.l0);
        object = this.l0;
        if (((N.c)object).f != -9223372036854775807L && ((N.c)object).f()) {
            object = this.l0;
            if (((N.c)object).i) {
                return ax.S0.d0.a1(((N.c)object).a() - this.l0.f) - (l8 + this.m0.o());
            }
        }
        return -9223372036854775807L;
    }

    private void M0(int n8, int n9, g0 g02) throws s {
        this.K0.b(1);
        this.a0(this.u0.A(n8, n9, g02), false);
    }

    private void M1(float f8) throws s {
        this.j1 = f8;
        float f9 = this.C0.f();
        O0[] o0Array = this.q;
        int n8 = o0Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            o0Array[i8].V(f8 * f9);
        }
    }

    private long N(q0 q02) {
        O0[] o0Array;
        if (q02 == null) {
            return 0L;
        }
        long l8 = q02.m();
        if (!q02.f) {
            return l8;
        }
        for (int i8 = 0; i8 < (o0Array = this.q).length; ++i8) {
            if (!o0Array[i8].x(q02)) continue;
            long l9 = this.q[i8].k(q02);
            if (l9 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            l8 = Math.max(l9, l8);
        }
        return l8;
    }

    private boolean N1() {
        if (!this.P1()) {
            return false;
        }
        if (this.N0) {
            return false;
        }
        q0 q02 = this.t0.u();
        if (q02 == null) {
            return false;
        }
        return (q02 = q02.k()) != null && this.Y0 >= q02.n() && q02.i;
    }

    private Pair<F.b, Long> O(N n8) {
        boolean bl = n8.q();
        long l8 = 0L;
        if (bl) {
            return Pair.create((Object)androidx.media3.exoplayer.J0.l(), (Object)0L);
        }
        int n9 = n8.a(this.S0);
        Pair<Object, Long> pair = n8.j(this.l0, this.m0, n9, -9223372036854775807L);
        F.b b8 = this.t0.Q(n8, pair.first, 0L);
        long l9 = (Long)pair.second;
        if (b8.b()) {
            n8.h(b8.a, this.m0);
            l9 = l8;
            if (b8.c == this.m0.l(b8.b)) {
                l9 = this.m0.g();
            }
        }
        return Pair.create((Object)b8, (Object)l9);
    }

    private void O0() throws s {
        float f8 = this.p0.h().a;
        Object object = this.t0.y();
        O0[] o0Array = null;
        int n8 = 1;
        for (Object object2 = this.t0.u(); object2 != null && ((q0)object2).f; object2 = ((q0)object2).k()) {
            Object object3 = this.J0;
            object3 = ((q0)object2).z(f8, object3.a, object3.l);
            if (object2 == this.t0.u()) {
                o0Array = object3;
            }
            if (!object3.a(((q0)object2).p())) {
                if (n8 != 0) {
                    object3 = this.t0.u();
                    boolean bl = (this.t0.N((q0)object3) & 1) != 0;
                    object2 = new boolean[this.q.length];
                    long l8 = object3.b((K)ax.S0.a.e(o0Array), this.J0.s, bl, (boolean[])object2);
                    o0Array = this.J0;
                    bl = o0Array.e != 4 && l8 != o0Array.s;
                    o0Array = this.J0;
                    this.J0 = this.e0(o0Array.b, l8, o0Array.c, o0Array.d, bl, 5);
                    if (bl) {
                        this.S0(l8);
                    }
                    this.B();
                    object = new boolean[this.q.length];
                    for (n8 = 0; n8 < (o0Array = this.q).length; ++n8) {
                        int n9 = o0Array[n8].h();
                        object[n8] = this.q[n8].y();
                        this.q[n8].B(object3.c[n8], this.p0, this.Y0, (boolean)object2[n8]);
                        if (n9 - this.q[n8].h() > 0) {
                            this.s0(n8, false);
                        }
                        this.W0 -= n9 - this.q[n8].h();
                    }
                    this.H((boolean[])object, this.Y0);
                    object3.i = true;
                } else {
                    this.t0.N((q0)object2);
                    if (((q0)object2).f) {
                        long l9 = Math.max(((q0)object2).h.b, ((q0)object2).C(this.Y0));
                        if (this.B0 && this.x() && this.t0.x() == object2) {
                            this.B();
                        }
                        ((q0)object2).a((K)object3, l9, false);
                    }
                }
                this.Y(true);
                if (this.J0.e == 4) break;
                this.m0();
                this.e2();
                this.i0.f(2);
                return;
            }
            if (object2 != object) continue;
            n8 = 0;
        }
    }

    private boolean O1() {
        boolean bl;
        block4: {
            o0.a a8;
            q0 q02;
            block5: {
                if (!this.i0(this.t0.n())) {
                    return false;
                }
                q02 = this.t0.n();
                long l8 = this.T(q02.l());
                long l9 = q02 == this.t0.u() ? q02.C(this.Y0) : q02.C(this.Y0) - q02.h.b;
                long l10 = this.R1(this.J0.a, q02.h.a) ? this.v0.b() : -9223372036854775807L;
                a8 = new o0.a(this.x0, this.J0.a, q02.h.a, l9, l8, this.p0.h().a, this.J0.l, this.O0, l10, this.P0);
                boolean bl2 = this.g0.b(a8);
                q02 = this.t0.u();
                bl = bl2;
                if (bl2) break block4;
                bl = bl2;
                if (!q02.f) break block4;
                bl = bl2;
                if (l8 >= 500000L) break block4;
                if (this.n0 > 0L) break block5;
                bl = bl2;
                if (!this.o0) break block4;
            }
            q02.a.v(this.J0.s, false);
            bl = this.g0.b(a8);
        }
        return bl;
    }

    private void P0() throws s {
        this.O0();
        this.b1(true);
    }

    private boolean P1() {
        J0 j02 = this.J0;
        return j02.l && j02.n == 0;
    }

    private Z Q(long l8) {
        if (this.G0 && l8 != -9223372036854775807L) {
            Y y8 = this.E0;
            Object object = y8.b;
            if (object != null && y8.c != null) {
                double d8 = object;
                double d9 = l8;
                object = RoundingMode.FLOOR;
                long l9 = ax.t7.a.f(d8 * d9, (RoundingMode)((Object)object));
                l8 = ax.t7.a.f(this.E0.c * d9, (RoundingMode)((Object)object));
                object = this.F0;
                if (object == null || ((Z)object).a != l9 || ((Z)object).b != l8) {
                    this.F0 = new Z(l9, l8);
                }
                return this.F0;
            }
        }
        return this.D0;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private void Q0(boolean var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        block12: {
            this.i0.i(2);
            this.H0 = false;
            var17_5 = null;
            this.I0 = null;
            this.c1 = null;
            var6_6 = 1;
            this.h2(false, true);
            this.p0.g();
            this.Y0 = 1000000000000L;
            try {
                this.D();
                break block12;
            }
            catch (s var14_7) {
            }
            catch (RuntimeException var14_8) {
                // empty catch block
            }
            u.d("ExoPlayerImplInternal", "Disable failed.", (Throwable)var14_9 /* !! */ );
        }
        if (var1_1) {
            for (Pair<F.b, Long> var15_12 : this.q) {
                try {
                    var15_12 /* !! */ .L();
                }
                catch (RuntimeException var15_13) {
                    u.d("ExoPlayerImplInternal", "Reset failed.", var15_13);
                }
            }
        }
        this.W0 = 0;
        var15_12 /* !! */  = this.J0;
        var14_9 /* !! */  = var15_12 /* !! */ .b;
        var8_14 = var15_12 /* !! */ .s;
        var10_15 = !this.J0.b.b() && !androidx.media3.exoplayer.n0.l0(this.J0, this.m0) ? this.J0.s : this.J0.c;
        if (!var2_2) ** GOTO lbl-1000
        this.X0 = null;
        var14_9 /* !! */  = this.O(this.J0.a);
        var15_12 /* !! */  = (F.b)var14_9 /* !! */ .first;
        var12_16 = (Long)var14_9 /* !! */ .second;
        var1_1 = var15_12 /* !! */ .equals((Object)this.J0.b);
        var10_15 = -9223372036854775807L;
        var14_9 /* !! */  = var15_12 /* !! */ ;
        var8_14 = var12_16;
        if (!var1_1) {
            var8_14 = var12_16;
            var10_15 = -9223372036854775807L;
            var14_9 /* !! */  = var15_12 /* !! */ ;
            var5_11 = var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var5_11 = 0;
        }
        this.t0.g();
        this.Q0 = false;
        var16_17 = this.J0.a;
        var15_12 /* !! */  = var16_17;
        if (!var3_3) ** GOTO lbl-1000
        var15_12 /* !! */  = var16_17;
        if (!(var16_17 instanceof L0)) ** GOTO lbl-1000
        var16_17 = ((L0)var16_17).E(this.u0.q());
        var15_12 /* !! */  = var16_17;
        if (var14_9 /* !! */ .b == -1) ** GOTO lbl-1000
        var16_17.h(var14_9 /* !! */ .a, this.m0);
        var15_12 /* !! */  = var16_17;
        if (var16_17.n(this.m0.c, this.l0).f()) {
            var15_12 /* !! */  = new F.b(var14_9 /* !! */ .a, var14_9 /* !! */ .d);
            var14_9 /* !! */  = var16_17;
        } else lbl-1000:
        // 4 sources

        {
            var16_17 = var15_12 /* !! */ ;
            var15_12 /* !! */  = var14_9 /* !! */ ;
            var14_9 /* !! */  = var16_17;
        }
        var19_18 /* !! */  = this.J0;
        var6_6 = var19_18 /* !! */ .e;
        var16_17 = var4_4 ? var17_5 : var19_18 /* !! */ .f;
        var17_5 = var5_11 != 0 ? ax.i1.q0.d : var19_18 /* !! */ .h;
        var18_19 = var5_11 != 0 ? this.f0 : var19_18 /* !! */ .i;
        var19_18 /* !! */  = var5_11 != 0 ? ax.r7.z.z() : var19_18 /* !! */ .j;
        var20_20 = this.J0;
        this.J0 = new J0((N)var14_9 /* !! */ , (F.b)var15_12 /* !! */ , var10_15, var8_14, var6_6, (s)var16_17, false, var17_5, var18_19, var19_18 /* !! */ , (F.b)var15_12 /* !! */ , var20_20.l, var20_20.m, var20_20.n, var20_20.o, var8_14, 0L, var8_14, 0L, false);
        if (var3_3) {
            this.t0.M();
            this.u0.y();
        }
    }

    private boolean Q1(boolean bl) {
        if (this.W0 == 0) {
            return this.k0();
        }
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (!this.J0.g) {
            return true;
        }
        q0 q02 = this.t0.u();
        long l8 = this.R1(this.J0.a, q02.h.a) ? this.v0.b() : -9223372036854775807L;
        q0 q03 = this.t0.n();
        boolean bl3 = q03.s() && q03.h.j;
        boolean bl4 = bl2;
        if (q03.h.a.b()) {
            bl4 = bl2;
            if (!q03.f) {
                bl4 = true;
            }
        }
        if (!bl3 && !bl4) {
            long l9 = this.T(q03.j());
            return this.g0.a(new o0.a(this.x0, this.J0.a, q02.h.a, q02.C(this.Y0), l9, this.p0.h().a, this.J0.l, this.O0, l8, this.P0));
        }
        return true;
    }

    private long R() {
        if (this.J0.e == 3 && !this.P1()) {
            return 1000L;
        }
        return k1;
    }

    private void R0() {
        q0 q02 = this.t0.u();
        boolean bl = q02 != null && q02.h.i && this.M0;
        this.N0 = bl;
    }

    private boolean R1(N object, F.b b8) {
        if (!b8.b() && !((N)object).q()) {
            ((N)object).n(((N)object).h((Object)b8.a, (N.b)this.m0).c, this.l0);
            if (this.l0.f()) {
                object = this.l0;
                if (((N.c)object).i && ((N.c)object).f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private long S() {
        return this.T(this.J0.q);
    }

    private void S0(long l8) throws s {
        q0 q02 = this.t0.u();
        l8 = q02 == null ? (l8 += 1000000000000L) : q02.D(l8);
        this.Y0 = l8;
        this.p0.c(l8);
        O0[] o0Array = this.q;
        int n8 = o0Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            o0Array[i8].M(q02, this.Y0);
        }
        this.D0();
    }

    private void S1() throws s {
        Object object = this.t0.u();
        if (object != null) {
            object = ((q0)object).p();
            for (int i8 = 0; i8 < this.q.length; ++i8) {
                if (!((K)object).c(i8)) continue;
                this.q[i8].W();
            }
        }
    }

    private long T(long l8) {
        q0 q02 = this.t0.n();
        if (q02 == null) {
            return 0L;
        }
        return Math.max(0L, l8 - q02.C(this.Y0));
    }

    private static void T0(N object, d d8, N.c c8, N.b b8) {
        int n8 = ((N)object).n((int)((N)object).h((Object)d8.e0, (N.b)b8).c, (N.c)c8).o;
        object = ((N)object).g((int)n8, (N.b)b8, (boolean)true).b;
        long l8 = b8.d;
        l8 = l8 != -9223372036854775807L ? --l8 : Long.MAX_VALUE;
        d8.h(n8, l8, object);
    }

    private void U(int n8) throws s {
        J0 j02 = this.J0;
        this.d2(j02.l, n8, j02.n, j02.m);
    }

    private static boolean U0(d d8, N n8, N pair, int n9, boolean bl, N.c c8, N.b b8) {
        Object object = d8.e0;
        if (object == null) {
            long l8 = d8.q.e() == Long.MIN_VALUE ? -9223372036854775807L : ax.S0.d0.a1(d8.q.e());
            pair = androidx.media3.exoplayer.n0.X0(n8, new h(d8.q.g(), d8.q.c(), l8), false, n9, bl, c8, b8);
            if (pair == null) {
                return false;
            }
            d8.h(n8.b(pair.first), (Long)pair.second, pair.first);
            if (d8.q.e() == Long.MIN_VALUE) {
                androidx.media3.exoplayer.n0.T0(n8, d8, c8, b8);
            }
            return true;
        }
        n9 = n8.b(object);
        if (n9 == -1) {
            return false;
        }
        if (d8.q.e() == Long.MIN_VALUE) {
            androidx.media3.exoplayer.n0.T0(n8, d8, c8, b8);
            return true;
        }
        d8.c0 = n9;
        pair.h(d8.e0, b8);
        if (b8.f && pair.n((int)b8.c, (N.c)c8).n == pair.b(d8.e0)) {
            long l9 = d8.d0;
            long l10 = b8.o();
            pair = n8.j(c8, b8, n8.h((Object)d8.e0, (N.b)b8).c, l9 + l10);
            d8.h(n8.b(pair.first), (Long)pair.second, pair.first);
        }
        return true;
    }

    private void U1(boolean bl, boolean bl2) {
        bl = bl || !this.T0;
        this.Q0(bl, false, true, false);
        this.K0.b(bl2 ? 1 : 0);
        this.g0.g(this.x0);
        this.C0.n(this.J0.l, 1);
        this.H1(1);
    }

    private void V() throws s {
        this.M1(this.j1);
    }

    private void V0(N n8, N n9) {
        if (n8.q() && n9.q()) {
            return;
        }
        for (int i8 = this.q0.size() - 1; i8 >= 0; --i8) {
            if (androidx.media3.exoplayer.n0.U0(this.q0.get(i8), n8, n9, this.R0, this.S0, this.l0, this.m0)) continue;
            this.q0.get((int)i8).q.j(false);
            this.q0.remove(i8);
        }
        Collections.sort(this.q0);
    }

    private void V1() throws s {
        this.p0.g();
        O0[] o0Array = this.q;
        int n8 = o0Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            o0Array[i8].Y();
        }
    }

    private void W(ax.i1.C c8) {
        if (this.t0.F(c8)) {
            this.t0.K(this.Y0);
            this.m0();
            return;
        }
        if (this.t0.G(c8)) {
            this.n0();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static g W0(N var0, J0 var1_1, h var2_2, t0 var3_3, int var4_4, boolean var5_5, N.c var6_6, N.b var7_7) {
        if (var0.q()) {
            return new g(androidx.media3.exoplayer.J0.l(), 0L, -9223372036854775807L, false, true, false);
        }
        var21_8 = var1_1.b;
        var20_9 = var21_8.a;
        var19_10 = androidx.media3.exoplayer.n0.l0(var1_1, var7_7);
        var10_11 = !var1_1.b.b() && !var19_10 ? var1_1.s : var1_1.c;
        var9_12 = 0;
        if (var2_2 != null) {
            var22_13 = androidx.media3.exoplayer.n0.X0(var0, (h)var2_2, true, var4_4, var5_5, (N.c)var6_6 /* !! */ , var7_7);
            if (var22_13 == null) {
                var4_4 = var0.a(var5_5);
                var12_14 = var10_11;
                var5_5 = false;
                var17_15 = false;
                var16_16 = true;
                var2_2 = var20_9;
            } else {
                if (var2_2.c == -9223372036854775807L) {
                    var4_4 = var0.h((Object)var22_13.first, (N.b)var7_7).c;
                    var12_14 = var10_11;
                    var5_5 = false;
                } else {
                    var20_9 = var22_13.first;
                    var12_14 = (Long)var22_13.second;
                    var4_4 = -1;
                    var5_5 = true;
                }
                var17_15 = var1_1.e == 4;
                var16_16 = false;
                var2_2 = var20_9;
            }
            var18_17 = var5_5;
            var5_5 = var17_15;
            var17_15 = var18_17;
        } else if (var1_1.a.q()) {
            var4_4 = var0.a(var5_5);
lbl36:
            // 2 sources

            while (true) {
                var2_2 = var20_9;
lbl38:
                // 2 sources

                while (true) {
                    var12_14 = var10_11;
                    var5_5 = false;
                    var16_16 = false;
                    var17_15 = false;
                    ** GOTO lbl82
                    break;
                }
                break;
            }
        } else if (var0.b(var20_9) == -1) {
            if ((var4_4 = androidx.media3.exoplayer.n0.Y0((N.c)var6_6 /* !! */ , var7_7, var4_4, var5_5, var20_9, var1_1.a, var0)) == -1) {
                var4_4 = var0.a(var5_5);
                var5_5 = true;
            } else {
                var5_5 = false;
            }
            var2_2 = var20_9;
            var16_16 = var5_5;
            var5_5 = false;
            var17_15 = false;
            var12_14 = var10_11;
        } else {
            if (var10_11 == -9223372036854775807L) {
                var4_4 = var0.h((Object)var20_9, (N.b)var7_7).c;
                ** continue;
            }
            if (var19_10) {
                var1_1.a.h(var21_8.a, var7_7);
                if (var1_1.a.n((int)var7_7.c, (N.c)var6_6 /* !! */ ).n == var1_1.a.b(var21_8.a)) {
                    var12_14 = var7_7.o();
                    var20_9 = var0.j((N.c)var6_6 /* !! */ , var7_7, var0.h((Object)var20_9, (N.b)var7_7).c, var12_14 + var10_11);
                    var2_2 = var20_9.first;
                    var12_14 = (Long)var20_9.second;
                } else if (var0.h((Object)var20_9, (N.b)var7_7).d != -9223372036854775807L) {
                    var12_14 = ax.S0.d0.q(var10_11, 0L, var7_7.d - 1L);
                    var2_2 = var20_9;
                } else {
                    var2_2 = var20_9;
                    var12_14 = var10_11;
                }
                var4_4 = -1;
                var5_5 = false;
                var16_16 = false;
                var17_15 = true;
            } else {
                var2_2 = var20_9;
                var4_4 = -1;
                ** continue;
            }
        }
lbl82:
        // 4 sources

        if (var4_4 != -1) {
            var6_6 /* !! */  = var0.j((N.c)var6_6 /* !! */ , var7_7, var4_4, -9223372036854775807L);
            var2_2 = var6_6 /* !! */ .first;
            var12_14 = (Long)var6_6 /* !! */ .second;
            var14_18 = -9223372036854775807L;
        } else {
            var14_18 = var12_14;
        }
        var3_3 = var3_3.Q(var0, var2_2, var12_14);
        var4_4 = var3_3.e;
        var8_19 = var4_4 != -1 && ((var8_19 = var21_8.e) == -1 || var4_4 < var8_19) ? 0 : 1;
        var4_4 = var9_12;
        if (var21_8.a.equals(var2_2)) {
            var4_4 = var9_12;
            if (!var21_8.b()) {
                var4_4 = var9_12;
                if (!var3_3.b()) {
                    var4_4 = var9_12;
                    if (var8_19 != 0) {
                        var4_4 = 1;
                    }
                }
            }
        }
        var6_6 /* !! */  = var0.h(var2_2, var7_7);
        var2_2 = var3_3;
        var18_17 = androidx.media3.exoplayer.n0.h0(var19_10, var21_8, var10_11, var2_2, var6_6 /* !! */ , var14_18);
        if (var4_4 != 0 || var18_17) {
            var2_2 = var21_8;
        }
        if (var2_2.b()) {
            if (var2_2.equals(var21_8)) {
                var12_14 = var1_1.s;
            } else {
                var0.h(var2_2.a, var7_7);
                if (var2_2.c == var7_7.l(var2_2.b)) {
                    var10_11 = var7_7.g();
lbl114:
                    // 2 sources

                    while (true) {
                        var12_14 = var10_11;
                        break;
                    }
                } else {
                    var10_11 = 0L;
                    ** continue;
                }
            }
        }
        return new g((F.b)var2_2, var12_14, var14_18, var5_5, var16_16, var17_15);
    }

    private void W1() {
        Object object = this.t0.n();
        boolean bl = this.Q0 || object != null && ((q0)object).a.c();
        object = this.J0;
        if (bl != ((J0)object).g) {
            this.J0 = ((J0)object).b(bl);
        }
    }

    private void X(IOException exception, int n8) {
        s s8 = s.e(exception, n8);
        q0 q02 = this.t0.u();
        exception = s8;
        if (q02 != null) {
            exception = s8.c(q02.h.a);
        }
        u.d("ExoPlayerImplInternal", "Playback error", exception);
        this.U1(false, false);
        this.J0 = this.J0.f((s)exception);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Pair<Object, Long> X0(N n8, h h8, boolean bl, int n9, boolean bl2, N.c c8, N.b b8) {
        Pair<Object, Long> pair = h8.a;
        if (n8.q()) {
            return null;
        }
        Pair<Object, Long> pair2 = pair;
        if (pair.q()) {
            pair2 = n8;
        }
        try {
            pair = pair2.j(c8, b8, h8.b, h8.c);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return null;
        }
        if (n8.equals(pair2)) {
            return pair;
        }
        if (n8.b(pair.first) != -1) {
            if (!pair2.h((Object)pair.first, (N.b)b8).f || pair2.n((int)b8.c, (N.c)c8).n != pair2.b(pair.first)) return pair;
            return n8.j(c8, b8, n8.h((Object)pair.first, (N.b)b8).c, h8.c);
        }
        if (bl && (n9 = androidx.media3.exoplayer.n0.Y0(c8, b8, n9, bl2, pair.first, pair2, n8)) != -1) {
            return n8.j(c8, b8, n9, -9223372036854775807L);
        }
        return null;
    }

    private void X1(F.b b8, ax.i1.q0 q02, K k8) {
        q0 q03 = ax.S0.a.e(this.t0.n());
        long l8 = q03 == this.t0.u() ? q03.C(this.Y0) : q03.C(this.Y0) - q03.h.b;
        long l9 = this.T(q03.j());
        long l10 = this.R1(this.J0.a, q03.h.a) ? this.v0.b() : -9223372036854775807L;
        this.g0.d(new o0.a(this.x0, this.J0.a, b8, l8, l9, this.p0.h().a, this.J0.l, this.O0, l10, this.P0), q02, k8.c);
    }

    private void Y(boolean bl) {
        q0 q02 = this.t0.n();
        Object object = q02 == null ? this.J0.b : q02.h.a;
        boolean bl2 = this.J0.k.equals(object);
        if (!bl2) {
            this.J0 = this.J0.c((F.b)object);
        }
        object = this.J0;
        long l8 = q02 == null ? ((J0)object).s : q02.j();
        ((J0)object).q = l8;
        this.J0.r = this.S();
        if ((!bl2 || bl) && q02 != null && q02.f) {
            this.X1(q02.h.a, q02.o(), q02.p());
        }
    }

    static int Y0(N.c c8, N.b b8, int n8, boolean bl, Object object, N n9, N n10) {
        int n11;
        Object object2 = n9.n((int)n9.h((Object)object, (N.b)b8).c, (N.c)c8).a;
        int n12 = 0;
        for (n11 = 0; n11 < n10.p(); ++n11) {
            if (!n10.n((int)n11, (N.c)c8).a.equals(object2)) continue;
            return n11;
        }
        int n13 = n9.b(object);
        int n14 = n9.i();
        n11 = -1;
        while (n12 < n14 && n11 == -1 && (n13 = n9.d(n13, b8, c8, n8, bl)) != -1) {
            n11 = n10.b(n9.m(n13));
            ++n12;
        }
        if (n11 == -1) {
            return -1;
        }
        return n10.f((int)n11, (N.b)b8).c;
    }

    private void Y1(int n8, int n9, List<y> list) throws s {
        this.K0.b(1);
        this.a0(this.u0.E(n8, n9, list), false);
    }

    private void Z(q0 q02) throws s {
        J0 j02;
        if (!q02.f) {
            float f8 = this.p0.h().a;
            j02 = this.J0;
            q02.q(f8, j02.a, j02.l);
        }
        this.X1(q02.h.a, q02.o(), q02.p());
        if (q02 == this.t0.u()) {
            this.S0(q02.h.b);
            this.G();
            q02.i = true;
            j02 = this.J0;
            F.b b8 = j02.b;
            long l8 = q02.h.b;
            this.J0 = this.e0(b8, l8, j02.c, l8, false, 5);
        }
        this.m0();
    }

    private void Z0(long l8) {
        long l9 = this.g0() ? this.L() : this.R();
        this.i0.h(2, l8 + l9);
    }

    private void Z1() throws s {
        if (!this.J0.a.q() && this.u0.t()) {
            boolean bl = this.u0();
            this.y0();
            this.z0();
            this.A0();
            this.w0();
            this.x0(bl);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a0(N var1_1, boolean var2_2) throws s {
        block25: {
            block24: {
                block21: {
                    block23: {
                        block22: {
                            var18_3 = this.J0;
                            var19_4 = this.X0;
                            var20_5 = this.t0;
                            var3_6 = this.R0;
                            var6_7 = this.S0;
                            var21_8 = this.l0;
                            var17_9 = this.m0;
                            var20_5 = androidx.media3.exoplayer.n0.W0(var1_1, (J0)var18_3, (h)var19_4, (t0)var20_5, var3_6, var6_7, (N.c)var21_8, (N.b)var17_9);
                            var19_4 = var20_5.a;
                            var15_16 = var20_5.c;
                            var6_7 = var20_5.d;
                            var9_17 = var20_5.b;
                            var3_6 = this.J0.b.equals(var19_4) && var9_17 == this.J0.s ? 0 : 1;
                            if (var20_5.e) {
                                if (this.J0.e != 1) {
                                    this.H1(4);
                                }
                                this.Q0(false, false, false, true);
                            }
                            var17_9 = this.q;
                            var5_19 = ((O0[])var17_9).length;
                            for (var4_20 = 0; var4_20 < var5_19; ++var4_20) {
                                var17_9[var4_20].S(var1_1);
                            }
                            if (var3_6 != 0) break block21;
                            try {
                                var17_9 = this.t0.y();
                                var13_21 = 0L;
                                var7_18 = var17_9 == null ? 0L : this.N(this.t0.y());
                                var6_7 = this.x();
                                var11_22 = var13_21;
                                if (!var6_7) break block22;
                            }
                            catch (Throwable var17_15) {}
                            try {
                                var11_22 = this.t0.x() == null ? var13_21 : this.N(this.t0.x());
                            }
                            catch (Throwable var17_10) {
                                var18_3 = var1_1;
                            }
                            break block25;
                        }
                        try {
                            var17_9 = this.t0;
                            var13_21 = this.Y0;
                        }
                        catch (Throwable var17_14) {
                            ** GOTO lbl-1000
                        }
                        try {
                            var4_20 = var17_9.W(var1_1, var13_21, var7_18, var11_22);
                            if ((var4_20 & 1) == 0) break block23;
                        }
                        catch (Throwable var17_13) {
                            ** GOTO lbl-1000
                        }
                        try {
                            this.b1(false);
                            var7_18 = var9_17;
                            break block24;
                        }
                        catch (Throwable var17_11) {}
                        ** GOTO lbl-1000
                    }
                    var7_18 = var9_17;
                    if ((var4_20 & 2) != 0) {
                        this.B();
                        var7_18 = var9_17;
                    }
                    break block24;
lbl-1000:
                    // 4 sources

                    {
                        var18_3 = var1_1;
                        break block25;
                    }
                }
                var7_18 = var9_17;
                if (!var1_1.q()) {
                    for (var17_9 = this.t0.u(); var17_9 != null; var17_9 = var17_9.k()) {
                        if (!var17_9.h.a.equals(var19_4)) continue;
                        var17_9.h = this.t0.z(var1_1, var17_9.h);
                        var17_9.E();
                    }
                    var7_18 = this.d1((F.b)var19_4, var9_17, var6_7);
                }
            }
            var18_3 = this.J0;
            var17_9 = var18_3.a;
            var18_3 = var18_3.b;
            var9_17 = var20_5.f != false ? var7_18 : -9223372036854775807L;
            this.f2(var1_1, (F.b)var19_4, (N)var17_9, (F.b)var18_3, var9_17, false);
            if (var3_6 != 0 || var15_16 != this.J0.c) {
                var18_3 = this.J0;
                var17_9 = var18_3.b.a;
                var18_3 = var18_3.a;
                var2_2 = var3_6 != 0 && var2_2 != false && var18_3.q() == false && var18_3.h((Object)var17_9, (N.b)this.m0).f == false;
                var9_17 = this.J0.d;
                var3_6 = var1_1.b(var17_9) == -1 ? 4 : 3;
                this.J0 = this.e0((F.b)var19_4, var7_18, var15_16, var9_17, var2_2, var3_6);
            }
            this.R0();
            this.V0(var1_1, this.J0.a);
            this.J0 = this.J0.j(var1_1);
            if (!var1_1.q()) {
                this.X0 = null;
            }
            this.Y(false);
            this.i0.f(2);
            return;
        }
        var21_8 = this.J0;
        var18_3 = var21_8.a;
        var21_8 = var21_8.b;
        var7_18 = var20_5.f != false ? var9_17 : -9223372036854775807L;
        this.f2(var1_1, (F.b)var19_4, (N)var18_3, (F.b)var21_8, var7_18, false);
        if (var3_6 != 0 || var15_16 != this.J0.c) {
            var20_5 = this.J0;
            var18_3 = var20_5.b.a;
            var20_5 = var20_5.a;
            var2_2 = var3_6 != 0 && var2_2 != false && var20_5.q() == false && var20_5.h((Object)var18_3, (N.b)this.m0).f == false;
            var7_18 = this.J0.d;
            var3_6 = var1_1.b(var18_3) == -1 ? 4 : 3;
            this.J0 = this.e0((F.b)var19_4, var9_17, var15_16, var7_18, var2_2, var3_6);
        }
        this.R0();
        this.V0(var1_1, this.J0.a);
        this.J0 = this.J0.j(var1_1);
        if (!var1_1.q()) {
            this.X0 = null;
        }
        this.Y(false);
        this.i0.f(2);
        throw var17_12;
    }

    private static int a2(int n8, int n9) {
        if (n8 == -1) {
            return 2;
        }
        if (n9 == 2) {
            return 1;
        }
        return n9;
    }

    private void b0(ax.i1.C c8) throws s {
        if (this.t0.F(c8)) {
            this.Z(ax.S0.a.e(this.t0.n()));
            return;
        }
        q0 q02 = this.t0.v(c8);
        if (q02 != null) {
            ax.S0.a.g(q02.f ^ true);
            float f8 = this.p0.h().a;
            J0 j02 = this.J0;
            q02.q(f8, j02.a, j02.l);
            if (this.t0.G(c8)) {
                this.n0();
            }
        }
    }

    private void b1(boolean bl) throws s {
        F.b b8 = this.t0.u().h.a;
        long l8 = this.e1(b8, this.J0.s, true, false);
        if (l8 != this.J0.s) {
            J0 j02 = this.J0;
            this.J0 = this.e0(b8, l8, j02.c, j02.d, bl, 5);
        }
    }

    private void b2() throws s {
        J0 j02 = this.J0;
        this.c2(j02.l, j02.n, j02.m);
    }

    private void c0(G g8, float f8, boolean bl, boolean bl2) throws s {
        if (bl) {
            if (bl2) {
                this.K0.b(1);
            }
            this.J0 = this.J0.g(g8);
        }
        this.j2(g8.a);
        O0[] o0Array = this.q;
        int n8 = o0Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            o0Array[i8].Q(f8, g8.a);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c1(h var1_1, boolean var2_7) throws s {
        block25: {
            block28: {
                block26: {
                    block27: {
                        block30: {
                            block29: {
                                block24: {
                                    this.K0.b((int)var2_7);
                                    if (this.H0) {
                                        this.I0 = var1_1;
                                        return;
                                    }
                                    var16_8 /* !! */  = androidx.media3.exoplayer.n0.X0(this.J0.a, (h)var1_1, true, this.R0, this.S0, this.l0, this.m0);
                                    var2_7 = false;
                                    if (var16_8 /* !! */  == null) {
                                        var17_9 = this.O(this.J0.a);
                                        var15_10 = (F.b)var17_9.first;
                                        var6_11 = (Long)var17_9.second;
                                        var12_12 = this.J0.a.q() ^ true;
                                        var4_13 = -9223372036854775807L;
                                    } else {
                                        var15_10 = var16_8 /* !! */ .first;
                                        var6_11 = (Long)var16_8 /* !! */ .second;
                                        var4_13 = var1_1.c == -9223372036854775807L ? -9223372036854775807L : var6_11;
                                        if ((var15_10 = this.t0.Q(this.J0.a, var15_10, var6_11)).b()) {
                                            this.J0.a.h(var15_10.a, this.m0);
                                            var6_11 = this.m0.l(var15_10.b) == var15_10.c ? this.m0.g() : 0L;
                                            var12_12 = true;
                                        } else {
                                            var12_12 = var1_1.c == -9223372036854775807L;
                                        }
                                    }
                                    var13_14 = var12_12;
                                    try {
                                        if (!this.J0.a.q()) break block24;
                                        var13_14 = var12_12;
                                        this.X0 = var1_1;
                                        break block25;
                                    }
                                    catch (Throwable var1_2) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var12_12 = var13_14;
                                            break block26;
                                            break;
                                        }
                                    }
                                }
                                if (var16_8 /* !! */  != null) break block29;
                                var13_14 = var12_12;
                                if (this.J0.e != 1) {
                                    var13_14 = var12_12;
                                    this.H1(4);
                                }
                                var13_14 = var12_12;
                                this.Q0(false, true, false, true);
                                break block25;
                            }
                            var13_14 = var12_12;
                            if (!var15_10.equals(this.J0.b)) break block30;
                            var13_14 = var12_12;
                            var1_1 = this.t0.u();
                            if (var1_1 == null) ** GOTO lbl-1000
                            var13_14 = var12_12;
                            if (var1_1.f && var6_11 != 0L) {
                                var13_14 = var12_12;
                                var8_15 = var1_1.a.q(var6_11, this.Q(this.l0.m));
                            } else lbl-1000:
                            // 2 sources

                            {
                                var8_15 = var6_11;
                            }
                            var13_14 = var12_12;
                            var10_16 = ax.S0.d0.E1(var8_15);
                            var13_14 = var12_12;
                            var1_1 = this.J0;
                            try {
                                if (var10_16 == ax.S0.d0.E1(var1_1.s)) {
                                    var1_1 = this.J0;
                                    var3_17 = var1_1.e;
                                    if (var3_17 == 2 || var3_17 == 3) {
                                        var10_16 = var8_15 = var1_1.s;
                                        var6_11 = var8_15;
                                    }
                                }
                                break block27;
                            }
                            catch (Throwable var1_4) {
                                var13_14 = var12_12;
                                ** continue;
                            }
                        }
                        var8_15 = var6_11;
                    }
                    var13_14 = var12_12;
                    {
                        this.H0 = this.G0;
                        var13_14 = var12_12;
                        var14_18 = this.J0.e == 4;
                        var13_14 = var12_12;
                        if (var6_11 != (var8_15 = this.d1((F.b)var15_10, var8_15, var14_18))) {
                            var2_7 = true;
                        }
                        var12_12 |= var2_7;
                    }
                    var16_8 /* !! */  = this.J0;
                    var1_1 = var16_8 /* !! */ .a;
                    var16_8 /* !! */  = var16_8 /* !! */ .b;
                    break block28;
                }
lbl88:
                // 2 sources

                while (true) {
                    this.J0 = this.e0((F.b)var15_10, var6_11, var4_13, var6_11, var12_12, 2);
                    throw var1_3;
                }
lbl91:
                // 2 sources

                while (true) {
                    this.J0 = this.e0((F.b)var15_10, var6_11, var4_13, var10_16, var12_12, 2);
                    return;
                }
            }
            try {
                this.f2((N)var1_1, (F.b)var15_10, (N)var1_1, (F.b)var16_8 /* !! */ , var4_13, true);
                var6_11 = var8_15;
            }
            catch (Throwable var1_5) lbl-1000:
            // 2 sources

            {
                while (true) {
                    var6_11 = var8_15;
                    ** continue;
                    break;
                }
            }
        }
        var10_16 = var6_11;
        ** while (true)
        catch (Throwable var1_6) {
            ** continue;
        }
    }

    private void c2(boolean bl, int n8, int n9) throws s {
        this.d2(bl, this.C0.n(bl, this.J0.e), n8, n9);
    }

    private void d0(G g8, boolean bl) throws s {
        this.c0(g8, g8.a, true, bl);
    }

    private long d1(F.b b8, long l8, boolean bl) throws s {
        boolean bl2 = this.t0.u() != this.t0.y();
        return this.e1(b8, l8, bl2, bl);
    }

    private void d2(boolean bl, int n8, int n9, int n10) throws s {
        bl = bl && n8 != -1;
        n10 = androidx.media3.exoplayer.n0.a2(n8, n10);
        n8 = androidx.media3.exoplayer.n0.g2(n8, n9);
        J0 j02 = this.J0;
        if (j02.l != bl || j02.n != n8 || j02.m != n10) {
            this.J0 = j02.e(bl, n10, n8);
            this.h2(false, false);
            this.E0(bl);
            if (!this.P1()) {
                this.V1();
                this.e2();
                j02 = this.J0;
                if (j02.p) {
                    this.J0 = j02.i(false);
                }
                this.t0.K(this.Y0);
                return;
            }
            n8 = this.J0.e;
            if (n8 == 3) {
                this.p0.f();
                this.S1();
                this.i0.f(2);
                return;
            }
            if (n8 == 2) {
                this.i0.f(2);
            }
        }
    }

    private J0 e0(F.b b8, long l8, long l9, long l10, boolean bl, int n8) {
        Object object;
        boolean bl2 = this.b1 || l8 != this.J0.s || !b8.equals(this.J0.b);
        this.b1 = bl2;
        this.R0();
        ax.r7.z<C> z8 = this.J0;
        Object object2 = ((J0)((Object)z8)).h;
        Object object3 = ((J0)((Object)z8)).i;
        z8 = ((J0)((Object)z8)).j;
        if (this.u0.t()) {
            object = this.t0.u();
            object3 = object == null ? ax.i1.q0.d : ((q0)object).o();
            object2 = object == null ? this.f0 : ((q0)object).p();
            z8 = this.J(((K)object2).c);
            if (object != null) {
                r0 r02 = ((q0)object).h;
                if (r02.c != l9) {
                    ((q0)object).h = r02.a(l9);
                }
            }
            this.v0();
            object = object2;
        } else {
            if (!b8.equals(this.J0.b)) {
                object2 = ax.i1.q0.d;
                object3 = this.f0;
                z8 = ax.r7.z.z();
            }
            object = object3;
            object3 = object2;
        }
        if (bl) {
            this.K0.d(n8);
        }
        return this.J0.d(b8, l8, l9, l10, this.S(), (ax.i1.q0)object3, (K)object, z8);
    }

    private long e1(F.b b8, long l8, boolean bl, boolean bl2) throws s {
        q0 q02;
        q0 q03;
        this.V1();
        this.h2(false, true);
        if (bl2 || this.J0.e == 3) {
            this.H1(2);
        }
        for (q03 = q02 = this.t0.u(); q03 != null && !b8.equals(q03.h.a); q03 = q03.k()) {
        }
        if (bl || q02 != q03 || q03 != null && q03.D(l8) < 0L) {
            this.D();
            if (q03 != null) {
                while (this.t0.u() != q03) {
                    this.t0.b();
                }
                this.t0.N(q03);
                q03.B(1000000000000L);
                this.G();
                q03.i = true;
            }
        }
        this.B();
        if (q03 != null) {
            long l9;
            this.t0.N(q03);
            if (!q03.f) {
                q03.h = q03.h.b(l8);
                l9 = l8;
            } else {
                l9 = l8;
                if (q03.g) {
                    l9 = q03.a.m(l8);
                    q03.a.v(l9 - this.n0, this.o0);
                }
            }
            this.S0(l9);
            this.m0();
            l8 = l9;
        } else {
            this.t0.g();
            this.S0(l8);
        }
        this.Y(false);
        this.i0.f(2);
        return l8;
    }

    private void e2() throws s {
        q0 q02 = this.t0.u();
        if (q02 != null) {
            float f8;
            Object object;
            long l8 = q02.f ? q02.a.s() : -9223372036854775807L;
            if (l8 != -9223372036854775807L) {
                if (!q02.s()) {
                    this.t0.N(q02);
                    this.Y(false);
                    this.m0();
                }
                this.S0(l8);
                if (l8 != this.J0.s) {
                    object = this.J0;
                    this.J0 = this.e0(((J0)object).b, l8, ((J0)object).c, l8, true, 5);
                }
            } else {
                object = this.p0;
                boolean bl = q02 != this.t0.y();
                this.Y0 = l8 = ((k)object).i(bl);
                l8 = q02.C(l8);
                this.t0(this.J0.s, l8);
                if (this.p0.z()) {
                    bl = this.K0.d;
                    object = this.J0;
                    this.J0 = this.e0(((J0)object).b, l8, ((J0)object).c, l8, bl ^ true, 6);
                } else {
                    this.J0.o(l8);
                }
            }
            object = this.t0.n();
            this.J0.q = ((q0)object).j();
            this.J0.r = this.S();
            object = this.J0;
            if (((J0)object).l && ((J0)object).e == 3 && this.R1(((J0)object).a, ((J0)object).b) && this.J0.o.a == 1.0f && this.p0.h().a != (f8 = this.v0.a(this.K(), this.J0.r))) {
                this.m1(this.J0.o.b(f8));
                this.c0(this.J0.o, this.p0.h().a, false, false);
            }
        }
    }

    private boolean f0() {
        O0[] o0Array;
        q0 q02 = this.t0.y();
        if (!q02.f) {
            return false;
        }
        for (int i8 = 0; i8 < (o0Array = this.q).length; ++i8) {
            if (o0Array[i8].o(q02)) continue;
            return false;
        }
        return true;
    }

    private void f1(K0 k02) throws s {
        if (k02.e() == -9223372036854775807L) {
            this.g1(k02);
            return;
        }
        if (this.J0.a.q()) {
            this.q0.add(new d(k02));
            return;
        }
        d d8 = new d(k02);
        N n8 = this.J0.a;
        if (androidx.media3.exoplayer.n0.U0(d8, n8, n8, this.R0, this.S0, this.l0, this.m0)) {
            this.q0.add(d8);
            Collections.sort(this.q0);
            return;
        }
        k02.j(false);
    }

    private void f2(N object, F.b object2, N n8, F.b b8, long l8, boolean bl) throws s {
        block8: {
            block7: {
                block6: {
                    if (this.R1((N)object, (F.b)object2)) break block6;
                    object = ((F.b)object2).b() ? G.d : this.J0.o;
                    if (!this.p0.h().equals(object)) {
                        this.m1((G)object);
                        this.c0(this.J0.o, ((G)object).a, false, false);
                        return;
                    }
                    break block7;
                }
                ((N)object).n(((N)object).h((Object)((F.b)object2).a, (N.b)this.m0).c, this.l0);
                this.v0.d(ax.S0.d0.i(this.l0.j));
                if (l8 != -9223372036854775807L) {
                    this.v0.e(this.M((N)object, ((F.b)object2).a, l8));
                    return;
                }
                object2 = this.l0.a;
                object = !n8.q() ? n8.n((int)n8.h((Object)b8.a, (N.b)this.m0).c, (N.c)this.l0).a : null;
                if (!j.Objects.equals((Object)object, (Object)object2) || bl) break block8;
            }
            return;
        }
        this.v0.e(-9223372036854775807L);
    }

    private boolean g0() {
        return this.y0 || this.G0 && this.E0.g;
        {
        }
    }

    private void g1(K0 k02) throws s {
        if (k02.b() == this.k0) {
            this.A(k02);
            int n8 = this.J0.e;
            if (n8 != 3 && n8 != 2) {
                return;
            }
            this.i0.f(2);
            return;
        }
        this.i0.j(15, k02).a();
    }

    private static int g2(int n8, int n9) {
        if (n8 == 0) {
            return 1;
        }
        if (n9 == 1) {
            return 0;
        }
        return n9;
    }

    private static boolean h0(boolean bl, F.b b8, long l8, F.b b9, N.b b10, long l9) {
        if (!bl && l8 == l9 && b8.a.equals(b9.a)) {
            if (b8.b() && b10.s(b8.b)) {
                return b10.h(b8.b, b8.c) != 4 && b10.h(b8.b, b8.c) != 2;
            }
            if (b9.b() && b10.s(b9.b)) {
                return true;
            }
        }
        return false;
    }

    private void h1(K0 k02) {
        Looper looper = k02.b();
        if (!looper.getThread().isAlive()) {
            u.h("TAG", "Trying to send message on a dead thread.");
            k02.j(false);
            return;
        }
        this.r0.d(looper, null).c(new k0(this, k02));
    }

    private void h2(boolean bl, boolean bl2) {
        this.O0 = bl;
        long l8 = bl && !bl2 ? this.r0.b() : -9223372036854775807L;
        this.P0 = l8;
    }

    private boolean i0(q0 q02) {
        return q02 != null && !q02.r() && q02.l() != Long.MIN_VALUE;
    }

    private void i1(long l8) {
        O0[] o0Array = this.q;
        int n8 = o0Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            o0Array[i8].N(l8);
        }
    }

    private boolean i2() throws s {
        O0[] o0Array;
        int n8;
        q0 q02 = this.t0.y();
        K k8 = q02.p();
        int n9 = 0;
        int n10 = 1;
        for (n8 = 0; n8 < (o0Array = this.q).length; ++n8) {
            int n11 = o0Array[n8].h();
            int n12 = this.q[n8].J(q02, k8, this.p0);
            if ((n12 & 2) != 0 && this.V0) {
                this.p1(false);
            }
            this.W0 -= n11 - this.q[n8].h();
            n11 = (n12 & 1) != 0 ? 1 : 0;
            n10 &= n11;
        }
        if (n10 != 0) {
            for (n8 = n9; n8 < this.q.length; ++n8) {
                if (!k8.c(n8) || this.q[n8].x(q02)) continue;
                this.F(q02, n8, false, q02.n());
            }
        }
        return n10 != 0;
    }

    private boolean j0(int n8, F.b b8) {
        if (this.t0.x() != null && this.t0.x().h.a.equals(b8)) {
            return this.q[n8].v(this.t0.x());
        }
        return false;
    }

    private void j2(float f8) {
        for (q0 q02 = this.t0.u(); q02 != null; q02 = q02.k()) {
            for (ax.l1.D d8 : q02.p().c) {
                if (d8 == null) continue;
                d8.p(f8);
            }
        }
    }

    private boolean k0() {
        q0 q02 = this.t0.u();
        long l8 = q02.h.e;
        return q02.f && (l8 == -9223372036854775807L || this.J0.s < l8 || !this.P1());
    }

    private void k1(ax.P0.c c8, boolean bl) throws s {
        this.e0.l(c8);
        androidx.media3.exoplayer.g g8 = this.C0;
        if (!bl) {
            c8 = null;
        }
        g8.k(c8);
        this.b2();
    }

    private static boolean l0(J0 object, N.b b8) {
        F.b b9 = ((J0)object).b;
        object = ((J0)object).a;
        return ((N)object).q() || ((N)object).h((Object)b9.a, (N.b)b8).f;
        {
        }
    }

    private void l1(boolean bl, ax.S0.k k8) {
        if (this.T0 != bl) {
            this.T0 = bl;
            if (!bl) {
                O0[] o0Array = this.q;
                int n8 = o0Array.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    o0Array[i8].L();
                }
            }
        }
        if (k8 != null) {
            k8.f();
        }
    }

    public static /* synthetic */ q0 m(n0 n02, r0 r02, long l8) {
        return n02.z(r02, l8);
    }

    private void m0() {
        boolean bl;
        this.Q0 = bl = this.O1();
        if (bl) {
            q0 q02 = ax.S0.a.e(this.t0.n());
            q02.e(new p0.b().f(q02.C(this.Y0)).g(this.p0.h().a).e(this.P0).d());
        }
        this.W1();
    }

    private void m1(G g8) {
        this.i0.i(16);
        this.p0.e(g8);
    }

    public static /* synthetic */ void n(n0 n02, int n8, boolean bl) {
        n02.z0.T(n8, n02.q[n8].m(), bl);
    }

    private void n0() {
        long l8;
        F.b b8;
        N n8;
        o0 o02;
        this.t0.I();
        q0 q02 = this.t0.w();
        if (q02 != null && (!q02.e || q02.f) && !q02.a.c() && (o02 = this.g0).e(n8 = this.J0.a, b8 = q02.h.a, l8 = q02.f ? q02.a.d() : 0L)) {
            if (!q02.e) {
                q02.v(this, q02.h.b);
                return;
            }
            q02.e(new p0.b().f(q02.C(this.Y0)).g(this.p0.h().a).e(this.P0).d());
        }
    }

    private void n1(b b8) throws s {
        this.K0.b(1);
        if (b8.c != -1) {
            this.X0 = new h(new L0(b8.a, b8.b), b8.c, b8.d);
        }
        this.a0(this.u0.C(b8.a, b8.b), false);
    }

    public static /* synthetic */ void o(n0 n02, z z8, long l8, long l9, v v8, MediaFormat mediaFormat) {
        n02.getClass();
        z8.g(l8, l9, v8, mediaFormat);
        n02.g(l8, l9, v8, mediaFormat);
    }

    private void o0() throws s {
        O0[] o0Array = this.q;
        int n8 = o0Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            o0Array[i8].D();
        }
    }

    public static /* synthetic */ void p(n0 n02, K0 k02) {
        n02.getClass();
        try {
            n02.A(k02);
            return;
        }
        catch (s s8) {
            u.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", s8);
            throw new RuntimeException(s8);
        }
    }

    private void p0() {
        this.K0.c(this.J0);
        if (this.K0.a) {
            this.s0.a(this.K0);
            this.K0 = new e(this.J0);
        }
    }

    private void p1(boolean bl) {
        if (bl != this.V0) {
            this.V0 = bl;
            if (!bl && this.J0.p) {
                this.i0.f(2);
            }
        }
    }

    static /* synthetic */ boolean q(n0 n02, boolean bl) {
        n02.U0 = bl;
        return bl;
    }

    private void q0() throws s {
        q0 q02 = this.t0.x();
        if (q02 != null) {
            K k8 = q02.p();
            for (int i8 = 0; i8 < this.q.length; ++i8) {
                if (!k8.c(i8) || !this.q[i8].s() || this.q[i8].u()) continue;
                this.q[i8].X();
                this.F(q02, i8, false, q02.n());
            }
            if (this.x()) {
                this.h1 = q02.a.s();
                if (!q02.s()) {
                    this.t0.N(q02);
                    this.Y(false);
                    this.m0();
                }
            }
        }
    }

    private void q1(boolean bl) throws s {
        this.M0 = bl;
        this.R0();
        if (this.N0 && this.t0.y() != this.t0.u()) {
            this.b1(true);
            this.Y(false);
        }
    }

    private void r0(int n8) throws IOException, s {
        K k8;
        Object object = this.q[n8];
        try {
            ((O0)object).G(ax.S0.a.e(this.t0.u()));
            return;
        }
        catch (RuntimeException runtimeException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        int n9 = ((O0)object).m();
        if (n9 != 3 && n9 != 5) {
            throw k8;
        }
        K k9 = this.t0.u().p();
        object = new StringBuilder();
        ((StringBuilder)object).append("Disabling track due to error: ");
        ((StringBuilder)object).append(v.l(k9.c[n8].m()));
        u.d("ExoPlayerImplInternal", ((StringBuilder)object).toString(), (Throwable)((Object)k8));
        k8 = new K((W[])k9.b.clone(), (ax.l1.D[])k9.c.clone(), k9.d, k9.e);
        k8.b[n8] = null;
        k8.c[n8] = null;
        this.C(n8);
        this.t0.u().a(k8, this.J0.s, false);
    }

    private void s0(int n8, boolean bl) {
        boolean[] blArray = this.d0;
        if (blArray[n8] != bl) {
            blArray[n8] = bl;
            this.A0.c(new j0(this, n8, bl));
        }
    }

    private void s1(boolean bl, int n8, boolean bl2, int n9) throws s {
        this.K0.b(bl2 ? 1 : 0);
        this.c2(bl, n8, n9);
    }

    /*
     * Unable to fully structure code
     */
    private void t0(long var1_1, long var3_2) throws s {
        block12: {
            block13: {
                if (this.q0.isEmpty() || this.J0.b.b()) break block12;
                var9_3 = var1_1;
                if (this.b1) {
                    var9_3 = var1_1 - 1L;
                    this.b1 = false;
                }
                var11_4 = this.J0;
                var7_6 = var11_4.a.b(var11_4.b.a);
                var5_7 = Math.min(this.a1, this.q0.size());
                var11_4 = var5_7 > 0 ? this.q0.get(var5_7 - 1) : null;
                while (var11_4 != null && ((var6_8 = var11_4.c0) > var7_6 || var6_8 == var7_6 && var11_4.d0 > var9_3)) {
                    var6_8 = var5_7 - 1;
                    var11_4 = var6_8 > 0 ? this.q0.get(var5_7 - 2) : null;
                    var5_7 = var6_8;
                }
                var6_8 = var5_7;
                var1_1 = var9_3;
                if (var5_7 >= this.q0.size()) break block13;
                var11_4 = this.q0.get(var5_7);
                ** GOTO lbl25
            }
            block3: while (true) {
                var11_4 = null;
                var9_3 = var1_1;
                var5_7 = var6_8;
lbl25:
                // 2 sources

                while (true) {
                    var6_8 = var5_7;
                    var12_10 = var11_4;
                    if (var11_4 == null) break block3;
                    var6_8 = var5_7;
                    var12_10 = var11_4;
                    if (var11_4.e0 == null) break block3;
                    var8_9 = var11_4.c0;
                    if (var8_9 >= var7_6) {
                        var6_8 = var5_7;
                        var12_10 = var11_4;
                        if (var8_9 != var7_6) break block3;
                        var6_8 = var5_7;
                        var12_10 = var11_4;
                        if (var11_4.d0 > var9_3) break block3;
                    }
                    var6_8 = ++var5_7;
                    var1_1 = var9_3;
                    if (var5_7 >= this.q0.size()) continue block3;
                    var11_4 = this.q0.get(var5_7);
                }
                break;
            }
            while (var12_10 != null && var12_10.e0 != null && var12_10.c0 == var7_6 && (var1_1 = var12_10.d0) > var9_3 && var1_1 <= var3_2) {
                block11: {
                    try {
                        this.g1(var12_10.q);
                        if (!var12_10.q.a() && !var12_10.q.i()) {
                            ++var6_8;
                            break block11;
                        }
                        this.q0.remove(var6_8);
                    }
                    catch (Throwable var11_5) {
                        if (var12_10.q.a() || var12_10.q.i()) {
                            this.q0.remove(var6_8);
                        }
                        throw var11_5;
                    }
                }
                if (var6_8 < this.q0.size()) {
                    var12_10 = this.q0.get(var6_8);
                    continue;
                }
                var12_10 = null;
            }
            this.a1 = var6_8;
        }
    }

    private void u(b b8, int n8) throws s {
        this.K0.b(1);
        I0 i02 = this.u0;
        int n9 = n8;
        if (n8 == -1) {
            n9 = i02.r();
        }
        this.a0(i02.f(n9, b8.a, b8.b), false);
    }

    private boolean u0() throws s {
        boolean bl;
        this.t0.K(this.Y0);
        boolean bl2 = this.t0.T();
        boolean bl3 = bl = false;
        if (bl2) {
            r0 r02 = this.t0.t(this.Y0, this.J0);
            bl3 = bl;
            if (r02 != null) {
                q0 q02 = this.t0.h(r02);
                if (!q02.e) {
                    q02.v(this, r02.b);
                } else if (q02.f) {
                    this.i0.j(8, q02.a).a();
                }
                if (this.t0.u() == q02) {
                    this.S0(r02.b);
                }
                this.Y(false);
                bl3 = true;
            }
        }
        if (this.Q0) {
            this.Q0 = this.i0(this.t0.n());
            this.W1();
            return bl3;
        }
        this.m0();
        return bl3;
    }

    private void u1(G g8) throws s {
        this.m1(g8);
        this.d0(this.p0.h(), true);
    }

    private void v() {
        K k8 = this.t0.u().p();
        for (int i8 = 0; i8 < this.q.length; ++i8) {
            if (!k8.c(i8)) continue;
            this.q[i8].f();
        }
    }

    private void v0() {
        Object object;
        if (this.t0.u() == this.t0.y() && (object = this.t0.u()) != null) {
            int n8;
            boolean bl;
            boolean bl2;
            block7: {
                object = ((q0)object).p();
                bl2 = false;
                bl = false;
                for (n8 = 0; n8 < this.q.length; ++n8) {
                    boolean bl3 = bl;
                    if (((K)object).c(n8)) {
                        if (this.q[n8].m() != 1) {
                            n8 = 0;
                            break block7;
                        }
                        bl3 = bl;
                        if (((K)object).b[n8].a != 0) {
                            bl3 = true;
                        }
                    }
                    bl = bl3;
                }
                n8 = 1;
            }
            boolean bl4 = bl2;
            if (bl) {
                bl4 = bl2;
                if (n8 != 0) {
                    bl4 = true;
                }
            }
            this.p1(bl4);
        }
    }

    private void v1(ExoPlayer.c c8) {
        this.f1 = c8;
        this.t0.V(this.J0.a, c8);
    }

    private void w() throws s {
        for (O0 o02 : this.q) {
            Y y8 = this.G0 ? this.E0 : null;
            o02.R(y8);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void w0() throws s {
        var1_1 = false;
        while (this.N1()) {
            if (var1_1) {
                this.p0();
            }
            this.i1 = false;
            var4_3 = ax.S0.a.e(this.t0.b());
            if (!this.J0.b.a.equals(var4_3.h.a.a)) ** GOTO lbl-1000
            var6_5 = this.J0.b;
            if (var6_5.b != -1) ** GOTO lbl-1000
            var5_4 = var4_3.h.a;
            if (var5_4.b == -1 && var6_5.e != var5_4.e) {
                var1_1 = true;
            } else lbl-1000:
            // 3 sources

            {
                var1_1 = false;
            }
            var6_5 = var4_3.h;
            var5_4 = var6_5.a;
            var2_2 = var6_5.b;
            this.J0 = this.e0(var5_4, var2_2, var6_5.c, var2_2, var1_1 ^ true, 0);
            this.R0();
            this.e2();
            if (this.x() && var4_3 == this.t0.x()) {
                this.o0();
            }
            if (this.J0.e == 3) {
                this.S1();
            }
            this.v();
            var1_1 = true;
        }
    }

    private boolean x() {
        if (!this.B0) {
            return false;
        }
        O0[] o0Array = this.q;
        int n8 = o0Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!o0Array[i8].u()) continue;
            return true;
        }
        return false;
    }

    private void x0(boolean bl) {
        if (this.f1.a == -9223372036854775807L) {
            return;
        }
        if (bl || !this.J0.a.equals(this.g1)) {
            N n8;
            this.g1 = n8 = this.J0.a;
            this.t0.B(n8);
        }
        this.n0();
    }

    private void x1(int n8) throws s {
        this.R0 = n8;
        if (((n8 = this.t0.X(this.J0.a, n8)) & 1) != 0) {
            this.b1(true);
        } else if ((n8 & 2) != 0) {
            this.B();
        }
        this.Y(false);
    }

    private void y() throws s {
        this.P0();
    }

    private void y0() throws s {
        q0 q02;
        if (!this.N0 && this.B0 && !this.i1 && !this.x() && (q02 = this.t0.x()) != null && q02 == this.t0.y() && q02.k() != null && q02.k().f) {
            this.t0.c();
            this.q0();
        }
    }

    private q0 z(r0 r02, long l8) {
        return new q0(this.c0, l8, this.e0, this.g0.h(), this.u0, r02, this.f0, this.f1.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void z0() throws s {
        O0[] o0Array = this.t0.y();
        if (o0Array == null) return;
        q0 q02 = o0Array.k();
        int n8 = 0;
        if (q02 != null && !this.N0) {
            int n9;
            int n10;
            if (!this.f0() || this.x() && this.t0.x() == this.t0.y() || !o0Array.k().f && this.Y0 < o0Array.k().n()) return;
            K k8 = o0Array.p();
            q0 q03 = this.t0.d();
            K k9 = q03.p();
            N n11 = this.J0.a;
            this.f2(n11, q03.h.a, n11, o0Array.h.a, -9223372036854775807L, false);
            if (q03.f && (this.B0 && this.h1 != -9223372036854775807L || q03.a.s() != -9223372036854775807L)) {
                this.h1 = -9223372036854775807L;
                n10 = this.B0 && !this.i1 ? 1 : 0;
                n9 = n10;
                if (n10 != 0) {
                    int n12 = 0;
                    while (true) {
                        n9 = n10;
                        if (n12 >= this.q.length) break;
                        if (k9.c(n12) && this.q[n12].m() != -2 && !D.a(k9.c[n12].m().o, k9.c[n12].m().k) && !this.q[n12].u()) {
                            n9 = 0;
                            break;
                        }
                        ++n12;
                    }
                }
                if (n9 == 0) {
                    this.i1(q03.n());
                    if (q03.s()) return;
                    this.t0.N(q03);
                    this.Y(false);
                    this.m0();
                    return;
                }
            }
            o0Array = this.q;
            n9 = o0Array.length;
            for (n10 = n8; n10 < n9; ++n10) {
                o0Array[n10].F(k8, k9, q03.n());
            }
            return;
        } else {
            if (!o0Array.h.j && !this.N0) return;
            for (O0 o02 : this.q) {
                if (!o02.x((q0)o0Array) || !o02.r((q0)o0Array)) continue;
                long l8 = o0Array.h.e;
                l8 = l8 != -9223372036854775807L && l8 != Long.MIN_VALUE ? o0Array.m() + o0Array.h.e : -9223372036854775807L;
                o02.O((q0)o0Array, l8);
            }
        }
    }

    private void z1(boolean bl) throws s {
        if (!bl) {
            this.H0 = false;
            this.i0.i(37);
            h h8 = this.I0;
            if (h8 != null) {
                this.c1(h8, false);
                this.I0 = null;
            }
        }
        this.G0 = bl;
        this.w();
    }

    public void A1(Y y8) {
        this.i0.j(38, y8).a();
    }

    public void C1(Z z8) {
        this.i0.j(5, z8).a();
    }

    public void E1(boolean bl) {
        this.i0.a(12, bl ? 1 : 0, 0).a();
    }

    public void G0(ax.i1.C c8) {
        this.i0.j(9, c8).a();
    }

    public void H0() {
        this.i0.d(29).a();
    }

    public void I(long l8) {
        this.d1 = l8;
    }

    public boolean J0() {
        if (!this.L0 && this.k0.getThread().isAlive()) {
            this.L0 = true;
            ax.S0.k k8 = new ax.S0.k(this.r0);
            this.i0.j(7, k8).a();
            return k8.c(this.w0);
        }
        return true;
    }

    public boolean J1(Object object, long l8) {
        if (!this.L0 && this.k0.getThread().isAlive()) {
            ax.S0.k k8 = new ax.S0.k(this.r0);
            this.i0.j(30, new Pair(object, (Object)k8)).a();
            if (l8 != -9223372036854775807L) {
                return k8.c(l8);
            }
        }
        return true;
    }

    public void L1(float f8) {
        this.i0.j(32, Float.valueOf(f8)).a();
    }

    public void N0(int n8, int n9, g0 g02) {
        this.i0.g(20, n8, n9, g02).a();
    }

    public Looper P() {
        return this.k0;
    }

    public void T1() {
        this.i0.d(6).a();
    }

    @Override
    public void a(M0 m02) {
        this.i0.f(26);
    }

    public void a1(N n8, int n9, long l8) {
        this.i0.j(3, new h(n8, n9, l8)).a();
    }

    @Override
    public void b() {
        this.i0.f(10);
    }

    @Override
    public void c(float f8) {
        this.i0.f(34);
    }

    @Override
    public void d(int n8) {
        this.i0.a(33, n8, 0).a();
    }

    @Override
    public void e() {
        this.i0.i(2);
        this.i0.f(22);
    }

    @Override
    public void f(ax.i1.C c8) {
        this.i0.j(8, c8).a();
    }

    @Override
    public void g(long l8, long l9, v v8, MediaFormat mediaFormat) {
        if (this.H0) {
            this.i0.d(37).a();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean handleMessage(Message object) {
        block65: {
            Object object2;
            Object object3;
            int n8 = 1000;
            try {
                switch (((Message)object).what) {
                    default: {
                        return false;
                    }
                    case 38: {
                        this.B1((Y)((Message)object).obj);
                        break;
                    }
                    case 37: {
                        this.H0 = false;
                        object = this.I0;
                        if (object == null) break;
                        this.c1((h)object, false);
                        this.I0 = null;
                        break;
                    }
                    case 36: {
                        this.z1((Boolean)((Message)object).obj);
                        break;
                    }
                    case 35: {
                        this.I1((z)((Message)object).obj);
                        break;
                    }
                    case 34: {
                        this.V();
                        break;
                    }
                    case 33: {
                        this.U(((Message)object).arg1);
                        break;
                    }
                    case 32: {
                        this.M1(((Float)((Message)object).obj).floatValue());
                        break;
                    }
                    case 31: {
                        ax.P0.c c8 = (ax.P0.c)((Message)object).obj;
                        boolean bl = ((Message)object).arg1 != 0;
                        this.k1(c8, bl);
                        break;
                    }
                    case 30: {
                        object = (Pair)((Message)object).obj;
                        this.K1(((Pair)object).first, (ax.S0.k)((Pair)object).second);
                        break;
                    }
                    case 29: {
                        this.I0();
                        break;
                    }
                    case 28: {
                        this.v1((ExoPlayer.c)((Message)object).obj);
                        break;
                    }
                    case 27: {
                        this.Y1(((Message)object).arg1, ((Message)object).arg2, (List)((Message)object).obj);
                        break;
                    }
                    case 26: {
                        this.P0();
                        break;
                    }
                    case 25: {
                        this.y();
                        break;
                    }
                    case 23: {
                        boolean bl = ((Message)object).arg1 != 0;
                        this.q1(bl);
                        break;
                    }
                    case 22: {
                        this.B0();
                        break;
                    }
                    case 21: {
                        this.G1((g0)((Message)object).obj);
                        break;
                    }
                    case 20: {
                        this.M0(((Message)object).arg1, ((Message)object).arg2, (g0)((Message)object).obj);
                        break;
                    }
                    case 19: {
                        this.C0((c)((Message)object).obj);
                        break;
                    }
                    case 18: {
                        this.u((b)((Message)object).obj, ((Message)object).arg1);
                        break;
                    }
                    case 17: {
                        this.n1((b)((Message)object).obj);
                        break;
                    }
                    case 16: {
                        this.d0((G)((Message)object).obj, false);
                        break;
                    }
                    case 15: {
                        this.h1((K0)((Message)object).obj);
                        break;
                    }
                    case 14: {
                        this.f1((K0)((Message)object).obj);
                        break;
                    }
                    case 13: {
                        boolean bl = ((Message)object).arg1 != 0;
                        this.l1(bl, (ax.S0.k)((Message)object).obj);
                        break;
                    }
                    case 12: {
                        boolean bl = ((Message)object).arg1 != 0;
                        this.F1(bl);
                        break;
                    }
                    case 11: {
                        this.x1(((Message)object).arg1);
                        break;
                    }
                    case 10: {
                        this.O0();
                        break;
                    }
                    case 9: {
                        this.W((ax.i1.C)((Message)object).obj);
                        break;
                    }
                    case 8: {
                        this.b0((ax.i1.C)((Message)object).obj);
                        break;
                    }
                    case 7: {
                        this.K0((ax.S0.k)((Message)object).obj);
                        return true;
                    }
                    case 6: {
                        this.U1(false, true);
                        break;
                    }
                    case 5: {
                        this.D1((Z)((Message)object).obj);
                        break;
                    }
                    case 4: {
                        this.u1((G)((Message)object).obj);
                        break;
                    }
                    case 3: {
                        this.c1((h)((Message)object).obj, true);
                        break;
                    }
                    case 2: {
                        this.E();
                        break;
                    }
                    case 1: {
                        boolean bl = ((Message)object).arg1 != 0;
                        int n9 = ((Message)object).arg2;
                        this.s1(bl, n9 >> 4, true, n9 & 0xF);
                        break;
                    }
                }
                break block65;
            }
            catch (RuntimeException runtimeException2) {}
            if (runtimeException2 instanceof IllegalStateException || runtimeException2 instanceof IllegalArgumentException) {
                n8 = 1004;
            }
            s s8 = s.f(runtimeException2, n8);
            u.d("ExoPlayerImplInternal", "Playback error", s8);
            this.U1(true, false);
            this.J0 = this.J0.f(s8);
            break block65;
            catch (IOException iOException2) {}
            this.X(iOException2, 2000);
            break block65;
            catch (ax.i1.b b82) {}
            this.X(b82, 1002);
            break block65;
            catch (ax.U0.h h82) {}
            this.X(h82, h82.q);
            break block65;
            catch (E e82) {}
            int n10 = e82.c0;
            if (n10 == 1) {
                n8 = e82.q ? 3001 : 3003;
            } else if (n10 == 4) {
                n8 = e82.q ? 3002 : 3004;
            }
            this.X(e82, n8);
            break block65;
            catch (n.a a82) {}
            this.X(a82, a82.q);
            break block65;
            catch (s s92) {}
            object = s92;
            if (s92.k0 == 1) {
                object3 = this.t0.y();
                object = s92;
                if (object3 != null) {
                    object = s92;
                    if (s92.p0 == null) {
                        object = s92.c(((q0)object3).h.a);
                    }
                }
            }
            if (((s)object).k0 == 1 && (object2 = ((s)object).p0) != null && this.j0(((s)object).m0, (F.b)object2)) {
                this.i1 = true;
                this.B();
                object3 = this.t0.x();
                object2 = object = this.t0.u();
                if (this.t0.u() != object3) {
                    while (true) {
                        object2 = object;
                        if (object == null) break;
                        object2 = object;
                        if (((q0)object).k() == object3) break;
                        object = ((q0)object).k();
                    }
                }
                this.t0.N((q0)object2);
                if (this.J0.e != 4) {
                    this.m0();
                    this.i0.f(2);
                }
            } else {
                object3 = this.c1;
                object2 = object;
                if (object3 != null) {
                    ((Throwable)object3).addSuppressed((Throwable)object);
                    object2 = this.c1;
                }
                if (((s)object2).k0 == 1 && this.t0.u() != this.t0.y()) {
                    while (this.t0.u() != this.t0.y()) {
                        this.t0.b();
                    }
                    object = ax.S0.a.e(this.t0.u());
                    this.p0();
                    object = ((q0)object).h;
                    object3 = ((r0)object).a;
                    long l8 = ((r0)object).b;
                    this.J0 = this.e0((F.b)object3, l8, ((r0)object).c, l8, true, 0);
                }
                if (((s)object2).q0 && (this.c1 == null || (n8 = ((F)object2).q) == 5004 || n8 == 5003)) {
                    u.i("ExoPlayerImplInternal", "Recoverable renderer error", (Throwable)object2);
                    if (this.c1 == null) {
                        this.c1 = object2;
                    }
                    object = this.i0;
                    object.b(object.j(25, object2));
                } else {
                    u.d("ExoPlayerImplInternal", "Playback error", (Throwable)object2);
                    this.U1(true, false);
                    this.J0 = this.J0.f((s)object2);
                }
            }
        }
        this.p0();
        return true;
    }

    @Override
    public void j(G g8) {
        this.i0.j(16, g8).a();
    }

    public void j1(ax.P0.c c8, boolean bl) {
        this.i0.g(31, bl ? 1 : 0, 0, c8).a();
    }

    @Override
    public void l(K0 k02) {
        if (!this.L0 && this.k0.getThread().isAlive()) {
            this.i0.j(14, k02).a();
            return;
        }
        u.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        k02.j(false);
    }

    public void o1(List<I0.c> list, int n8, long l8, g0 g02) {
        this.i0.j(17, new b(list, g02, n8, l8)).a();
    }

    public void r1(boolean bl, int n8, int n9) {
        this.i0.a(1, bl ? 1 : 0, n8 | n9 << 4).a();
    }

    public void t1(G g8) {
        this.i0.j(4, g8).a();
    }

    public void w1(int n8) {
        this.i0.a(11, n8, 0).a();
    }

    public void y1(boolean bl) {
        this.i0.j(36, bl).a();
    }

    private static final class b {
        private final List<I0.c> a;
        private final g0 b;
        private final int c;
        private final long d;

        private b(List<I0.c> list, g0 g02, int n8, long l8) {
            this.a = list;
            this.b = g02;
            this.c = n8;
            this.d = l8;
        }
    }

    private static class c {
        public final int a;
        public final int b;
        public final int c;
        public final g0 d;
    }

    private static final class d
    implements Comparable<d> {
        public int c0;
        public long d0;
        public Object e0;
        public final K0 q;

        public d(K0 k02) {
            this.q = k02;
        }

        public int d(d d8) {
            int n8;
            Object object = this.e0;
            int n9 = object == null ? 1 : 0;
            if (n9 != (n8 = d8.e0 == null)) {
                if (object != null) {
                    return -1;
                }
                return 1;
            }
            if (object == null) {
                return 0;
            }
            n9 = this.c0 - d8.c0;
            if (n9 != 0) {
                return n9;
            }
            return Long.compare(this.d0, d8.d0);
        }

        public void h(int n8, long l8, Object object) {
            this.c0 = n8;
            this.d0 = l8;
            this.e0 = object;
        }
    }

    public static final class e {
        private boolean a;
        public J0 b;
        public int c;
        public boolean d;
        public int e;

        public e(J0 j02) {
            this.b = j02;
        }

        public void b(int n8) {
            boolean bl = this.a;
            boolean bl2 = n8 > 0;
            this.a = bl | bl2;
            this.c += n8;
        }

        public void c(J0 j02) {
            boolean bl = this.a;
            boolean bl2 = this.b != j02;
            this.a = bl | bl2;
            this.b = j02;
        }

        public void d(int n8) {
            boolean bl = this.d;
            boolean bl2 = true;
            if (bl && this.e != 5) {
                if (n8 != 5) {
                    bl2 = false;
                }
                ax.S0.a.a(bl2);
                return;
            }
            this.a = true;
            this.d = true;
            this.e = n8;
        }
    }

    public static interface f {
        public void a(e var1);
    }

    private static final class g {
        public final F.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(F.b b8, long l8, long l9, boolean bl, boolean bl2, boolean bl3) {
            this.a = b8;
            this.b = l8;
            this.c = l9;
            this.d = bl;
            this.e = bl2;
            this.f = bl3;
        }
    }

    private static final class h {
        public final N a;
        public final int b;
        public final long c;

        public h(N n8, int n9, long l8) {
            this.a = n8;
            this.b = n9;
            this.c = l8;
        }
    }
}

