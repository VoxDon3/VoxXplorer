/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.Z;
import ax.Qb.a0;
import ax.Qb.l;
import ax.Qb.m;
import ax.Vb.j;
import ax.wb.e;

public final class o {
    public static final void a(l<?> l8, Z z8) {
        l8.r(new a0(z8));
    }

    public static final <T> m<T> b(e<? super T> e8) {
        if (!(e8 instanceof j)) {
            return new m<T>(e8, 1);
        }
        m m8 = ((j)e8).o();
        if (m8 != null) {
            if (!m8.M()) {
                m8 = null;
            }
            if (m8 != null) {
                return m8;
            }
        }
        return new m<T>(e8, 2);
    }
}

