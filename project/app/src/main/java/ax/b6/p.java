/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.m;
import ax.b6.n;
import ax.b6.o;
import ax.b6.s;
import ax.b6.y2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class p {
    public static s a(m object, s s8, Z2 z22, List<s> list) {
        if (object.l(s8.g())) {
            if ((object = object.h(s8.g())) instanceof n) {
                return ((n)object).a(z22, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", s8.g()));
        }
        if ("hasOwnProperty".equals(s8.g())) {
            y2.g("hasOwnProperty", 1, list);
            if (object.l(z22.b(list.get(0)).g())) {
                return s.k;
            }
            return s.l;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", s8.g()));
    }

    public static Iterator<s> b(Map<String, s> map) {
        return new o(map.keySet().iterator());
    }
}

