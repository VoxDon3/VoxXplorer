/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.Q1;
import ax.W5.R0;
import ax.W5.R1;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class S1
extends AbstractList
implements RandomAccess,
R0 {
    private final R0 q;

    public S1(R0 r02) {
        this.q = r02;
    }

    static /* bridge */ /* synthetic */ R0 e(S1 s12) {
        return s12.q;
    }

    @Override
    public final R0 f() {
        return this;
    }

    @Override
    public final Iterator iterator() {
        return new R1(this);
    }

    @Override
    public final List j() {
        return this.q.j();
    }

    public final ListIterator listIterator(int n8) {
        return new Q1(this, n8);
    }

    @Override
    public final int size() {
        return this.q.size();
    }
}

