package ax.Ub;

import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class a extends CancellationException {
    public final transient ax.Tb.c<?> q;

    public a(ax.Tb.c<?> cVar) {
        super("Flow was aborted, no more elements needed");
        this.q = cVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
