package ax.P0;

import ax.S0.d0;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class J {
    private final Object a = new Object();
    private final PriorityQueue<Integer> b = new PriorityQueue<>(10, Collections.reverseOrder());
    private int c = Integer.MIN_VALUE;

    public void a(int i) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public void b(int i) {
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(i));
            this.c = this.b.isEmpty() ? Integer.MIN_VALUE : ((Integer) d0.i(this.b.peek())).intValue();
            this.a.notifyAll();
        }
    }
}
