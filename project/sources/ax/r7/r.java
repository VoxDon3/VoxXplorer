package ax.r7;

import ax.q7.AbstractC2884k;

/* loaded from: classes3.dex */
public abstract class r<E> implements Iterable<E> {
    private final AbstractC2884k<Iterable<E>> q = AbstractC2884k.a();

    protected r() {
    }

    private Iterable<E> e() {
        return this.q.e(this);
    }

    public String toString() {
        return F.n(e());
    }
}
