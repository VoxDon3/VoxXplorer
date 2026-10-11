/*
 * Decompiled with CFR 0.152.
 */
package ax.Nb;

import ax.Nb.a;
import ax.Nb.d;
import ax.Nb.e;
import ax.Nb.j;
import ax.Nb.k;
import java.util.Iterator;

class l
extends j {
    public static /* synthetic */ Object c(ax.Fb.a a8, Object object) {
        return l.g(a8, object);
    }

    public static <T> e<T> d(Iterator<? extends T> iterator) {
        ax.Gb.l.f(iterator, "<this>");
        return l.e(new e<T>(iterator){
            final Iterator a;
            {
                this.a = iterator;
            }

            @Override
            public Iterator<T> iterator() {
                return this.a;
            }
        });
    }

    public static final <T> e<T> e(e<? extends T> e8) {
        ax.Gb.l.f(e8, "<this>");
        if (e8 instanceof a) {
            return e8;
        }
        return new a<T>(e8);
    }

    public static <T> e<T> f(ax.Fb.a<? extends T> a8) {
        ax.Gb.l.f(a8, "nextFunction");
        return l.e(new d<T>(a8, new k(a8)));
    }

    private static final Object g(ax.Fb.a a8, Object object) {
        ax.Gb.l.f(object, "it");
        return a8.invoke();
    }
}

