/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.T;
import java.io.Serializable;

final class Z
extends T<Comparable<?>>
implements Serializable {
    static final Z q = new Z();

    private Z() {
    }

    @Override
    public <S extends Comparable<?>> T<S> g() {
        return T.d();
    }

    public int h(Comparable<?> comparable, Comparable<?> comparable2) {
        n.n(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}

