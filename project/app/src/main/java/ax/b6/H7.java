/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.b;
import ax.b6.n;
import ax.b6.r;
import ax.b6.s;
import ax.b6.t;
import ax.b6.y2;
import java.util.List;

public final class H7
extends n {
    private b d0;

    public H7(b b8) {
        super("internal.registerCallback");
        this.d0 = b8;
    }

    @Override
    public final s a(Z2 object, List<s> object2) {
        y2.g(this.q, 3, object2);
        String string = ((Z2)object).b(object2.get(0)).g();
        s s8 = ((Z2)object).b(object2.get(1));
        if (s8 instanceof t) {
            if ((object = ((Z2)object).b(object2.get(2))) instanceof r) {
                object2 = (r)object;
                if (((r)object2).l("type")) {
                    object = ((r)object2).h("type").g();
                    int n8 = ((r)object2).l("priority") ? y2.i(((r)object2).h("priority").f()) : 1000;
                    this.d0.c(string, n8, (t)s8, (String)object);
                    return s.f;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}

