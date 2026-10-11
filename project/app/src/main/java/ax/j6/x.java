/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.G;
import ax.j6.d;
import ax.j6.j;
import ax.j6.w;
import java.util.concurrent.Executor;

final class x
implements G {
    private final Executor a;
    private final Object b = new Object();
    private d c;

    public x(Executor executor, d d8) {
        this.a = executor;
        this.c = d8;
    }

    static /* bridge */ /* synthetic */ d a(x x8) {
        return x8.c;
    }

    static /* bridge */ /* synthetic */ Object c(x x8) {
        return x8.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(j object) {
        if (!((j)object).k()) {
            return;
        }
        object = this.b;
        synchronized (object) {
            try {
                if (this.c == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl9 : MonitorExitStatement: MONITOREXIT : var1_1
                this.a.execute(new w(this));
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

