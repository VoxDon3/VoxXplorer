/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.C;
import ax.ke.E;
import ax.ke.I;
import ax.ke.n;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

abstract class F<T> {
    F() {
    }

    static <T> F<T> b(E e8, Method method) {
        C c8 = C.b(e8, method);
        Type type = method.getGenericReturnType();
        if (!I.j(type)) {
            if (type != Void.TYPE) {
                return n.f(e8, method, c8);
            }
            throw I.m(method, "Service methods cannot return void.", new Object[0]);
        }
        throw I.m(method, "Method return type must not include a type variable or wildcard: %s", type);
    }

    abstract T a(Object[] var1);
}

