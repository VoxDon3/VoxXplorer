/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.j;
import ax.j6.z;

final class y
implements Runnable {
    final z c0;
    final j q;

    y(z z8, j j8) {
        this.c0 = z8;
        this.q = j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object = z.c(this.c0);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        z z8 = this.c0;
                        if (z.a(z8) == null) break block3;
                        z.a(z8).a(this.q);
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

