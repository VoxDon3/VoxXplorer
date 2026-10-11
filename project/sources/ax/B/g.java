package ax.B;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class g<T> implements Iterator<T>, ax.Hb.a {
    private int c0;
    private boolean d0;
    private int q;

    public g(int i) {
        this.q = i;
    }

    protected abstract T b(int i);

    protected abstract void c(int i);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c0 < this.q;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T b = b(this.c0);
        this.c0++;
        this.d0 = true;
        return b;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.d0) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.c0 - 1;
        this.c0 = i;
        c(i);
        this.q--;
        this.d0 = false;
    }
}
