package ax.o1;

import android.view.Surface;
import ax.P0.C0912v;
import ax.P0.a0;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface S {

    public interface a {
        public static final a a = new C0391a();

        /* renamed from: ax.o1.S$a$a, reason: collision with other inner class name */
        class C0391a implements a {
            C0391a() {
            }

            @Override // ax.o1.S.a
            public /* synthetic */ void a(a0 a0Var) {
                Q.d(this, a0Var);
            }

            @Override // ax.o1.S.a
            public /* synthetic */ void b() {
                Q.b(this);
            }

            @Override // ax.o1.S.a
            public /* synthetic */ void e() {
                Q.a(this);
            }

            @Override // ax.o1.S.a
            public /* synthetic */ void f() {
                Q.c(this);
            }
        }

        void a(a0 a0Var);

        void b();

        void e();

        void f();
    }

    public interface b {
        void a(long j);

        void b();
    }

    public static final class c extends Exception {
        public final C0912v q;

        public c(Throwable th, C0912v c0912v) {
            super(th);
            this.q = c0912v;
        }
    }

    void A();

    boolean b();

    boolean c();

    void d();

    void g(float f);

    void h();

    void i(long j, long j2) throws c;

    Surface j();

    boolean k(long j, b bVar);

    void l();

    void m(a aVar, Executor executor);

    void n();

    void o(long j);

    void p(z zVar);

    void q();

    void r(int i, C0912v c0912v, long j, int i2, List<Object> list);

    void s(int i);

    void t(Surface surface, ax.S0.I i);

    void u();

    void v(boolean z);

    void w(List<Object> list);

    void x(boolean z);

    boolean y(boolean z);

    boolean z(C0912v c0912v) throws c;
}
