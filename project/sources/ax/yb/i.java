package ax.yb;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class i {
    public static final i a = new i();
    private static final a b = new a(null, null, null);
    private static a c;

    private static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    private i() {
    }

    private final a a(AbstractC3520a abstractC3520a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", null), abstractC3520a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC3520a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = b;
            c = aVar2;
            return aVar2;
        }
    }

    public final String b(AbstractC3520a abstractC3520a) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        ax.Gb.l.f(abstractC3520a, "continuation");
        a aVar = c;
        if (aVar == null) {
            aVar = a(abstractC3520a);
        }
        if (aVar != b && (method = aVar.a) != null && (invoke = method.invoke(abstractC3520a.getClass(), null)) != null && (method2 = aVar.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = aVar.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                return (String) invoke3;
            }
        }
        return null;
    }
}
