/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import ax.S0.d0;
import java.util.Collections;
import java.util.PriorityQueue;

public final class J {
    private final Object a = new Object();
    private final PriorityQueue<Integer> b = new PriorityQueue(10, Collections.reverseOrder());
    private int c = Integer.MIN_VALUE;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n8) {
        Object object = this.a;
        synchronized (object) {
            this.b.add(n8);
            this.c = Math.max(this.c, n8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(int n8) {
        Object object = this.a;
        synchronized (object) {
            this.b.remove(n8);
            n8 = this.b.isEmpty() ? Integer.MIN_VALUE : d0.i(this.b.peek());
            this.c = n8;
            this.a.notifyAll();
            return;
        }
    }
}

