/*
 * Decompiled with CFR 0.152.
 */
package ax.r5;

import ax.r5.b;
import ax.r5.d;

public final class c<T>
implements b<T> {
    private static final c<Object> b = new c<Object>(null);
    private final T a;

    private c(T t8) {
        this.a = t8;
    }

    public static <T> b<T> a(T t8) {
        return new c<T>(d.c(t8, "instance cannot be null"));
    }

    @Override
    public T get() {
        return this.a;
    }
}

