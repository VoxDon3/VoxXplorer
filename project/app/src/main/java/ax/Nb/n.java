/*
 * Decompiled with CFR 0.152.
 */
package ax.Nb;

import ax.Gb.l;
import ax.Nb.b;
import ax.Nb.c;
import ax.Nb.e;
import ax.Nb.m;
import ax.Ob.h;
import ax.tb.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class n
extends m {
    public static <T> Iterable<T> h(e<? extends T> e8) {
        l.f(e8, "<this>");
        return new Iterable<T>(e8){
            final e q;
            {
                this.q = e8;
            }

            @Override
            public Iterator<T> iterator() {
                return this.q.iterator();
            }
        };
    }

    public static <T> e<T> i(e<? extends T> object, int n8) {
        l.f(object, "<this>");
        if (n8 >= 0) {
            if (n8 == 0) {
                return object;
            }
            if (object instanceof c) {
                return ((c)object).a(n8);
            }
            return new b(object, n8);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Requested element count ");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    public static final <T, A extends Appendable> A j(e<? extends T> object, A a8, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> l8) {
        int n9;
        l.f(object, "<this>");
        l.f(a8, "buffer");
        l.f(charSequence, "separator");
        l.f(charSequence2, "prefix");
        l.f(charSequence3, "postfix");
        l.f(charSequence4, "truncated");
        a8.append(charSequence2);
        object = object.iterator();
        int n10 = 0;
        while (true) {
            n9 = n10++;
            if (!object.hasNext()) break;
            charSequence2 = object.next();
            if (n10 > 1) {
                a8.append(charSequence);
            }
            if (n8 >= 0) {
                n9 = n10;
                if (n10 > n8) break;
            }
            h.a(a8, charSequence2, l8);
        }
        if (n8 >= 0 && n9 > n8) {
            a8.append(charSequence4);
        }
        a8.append(charSequence3);
        return a8;
    }

    public static final <T> String k(e<? extends T> e8, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, ax.Fb.l<? super T, ? extends CharSequence> l8) {
        l.f(e8, "<this>");
        l.f(charSequence, "separator");
        l.f(charSequence2, "prefix");
        l.f(charSequence3, "postfix");
        l.f(charSequence4, "truncated");
        return n.j(e8, new StringBuilder(), charSequence, charSequence2, charSequence3, n8, charSequence4, l8).toString();
    }

    public static /* synthetic */ String l(e e8, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n8, CharSequence charSequence4, ax.Fb.l l8, int n9, Object object) {
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
        return n.k(e8, charSequence, charSequence2, charSequence3, n8, charSequence4, l8);
    }

    public static <T> List<T> m(e<? extends T> object) {
        l.f(object, "<this>");
        Iterator<T> iterator = object.iterator();
        if (!iterator.hasNext()) {
            return o.j();
        }
        T t8 = iterator.next();
        if (!iterator.hasNext()) {
            return o.d(t8);
        }
        object = new ArrayList();
        ((ArrayList)object).add(t8);
        while (iterator.hasNext()) {
            ((ArrayList)object).add(iterator.next());
        }
        return object;
    }
}

