/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.T;
import java.io.Serializable;
import java.util.Comparator;

final class m<T>
extends T<T>
implements Serializable {
    final Comparator<T> q;

    m(Comparator<T> comparator) {
        this.q = n.n(comparator);
    }

    @Override
    public int compare(T t8, T t9) {
        return this.q.compare(t8, t9);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof m) {
            object = (m)object;
            return this.q.equals(((m)object).q);
        }
        return false;
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    public String toString() {
        return this.q.toString();
    }
}

