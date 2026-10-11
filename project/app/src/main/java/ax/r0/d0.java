/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.J;
import ax.r0.g0;
import ax.r0.h0;
import ax.r0.i0;
import ax.r0.p;
import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

final class d0 {
    private static final d0 c = new d0();
    private final i0 a;
    private final ConcurrentMap<Class<?>, h0<?>> b = new j.ConcurrentHashMap();

    private d0() {
        this.a = new J();
    }

    public static d0 a() {
        return c;
    }

    public <T> void b(T t8, g0 g02, p p8) throws IOException {
        this.e(t8).h(t8, g02, p8);
    }

    public h0<?> c(Class<?> clazz, h0<?> h02) {
        A.b(clazz, "messageType");
        A.b(h02, "schema");
        return this.b.putIfAbsent(clazz, h02);
    }

    public <T> h0<T> d(Class<T> object) {
        h0<T> h02;
        A.b(object, "messageType");
        h0<T> h03 = h02 = (h0<T>)this.b.get(object);
        if (h02 == null && (object = this.c((Class<?>)object, h03 = this.a.a(object))) != null) {
            return object;
        }
        return h03;
    }

    public <T> h0<T> e(T t8) {
        return this.d(t8.getClass());
    }
}

