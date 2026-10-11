/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.s;
import ax.P0.G;
import ax.S0.h;
import ax.Y0.S;
import ax.Y0.a0;

final class k
implements S {
    private final a c0;
    private M0 d0;
    private S e0;
    private boolean f0;
    private boolean g0;
    private final a0 q;

    public k(a a8, h h8) {
        this.c0 = a8;
        this.q = new a0(h8);
        this.f0 = true;
    }

    private boolean d(boolean bl) {
        M0 m02 = this.d0;
        return m02 == null || m02.c() || bl && this.d0.getState() != 2 || !this.d0.isReady() && (bl || this.d0.n());
        {
        }
    }

    private void j(boolean bl) {
        if (this.d(bl)) {
            this.f0 = true;
            if (this.g0) {
                this.q.b();
                return;
            }
        } else {
            Object object = ax.S0.a.e(this.e0);
            long l8 = object.w();
            if (this.f0) {
                if (l8 < this.q.w()) {
                    this.q.c();
                    return;
                }
                this.f0 = false;
                if (this.g0) {
                    this.q.b();
                }
            }
            this.q.a(l8);
            object = object.h();
            if (!((G)object).equals(this.q.h())) {
                this.q.e((G)object);
                this.c0.j((G)object);
            }
        }
    }

    public void a(M0 m02) {
        if (m02 == this.d0) {
            this.e0 = null;
            this.d0 = null;
            this.f0 = true;
        }
    }

    public void b(M0 m02) throws s {
        S s8;
        S s9 = m02.H();
        if (s9 != null && s9 != (s8 = this.e0)) {
            if (s8 == null) {
                this.e0 = s9;
                this.d0 = m02;
                s9.e(this.q.h());
                return;
            }
            throw s.f(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public void c(long l8) {
        this.q.a(l8);
    }

    @Override
    public void e(G g8) {
        S s8 = this.e0;
        G g9 = g8;
        if (s8 != null) {
            s8.e(g8);
            g9 = this.e0.h();
        }
        this.q.e(g9);
    }

    public void f() {
        this.g0 = true;
        this.q.b();
    }

    public void g() {
        this.g0 = false;
        this.q.c();
    }

    @Override
    public G h() {
        S s8 = this.e0;
        if (s8 != null) {
            return s8.h();
        }
        return this.q.h();
    }

    public long i(boolean bl) {
        this.j(bl);
        return this.w();
    }

    @Override
    public long w() {
        if (this.f0) {
            return this.q.w();
        }
        return ax.S0.a.e(this.e0).w();
    }

    @Override
    public boolean z() {
        if (this.f0) {
            return this.q.z();
        }
        return ax.S0.a.e(this.e0).z();
    }

    public static interface a {
        public void j(G var1);
    }
}

