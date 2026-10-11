/*
 * Decompiled with CFR 0.152.
 */
package ax.wb;

import ax.Gb.l;
import ax.wb.i;

public abstract class b<B extends i.b, E extends B>
implements i.c<E> {
    private final i.c<?> c0;
    private final ax.Fb.l<i.b, E> q;

    public b(i.c<B> c8, ax.Fb.l<? super i.b, ? extends E> c9) {
        l.f(c8, "baseKey");
        l.f(c9, "safeCast");
        this.q = c9;
        c9 = c8;
        if (c8 instanceof b) {
            c9 = ((b)c8).c0;
        }
        this.c0 = c9;
    }

    public final boolean a(i.c<?> c8) {
        l.f(c8, "key");
        return c8 == this || this.c0 == c8;
        {
        }
    }

    public final E b(i.b b8) {
        l.f(b8, "element");
        return (E)((i.b)this.q.invoke(b8));
    }
}

