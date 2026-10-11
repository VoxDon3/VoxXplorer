/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import ax.q7.f;
import ax.q7.j;
import ax.q7.n;
import ax.r7.G;
import ax.r7.i0;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class I {
    static <T> List<T> a(Iterable<T> iterable) {
        return (List)iterable;
    }

    static boolean b(List<?> list, Object object) {
        if (object == n.n(list)) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        object = (List)object;
        int n8 = list.size();
        if (n8 != object.size()) {
            return false;
        }
        if (list instanceof RandomAccess && object instanceof RandomAccess) {
            for (int i8 = 0; i8 < n8; ++i8) {
                if (j.a(list.get(i8), object.get(i8))) continue;
                return false;
            }
            return true;
        }
        return G.f(list.iterator(), object.iterator());
    }

    static int c(List<?> object, Object object2) {
        if (object instanceof RandomAccess) {
            return I.d(object, object2);
        }
        object = object.listIterator();
        while (object.hasNext()) {
            if (!j.a(object2, object.next())) continue;
            return object.previousIndex();
        }
        return -1;
    }

    private static int d(List<?> list, Object object) {
        int n8;
        int n9 = list.size();
        int n10 = 0;
        if (object == null) {
            for (n8 = n10; n8 < n9; ++n8) {
                if (list.get(n8) != null) continue;
                return n8;
            }
        } else {
            for (n8 = 0; n8 < n9; ++n8) {
                if (!object.equals(list.get(n8))) continue;
                return n8;
            }
        }
        return -1;
    }

    static int e(List<?> object, Object object2) {
        if (object instanceof RandomAccess) {
            return I.f(object, object2);
        }
        object = object.listIterator(object.size());
        while (object.hasPrevious()) {
            if (!j.a(object2, object.previous())) continue;
            return object.nextIndex();
        }
        return -1;
    }

    private static int f(List<?> list, Object object) {
        if (object == null) {
            for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                if (list.get(i8) != null) continue;
                return i8;
            }
        } else {
            for (int i9 = list.size() - 1; i9 >= 0; --i9) {
                if (!object.equals(list.get(i9))) continue;
                return i9;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> g() {
        return new ArrayList();
    }

    public static <E> ArrayList<E> h(Iterator<? extends E> iterator) {
        ArrayList<E> arrayList = I.g();
        G.a(arrayList, iterator);
        return arrayList;
    }

    public static <F, T> List<T> i(List<F> list, f<? super F, ? extends T> f8) {
        if (list instanceof RandomAccess) {
            return new a<F, T>(list, f8);
        }
        return new b<F, T>(list, f8);
    }

    private static class a<F, T>
    extends AbstractList<T>
    implements RandomAccess,
    Serializable {
        final f<? super F, ? extends T> c0;
        final List<F> q;

        a(List<F> list, f<? super F, ? extends T> f8) {
            this.q = n.n(list);
            this.c0 = n.n(f8);
        }

        @Override
        public T get(int n8) {
            return this.c0.apply(this.q.get(n8));
        }

        @Override
        public boolean isEmpty() {
            return this.q.isEmpty();
        }

        @Override
        public Iterator<T> iterator() {
            return this.listIterator();
        }

        @Override
        public ListIterator<T> listIterator(int n8) {
            return new i0<F, T>(this, this.q.listIterator(n8)){
                final a c0;
                {
                    this.c0 = a8;
                    super(listIterator);
                }

                @Override
                T b(F f8) {
                    return this.c0.c0.apply(f8);
                }
            };
        }

        @Override
        public T remove(int n8) {
            return this.c0.apply(this.q.remove(n8));
        }

        @Override
        protected void removeRange(int n8, int n9) {
            this.q.subList(n8, n9).clear();
        }

        @Override
        public int size() {
            return this.q.size();
        }
    }

    private static class b<F, T>
    extends AbstractSequentialList<T>
    implements Serializable {
        final f<? super F, ? extends T> c0;
        final List<F> q;

        b(List<F> list, f<? super F, ? extends T> f8) {
            this.q = n.n(list);
            this.c0 = n.n(f8);
        }

        @Override
        public boolean isEmpty() {
            return this.q.isEmpty();
        }

        @Override
        public ListIterator<T> listIterator(int n8) {
            return new i0<F, T>(this, this.q.listIterator(n8)){
                final b c0;
                {
                    this.c0 = b8;
                    super(listIterator);
                }

                @Override
                T b(F f8) {
                    return this.c0.c0.apply(f8);
                }
            };
        }

        @Override
        protected void removeRange(int n8, int n9) {
            this.q.subList(n8, n9).clear();
        }

        @Override
        public int size() {
            return this.q.size();
        }
    }
}

