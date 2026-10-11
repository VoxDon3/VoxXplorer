/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.s;
import ax.P0.a0;
import ax.P0.v;
import ax.S0.I;
import ax.S0.a;
import ax.o1.A;
import ax.o1.E;
import ax.o1.S;
import ax.o1.c;
import ax.o1.d;
import ax.o1.f;
import ax.o1.g;
import ax.o1.h;
import ax.o1.z;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

final class e
implements S {
    private final A a;
    private final E b;
    private final Queue<S.b> c;
    private Surface d;
    private v e;
    private long f;
    private S.a g;
    private Executor h;
    private z i;

    public e(A a8, ax.S0.h h8) {
        this.a = a8;
        a8.m(h8);
        this.b = new E(new b(this), a8);
        this.c = new ArrayDeque<S.b>();
        this.e = new v.b().P();
        this.f = -9223372036854775807L;
        this.g = S.a.a;
        this.h = new ax.o1.b();
        this.i = new c();
    }

    public static /* synthetic */ void a(Runnable runnable2) {
    }

    public static /* synthetic */ void e(e e8) {
        e8.g.b();
    }

    public static /* synthetic */ void f(long l8, long l9, v v8, MediaFormat mediaFormat) {
    }

    @Override
    public void A() {
        this.a.a();
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return this.b.d();
    }

    @Override
    public void d() {
    }

    @Override
    public void g(float f8) {
        this.a.p(f8);
    }

    @Override
    public void h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void i(long l8, long l9) throws S.c {
        try {
            this.b.j(l8, l9);
            return;
        }
        catch (s s8) {
            throw new S.c(s8, this.e);
        }
    }

    @Override
    public Surface j() {
        return ax.S0.a.i(this.d);
    }

    @Override
    public boolean k(long l8, S.b b8) {
        this.c.add(b8);
        this.b.g(l8);
        this.h.execute(new d(this));
        return true;
    }

    @Override
    public void l() {
        this.a.i();
    }

    @Override
    public void m(S.a a8, Executor executor) {
        this.g = a8;
        this.h = executor;
    }

    @Override
    public void n() {
        this.a.h();
    }

    @Override
    public void o(long l8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void p(z z8) {
        this.i = z8;
    }

    @Override
    public void q() {
        this.b.l();
    }

    @Override
    public void r(int n8, v v8, long l8, int n9, List<Object> object) {
        float f8;
        ax.S0.a.g(object.isEmpty());
        n8 = v8.v;
        object = this.e;
        if (n8 != ((v)object).v || v8.w != ((v)object).w) {
            this.b.i(n8, v8.w);
        }
        if ((f8 = v8.z) != this.e.z) {
            this.a.n(f8);
        }
        this.e = v8;
        if (l8 != this.f) {
            this.b.h(n9, l8);
            this.f = l8;
        }
    }

    @Override
    public void s(int n8) {
        this.a.l(n8);
    }

    @Override
    public void t(Surface surface, I i8) {
        this.d = surface;
        this.a.o(surface);
    }

    @Override
    public void u() {
        this.d = null;
        this.a.o(null);
    }

    @Override
    public void v(boolean bl) {
        if (bl) {
            this.a.k();
        }
        this.b.b();
        this.c.clear();
    }

    @Override
    public void w(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void x(boolean bl) {
        this.a.e(bl);
    }

    @Override
    public boolean y(boolean bl) {
        return this.a.d(bl);
    }

    @Override
    public boolean z(v v8) {
        return true;
    }

    private final class b
    implements E.a {
        private v a;
        final e b;

        private b(e e8) {
            this.b = e8;
        }

        public static /* synthetic */ void d(b b8) {
            b8.b.g.e();
        }

        public static /* synthetic */ void e(b b8) {
            b8.b.g.f();
        }

        public static /* synthetic */ void f(b b8, a0 a02) {
            b8.b.g.a(a02);
        }

        @Override
        public void a(a0 a02) {
            this.a = new v.b().F0(a02.a).h0(a02.b).y0("video/raw").P();
            this.b.h.execute(new h(this, a02));
        }

        @Override
        public void b() {
            this.b.h.execute(new g(this));
            ((S.b)this.b.c.remove()).b();
        }

        @Override
        public void c(long l8, long l9, boolean bl) {
            v v8;
            if (bl && this.b.d != null) {
                this.b.h.execute(new f(this));
            }
            v v9 = v8 = this.a;
            if (v8 == null) {
                v9 = new v.b().P();
            }
            this.b.i.g(l9, l8, v9, null);
            ((S.b)this.b.c.remove()).a(l8);
        }
    }
}

