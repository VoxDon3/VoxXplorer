package ax.r0;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class d0 {
    private static final d0 c = new d0();
    private final ConcurrentMap<Class<?>, h0<?>> b = new ConcurrentHashMap();
    private final i0 a = new C2913J();

    private d0() {
    }

    public static d0 a() {
        return c;
    }

    public <T> void b(T t, g0 g0Var, C2929p c2929p) throws IOException {
        e(t).h(t, g0Var, c2929p);
    }

    public h0<?> c(Class<?> cls, h0<?> h0Var) {
        C2904A.b(cls, "messageType");
        C2904A.b(h0Var, "schema");
        return this.b.putIfAbsent(cls, h0Var);
    }

    public <T> h0<T> d(Class<T> cls) {
        C2904A.b(cls, "messageType");
        h0<T> h0Var = (h0) this.b.get(cls);
        if (h0Var == null) {
            h0Var = this.a.a(cls);
            h0<T> h0Var2 = (h0<T>) c(cls, h0Var);
            if (h0Var2 != null) {
                return h0Var2;
            }
        }
        return h0Var;
    }

    public <T> h0<T> e(T t) {
        return d(t.getClass());
    }
}
