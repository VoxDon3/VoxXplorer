/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.os.Handler;
import ax.S0.d0;
import ax.U0.z;
import ax.b1.u;
import ax.i1.B;
import ax.i1.F;
import ax.i1.N;
import ax.i1.g;
import ax.i1.y;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public abstract class h<T>
extends ax.i1.a {
    private final HashMap<T, b<T>> h = new HashMap();
    private Handler i;
    private z j;

    protected h() {
    }

    public static /* synthetic */ void D(h h8, Object object, F f8, ax.P0.N n8) {
        h8.H(object, f8, n8);
    }

    @Override
    protected void A(z z8) {
        this.j = z8;
        this.i = d0.A();
    }

    @Override
    protected void C() {
        for (b<T> b8 : this.h.values()) {
            b8.a.b(b8.b);
            b8.a.g(b8.c);
            b8.a.n(b8.c);
        }
        this.h.clear();
    }

    protected abstract F.b E(T var1, F.b var2);

    protected long F(T t8, long l8, F.b b8) {
        return l8;
    }

    protected int G(T t8, int n8) {
        return n8;
    }

    protected abstract void H(T var1, F var2, ax.P0.N var3);

    protected final void I(T t8, F f8) {
        ax.S0.a.a(this.h.containsKey(t8) ^ true);
        g g8 = new g(this, t8);
        a a8 = new a(this, t8);
        this.h.put(t8, new b(f8, g8, a8));
        f8.c(ax.S0.a.e(this.i), a8);
        f8.p(ax.S0.a.e(this.i), a8);
        f8.l(g8, this.j, this.x());
        if (!this.y()) {
            f8.q(g8);
        }
    }

    @Override
    public void k() throws IOException {
        Iterator<b<T>> iterator = this.h.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().a.k();
        }
    }

    @Override
    protected void v() {
        for (b<T> b8 : this.h.values()) {
            b8.a.q(b8.b);
        }
    }

    @Override
    protected void w() {
        for (b<T> b8 : this.h.values()) {
            b8.a.d(b8.b);
        }
    }

    private final class a
    implements N,
    u {
        private final T a;
        private N.a b;
        private u.a c;
        final h d;

        public a(h h8, T t8) {
            this.d = h8;
            this.b = h8.u(null);
            this.c = h8.s(null);
            this.a = t8;
        }

        private boolean a(int n8, F.b b8) {
            Object object;
            if (b8 != null) {
                object = this.d.E(this.a, b8);
                b8 = object;
                if (object == null) {
                    return false;
                }
            } else {
                b8 = null;
            }
            n8 = this.d.G(this.a, n8);
            object = this.b;
            if (((N.a)object).a != n8 || !j.Objects.equals((Object)((N.a)object).b, (Object)b8)) {
                this.b = this.d.t(n8, b8);
            }
            object = this.c;
            if (((u.a)object).a != n8 || !j.Objects.equals((Object)((u.a)object).b, (Object)b8)) {
                this.c = this.d.r(n8, b8);
            }
            return true;
        }

        private B c(B b8, F.b b9) {
            long l8 = this.d.F(this.a, b8.f, b9);
            long l9 = this.d.F(this.a, b8.g, b9);
            if (l8 == b8.f && l9 == b8.g) {
                return b8;
            }
            return new B(b8.a, b8.b, b8.c, b8.d, b8.e, l8, l9);
        }

        @Override
        public void G(int n8, F.b b8) {
            if (this.a(n8, b8)) {
                this.c.j();
            }
        }

        @Override
        public void K(int n8, F.b b8, y y8, B b9) {
            if (this.a(n8, b8)) {
                this.b.q(y8, this.c(b9, b8));
            }
        }

        @Override
        public void M(int n8, F.b b8) {
            if (this.a(n8, b8)) {
                this.c.i();
            }
        }

        @Override
        public void V(int n8, F.b b8) {
            if (this.a(n8, b8)) {
                this.c.m();
            }
        }

        @Override
        public void X(int n8, F.b b8, B b9) {
            if (this.a(n8, b8)) {
                this.b.k(this.c(b9, b8));
            }
        }

        @Override
        public void e0(int n8, F.b b8, y y8, B b9) {
            if (this.a(n8, b8)) {
                this.b.n(y8, this.c(b9, b8));
            }
        }

        @Override
        public void g0(int n8, F.b b8, int n9) {
            if (this.a(n8, b8)) {
                this.c.k(n9);
            }
        }

        @Override
        public void h0(int n8, F.b b8, y y8, B b9, IOException iOException, boolean bl) {
            if (this.a(n8, b8)) {
                this.b.t(y8, this.c(b9, b8), iOException, bl);
            }
        }

        @Override
        public void l0(int n8, F.b b8, Exception exception) {
            if (this.a(n8, b8)) {
                this.c.l(exception);
            }
        }

        @Override
        public void n0(int n8, F.b b8) {
            if (this.a(n8, b8)) {
                this.c.h();
            }
        }

        @Override
        public void q0(int n8, F.b b8, B b9) {
            if (this.a(n8, b8)) {
                this.b.z(this.c(b9, b8));
            }
        }

        @Override
        public void s0(int n8, F.b b8, y y8, B b9, int n9) {
            if (this.a(n8, b8)) {
                this.b.w(y8, this.c(b9, b8), n9);
            }
        }
    }

    private static final class b<T> {
        public final F a;
        public final F.c b;
        public final a c;

        public b(F f8, F.c c8, a a8) {
            this.a = f8;
            this.b = c8;
            this.c = a8;
        }
    }
}

