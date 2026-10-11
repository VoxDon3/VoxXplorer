/*
 * Decompiled with CFR 0.152.
 */
package ax.U7;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c {
    private final String a;
    private final Map<Class<?>, Object> b;

    private c(String string, Map<Class<?>, Object> map) {
        this.a = string;
        this.b = map;
    }

    public static b a(String string) {
        return new b(string);
    }

    public static c d(String string) {
        return new c(string, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.a;
    }

    public <T extends Annotation> T c(Class<T> clazz) {
        return (T)((Annotation)this.b.get(clazz));
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return this.a.equals(((c)object).a) && this.b.equals(((c)object).b);
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FieldDescriptor{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", properties=");
        stringBuilder.append(this.b.values());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b {
        private final String a;
        private Map<Class<?>, Object> b = null;

        b(String string) {
            this.a = string;
        }

        public c a() {
            String string = this.a;
            Map map = this.b == null ? Collections.EMPTY_MAP : java.util.DesugarCollections.unmodifiableMap(new HashMap(this.b));
            return new c(string, map);
        }

        public <T extends Annotation> b b(T t8) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(t8.annotationType(), t8);
            return this;
        }
    }
}

