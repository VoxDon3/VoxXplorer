/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.F;
import ax.j6.h;
import ax.j6.j;
import ax.j6.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class E
implements Runnable {
    final F c0;
    final j q;

    E(F f8, j j8) {
        this.c0 = f8;
        this.q = j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        h h82222;
        block7: {
            Exception exception2222;
            block6: {
                j j8;
                block5: {
                    try {
                        j8 = F.e(this.c0).a(this.q.j());
                        if (j8 != null) break block5;
                    }
                    catch (Exception exception2222) {
                        break block6;
                    }
                    catch (h h82222) {
                        break block7;
                    }
                    catch (CancellationException cancellationException) {
                        this.c0.c();
                        return;
                    }
                    this.c0.d(new NullPointerException("Continuation returned null"));
                    return;
                }
                F f8 = this.c0;
                Executor executor = l.b;
                j8.e(executor, f8);
                j8.d(executor, this.c0);
                j8.a(executor, this.c0);
                return;
            }
            this.c0.d(exception2222);
            return;
        }
        if (h82222.getCause() instanceof Exception) {
            this.c0.d((Exception)h82222.getCause());
            return;
        }
        this.c0.d(h82222);
    }
}

