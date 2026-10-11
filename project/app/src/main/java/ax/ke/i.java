/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.ke.E;
import ax.ke.I;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

public interface i<F, T> {
    public T a(F var1) throws IOException;

    public static abstract class a {
        protected static Type a(int n8, ParameterizedType parameterizedType) {
            return I.g(n8, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return I.h(type);
        }

        public i<?, RequestBody> c(Type type, Annotation[] annotationArray, Annotation[] annotationArray2, E e8) {
            return null;
        }

        public i<ResponseBody, ?> d(Type type, Annotation[] annotationArray, E e8) {
            return null;
        }

        public i<?, String> e(Type type, Annotation[] annotationArray, E e8) {
            return null;
        }
    }
}

