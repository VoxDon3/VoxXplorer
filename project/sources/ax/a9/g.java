package ax.a9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class g<V> extends AbstractFutureC1431a<List<V>> {
    private List<Future<V>> q;

    public g(List<Future<V>> list) {
        this.q = list;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<V> get() throws InterruptedException, ExecutionException {
        ArrayList arrayList = new ArrayList();
        Iterator<Future<V>> it = this.q.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().get());
        }
        return arrayList;
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        ArrayList arrayList = new ArrayList();
        Iterator<Future<V>> it = this.q.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().get(j, timeUnit));
        }
        return arrayList;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2;
        Iterator<Future<V>> it = this.q.iterator();
        while (true) {
            while (it.hasNext()) {
                z2 = z2 && it.next().cancel(z);
            }
            return z2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Iterator<Future<V>> it = this.q.iterator();
        while (it.hasNext()) {
            if (!it.next().isCancelled()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Iterator<Future<V>> it = this.q.iterator();
        while (it.hasNext()) {
            if (!it.next().isDone()) {
                return false;
            }
        }
        return true;
    }
}
