/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.f;
import ax.q7.j;
import ax.q7.n;
import ax.r7.T;
import java.io.Serializable;

final class h<F, T>
extends T<F>
implements Serializable {
    final T<T> c0;
    final f<F, ? extends T> q;

    h(f<F, ? extends T> f8, T<T> t8) {
        this.q = n.n(f8);
        this.c0 = n.n(t8);
    }

    @Override
    public int compare(F f8, F f9) {
        return this.c0.compare(this.q.apply(f8), this.q.apply(f9));
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof h) {
            object = (h)object;
            if (this.q.equals(((h)object).q) && this.c0.equals(((h)object).c0)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return j.b(this.q, this.c0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c0);
        stringBuilder.append(".onResultOf(");
        stringBuilder.append(this.q);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

