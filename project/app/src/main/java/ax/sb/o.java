/*
 * Decompiled with CFR 0.152.
 */
package ax.sb;

import ax.Gb.l;
import ax.sb.n;

public final class o {
    public static final Object a(Throwable throwable) {
        l.f(throwable, "exception");
        return new n.b(throwable);
    }

    public static final void b(Object object) {
        if (!(object instanceof n.b)) {
            return;
        }
        throw ((n.b)object).q;
    }
}

