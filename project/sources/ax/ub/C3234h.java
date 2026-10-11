package ax.ub;

import ax.Gb.l;
import ax.tb.AbstractC3130f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ax.ub.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3234h<E> extends AbstractC3130f<E> implements Set<E>, Serializable, ax.Hb.a {
    private static final a c0 = new a(null);
    private static final C3234h d0 = new C3234h(C3230d.o0.e());
    private final C3230d<E, ?> q;

    /* renamed from: ax.ub.h$a */
    private static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C3234h(C3230d<E, ?> c3230d) {
        l.f(c3230d, "backing");
        this.q = c3230d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return this.q.j(e) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.q.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.q.containsKey(obj);
    }

    @Override // ax.tb.AbstractC3130f
    public int e() {
        return this.q.size();
    }

    public final Set<E> g() {
        this.q.l();
        return size() > 0 ? this : d0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.q.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.q.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.q.M(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        l.f(collection, "elements");
        this.q.m();
        return super.retainAll(collection);
    }

    public C3234h() {
        this(new C3230d());
    }
}
