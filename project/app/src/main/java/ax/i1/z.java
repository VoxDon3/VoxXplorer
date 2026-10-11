/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import androidx.media3.exoplayer.p0;
import ax.S0.d0;
import ax.Y0.Z;
import ax.i1.C;
import ax.i1.F;
import ax.i1.e0;
import ax.i1.q0;
import ax.l1.D;
import ax.m1.b;
import java.io.IOException;

public final class z
implements C,
C.a {
    private final long c0;
    private final b d0;
    private F e0;
    private C f0;
    private C.a g0;
    private a h0;
    private boolean i0;
    private long j0;
    public final F.b q;

    public z(F.b b8, b b9, long l8) {
        this.q = b8;
        this.d0 = b9;
        this.c0 = l8;
        this.j0 = -9223372036854775807L;
    }

    private long r(long l8) {
        long l9 = this.j0;
        if (l9 != -9223372036854775807L) {
            return l9;
        }
        return l8;
    }

    @Override
    public boolean a(p0 p02) {
        C c8 = this.f0;
        return c8 != null && c8.a(p02);
    }

    @Override
    public long b() {
        return ax.S0.d0.i(this.f0).b();
    }

    @Override
    public boolean c() {
        C c8 = this.f0;
        return c8 != null && c8.c();
    }

    @Override
    public long d() {
        return ax.S0.d0.i(this.f0).d();
    }

    @Override
    public void e(long l8) {
        ax.S0.d0.i(this.f0).e(l8);
    }

    @Override
    public void f(C object) {
        ax.S0.d0.i(this.g0).f(this);
        object = this.h0;
        if (object != null) {
            object.a(this.q);
        }
    }

    @Override
    public long g(D[] dArray, boolean[] blArray, e0[] e0Array, boolean[] blArray2, long l8) {
        long l9 = this.j0;
        if (l9 != -9223372036854775807L && l8 == this.c0) {
            l8 = l9;
        }
        this.j0 = -9223372036854775807L;
        return ax.S0.d0.i(this.f0).g(dArray, blArray, e0Array, blArray2, l8);
    }

    public void j(F.b object) {
        long l8 = this.r(this.c0);
        this.f0 = object = ax.S0.a.e(this.e0).i((F.b)object, this.d0, l8);
        if (this.g0 != null) {
            object.n(this, l8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void l() throws IOException {
        IOException iOException2;
        block3: {
            Object object;
            try {
                object = this.f0;
                if (object != null) {
                    object.l();
                    return;
                }
            }
            catch (IOException iOException2) {
                break block3;
            }
            object = this.e0;
            if (object == null) return;
            object.k();
            return;
        }
        a a8 = this.h0;
        if (a8 == null) throw iOException2;
        if (this.i0) return;
        this.i0 = true;
        a8.b(this.q, iOException2);
    }

    @Override
    public long m(long l8) {
        return ax.S0.d0.i(this.f0).m(l8);
    }

    @Override
    public void n(C.a object, long l8) {
        this.g0 = object;
        object = this.f0;
        if (object != null) {
            object.n(this, this.r(this.c0));
        }
    }

    public long o() {
        return this.j0;
    }

    public long p() {
        return this.c0;
    }

    @Override
    public long q(long l8, Z z8) {
        return ax.S0.d0.i(this.f0).q(l8, z8);
    }

    @Override
    public long s() {
        return ax.S0.d0.i(this.f0).s();
    }

    @Override
    public q0 t() {
        return ax.S0.d0.i(this.f0).t();
    }

    public void u(C c8) {
        ax.S0.d0.i(this.g0).i(this);
    }

    @Override
    public void v(long l8, boolean bl) {
        ax.S0.d0.i(this.f0).v(l8, bl);
    }

    public void w(long l8) {
        this.j0 = l8;
    }

    public void x() {
        if (this.f0 != null) {
            ax.S0.a.e(this.e0).e(this.f0);
        }
    }

    public void y(F f8) {
        boolean bl = this.e0 == null;
        ax.S0.a.g(bl);
        this.e0 = f8;
    }

    public static interface a {
        public void a(F.b var1);

        public void b(F.b var1, IOException var2);
    }
}

