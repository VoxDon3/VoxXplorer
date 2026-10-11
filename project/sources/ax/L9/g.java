package ax.L9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class g implements Executor {
    private AtomicInteger q = new AtomicInteger(0);

    class a implements Runnable {
        final /* synthetic */ Runnable q;

        a(Runnable runnable) {
            this.q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.q.incrementAndGet();
            this.q.run();
            g.this.q.decrementAndGet();
        }
    }

    public int b() {
        return this.q.get();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(new a(runnable));
    }
}
