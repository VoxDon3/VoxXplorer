/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.k;
import ax.q7.n;

final class a<T>
extends k<T> {
    static final a<Object> q = new a();

    private a() {
    }

    static <T> k<T> f() {
        return q;
    }

    @Override
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public T e(T t8) {
        return n.o(t8, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object object) {
        return object == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}

