/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.k;
import ax.r7.F;

public abstract class r<E>
implements Iterable<E> {
    private final k<Iterable<E>> q = k.a();

    protected r() {
    }

    private Iterable<E> e() {
        return this.q.e(this);
    }

    public String toString() {
        return F.n(this.e());
    }
}

