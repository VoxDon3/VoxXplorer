package ax.r7;

import ax.q7.C2883j;
import ax.q7.InterfaceC2879f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class I {

    private static class a<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        final InterfaceC2879f<? super F, ? extends T> c0;
        final List<F> q;

        /* renamed from: ax.r7.I$a$a, reason: collision with other inner class name */
        class C0439a extends i0<F, T> {
            C0439a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // ax.r7.h0
            T b(F f) {
                return a.this.c0.apply(f);
            }
        }

        a(List<F> list, InterfaceC2879f<? super F, ? extends T> interfaceC2879f) {
            this.q = (List) ax.q7.n.n(list);
            this.c0 = (InterfaceC2879f) ax.q7.n.n(interfaceC2879f);
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.c0.apply(this.q.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.q.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new C0439a(this.q.listIterator(i));
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.c0.apply(this.q.remove(i));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            this.q.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.q.size();
        }
    }

    private static class b<F, T> extends AbstractSequentialList<T> implements Serializable {
        final InterfaceC2879f<? super F, ? extends T> c0;
        final List<F> q;

        class a extends i0<F, T> {
            a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // ax.r7.h0
            T b(F f) {
                return b.this.c0.apply(f);
            }
        }

        b(List<F> list, InterfaceC2879f<? super F, ? extends T> interfaceC2879f) {
            this.q = (List) ax.q7.n.n(list);
            this.c0 = (InterfaceC2879f) ax.q7.n.n(interfaceC2879f);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.q.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new a(this.q.listIterator(i));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            this.q.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.q.size();
        }
    }

    static <T> List<T> a(Iterable<T> iterable) {
        return (List) iterable;
    }

    static boolean b(List<?> list, Object obj) {
        if (obj == ax.q7.n.n(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return G.f(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C2883j.a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    static int c(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return d(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C2883j.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int d(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    static int e(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return f(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C2883j.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int f(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> g() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> h(Iterator<? extends E> it) {
        ArrayList<E> g = g();
        G.a(g, it);
        return g;
    }

    public static <F, T> List<T> i(List<F> list, InterfaceC2879f<? super F, ? extends T> interfaceC2879f) {
        return list instanceof RandomAccess ? new a(list, interfaceC2879f) : new b(list, interfaceC2879f);
    }
}
