/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import java.util.concurrent.Executor;

class n
implements Executor {
    private final Executor q;

    n(Executor executor) {
        this.q = executor;
    }

    @Override
    public void execute(Runnable runnable2) {
        this.q.execute(new a(runnable2));
    }

    static class a
    implements Runnable {
        private final Runnable q;

        a(Runnable runnable2) {
            this.q = runnable2;
        }

        @Override
        public void run() {
            try {
                this.q.run();
                return;
            }
            catch (Exception exception) {
                ax.t5.a.d("Executor", "Background execution failure.", exception);
                return;
            }
        }
    }
}

