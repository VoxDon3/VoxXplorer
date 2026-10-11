package ax.c0;

import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Y<T> implements Iterator<T>, ax.Hb.a {
    private final List<Iterator<T>> c0 = new ArrayList();
    private Iterator<? extends T> d0;
    private final ax.Fb.l<T, Iterator<T>> q;

    /* JADX WARN: Multi-variable type inference failed */
    public Y(Iterator<? extends T> it, ax.Fb.l<? super T, ? extends Iterator<? extends T>> lVar) {
        this.q = lVar;
        this.d0 = it;
    }

    private final void b(T t) {
        Iterator<T> invoke = this.q.invoke(t);
        if (invoke != null && invoke.hasNext()) {
            this.c0.add(this.d0);
            this.d0 = invoke;
        } else {
            while (!this.d0.hasNext() && !this.c0.isEmpty()) {
                this.d0 = (Iterator) C3139o.M(this.c0);
                C3139o.x(this.c0);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.d0.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        T next = this.d0.next();
        b(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
