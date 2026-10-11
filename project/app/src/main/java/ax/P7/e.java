/*
 * Decompiled with CFR 0.152.
 */
package ax.P7;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import ax.G7.g;
import ax.J7.H;
import ax.J7.Z;
import ax.J7.u;
import ax.L7.F;
import ax.P7.c;
import ax.P7.d;
import ax.j6.k;
import ax.n5.h;
import ax.p5.l;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class e {
    private final double a;
    private final double b;
    private final long c;
    private final long d;
    private final int e;
    private final BlockingQueue<Runnable> f;
    private final ThreadPoolExecutor g;
    private final h<F> h;
    private final H i;
    private int j;
    private long k;

    @SuppressLint(value={"ThreadPoolCreation"})
    e(double d8, double d9, long l8, h<F> object, H h8) {
        int n8;
        this.a = d8;
        this.b = d9;
        this.c = l8;
        this.h = object;
        this.i = h8;
        this.d = SystemClock.elapsedRealtime();
        this.e = n8 = (int)d8;
        this.f = object = new ArrayBlockingQueue(n8);
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>)object);
        this.j = 0;
        this.k = 0L;
    }

    e(h<F> h8, ax.Q7.d d8, H h9) {
        this(d8.f, d8.g, (long)d8.h * 1000L, h8, h9);
    }

    public static /* synthetic */ void a(e e8, k k8, boolean bl, u u8, Exception exception) {
        e8.getClass();
        if (exception != null) {
            k8.d(exception);
            return;
        }
        if (bl) {
            e8.j();
        }
        k8.e(u8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void b(e e8, CountDownLatch countDownLatch) {
        e8.getClass();
        try {
            l.a(e8.h, ax.n5.e.d0);
        }
        catch (Exception exception) {}
        countDownLatch.countDown();
    }

    private double g() {
        return Math.min(3600000.0, 60000.0 / this.a * Math.pow(this.b, this.h()));
    }

    private int h() {
        if (this.k == 0L) {
            this.k = this.m();
        }
        int n8 = (int)((this.m() - this.k) / this.c);
        n8 = this.l() ? Math.min(100, this.j + n8) : Math.max(0, this.j - n8);
        if (this.j != n8) {
            this.j = n8;
            this.k = this.m();
        }
        return n8;
    }

    private boolean k() {
        return this.f.size() < this.e;
    }

    private boolean l() {
        return this.f.size() == this.e;
    }

    private long m() {
        return System.currentTimeMillis();
    }

    private void n(u u8, k<u> k8) {
        g g8 = ax.G7.g.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending report through Google DataTransport: ");
        stringBuilder.append(u8.d());
        g8.b(stringBuilder.toString());
        boolean bl = SystemClock.elapsedRealtime() - this.d < 2000L;
        this.h.b(ax.n5.c.g(u8.b()), new c(this, k8, bl, u8));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void o(double d8) {
        long l8 = (long)d8;
        try {
            Thread.sleep(l8);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    k<u> i(u u8, boolean bl) {
        BlockingQueue<Runnable> blockingQueue = this.f;
        synchronized (blockingQueue) {
            Throwable throwable2;
            block5: {
                k<u> k8;
                try {
                    k8 = new k<u>();
                    if (!bl) {
                        this.n(u8, k8);
                        return k8;
                    }
                    this.i.b();
                    if (this.k()) {
                        Object object = ax.G7.g.f();
                        Object object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Enqueueing report: ");
                        ((StringBuilder)object2).append(u8.d());
                        ((g)object).b(((StringBuilder)object2).toString());
                        object = ax.G7.g.f();
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Queue size: ");
                        ((StringBuilder)object2).append(this.f.size());
                        ((g)object).b(((StringBuilder)object2).toString());
                        object = this.g;
                        object2 = new b(this, u8, k8);
                        ((ThreadPoolExecutor)object).execute((Runnable)object2);
                        object = ax.G7.g.f();
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Closing task for report: ");
                        ((StringBuilder)object2).append(u8.d());
                        ((g)object).b(((StringBuilder)object2).toString());
                        k8.e(u8);
                        return k8;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.h();
                g g8 = ax.G7.g.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Dropping report due to queue being full: ");
                stringBuilder.append(u8.d());
                g8.b(stringBuilder.toString());
                this.i.a();
                k8.e(u8);
                return k8;
            }
            throw throwable2;
        }
    }

    @SuppressLint(value={"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new d(this, countDownLatch)).start();
        Z.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    private final class b
    implements Runnable {
        private final k<u> c0;
        final e d0;
        private final u q;

        private b(e e8, u u8, k<u> k8) {
            this.d0 = e8;
            this.q = u8;
            this.c0 = k8;
        }

        @Override
        public void run() {
            this.d0.n(this.q, this.c0);
            this.d0.i.c();
            double d8 = this.d0.g();
            g g8 = ax.G7.g.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Delay for: ");
            stringBuilder.append(String.format(Locale.US, "%.2f", d8 / 1000.0));
            stringBuilder.append(" s for report: ");
            stringBuilder.append(this.q.d());
            g8.b(stringBuilder.toString());
            ax.P7.e.o(d8);
        }
    }
}

