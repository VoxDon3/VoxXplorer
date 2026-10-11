package ax.q7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ax.q7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2875b<T> implements Iterator<T> {
    private T c0;
    private a q = a.NOT_READY;

    /* renamed from: ax.q7.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC2875b() {
    }

    private boolean e() {
        this.q = a.FAILED;
        this.c0 = b();
        if (this.q == a.DONE) {
            return false;
        }
        this.q = a.READY;
        return true;
    }

    protected abstract T b();

    protected final T c() {
        this.q = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        n.t(this.q != a.FAILED);
        int ordinal = this.q.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            return e();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.q = a.NOT_READY;
        T t = (T) C2882i.a(this.c0);
        this.c0 = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
