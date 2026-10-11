/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.s0;
import ax.Qb.u;
import ax.Qb.v;
import ax.sb.n;

public final class w {
    public static final <T> u<T> a(s0 s02) {
        return new v(s02);
    }

    public static /* synthetic */ u b(s0 s02, int n8, Object object) {
        if ((n8 & 1) != 0) {
            s02 = null;
        }
        return w.a(s02);
    }

    public static final <T> boolean c(u<T> u8, Object object) {
        Throwable throwable = n.b(object);
        if (throwable == null) {
            return u8.u0(object);
        }
        return u8.o0(throwable);
    }
}

