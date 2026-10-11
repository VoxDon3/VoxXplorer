/*
 * Decompiled with CFR 0.152.
 */
package ax.Nb;

import ax.Gb.l;
import ax.Hb.a;
import ax.Nb.g;
import ax.sb.n;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.wb.i;
import ax.wb.j;
import ax.xb.b;
import ax.yb.h;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class f<T>
extends g<T>
implements Iterator<T>,
e<t>,
a {
    private T c0;
    private Iterator<? extends T> d0;
    private e<? super t> e0;
    private int q;

    private final Throwable i() {
        int n8 = this.q;
        if (n8 != 4) {
            if (n8 != 5) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state of the iterator: ");
                stringBuilder.append(this.q);
                return new IllegalStateException(stringBuilder.toString());
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final T j() {
        if (this.hasNext()) {
            return this.next();
        }
        throw new NoSuchElementException();
    }

    @Override
    public i b() {
        return j.q;
    }

    @Override
    public Object c(T object, e<? super t> e8) {
        this.c0 = object;
        this.q = 3;
        this.e0 = e8;
        object = b.c();
        if (object == b.c()) {
            h.c(e8);
        }
        if (object == b.c()) {
            return object;
        }
        return t.a;
    }

    @Override
    public void f(Object object) {
        o.b(object);
        this.q = 4;
    }

    @Override
    public Object g(Iterator<? extends T> object, e<? super t> e8) {
        if (!object.hasNext()) {
            return t.a;
        }
        this.d0 = object;
        this.q = 2;
        this.e0 = e8;
        object = b.c();
        if (object == b.c()) {
            h.c(e8);
        }
        if (object == b.c()) {
            return object;
        }
        return t.a;
    }

    @Override
    public boolean hasNext() {
        while (true) {
            Object object;
            int n8;
            if ((n8 = this.q) != 0) {
                if (n8 != 1) {
                    if (n8 != 2 && n8 != 3) {
                        if (n8 == 4) {
                            return false;
                        }
                        throw this.i();
                    }
                    return true;
                }
                object = this.d0;
                l.c(object);
                if (object.hasNext()) {
                    this.q = 2;
                    return true;
                }
                this.d0 = null;
            }
            this.q = 5;
            object = this.e0;
            l.c(object);
            this.e0 = null;
            n.a a8 = n.q;
            object.f(n.a(t.a));
        }
    }

    public final void m(e<? super t> e8) {
        this.e0 = e8;
    }

    @Override
    public T next() {
        int n8 = this.q;
        if (n8 != 0 && n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    this.q = 0;
                    T t8 = this.c0;
                    this.c0 = null;
                    return t8;
                }
                throw this.i();
            }
            this.q = 1;
            Iterator<T> iterator = this.d0;
            l.c(iterator);
            return iterator.next();
        }
        return this.j();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

