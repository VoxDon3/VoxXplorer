package ax.xc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class l extends D {
    private D a;

    public l(D d) {
        ax.Gb.l.f(d, "delegate");
        this.a = d;
    }

    public final D a() {
        return this.a;
    }

    public final l b(D d) {
        ax.Gb.l.f(d, "delegate");
        this.a = d;
        return this;
    }

    @Override // ax.xc.D
    public D clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // ax.xc.D
    public D clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // ax.xc.D
    public long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // ax.xc.D
    public boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // ax.xc.D
    public void throwIfReached() throws IOException {
        this.a.throwIfReached();
    }

    @Override // ax.xc.D
    public D timeout(long j, TimeUnit timeUnit) {
        ax.Gb.l.f(timeUnit, "unit");
        return this.a.timeout(j, timeUnit);
    }

    @Override // ax.xc.D
    public long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // ax.xc.D
    public D deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
