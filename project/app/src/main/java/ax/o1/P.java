/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import android.os.Handler;
import android.os.SystemClock;
import ax.P0.a0;
import ax.P0.v;
import ax.S0.d0;
import ax.Y0.b;
import ax.Y0.c;
import ax.o1.F;
import ax.o1.G;
import ax.o1.H;
import ax.o1.I;
import ax.o1.J;
import ax.o1.K;
import ax.o1.L;
import ax.o1.M;
import ax.o1.N;
import ax.o1.O;

public interface P {
    public void B(b var1);

    public void C(long var1, int var3);

    public void a(a0 var1);

    public void h(v var1, c var2);

    public void i(String var1);

    public void k(String var1, long var2, long var4);

    public void m(b var1);

    public void p(int var1, long var2);

    public void q(Object var1, long var2);

    public void z(Exception var1);

    public static final class a {
        private final Handler a;
        private final P b;

        public a(Handler object, P p8) {
            object = p8 != null ? ax.S0.a.e(object) : null;
            this.a = object;
            this.b = p8;
        }

        public static /* synthetic */ void a(a a8, String string, long l8, long l9) {
            d0.i(a8.b).k(string, l8, l9);
        }

        public static /* synthetic */ void b(a a8, Exception exception) {
            d0.i(a8.b).z(exception);
        }

        public static /* synthetic */ void c(a a8, int n8, long l8) {
            d0.i(a8.b).p(n8, l8);
        }

        public static /* synthetic */ void d(a a8, b b8) {
            a8.getClass();
            b8.c();
            d0.i(a8.b).m(b8);
        }

        public static /* synthetic */ void e(a a8, b b8) {
            d0.i(a8.b).B(b8);
        }

        public static /* synthetic */ void f(a a8, a0 a02) {
            d0.i(a8.b).a(a02);
        }

        public static /* synthetic */ void g(a a8, long l8, int n8) {
            d0.i(a8.b).C(l8, n8);
        }

        public static /* synthetic */ void h(a a8, v v8, c c8) {
            d0.i(a8.b).h(v8, c8);
        }

        public static /* synthetic */ void i(a a8, String string) {
            d0.i(a8.b).i(string);
        }

        public static /* synthetic */ void j(a a8, Object object, long l8) {
            d0.i(a8.b).q(object, l8);
        }

        public void k(String string, long l8, long l9) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new F(this, string, l8, l9));
            }
        }

        public void l(String string) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new J(this, string));
            }
        }

        public void m(b b8) {
            b8.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new O(this, b8));
            }
        }

        public void n(int n8, long l8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new K(this, n8, l8));
            }
        }

        public void o(b b8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new M(this, b8));
            }
        }

        public void p(v v8, c c8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new N(this, v8, c8));
            }
        }

        public void q(Object object) {
            if (this.a != null) {
                long l8 = SystemClock.elapsedRealtime();
                this.a.post((Runnable)new H(this, object, l8));
            }
        }

        public void r(long l8, int n8) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new L(this, l8, n8));
            }
        }

        public void s(Exception exception) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new I(this, exception));
            }
        }

        public void t(a0 a02) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post((Runnable)new G(this, a02));
            }
        }
    }
}

