/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.p0;
import ax.P0.D;
import ax.P0.E;
import ax.P0.P;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.S0.u;
import ax.U0.g;
import ax.U0.j;
import ax.U0.k;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.Z;
import ax.b1.u;
import ax.b1.w;
import ax.i1.B;
import ax.i1.C;
import ax.i1.N;
import ax.i1.T;
import ax.i1.U;
import ax.i1.V;
import ax.i1.W;
import ax.i1.X;
import ax.i1.d0;
import ax.i1.e0;
import ax.i1.q0;
import ax.i1.x;
import ax.i1.y;
import ax.m1.m;
import ax.m1.o;
import ax.q1.I;
import ax.q1.M;
import ax.q1.N;
import ax.q1.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

final class Y
implements C,
t,
o.b<b>,
o.f,
d0.d {
    private static final Map<String, String> S0 = Y.N();
    private static final v T0 = new v.b().j0("icy").y0("application/x-icy").P();
    private boolean A0;
    private boolean B0;
    private f C0;
    private N D0;
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
    private final g c0;
    private final w d0;
    private final m e0;
    private final N.a f0;
    private final u.a g0;
    private final c h0;
    private final ax.m1.b i0;
    private final String j0;
    private final long k0;
    private final int l0;
    private final v m0;
    private final long n0;
    private final o o0;
    private final T p0;
    private final Uri q;
    private final ax.S0.k q0;
    private final Runnable r0;
    private final Runnable s0;
    private final Handler t0;
    private C.a u0;
    private ax.D1.b v0;
    private d0[] w0;
    private e[] x0;
    private boolean y0;
    private boolean z0;

    public Y(Uri object, g g8, T t8, w w8, u.a a8, m m8, N.a a9, c c8, ax.m1.b b8, String string, int n8, int n9, v v8, long l8, ax.n1.c c9) {
        this.q = object;
        this.c0 = g8;
        this.d0 = w8;
        this.g0 = a8;
        this.e0 = m8;
        this.f0 = a9;
        this.h0 = c8;
        this.i0 = b8;
        this.j0 = string;
        this.k0 = n8;
        this.l0 = n9;
        this.m0 = v8;
        object = c9 != null ? new o(c9) : new o("ProgressiveMediaPeriod");
        this.o0 = object;
        this.p0 = t8;
        this.n0 = l8;
        this.q0 = new ax.S0.k();
        this.r0 = new U(this);
        this.s0 = new V(this);
        this.t0 = ax.S0.d0.A();
        this.x0 = new e[0];
        this.w0 = new d0[0];
        this.N0 = -9223372036854775807L;
        this.G0 = 1;
    }

    static /* synthetic */ ax.D1.b J(Y y8, ax.D1.b b8) {
        y8.v0 = b8;
        return b8;
    }

    private void L() {
        a.g(this.z0);
        a.e(this.C0);
        a.e(this.D0);
    }

    private boolean M(b b8, int n8) {
        d0[] d0Array;
        if (!(this.L0 || (d0Array = this.D0) != null && d0Array.n() != -9223372036854775807L)) {
            boolean bl = this.z0;
            if (bl && !this.k0()) {
                this.O0 = true;
                return false;
            }
            this.I0 = this.z0;
            this.M0 = 0L;
            this.P0 = 0;
            d0Array = this.w0;
            int n9 = d0Array.length;
            for (n8 = 0; n8 < n9; ++n8) {
                d0Array[n8].S();
            }
            b8.j(0L, 0L);
            return true;
        }
        this.P0 = n8;
        return true;
    }

    private static Map<String, String> N() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Icy-MetaData", "1");
        return java.util.DesugarCollections.unmodifiableMap(hashMap);
    }

    private int O() {
        d0[] d0Array = this.w0;
        int n8 = d0Array.length;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 += d0Array[i8].E();
        }
        return n9;
    }

    private long P(boolean bl) {
        long l8 = Long.MIN_VALUE;
        for (int i8 = 0; i8 < this.w0.length; ++i8) {
            long l9;
            block4: {
                block3: {
                    if (bl) break block3;
                    l9 = l8;
                    if (!a.e(this.C0).c[i8]) break block4;
                }
                l9 = Math.max(l8, this.w0[i8].x());
            }
            l8 = l9;
        }
        return l8;
    }

    private boolean R() {
        return this.N0 != -9223372036854775807L;
    }

    private void T() {
        block12: {
            int n8;
            if (this.R0 || this.z0 || !this.y0 || this.D0 == null) break block12;
            Object object = this.w0;
            int n9 = ((d0[])object).length;
            for (n8 = 0; n8 < n9; ++n8) {
                if (object[n8].D() != null) {
                    continue;
                }
                break block12;
            }
            this.q0.d();
            n9 = this.w0.length;
            P[] pArray = new P[n9];
            boolean[] blArray = new boolean[n9];
            for (n8 = 0; n8 < n9; ++n8) {
                Object object2;
                boolean bl;
                block13: {
                    ax.D1.b b8;
                    boolean bl2;
                    block15: {
                        v v8;
                        block14: {
                            v8 = a.e(this.w0[n8].D());
                            object = v8.o;
                            bl2 = D.o((String)object);
                            bl = bl2 || D.s((String)object);
                            blArray[n8] = bl;
                            this.A0 = bl | this.A0;
                            bl = D.q((String)object);
                            bl = this.n0 != -9223372036854775807L && n9 == 1 && bl;
                            this.B0 = bl;
                            b8 = this.v0;
                            object2 = v8;
                            if (b8 == null) break block13;
                            if (bl2) break block14;
                            object = v8;
                            if (!this.x0[n8].b) break block15;
                        }
                        object = (object = v8.l) == null ? new ax.P0.C(b8) : ((ax.P0.C)object).a(b8);
                        object = v8.b().r0((ax.P0.C)object).P();
                    }
                    object2 = object;
                    if (bl2) {
                        object2 = object;
                        if (((v)object).h == -1) {
                            object2 = object;
                            if (((v)object).i == -1) {
                                object2 = object;
                                if (b8.a != -1) {
                                    object2 = ((v)object).b().S(b8.a).P();
                                }
                            }
                        }
                    }
                }
                object = ((v)object2).c(this.d0.a((v)object2));
                pArray[n8] = new P(Integer.toString(n8), new v[]{object});
                bl = this.J0;
                this.J0 = ((v)object).u | bl;
            }
            this.C0 = new f(new q0(pArray), blArray);
            if (this.B0 && this.E0 == -9223372036854775807L) {
                this.E0 = this.n0;
                this.D0 = new ax.q1.D(this, this.D0){
                    final Y b;
                    {
                        this.b = y8;
                        super(n8);
                    }

                    @Override
                    public long n() {
                        return this.b.E0;
                    }
                };
            }
            this.h0.h(this.E0, this.D0, this.F0);
            this.z0 = true;
            a.e(this.u0).f(this);
        }
    }

    private void U(int n8) {
        this.L();
        Object object = this.C0;
        boolean[] blArray = ((f)object).d;
        if (!blArray[n8]) {
            object = ((f)object).a.c(n8).b(0);
            this.f0.j(D.k(((v)object).o), (v)object, 0, null, this.M0);
            blArray[n8] = true;
        }
    }

    private void V(int n8) {
        this.L();
        if (this.O0 && (!this.A0 || this.C0.b[n8])) {
            d0[] d0Array = this.w0[n8];
            if (!d0Array.I(false)) {
                this.N0 = 0L;
                this.O0 = false;
                this.I0 = true;
                this.M0 = 0L;
                this.P0 = 0;
                d0Array = this.w0;
                int n9 = d0Array.length;
                for (n8 = 0; n8 < n9; ++n8) {
                    d0Array[n8].S();
                }
                a.e(this.u0).i(this);
            }
        }
    }

    private void Y() {
        this.t0.post((Runnable)new W(this));
    }

    private ax.q1.U d0(e d0Array) {
        int n8;
        int n9 = this.w0.length;
        for (n8 = 0; n8 < n9; ++n8) {
            if (!d0Array.equals(this.x0[n8])) continue;
            return this.w0[n8];
        }
        if (this.y0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Extractor added new track (id=");
            stringBuilder.append(d0Array.a);
            stringBuilder.append(") after finishing tracks.");
            u.h("ProgressiveMediaPeriod", stringBuilder.toString());
            return new ax.q1.o();
        }
        d0 d02 = ax.i1.d0.l(this.i0, this.d0, this.g0);
        d02.a0(this);
        e[] eArray = this.x0;
        n8 = n9 + 1;
        eArray = Arrays.copyOf(eArray, n8);
        eArray[n9] = d0Array;
        this.x0 = ax.S0.d0.j(eArray);
        d0Array = Arrays.copyOf(this.w0, n8);
        d0Array[n9] = d02;
        this.w0 = ax.S0.d0.j(d0Array);
        return d02;
    }

    private boolean g0(boolean[] blArray, long l8, boolean bl) {
        int n8 = this.w0.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            boolean bl2;
            d0 d02 = this.w0[i8];
            if (d02.A() == 0 && bl || (bl2 = this.B0 ? d02.V(d02.w()) : d02.W(l8, this.Q0)) || !blArray[i8] && this.A0) continue;
            return false;
        }
        return true;
    }

    private void h0(N n8) {
        N n9 = this.v0 == null ? n8 : new N.b(-9223372036854775807L);
        this.D0 = n9;
        this.E0 = n8.n();
        boolean bl = this.L0;
        int n10 = 1;
        bl = !bl && n8.n() == -9223372036854775807L;
        this.F0 = bl;
        if (bl) {
            n10 = 7;
        }
        this.G0 = n10;
        if (this.z0) {
            this.h0.h(this.E0, n8, bl);
            return;
        }
        this.T();
    }

    private void j0() {
        b b8 = new b(this, this.q, this.c0, this.p0, this, this.q0);
        if (this.z0) {
            a.g(this.R());
            long l8 = this.E0;
            if (l8 != -9223372036854775807L && this.N0 > l8) {
                this.Q0 = true;
                this.N0 = -9223372036854775807L;
                return;
            }
            b8.j(a.e(this.D0).l((long)this.N0).a.b, this.N0);
            d0[] d0Array = this.w0;
            int n8 = d0Array.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                d0Array[i8].Y(this.N0);
            }
            this.N0 = -9223372036854775807L;
        }
        this.P0 = this.O();
        this.o0.n(b8, this, this.e0.c(this.G0));
    }

    private boolean k0() {
        return this.I0 || this.R();
        {
        }
    }

    public static /* synthetic */ void w(Y y8, N n8) {
        y8.h0(n8);
    }

    public static /* synthetic */ void x(Y y8) {
        y8.T();
    }

    public static /* synthetic */ void y(Y y8) {
        if (!y8.R0) {
            a.e(y8.u0).i(y8);
        }
    }

    public static /* synthetic */ void z(Y y8) {
        y8.L0 = true;
    }

    ax.q1.U Q() {
        return this.d0(new e(0, true));
    }

    boolean S(int n8) {
        return !this.k0() && this.w0[n8].I(this.Q0);
    }

    void W() throws IOException {
        this.o0.k(this.e0.c(this.G0));
    }

    void X(int n8) throws IOException {
        this.w0[n8].K();
        this.W();
    }

    public void Z(b d0Array, long l8, long l9, boolean bl) {
        Object object = ((b)d0Array).c;
        object = new y(((b)d0Array).a, ((b)d0Array).k, ((ax.U0.y)object).r(), ((ax.U0.y)object).s(), l8, l9, ((ax.U0.y)object).q());
        this.e0.a(((b)d0Array).a);
        this.f0.m((y)object, 1, -1, null, 0, null, ((b)d0Array).j, this.E0);
        if (!bl) {
            d0Array = this.w0;
            int n8 = d0Array.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                d0Array[i8].S();
            }
            if (this.K0 > 0) {
                a.e(this.u0).i(this);
            }
        }
    }

    @Override
    public boolean a(p0 p02) {
        if (!(this.Q0 || this.o0.h() || this.O0 || (this.z0 || this.m0 != null) && this.K0 == 0)) {
            boolean bl = this.q0.f();
            if (!this.o0.i()) {
                this.j0();
                bl = true;
            }
            return bl;
        }
        return false;
    }

    public void a0(b b8, long l8, long l9) {
        if (this.E0 == -9223372036854775807L && this.D0 != null) {
            long l10 = this.P(true);
            l10 = l10 == Long.MIN_VALUE ? 0L : (l10 += 10000L);
            this.E0 = l10;
            this.h0.h(l10, this.D0, this.F0);
        }
        Object object = b8.c;
        object = new y(b8.a, b8.k, ((ax.U0.y)object).r(), ((ax.U0.y)object).s(), l8, l9, ((ax.U0.y)object).q());
        this.e0.a(b8.a);
        this.f0.p((y)object, 1, -1, null, 0, null, b8.j, this.E0);
        this.Q0 = true;
        a.e(this.u0).i(this);
    }

    @Override
    public long b() {
        return this.d();
    }

    public o.c b0(b b8, long l8, long l9, IOException iOException, int n8) {
        boolean bl;
        Object object = b8.c;
        y y8 = new y(b8.a, b8.k, ((ax.U0.y)object).r(), ((ax.U0.y)object).s(), l8, l9, ((ax.U0.y)object).q());
        l8 = this.e0.b(new m.c(y8, (B)(object = new B(1, -1, null, 0, null, ax.S0.d0.E1(b8.j), ax.S0.d0.E1(this.E0))), iOException, n8));
        if (l8 == -9223372036854775807L) {
            object = o.g;
        } else {
            n8 = this.O();
            bl = n8 > this.P0;
            object = this.M(b8, n8) ? o.g(bl, l8) : o.f;
        }
        bl = ((o.c)object).c();
        this.f0.r(y8, 1, -1, null, 0, null, b8.j, this.E0, iOException, bl ^ true);
        if (!bl) {
            this.e0.a(b8.a);
        }
        return object;
    }

    @Override
    public boolean c() {
        return this.o0.i() && this.q0.e();
    }

    public void c0(b b8, long l8, long l9, int n8) {
        Object object = b8.c;
        object = n8 == 0 ? new y(b8.a, b8.k, l8) : new y(b8.a, b8.k, ((ax.U0.y)object).r(), ((ax.U0.y)object).s(), l8, l9, ((ax.U0.y)object).q());
        this.f0.v((y)object, 1, -1, null, 0, null, b8.j, this.E0, n8);
    }

    @Override
    public long d() {
        this.L();
        if (!this.Q0 && this.K0 != 0) {
            long l8;
            long l9;
            if (this.R()) {
                return this.N0;
            }
            if (this.A0) {
                int n8 = this.w0.length;
                l9 = Long.MAX_VALUE;
                int n9 = 0;
                while (true) {
                    l8 = l9;
                    if (n9 < n8) {
                        f f8 = this.C0;
                        l8 = l9;
                        if (f8.b[n9]) {
                            l8 = l9;
                            if (f8.c[n9]) {
                                l8 = l9;
                                if (!this.w0[n9].H()) {
                                    l8 = Math.min(l9, this.w0[n9].x());
                                }
                            }
                        }
                        ++n9;
                        l9 = l8;
                        continue;
                    }
                    break;
                }
            } else {
                l8 = Long.MAX_VALUE;
            }
            l9 = l8;
            if (l8 == Long.MAX_VALUE) {
                l9 = this.P(false);
            }
            if (l9 == Long.MIN_VALUE) {
                return this.M0;
            }
            return l9;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public void e(long l8) {
    }

    int e0(int n8, O o8, i i8, int n9) {
        if (this.k0()) {
            return -3;
        }
        this.U(n8);
        n9 = this.w0[n8].P(o8, i8, n9, this.Q0);
        if (n9 == -3) {
            this.V(n8);
        }
        return n9;
    }

    @Override
    public void f() {
        d0[] d0Array = this.w0;
        int n8 = d0Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            d0Array[i8].Q();
        }
        this.p0.d();
    }

    public void f0() {
        if (this.z0) {
            d0[] d0Array = this.w0;
            int n8 = d0Array.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                d0Array[i8].O();
            }
        }
        this.o0.m(this);
        this.t0.removeCallbacksAndMessages(null);
        this.u0 = null;
        this.R0 = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public long g(ax.l1.D[] objectArray, boolean[] object, e0[] e0Array, boolean[] blArray, long l8) {
        long l9;
        block13: {
            int n8;
            int n9;
            int n10;
            block14: {
                this.L();
                Object object2 = this.C0;
                q0 q02 = ((f)object2).a;
                object2 = ((f)object2).c;
                int n11 = this.K0;
                int n12 = 0;
                n10 = 0;
                int n13 = 0;
                for (n9 = 0; n9 < objectArray.length; ++n9) {
                    e0 e02 = e0Array[n9];
                    if (e02 == null || objectArray[n9] != null && object[n9] != false) continue;
                    n8 = ((d)e02).a;
                    a.g((boolean)object2[n8]);
                    --this.K0;
                    object2[n8] = false;
                    e0Array[n9] = null;
                }
                n9 = (this.H0 ? n11 == 0 : l8 != 0L && !this.B0) ? 1 : 0;
                n8 = n9;
                for (n11 = 0; n11 < objectArray.length; ++n11) {
                    n9 = n8;
                    if (e0Array[n11] == null) {
                        object = objectArray[n11];
                        n9 = n8;
                        if (object != null) {
                            boolean bl = object.length() == 1;
                            a.g(bl);
                            bl = object.j(0) == 0;
                            a.g(bl);
                            int n14 = q02.e(object.b());
                            a.g((object2[n14] ^ 1) != 0);
                            ++this.K0;
                            object2[n14] = true;
                            bl = this.J0;
                            this.J0 = object.m().u | bl;
                            e0Array[n11] = new d(this, n14);
                            blArray[n11] = true;
                            n9 = n8;
                            if (n8 == 0) {
                                object = this.w0[n14];
                                n9 = ((d0)object).A() != 0 && !((d0)object).W(l8, true) ? 1 : 0;
                            }
                        }
                    }
                    n8 = n9;
                }
                if (this.K0 != 0) break block14;
                this.O0 = false;
                this.I0 = false;
                this.J0 = false;
                if (this.o0.i()) {
                    objectArray = this.w0;
                    n11 = objectArray.length;
                    for (n9 = n13; n9 < n11; ++n9) {
                        ((d0)objectArray[n9]).q();
                    }
                    this.o0.e();
                    l9 = l8;
                    break block13;
                } else {
                    this.Q0 = false;
                    objectArray = this.w0;
                    n11 = objectArray.length;
                    n9 = n12;
                    while (true) {
                        l9 = l8;
                        if (n9 < n11) {
                            ((d0)objectArray[n9]).S();
                            ++n9;
                            continue;
                        }
                        break block13;
                        break;
                    }
                }
            }
            l9 = l8;
            if (n8 != 0) {
                l8 = this.m(l8);
                n9 = n10;
                while (true) {
                    l9 = l8;
                    if (n9 >= e0Array.length) break;
                    if (e0Array[n9] != null) {
                        blArray[n9] = true;
                    }
                    ++n9;
                }
            }
        }
        this.H0 = true;
        return l9;
    }

    @Override
    public void h(N n8) {
        this.t0.post((Runnable)new X(this, n8));
    }

    @Override
    public void i(v v8) {
        this.t0.post(this.r0);
    }

    int i0(int n8, long l8) {
        if (this.k0()) {
            return 0;
        }
        this.U(n8);
        d0 d02 = this.w0[n8];
        int n9 = d02.C(l8, this.Q0);
        d02.b0(n9);
        if (n9 == 0) {
            this.V(n8);
        }
        return n9;
    }

    @Override
    public void l() throws IOException {
        this.W();
        if (this.Q0 && !this.z0) {
            throw E.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override
    public long m(long l8) {
        this.L();
        Object[] objectArray = this.C0.b;
        if (!this.D0.i()) {
            l8 = 0L;
        }
        int n8 = 0;
        this.I0 = false;
        boolean bl = this.M0 == l8;
        this.M0 = l8;
        if (this.R()) {
            this.N0 = l8;
            return l8;
        }
        if (this.G0 == 7 || !this.Q0 && !this.o0.i() || !this.g0((boolean[])objectArray, l8, bl)) {
            int n9;
            this.O0 = false;
            this.N0 = l8;
            this.Q0 = false;
            this.J0 = false;
            if (this.o0.i()) {
                objectArray = this.w0;
                n8 = objectArray.length;
                for (n9 = 0; n9 < n8; ++n9) {
                    objectArray[n9].q();
                }
                this.o0.e();
                return l8;
            }
            this.o0.f();
            objectArray = this.w0;
            int n10 = objectArray.length;
            for (n9 = n8; n9 < n10; ++n9) {
                objectArray[n9].S();
            }
        }
        return l8;
    }

    @Override
    public void n(C.a a8, long l8) {
        this.u0 = a8;
        if (this.m0 != null) {
            this.u(this.l0, 3).e(this.m0);
            this.h0(new I(new long[]{0L}, new long[]{0L}, -9223372036854775807L));
            this.o();
            this.N0 = l8;
            return;
        }
        this.q0.f();
        this.j0();
    }

    @Override
    public void o() {
        this.y0 = true;
        this.t0.post(this.r0);
    }

    @Override
    public long q(long l8, Z z8) {
        this.L();
        if (!this.D0.i()) {
            return 0L;
        }
        N.a a8 = this.D0.l(l8);
        return z8.a(l8, a8.a.a, a8.b.a);
    }

    @Override
    public long s() {
        if (this.J0) {
            this.J0 = false;
            return this.M0;
        }
        if (this.I0 && (this.Q0 || this.O() > this.P0)) {
            this.I0 = false;
            return this.M0;
        }
        return -9223372036854775807L;
    }

    @Override
    public q0 t() {
        this.L();
        return this.C0.a;
    }

    @Override
    public ax.q1.U u(int n8, int n9) {
        return this.d0(new e(n8, false));
    }

    @Override
    public void v(long l8, boolean bl) {
        if (!this.B0) {
            this.L();
            if (!this.R()) {
                boolean[] blArray = this.C0.c;
                int n8 = this.w0.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.w0[i8].p(l8, bl, blArray[i8]);
                }
            }
        }
    }

    final class b
    implements o.e,
    x.a {
        private final long a;
        private final Uri b;
        private final ax.U0.y c;
        private final T d;
        private final t e;
        private final ax.S0.k f;
        private final M g;
        private volatile boolean h;
        private boolean i;
        private long j;
        private k k;
        private ax.q1.U l;
        private boolean m;
        final Y n;

        public b(Y y8, Uri uri, g g8, T t8, t t9, ax.S0.k k8) {
            this.n = y8;
            this.b = uri;
            this.c = new ax.U0.y(g8);
            this.d = t8;
            this.e = t9;
            this.f = k8;
            this.g = new M();
            this.i = true;
            this.a = y.a();
            this.k = this.i(0L);
        }

        private k i(long l8) {
            return new k.b().i(this.b).h(l8).f(this.n.j0).b(6).e(S0).a();
        }

        private void j(long l8, long l9) {
            this.g.a = l8;
            this.j = l9;
            this.i = true;
            this.m = false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a() throws IOException {
            int n8 = 0;
            while (n8 == 0 && !this.h) {
                Throwable throwable2;
                int n9;
                block18: {
                    boolean bl;
                    long l8;
                    Object object;
                    long l9;
                    block16: {
                        block17: {
                            n9 = n8;
                            try {
                                l9 = this.g.a;
                                n9 = n8;
                                object = this.i(l9);
                                n9 = n8;
                                this.k = object;
                                n9 = n8;
                                l8 = this.c.f((k)object);
                                n9 = n8;
                                bl = this.h;
                                if (!bl) break block16;
                                if (n8 == 1 || this.d.e() == -1L) break block17;
                                this.g.a = this.d.e();
                            }
                            catch (Throwable throwable2) {
                                break block18;
                            }
                        }
                        ax.U0.j.a(this.c);
                        return;
                    }
                    long l10 = l8;
                    if (l8 != -1L) {
                        l10 = l8 + l9;
                        n9 = n8;
                        this.n.Y();
                    }
                    n9 = n8;
                    Y.J(this.n, ax.D1.b.d(this.c.l()));
                    n9 = n8;
                    Object object2 = this.c;
                    n9 = n8;
                    object = object2;
                    if (this.n.v0 != null) {
                        n9 = n8;
                        object = object2;
                        if (((Y)this.n).v0.f != -1) {
                            n9 = n8;
                            n9 = n8;
                            object = new x(this.c, ((Y)this.n).v0.f, this);
                            n9 = n8;
                            object2 = this.n.Q();
                            n9 = n8;
                            this.l = object2;
                            n9 = n8;
                            object2.e(T0);
                        }
                    }
                    n9 = n8;
                    this.d.g((ax.P0.k)object, this.b, this.c.l(), l9, l10, this.e);
                    n9 = n8;
                    if (this.n.v0 != null) {
                        n9 = n8;
                        this.d.f();
                    }
                    n9 = n8;
                    int n10 = n8;
                    l10 = l9;
                    if (this.i) {
                        n9 = n8;
                        this.d.b(l9, this.j);
                        n9 = n8;
                        this.i = false;
                        l10 = l9;
                        n10 = n8;
                    }
                    while (n10 == 0) {
                        n9 = n10;
                        bl = this.h;
                        if (bl) break;
                        n9 = n10;
                        try {
                            this.f.a();
                            n9 = n10;
                            n9 = n8 = this.d.c(this.g);
                            l9 = this.d.e();
                            n9 = n8;
                            n10 = n8;
                        }
                        catch (InterruptedException interruptedException) {
                            n9 = n10;
                            n9 = n10;
                            InterruptedIOException interruptedIOException = new InterruptedIOException();
                            n9 = n10;
                            throw interruptedIOException;
                        }
                        if (l9 <= this.n.k0 + l10) continue;
                        n9 = n8;
                        this.f.d();
                        n9 = n8;
                        this.n.t0.post(this.n.s0);
                        l10 = l9;
                        n10 = n8;
                    }
                    if (n10 == 1) {
                        n8 = 0;
                    } else {
                        n8 = n10;
                        if (this.d.e() != -1L) {
                            this.g.a = this.d.e();
                            n8 = n10;
                        }
                    }
                    ax.U0.j.a(this.c);
                    continue;
                }
                if (n9 != 1 && this.d.e() != -1L) {
                    this.g.a = this.d.e();
                }
                ax.U0.j.a(this.c);
                throw throwable2;
            }
        }

        @Override
        public void b(G g8) {
            long l8 = !this.m ? this.j : Math.max(this.n.P(true), this.j);
            int n8 = g8.a();
            ax.q1.U u8 = ax.S0.a.e(this.l);
            u8.g(g8, n8);
            u8.f(l8, 1, n8, 0, null);
            this.m = true;
        }

        @Override
        public void c() {
            this.h = true;
        }
    }

    static interface c {
        public void h(long var1, N var3, boolean var4);
    }

    private final class d
    implements e0 {
        private final int a;
        final Y b;

        public d(Y y8, int n8) {
            this.b = y8;
            this.a = n8;
        }

        @Override
        public int a(O o8, i i8, int n8) {
            return this.b.e0(this.a, o8, i8, n8);
        }

        @Override
        public void b() throws IOException {
            this.b.X(this.a);
        }

        @Override
        public int c(long l8) {
            return this.b.i0(this.a, l8);
        }

        @Override
        public boolean isReady() {
            return this.b.S(this.a);
        }
    }

    private static final class e {
        public final int a;
        public final boolean b;

        public e(int n8, boolean bl) {
            this.a = n8;
            this.b = bl;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && e.class == object.getClass()) {
                object = (e)object;
                if (this.a == ((e)object).a && this.b == ((e)object).b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.a * 31 + this.b;
        }
    }

    private static final class f {
        public final q0 a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public f(q0 q02, boolean[] blArray) {
            this.a = q02;
            this.b = blArray;
            int n8 = q02.a;
            this.c = new boolean[n8];
            this.d = new boolean[n8];
        }
    }
}

