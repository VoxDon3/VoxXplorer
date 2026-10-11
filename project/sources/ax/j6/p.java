package ax.j6;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class p<T> implements q<T> {
    private final CountDownLatch a = new CountDownLatch(1);

    /* synthetic */ p(o oVar) {
    }

    @Override // ax.j6.InterfaceC2324g
    public final void a(T t) {
        this.a.countDown();
    }

    public final void b() throws InterruptedException {
        this.a.await();
    }

    @Override // ax.j6.InterfaceC2321d
    public final void c() {
        this.a.countDown();
    }

    @Override // ax.j6.InterfaceC2323f
    public final void d(Exception exc) {
        this.a.countDown();
    }

    public final boolean e(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.await(j, timeUnit);
    }
}
