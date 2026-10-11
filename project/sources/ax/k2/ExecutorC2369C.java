package ax.k2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: ax.k2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC2369C implements Executor {
    private final ArrayDeque<Runnable> c0;
    private Runnable d0;
    private final Object e0;
    private final Executor q;

    public ExecutorC2369C(Executor executor) {
        ax.Gb.l.f(executor, "executor");
        this.q = executor;
        this.c0 = new ArrayDeque<>();
        this.e0 = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable runnable, ExecutorC2369C executorC2369C) {
        ax.Gb.l.f(runnable, "$command");
        ax.Gb.l.f(executorC2369C, "this$0");
        try {
            runnable.run();
        } finally {
            executorC2369C.c();
        }
    }

    public final void c() {
        synchronized (this.e0) {
            try {
                Runnable poll = this.c0.poll();
                Runnable runnable = poll;
                this.d0 = runnable;
                if (poll != null) {
                    this.q.execute(runnable);
                }
                ax.sb.t tVar = ax.sb.t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        ax.Gb.l.f(runnable, "command");
        synchronized (this.e0) {
            try {
                this.c0.offer(new Runnable() { // from class: ax.k2.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorC2369C.b(runnable, this);
                    }
                });
                if (this.d0 == null) {
                    c();
                }
                ax.sb.t tVar = ax.sb.t.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
