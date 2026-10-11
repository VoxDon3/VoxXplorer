package ax.Gb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class a<T> implements Iterator<T>, ax.Hb.a {
    private int c0;
    private final T[] q;

    public a(T[] tArr) {
        l.f(tArr, "array");
        this.q = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c0 < this.q.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.q;
            int i = this.c0;
            this.c0 = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.c0--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
