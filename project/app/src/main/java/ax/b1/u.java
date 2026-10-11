/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.os.Handler;
import ax.S0.d0;
import ax.b1.o;
import ax.b1.p;
import ax.b1.q;
import ax.b1.r;
import ax.b1.s;
import ax.b1.t;
import ax.i1.F;
import java.util.concurrent.CopyOnWriteArrayList;

public interface u {
    public void G(int var1, F.b var2);

    public void M(int var1, F.b var2);

    public void V(int var1, F.b var2);

    public void g0(int var1, F.b var2, int var3);

    public void l0(int var1, F.b var2, Exception var3);

    public void n0(int var1, F.b var2);

    public static class ax.b1.u$a {
        public final int a;
        public final F.b b;
        private final CopyOnWriteArrayList<a> c;

        public ax.b1.u$a() {
            this(new CopyOnWriteArrayList<a>(), 0, null);
        }

        private ax.b1.u$a(CopyOnWriteArrayList<a> copyOnWriteArrayList, int n8, F.b b8) {
            this.c = copyOnWriteArrayList;
            this.a = n8;
            this.b = b8;
        }

        public static /* synthetic */ void a(ax.b1.u$a a8, u u8) {
            u8.G(a8.a, a8.b);
        }

        public static /* synthetic */ void b(ax.b1.u$a a8, u u8) {
            u8.V(a8.a, a8.b);
        }

        public static /* synthetic */ void c(ax.b1.u$a a8, u u8, int n8) {
            u8.g0(a8.a, a8.b, n8);
        }

        public static /* synthetic */ void d(ax.b1.u$a a8, u u8) {
            u8.n0(a8.a, a8.b);
        }

        public static /* synthetic */ void e(ax.b1.u$a a8, u u8, Exception exception) {
            u8.l0(a8.a, a8.b, exception);
        }

        public static /* synthetic */ void f(ax.b1.u$a a8, u u8) {
            u8.M(a8.a, a8.b);
        }

        public void g(Handler handler, u u8) {
            ax.S0.a.e(handler);
            ax.S0.a.e(u8);
            this.c.add(new a(handler, u8));
        }

        public void h() {
            for (a a8 : this.c) {
                u u8 = a8.b;
                d0.j1(a8.a, new t(this, u8));
            }
        }

        public void i() {
            for (a a8 : this.c) {
                u u8 = a8.b;
                d0.j1(a8.a, new r(this, u8));
            }
        }

        public void j() {
            for (a a8 : this.c) {
                u u8 = a8.b;
                d0.j1(a8.a, new s(this, u8));
            }
        }

        public void k(int n8) {
            for (a a8 : this.c) {
                u u8 = a8.b;
                d0.j1(a8.a, new o(this, u8, n8));
            }
        }

        public void l(Exception exception) {
            for (a a8 : this.c) {
                u u8 = a8.b;
                d0.j1(a8.a, new q(this, u8, exception));
            }
        }

        public void m() {
            for (a a8 : this.c) {
                u u8 = a8.b;
                d0.j1(a8.a, new p(this, u8));
            }
        }

        public void n(u u8) {
            for (a a8 : this.c) {
                if (a8.b != u8) continue;
                this.c.remove(a8);
            }
        }

        public ax.b1.u$a o(int n8, F.b b8) {
            return new ax.b1.u$a(this.c, n8, b8);
        }

        private static final class a {
            public Handler a;
            public u b;

            public a(Handler handler, u u8) {
                this.a = handler;
                this.b = u8;
            }
        }
    }
}

