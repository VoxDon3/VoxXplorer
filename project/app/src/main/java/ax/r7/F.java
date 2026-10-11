/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.n;
import ax.q7.o;
import ax.r7.G;
import ax.r7.I;
import ax.r7.i;
import ax.r7.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public final class F {
    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection)iterable);
        }
        return G.a(collection, n.n(iterable).iterator());
    }

    public static <T> boolean b(Iterable<T> iterable, o<? super T> o8) {
        return G.c(iterable.iterator(), o8);
    }

    private static <E> Collection<E> c(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection)iterable;
        }
        return I.h(iterable.iterator());
    }

    public static <T> T d(Iterable<? extends T> iterable, T t8) {
        return G.n(iterable.iterator(), t8);
    }

    public static <T> T e(Iterable<T> list) {
        if (list instanceof List) {
            if (!(list = (List)list).isEmpty()) {
                return F.g(list);
            }
            throw new NoSuchElementException();
        }
        return G.l(list.iterator());
    }

    public static <T> T f(Iterable<? extends T> iterable, T t8) {
        if (iterable instanceof Collection) {
            if (((Collection)iterable).isEmpty()) {
                return t8;
            }
            if (iterable instanceof List) {
                return F.g(I.a(iterable));
            }
        }
        return G.m(iterable.iterator(), t8);
    }

    private static <T> T g(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> T h(Iterable<T> iterable) {
        return G.o(iterable.iterator());
    }

    public static <T> boolean i(Iterable<T> iterable, o<? super T> o8) {
        if (iterable instanceof RandomAccess && iterable instanceof List) {
            return F.j((List)iterable, n.n(o8));
        }
        return G.s(iterable.iterator(), o8);
    }

    private static <T> boolean j(List<T> list, o<? super T> o8) {
        int n8;
        int n9 = 0;
        for (n8 = 0; n8 < list.size(); ++n8) {
            T t8 = list.get(n8);
            int n10 = n9;
            if (!o8.apply(t8)) {
                if (n8 > n9) {
                    try {
                        list.set(n9, t8);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        F.l(list, o8, n9, n8);
                        return true;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        F.l(list, o8, n9, n8);
                        return true;
                    }
                }
                n10 = n9 + 1;
            }
            n9 = n10;
        }
        list.subList(n9, list.size()).clear();
        return n8 != n9;
    }

    public static <T> Iterable<T> k(Iterable<T> iterable, int n8) {
        n.n(iterable);
        boolean bl = n8 >= 0;
        n.e(bl, "number to skip cannot be negative");
        return new r<T>(iterable, n8){
            final Iterable c0;
            final int d0;
            {
                this.c0 = iterable;
                this.d0 = n8;
            }

            @Override
            public Iterator<T> iterator() {
                Object object = this.c0;
                if (object instanceof List) {
                    object = (List)object;
                    return object.subList(Math.min(object.size(), this.d0), object.size()).iterator();
                }
                object = object.iterator();
                G.b(object, this.d0);
                return new Iterator<T>(){
                    final Iterator c0;
                    final a d0;
                    boolean q;
                    {
                        this.c0 = iterator;
                        this.d0 = a8;
                        this.q = true;
                    }

                    @Override
                    public boolean hasNext() {
                        return this.c0.hasNext();
                    }

                    @Override
                    public T next() {
                        Object e8 = this.c0.next();
                        this.q = false;
                        return e8;
                    }

                    @Override
                    public void remove() {
                        i.c(this.q ^ true);
                        this.c0.remove();
                    }
                };
            }
        };
    }

    private static <T> void l(List<T> list, o<? super T> o8, int n8, int n9) {
        for (int i8 = list.size() - 1; i8 > n9; --i8) {
            if (!o8.apply(list.get(i8))) continue;
            list.remove(i8);
        }
        --n9;
        while (n9 >= n8) {
            list.remove(n9);
            --n9;
        }
    }

    static Object[] m(Iterable<?> iterable) {
        return F.c(iterable).toArray();
    }

    public static String n(Iterable<?> iterable) {
        return G.u(iterable.iterator());
    }
}

