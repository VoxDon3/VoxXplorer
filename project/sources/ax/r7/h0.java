package ax.r7;

import java.util.Iterator;

/* loaded from: classes3.dex */
abstract class h0<F, T> implements Iterator<T> {
    final Iterator<? extends F> q;

    h0(Iterator<? extends F> it) {
        this.q = (Iterator) ax.q7.n.n(it);
    }

    abstract T b(F f);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return b(this.q.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.q.remove();
    }
}
