/*
 * Decompiled with CFR 0.152.
 */
package ax.Nb;

import ax.Fb.p;
import ax.Gb.l;
import ax.Nb.e;
import ax.Nb.f;
import ax.Nb.g;
import ax.sb.t;
import ax.xb.b;
import java.util.Iterator;

class i {
    public static final <T> Iterator<T> a(p<? super g<? super T>, ? super ax.wb.e<? super t>, ? extends Object> p8) {
        l.f(p8, "block");
        f f8 = new f();
        f8.m(b.a(p8, f8, f8));
        return f8;
    }

    public static <T> e<T> b(p<? super g<? super T>, ? super ax.wb.e<? super t>, ? extends Object> p8) {
        l.f(p8, "block");
        return new e<T>(p8){
            final p a;
            {
                this.a = p8;
            }

            @Override
            public Iterator<T> iterator() {
                return i.a(this.a);
            }
        };
    }
}

