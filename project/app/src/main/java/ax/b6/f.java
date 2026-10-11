/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.g;
import ax.b6.s;
import ax.b6.u;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class f
implements Iterator<s> {
    private final Iterator c0;
    private final Iterator q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    f(g g8, Iterator iterator, Iterator iterator2) {
        this.q = iterator;
        this.c0 = iterator2;
    }

    @Override
    public final boolean hasNext() {
        if (this.q.hasNext()) {
            return true;
        }
        return this.c0.hasNext();
    }

    @Override
    public final /* synthetic */ Object next() {
        if (this.q.hasNext()) {
            return new u(((Integer)this.q.next()).toString());
        }
        if (this.c0.hasNext()) {
            return new u((String)this.c0.next());
        }
        throw new NoSuchElementException();
    }
}

