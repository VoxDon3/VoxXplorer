package ax.U7;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {
    private final String a;
    private final Map<Class<?>, Object> b;

    public static final class b {
        private final String a;
        private Map<Class<?>, Object> b = null;

        b(String str) {
            this.a = str;
        }

        public c a() {
            return new c(this.a, this.b == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(this.b)));
        }

        public <T extends Annotation> b b(T t) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(t.annotationType(), t);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }
}
