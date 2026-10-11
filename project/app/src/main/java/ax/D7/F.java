/*
 * Decompiled with CFR 0.152.
 */
package ax.D7;

import java.lang.annotation.Annotation;

public final class F<T> {
    private final Class<? extends Annotation> a;
    private final Class<T> b;

    public F(Class<? extends Annotation> clazz, Class<T> clazz2) {
        this.a = clazz;
        this.b = clazz2;
    }

    public static <T> F<T> a(Class<? extends Annotation> clazz, Class<T> clazz2) {
        return new F<T>(clazz, clazz2);
    }

    public static <T> F<T> b(Class<T> clazz) {
        return new F<T>(a.class, clazz);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && F.class == object.getClass()) {
            object = (F)object;
            if (!this.b.equals(((F)object).b)) {
                return false;
            }
            return this.a.equals(((F)object).a);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }

    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("@");
        stringBuilder.append(this.a.getName());
        stringBuilder.append(" ");
        stringBuilder.append(this.b.getName());
        return stringBuilder.toString();
    }

    private static @interface a {
    }
}

