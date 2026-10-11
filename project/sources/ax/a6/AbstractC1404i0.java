package ax.a6;

import java.util.NoSuchElementException;

/* renamed from: ax.a6.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC1404i0 extends v0 {
    private int c0;
    private final int q;

    protected AbstractC1404i0(int i, int i2) {
        C1400g0.b(i2, i, "index");
        this.q = i;
        this.c0 = i2;
    }

    protected abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c0 < this.q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c0;
        this.c0 = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.c0 - 1;
        this.c0 = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c0 - 1;
    }
}
