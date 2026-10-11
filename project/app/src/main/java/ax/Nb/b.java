/*
 * Decompiled with CFR 0.152.
 */
package ax.Nb;

import ax.Gb.l;
import ax.Nb.c;
import ax.Nb.e;
import java.util.Iterator;

public final class b<T>
implements e<T>,
c<T> {
    private final e<T> a;
    private final int b;

    public b(e<? extends T> object, int n8) {
        l.f(object, "sequence");
        this.a = object;
        this.b = n8;
        if (n8 >= 0) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("count must be non-negative, but was ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append('.');
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    @Override
    public e<T> a(int n8) {
        int n9 = this.b + n8;
        if (n9 < 0) {
            return new b<T>(this, n8);
        }
        return new b<T>(this.a, n9);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            private int c0;
            private final Iterator<T> q;
            {
                this.q = b8.a.iterator();
                this.c0 = b8.b;
            }

            private final void b() {
                while (this.c0 > 0 && this.q.hasNext()) {
                    this.q.next();
                    --this.c0;
                }
            }

            @Override
            public boolean hasNext() {
                this.b();
                return this.q.hasNext();
            }

            @Override
            public T next() {
                this.b();
                return this.q.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

