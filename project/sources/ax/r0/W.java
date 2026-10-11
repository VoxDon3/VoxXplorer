package ax.r0;

import ax.r0.C2907D;
import ax.r0.C2933u;
import ax.r0.u0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class W<T> implements h0<T> {
    private final S a;
    private final o0<?, ?> b;
    private final boolean c;
    private final AbstractC2930q<?> d;

    private W(o0<?, ?> o0Var, AbstractC2930q<?> abstractC2930q, S s) {
        this.b = o0Var;
        this.c = abstractC2930q.e(s);
        this.d = abstractC2930q;
        this.a = s;
    }

    private <UT, UB> int j(o0<UT, UB> o0Var, T t) {
        return o0Var.i(o0Var.g(t));
    }

    private <UT, UB, ET extends C2933u.b<ET>> void k(o0<UT, UB> o0Var, AbstractC2930q<ET> abstractC2930q, T t, g0 g0Var, C2929p c2929p) throws IOException {
        o0<UT, UB> o0Var2;
        UB f = o0Var.f(t);
        C2933u<ET> d = abstractC2930q.d(t);
        while (g0Var.D() != Integer.MAX_VALUE) {
            try {
                o0Var2 = o0Var;
                AbstractC2930q<ET> abstractC2930q2 = abstractC2930q;
                g0 g0Var2 = g0Var;
                C2929p c2929p2 = c2929p;
                try {
                    if (!m(g0Var2, c2929p2, abstractC2930q2, d, o0Var2, f)) {
                        o0Var2.o(t, f);
                        return;
                    }
                    g0Var = g0Var2;
                    c2929p = c2929p2;
                    abstractC2930q = abstractC2930q2;
                    o0Var = o0Var2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    o0Var2.o(t, f);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                o0Var2 = o0Var;
            }
        }
        o0Var.o(t, f);
    }

    static <T> W<T> l(o0<?, ?> o0Var, AbstractC2930q<?> abstractC2930q, S s) {
        return new W<>(o0Var, abstractC2930q, s);
    }

    private <UT, UB, ET extends C2933u.b<ET>> boolean m(g0 g0Var, C2929p c2929p, AbstractC2930q<ET> abstractC2930q, C2933u<ET> c2933u, o0<UT, UB> o0Var, UB ub) throws IOException {
        int l = g0Var.l();
        if (l != u0.a) {
            if (u0.b(l) != 2) {
                return g0Var.J();
            }
            Object b = abstractC2930q.b(c2929p, this.a, u0.a(l));
            if (b == null) {
                return o0Var.m(ub, g0Var);
            }
            abstractC2930q.h(g0Var, b, c2929p, c2933u);
            return true;
        }
        Object obj = null;
        AbstractC2921h abstractC2921h = null;
        int i = 0;
        while (g0Var.D() != Integer.MAX_VALUE) {
            int l2 = g0Var.l();
            if (l2 == u0.c) {
                i = g0Var.p();
                obj = abstractC2930q.b(c2929p, this.a, i);
            } else if (l2 == u0.d) {
                if (obj != null) {
                    abstractC2930q.h(g0Var, obj, c2929p, c2933u);
                } else {
                    abstractC2921h = g0Var.G();
                }
            } else if (!g0Var.J()) {
                break;
            }
        }
        if (g0Var.l() != u0.b) {
            throw C2905B.a();
        }
        if (abstractC2921h != null) {
            if (obj != null) {
                abstractC2930q.i(abstractC2921h, obj, c2929p, c2933u);
            } else {
                o0Var.d(ub, i, abstractC2921h);
            }
        }
        return true;
    }

    private <UT, UB> void n(o0<UT, UB> o0Var, T t, v0 v0Var) throws IOException {
        o0Var.s(o0Var.g(t), v0Var);
    }

    @Override // ax.r0.h0
    public void a(T t, T t2) {
        j0.G(this.b, t, t2);
        if (this.c) {
            j0.E(this.d, t, t2);
        }
    }

    @Override // ax.r0.h0
    public void b(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // ax.r0.h0
    public final boolean c(T t) {
        return this.d.c(t).p();
    }

    @Override // ax.r0.h0
    public void d(T t, v0 v0Var) throws IOException {
        Iterator<Map.Entry<?, Object>> s = this.d.c(t).s();
        while (s.hasNext()) {
            Map.Entry<?, Object> next = s.next();
            C2933u.b bVar = (C2933u.b) next.getKey();
            if (bVar.y() != u0.c.MESSAGE || bVar.k() || bVar.z()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof C2907D.b) {
                v0Var.c(bVar.g(), ((C2907D.b) next).a().e());
            } else {
                v0Var.c(bVar.g(), next.getValue());
            }
        }
        n(this.b, t, v0Var);
    }

    @Override // ax.r0.h0
    public boolean e(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    @Override // ax.r0.h0
    public int f(T t) {
        int j = j(this.b, t);
        return this.c ? j + this.d.c(t).j() : j;
    }

    @Override // ax.r0.h0
    public T g() {
        return (T) this.a.j().u0();
    }

    @Override // ax.r0.h0
    public void h(T t, g0 g0Var, C2929p c2929p) throws IOException {
        k(this.b, this.d, t, g0Var, c2929p);
    }

    @Override // ax.r0.h0
    public int i(T t) {
        int hashCode = this.b.g(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.c(t).hashCode() : hashCode;
    }
}
