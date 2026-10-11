package ax.J7;

import android.annotation.SuppressLint;
import android.os.Looper;
import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import ax.j6.InterfaceC2319b;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class Z {
    private static final ExecutorService a = C0780z.c("awaitEvenIfOnMainThread task continuation executor");

    public static /* synthetic */ Object a(C2328k c2328k, AbstractC2327j abstractC2327j) {
        if (abstractC2327j.m()) {
            c2328k.c(abstractC2327j.j());
            return null;
        }
        if (abstractC2327j.i() == null) {
            return null;
        }
        c2328k.b(abstractC2327j.i());
        return null;
    }

    public static /* synthetic */ Object b(CountDownLatch countDownLatch, AbstractC2327j abstractC2327j) {
        countDownLatch.countDown();
        return null;
    }

    public static /* synthetic */ Void c(C2328k c2328k, AbstractC2327j abstractC2327j) {
        if (abstractC2327j.m()) {
            c2328k.e(abstractC2327j.j());
            return null;
        }
        if (abstractC2327j.i() == null) {
            return null;
        }
        c2328k.d(abstractC2327j.i());
        return null;
    }

    public static /* synthetic */ Void d(C2328k c2328k, AbstractC2327j abstractC2327j) {
        if (abstractC2327j.m()) {
            c2328k.e(abstractC2327j.j());
            return null;
        }
        if (abstractC2327j.i() == null) {
            return null;
        }
        c2328k.d(abstractC2327j.i());
        return null;
    }

    public static /* synthetic */ void e(Callable callable, Executor executor, final C2328k c2328k) {
        try {
            ((AbstractC2327j) callable.call()).g(executor, new InterfaceC2319b() { // from class: ax.J7.Y
                @Override // ax.j6.InterfaceC2319b
                public final Object a(AbstractC2327j abstractC2327j) {
                    return Z.a(C2328k.this, abstractC2327j);
                }
            });
        } catch (Exception e) {
            c2328k.b(e);
        }
    }

    public static <T> T f(AbstractC2327j<T> abstractC2327j) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC2327j.g(a, new InterfaceC2319b() { // from class: ax.J7.U
            @Override // ax.j6.InterfaceC2319b
            public final Object a(AbstractC2327j abstractC2327j2) {
                return Z.b(countDownLatch, abstractC2327j2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (abstractC2327j.m()) {
            return abstractC2327j.j();
        }
        if (abstractC2327j.k()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC2327j.l()) {
            throw new IllegalStateException(abstractC2327j.i());
        }
        throw new TimeoutException();
    }

    public static boolean g(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static <T> AbstractC2327j<T> h(final Executor executor, final Callable<AbstractC2327j<T>> callable) {
        final C2328k c2328k = new C2328k();
        executor.execute(new Runnable() { // from class: ax.J7.V
            @Override // java.lang.Runnable
            public final void run() {
                Z.e(callable, executor, c2328k);
            }
        });
        return c2328k.a();
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> AbstractC2327j<T> i(AbstractC2327j<T> abstractC2327j, AbstractC2327j<T> abstractC2327j2) {
        final C2328k c2328k = new C2328k();
        InterfaceC2319b<T, TContinuationResult> interfaceC2319b = new InterfaceC2319b() { // from class: ax.J7.X
            @Override // ax.j6.InterfaceC2319b
            public final Object a(AbstractC2327j abstractC2327j3) {
                return Z.d(C2328k.this, abstractC2327j3);
            }
        };
        abstractC2327j.f(interfaceC2319b);
        abstractC2327j2.f(interfaceC2319b);
        return c2328k.a();
    }

    public static <T> AbstractC2327j<T> j(Executor executor, AbstractC2327j<T> abstractC2327j, AbstractC2327j<T> abstractC2327j2) {
        final C2328k c2328k = new C2328k();
        InterfaceC2319b<T, TContinuationResult> interfaceC2319b = new InterfaceC2319b() { // from class: ax.J7.W
            @Override // ax.j6.InterfaceC2319b
            public final Object a(AbstractC2327j abstractC2327j3) {
                return Z.c(C2328k.this, abstractC2327j3);
            }
        };
        abstractC2327j.g(executor, interfaceC2319b);
        abstractC2327j2.g(executor, interfaceC2319b);
        return c2328k.a();
    }
}
