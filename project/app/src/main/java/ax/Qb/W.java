/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.l;
import ax.Qb.F;
import ax.Qb.G;
import ax.Qb.N0;
import ax.Qb.P0;
import ax.Qb.V;
import ax.Qb.c0;
import ax.Vb.J;
import ax.Vb.j;
import ax.sb.n;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.wb.i;

public final class W {
    public static final <T> void a(V<? super T> v8, int n8) {
        Object object = v8.e();
        boolean bl = n8 == 4;
        if (!bl && object instanceof j && W.b(n8) == W.b(v8.d0)) {
            G g8 = ((j)object).e0;
            if (g8.f((i)(object = object.b()))) {
                g8.b((i)object, v8);
                return;
            }
            W.e(v8);
            return;
        }
        W.d(v8, object, bl);
    }

    public static final boolean b(int n8) {
        return n8 == 1 || n8 == 2;
        {
        }
    }

    public static final boolean c(int n8) {
        return n8 == 2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final <T> void d(V<? super T> e8, e<? super T> object, boolean bl) {
        Object object2 = ((V)((Object)e8)).j();
        Object object3 = ((V)((Object)e8)).g(object2);
        if (object3 != null) {
            e8 = n.q;
            e8 = o.a((Throwable)object3);
        } else {
            object3 = n.q;
            e8 = ((V)((Object)e8)).h(object2);
        }
        object2 = n.a(e8);
        if (!bl) {
            object.f(object2);
            return;
        }
        l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        j j8 = (j)object;
        e8 = j8.f0;
        object3 = j8.h0;
        object = e8.b();
        object3 = J.c((i)object, object3);
        e8 = object3 != J.a ? F.g(e8, (i)object, object3) : null;
        try {
            j8.f0.f(object2);
            object2 = t.a;
            if (e8 != null && !((P0)e8).O0()) {
                return;
            }
        }
        catch (Throwable throwable) {
            if (e8 == null || ((P0)e8).O0()) {
                J.a((i)object, object3);
            }
            throw throwable;
        }
        J.a((i)object, object3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void e(V<?> v8) {
        c0 c02 = N0.a.b();
        if (c02.g1()) {
            c02.c1(v8);
            return;
        }
        c02.e1(true);
        try {
            boolean bl;
            W.d(v8, v8.e(), true);
            while (bl = c02.j1()) {
            }
            return;
        }
        catch (Throwable throwable) {
            try {
                v8.i(throwable, null);
                return;
            }
            finally {
                c02.Z0(true);
            }
        }
    }
}

