package ax.b6;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: ax.b6.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1582i5 {
    private static final C1582i5 c = new C1582i5();
    private final ConcurrentMap<Class<?>, InterfaceC1609l5<?>> b = new ConcurrentHashMap();
    private final InterfaceC1600k5 a = new I4();

    private C1582i5() {
    }

    public static C1582i5 a() {
        return c;
    }

    public final <T> InterfaceC1609l5<T> b(Class<T> cls) {
        C1616m4.f(cls, "messageType");
        InterfaceC1609l5<T> interfaceC1609l5 = (InterfaceC1609l5) this.b.get(cls);
        if (interfaceC1609l5 == null) {
            interfaceC1609l5 = this.a.a(cls);
            C1616m4.f(cls, "messageType");
            C1616m4.f(interfaceC1609l5, "schema");
            InterfaceC1609l5<T> interfaceC1609l52 = (InterfaceC1609l5) this.b.putIfAbsent(cls, interfaceC1609l5);
            if (interfaceC1609l52 != null) {
                return interfaceC1609l52;
            }
        }
        return interfaceC1609l5;
    }

    public final <T> InterfaceC1609l5<T> c(T t) {
        return b(t.getClass());
    }
}
