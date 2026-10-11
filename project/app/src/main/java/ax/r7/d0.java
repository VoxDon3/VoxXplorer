/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.q7.o;
import ax.q7.p;
import ax.r7.G;
import ax.r7.K;
import ax.r7.O;
import ax.r7.c0;
import ax.r7.j;
import ax.r7.j0;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

public final class d0 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean a(Set<?> set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            if (set.size() != object.size()) return false;
            boolean bl = set.containsAll((Collection<?>)object);
            if (!bl) return false;
            return true;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }

    public static <E> Set<E> b(Set<E> b8, o<? super E> o8) {
        if (b8 instanceof SortedSet) {
            return d0.c((SortedSet)((Object)b8), o8);
        }
        if (b8 instanceof b) {
            b8 = b8;
            o8 = p.b(b8.c0, o8);
            return new b<E>((Set)b8.q, o8);
        }
        return new b<E>(n.n(b8), n.n(o8));
    }

    public static <E> SortedSet<E> c(SortedSet<E> set, o<? super E> o8) {
        if (set instanceof b) {
            set = (b)set;
            o8 = p.b(((j.a)((Object)set)).c0, o8);
            return new c<E>((SortedSet)((j.a)((Object)set)).q, o8);
        }
        return new c<E>(n.n(set), n.n(o8));
    }

    static int d(Set<?> object) {
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            Object e8 = object.next();
            int n9 = e8 != null ? e8.hashCode() : 0;
            n8 = ~(~(n8 + n9));
        }
        return n8;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        n.o(set, "set1");
        n.o(set2, "set2");
        return new e<E>(set, set2){
            final Set c0;
            final Set q;
            {
                this.q = set;
                this.c0 = set2;
                super(null);
            }

            @Override
            public boolean contains(Object object) {
                return this.q.contains(object) && this.c0.contains(object);
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return this.q.containsAll(collection) && this.c0.containsAll(collection);
            }

            public j0<E> e() {
                return new ax.r7.b<E>(this){
                    final Iterator<E> d0;
                    final a e0;
                    {
                        this.e0 = a8;
                        this.d0 = a8.q.iterator();
                    }

                    @Override
                    protected E b() {
                        while (this.d0.hasNext()) {
                            Object e8 = this.d0.next();
                            if (!this.e0.c0.contains(e8)) continue;
                            return e8;
                        }
                        return this.c();
                    }
                };
            }

            @Override
            public boolean isEmpty() {
                return Collections.disjoint(this.c0, this.q);
            }

            @Override
            public int size() {
                Iterator iterator = this.q.iterator();
                int n8 = 0;
                while (iterator.hasNext()) {
                    Object e8 = iterator.next();
                    if (!this.c0.contains(e8)) continue;
                    ++n8;
                }
                return n8;
            }
        };
    }

    public static <E> HashSet<E> f() {
        return new HashSet();
    }

    public static <E> HashSet<E> g(int n8) {
        return new HashSet(K.a(n8));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(K.f());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        n.n(collection);
        Collection<?> collection2 = collection;
        if (collection instanceof O) {
            collection2 = ((O)collection).H();
        }
        if (collection2 instanceof Set && collection2.size() > set.size()) {
            return G.r(set.iterator(), collection2);
        }
        return d0.j(set, collection2.iterator());
    }

    static boolean j(Set<?> set, Iterator<?> iterator) {
        boolean bl = false;
        while (iterator.hasNext()) {
            bl |= set.remove(iterator.next());
        }
        return bl;
    }

    private static class b<E>
    extends j.a<E>
    implements Set<E> {
        b(Set<E> set, o<? super E> o8) {
            super(set, o8);
        }

        @Override
        public boolean equals(Object object) {
            return d0.a(this, object);
        }

        @Override
        public int hashCode() {
            return d0.d(this);
        }
    }

    private static class c<E>
    extends b<E>
    implements SortedSet<E> {
        c(SortedSet<E> sortedSet, o<? super E> o8) {
            super(sortedSet, o8);
        }

        @Override
        public Comparator<? super E> comparator() {
            return ((SortedSet)this.q).comparator();
        }

        @Override
        public E first() {
            return G.k(this.q.iterator(), this.c0);
        }

        @Override
        public SortedSet<E> headSet(E e8) {
            return new c(((SortedSet)this.q).headSet(e8), this.c0);
        }

        @Override
        public E last() {
            SortedSet sortedSet = (SortedSet)this.q;
            Object e8;
            while (!this.c0.apply(e8 = sortedSet.last())) {
                sortedSet = sortedSet.headSet(e8);
            }
            return e8;
        }

        @Override
        public SortedSet<E> subSet(E e8, E e9) {
            return new c(((SortedSet)this.q).subSet(e8, e9), this.c0);
        }

        @Override
        public SortedSet<E> tailSet(E e8) {
            return new c(((SortedSet)this.q).tailSet(e8), this.c0);
        }
    }

    static abstract class d<E>
    extends AbstractSet<E> {
        d() {
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return d0.i(this, collection);
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll(n.n(collection));
        }
    }

    public static abstract class e<E>
    extends AbstractSet<E> {
        private e() {
        }

        /* synthetic */ e(c0 c02) {
            this();
        }

        @Override
        @Deprecated
        public final boolean add(E e8) {
            throw new UnsupportedOperationException();
        }

        @Override
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override
        @Deprecated
        public final boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        @Override
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }
}

