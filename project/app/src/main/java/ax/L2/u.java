/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public class u
implements ax.N2.a {
    private final Executor c0;
    private Runnable d0;
    final Object e0;
    private final ArrayDeque<a> q;

    public u(Executor executor) {
        this.c0 = executor;
        this.q = new ArrayDeque();
        this.e0 = new Object();
    }

    void a() {
        Runnable runnable2;
        this.d0 = runnable2 = (Runnable)this.q.poll();
        if (runnable2 != null) {
            this.c0.execute(runnable2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void execute(Runnable runnable2) {
        Object object = this.e0;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        ArrayDeque<a> arrayDeque = this.q;
                        a a8 = new a(this, runnable2);
                        arrayDeque.add(a8);
                        if (this.d0 != null) break block3;
                        this.a();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean u() {
        Object object = this.e0;
        synchronized (object) {
            boolean bl = this.q.isEmpty();
            return bl ^ true;
        }
    }

    static class a
    implements Runnable {
        final Runnable c0;
        final u q;

        a(u u8, Runnable runnable2) {
            this.q = u8;
            this.c0 = runnable2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            try {
                this.c0.run();
                return;
            }
            finally {
                Object object = this.q.e0;
                synchronized (object) {
                    this.q.a();
                }
            }
        }
    }
}

