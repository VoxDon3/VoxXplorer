/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A3;
import ax.b6.g;
import ax.b6.h;
import ax.b6.k;
import ax.b6.r;
import ax.b6.r2;
import ax.b6.s;
import ax.b6.u;
import ax.b6.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class Z3 {
    public static s a(r2 object) {
        if (object == null) {
            return s.f;
        }
        int n8 = A3.a[((r2)object).J().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        if (n8 != 5) {
                            String string = String.valueOf(object);
                            object = new StringBuilder("Invalid entity: ");
                            ((StringBuilder)object).append(string);
                            throw new IllegalStateException(((StringBuilder)object).toString());
                        }
                        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                    }
                    Object object2 = ((r2)object).N();
                    ArrayList<s> arrayList = new ArrayList<s>();
                    object2 = object2.iterator();
                    while (object2.hasNext()) {
                        arrayList.add(Z3.a((r2)object2.next()));
                    }
                    return new v(((r2)object).L(), arrayList);
                }
                if (((r2)object).P()) {
                    return new h(((r2)object).O());
                }
                return new h(null);
            }
            if (((r2)object).Q()) {
                return new k(((r2)object).I());
            }
            return new k(null);
        }
        if (((r2)object).R()) {
            return new u(((r2)object).M());
        }
        return s.m;
    }

    public static s b(Object object) {
        if (object == null) {
            return s.g;
        }
        if (object instanceof String) {
            return new u((String)object);
        }
        if (object instanceof Double) {
            return new k((Double)object);
        }
        if (object instanceof Long) {
            return new k(((Long)object).doubleValue());
        }
        if (object instanceof Integer) {
            return new k(((Integer)object).doubleValue());
        }
        if (object instanceof Boolean) {
            return new h((Boolean)object);
        }
        if (object instanceof Map) {
            r r8 = new r();
            Map map = (Map)object;
            for (Object k8 : map.keySet()) {
                s s8 = Z3.b(map.get(k8));
                if (k8 == null) continue;
                object = k8;
                if (!(k8 instanceof String)) {
                    object = k8.toString();
                }
                r8.n((String)object, s8);
            }
            return r8;
        }
        if (object instanceof List) {
            g g8 = new g();
            object = ((List)object).iterator();
            while (object.hasNext()) {
                g8.s(Z3.b(object.next()));
            }
            return g8;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}

