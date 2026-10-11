package ax.gc;

import ax.gc.AbstractC2135a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public class f<T> extends AbstractC2135a<T> {

    class a implements Iterator<T> {
        private InterfaceC2137c<T> q;

        a() {
            this.q = f.this.e0;
        }

        private void b() {
            InterfaceC2137c<T> interfaceC2137c;
            ReentrantReadWriteLock.WriteLock writeLock = f.this.c0.writeLock();
            try {
                writeLock.lock();
                do {
                    InterfaceC2137c<T> interfaceC2137c2 = this.q;
                    this.q = interfaceC2137c2.next();
                    f fVar = f.this;
                    AbstractC2135a.AbstractC0319a<T> abstractC0319a = fVar.e0;
                    if (interfaceC2137c2 == abstractC0319a) {
                        fVar.e0 = abstractC0319a.next();
                    }
                    interfaceC2137c2.remove();
                    interfaceC2137c = this.q;
                    if (interfaceC2137c == null) {
                        break;
                    }
                } while (interfaceC2137c.getValue() == null);
                writeLock.unlock();
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            InterfaceC2137c<T> interfaceC2137c = this.q;
            if (interfaceC2137c == null) {
                return false;
            }
            if (interfaceC2137c.getValue() != null) {
                return true;
            }
            b();
            return this.q != null;
        }

        @Override // java.util.Iterator
        public T next() {
            InterfaceC2137c<T> interfaceC2137c = this.q;
            if (interfaceC2137c == null) {
                return null;
            }
            T value = interfaceC2137c.getValue();
            if (value == null) {
                b();
                return (T) next();
            }
            this.q = this.q.next();
            return value;
        }

        @Override // java.util.Iterator
        public void remove() {
            InterfaceC2137c<T> interfaceC2137c = this.q;
            if (interfaceC2137c == null) {
                return;
            }
            InterfaceC2137c<T> next = interfaceC2137c.next();
            f.this.remove(this.q.getValue());
            this.q = next;
        }
    }

    public static class b<T> extends AbstractC2135a.AbstractC0319a<T> {
        private WeakReference<T> c;

        /* synthetic */ b(Object obj, AbstractC2135a.AbstractC0319a abstractC0319a, a aVar) {
            this(obj, (AbstractC2135a.AbstractC0319a<Object>) abstractC0319a);
        }

        @Override // ax.gc.InterfaceC2137c
        public T getValue() {
            return this.c.get();
        }

        /* synthetic */ b(Object obj, a aVar) {
            this(obj);
        }

        private b(T t, AbstractC2135a.AbstractC0319a<T> abstractC0319a) {
            super(abstractC0319a);
            this.c = new WeakReference<>(t);
        }

        private b(T t) {
            this.c = new WeakReference<>(t);
        }
    }

    public f() {
        super(new WeakHashMap());
    }

    @Override // ax.gc.AbstractC2135a
    protected AbstractC2135a.AbstractC0319a<T> e(T t, AbstractC2135a.AbstractC0319a<T> abstractC0319a) {
        a aVar = null;
        return abstractC0319a != null ? new b(t, abstractC0319a, aVar) : new b(t, aVar);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a();
    }
}
