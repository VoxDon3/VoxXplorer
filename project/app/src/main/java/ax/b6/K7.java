/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.a5;
import ax.b6.n;
import ax.b6.s;
import ax.b6.y2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class K7
extends n {
    private final a5 d0;
    private final Map<String, n> e0 = new HashMap<String, n>();

    public K7(a5 a52) {
        super("require");
        this.d0 = a52;
    }

    @Override
    public final s a(Z2 object, List<s> object2) {
        y2.g("require", 1, object2);
        object2 = ((Z2)object).b(object2.get(0)).g();
        if (this.e0.containsKey(object2)) {
            return this.e0.get(object2);
        }
        object = this.d0.a((String)object2);
        if (object instanceof n) {
            this.e0.put((String)object2, (n)object);
        }
        return object;
    }
}

