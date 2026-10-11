package ax.O4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a extends g implements Iterable<g> {
    private final List<g> e0 = new ArrayList();

    /* renamed from: ax.O4.a$a, reason: collision with other inner class name */
    class C0160a implements Iterator<g> {
        final /* synthetic */ Iterator q;

        C0160a(Iterator it) {
            this.q = it;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g next() {
            return (g) this.q.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.q.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public a B(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("value is null");
        }
        this.e0.add(gVar);
        return this;
    }

    @Override // ax.O4.g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.e0.equals(((a) obj).e0);
        }
        return false;
    }

    @Override // ax.O4.g
    public int hashCode() {
        return this.e0.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<g> iterator() {
        return new C0160a(this.e0.iterator());
    }

    @Override // ax.O4.g
    public boolean n() {
        return true;
    }

    public int size() {
        return this.e0.size();
    }

    @Override // ax.O4.g
    protected void z(h hVar) throws IOException {
        hVar.c(this);
    }

    @Override // ax.O4.g
    public a e() {
        return this;
    }
}
