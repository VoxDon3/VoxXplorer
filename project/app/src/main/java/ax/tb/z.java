/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Hb.a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class z
implements ListIterator,
a {
    public static final z q = new z();

    private z() {
    }

    public Void b() {
        throw new NoSuchElementException();
    }

    public Void c() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return -1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

