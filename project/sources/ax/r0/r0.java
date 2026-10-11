package ax.r0;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class r0 extends AbstractList<String> implements InterfaceC2910G, RandomAccess {
    private final InterfaceC2910G q;

    class a implements ListIterator<String> {
        final /* synthetic */ int c0;
        ListIterator<String> q;

        a(int i) {
            this.c0 = i;
            this.q = r0.this.q.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.q.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.q.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.q.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.q.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.q.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.q.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {
        Iterator<String> q;

        b() {
            this.q = r0.this.q.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.q.next();
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

    public r0(InterfaceC2910G interfaceC2910G) {
        this.q = interfaceC2910G;
    }

    @Override // ax.r0.InterfaceC2910G
    public void C0(AbstractC2921h abstractC2921h) {
        throw new UnsupportedOperationException();
    }

    @Override // ax.r0.InterfaceC2910G
    public Object D0(int i) {
        return this.q.D0(i);
    }

    @Override // ax.r0.InterfaceC2910G
    public List<?> d0() {
        return this.q.d0();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i) {
        return (String) this.q.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new a(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.q.size();
    }

    @Override // ax.r0.InterfaceC2910G
    public InterfaceC2910G A0() {
        return this;
    }
}
