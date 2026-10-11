/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.g;
import ax.b6.s;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class i
implements Iterator<s> {
    private final g c0;
    private int q;

    i(g g8) {
        this.c0 = g8;
        this.q = 0;
    }

    @Override
    public final boolean hasNext() {
        return this.q < this.c0.t();
    }

    @Override
    public final /* synthetic */ Object next() {
        if (this.q < this.c0.t()) {
            g g8 = this.c0;
            int n8 = this.q;
            this.q = n8 + 1;
            return g8.q(n8);
        }
        int n9 = this.q;
        StringBuilder stringBuilder = new StringBuilder("Out of bounds index: ");
        stringBuilder.append(n9);
        throw new NoSuchElementException(stringBuilder.toString());
    }
}

