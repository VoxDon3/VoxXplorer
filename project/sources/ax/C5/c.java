package ax.C5;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes3.dex */
final class c extends Thread {
    private final long c0;
    final CountDownLatch d0 = new CountDownLatch(1);
    boolean e0 = false;
    private final WeakReference<a> q;

    public c(a aVar, long j) {
        this.q = new WeakReference<>(aVar);
        this.c0 = j;
        start();
    }

    private final void a() {
        a aVar = this.q.get();
        if (aVar != null) {
            aVar.c();
            this.e0 = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.d0.await(this.c0, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
