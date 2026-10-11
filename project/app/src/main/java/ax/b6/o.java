/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.s;
import ax.b6.u;
import java.util.Iterator;

final class o
implements Iterator<s> {
    private final Iterator q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    o(Iterator iterator) {
        this.q = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override
    public final /* synthetic */ Object next() {
        return new u((String)this.q.next());
    }
}

