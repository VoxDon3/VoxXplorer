/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.O0;
import ax.W5.b1;
import ax.W5.v1;
import ax.W5.w1;
import java.util.concurrent.ConcurrentMap;

final class s1 {
    private static final s1 c = new s1();
    private final w1 a;
    private final ConcurrentMap b = new j.ConcurrentHashMap();

    private s1() {
        this.a = new b1();
    }

    public static s1 a() {
        return c;
    }

    public final v1 b(Class object) {
        O0.c(object, "messageType");
        v1 v12 = (v1)this.b.get(object);
        if (v12 == null) {
            v12 = this.a.a((Class)object);
            O0.c(object, "messageType");
            object = this.b.putIfAbsent(object, v12);
            if (object == null) {
                return v12;
            }
            return object;
        }
        return v12;
    }
}

