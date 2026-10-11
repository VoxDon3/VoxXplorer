/*
 * Decompiled with CFR 0.152.
 */
package ax.B;

import ax.Hb.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class g<T>
implements Iterator<T>,
a {
    private int c0;
    private boolean d0;
    private int q;

    public g(int n8) {
        this.q = n8;
    }

    protected abstract T b(int var1);

    protected abstract void c(int var1);

    @Override
    public boolean hasNext() {
        return this.c0 < this.q;
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            T t8 = this.b(this.c0);
            ++this.c0;
            this.d0 = true;
            return t8;
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        if (this.d0) {
            int n8;
            this.c0 = n8 = this.c0 - 1;
            this.c(n8);
            --this.q;
            this.d0 = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }
}

