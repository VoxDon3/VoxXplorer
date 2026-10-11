/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import android.view.Surface;
import ax.P0.a0;
import ax.P0.v;
import ax.S0.I;
import ax.o1.Q;
import ax.o1.z;
import java.util.List;
import java.util.concurrent.Executor;

public interface S {
    public void A();

    public boolean b();

    public boolean c();

    public void d();

    public void g(float var1);

    public void h();

    public void i(long var1, long var3) throws c;

    public Surface j();

    public boolean k(long var1, b var3);

    public void l();

    public void m(a var1, Executor var2);

    public void n();

    public void o(long var1);

    public void p(z var1);

    public void q();

    public void r(int var1, v var2, long var3, int var5, List<Object> var6);

    public void s(int var1);

    public void t(Surface var1, I var2);

    public void u();

    public void v(boolean var1);

    public void w(List<Object> var1);

    public void x(boolean var1);

    public boolean y(boolean var1);

    public boolean z(v var1) throws c;

    public static interface a {
        public static final a a = new a(){

            @Override
            public /* synthetic */ void a(a0 a02) {
                Q.d(this, a02);
            }

            @Override
            public /* synthetic */ void b() {
                Q.b(this);
            }

            @Override
            public /* synthetic */ void e() {
                Q.a(this);
            }

            @Override
            public /* synthetic */ void f() {
                Q.c(this);
            }
        };

        public void a(a0 var1);

        public void b();

        public void e();

        public void f();
    }

    public static interface b {
        public void a(long var1);

        public void b();
    }

    public static final class c
    extends Exception {
        public final v q;

        public c(Throwable throwable, v v8) {
            super(throwable);
            this.q = v8;
        }
    }
}

