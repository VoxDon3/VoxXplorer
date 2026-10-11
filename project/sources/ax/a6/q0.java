package ax.a6;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class q0 extends u0 {
    private boolean c0;
    private final Object q;

    q0(Object obj) {
        this.q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.c0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c0) {
            throw new NoSuchElementException();
        }
        this.c0 = true;
        return this.q;
    }
}
