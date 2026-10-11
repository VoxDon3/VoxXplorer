/*
 * Decompiled with CFR 0.152.
 */
package ax.Nb;

import ax.Gb.l;
import ax.Nb.e;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T>
implements e<T> {
    private final AtomicReference<e<T>> a;

    public a(e<? extends T> e8) {
        l.f(e8, "sequence");
        this.a = new AtomicReference<e<? extends T>>(e8);
    }

    @Override
    public Iterator<T> iterator() {
        e e8 = this.a.getAndSet(null);
        if (e8 != null) {
            return e8.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

