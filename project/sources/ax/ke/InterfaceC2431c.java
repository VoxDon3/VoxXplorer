package ax.ke;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: ax.ke.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2431c<R, T> {

    /* renamed from: ax.ke.c$a */
    public static abstract class a {
        protected static Type b(int i, ParameterizedType parameterizedType) {
            return I.g(i, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return I.h(type);
        }

        public abstract InterfaceC2431c<?, ?> a(Type type, Annotation[] annotationArr, E e);
    }

    T a(InterfaceC2430b<R> interfaceC2430b);

    Type b();
}
