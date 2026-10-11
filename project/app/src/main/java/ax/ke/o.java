/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import java.lang.reflect.Method;
import java.util.List;

public final class o {
    private final Method a;
    private final List<?> b;

    o(Method method, List<?> list) {
        this.a = method;
        this.b = java.util.DesugarCollections.unmodifiableList(list);
    }

    public Method a() {
        return this.a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}

