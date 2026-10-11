/*
 * Decompiled with CFR 0.152.
 */
package ax.tb;

import ax.Lb.f;
import ax.Nb.e;
import ax.Ob.h;
import ax.sb.m;
import ax.tb.H;
import ax.tb.M;
import ax.tb.N;
import ax.tb.l;
import ax.tb.p;
import ax.tb.q;
import ax.tb.r;
import ax.tb.u;
import ax.tb.v;
import ax.tb.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

class y
extends x {
    public static <T> List<T> A(List<? extends T> object, int n8) {
        ax.Gb.l.f(object, "<this>");
        if (n8 >= 0) {
            return y.S((Iterable)object, f.b(object.size() - n8, 0));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Requested element count ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    public static <T> List<T> B(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        return y.C(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C C(Iterable<? extends T> iterable2, C c8) {
        ax.Gb.l.f(iterable2, "<this>");
        ax.Gb.l.f(c8, "destination");
        for (Iterable<T> iterable2 : iterable2) {
            if (iterable2 == null) continue;
            c8.add(iterable2);
        }
        return c8;
    }

    public static final <T> T D(Iterable<? extends T> object) {
        ax.Gb.l.f(object, "<this>");
        if (object instanceof List) {
            return y.E((List)object);
        }
        if ((object = object.iterator()).hasNext()) {
            return (T)object.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T E(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T F(Iterable<? extends T> object) {
        ax.Gb.l.f(object, "<this>");
        if (object instanceof List) {
            if ((object = (List)object).isEmpty()) {
                return null;
            }
            return (T)object.get(0);
        }
        if (!(object = object.iterator()).hasNext()) {
            return null;
        }
        return (T)object.next();
    }

    public static <T> T G(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> int H(Iterable<? extends T> object, T t8) {
        ax.Gb.l.f(object, "<this>");
        if (object instanceof List) {
            return ((List)object).indexOf(t8);
        }
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            Object e8 = object.next();
            if (n8 < 0) {
                q.r();
            }
            if (ax.Gb.l.a(t8, e8)) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A I(Iterable<? extends T> iterable, A a8, CharSequence charSequence, CharSequence object, CharSequence charSequence2, int n8, CharSequence charSequence3, ax.Fb.l<? super T, ? extends CharSequence> l8) {
        int n9;
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(a8, "buffer");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(object, "prefix");
        ax.Gb.l.f(charSequence2, "postfix");
        ax.Gb.l.f(charSequence3, "truncated");
        a8.append((CharSequence)object);
        object = iterable.iterator();
        int n10 = 0;
        while (true) {
            n9 = n10++;
            if (!object.hasNext()) break;
            iterable = object.next();
            if (n10 > 1) {
                a8.append(charSequence);
            }
            if (n8 >= 0) {
                n9 = n10;
                if (n10 > n8) break;
            }
            h.a(a8, iterable, l8);
        }
        if (n8 >= 0 && n9 > n8) {
            a8.append(charSequence3);
        }
        a8.append(charSequence2);
        return a8;
    }

    public static /* synthetic */ Appendable J(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence object, int n8, CharSequence charSequence3, ax.Fb.l l8, int n9, Object object2) {
        block5: {
            if ((n9 & 2) != 0) {
                charSequence = ", ";
            }
            object2 = "";
            if ((n9 & 4) != 0) {
                charSequence2 = "";
            }
            if ((n9 & 8) != 0) {
                object = object2;
            }
            if ((n9 & 0x10) != 0) {
                n8 = -1;
            }
            if ((n9 & 0x20) != 0) {
                charSequence3 = "...";
            }
            if ((n9 & 0x40) == 0) break block5;
            l8 = null;
        }
        return y.I(iterable, appendable, charSequence, charSequence2, (CharSequence)object, n8, charSequence3, l8);
    }

    public static final <T> String K(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> l8) {
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(charSequence2, "prefix");
        ax.Gb.l.f(charSequence3, "postfix");
        ax.Gb.l.f(charSequence4, "truncated");
        return y.I(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, n8, charSequence4, l8).toString();
    }

    public static /* synthetic */ String L(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, ax.Fb.l l8, int n9, Object object) {
        if ((n9 & 1) != 0) {
            charSequence = ", ";
        }
        if ((n9 & 2) != 0) {
            charSequence2 = "";
        }
        if ((n9 & 4) != 0) {
            charSequence3 = "";
        }
        if ((n9 & 8) != 0) {
            n8 = -1;
        }
        if ((n9 & 0x10) != 0) {
            charSequence4 = "...";
        }
        if ((n9 & 0x20) != 0) {
            l8 = null;
        }
        return y.K(iterable, charSequence, charSequence2, charSequence3, n8, charSequence4, l8);
    }

    public static <T> T M(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(q.k(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T extends Comparable<? super T>> T N(Iterable<? extends T> object) {
        ax.Gb.l.f(object, "<this>");
        Iterator<T> iterator = object.iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        object = (Comparable)iterator.next();
        while (iterator.hasNext()) {
            Comparable comparable = (Comparable)iterator.next();
            if (object.compareTo(comparable) <= 0) continue;
            object = comparable;
        }
        return (T)object;
    }

    public static <T> List<T> O(Collection<? extends T> collection, Iterable<? extends T> collection2) {
        ax.Gb.l.f(collection, "<this>");
        ax.Gb.l.f(collection2, "elements");
        if (collection2 instanceof Collection) {
            int n8 = collection.size();
            collection2 = collection2;
            ArrayList<T> arrayList = new ArrayList<T>(n8 + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        collection = new ArrayList<T>(collection);
        v.v(collection, collection2);
        return collection;
    }

    public static <T> List<T> P(Collection<? extends T> collection, T t8) {
        ax.Gb.l.f(collection, "<this>");
        ArrayList<T> arrayList = new ArrayList<T>(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t8);
        return arrayList;
    }

    public static <T extends Comparable<? super T>> List<T> Q(Iterable<? extends T> comparableArray) {
        ax.Gb.l.f(comparableArray, "<this>");
        if (comparableArray instanceof Collection) {
            Collection collection = (Collection)comparableArray;
            if (collection.size() <= 1) {
                return y.V(comparableArray);
            }
            comparableArray = collection.toArray(new Comparable[0]);
            l.q(comparableArray);
            return l.c(comparableArray);
        }
        comparableArray = y.W(comparableArray);
        u.t(comparableArray);
        return comparableArray;
    }

    public static <T> List<T> R(Iterable<? extends T> objectArray, Comparator<? super T> comparator) {
        ax.Gb.l.f(objectArray, "<this>");
        ax.Gb.l.f(comparator, "comparator");
        if (objectArray instanceof Collection) {
            Collection collection = (Collection)objectArray;
            if (collection.size() <= 1) {
                return y.V(objectArray);
            }
            objectArray = collection.toArray(new Object[0]);
            l.r(objectArray, comparator);
            return l.c(objectArray);
        }
        objectArray = y.W(objectArray);
        u.u(objectArray, comparator);
        return objectArray;
    }

    public static final <T> List<T> S(Iterable<? extends T> iterator, int n8) {
        ax.Gb.l.f(iterator, "<this>");
        if (n8 >= 0) {
            if (n8 == 0) {
                return q.j();
            }
            if (iterator instanceof Collection) {
                if (n8 >= ((Collection)((Object)iterator)).size()) {
                    return y.V(iterator);
                }
                if (n8 == 1) {
                    return p.d(y.D(iterator));
                }
            }
            ArrayList arrayList = new ArrayList(n8);
            iterator = iterator.iterator();
            int n9 = 0;
            while (iterator.hasNext()) {
                int n10;
                arrayList.add(iterator.next());
                n9 = n10 = n9 + 1;
                if (n10 != n8) continue;
            }
            return q.o(arrayList);
        }
        iterator = new StringBuilder();
        ((StringBuilder)((Object)iterator)).append("Requested element count ");
        ((StringBuilder)((Object)iterator)).append(n8);
        ((StringBuilder)((Object)iterator)).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)((Object)iterator)).toString().toString());
    }

    public static final <T, C extends Collection<? super T>> C T(Iterable<? extends T> object, C c8) {
        ax.Gb.l.f(object, "<this>");
        ax.Gb.l.f(c8, "destination");
        object = object.iterator();
        while (object.hasNext()) {
            c8.add(object.next());
        }
        return c8;
    }

    public static int[] U(Collection<Integer> object) {
        ax.Gb.l.f(object, "<this>");
        int[] nArray = new int[object.size()];
        object = object.iterator();
        int n8 = 0;
        while (object.hasNext()) {
            nArray[n8] = ((Number)object.next()).intValue();
            ++n8;
        }
        return nArray;
    }

    public static <T> List<T> V(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            int n8 = collection.size();
            if (n8 != 0) {
                if (n8 != 1) {
                    return y.X(collection);
                }
                iterable = iterable instanceof List ? ((List)iterable).get(0) : collection.iterator().next();
                return p.d(iterable);
            }
            return q.j();
        }
        return q.o(y.W(iterable));
    }

    public static final <T> List<T> W(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return y.X((Collection)iterable);
        }
        return y.T(iterable, new ArrayList());
    }

    public static <T> List<T> X(Collection<? extends T> collection) {
        ax.Gb.l.f(collection, "<this>");
        return new ArrayList<T>(collection);
    }

    public static <T> Set<T> Y(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            int n8 = collection.size();
            if (n8 != 0) {
                if (n8 != 1) {
                    return y.T(iterable, new LinkedHashSet(H.d(collection.size())));
                }
                iterable = iterable instanceof List ? ((List)iterable).get(0) : collection.iterator().next();
                return M.c(iterable);
            }
            return N.d();
        }
        return N.f(y.T(iterable, new LinkedHashSet()));
    }

    public static <T, R> List<m<T, R>> Z(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(iterable2, "other");
        Iterator<T> iterator = iterable.iterator();
        Iterator<R> iterator2 = iterable2.iterator();
        iterable = new ArrayList<T>(Math.min(r.s(iterable, 10), r.s(iterable2, 10)));
        while (iterator.hasNext() && iterator2.hasNext()) {
            ((ArrayList)iterable).add(ax.sb.q.a(iterator.next(), iterator2.next()));
        }
        return iterable;
    }

    public static <T> e<T> y(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        return new e<T>(iterable){
            final Iterable a;
            {
                this.a = iterable;
            }

            @Override
            public Iterator<T> iterator() {
                return this.a.iterator();
            }
        };
    }

    public static <T> boolean z(Iterable<? extends T> iterable, T t8) {
        ax.Gb.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection)iterable).contains(t8);
        }
        return y.H(iterable, t8) >= 0;
    }
}

