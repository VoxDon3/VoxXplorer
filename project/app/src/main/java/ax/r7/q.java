/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.F;
import ax.r7.v;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class q<E>
extends v<E>
implements Serializable {
    final int c0;
    private final Queue<E> q;

    private q(int n8) {
        boolean bl = n8 >= 0;
        n.g(bl, "maxSize (%s) must >= 0", n8);
        this.q = new ArrayDeque(n8);
        this.c0 = n8;
    }

    public static <E> q<E> l(int n8) {
        return new q<E>(n8);
    }

    @Override
    public boolean add(E e8) {
        n.n(e8);
        if (this.c0 == 0) {
            return true;
        }
        if (this.size() == this.c0) {
            this.q.remove();
        }
        this.q.add(e8);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        int n8 = collection.size();
        if (n8 >= this.c0) {
            this.clear();
            return F.a(this, F.k(collection, n8 - this.c0));
        }
        return this.i(collection);
    }

    @Override
    protected Queue<E> k() {
        return this.q;
    }

    @Override
    public boolean offer(E e8) {
        return this.add(e8);
    }

    @Override
    public Object[] toArray() {
        return super.toArray();
    }
}

