/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.g0;
import ax.a6.v0;
import java.util.NoSuchElementException;

abstract class i0
extends v0 {
    private int c0;
    private final int q;

    protected i0(int n8, int n9) {
        g0.b(n9, n8, "index");
        this.q = n8;
        this.c0 = n9;
    }

    protected abstract Object b(int var1);

    @Override
    public final boolean hasNext() {
        return this.c0 < this.q;
    }

    @Override
    public final boolean hasPrevious() {
        return this.c0 > 0;
    }

    @Override
    public final Object next() {
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

    public final Object previous() {
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

