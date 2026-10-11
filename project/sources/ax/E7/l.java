package ax.E7;

import ax.M5.C0821p;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class l implements Executor {
    private static final Logger g0 = Logger.getLogger(l.class.getName());
    private final Deque<Runnable> c0 = new ArrayDeque();
    private c d0 = c.IDLE;
    private long e0 = 0;
    private final b f0 = new b(this, null);
    private final Executor q;

    class a implements Runnable {
        final /* synthetic */ Runnable q;

        a(Runnable runnable) {
            this.q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.run();
        }

        public String toString() {
            return this.q.toString();
        }
    }

    private final class b implements Runnable {
        Runnable q;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        
            r8.q.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
        
            r8.q = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            ax.E7.l.g0.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.q, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
            L2:
                ax.E7.l r2 = ax.E7.l.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = ax.E7.l.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                ax.E7.l r0 = ax.E7.l.this     // Catch: java.lang.Throwable -> L20
                ax.E7.l$c r0 = ax.E7.l.b(r0)     // Catch: java.lang.Throwable -> L20
                ax.E7.l$c r3 = ax.E7.l.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L7d
            L22:
                ax.E7.l r0 = ax.E7.l.this     // Catch: java.lang.Throwable -> L20
                ax.E7.l.e(r0)     // Catch: java.lang.Throwable -> L20
                ax.E7.l r0 = ax.E7.l.this     // Catch: java.lang.Throwable -> L20
                ax.E7.l.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                ax.E7.l r3 = ax.E7.l.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = ax.E7.l.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.q = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                ax.E7.l r0 = ax.E7.l.this     // Catch: java.lang.Throwable -> L20
                ax.E7.l$c r3 = ax.E7.l.c.IDLE     // Catch: java.lang.Throwable -> L20
                ax.E7.l.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.q     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            L55:
                r8.q = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L7f
            L5a:
                r0 = move-exception
                goto L7a
            L5c:
                r3 = move-exception
                java.util.logging.Logger r4 = ax.E7.l.f()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.q     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7a:
                r8.q = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L7d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L7f:
                if (r1 == 0) goto L88
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L88:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.E7.l.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (l.this.c0) {
                    l.this.d0 = c.IDLE;
                    throw e;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.q;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + l.this.d0 + "}";
        }

        /* synthetic */ b(l lVar, a aVar) {
            this();
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    l(Executor executor) {
        this.q = (Executor) C0821p.l(executor);
    }

    static /* synthetic */ long e(l lVar) {
        long j = lVar.e0;
        lVar.e0 = 1 + j;
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            ax.M5.C0821p.l(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.c0
            monitor-enter(r0)
            ax.E7.l$c r1 = r7.d0     // Catch: java.lang.Throwable -> L6d
            ax.E7.l$c r2 = ax.E7.l.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            ax.E7.l$c r2 = ax.E7.l.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.e0     // Catch: java.lang.Throwable -> L6d
            ax.E7.l$a r1 = new ax.E7.l$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque<java.lang.Runnable> r8 = r7.c0     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            ax.E7.l$c r8 = ax.E7.l.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.d0 = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.q     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            ax.E7.l$b r5 = r7.f0     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            ax.E7.l$c r0 = r7.d0
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.c0
            monitor-enter(r0)
            long r5 = r7.e0     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            ax.E7.l$c r1 = r7.d0     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.d0 = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque<java.lang.Runnable> r2 = r7.c0
            monitor-enter(r2)
            ax.E7.l$c r0 = r7.d0     // Catch: java.lang.Throwable -> L55
            ax.E7.l$c r3 = ax.E7.l.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            ax.E7.l$c r3 = ax.E7.l.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque<java.lang.Runnable> r0 = r7.c0     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque<java.lang.Runnable> r1 = r7.c0     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.E7.l.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.q + "}";
    }
}
