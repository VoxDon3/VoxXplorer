/*
 * Decompiled with CFR 0.152.
 */
package ax.Ub;

import ax.Tb.c;
import java.util.concurrent.CancellationException;

public final class a
extends CancellationException {
    public final transient c<?> q;

    public a(c<?> c8) {
        super("Flow was aborted, no more elements needed");
        this.q = c8;
    }

    @Override
    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

