/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.r7.k0;
import java.util.NoSuchElementException;

abstract class a<E>
extends k0<E> {
    private int c0;
    private final int q;

    protected a(int n8, int n9) {
        n.q(n9, n8);
        this.q = n8;
        this.c0 = n9;
    }

    protected abstract E b(int var1);

    @Override
    public final boolean hasNext() {
        return this.c0 < this.q;
    }

    @Override
    public final boolean hasPrevious() {
        return this.c0 > 0;
    }

    @Override
    public final E next() {
        if (this.hasNext()) {
            int n8 = this.c0;
            this.c0 = n8 + 1;
            return this.b(n8);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.c0;
    }

    @Override
    public final E previous() {
        if (this.hasPrevious()) {
            int n8;
            this.c0 = n8 = this.c0 - 1;
            return this.b(n8);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.c0 - 1;
    }
}

