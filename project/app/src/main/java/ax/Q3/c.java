/*
 * Decompiled with CFR 0.152.
 */
package ax.Q3;

import ax.Q3.m;
import ax.k4.i;
import java.util.Queue;

abstract class c<T extends m> {
    private final Queue<T> a = i.e(20);

    c() {
    }

    protected abstract T a();

    protected T b() {
        m m8;
        m m9 = m8 = (m)this.a.poll();
        if (m8 == null) {
            m9 = this.a();
        }
        return (T)m9;
    }

    public void c(T t8) {
        if (this.a.size() < 20) {
            this.a.offer(t8);
        }
    }
}

