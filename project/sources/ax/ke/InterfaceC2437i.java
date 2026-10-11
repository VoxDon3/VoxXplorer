package ax.ke;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: ax.ke.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2437i<F, T> {

    /* renamed from: ax.ke.i$a */
    public static abstract class a {
        protected static Type a(int i, ParameterizedType parameterizedType) {
            return I.g(i, parameterizedType);
        }

        protected static Class<?> b(Type type) {
            return I.h(type);
        }

        public InterfaceC2437i<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, E e) {
            return null;
        }

        public InterfaceC2437i<ResponseBody, ?> d(Type type, Annotation[] annotationArr, E e) {
            return null;
        }

        public InterfaceC2437i<?, String> e(Type type, Annotation[] annotationArr, E e) {
            return null;
        }
    }

    T a(F f) throws IOException;
}
