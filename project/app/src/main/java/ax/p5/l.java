/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import android.annotation.SuppressLint;
import ax.n5.e;
import ax.n5.h;
import ax.p5.p;
import ax.p5.s;
import ax.p5.u;
import ax.t5.a;

public final class l {
    @SuppressLint(value={"DiscouragedApi"})
    public static void a(h<?> object, e e8) {
        if (object instanceof s) {
            object = ((s)object).d().f(e8);
            u.c().e().l((p)object, 1);
            return;
        }
        a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", object);
    }
}

