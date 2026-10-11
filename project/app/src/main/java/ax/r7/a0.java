/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.T;
import java.io.Serializable;

final class a0<T>
extends T<T>
implements Serializable {
    final T<? super T> q;

    a0(T<? super T> t8) {
        this.q = n.n(t8);
    }

    @Override
    public int compare(T t8, T t9) {
        return this.q.compare(t9, t8);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof a0) {
            object = (a0)object;
            return this.q.equals(((a0)object).q);
        }
        return false;
    }

    @Override
    public <S extends T> T<S> g() {
        return this.q;
    }

    public int hashCode() {
        return -this.q.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.q);
        stringBuilder.append(".reverse()");
        return stringBuilder.toString();
    }
}

