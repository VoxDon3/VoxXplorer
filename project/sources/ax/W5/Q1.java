package ax.W5;

import java.util.ListIterator;

/* loaded from: classes3.dex */
final class Q1 implements ListIterator {
    final /* synthetic */ int c0;
    final /* synthetic */ S1 d0;
    final ListIterator q;

    Q1(S1 s1, int i) {
        R0 r0;
        this.d0 = s1;
        this.c0 = i;
        r0 = s1.q;
        this.q = r0.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.q.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.q.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.q.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.q.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.q.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.q.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
