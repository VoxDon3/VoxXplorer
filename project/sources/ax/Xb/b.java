package ax.Xb;

import ax.Qb.AbstractC0940i0;
import ax.Qb.G;
import ax.Vb.I;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class b extends AbstractC0940i0 implements Executor {
    public static final b e0 = new b();
    private static final G f0;

    static {
        int e;
        m mVar = m.d0;
        e = I.e("kotlinx.coroutines.io.parallelism", ax.Lb.f.b(64, ax.Vb.G.a()), 0, 0, 12, null);
        f0 = mVar.Y0(e);
    }

    private b() {
    }

    @Override // ax.Qb.G
    public void b(ax.wb.i iVar, Runnable runnable) {
        f0.b(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        b(ax.wb.j.q, runnable);
    }

    @Override // ax.Qb.G
    public String toString() {
        return "Dispatchers.IO";
    }
}
