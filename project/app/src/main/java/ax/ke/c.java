/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.E;
import ax.ke.I;
import ax.ke.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface c<R, T> {
    public T a(b<R> var1);

    public Type b();

    public static abstract class a {
        protected static Type b(int n8, ParameterizedType parameterizedType) {
            return I.g(n8, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return I.h(type);
        }

        public abstract c<?, ?> a(Type var1, Annotation[] var2, E var3);
    }
}

