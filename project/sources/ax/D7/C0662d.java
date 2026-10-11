package ax.D7;

import ax.a8.InterfaceC1430a;
import java.util.Set;

/* renamed from: ax.D7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0662d {
    public static Object a(InterfaceC0663e interfaceC0663e, F f) {
        ax.a8.b g = interfaceC0663e.g(f);
        if (g == null) {
            return null;
        }
        return g.get();
    }

    public static Object b(InterfaceC0663e interfaceC0663e, Class cls) {
        return interfaceC0663e.c(F.b(cls));
    }

    public static InterfaceC1430a c(InterfaceC0663e interfaceC0663e, Class cls) {
        return interfaceC0663e.h(F.b(cls));
    }

    public static ax.a8.b d(InterfaceC0663e interfaceC0663e, Class cls) {
        return interfaceC0663e.g(F.b(cls));
    }

    public static Set e(InterfaceC0663e interfaceC0663e, F f) {
        return (Set) interfaceC0663e.b(f).get();
    }

    public static Set f(InterfaceC0663e interfaceC0663e, Class cls) {
        return interfaceC0663e.e(F.b(cls));
    }
}
