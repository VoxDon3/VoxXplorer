/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.k;
import ax.q7.n;

final class q<T>
extends k<T> {
    private final T q;

    q(T t8) {
        this.q = t8;
    }

    @Override
    public T b() {
        return this.q;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public T e(T t8) {
        n.o(t8, "use Optional.orNull() instead of Optional.or(null)");
        return this.q;
    }

    public boolean equals(Object object) {
        if (object instanceof q) {
            object = (q)object;
            return this.q.equals(((q)object).q);
        }
        return false;
    }

    public int hashCode() {
        return this.q.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Optional.of(");
        stringBuilder.append(this.q);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

