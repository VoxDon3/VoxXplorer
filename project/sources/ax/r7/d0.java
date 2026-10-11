package ax.r7;

import ax.r7.C2976j;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    class a<E> extends e<E> {
        final /* synthetic */ Set c0;
        final /* synthetic */ Set q;

        /* renamed from: ax.r7.d0$a$a, reason: collision with other inner class name */
        class C0443a extends AbstractC2968b<E> {
            final Iterator<E> d0;

            C0443a() {
                this.d0 = a.this.q.iterator();
            }

            @Override // ax.r7.AbstractC2968b
            protected E b() {
                while (this.d0.hasNext()) {
                    E next = this.d0.next();
                    if (a.this.c0.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.q = set;
            this.c0 = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.q.contains(obj) && this.c0.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.q.containsAll(collection) && this.c0.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public j0<E> iterator() {
            return new C0443a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.c0, this.q);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.q.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.c0.contains(it.next())) {
                    i++;
                }
            }
            return i;
        }
    }

    private static class b<E> extends C2976j.a<E> implements Set<E> {
        b(Set<E> set, ax.q7.o<? super E> oVar) {
            super(set, oVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return d0.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return d0.d(this);
        }
    }

    private static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, ax.q7.o<? super E> oVar) {
            super(sortedSet, oVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.q).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) G.k(this.q.iterator(), this.c0);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return new c(((SortedSet) this.q).headSet(e), this.c0);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSet = (SortedSet) this.q;
            while (true) {
                E e = (Object) sortedSet.last();
                if (this.c0.apply(e)) {
                    return e;
                }
                sortedSet = sortedSet.headSet(e);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return new c(((SortedSet) this.q).subSet(e, e2), this.c0);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return new c(((SortedSet) this.q).tailSet(e), this.c0);
        }
    }

    static abstract class d<E> extends AbstractSet<E> {
        d() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return d0.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) ax.q7.n.n(collection));
        }
    }

    public static abstract class e<E> extends AbstractSet<E> {
        /* synthetic */ e(c0 c0Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private e() {
        }
    }

    static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, ax.q7.o<? super E> oVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, oVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) ax.q7.n.n(set), (ax.q7.o) ax.q7.n.n(oVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.q, ax.q7.p.b(bVar.c0, oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, ax.q7.o<? super E> oVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) ax.q7.n.n(sortedSet), (ax.q7.o) ax.q7.n.n(oVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.q, ax.q7.p.b(bVar.c0, oVar));
    }

    static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        ax.q7.n.o(set, "set1");
        ax.q7.n.o(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i) {
        return new HashSet<>(K.a(i));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(K.f());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        ax.q7.n.n(collection);
        if (collection instanceof O) {
            collection = ((O) collection).H();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : G.r(set.iterator(), collection);
    }

    static boolean j(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
