package ax.xc;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* loaded from: classes3.dex */
public class D {
    public static final b Companion = new b(null);
    public static final D NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        public final long a(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }

        private b() {
        }
    }

    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        ax.Gb.l.f(condition, "condition");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                condition.await(timeoutNanos, TimeUnit.NANOSECONDS);
                j = System.nanoTime() - nanoTime;
            }
            if (j >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public D clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public D clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final D deadline(long j, TimeUnit timeUnit) {
        ax.Gb.l.f(timeUnit, "unit");
        if (j > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(D d, ax.Fb.a<? extends T> aVar) {
        ax.Gb.l.f(d, "other");
        ax.Gb.l.f(aVar, "block");
        long timeoutNanos = timeoutNanos();
        long a2 = Companion.a(d.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a2, timeUnit);
        if (!hasDeadline()) {
            if (d.hasDeadline()) {
                deadlineNanoTime(d.deadlineNanoTime());
            }
            try {
                T invoke = aVar.invoke();
                ax.Gb.k.b(1);
                timeout(timeoutNanos, timeUnit);
                if (d.hasDeadline()) {
                    clearDeadline();
                }
                ax.Gb.k.a(1);
                return invoke;
            } catch (Throwable th) {
                ax.Gb.k.b(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (d.hasDeadline()) {
                    clearDeadline();
                }
                ax.Gb.k.a(1);
                throw th;
            }
        }
        long deadlineNanoTime = deadlineNanoTime();
        if (d.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), d.deadlineNanoTime()));
        }
        try {
            T invoke2 = aVar.invoke();
            ax.Gb.k.b(1);
            timeout(timeoutNanos, timeUnit);
            if (d.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            ax.Gb.k.a(1);
            return invoke2;
        } catch (Throwable th2) {
            ax.Gb.k.b(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (d.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            ax.Gb.k.a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public D timeout(long j, TimeUnit timeUnit) {
        ax.Gb.l.f(timeUnit, "unit");
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        ax.Gb.l.f(obj, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j2 = timeoutNanos / 1000000;
                Long.signum(j2);
                obj.wait(j2, (int) (timeoutNanos - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public D deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    public static final class a extends D {
        a() {
        }

        @Override // ax.xc.D
        public D timeout(long j, TimeUnit timeUnit) {
            ax.Gb.l.f(timeUnit, "unit");
            return this;
        }

        @Override // ax.xc.D
        public void throwIfReached() {
        }

        @Override // ax.xc.D
        public D deadlineNanoTime(long j) {
            return this;
        }
    }
}
