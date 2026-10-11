package ax.r7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class F {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends r<T> {
        final /* synthetic */ Iterable c0;
        final /* synthetic */ int d0;

        /* renamed from: ax.r7.F$a$a, reason: collision with other inner class name */
        class C0438a implements Iterator<T> {
            final /* synthetic */ Iterator c0;
            final /* synthetic */ a d0;
            boolean q = true;

            C0438a(a aVar, Iterator it) {
                this.c0 = it;
                this.d0 = aVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.c0.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                T t = (T) this.c0.next();
                this.q = false;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                C2975i.c(!this.q);
                this.c0.remove();
            }
        }

        a(Iterable iterable, int i) {
            this.c0 = iterable;
            this.d0 = i;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            Iterable iterable = this.c0;
            if (iterable instanceof List) {
                List list = (List) iterable;
                return list.subList(Math.min(list.size(), this.d0), list.size()).iterator();
            }
            Iterator<T> it = iterable.iterator();
            G.b(it, this.d0);
            return new C0438a(this, it);
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? collection.addAll((Collection) iterable) : G.a(collection, ((Iterable) ax.q7.n.n(iterable)).iterator());
    }

    public static <T> boolean b(Iterable<T> iterable, ax.q7.o<? super T> oVar) {
        return G.c(iterable.iterator(), oVar);
    }

    private static <E> Collection<E> c(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : I.h(iterable.iterator());
    }

    public static <T> T d(Iterable<? extends T> iterable, T t) {
        return (T) G.n(iterable.iterator(), t);
    }

    public static <T> T e(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) G.l(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) g(list);
    }

    public static <T> T f(Iterable<? extends T> iterable, T t) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) g(I.a(iterable));
            }
        }
        return (T) G.m(iterable.iterator(), t);
    }

    private static <T> T g(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T h(Iterable<T> iterable) {
        return (T) G.o(iterable.iterator());
    }

    public static <T> boolean i(Iterable<T> iterable, ax.q7.o<? super T> oVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? j((List) iterable, (ax.q7.o) ax.q7.n.n(oVar)) : G.s(iterable.iterator(), oVar);
    }

    private static <T> boolean j(List<T> list, ax.q7.o<? super T> oVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!oVar.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (IllegalArgumentException unused) {
                        l(list, oVar, i2, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        l(list, oVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }

    public static <T> Iterable<T> k(Iterable<T> iterable, int i) {
        ax.q7.n.n(iterable);
        ax.q7.n.e(i >= 0, "number to skip cannot be negative");
        return new a(iterable, i);
    }

    private static <T> void l(List<T> list, ax.q7.o<? super T> oVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (oVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    static Object[] m(Iterable<?> iterable) {
        return c(iterable).toArray();
    }

    public static String n(Iterable<?> iterable) {
        return G.u(iterable.iterator());
    }
}
