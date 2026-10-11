/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.N0;
import androidx.media3.exoplayer.p0;
import androidx.media3.exoplayer.r0;
import androidx.media3.exoplayer.s;
import androidx.media3.exoplayer.t0;
import ax.P0.N;
import ax.S0.u;
import ax.i1.C;
import ax.i1.F;
import ax.i1.e;
import ax.i1.e0;
import ax.l1.D;
import ax.l1.J;
import ax.l1.K;
import ax.m1.b;
import java.io.IOException;

final class q0 {
    public final C a;
    public final Object b;
    public final e0[] c;
    public final long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public r0 h;
    public boolean i;
    private final boolean[] j;
    private final N0[] k;
    private final J l;
    private final I0 m;
    private q0 n;
    private ax.i1.q0 o;
    private K p;
    private long q;

    public q0(N0[] n0Array, long l8, J object, b b8, I0 i02, r0 r02, K k8, long l9) {
        this.k = n0Array;
        this.q = l8;
        this.l = object;
        this.m = i02;
        object = r02.a;
        this.b = ((F.b)object).a;
        this.h = r02;
        this.d = l9;
        this.o = ax.i1.q0.d;
        this.p = k8;
        this.c = new e0[n0Array.length];
        this.j = new boolean[n0Array.length];
        this.a = q0.f((F.b)object, i02, b8, r02.b, r02.d, r02.f);
    }

    private void c(e0[] e0Array) {
        N0[] n0Array;
        for (int i8 = 0; i8 < (n0Array = this.k).length; ++i8) {
            if (n0Array[i8].k() != -2 || !this.p.c(i8)) continue;
            e0Array[i8] = new ax.i1.s();
        }
    }

    private static C f(F.b object, I0 i02, b b8, long l8, long l9, boolean bl) {
        object = i02.h((F.b)object, b8, l8);
        if (l9 != -9223372036854775807L) {
            return new e((C)object, bl ^ true, 0L, l9);
        }
        return object;
    }

    private void g() {
        if (this.u()) {
            int n8 = 0;
            while (true) {
                Object object = this.p;
                if (n8 >= ((K)object).a) break;
                boolean bl = ((K)object).c(n8);
                object = this.p.c[n8];
                if (bl && object != null) {
                    object.f();
                }
                ++n8;
            }
        }
    }

    private void h(e0[] e0Array) {
        N0[] n0Array;
        for (int i8 = 0; i8 < (n0Array = this.k).length; ++i8) {
            if (n0Array[i8].k() != -2) continue;
            e0Array[i8] = null;
        }
    }

    private void i() {
        if (this.u()) {
            int n8 = 0;
            while (true) {
                Object object = this.p;
                if (n8 >= ((K)object).a) break;
                boolean bl = ((K)object).c(n8);
                object = this.p.c[n8];
                if (bl && object != null) {
                    object.i();
                }
                ++n8;
            }
        }
    }

    private boolean u() {
        return this.n == null;
    }

    private static void y(I0 i02, C c8) {
        try {
            if (c8 instanceof e) {
                i02.z(((e)c8).q);
                return;
            }
            i02.z(c8);
            return;
        }
        catch (RuntimeException runtimeException) {
            u.d("MediaPeriodHolder", "Period release failed.", runtimeException);
            return;
        }
    }

    public void A(q0 q02) {
        if (q02 == this.n) {
            return;
        }
        this.g();
        this.n = q02;
        this.i();
    }

    public void B(long l8) {
        this.q = l8;
    }

    public long C(long l8) {
        return l8 - this.m();
    }

    public long D(long l8) {
        return l8 + this.m();
    }

    public void E() {
        C c8 = this.a;
        if (c8 instanceof e) {
            long l8;
            long l9 = l8 = this.h.d;
            if (l8 == -9223372036854775807L) {
                l9 = Long.MIN_VALUE;
            }
            ((e)c8).x(0L, l9);
        }
    }

    public long a(K k8, long l8, boolean bl) {
        return this.b(k8, l8, bl, new boolean[this.k.length]);
    }

