/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import androidx.media3.exoplayer.p0;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.Z;
import ax.i1.C;
import ax.i1.e0;
import ax.i1.q0;
import ax.l1.D;
import java.io.IOException;

final class l0
implements C,
C.a {
    private final long c0;
    private C.a d0;
    private final C q;

    public l0(C c8, long l8) {
        this.q = c8;
        this.c0 = l8;
    }

    @Override
    public boolean a(p0 p02) {
        return this.q.a(p02.a().f(p02.a - this.c0).d());
    }

    @Override
    public long b() {
        long l8 = this.q.b();
        if (l8 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return l8 + this.c0;
    }

    @Override
    public boolean c() {
        return this.q.c();
    }

    @Override
    public long d() {
        long l8 = this.q.d();
        if (l8 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return l8 + this.c0;
    }

    @Override
    public void e(long l8) {
        this.q.e(l8 - this.c0);
    }

    @Override
    public void f(C c8) {
        ax.S0.a.e(this.d0).f(this);
    }

    @Override
    public long g(D[] object, boolean[] object2, e0[] e0Array, boolean[] blArray, long l8) {
        e0[] e0Array2 = new e0[e0Array.length];
        int n8 = 0;
        int n9 = 0;
        while (true) {
            int n10 = e0Array.length;
            e0 e02 = null;
            if (n9 >= n10) break;
            a a8 = (a)e0Array[n9];
            if (a8 != null) {
                e02 = a8.d();
            }
            e0Array2[n9] = e02;
            ++n9;
        }
        l8 = this.q.g((D[])object, (boolean[])object2, e0Array2, blArray, l8 - this.c0);
        for (n9 = n8; n9 < e0Array.length; ++n9) {
            object2 = e0Array2[n9];
            if (object2 == null) {
                e0Array[n9] = null;
                continue;
            }
            object = e0Array[n9];
            if (object != null && ((a)object).d() == object2) continue;
            e0Array[n9] = new a((e0)object2, this.c0);
        }
        return l8 + this.c0;
    }

    public C j() {
        return this.q;
    }

    @Override
    public void l() throws IOException {
        this.q.l();
    }

    @Override
    public long m(long l8) {
        return this.q.m(l8 - this.c0) + this.c0;
    }

    @Override
    public void n(C.a a8, long l8) {
        this.d0 = a8;
        this.q.n(this, l8 - this.c0);
    }

    public void o(C c8) {
        ax.S0.a.e(this.d0).i(this);
    }

    @Override
    public long q(long l8, Z z8) {
        return this.q.q(l8 - this.c0, z8) + this.c0;
    }

    @Override
    public long s() {
        long l8 = this.q.s();
        if (l8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return l8 + this.c0;
    }

    @Override
    public q0 t() {
        return this.q.t();
    }

    @Override
    public void v(long l8, boolean bl) {
        this.q.v(l8 - this.c0, bl);
    }

    private static final class a
    implements e0 {
        private final e0 a;
        private final long b;

        public a(e0 e02, long l8) {
            this.a = e02;
            this.b = l8;
        }

        @Override
        public int a(O o8, i i8, int n8) {
            if ((n8 = this.a.a(o8, i8, n8)) == -4) {
                i8.g0 += this.b;
            }
            return n8;
        }

        @Override
        public void b() throws IOException {
            this.a.b();
        }

        @Override
        public int c(long l8) {
            return this.a.c(l8 - this.b);
        }

        public e0 d() {
            return this.a;
        }

        @Override
        public boolean isReady() {
            return this.a.isReady();
        }
    }
}

