/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import ax.C2.v;
import ax.Gb.l;
import ax.K2.m;
import ax.K2.y;
import ax.tb.o;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class w {
    private final Object a = new Object();
    private final Map<m, v> b = new LinkedHashMap<m, v>();

    public final boolean a(m m8) {
        l.f(m8, "id");
        Object object = this.a;
        synchronized (object) {
            boolean bl = this.b.containsKey(m8);
            return bl;
        }
    }

    public final v b(m object) {
        l.f(object, "id");
        Object object2 = this.a;
        synchronized (object2) {
            object = this.b.remove(object);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<v> c(String list) {
        l.f(list, "workSpecId");
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                LinkedHashMap linkedHashMap;
                Map.Entry<m, v> entry2;
                try {
                    entry2 = this.b;
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<m, v> entry2 : entry2.entrySet()) {
                        if (!l.a(((m)entry2.getKey()).b(), list)) continue;
                        ((AbstractMap)linkedHashMap).put(entry2.getKey(), entry2.getValue());
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                list = linkedHashMap.keySet().iterator();
                while (true) {
                    if (!list.hasNext()) {
                        return o.V(linkedHashMap.values());
                    }
                    entry2 = (m)list.next();
                    this.b.remove(entry2);
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final v d(m object) {
        l.f(object, "id");
        Object object2 = this.a;
        synchronized (object2) {
            try {
                v v8;
                Map<m, v> map = this.b;
                v v9 = v8 = map.get(object);
                if (v8 != null) return v9;
                v9 = new v((m)object);
                map.put((m)object, v9);
                return v9;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final v e(ax.K2.v v8) {
        l.f(v8, "spec");
        return this.d(y.a(v8));
    }
}

