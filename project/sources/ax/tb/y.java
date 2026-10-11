package ax.tb;

import ax.sb.C3081m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class y extends x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements ax.Nb.e<T> {
        final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // ax.Nb.e
        public Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    public static <T> List<T> A(List<? extends T> list, int i) {
        ax.Gb.l.f(list, "<this>");
        if (i >= 0) {
            return S(list, ax.Lb.f.b(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> List<T> B(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        return (List) C(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C C(Iterable<? extends T> iterable, C c) {
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(c, "destination");
        for (T t : iterable) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static final <T> T D(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) E((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T E(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T F(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T G(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> int H(Iterable<? extends T> iterable, T t) {
        ax.Gb.l.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                C3141q.r();
            }
            if (ax.Gb.l.a(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A I(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> lVar) {
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(a2, "buffer");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(charSequence2, "prefix");
        ax.Gb.l.f(charSequence3, "postfix");
        ax.Gb.l.f(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            ax.Ob.h.a(a2, t, lVar);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static /* synthetic */ Appendable J(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l lVar, int i2, Object obj) {
        CharSequence charSequence5 = (i2 & 2) != 0 ? ", " : charSequence;
        int i3 = i2 & 4;
        CharSequence charSequence6 = HttpUrl.FRAGMENT_ENCODE_SET;
        CharSequence charSequence7 = i3 != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return I(iterable, appendable, charSequence5, charSequence7, charSequence6, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
    }

    public static final <T> String K(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> lVar) {
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(charSequence2, "prefix");
        ax.Gb.l.f(charSequence3, "postfix");
        ax.Gb.l.f(charSequence4, "truncated");
        return ((StringBuilder) I(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String L(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i2 & 4) != 0) {
            charSequence3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ax.Fb.l lVar2 = lVar;
        return K(iterable, charSequence, charSequence2, charSequence3, i, charSequence5, lVar2);
    }

    public static <T> T M(List<? extends T> list) {
        ax.Gb.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C3141q.k(list));
    }

    public static <T extends Comparable<? super T>> T N(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> O(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        ax.Gb.l.f(collection, "<this>");
        ax.Gb.l.f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            v.v(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> P(Collection<? extends T> collection, T t) {
        ax.Gb.l.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T extends Comparable<? super T>> List<T> Q(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> W = W(iterable);
            u.t(W);
            return W;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return V(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C3136l.q((Comparable[]) array);
        return C3136l.c(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> R(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> W = W(iterable);
            u.u(W, comparator);
            return W;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return V(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C3136l.r(array, comparator);
        return C3136l.c(array);
    }

    public static final <T> List<T> S(Iterable<? extends T> iterable, int i) {
        ax.Gb.l.f(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return C3141q.j();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return V(iterable);
            }
            if (i == 1) {
                return C3140p.d(D(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return C3141q.o(arrayList);
    }

    public static final <T, C extends Collection<? super T>> C T(Iterable<? extends T> iterable, C c) {
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(c, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static int[] U(Collection<Integer> collection) {
        ax.Gb.l.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> V(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C3141q.o(W(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C3141q.j();
        }
        if (size != 1) {
            return X(collection);
        }
        return C3140p.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final <T> List<T> W(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        return iterable instanceof Collection ? X((Collection) iterable) : (List) T(iterable, new ArrayList());
    }

    public static <T> List<T> X(Collection<? extends T> collection) {
        ax.Gb.l.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> Y(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C3123N.f((Set) T(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C3123N.d();
        }
        if (size != 1) {
            return (Set) T(iterable, new LinkedHashSet(C3117H.d(collection.size())));
        }
        return C3122M.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T, R> List<C3081m<T, R>> Z(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        ax.Gb.l.f(iterable, "<this>");
        ax.Gb.l.f(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.s(iterable, 10), r.s(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(ax.sb.q.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> ax.Nb.e<T> y(Iterable<? extends T> iterable) {
        ax.Gb.l.f(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> boolean z(Iterable<? extends T> iterable, T t) {
        ax.Gb.l.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : H(iterable, t) >= 0;
    }
}
