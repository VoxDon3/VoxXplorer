package ax.r0;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class o0<T, B> {
    o0() {
    }

    abstract void a(B b, int i, int i2);

    abstract void b(B b, int i, long j);

    abstract void c(B b, int i, T t);

    abstract void d(B b, int i, AbstractC2921h abstractC2921h);

    abstract void e(B b, int i, long j);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t);

    abstract int i(T t);

    abstract void j(Object obj);

    abstract T k(T t, T t2);

    final void l(B b, g0 g0Var) throws IOException {
        while (g0Var.D() != Integer.MAX_VALUE && m(b, g0Var)) {
        }
    }

    final boolean m(B b, g0 g0Var) throws IOException {
        int l = g0Var.l();
        int a = u0.a(l);
        int b2 = u0.b(l);
        if (b2 == 0) {
            e(b, a, g0Var.N());
            return true;
        }
        if (b2 == 1) {
            b(b, a, g0Var.e());
            return true;
        }
        if (b2 == 2) {
            d(b, a, g0Var.G());
            return true;
        }
        if (b2 != 3) {
            if (b2 == 4) {
                return false;
            }
            if (b2 != 5) {
                throw C2905B.d();
            }
            a(b, a, g0Var.k());
            return true;
        }
        B n = n();
        int c = u0.c(a, 4);
        l(n, g0Var);
        if (c != g0Var.l()) {
            throw C2905B.a();
        }
        c(b, a, r(n));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b);

    abstract void p(Object obj, T t);

    abstract boolean q(g0 g0Var);

    abstract T r(B b);

    abstract void s(T t, v0 v0Var) throws IOException;

    abstract void t(T t, v0 v0Var) throws IOException;
}
