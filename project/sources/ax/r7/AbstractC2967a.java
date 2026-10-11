package ax.r7;

import java.util.NoSuchElementException;

/* renamed from: ax.r7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2967a<E> extends k0<E> {
    private int c0;
    private final int q;

    protected AbstractC2967a(int i, int i2) {
        ax.q7.n.q(i2, i);
        this.q = i;
        this.c0 = i2;
    }

    protected abstract E b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c0 < this.q;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c0 > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
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
    public final E previous() {
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
