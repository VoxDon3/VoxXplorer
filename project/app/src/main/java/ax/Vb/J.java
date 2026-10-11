/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Fb.p;
import ax.Gb.l;
import ax.Qb.M0;
import ax.Vb.F;
import ax.Vb.N;
import ax.wb.i;

public final class J {
    public static final F a = new F("NO_THREAD_ELEMENTS");
    private static final p<Object, i.b, Object> b = ax.Vb.J$a.q;
    private static final p<M0<?>, i.b, M0<?>> c = ax.Vb.J$b.q;
    private static final p<N, i.b, N> d = ax.Vb.J$c.q;

    public static final void a(i i8, Object object) {
        if (object == a) {
            return;
        }
        if (object instanceof N) {
            ((N)object).b(i8);
            return;
        }
        M0<?> m02 = i8.v(null, c);
        l.d(m02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        m02.L(i8, object);
    }

    public static final Object b(i object) {
        object = object.v(0, b);
        l.c(object);
        return object;
    }

    public static final Object c(i i8, Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = J.b(i8);
        }
        if (object2 == Integer.valueOf(0)) {
            return a;
        }
        if (object2 instanceof Integer) {
            return i8.v(new N(i8, ((Number)object2).intValue()), d);
        }
        l.d(object2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((M0)object2).M0(i8);
    }
}

