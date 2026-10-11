package ax.Ab;

import ax.Gb.l;
import ax.tb.C3133i;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: ax.Ab.a$a, reason: collision with other inner class name */
    private static final class C0051a {
        public static final C0051a a = new C0051a();
        public static final Method b;
        public static final Method c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            l.c(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (l.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    l.e(parameterTypes, "getParameterTypes(...)");
                    if (l.a(C3133i.C(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (l.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            c = method;
        }

        private C0051a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        l.f(th, "cause");
        l.f(th2, "exception");
        Method method = C0051a.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public ax.Jb.c b() {
        return new ax.Jb.b();
    }
}
