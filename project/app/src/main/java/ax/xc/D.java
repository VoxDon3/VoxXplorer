/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Fb.a;
import ax.Gb.g;
import ax.Gb.k;
import ax.Gb.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class D {
    public static final b Companion = new b(null);
    public static final D NONE = new D(){

        @Override
        public D deadlineNanoTime(long l8) {
            return this;
        }

        @Override
        public void throwIfReached() {
        }

        @Override
        public D timeout(long l8, TimeUnit timeUnit) {
            l.f((Object)timeUnit, "unit");
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void awaitSignal(Condition object) throws InterruptedIOException {
        l.f(object, "condition");
        try {
            boolean bl = this.hasDeadline();
            long l8 = this.timeoutNanos();
            long l9 = 0L;
            if (!bl && l8 == 0L) {
                object.await();
                return;
            }
            long l10 = System.nanoTime();
            if (bl && l8 != 0L) {
                l8 = Math.min(l8, this.deadlineNanoTime() - l10);
            } else if (bl) {
                l8 = this.deadlineNanoTime() - l10;
            }
            if (l8 > 0L) {
                object.await(l8, TimeUnit.NANOSECONDS);
                l9 = System.nanoTime() - l10;
            }
            if (l9 < l8) {
                return;
            }
            object = new InterruptedIOException("timeout");
            throw object;
        }
        catch (InterruptedException interruptedException) {
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

    public final D deadline(long l8, TimeUnit object) {
        l.f(object, "unit");
        if (l8 > 0L) {
            return this.deadlineNanoTime(System.nanoTime() + ((TimeUnit)((Object)object)).toNanos(l8));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("duration <= 0: ");
        ((StringBuilder)object).append(l8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public D deadlineNanoTime(long l8) {
        this.hasDeadline = true;
        this.deadlineNanoTime = l8;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(D d8, a<? extends T> object) {
        l.f(d8, "other");
        l.f(object, "block");
        long l8 = this.timeoutNanos();
        long l9 = Companion.a(d8.timeoutNanos(), this.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.timeout(l9, timeUnit);
        if (this.hasDeadline()) {
            l9 = this.deadlineNanoTime();
            if (d8.hasDeadline()) {
                this.deadlineNanoTime(Math.min(this.deadlineNanoTime(), d8.deadlineNanoTime()));
            }
            try {
                object = object.invoke();
            }
            catch (Throwable throwable) {
                k.b(1);
                this.timeout(l8, TimeUnit.NANOSECONDS);
                if (d8.hasDeadline()) {
                    this.deadlineNanoTime(l9);
                }
                k.a(1);
                throw throwable;
            }
            k.b(1);
            this.timeout(l8, timeUnit);
            if (d8.hasDeadline()) {
                this.deadlineNanoTime(l9);
            }
            k.a(1);
            return (T)object;
        }
        if (d8.hasDeadline()) {
            this.deadlineNanoTime(d8.deadlineNanoTime());
        }
        try {
            object = object.invoke();
        }
        catch (Throwable throwable) {
            k.b(1);
            this.timeout(l8, TimeUnit.NANOSECONDS);
            if (d8.hasDeadline()) {
                this.clearDeadline();
            }
            k.a(1);
            throw throwable;
        }
        k.b(1);
        this.timeout(l8, timeUnit);
        if (d8.hasDeadline()) {
            this.clearDeadline();
        }
        k.a(1);
        return (T)object;
    }

    public void throwIfReached() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0L) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public D timeout(long l8, TimeUnit object) {
        l.f(object, "unit");
        if (l8 >= 0L) {
            this.timeoutNanos = ((TimeUnit)((Object)object)).toNanos(l8);
            return this;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("timeout < 0: ");
        ((StringBuilder)object).append(l8);
        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    /*
     * Unable to fully structure code
     */
    public final void waitUntilNotified(Object var1_1) throws InterruptedIOException {
        block12: {
            block11: {
                l.f(var1_1, "monitor");
                try {
                    var9_3 = this.hasDeadline();
                    var3_4 = this.timeoutNanos();
                    var5_5 = 0L;
                    if (var9_3 || var3_4 != 0L) ** GOTO lbl13
                }
                catch (InterruptedException var1_2) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
                var1_1.wait();
                return;
lbl13:
                // 1 sources

                var7_6 = System.nanoTime();
                if (!var9_3 || var3_4 == 0L) break block11;
                var3_4 = Math.min(var3_4, this.deadlineNanoTime() - var7_6);
                break block12;
            }
            if (var9_3) {
                var3_4 = this.deadlineNanoTime() - var7_6;
            }
        }
        if (var3_4 > 0L) {
            var5_5 = var3_4 / 1000000L;
            Long.signum(var5_5);
            var2_7 = (int)(var3_4 - 1000000L * var5_5);
            var1_1.wait(var5_5, var2_7);
            var5_5 = System.nanoTime() - var7_6;
        }
        if (var5_5 < var3_4) {
            return;
        }
        var1_1 = new InterruptedIOException("timeout");
        throw var1_1;
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final long a(long l8, long l9) {
            if (l8 != 0L && (l9 == 0L || l8 < l9)) {
                return l8;
            }
            return l9;
        }
    }
}

