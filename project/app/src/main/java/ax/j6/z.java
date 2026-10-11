/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.G;
import ax.j6.e;
import ax.j6.j;
import ax.j6.y;
import java.util.concurrent.Executor;

final class z
implements G {
    private final Executor a;
    private final Object b = new Object();
    private e c;

    public z(Executor executor, e e8) {
        this.a = executor;
        this.c = e8;
    }

    static /* bridge */ /* synthetic */ e a(z z8) {
        return z8.c;
    }

    static /* bridge */ /* synthetic */ Object c(z z8) {
        return z8.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(j j8) {
        Object object = this.b;
        synchronized (object) {
            try {
                if (this.c == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl7 : MonitorExitStatement: MONITOREXIT : var2_3
                this.a.execute(new y(this, j8));
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

