package ax.k9;

import ax.k9.C2414b;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ax.k9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2414b<A extends C2414b<A>> {
    private final AtomicInteger q = new AtomicInteger(1);

    public boolean c() {
        return this.q.get() > 0;
    }

    public A d() {
        if (this.q.getAndIncrement() > 0) {
            return this;
        }
        return null;
    }

    public boolean e() {
        return this.q.decrementAndGet() <= 0;
    }
}
