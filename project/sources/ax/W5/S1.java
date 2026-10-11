package ax.W5;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes3.dex */
public final class S1 extends AbstractList implements RandomAccess, R0 {
    private final R0 q;

    public S1(R0 r0) {
        this.q = r0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((Q0) this.q).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new R1(this);
    }

    @Override // ax.W5.R0
    public final List j() {
        return this.q.j();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new Q1(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q.size();
    }

    @Override // ax.W5.R0
    public final R0 f() {
        return this;
    }
}
