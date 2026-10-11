/*
 * Decompiled with CFR 0.152.
 */
package ax.F8;

import ax.C8.b;
import ax.D8.a;
import java.util.Collections;
import java.util.Iterator;

public abstract class c<T>
extends b<T>
implements Iterable {
    protected byte[] c0;

    public c(ax.C8.c<?> c8, byte[] byArray) {
        super(c8);
        this.c0 = byArray;
    }

    public Iterator<b> iterator() {
        if (this.q.f() == ax.C8.a.d0) {
            ax.C8.c<a> c8 = ax.C8.c.n;
            return c8.j(new ax.A8.a()).a(c8, this.c0).iterator();
        }
        return Collections.singletonList(this).iterator();
    }
}

