package ax.Qb;

import ax.Vb.C0996c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: ax.Qb.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0942j0 extends AbstractC0940i0 implements T {
    private final Executor e0;

    public C0942j0(Executor executor) {
        this.e0 = executor;
        C0996c.a(a1());
    }

    private final void Z0(ax.wb.i iVar, RejectedExecutionException rejectedExecutionException) {
        w0.c(iVar, C0938h0.a("The task was rejected", rejectedExecutionException));
    }

    public Executor a1() {
        return this.e0;
    }

    @Override // ax.Qb.G
    public void b(ax.wb.i iVar, Runnable runnable) {
        try {
            Executor a1 = a1();
            C0927c.a();
            a1.execute(runnable);
        } catch (RejectedExecutionException e) {
            C0927c.a();
            Z0(iVar, e);
            Y.b().b(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor a1 = a1();
        ExecutorService executorService = a1 instanceof ExecutorService ? (ExecutorService) a1 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0942j0) && ((C0942j0) obj).a1() == a1();
    }

    public int hashCode() {
        return System.identityHashCode(a1());
    }

    @Override // ax.Qb.G
    public String toString() {
        return a1().toString();
    }
}
