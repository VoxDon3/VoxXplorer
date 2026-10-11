/*
 * Decompiled with CFR 0.152.
 */
package ax.Nb;

import ax.Fb.a;
import ax.Gb.l;
import ax.Nb.e;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class d<T>
implements e<T> {
    private final a<T> a;
    private final ax.Fb.l<T, T> b;

    public d(a<? extends T> a8, ax.Fb.l<? super T, ? extends T> l8) {
        l.f(a8, "getInitialValue");
        l.f(l8, "getNextValue");
        this.a = a8;
        this.b = l8;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            private int c0;
            final d<T> d0;
            private T q;
            {
                this.d0 = d8;
                this.c0 = -2;
            }

            private final void b() {
                Object object;
                if (this.c0 == -2) {
                    object = this.d0.a.invoke();
                } else {
                    ax.Fb.l l8 = this.d0.b;
                    object = this.q;
                    l.c(object);
                    object = l8.invoke(object);
                }
                this.q = object;
                int n8 = object == null ? 0 : 1;
                this.c0 = n8;
            }

            @Override
            public boolean hasNext() {
                if (this.c0 < 0) {
                    this.b();
                }
                return this.c0 == 1;
            }

            @Override
            public T next() {
                if (this.c0 < 0) {
                    this.b();
                }
                if (this.c0 != 0) {
                    Object t8 = this.q;
                    l.d(t8, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                    this.c0 = -1;
                    return t8;
                }
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

