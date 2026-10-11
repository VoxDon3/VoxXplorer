package ax.u3;

import ax.b3.K;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: ax.u3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3202t<T> {
    private ConcurrentLinkedQueue<T> a = new ConcurrentLinkedQueue<>();

    public T a() throws K {
        T poll = this.a.poll();
        return poll == null ? d() : poll;
    }

    public void b() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        this.a.clear();
    }

    protected abstract void c(T t);

    protected abstract T d() throws K;

    public void e(T t) {
        if (t == null) {
            return;
        }
        this.a.offer(t);
    }
}
