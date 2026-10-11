package ax.Q3;

import ax.Q3.m;
import java.util.Queue;

/* loaded from: classes.dex */
abstract class c<T extends m> {
    private final Queue<T> a = ax.k4.i.e(20);

    c() {
    }

    protected abstract T a();

    protected T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
