/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.A;
import ax.Qb.l;
import ax.Qb.z;
import ax.sb.n;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;

public final class D {
    public static final <T> Object a(Object object, e<? super T> object2) {
        if (object instanceof z) {
            object2 = n.q;
            return n.a(o.a(((z)object).a));
        }
        return n.a(object);
    }

    public static final <T> Object b(Object object, ax.Fb.l<? super Throwable, t> l8) {
        Throwable throwable = n.b(object);
        if (throwable == null) {
            if (l8 != null) {
                return new A(object, l8);
            }
            return object;
        }
        return new z(throwable, false, 2, null);
    }

    public static final <T> Object c(Object object, l<?> object2) {
        object2 = n.b(object);
        if (object2 == null) {
            return object;
        }
        return new z((Throwable)object2, false, 2, null);
    }

    public static /* synthetic */ Object d(Object object, ax.Fb.l l8, int n8, Object object2) {
        if ((n8 & 1) != 0) {
            l8 = null;
        }
        return D.b(object, l8);
    }
}

