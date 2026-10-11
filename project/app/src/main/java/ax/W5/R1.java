/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.S1;
import java.util.Iterator;

final class R1
implements Iterator {
    final S1 c0;
    final Iterator q;

    R1(S1 s12) {
        this.c0 = s12;
        this.q = S1.e(s12).iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

