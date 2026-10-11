package ax.x8;

import ax.t8.C3105a;
import ax.t8.C3106b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: ax.x8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3475a<T> {
    private final Class<? super T> a;
    private final Type b;
    private final int c;

    protected C3475a() {
        Type e = e();
        this.b = e;
        this.a = (Class<? super T>) C3106b.k(e);
        this.c = e.hashCode();
    }

    public static <T> C3475a<T> a(Class<T> cls) {
        return new C3475a<>(cls);
    }

    public static C3475a<?> b(Type type) {
        return new C3475a<>(type);
    }

    private Type e() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C3475a.class) {
                return C3106b.b(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == C3475a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final Class<? super T> c() {
        return this.a;
    }

    public final Type d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3475a) && C3106b.f(this.b, ((C3475a) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return C3106b.t(this.b);
    }

    private C3475a(Type type) {
        Type b = C3106b.b((Type) C3105a.b(type));
        this.b = b;
        this.a = (Class<? super T>) C3106b.k(b);
        this.c = b.hashCode();
    }
}
