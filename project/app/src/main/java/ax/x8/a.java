/*
 * Decompiled with CFR 0.152.
 */
package ax.x8;

import ax.t8.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class a<T> {
    private final Class<? super T> a;
    private final Type b;
    private final int c;

    protected a() {
        Type type;
        this.b = type = this.e();
        this.a = ax.t8.b.k(type);
        this.c = type.hashCode();
    }

    private a(Type type) {
        this.b = type = ax.t8.b.b(ax.t8.a.b(type));
        this.a = ax.t8.b.k(type);
        this.c = type.hashCode();
    }

    public static <T> a<T> a(Class<T> clazz) {
        return new a<T>(clazz);
    }

    public static a<?> b(Type type) {
        return new a(type);
    }

    private Type e() {
        Type type = this.getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            if ((type = (ParameterizedType)type).getRawType() == a.class) {
                return ax.t8.b.b(type.getActualTypeArguments()[0]);
            }
        } else if (type == a.class) {
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

    public final boolean equals(Object object) {
        return object instanceof a && ax.t8.b.f(this.b, ((a)object).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return ax.t8.b.t(this.b);
    }
}

