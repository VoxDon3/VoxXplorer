/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.os.Handler;
import ax.P0.v;
import ax.S0.d0;
import ax.S0.l;
import ax.i1.B;
import ax.i1.F;
import ax.i1.G;
import ax.i1.H;
import ax.i1.I;
import ax.i1.J;
import ax.i1.K;
import ax.i1.L;
import ax.i1.M;
import ax.i1.y;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

public interface N {
    public void K(int var1, F.b var2, y var3, B var4);

    public void X(int var1, F.b var2, B var3);

    public void e0(int var1, F.b var2, y var3, B var4);

    public void h0(int var1, F.b var2, y var3, B var4, IOException var5, boolean var6);

    public void q0(int var1, F.b var2, B var3);

    public void s0(int var1, F.b var2, y var3, B var4, int var5);

    public static class ax.i1.N$a {
        public final int a;
        public final F.b b;
        private final CopyOnWriteArrayList<a> c;

        public ax.i1.N$a() {
            this(new CopyOnWriteArrayList<a>(), 0, null);
        }

        private ax.i1.N$a(CopyOnWriteArrayList<a> copyOnWriteArrayList, int n8, F.b b8) {
            this.c = copyOnWriteArrayList;
            this.a = n8;
            this.b = b8;
        }

        public static /* synthetic */ void a(l l8, N n8) {
            l8.accept(n8);
        }

        public static /* synthetic */ void b(ax.i1.N$a a8, y y8, B b8, IOException iOException, boolean bl, N n8) {
            n8.h0(a8.a, a8.b, y8, b8, iOException, bl);
        }

        public static /* synthetic */ void c(ax.i1.N$a a8, y y8, B b8, int n8, N n9) {
            n9.s0(a8.a, a8.b, y8, b8, n8);
        }

        public static /* synthetic */ void d(ax.i1.N$a a8, F.b b8, B b9, N n8) {
            n8.q0(a8.a, b8, b9);
        }

        public static /* synthetic */ void e(ax.i1.N$a a8, B b8, N n8) {
            n8.X(a8.a, a8.b, b8);
        }

        public static /* synthetic */ void f(ax.i1.N$a a8, y y8, B b8, N n8) {
            n8.K(a8.a, a8.b, y8, b8);
        }

        public static /* synthetic */ void g(ax.i1.N$a a8, y y8, B b8, N n8) {
            n8.e0(a8.a, a8.b, y8, b8);
        }

        public ax.i1.N$a A(int n8, F.b b8) {
            return new ax.i1.N$a(this.c, n8, b8);
        }

        public void h(Handler handler, N n8) {
            ax.S0.a.e(handler);
            ax.S0.a.e(n8);
            this.c.add(new a(handler, n8));
        }

        public void i(l<N> l8) {
            for (a a8 : this.c) {
                N n8 = a8.b;
                d0.j1(a8.a, new M(l8, n8));
            }
        }

        public void j(int n8, v v8, int n9, Object object, long l8) {
            this.k(new B(1, n8, v8, n9, object, d0.E1(l8), -9223372036854775807L));
        }

        public void k(B b8) {
            this.i(new L(this, b8));
        }

        public void l(y y8, int n8) {
            this.m(y8, n8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void m(y y8, int n8, int n9, v v8, int n10, Object object, long l8, long l9) {
            this.n(y8, new B(n8, n9, v8, n10, object, d0.E1(l8), d0.E1(l9)));
        }

        public void n(y y8, B b8) {
            this.i(new J(this, y8, b8));
        }

        public void o(y y8, int n8) {
            this.p(y8, n8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void p(y y8, int n8, int n9, v v8, int n10, Object object, long l8, long l9) {
            this.q(y8, new B(n8, n9, v8, n10, object, d0.E1(l8), d0.E1(l9)));
        }

        public void q(y y8, B b8) {
            this.i(new H(this, y8, b8));
        }

        public void r(y y8, int n8, int n9, v v8, int n10, Object object, long l8, long l9, IOException iOException, boolean bl) {
            this.t(y8, new B(n8, n9, v8, n10, object, d0.E1(l8), d0.E1(l9)), iOException, bl);
        }

        public void s(y y8, int n8, IOException iOException, boolean bl) {
            this.r(y8, n8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, bl);
        }

        public void t(y y8, B b8, IOException iOException, boolean bl) {
            this.i(new I(this, y8, b8, iOException, bl));
        }

        public void u(y y8, int n8, int n9) {
            this.v(y8, n8, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, n9);
        }

        public void v(y y8, int n8, int n9, v v8, int n10, Object object, long l8, long l9, int n11) {
            this.w(y8, new B(n8, n9, v8, n10, object, d0.E1(l8), d0.E1(l9)), n11);
        }

        public void w(y y8, B b8, int n8) {
            this.i(new G(this, y8, b8, n8));
        }

        public void x(N n8) {
            for (a a8 : this.c) {
                if (a8.b != n8) continue;
                this.c.remove(a8);
            }
        }

        public void y(int n8, long l8, long l9) {
            this.z(new B(1, n8, null, 3, null, d0.E1(l8), d0.E1(l9)));
        }

        public void z(B b8) {
            this.i(new K(this, ax.S0.a.e(this.b), b8));
        }

        private static final class a {
            public Handler a;
            public N b;

            public a(Handler handler, N n8) {
                this.a = handler;
                this.b = n8;
            }
        }
    }
}

