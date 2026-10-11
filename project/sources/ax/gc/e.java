package ax.gc;

import ax.gc.AbstractC2135a;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class e<T> extends AbstractC2135a<T> {

    class a implements Iterator<T> {
        private InterfaceC2137c<T> q;

        a() {
            this.q = e.this.e0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q != null;
        }

        @Override // java.util.Iterator
        public T next() {
            InterfaceC2137c<T> interfaceC2137c = this.q;
            if (interfaceC2137c == null) {
                return null;
            }
            T value = interfaceC2137c.getValue();
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
            e.this.remove(this.q.getValue());
            this.q = next;
        }
    }

    public static class b<T> extends AbstractC2135a.AbstractC0319a<T> {
        private T c;

        /* synthetic */ b(Object obj, AbstractC2135a.AbstractC0319a abstractC0319a, a aVar) {
            this(obj, (AbstractC2135a.AbstractC0319a<Object>) abstractC0319a);
        }

        @Override // ax.gc.InterfaceC2137c
        public T getValue() {
            return this.c;
        }

        /* synthetic */ b(Object obj, a aVar) {
            this(obj);
        }

        private b(T t, AbstractC2135a.AbstractC0319a<T> abstractC0319a) {
            super(abstractC0319a);
            this.c = t;
        }

        private b(T t) {
            this.c = t;
        }
    }

    public e() {
        super(new HashMap());
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
