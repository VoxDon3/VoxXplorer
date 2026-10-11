/*
 * Decompiled with CFR 0.152.
 */
package ax.k9;

import java.util.concurrent.atomic.AtomicInteger;

public class b<A extends b<A>> {
    private final AtomicInteger q = new AtomicInteger(1);

    public boolean c() {
        return this.q.get() > 0;
    }

    public A d() {
        if (this.q.getAndIncrement() > 0) {
            return (A)this;
        }
        return null;
    }

    public boolean e() {
        return this.q.decrementAndGet() <= 0;
    }
}

