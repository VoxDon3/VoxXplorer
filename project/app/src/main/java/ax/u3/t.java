/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import ax.b3.K;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class t<T> {
    private ConcurrentLinkedQueue<T> a = new ConcurrentLinkedQueue();

    public T a() throws K {
        T t8;
        T t9 = t8 = this.a.poll();
        if (t8 == null) {
            t9 = this.d();
        }
        return t9;
    }

    public void b() {
        Iterator<T> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            this.c(iterator.next());
        }
        this.a.clear();
    }

    protected abstract void c(T var1);

    protected abstract T d() throws K;

    public void e(T t8) {
        if (t8 == null) {
            return;
        }
        this.a.offer(t8);
    }
}

