/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.o;
import ax.j6.q;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class p<T>
implements q<T> {
    private final CountDownLatch a = new CountDownLatch(1);

    /* synthetic */ p(o o8) {
    }

    @Override
    public final void a(T t8) {
        this.a.countDown();
    }

    public final void b() throws InterruptedException {
        this.a.await();
    }

    @Override
    public final void c() {
        this.a.countDown();
    }

    @Override
    public final void d(Exception exception) {
        this.a.countDown();
    }

    public final boolean e(long l8, TimeUnit timeUnit) throws InterruptedException {
        return this.a.await(l8, timeUnit);
    }
}

