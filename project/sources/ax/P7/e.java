package ax.P7;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import ax.G7.g;
import ax.J7.AbstractC0775u;
import ax.J7.H;
import ax.J7.Z;
import ax.L7.F;
import ax.j6.C2328k;
import ax.n5.AbstractC2581c;
import ax.n5.h;
import ax.n5.j;
import ax.p5.l;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
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

    private final class b implements Runnable {
        private final C2328k<AbstractC0775u> c0;
        private final AbstractC0775u q;

        @Override // java.lang.Runnable
        public void run() {
            e.this.n(this.q, this.c0);
            e.this.i.c();
            double g = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g / 1000.0d)) + " s for report: " + this.q.d());
            e.o(g);
        }

        private b(AbstractC0775u abstractC0775u, C2328k<AbstractC0775u> c2328k) {
            this.q = abstractC0775u;
            this.c0 = c2328k;
        }
    }

    e(h<F> hVar, ax.Q7.d dVar, H h) {
        this(dVar.f, dVar.g, dVar.h * 1000, hVar, h);
    }

    public static /* synthetic */ void a(e eVar, C2328k c2328k, boolean z, AbstractC0775u abstractC0775u, Exception exc) {
        eVar.getClass();
        if (exc != null) {
            c2328k.d(exc);
            return;
        }
        if (z) {
            eVar.j();
        }
        c2328k.e(abstractC0775u);
    }

    public static /* synthetic */ void b(e eVar, CountDownLatch countDownLatch) {
        eVar.getClass();
        try {
            l.a(eVar.h, ax.n5.e.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.a) * Math.pow(this.b, h()));
    }

    private int h() {
        if (this.k == 0) {
            this.k = m();
        }
        int m = (int) ((m() - this.k) / this.c);
        int min = l() ? Math.min(100, this.j + m) : Math.max(0, this.j - m);
        if (this.j != min) {
            this.j = min;
            this.k = m();
        }
        return min;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final AbstractC0775u abstractC0775u, final C2328k<AbstractC0775u> c2328k) {
        g.f().b("Sending report through Google DataTransport: " + abstractC0775u.d());
        final boolean z = SystemClock.elapsedRealtime() - this.d < 2000;
        this.h.b(AbstractC2581c.g(abstractC0775u.b()), new j() { // from class: ax.P7.c
            @Override // ax.n5.j
            public final void a(Exception exc) {
                e.a(e.this, c2328k, z, abstractC0775u, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    C2328k<AbstractC0775u> i(AbstractC0775u abstractC0775u, boolean z) {
        synchronized (this.f) {
            try {
                C2328k<AbstractC0775u> c2328k = new C2328k<>();
                if (!z) {
                    n(abstractC0775u, c2328k);
                    return c2328k;
                }
                this.i.b();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + abstractC0775u.d());
                    this.i.a();
                    c2328k.e(abstractC0775u);
                    return c2328k;
                }
                g.f().b("Enqueueing report: " + abstractC0775u.d());
                g.f().b("Queue size: " + this.f.size());
                this.g.execute(new b(abstractC0775u, c2328k));
                g.f().b("Closing task for report: " + abstractC0775u.d());
                c2328k.e(abstractC0775u);
                return c2328k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: ax.P7.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(e.this, countDownLatch);
            }
        }).start();
        Z.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    e(double d, double d2, long j, h<F> hVar, H h) {
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = hVar;
        this.i = h;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }
}
