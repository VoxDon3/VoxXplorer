package ax.a9;

import ax.a9.AbstractFutureC1431a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class h<T, V> extends AbstractFutureC1431a<V> {
    private AbstractFutureC1431a.InterfaceC0255a<T, V> c0;
    private Future<T> q;

    public h(Future<T> future, AbstractFutureC1431a.InterfaceC0255a<T, V> interfaceC0255a) {
        this.q = future;
        this.c0 = interfaceC0255a;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.q.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return (V) this.c0.apply(this.q.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.q.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.q.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (V) this.c0.apply(this.q.get(j, timeUnit));
    }
}
