package ax.ke;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes3.dex */
public final class o {
    private final Method a;
    private final List<?> b;

    o(Method method, List<?> list) {
        this.a = method;
        this.b = DesugarCollections.unmodifiableList(list);
    }

    public Method a() {
        return this.a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}
