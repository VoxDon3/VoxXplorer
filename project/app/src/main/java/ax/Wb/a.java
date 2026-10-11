/*
 * Decompiled with CFR 0.152.
 */
package ax.Wb;

import ax.Fb.l;
import ax.Fb.p;
import ax.Vb.k;
import ax.sb.n;
import ax.sb.o;
import ax.sb.t;
import ax.wb.e;
import ax.xb.b;

public final class a {
    private static final void a(e<?> e8, Throwable throwable) {
        n.a a8 = n.q;
        e8.f(n.a(o.a(throwable)));
        throw throwable;
    }

    public static final <R, T> void b(p<? super R, ? super e<? super T>, ? extends Object> object, R object2, e<? super T> e8, l<? super Throwable, t> l8) {
        try {
            object = b.b(b.a(object, object2, e8));
            object2 = n.q;
            k.b(object, n.a(t.a), l8);
            return;
        }
        catch (Throwable throwable) {
            a.a(e8, throwable);
            return;
        }
    }

    public static final void c(e<? super t> object, e<?> e8) {
        try {
            e<? super t> e9 = b.b(object);
            object = n.q;
            k.c(e9, n.a(t.a), null, 2, null);
            return;
        }
        catch (Throwable throwable) {
            a.a(e8, throwable);
            return;
        }
    }

    public static /* synthetic */ void d(p p8, Object object, e e8, l l8, int n8, Object object2) {
        if ((n8 & 4) != 0) {
            l8 = null;
        }
        a.b(p8, object, e8, l8);
    }
}

