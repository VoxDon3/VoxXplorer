/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.I4;
import ax.b6.k5;
import ax.b6.l5;
import ax.b6.m4;
import java.util.concurrent.ConcurrentMap;

final class i5 {
    private static final i5 c = new i5();
    private final k5 a;
    private final ConcurrentMap<Class<?>, l5<?>> b = new j.ConcurrentHashMap();

    private i5() {
        this.a = new I4();
    }

    public static i5 a() {
        return c;
    }

    public final <T> l5<T> b(Class<T> object) {
        l5<T> l52;
        m4.f(object, "messageType");
        l5<T> l53 = l52 = (l5<T>)this.b.get(object);
        if (l52 == null) {
            l53 = this.a.a(object);
            m4.f(object, "messageType");
            m4.f(l53, "schema");
            object = this.b.putIfAbsent((Class<?>)object, l53);
            if (object != null) {
                return object;
            }
        }
        return l53;
    }

    public final <T> l5<T> c(T t8) {
        return this.b(t8.getClass());
    }
}

