/*
 * Decompiled with CFR 0.152.
 */
package ax.Ab;

import ax.Gb.l;
import ax.Jb.b;
import ax.Jb.c;
import ax.tb.i;
import java.lang.reflect.Method;

public class a {
    public void a(Throwable throwable, Throwable throwable2) {
        l.f(throwable, "cause");
        l.f(throwable2, "exception");
        Method method = a.b;
        if (method != null) {
            method.invoke(throwable, throwable2);
        }
    }

    public c b() {
        return new b();
    }

    private static final class a {
        public static final a a;
        public static final Method b;
        public static final Method c;

        static {
            Method method;
            Object var4_5;
            int n8;
            int n9;
            int n10;
            Method[] methodArray;
            block4: {
                a = new a();
                methodArray = Throwable.class.getMethods();
                l.c(methodArray);
                n10 = methodArray.length;
                n9 = 0;
                n8 = 0;
                while (true) {
                    var4_5 = null;
                    if (n8 >= n10) break;
                    method = methodArray[n8];
                    if (l.a(method.getName(), "addSuppressed")) {
                        Class<?>[] classArray = method.getParameterTypes();
                        l.e(classArray, "getParameterTypes(...)");
                        if (l.a(i.C(classArray), Throwable.class)) break block4;
                    }
                    ++n8;
                }
                method = null;
            }
            b = method;
            n10 = methodArray.length;
            n8 = n9;
            while (true) {
                method = var4_5;
                if (n8 >= n10 || l.a((method = methodArray[n8]).getName(), "getSuppressed")) break;
                ++n8;
            }
            c = method;
        }

        private a() {
        }
    }
}

