/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.S1;
import java.util.ListIterator;

final class Q1
implements ListIterator {
    final int c0;
    final S1 d0;
    final ListIterator q;

    Q1(S1 s12, int n8) {
        this.d0 = s12;
        this.c0 = n8;
        this.q = S1.e(s12).listIterator(n8);
    }

    public final /* synthetic */ void add(Object object) {
        object = (String)object;
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.q.hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return this.q.nextIndex();
    }

    @Override
    public final int previousIndex() {
        return this.q.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object object) {
        object = (String)object;
        throw new UnsupportedOperationException();
    }
}

