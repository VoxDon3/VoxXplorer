package ax.H5;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g extends ax.K0.a implements ax.L5.k {
    private final Semaphore o;
    private final Set p;

    public g(Context context, Set set) {
        super(context);
        this.o = new Semaphore(0);
        this.p = set;
    }

    @Override // ax.K0.a
    public final /* bridge */ /* synthetic */ Object I() {
        Iterator it = this.p.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((ax.K5.g) it.next()).d(this)) {
                i++;
            }
        }
        try {
            this.o.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // ax.K0.c
    protected final void t() {
        this.o.drainPermits();
        a();
    }
}
