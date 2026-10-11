/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.D0;
import ax.Qb.O;
import ax.Qb.T;
import ax.Qb.Y;
import ax.Vb.G;
import ax.Vb.v;

public final class P {
    private static final boolean a = G.f("kotlinx.coroutines.main.delay", false);
    private static final T b = P.b();

    public static final T a() {
        return b;
    }

    private static final T b() {
        if (!a) {
            return O.j0;
        }
        D0 d02 = Y.c();
        if (!v.c(d02) && d02 instanceof T) {
            return (T)((Object)d02);
        }
        return O.j0;
    }
}

