package ax.Nb;

import ax.sb.C3082n;
import ax.sb.C3083o;
import ax.sb.t;
import ax.xb.C3479b;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class f<T> extends g<T> implements Iterator<T>, ax.wb.e<t>, ax.Hb.a {
    private T c0;
    private Iterator<? extends T> d0;
    private ax.wb.e<? super t> e0;
    private int q;

    private final Throwable i() {
        int i = this.q;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.q);
    }

    private final T j() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // ax.wb.e
    public ax.wb.i b() {
        return ax.wb.j.q;
    }

    @Override // ax.Nb.g
    public Object c(T t, ax.wb.e<? super t> eVar) {
        this.c0 = t;
        this.q = 3;
        this.e0 = eVar;
        Object c = C3479b.c();
        if (c == C3479b.c()) {
            ax.yb.h.c(eVar);
        }
        return c == C3479b.c() ? c : t.a;
    }

    @Override // ax.wb.e
    public void f(Object obj) {
        C3083o.b(obj);
        this.q = 4;
    }

    @Override // ax.Nb.g
    public Object g(Iterator<? extends T> it, ax.wb.e<? super t> eVar) {
        if (!it.hasNext()) {
            return t.a;
        }
        this.d0 = it;
        this.q = 2;
        this.e0 = eVar;
        Object c = C3479b.c();
        if (c == C3479b.c()) {
            ax.yb.h.c(eVar);
        }
        return c == C3479b.c() ? c : t.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.q;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw i();
                }
                Iterator<? extends T> it = this.d0;
                ax.Gb.l.c(it);
                if (it.hasNext()) {
                    this.q = 2;
                    return true;
                }
                this.d0 = null;
            }
            this.q = 5;
            ax.wb.e<? super t> eVar = this.e0;
            ax.Gb.l.c(eVar);
            this.e0 = null;
            C3082n.a aVar = C3082n.q;
            eVar.f(C3082n.a(t.a));
        }
    }

    public final void m(ax.wb.e<? super t> eVar) {
        this.e0 = eVar;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.q;
        if (i == 0 || i == 1) {
            return j();
        }
        if (i == 2) {
            this.q = 1;
            Iterator<? extends T> it = this.d0;
            ax.Gb.l.c(it);
            return it.next();
        }
        if (i != 3) {
            throw i();
        }
        this.q = 0;
        T t = this.c0;
        this.c0 = null;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
