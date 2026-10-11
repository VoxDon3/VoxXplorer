/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.M5.p;
import ax.j6.B;
import ax.j6.j;

final class A
implements Runnable {
    final B c0;
    final j q;

    A(B b8, j j8) {
        this.c0 = b8;
        this.q = j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object = B.c(this.c0);
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        B b8 = this.c0;
                        if (B.a(b8) == null) break block3;
                        B.a(b8).d(p.l(this.q.i()));
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

