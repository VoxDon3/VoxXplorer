/*
 * Decompiled with CFR 0.152.
 */
package ax.l3;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;

public class b {
    private final Thread a = new Thread(new Runnable(this){
        final b q;
        {
            this.q = b8;
        }

        @Override
        public void run() {
            this.q.d();
        }
    });
    private final CountDownLatch b = new CountDownLatch(1);
    private volatile Looper c;

    public b() {
        this.c();
    }

    private void c() {
        try {
            this.a.start();
            this.b.await();
            return;
        }
        catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
        }
    }

    private void d() {
        Looper.prepare();
        this.c = Looper.myLooper();
        this.b.countDown();
        Looper.loop();
    }

    public Looper b() {
        return this.c;
    }
}

