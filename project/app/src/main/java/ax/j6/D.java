/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.C;
import ax.j6.G;
import ax.j6.g;
import ax.j6.j;
import java.util.concurrent.Executor;

final class D
implements G {
    private final Executor a;
    private final Object b = new Object();
    private g c;

    public D(Executor executor, g g8) {
        this.a = executor;
        this.c = g8;
    }

    static /* bridge */ /* synthetic */ g a(D d8) {
        return d8.c;
    }

    static /* bridge */ /* synthetic */ Object c(D d8) {
        return d8.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(j j8) {
        if (!j8.m()) {
            return;
        }
        Object object = this.b;
        synchronized (object) {
            try {
                if (this.c == null) {
                    return;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl9 : MonitorExitStatement: MONITOREXIT : var2_3
                this.a.execute(new C(this, j8));
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

