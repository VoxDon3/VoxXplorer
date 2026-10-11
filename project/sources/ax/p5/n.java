package ax.p5;

import ax.t5.C3102a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class n implements Executor {
    private final Executor q;

    static class a implements Runnable {
        private final Runnable q;

        a(Runnable runnable) {
            this.q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.q.run();
            } catch (Exception e) {
                C3102a.d("Executor", "Background execution failure.", e);
            }
        }
    }

    n(Executor executor) {
        this.q = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.q.execute(new a(runnable));
    }
}
