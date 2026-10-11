package ax.r7;

import java.util.NoSuchElementException;

/* renamed from: ax.r7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2968b<T> extends j0<T> {
    private T c0;
    private a q = a.NOT_READY;

    /* renamed from: ax.r7.b$a */
    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC2968b() {
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
        ax.q7.n.t(this.q != a.FAILED);
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
        T t = (T) Q.a(this.c0);
        this.c0 = null;
        return t;
    }
}
