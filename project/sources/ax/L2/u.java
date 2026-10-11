package ax.L2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class u implements ax.N2.a {
    private final Executor c0;
    private Runnable d0;
    private final ArrayDeque<a> q = new ArrayDeque<>();
    final Object e0 = new Object();

    static class a implements Runnable {
        final Runnable c0;
        final u q;

        a(u uVar, Runnable runnable) {
            this.q = uVar;
            this.c0 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.c0.run();
                synchronized (this.q.e0) {
                    this.q.a();
                }
            } catch (Throwable th) {
                synchronized (this.q.e0) {
                    this.q.a();
                    throw th;
                }
            }
        }
    }

    public u(Executor executor) {
        this.c0 = executor;
    }

    void a() {
        a poll = this.q.poll();
        this.d0 = poll;
        if (poll != null) {
            this.c0.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.e0) {
            try {
                this.q.add(new a(this, runnable));
                if (this.d0 == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.N2.a
    public boolean u() {
        boolean z;
        synchronized (this.e0) {
            z = !this.q.isEmpty();
        }
        return z;
    }
}
