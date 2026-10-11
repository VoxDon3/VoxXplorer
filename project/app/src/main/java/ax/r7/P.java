/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.T;
import ax.r7.Z;
import java.io.Serializable;

final class P
extends T<Comparable<?>>
implements Serializable {
    static final P q = new P();

    private P() {
    }

    @Override
    public <S extends Comparable<?>> T<S> g() {
        return Z.q;
    }

    public int h(Comparable<?> comparable, Comparable<?> comparable2) {
        n.n(comparable);
        n.n(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}

