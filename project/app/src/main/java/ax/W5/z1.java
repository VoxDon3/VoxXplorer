/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class z1
implements Iterator {
    z1() {
    }

    @Override
    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

