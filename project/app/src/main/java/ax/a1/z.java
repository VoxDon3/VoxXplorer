/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.os.Handler;
import ax.S0.d0;
import ax.Y0.b;
import ax.Y0.c;
import ax.a1.B;
import ax.a1.m;
import ax.a1.n;
import ax.a1.o;
import ax.a1.p;
import ax.a1.q;
import ax.a1.r;
import ax.a1.s;
import ax.a1.t;
import ax.a1.u;
import ax.a1.v;
import ax.a1.w;
import ax.a1.x;
import ax.a1.y;

public interface z {
    public void A(int var1, long var2, long var4);

    public void b(B.a var1);

    public void c(int var1);

    public void e(boolean var1);

    public void f(Exception var1);

    public void g(B.a var1);

    public void l(ax.P0.v var1, c var2);

    public void n(String var1);

    public void o(String var1, long var2, long var4);

    public void u(b var1);

    public void w(b var1);

    public void x(long var1);

    public void y(Exception var1);

    public static final class a {
        private final Handler a;
        private final z b;

        public a(Handler object, z z8) {
            object = z8 != null ? ax.S0.a.e(object) : null;
            this.a = object;
            this.b = z8;
        }

        public static /* synthetic */ void a(a a8, boolean bl) {
            d0.i(a8.b).e(bl);
        }

        public static /* synthetic */ void b(a a8, int n8, long l8, long l9) {
            d0.i(a8.b).A(n8, l8, l9);
        }

        public static /* synthetic */ void c(a a8, b b8) {
            d0.i(a8.b).w(b8);
        }

        public static /* synthetic */ void d(a a8, b b8) {
            a8.getClass();
            b8.c();
            d0.i(a8.b).u(b8);
        }

        public static /* synthetic */ void e(a a8, long l8) {
            d0.i(a8.b).x(l8);
        }

        public static /* synthetic */ void f(a a8, B.a a9) {
            d0.i(a8.b).b(a9);
        }

        public static /* synthetic */ void g(a a8, Exception exception) {
            d0.i(a8.b).y(exception);
        }

        public static /* synthetic */ void h(a a8, ax.P0.v v8, c c8) {
            d0.i(a8.b).l(v8, c8);
        }

        public static /* synthetic */ void i(a a8, B.a a9) {
            d0.i(a8.b).g(a9);
        }

        public static /* synthetic */ void j(a a8, int n8) {
            d0.i(a8.b).c(n8);
        }

        public static /* synthetic */ void k(a a8, Exception exception) {
            d0.i(a8.b).f(exception);
        }

        public static /* synthetic */ void l(a a8, String string, long l8, long l9) {
            d0.i(a8.b).o(string, l8, l9);
        }

        public static /* synthetic */ void m(a a8, String string) {
            d0.i(a8.b).n(string);
        }

        public void n(Exception exception) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new m(this, exception));
            }
        }

        public void o(int n8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new p(this, n8));
            }
        }

        public void p(Exception exception) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new t(this, exception));
            }
        }

        public void q(B.a a8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new o(this, a8));
            }
        }

        public void r(B.a a8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new y(this, a8));
            }
        }

        public void s(String string, long l8, long l9) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new q(this, string, l8, l9));
            }
        }

        public void t(String string) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new r(this, string));
            }
        }

        public void u(b b8) {
            b8.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new v(this, b8));
            }
        }

        public void v(b b8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new s(this, b8));
            }
        }

        public void w(ax.P0.v v8, c c8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new u(this, v8, c8));
            }
        }

        public void x(long l8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new w(this, l8));
            }
        }

        public void y(boolean bl) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new n(this, bl));
            }
        }

        public void z(int n8, long l8, long l9) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new x(this, n8, l8, l9));
            }
        }
    }
}

