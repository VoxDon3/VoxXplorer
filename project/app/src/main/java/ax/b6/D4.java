/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.E4;
import ax.b6.H5;
import ax.b6.t4;

final class D4
implements E4 {
    D4() {
    }

    private static <E> t4<E> c(Object object, long l8) {
        return (t4)H5.B(object, l8);
    }

    @Override
    public final void a(Object object, long l8) {
        D4.c(object, l8).b();
    }

    @Override
    public final <E> void b(Object object, Object t42, long l8) {
        t4<E> t43 = D4.c(object, l8);
        t4<E> t44 = D4.c(t42, l8);
        int n8 = t43.size();
        int n9 = t44.size();
        t42 = t43;
        if (n8 > 0) {
            t42 = t43;
            if (n9 > 0) {
                t42 = t43;
                if (!t43.c()) {
                    t42 = t43.d(n9 + n8);
                }
                t42.addAll(t44);
            }
        }
        t43 = t44;
        if (n8 > 0) {
            t43 = t42;
        }
        H5.j(object, l8, t43);
    }
}

