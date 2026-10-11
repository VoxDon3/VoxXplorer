/*
 * Decompiled with CFR 0.152.
 */
package ax.gc;

import ax.gc.a;
import ax.gc.c;
import java.util.HashMap;
import java.util.Iterator;

public class e<T>
extends a<T> {
    public e() {
        super(new HashMap());
    }

    @Override
    protected a.a<T> e(T t8, a.a<T> a8) {
        if (a8 != null) {
            return new b(t8, a8);
        }
        return new b((Object)t8);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>(this){
            final e c0;
            private c<T> q;
            {
                this.c0 = e8;
                this.q = e8.e0;
            }

            @Override
            public boolean hasNext() {
                return this.q != null;
            }

            @Override
            public T next() {
                c c8 = this.q;
                if (c8 == null) {
                    return null;
                }
                c8 = c8.getValue();
                this.q = this.q.next();
                return c8;
            }

            @Override
            public void remove() {
                c c8 = this.q;
                if (c8 == null) {
                    return;
                }
                c8 = c8.next();
                this.c0.remove(this.q.getValue());
                this.q = c8;
            }
        };
    }

    public static class b<T>
    extends a.a<T> {
        private T c;

        private b(T t8) {
            this.c = t8;
        }

        private b(T t8, a.a<T> a8) {
            super(a8);
            this.c = t8;
        }

        @Override
        public T getValue() {
            return this.c;
        }
    }
}

