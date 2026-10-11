/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class a<T>
implements Iterator<T>,
ax.Hb.a {
    private int c0;
    private final T[] q;

    public a(T[] TArray) {
        l.f(TArray, "array");
        this.q = TArray;
    }

    @Override
    public boolean hasNext() {
        return this.c0 < this.q.length;
    }

    @Override
    public T next() {
        int n8;
        Object object;
        try {
            object = this.q;
            n8 = this.c0;
            this.c0 = n8 + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.c0;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        object = object[n8];
        return (T)object;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

