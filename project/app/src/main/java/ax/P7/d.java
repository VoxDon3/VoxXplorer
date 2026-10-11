/*
 * Decompiled with CFR 0.152.
 */
package ax.P7;

import ax.P7.e;
import java.util.concurrent.CountDownLatch;

public final class d
implements Runnable {
    public final CountDownLatch c0;
    public final e q;

    public /* synthetic */ d(e e8, CountDownLatch countDownLatch) {
        this.q = e8;
        this.c0 = countDownLatch;
    }

    @Override
    public final void run() {
        e.b(this.q, this.c0);
    }
}

