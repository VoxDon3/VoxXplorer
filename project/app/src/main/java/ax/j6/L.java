/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.K;
import java.util.concurrent.Callable;

final class L
implements Runnable {
    final Callable c0;
    final K q;

    L(K k8, Callable callable) {
        this.q = k8;
        this.c0 = callable;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void run() {
        try {
            this.q.q(this.c0.call());
            return;
        }
        catch (Exception var1_2) {}
        ** finally { 
lbl6:
        // 1 sources

        this.q.p(new RuntimeException(var1_1));
    }
}

