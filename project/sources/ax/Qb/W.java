package ax.Qb;

import ax.Vb.C1003j;
import ax.sb.C3082n;
import ax.sb.C3083o;

/* loaded from: classes3.dex */
public final class W {
    public static final <T> void a(V<? super T> v, int i) {
        ax.wb.e<? super T> e = v.e();
        boolean z = i == 4;
        if (z || !(e instanceof C1003j) || b(i) != b(v.d0)) {
            d(v, e, z);
            return;
        }
        G g = ((C1003j) e).e0;
        ax.wb.i b = e.b();
        if (g.f(b)) {
            g.b(b, v);
        } else {
            e(v);
        }
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean c(int i) {
        return i == 2;
    }

    public static final <T> void d(V<? super T> v, ax.wb.e<? super T> eVar, boolean z) {
        Object h;
        Object j = v.j();
        Throwable g = v.g(j);
        if (g != null) {
            C3082n.a aVar = C3082n.q;
            h = C3083o.a(g);
        } else {
            C3082n.a aVar2 = C3082n.q;
            h = v.h(j);
        }
        Object a = C3082n.a(h);
        if (!z) {
            eVar.f(a);
            return;
        }
        ax.Gb.l.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C1003j c1003j = (C1003j) eVar;
        ax.wb.e<T> eVar2 = c1003j.f0;
        Object obj = c1003j.h0;
        ax.wb.i b = eVar2.b();
        Object c = ax.Vb.J.c(b, obj);
        P0<?> g2 = c != ax.Vb.J.a ? F.g(eVar2, b, c) : null;
        try {
            c1003j.f0.f(a);
            ax.sb.t tVar = ax.sb.t.a;
            if (g2 == null || g2.O0()) {
                ax.Vb.J.a(b, c);
            }
        } catch (Throwable th) {
            if (g2 == null || g2.O0()) {
                ax.Vb.J.a(b, c);
            }
            throw th;
        }
    }

    private static final void e(V<?> v) {
        AbstractC0928c0 b = N0.a.b();
        if (b.g1()) {
            b.c1(v);
            return;
        }
        b.e1(true);
        try {
            d(v, v.e(), true);
            do {
            } while (b.j1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
