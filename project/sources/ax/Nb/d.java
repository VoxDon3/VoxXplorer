package ax.Nb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class d<T> implements e<T> {
    private final ax.Fb.a<T> a;
    private final ax.Fb.l<T, T> b;

    public static final class a implements Iterator<T>, ax.Hb.a {
        private int c0 = -2;
        final /* synthetic */ d<T> d0;
        private T q;

        a(d<T> dVar) {
            this.d0 = dVar;
        }

        private final void b() {
            T t;
            if (this.c0 == -2) {
                t = (T) ((d) this.d0).a.invoke();
            } else {
                ax.Fb.l lVar = ((d) this.d0).b;
                T t2 = this.q;
                ax.Gb.l.c(t2);
                t = (T) lVar.invoke(t2);
            }
            this.q = t;
            this.c0 = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.c0 < 0) {
                b();
            }
            return this.c0 == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.c0 < 0) {
                b();
            }
            if (this.c0 == 0) {
                throw new NoSuchElementException();
            }
            T t = this.q;
            ax.Gb.l.d(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.c0 = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(ax.Fb.a<? extends T> aVar, ax.Fb.l<? super T, ? extends T> lVar) {
        ax.Gb.l.f(aVar, "getInitialValue");
        ax.Gb.l.f(lVar, "getNextValue");
        this.a = aVar;
        this.b = lVar;
    }

    @Override // ax.Nb.e
    public Iterator<T> iterator() {
        return new a(this);
    }
}
