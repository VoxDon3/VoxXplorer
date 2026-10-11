package ax.u3;

import android.os.Process;
import ax.u3.AbstractC3199q;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ax.u3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3204v {
    private static final int a;
    private static final int b;
    private static final int c;
    private static HashMap<AbstractC3199q.e, ThreadPoolExecutor> d;
    private static HashMap<AbstractC3199q.e, b> e;

    /* renamed from: ax.u3.v$a */
    private static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);
        private AbstractC3199q.e b;

        /* renamed from: ax.u3.v$a$a, reason: collision with other inner class name */
        class RunnableC0469a implements Runnable {
            final /* synthetic */ Runnable q;

            RunnableC0469a(Runnable runnable) {
                this.q = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(a.this.b.h());
                this.q.run();
            }
        }

        public a(AbstractC3199q.e eVar) {
            this.b = eVar;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(null, new RunnableC0469a(runnable), "TaskExecutor P[" + this.b.name() + "] #" + this.a.getAndIncrement(), 32768L);
        }
    }

    /* renamed from: ax.u3.v$b */
    private static class b implements Executor {
        Runnable c0;
        AbstractC3199q.e d0;
        final ArrayDeque<Runnable> q = new ArrayDeque<>();

        /* renamed from: ax.u3.v$b$a */
        class a implements Runnable {
            final /* synthetic */ Runnable q;

            a(Runnable runnable) {
                this.q = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.q.run();
                } finally {
                    b.this.a();
                }
            }
        }

        public b(AbstractC3199q.e eVar) {
            this.d0 = eVar;
        }

        protected synchronized void a() {
            Runnable poll = this.q.poll();
            this.c0 = poll;
            if (poll != null) {
                C3204v.f(this.d0).execute(this.c0);
            }
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            this.q.offer(new a(runnable));
            if (this.c0 == null) {
                a();
            }
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        int i = availableProcessors + 1;
        b = i;
        int i2 = (availableProcessors * 2) + 1;
        c = i2;
        d = new HashMap<>();
        e = new HashMap<>();
        AbstractC3199q.e eVar = AbstractC3199q.e.CONNECT;
        b(eVar, i, i2, 256);
        AbstractC3199q.e eVar2 = AbstractC3199q.e.HIGHER;
        b(eVar2, i, i2, 256);
        AbstractC3199q.e eVar3 = AbstractC3199q.e.HIGH;
        b(eVar3, i, i2, 20480);
        AbstractC3199q.e eVar4 = AbstractC3199q.e.NORMAL;
        b(eVar4, i, i2, 256);
        AbstractC3199q.e eVar5 = AbstractC3199q.e.LOW;
        b(eVar5, i, i2, 256);
        b(AbstractC3199q.e.IMAGE_CACHE_LOADER, 2, 2, 1000000);
        b(AbstractC3199q.e.IMAGE_LOADER, 3, 3, 1000000);
        AbstractC3199q.e eVar6 = AbstractC3199q.e.FILE_SCAN;
        b(eVar6, 1, 1, 256);
        a(eVar);
        a(eVar2);
        a(eVar3);
        a(eVar4);
        a(eVar5);
        a(eVar6);
    }

    private static void a(AbstractC3199q.e eVar) {
        e.put(eVar, new b(eVar));
    }

    private static void b(AbstractC3199q.e eVar, int i, int i2, int i3) {
        d.put(eVar, new ThreadPoolExecutor(i, i2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(i3), new a(eVar)));
    }

    public static Executor c() {
        return d.get(AbstractC3199q.e.IMAGE_CACHE_LOADER);
    }

    public static Executor d() {
        return d.get(AbstractC3199q.e.IMAGE_LOADER);
    }

    public static Executor e(AbstractC3199q.e eVar) {
        return e.get(eVar);
    }

    public static Executor f(AbstractC3199q.e eVar) {
        return d.get(eVar);
    }
}
