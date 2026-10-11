package ax.ke;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
abstract class F<T> {
    F() {
    }

    static <T> F<T> b(E e, Method method) {
        C b = C.b(e, method);
        Type genericReturnType = method.getGenericReturnType();
        if (I.j(genericReturnType)) {
            throw I.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return n.f(e, method, b);
        }
        throw I.m(method, "Service methods cannot return void.", new Object[0]);
    }

    abstract T a(Object[] objArr);
}
