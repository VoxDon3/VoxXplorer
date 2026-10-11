package ax.Nb;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b<T> implements e<T>, c<T> {
    private final e<T> a;
    private final int b;

    public static final class a implements Iterator<T>, ax.Hb.a {
        private int c0;
        private final Iterator<T> q;

        a(b<T> bVar) {
            this.q = ((b) bVar).a.iterator();
            this.c0 = ((b) bVar).b;
        }

        private final void b() {
            while (this.c0 > 0 && this.q.hasNext()) {
                this.q.next();
                this.c0--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.q.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            return this.q.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(e<? extends T> eVar, int i) {
        ax.Gb.l.f(eVar, "sequence");
        this.a = eVar;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // ax.Nb.c
    public e<T> a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new b(this, i) : new b(this.a, i2);
    }

    @Override // ax.Nb.e
    public Iterator<T> iterator() {
        return new a(this);
    }
}
