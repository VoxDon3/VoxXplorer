/*
 * Decompiled with CFR 0.152.
 */
package ax.R3;

import ax.k4.h;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c {
    private final Map<ax.M3.h, a> a = new HashMap<ax.M3.h, a>();
    private final b b = new b();

    c() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(ax.M3.h h8) {
        synchronized (this) {
            try {
                a a8;
                a a9 = a8 = this.a.get(h8);
                if (a8 == null) {
                    a9 = this.b.a();
                    this.a.put(h8, a9);
                }
                ++a9.b;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl9 : MonitorExitStatement: MONITOREXIT : this
                a9.a.lock();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void b(ax.M3.h h8) {
        synchronized (this) {
            try {
                a a8 = h.d(this.a.get(h8));
                int n8 = a8.b;
                if (n8 >= 1) {
                    a8.b = --n8;
                    if (n8 == 0) {
                        a a9 = this.a.remove(h8);
                        if (!a9.equals(a8)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Removed the wrong lock, expected to remove: ");
                            stringBuilder.append(a8);
                            stringBuilder.append(", but actually removed: ");
                            stringBuilder.append(a9);
                            stringBuilder.append(", key: ");
                            stringBuilder.append(h8);
                            IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
                            throw illegalStateException;
                        }
                        this.b.b(a9);
                    }
                    // MONITOREXIT @DISABLED, blocks:[0, 3, 7] lbl26 : MonitorExitStatement: MONITOREXIT : this
                    a8.a.unlock();
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot release a lock that is not held, key: ");
                stringBuilder.append(h8);
                stringBuilder.append(", interestedThreads: ");
                stringBuilder.append(a8.b);
                IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
                throw illegalStateException;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static class a {
        final Lock a = new ReentrantLock();
        int b;

        a() {
        }
    }

    private static class b {
        private final Queue<a> a = new ArrayDeque<a>();

        b() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        a a() {
            Queue<a> queue = this.a;
            // MONITORENTER : queue
            a a8 = this.a.poll();
            // MONITOREXIT : queue
            if (a8 != null) return a8;
            return new a();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void b(a a8) {
            Queue<a> queue = this.a;
            synchronized (queue) {
                Throwable throwable2;
                block4: {
                    block3: {
                        try {
                            if (this.a.size() >= 10) break block3;
                            this.a.offer(a8);
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }
    }
}

