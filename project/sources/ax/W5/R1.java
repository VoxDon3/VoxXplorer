package ax.W5;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class R1 implements Iterator {
    final /* synthetic */ S1 c0;
    final Iterator q;

    R1(S1 s1) {
        R0 r0;
        this.c0 = s1;
        r0 = s1.q;
        this.q = r0.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.q.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
