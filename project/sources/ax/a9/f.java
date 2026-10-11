package ax.a9;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class f<V> extends AbstractFutureC1431a<V> {
    private e<V, ?> q;

    public f(e<V, ?> eVar) {
        this.q = eVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException {
        try {
            return this.q.e();
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.q.d();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        try {
            return this.q.f(j, timeUnit);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }
}
