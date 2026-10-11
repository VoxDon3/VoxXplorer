/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.d;
import ax.Gb.l;

public final class n
implements d {
    private final Class<?> a;
    private final String b;

    public n(Class<?> clazz, String string) {
        l.f(clazz, "jClass");
        l.f(string, "moduleName");
        this.a = clazz;
        this.b = string;
    }

    @Override
    public Class<?> b() {
        return this.a;
    }

    public boolean equals(Object object) {
        return object instanceof n && l.a(this.b(), ((n)object).b());
    }

    public int hashCode() {
        return this.b().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

