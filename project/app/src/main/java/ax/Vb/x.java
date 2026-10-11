/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Fb.l;
import ax.Qb.I;
import ax.Vb.O;
import ax.sb.a;
import ax.sb.t;
import ax.wb.i;

public final class x {
    public static final <E> l<Throwable, t> a(l<? super E, t> l8, E e8, i i8) {
        return new l<Throwable, t>(l8, e8, i8){
            final E c0;
            final i d0;
            final l<E, t> q;
            {
                this.q = l8;
                this.c0 = e8;
                this.d0 = i8;
                super(1);
            }

            public final void a(Throwable throwable) {
                x.b(this.q, this.c0, this.d0);
            }
        };
    }

    public static final <E> void b(l<? super E, t> object, E e8, i i8) {
        if ((object = x.c(object, e8, null)) != null) {
            I.a(i8, (Throwable)object);
        }
    }

    public static final <E> O c(l<? super E, t> l8, E e8, O serializable) {
        try {
            l8.invoke(e8);
            return serializable;
        }
        catch (Throwable throwable) {
            if (serializable != null && ((Throwable)serializable).getCause() != throwable) {
                a.a((Throwable)serializable, throwable);
                return serializable;
            }
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Exception in undelivered element handler for ");
            ((StringBuilder)serializable).append(e8);
            return new O(((StringBuilder)serializable).toString(), throwable);
        }
    }

    public static /* synthetic */ O d(l l8, Object object, O o8, int n8, Object object2) {
        if ((n8 & 2) != 0) {
            o8 = null;
        }
        return x.c(l8, object, o8);
    }
}

