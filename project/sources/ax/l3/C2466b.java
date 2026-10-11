package ax.l3;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* renamed from: ax.l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2466b {
    private final Thread a = new Thread(new a());
    private final CountDownLatch b = new CountDownLatch(1);
    private volatile Looper c;

    /* renamed from: ax.l3.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2466b.this.d();
        }
    }

    public C2466b() {
        c();
    }

    private void c() {
        try {
            this.a.start();
            this.b.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Looper.prepare();
        this.c = Looper.myLooper();
        this.b.countDown();
        Looper.loop();
    }

    public Looper b() {
        return this.c;
    }
}
