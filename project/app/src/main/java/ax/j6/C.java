/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.D;
import ax.j6.j;

final class C
implements Runnable {
    final D c0;
    final j q;

    C(D d8, j j8) {
        this.c0 = d8;
        this.q = j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object = D.c(this.c0);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        D d8 = this.c0;
                        if (D.a(d8) == null) break block3;
                        D.a(d8).a(this.q.j());
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

