package ax.D7;

import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
public final class F<T> {
    private final Class<? extends Annotation> a;
    private final Class<T> b;

    private @interface a {
    }

    public F(Class<? extends Annotation> cls, Class<T> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static <T> F<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new F<>(cls, cls2);
    }

    public static <T> F<T> b(Class<T> cls) {
        return new F<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f = (F) obj;
        if (this.b.equals(f.b)) {
            return this.a.equals(f.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        return "@" + this.a.getName() + " " + this.b.getName();
    }
}
