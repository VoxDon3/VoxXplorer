/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.os.Process;
import ax.u3.q;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class v {
    private static final int a;
    private static final int b;
    private static final int c;
    private static HashMap<q.e, ThreadPoolExecutor> d;
    private static HashMap<q.e, b> e;

    static {
        int n8;
        int n9;
        a = n9 = Runtime.getRuntime().availableProcessors();
        b = n8 = n9 + 1;
        c = n9 = n9 * 2 + 1;
        d = new HashMap();
        e = new HashMap();
        q.e e8 = q.e.c0;
        v.b(e8, n8, n9, 256);
        q.e e9 = q.e.d0;
        v.b(e9, n8, n9, 256);
        q.e e10 = q.e.e0;
        v.b(e10, n8, n9, 20480);
        q.e e11 = q.e.f0;
        v.b(e11, n8, n9, 256);
        q.e e12 = q.e.g0;
        v.b(e12, n8, n9, 256);
        v.b(q.e.h0, 2, 2, 1000000);
        v.b(q.e.i0, 3, 3, 1000000);
        q.e e13 = q.e.j0;
        v.b(e13, 1, 1, 256);
        v.a(e8);
        v.a(e9);
        v.a(e10);
        v.a(e11);
        v.a(e12);
        v.a(e13);
    }

    private static void a(q.e e8) {
        e.put(e8, new b(e8));
    }

    private static void b(q.e e8, int n8, int n9, int n10) {
        d.put(e8, new ThreadPoolExecutor(n8, n9, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(n10), new a(e8)));
    }

    public static Executor c() {
        return d.get((Object)q.e.h0);
    }

    public static Executor d() {
        return d.get((Object)q.e.i0);
    }

    public static Executor e(q.e e8) {
        return e.get((Object)e8);
    }

    public static Executor f(q.e e8) {
        return d.get((Object)e8);
    }

    private static class a
    implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);
        private q.e b;

        public a(q.e e8) {
            this.b = e8;
        }

        @Override
        public Thread newThread(Runnable runnable2) {
            runnable2 = new Runnable(){
                final a c0;
                final Runnable q;
                {
                    this.c0 = a8;
                    this.q = runnable2;
                }

                @Override
                public void run() {
                    Process.setThreadPriority((int)this.c0.b.h());
                    this.q.run();
                }
            };
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TaskExecutor P[");
            stringBuilder.append(this.b.name());
            stringBuilder.append("] #");
            stringBuilder.append(this.a.getAndIncrement());
            return new Thread(null, runnable2, stringBuilder.toString(), 32768L);
        }
    }

    private static class b
    implements Executor {
        Runnable c0;
        q.e d0;
        final ArrayDeque<Runnable> q = new ArrayDeque();

        public b(q.e e8) {
            this.d0 = e8;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected void a() {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    block4: {
                        try {
                            Runnable runnable2;
                            this.c0 = runnable2 = this.q.poll();
                            if (runnable2 == null) break block4;
                            v.f(this.d0).execute(this.c0);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void execute(Runnable runnable2) {
            synchronized (this) {
                Throwable throwable2;
                block5: {
                    block4: {
                        try {
                            ArrayDeque<Runnable> arrayDeque = this.q;
                            Runnable runnable3 = new Runnable(){
                                final b c0;
                                final Runnable q;
                                {
                                    this.c0 = b8;
                                    this.q = runnable2;
                                }

                                @Override
                                public void run() {
                                    try {
                                        this.q.run();
                                        return;
                                    }
                                    finally {
                                        this.c0.a();
                                    }
                                }
                            };
                            arrayDeque.offer(runnable3);
                            if (this.c0 != null) break block4;
                            this.a();
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    return;
                }
                throw throwable2;
            }
        }
    }
}

