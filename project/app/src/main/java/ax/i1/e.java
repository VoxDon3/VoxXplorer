/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import androidx.media3.exoplayer.p0;
import ax.P0.D;
import ax.P0.v;
import ax.S0.d0;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.Z;
import ax.i1.C;
import ax.i1.e0;
import ax.i1.f;
import ax.i1.q0;
import java.io.IOException;

public final class e
implements C,
C.a {
    private C.a c0;
    private a[] d0;
    private long e0;
    long f0;
    long g0;
    private f.d h0;
    public final C q;

    public e(C c8, boolean bl, long l8, long l9) {
        this.q = c8;
        this.d0 = new a[0];
        long l10 = bl ? l8 : -9223372036854775807L;
        this.e0 = l10;
        this.f0 = l8;
        this.g0 = l9;
    }

    private Z j(long l8, Z z8) {
        long l9 = ax.S0.d0.q(z8.a, 0L, l8 - this.f0);
        long l10 = z8.b;
        long l11 = this.g0;
        l8 = l11 == Long.MIN_VALUE ? Long.MAX_VALUE : l11 - l8;
        l8 = ax.S0.d0.q(l10, 0L, l8);
        if (l9 == z8.a && l8 == z8.b) {
            return z8;
        }
        return new Z(l9, l8);
    }

    private static long o(long l8, long l9, long l10) {
        l8 = l9 = Math.max(l8, l9);
        if (l10 != Long.MIN_VALUE) {
            l8 = Math.min(l9, l10);
        }
        return l8;
    }

    private static boolean w(long l8, long l9, ax.l1.D[] dArray) {
        if (l8 < l9) {
            return true;
        }
        if (l8 != 0L) {
            for (ax.l1.D d8 : dArray) {
                if (d8 == null) continue;
                v v8 = d8.m();
                if (D.a(v8.o, v8.k)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean a(p0 p02) {
        return this.q.a(p02);
    }

    @Override
    public long b() {
        long l8;
        long l9 = this.q.b();
        if (l9 != Long.MIN_VALUE && ((l8 = this.g0) == Long.MIN_VALUE || l9 < l8)) {
            return l9;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public boolean c() {
        return this.q.c();
    }

    @Override
    public long d() {
        long l8;
        long l9 = this.q.d();
        if (l9 != Long.MIN_VALUE && ((l8 = this.g0) == Long.MIN_VALUE || l9 < l8)) {
            return l9;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public void e(long l8) {
        this.q.e(l8);
    }

    @Override
    public void f(C c8) {
        if (this.h0 != null) {
            return;
        }
        ax.S0.a.e(this.c0).f(this);
    }

    @Override
    public long g(ax.l1.D[] objectArray, boolean[] object, e0[] e0Array, boolean[] object2, long l8) {
        this.d0 = new a[e0Array.length];
        e0[] e0Array2 = new e0[e0Array.length];
        int n8 = 0;
        int n9 = 0;
        while (true) {
            a a8;
            int n10 = e0Array.length;
            e0 e02 = null;
            if (n9 >= n10) break;
            a[] aArray = this.d0;
            aArray[n9] = a8 = (a)e0Array[n9];
            if (a8 != null) {
                e02 = a8.a;
            }
            e0Array2[n9] = e02;
            ++n9;
        }
        long l9 = this.q.g((ax.l1.D[])objectArray, (boolean[])object, e0Array2, (boolean[])object2, l8);
        long l10 = e.o(l9, l8, this.g0);
        l8 = this.p() && e.w(l9, l8, (ax.l1.D[])objectArray) ? l10 : -9223372036854775807L;
        this.e0 = l8;
        for (n9 = n8; n9 < e0Array.length; ++n9) {
            object = e0Array2[n9];
            if (object == null) {
                this.d0[n9] = null;
            } else {
                objectArray = this.d0;
                object2 = objectArray[n9];
                if (object2 == null || object2.a != object) {
                    objectArray[n9] = new a(this, (e0)object);
                }
            }
            e0Array[n9] = this.d0[n9];
        }
        return l10;
    }

    @Override
    public void l() throws IOException {
        f.d d8 = this.h0;
        if (d8 == null) {
            this.q.l();
            return;
        }
        throw d8;
    }

    @Override
    public long m(long l8) {
        this.e0 = -9223372036854775807L;
        for (a a8 : this.d0) {
            if (a8 == null) continue;
            a8.d();
        }
        return e.o(this.q.m(l8), this.f0, this.g0);
    }

    @Override
    public void n(C.a a8, long l8) {
        this.c0 = a8;
        this.q.n(this, l8);
    }

    boolean p() {
        return this.e0 != -9223372036854775807L;
    }

    @Override
    public long q(long l8, Z z8) {
        long l9 = this.f0;
        if (l8 == l9) {
            return l9;
        }
        z8 = this.j(l8, z8);
        return this.q.q(l8, z8);
    }

    public void r(C c8) {
        ax.S0.a.e(this.c0).i(this);
    }

    @Override
    public long s() {
        if (this.p()) {
            long l8 = this.e0;
            this.e0 = -9223372036854775807L;
            long l9 = this.s();
            if (l9 != -9223372036854775807L) {
                return l9;
            }
            return l8;
        }
        long l10 = this.q.s();
        if (l10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return e.o(l10, this.f0, this.g0);
    }

    @Override
    public q0 t() {
        return this.q.t();
    }

    public void u(f.d d8) {
        this.h0 = d8;
    }

    @Override
    public void v(long l8, boolean bl) {
        this.q.v(l8, bl);
    }

    public void x(long l8, long l9) {
        this.f0 = l8;
        this.g0 = l9;
    }

    private final class a
    implements e0 {
        public final e0 a;
        private boolean b;
        final e c;

        public a(e e8, e0 e02) {
            this.c = e8;
            this.a = e02;
        }

        @Override
        public int a(O o8, i object, int n8) {
            if (this.c.p()) {
                return -3;
            }
            if (this.b) {
                ((ax.V0.a)object).A(4);
                return -4;
            }
            long l8 = this.c.d();
            if ((n8 = this.a.a(o8, (i)object, n8)) == -5) {
                object = ax.S0.a.e(o8.b);
                n8 = ((v)object).J;
                if (n8 != 0 || ((v)object).K != 0) {
                    e e8 = this.c;
                    l8 = e8.f0;
                    int n9 = 0;
                    if (l8 != 0L) {
                        n8 = 0;
                    }
                    if (e8.g0 == Long.MIN_VALUE) {
                        n9 = ((v)object).K;
                    }
                    o8.b = ((v)object).b().d0(n8).e0(n9).P();
                }
                return -5;
            }
            long l9 = this.c.g0;
            if (l9 != Long.MIN_VALUE && (n8 == -4 && ((i)object).g0 >= l9 || n8 == -3 && l8 == Long.MIN_VALUE && !((i)object).f0)) {
                ((i)object).p();
                ((ax.V0.a)object).A(4);
                this.b = true;
                return -4;
            }
            return n8;
        }

        @Override
        public void b() throws IOException {
            this.a.b();
        }

        @Override
        public int c(long l8) {
            if (this.c.p()) {
                return -3;
            }
            return this.a.c(l8);
        }

        public void d() {
            this.b = false;
        }

        @Override
        public boolean isReady() {
            return !this.c.p() && this.a.isReady();
        }
    }
}

