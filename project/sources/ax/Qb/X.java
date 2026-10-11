package ax.Qb;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class X implements Executor {
    public final G q;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        G g = this.q;
        ax.wb.j jVar = ax.wb.j.q;
        if (g.f(jVar)) {
            this.q.b(jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.q.toString();
    }
}
