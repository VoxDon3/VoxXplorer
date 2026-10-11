/*
 * Decompiled with CFR 0.152.
 */
package ax.C5;

import ax.C5.a;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
final class c
extends Thread {
    private final long c0;
    final CountDownLatch d0;
    boolean e0;
    private final WeakReference<a> q;

    public c(a a8, long l8) {
        this.q = new WeakReference<a>(a8);
        this.c0 = l8;
        this.d0 = new CountDownLatch(1);
        this.e0 = false;
        this.start();
    }

    private final void a() {
        a a8 = (a)this.q.get();
        if (a8 != null) {
            a8.c();
            this.e0 = true;
        }
    }

    @Override
    public final void run() {
        try {
            if (!this.d0.await(this.c0, TimeUnit.MILLISECONDS)) {
                this.a();
            }
            return;
        }
        catch (InterruptedException interruptedException) {
            this.a();
            return;
        }
    }
}

