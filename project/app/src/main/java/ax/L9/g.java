/*
 * Decompiled with CFR 0.152.
 */
package ax.L9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class g
implements Executor {
    private AtomicInteger q = new AtomicInteger(0);

    public int b() {
        return this.q.get();
    }

    @Override
    public void execute(Runnable runnable2) {
        new Handler(Looper.getMainLooper()).post(new Runnable(){
            final g c0;
            final Runnable q;
            {
                this.c0 = g8;
                this.q = runnable2;
            }

            @Override
            public void run() {
                this.c0.q.incrementAndGet();
                this.q.run();
                this.c0.q.decrementAndGet();
            }
        });
    }
}

