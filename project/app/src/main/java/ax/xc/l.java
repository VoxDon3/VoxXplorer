/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.xc.D;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class l
extends D {
    private D a;

    public l(D d8) {
        ax.Gb.l.f(d8, "delegate");
        this.a = d8;
    }

    public final D a() {
        return this.a;
    }

    public final l b(D d8) {
        ax.Gb.l.f(d8, "delegate");
        this.a = d8;
        return this;
    }

    @Override
    public D clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override
    public D clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override
    public long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override
    public D deadlineNanoTime(long l8) {
        return this.a.deadlineNanoTime(l8);
    }

    @Override
    public boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override
    public void throwIfReached() throws IOException {
        this.a.throwIfReached();
    }

    @Override
    public D timeout(long l8, TimeUnit timeUnit) {
        ax.Gb.l.f((Object)timeUnit, "unit");
        return this.a.timeout(l8, timeUnit);
    }

    @Override
    public long timeoutNanos() {
        return this.a.timeoutNanos();
    }
}

