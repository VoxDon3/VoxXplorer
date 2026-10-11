package ax.W5;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: ax.W5.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1067s1 {
    private static final C1067s1 c = new C1067s1();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final InterfaceC1079w1 a = new C1017b1();

    private C1067s1() {
    }

    public static C1067s1 a() {
        return c;
    }

    public final InterfaceC1076v1 b(Class cls) {
        O0.c(cls, "messageType");
        InterfaceC1076v1 interfaceC1076v1 = (InterfaceC1076v1) this.b.get(cls);
        if (interfaceC1076v1 != null) {
            return interfaceC1076v1;
        }
        InterfaceC1076v1 a = this.a.a(cls);
        O0.c(cls, "messageType");
        InterfaceC1076v1 interfaceC1076v12 = (InterfaceC1076v1) this.b.putIfAbsent(cls, a);
        return interfaceC1076v12 == null ? a : interfaceC1076v12;
    }
}
