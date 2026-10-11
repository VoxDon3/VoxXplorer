/*
 * Decompiled with CFR 0.152.
 */
package ax.gc;

import ax.gc.a;
import ax.gc.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class f<T>
extends a<T> {
    public f() {
        super(new WeakHashMap());
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
            final f c0;
            private c<T> q;
            {
                this.c0 = f8;
                this.q = f8.e0;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            private void b() {
                ReentrantReadWriteLock.WriteLock writeLock = this.c0.c0.writeLock();
                try {
                    Object object;
                    writeLock.lock();
                    do {
                        c c8 = this.q;
                        this.q = c8.next();
                        object = this.c0;
                        a.a a8 = ((a)object).e0;
                        if (c8 == a8) {
                            ((a)object).e0 = a8.a();
                        }
                        c8.remove();
                        object = this.q;
                    } while (object != null && (object = object.getValue()) == null);
                    writeLock.unlock();
                    return;
                }
                catch (Throwable throwable) {}
                writeLock.unlock();
                throw throwable;
            }

            @Override
            public boolean hasNext() {
                c c8 = this.q;
                if (c8 == null) {
                    return false;
                }
                if (c8.getValue() == null) {
                    this.b();
                    return this.q != null;
                }
                return true;
            }

            @Override
            public T next() {
                c c8 = this.q;
                if (c8 == null) {
                    return null;
                }
                if ((c8 = c8.getValue()) == null) {
                    this.b();
                    return this.next();
                }
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
        private WeakReference<T> c;

        private b(T t8) {
            this.c = new WeakReference<T>(t8);
        }

        private b(T t8, a.a<T> a8) {
            super(a8);
            this.c = new WeakReference<T>(t8);
        }

        @Override
        public T getValue() {
            return this.c.get();
        }
    }
}

