package ax.r0;

import ax.r0.C2933u;
import ax.r0.C2933u.b;
import java.io.IOException;
import java.util.Map;

/* renamed from: ax.r0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2930q<T extends C2933u.b<T>> {
    AbstractC2930q() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(C2929p c2929p, S s, int i);

    abstract C2933u<T> c(Object obj);

    abstract C2933u<T> d(Object obj);

    abstract boolean e(S s);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(g0 g0Var, Object obj, C2929p c2929p, C2933u<T> c2933u, UB ub, o0<UT, UB> o0Var) throws IOException;

    abstract void h(g0 g0Var, Object obj, C2929p c2929p, C2933u<T> c2933u) throws IOException;

    abstract void i(AbstractC2921h abstractC2921h, Object obj, C2929p c2929p, C2933u<T> c2933u) throws IOException;

    abstract void j(v0 v0Var, Map.Entry<?, ?> entry) throws IOException;
}