    public long b(K k8, long l8, boolean bl, boolean[] objectArray) {
        int n8 = 0;
        while (true) {
            int n9 = k8.a;
            boolean bl2 = true;
            if (n8 >= n9) break;
            boolean[] blArray = this.j;
            if (bl || !k8.b(this.p, n8)) {
                bl2 = false;
            }
            blArray[n8] = bl2;
            ++n8;
        }
        this.h(this.c);
        this.g();
        this.p = k8;
        this.i();
        l8 = this.a.g(k8.c, this.j, this.c, (boolean[])objectArray, l8);
        this.c(this.c);
        this.g = false;
        for (n8 = 0; n8 < (objectArray = (Object[])this.c).length; ++n8) {
            if (objectArray[n8] != null) {
                ax.S0.a.g(k8.c(n8));
                if (this.k[n8].k() == -2) continue;
                this.g = true;
                continue;
            }
            bl = k8.c[n8] == null;
            ax.S0.a.g(bl);
        }
        return l8;
    }

    public boolean d(r0 r02) {
        if (t0.e(this.h.e, r02.e)) {
            r0 r03 = this.h;
            if (r03.b == r02.b && r03.a.equals(r02.a)) {
                return true;
            }
        }
        return false;
    }

    public void e(p0 p02) {
        ax.S0.a.g(this.u());
        this.a.a(p02);
    }

    public long j() {
        if (!this.f) {
            return this.h.b;
        }
        long l8 = this.g ? this.a.d() : Long.MIN_VALUE;
        if (l8 == Long.MIN_VALUE) {
            return this.h.e;
        }
        return l8;
    }

    public q0 k() {
        return this.n;
    }

    public long l() {
        if (!this.f) {
            return 0L;
        }
        return this.a.b();
    }

    public long m() {
        return this.q;
    }

    public long n() {
        return this.h.b + this.q;
    }

    public ax.i1.q0 o() {
        return this.o;
    }

    public K p() {
        return this.p;
    }

    public void q(float f8, N object, boolean bl) throws s {
        this.f = true;
        this.o = this.a.t();
        object = this.z(f8, (N)object, bl);
        r0 r02 = this.h;
        long l8 = r02.b;
        long l9 = r02.e;
        long l10 = l8;
        if (l9 != -9223372036854775807L) {
            l10 = l8;
            if (l8 >= l9) {
                l10 = Math.max(0L, l9 - 1L);
            }
        }
        l10 = this.a((K)object, l10, false);
        l8 = this.q;
        object = this.h;
        this.q = l8 + (((r0)object).b - l10);
        this.h = ((r0)object).b(l10);
    }

    public boolean r() {
        block5: {
            try {
                if (!this.f) {
                    this.a.l();
                    break block5;
                }
            }
            catch (IOException iOException) {
                return true;
            }
            for (e0 e02 : this.c) {
                if (e02 == null) continue;
                e02.b();
            }
        }
        return false;
    }

    public boolean s() {
        return this.f && (!this.g || this.a.d() == Long.MIN_VALUE);
    }

    public boolean t() {
        return this.f && (this.s() || this.j() - this.h.b >= this.d);
    }

    public void v(C.a a8, long l8) {
        this.e = true;
        this.a.n(a8, l8);
    }

    public void w(long l8) {
        ax.S0.a.g(this.u());
        if (this.f) {
            this.a.e(this.C(l8));
        }
    }

    public void x() {
        this.g();
        q0.y(this.m, this.a);
    }

    public K z(float f8, N object, boolean bl) throws s {
        int n8;
        object = this.l.k(this.k, this.o(), this.h.a, (N)object);
        int n9 = 0;
        for (n8 = 0; n8 < ((K)object).a; ++n8) {
            boolean bl2 = ((K)object).c(n8);
            boolean bl3 = true;
            boolean bl4 = true;
            if (bl2) {
                bl3 = bl4;
                if (((K)object).c[n8] == null) {
                    bl3 = this.k[n8].k() == -2 ? bl4 : false;
                }
                ax.S0.a.g(bl3);
                continue;
            }
            if (((K)object).c[n8] != null) {
                bl3 = false;
            }
            ax.S0.a.g(bl3);
        }
        D[] dArray = ((K)object).c;
        int n10 = dArray.length;
        for (n8 = n9; n8 < n10; ++n8) {
            D d8 = dArray[n8];
            if (d8 == null) continue;
            d8.p(f8);
            d8.g(bl);
        }
        return object;
    }

    static interface a {
        public q0 a(r0 var1, long var2);
    }
}

