/*
 * Decompiled with CFR 0.152.
 */
package ax.jc;

import ax.jc.a;
import ax.jc.b;
import ax.jc.c;
import ax.jc.d;
import ax.jc.g;
import ax.jc.h;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class i {
    private static final ax.gc.b<Method> b = new ax.gc.b<Method>(){

        public boolean a(Method method) {
            return ax.gc.d.c(method, c.class) != null;
        }
    };
    private final Map<Class<? extends d>, d> a = new HashMap<Class<? extends d>, d>();

    private d[] a(c object) {
        if (object.filters().length == 0) {
            return null;
        }
        d[] dArray = new d[object.filters().length];
        b[] bArray = object.filters();
        int n8 = bArray.length;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            b b8 = bArray[i8];
            d d8 = this.a.get(b8.value());
            object = d8;
            if (d8 == null) {
                try {
                    object = b8.value().newInstance();
                    this.a.put(b8.value(), (d)object);
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
            }
            dArray[n9] = object;
            ++n9;
        }
        return dArray;
    }

    private boolean c(Method method) {
        if (method != null && ax.gc.d.c(method, c.class) != null) {
            if (method.getParameterTypes().length != 1) {
                PrintStream printStream = System.out;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found no or more than one parameter in messageHandler [");
                stringBuilder.append(method.getName());
                stringBuilder.append("]. A messageHandler must define exactly one parameter");
                printStream.println(stringBuilder.toString());
                return false;
            }
            a a8 = ax.gc.d.c(method, a.class);
            if (a8 != null && !ax.kc.d.class.isAssignableFrom(method.getParameterTypes()[0])) {
                System.out.println("Message envelope configured but no subclass of MessageEnvelope found as parameter");
                return false;
            }
            if (a8 != null && a8.messages().length == 0) {
                System.out.println("Message envelope configured but message types defined for handler");
                return false;
            }
            return true;
        }
        return false;
    }

    public h b(Class clazz) {
        h h8 = new h(clazz);
        Method[] methodArray = ax.gc.d.f(b, clazz);
        int n8 = methodArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            c c8;
            Method method = methodArray[i8];
            if (ax.gc.d.b(methodArray, method) || !(c8 = ax.gc.d.c(method, c.class)).enabled() || !this.c(method)) continue;
            Method method2 = ax.gc.d.g(method, clazz);
            if (method2 != null) {
                method = method2;
            }
            h8.a(new g(g.a.a(method, c8, this.a(c8), h8)));
        }
        return h8;
    }
}

