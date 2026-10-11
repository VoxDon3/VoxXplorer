package ax.Nb;

import ax.tb.C3139o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class n extends m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements Iterable<T>, ax.Hb.a {
        final /* synthetic */ e q;

        public a(e eVar) {
            this.q = eVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.q.iterator();
        }
    }

    public static <T> Iterable<T> h(e<? extends T> eVar) {
        ax.Gb.l.f(eVar, "<this>");
        return new a(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> e<T> i(e<? extends T> eVar, int i) {
        ax.Gb.l.f(eVar, "<this>");
        if (i >= 0) {
            return i == 0 ? eVar : eVar instanceof c ? ((c) eVar).a(i) : new b(eVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static final <T, A extends Appendable> A j(e<? extends T> eVar, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> lVar) {
        ax.Gb.l.f(eVar, "<this>");
        ax.Gb.l.f(a2, "buffer");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(charSequence2, "prefix");
        ax.Gb.l.f(charSequence3, "postfix");
        ax.Gb.l.f(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : eVar) {
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

    public static final <T> String k(e<? extends T> eVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> lVar) {
        ax.Gb.l.f(eVar, "<this>");
        ax.Gb.l.f(charSequence, "separator");
        ax.Gb.l.f(charSequence2, "prefix");
        ax.Gb.l.f(charSequence3, "postfix");
        ax.Gb.l.f(charSequence4, "truncated");
        return ((StringBuilder) j(eVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String l(e eVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, ax.Fb.l lVar, int i2, Object obj) {
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
        return k(eVar, charSequence, charSequence2, charSequence3, i, charSequence5, lVar2);
    }

    public static <T> List<T> m(e<? extends T> eVar) {
        ax.Gb.l.f(eVar, "<this>");
        Iterator<? extends T> it = eVar.iterator();
        if (!it.hasNext()) {
            return C3139o.j();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return C3139o.d(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
