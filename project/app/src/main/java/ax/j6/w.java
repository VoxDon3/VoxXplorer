/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.x;

final class w
implements Runnable {
    final x q;

    w(x x8) {
        this.q = x8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object = x.c(this.q);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        x x8 = this.q;
                        if (x.a(x8) == null) break block3;
                        x.a(x8).c();
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

