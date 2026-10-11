/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A5;
import ax.b6.C6;
import ax.b6.Z2;
import ax.b6.n;
import ax.b6.s;
import ax.b6.u;
import ax.b6.y2;
import java.util.List;

final class d7
extends n {
    private final C6 d0;

    d7(A5 a52, String string, C6 c62) {
        this.d0 = c62;
        super(string);
    }

    @Override
    public final s a(Z2 object, List<s> object2) {
        y2.g("getValue", 2, object2);
        s s8 = ((Z2)object).b(object2.get(0));
        object = ((Z2)object).b(object2.get(1));
        object2 = s8.g();
        object2 = this.d0.h((String)object2);
        if (object2 != null) {
            object = new u((String)object2);
        }
        return object;
    }
}

