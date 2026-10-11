/*
 * Decompiled with CFR 0.152.
 */
package ax.ac;

import ax.Qb.l;
import ax.Qb.m;
import ax.ac.a;
import ax.j6.e;
import ax.j6.j;
import ax.sb.n;
import ax.sb.o;
import ax.yb.h;
import java.util.concurrent.CancellationException;

public final class b {
    public static final <T> Object a(j<T> j8, ax.wb.e<? super T> e8) {
        return b.b(j8, null, e8);
    }

    private static final <T> Object b(j<T> object, ax.j6.a object2, ax.wb.e<? super T> e8) {
        if (((j)object).l()) {
            object2 = ((j)object).i();
            if (object2 == null) {
                if (!((j)object).k()) {
                    return ((j)object).j();
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Task ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(" was cancelled normally.");
                throw new CancellationException(((StringBuilder)object2).toString());
            }
            throw object2;
        }
        object2 = new m<T>(ax.xb.b.b(e8), 1);
        ((m)object2).C();
        ((j)object).c(a.q, new e(object2){
            final l<T> a;
            {
                this.a = l8;
            }

            public final void a(j<T> object) {
                Object object2 = ((j)object).i();
                if (object2 == null) {
                    if (((j)object).k()) {
                        l.a.a(this.a, null, 1, null);
                        return;
                    }
                    object2 = this.a;
                    n.a a8 = n.q;
                    object2.f(n.a(((j)object).j()));
                    return;
                }
                object = this.a;
                n.a a9 = n.q;
                object.f(n.a(o.a((Throwable)object2)));
            }
        });
        object = ((m)object2).z();
        if (object == ax.xb.b.c()) {
            h.c(e8);
        }
        return object;
    }
}

