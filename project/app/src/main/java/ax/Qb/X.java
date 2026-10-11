/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.G;
import ax.wb.j;
import java.util.concurrent.Executor;

final class X
implements Executor {
    public final G q;

    @Override
    public void execute(Runnable runnable2) {
        G g8 = this.q;
        j j8 = j.q;
        if (g8.f(j8)) {
            this.q.b(j8, runnable2);
            return;
        }
        runnable2.run();
    }

    public String toString() {
        return this.q.toString();
    }
}

