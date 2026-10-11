/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Vb.j;
import ax.sb.n;
import ax.sb.o;
import ax.wb.e;

public final class N {
    public static final String a(Object object) {
        return object.getClass().getSimpleName();
    }

    public static final String b(Object object) {
        return Integer.toHexString(System.identityHashCode(object));
    }

    public static final String c(e<?> e8) {
        Object object;
        if (e8 instanceof j) {
            return e8.toString();
        }
        try {
            object = n.q;
            object = new StringBuilder();
            ((StringBuilder)object).append(e8);
            ((StringBuilder)object).append('@');
            ((StringBuilder)object).append(N.b(e8));
            object = n.a(((StringBuilder)object).toString());
        }
        catch (Throwable throwable) {
            n.a a8 = n.q;
            object = n.a(o.a(throwable));
        }
        if (n.b(object) != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(e8.getClass().getName());
            ((StringBuilder)object).append('@');
            ((StringBuilder)object).append(N.b(e8));
            object = ((StringBuilder)object).toString();
        }
        return (String)object;
    }
}

